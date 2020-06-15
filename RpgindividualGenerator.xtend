/*
 * generated by Xtext 2.21.0
 */
package smitey.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import smitey.rpgindividual.SystemRPG
import smitey.rpgindividual.Entity
import smitey.rpgindividual.Moves
import smitey.rpgindividual.Locations
import smitey.rpgindividual.Death
import smitey.rpgindividual.Or
import smitey.rpgindividual.And
import smitey.rpgindividual.Add
import smitey.rpgindividual.Sub
import smitey.rpgindividual.Mult
import smitey.rpgindividual.Div
import smitey.rpgindividual.Comparator
import smitey.rpgindividual.Eq
import smitey.rpgindividual.Smaller
import smitey.rpgindividual.SmallerEq
import smitey.rpgindividual.NEq
import smitey.rpgindividual.Bigger
import smitey.rpgindividual.BiggerEq
import smitey.rpgindividual.IntNum
import smitey.rpgindividual.NameAttribute
import smitey.rpgindividual.FloatNum
import smitey.rpgindividual.Attributes
import smitey.rpgindividual.Entities
import smitey.rpgindividual.Declaration
import smitey.rpgindividual.Relations
import smitey.rpgindividual.Teams
import smitey.rpgindividual.NumberComparing
import smitey.rpgindividual.Team
import smitey.rpgindividual.Effects
import smitey.rpgindividual.Effect

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RpgindividualGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val result = resource.allContents.filter(SystemRPG).next
		
		main(result, fsa)
		
	}
	
	def main(SystemRPG systemRPG, IFileSystemAccess2 fsa){	
		val classFileName = systemRPG.getName() 
		for (Declaration declaration : systemRPG.getDeclarations()){
			switch(declaration){
				Locations:
					generateLocations(fsa, declaration)
				Relations:
					generateTypes(fsa, declaration)
				Moves:
					generateMoves(fsa, declaration)
				Entities:
					generateEntities(fsa, declaration)
				Teams:
					generateTeams(fsa, declaration)
				Attributes:
					generateAttributes(fsa, declaration)
				Death:
					fsa.generateFile("DeathChecker.java", declaration.generateDeathChecker)
				Effects:
					generateEffectFiles(fsa, declaration)
				default:
					System.out.println("This is not a supported instance of Declaration")
			}

		}
		fsa.generateFile(classFileName + ".java", classFileName.generateGame)
		fsa.generateFile("Runner.java", classFileName.generateRunner)
	}
	
	def CharSequence generateRunner(String name){
		'''
		public class Runner {
		    public static void main(String[] args) {
		    	�name� �name.toLowerCase� = new �name�();
		    	�name.toLowerCase�.run();
		    }
		}
		'''
	}
	
	def CharSequence generateDeathChecker(Death death){
		'''
		import java.util.*;
		public class DeathChecker {
			public boolean check(Entity user, Entity enemy){
				HashMap<String, Number> userEntityData = new HashMap<>();
				HashMap<String, Number> enemyEntityData = new HashMap<>();
				for(AttributeData aData : user.getAttributes()){
					userEntityData.put(aData.getAttributeName(), aData.getNumber());
				}
				for(AttributeData aData : enemy.getAttributes()){
					enemyEntityData.put(aData.getAttributeName(), aData.getNumber());
				}
				try{
					return �death.log.new_logic�;
				} catch(NullPointerException e){
					System.out.println("The target seems to be invincible.");
					return false;
				}
			}
		}
		'''
	}
	
	def CharSequence generateGame(String classFileName){
		'''
		import java.util.*;
		
		public class �classFileName�{
			private Type type;
		    private List<Entity> entities;
		    private Team team;
		    private Move move;
		    private MoveInit moveInit;
		    private EntityInit entityInit;
		    private TeamInit teamInit;
		    private TypeRelationsInit typeRelationsInit;
		    private LocationsInit locationsInit;
		    private Location location;
		    private DeathChecker deathChecker;
		    private Random random;
		    private boolean gameFinished;
		    private boolean won = false;
		    private boolean lost = false;
		    private Scanner s;
		    private Entity playerEntity;
		    
		    public �classFileName�(){
		    	entities = new ArrayList<>();
		    	type = Type.getInstance();
		      	team = new Team();
		    	move = Move.getInstance();
		    	location = Location.getInstance();
		    	deathChecker = new DeathChecker();
		    	moveInit = new MoveInit();
		    	entityInit = new EntityInit();
		    	teamInit = new TeamInit();
		    	locationsInit = new LocationsInit();
		        typeRelationsInit = new TypeRelationsInit();
		        s = new Scanner(System.in);
		        random = new Random();
		   	}
		   	
		   	public void run(){
		   		initialize();
		   		gameLoop();
		   	}
		   	
		   	private void initialize(){
		   		moveInit.addMoves(move);
		   		entityInit.createEntities(entities);
		   		teamInit.createTeams(team, entities);
		   		typeRelationsInit.createRelations(type);
		   		locationsInit.addLocations(location);
		   	}
		   	
		   	private void gameLoop(){
		   		playerEntity = team.getPlayerTeam().remove(0);
				while (!gameFinished) {
					if(won){
						gameFinished = true;
						System.out.println("You Won!");
					}else if(lost){
						gameFinished = true;
						System.out.println("You Lost.");
					}else{
						// Get current location to fight at
						String currentLocation = location.getLocations().remove(0);
						String enemyTeamName = location.getTeams().get(currentLocation);
						List<Entity> enemyTeam = team.getTeamByName(location.getTeams().get(currentLocation));
						System.out.println("Current Location: " + currentLocation + ", fighting against: " + enemyTeamName);
						processGame(enemyTeam);
					}
				}
		   	}
		   	
		   	private void processGame(List<Entity> enemyTeam){
		   		while(enemyTeam.size() > 0 && !lost){
		   			Entity enemyEntity = enemyTeam.remove(0);
		   			fight(enemyEntity);
		   		}
		   		if(!(location.getLocations().size() > 0) && !lost){
					won = true;
		   		}
		   	}
		   	
			private void executeMove(Move move, String moveName, Entity user, Entity target){
				if(!move.getMove(moveName).getEffects().isEmpty()){
					for(Effect effect: move.getMove(moveName).getEffects()){
						effect.doEffect(move, moveName, user, target);
					}
				}
			}	   	
		   		
		   	private void fight(Entity enemyEntity){
		   		boolean fighting = true;
		   		while(fighting){
		   			System.out.println("You are against " + enemyEntity.getName() + " choose your move");
		   			List<String> moves = playerEntity.getMoveNameList();
					System.out.println(moves);
					
					boolean pickMove = true;
					while (pickMove){  
						String moveName = s.nextLine();
						
						// Will check that the user picks a move which exists
						if(moves.contains(moveName)){
							System.out.println("You used "+ moveName + "\n");
							executeMove(move, moveName, playerEntity, enemyEntity);
							pickMove = !pickMove;
						}else{
							System.out.println("That's not a possible move!");
						}
					}
					if(deathChecker.check(enemyEntity, playerEntity)){
						System.out.println(enemyEntity.getName() + " is dead!");
						enemyEntity.setEntityState(EntityState.DEAD);
						return;
					}else{
						System.out.println("Enemy Turn...");
						int choosenMove = random.nextInt(enemyEntity.getMoveNameList().size());
						System.out.println(enemyEntity.getName() + " used " + enemyEntity.getMoveNameList().get(choosenMove) + "\n");
						
						executeMove(move, enemyEntity.getMoveNameList().get(choosenMove), enemyEntity, playerEntity);
						
						if(deathChecker.check(playerEntity, enemyEntity)){
							System.out.println("Your " + playerEntity.getName() + " is dead");
							playerEntity.setEntityState(EntityState.DEAD);
							
							// Will add the next player entity to the fight, if there are no more, it will go to game over
							if(!team.getPlayerTeam().isEmpty()){
								playerEntity = team.getPlayerTeam().remove(0);
							}else{
								lost = true;
								return;
							}
						} 
					}
		   		}
		   	}
		}
		
		
		'''
	}
	
	def generateAttributes(IFileSystemAccess2 fsa, Attributes attributes){
        fsa.generateFile("AttributeEnum.java", attributes.generateAttributeEnum)
        fsa.generateFile("AttributeData.java", generateAttributeData)
	}
	
	def CharSequence generateAttribute(){
		'''
		import java.util.*;
		
		public class Attribute {
		    private List<AttributeData> attributes = new ArrayList<>();
		
		    private static Attribute attribute;
		
		    private Attribute() {
		
		    }
		
		    public static Attribute getInstance() {
		        if (attribute == null) {
		            attribute = new Attribute();
		        }
		        return attribute;
		    }
		
		    public void addAttribute(AttributeData attribute) {
		        attributes.add(attribute);
		    }
		    
		    public List<AttributeData> getAttributes() {
		        return attributes;
		    }
		}
		'''
	}
	def generateAttributeChangeEvent(){
		'''
		public class AttributeChangeEvent{
		  private AttributeData previousState;
		  private AttributeData targetState;
		
		  public AttributeChangeEvent(AttributeData previousState, AttributeData targetState){
		    this.previousState = previousState;
		    this.targetState = targetState;
		  }
		
		  public AttributeData getTargetState(){
		    return this.targetState;
		  }
		
		  public AttributeData getPreviousState(){
		    return this.previousState;
		  }
		
		}
		'''
	}
	
	def CharSequence generateAttributeData(){
		'''
		public class AttributeData {
		
		    private Number number;
		    private String attributeName;
		
		    public AttributeData() {
		    }
		
		    public AttributeData(String attributeName, Number number) {
		        this.number = number;
		        this.attributeName = attributeName;
		    }
		
		    public Number getNumber() {
		        return this.number;
		    }
		
		    public void setNumber(Number number){
		        this.number = number;
		    }
		
		    public String getAttributeName() {
		        return this.attributeName;
		    }
		
		    public void setAttributeName(String attributeName) {
		        this.attributeName = attributeName;
		    }
			
			@Override
			public String toString() {
				return this.number.toString();
			}
		}
		'''
	}
	
	def generateAttributeEnum(Attributes attributes){
        '''
        public enum AttributeEnum{
        �FOR attribute: attributes.attribute �
            �attribute.name�,
        �ENDFOR�
        }
        '''
    }
    
	def generateEffectFiles(IFileSystemAccess2 fsa, Effects effects){
		fsa.generateFile("Effect.java", generateEffect)
		for(Effect effect : effects.effect){
			fsa.generateFile(effect.name + ".java", effect.generateEffectFile)
		}
	}
	
	
	def CharSequence generateEffect(){
		'''
    	public abstract class Effect {
    	    public abstract boolean effectMove(Move move, String name, Entity user, Entity enemy);
    	    public abstract Number changeMove(Move move, String name, Entity user, Entity enemy);
    	    public abstract void doEffect(Move move, String name, Entity user, Entity enemy);    	
    	}
    	'''
		}
		
    
	def CharSequence generateEffectFile(Effect effect){
    	'''
			import java.util.*;
			public class �effect.name� extends Effect{
				
				@Override
				public boolean effectMove(Move move, String name, Entity user, Entity enemy){
					�IF effect.rule.or !== null�
					HashMap<String, Number> userEntityData = new HashMap<>();
					HashMap<String, Number> enemyEntityData = new HashMap<>();
					for(AttributeData userAttData : user.getAttributes()){
						userEntityData.put(userAttData.getAttributeName(), userAttData.getNumber());
					}	
					for(AttributeData enemyAttData : enemy.getAttributes()){
						enemyEntityData.put(enemyAttData.getAttributeName(), enemyAttData.getNumber());
					}			
					for(AttributeData aData : move.getMove(name).getMoveAttributes()){
						userEntityData.put(aData.getAttributeName(), aData.getNumber());
						enemyEntityData.put(aData.getAttributeName(), aData.getNumber());				
					}					
					return �effect.rule.or.new_logic�;
					�ELSE�
					return true;					
					�ENDIF�
				}
				
				@Override
				public Number changeMove(Move move, String name, Entity user, Entity enemy){
					HashMap<String, Number> userEntityData = new HashMap<>();
					HashMap<String, Number> enemyEntityData = new HashMap<>();
					for(AttributeData userAttData : user.getAttributes()){
						userEntityData.put(userAttData.getAttributeName(), userAttData.getNumber());
					}	
					for(AttributeData enemyAttData : enemy.getAttributes()){
						enemyEntityData.put(enemyAttData.getAttributeName(), enemyAttData.getNumber());
					}			
					for(AttributeData aData : move.getMove(name).getMoveAttributes()){
						userEntityData.put(aData.getAttributeName(), aData.getNumber());
						enemyEntityData.put(aData.getAttributeName(), aData.getNumber());				
					}
					return �effect.rule.sum.new_exp�;
				}
			
			
				@Override		
				public void doEffect(Move move, String name, Entity user, Entity enemy){
					if(effectMove(move, name, user, enemy)){
						for(AttributeData aData : �effect.rule.targetThen.toLowerCase�.getAttributes()){
							if(aData.getAttributeName() == "�effect.rule.targetAtt.name�"){
								float modifier = (float) 1.0;
								String moveType = move.getMove(name).getType();
								String targetType = �effect.rule.targetThen.toLowerCase�.getType();
								Type type = Type.getInstance();
								HashMap<String, TypeRelation> typeRelations = type.getTypeRelations();
								TypeRelation typeRelation = typeRelations.get(targetType);
								if(typeRelation.getStrongAgainst().contains(moveType)){
									modifier = typeRelation.getStrongRelationMultiplier();
								} else if(typeRelation.getWeakAgainst().contains(moveType)){
									modifier = typeRelation.getWeakRelationMultiplier();
								}
								aData.setNumber(aData.getNumber().floatValue() �effect.rule.change� (changeMove(move, name, user, enemy).floatValue() * modifier));
								System.out.println(�effect.rule.targetThen.toLowerCase�.getName() + "'(s) "  + aData.getAttributeName() + " is now: " + aData.getNumber());
							}
						}
					}
					for(AttributeData aData : move.getMove(name).getMoveAttributes()){
						if(aData.getAttributeName() == "�effect.rule.targetAtt.name�"){
							aData.setNumber(aData.getNumber().floatValue() �effect.rule.change� changeMove(move, name, user, enemy).floatValue());
							System.out.println(�effect.rule.targetThen.toLowerCase�.getName() + "'(s) "  + aData.getAttributeName() + " is now: " + aData.getNumber());
							
						}				
					}				
				}
			}
    	'''
    }	

	def generateEntities(IFileSystemAccess2 fsa, Entities entities){
		fsa.generateFile("Entity.java", generateEntity)
		fsa.generateFile("EntityEnum.java", entities.generateEntityEnum)
		fsa.generateFile("EntityState.java", generateEntityState)
		fsa.generateFile("EntityInit.java", entities.generateEntityInit)
	}
	
	def CharSequence generateEntity(){
		'''
		import java.util.*;
		public class Entity{
		    private String name;
		    private String type;
		    private EntityState state;
		    private List<AttributeData> attribute;
		    private List<MoveData> moves;
		
		    public Entity(){
		      attribute = new ArrayList<>();
		      moves = new ArrayList<>();
		    }
		
		    public Entity(Entity e){
		      this();
		      this.name = e.getName();
		      this.type = e.getType();
		      this.state = e.getEntityState();
		      if(!e.getAttributes().isEmpty())
		        this.attribute.addAll(e.getAttributes());
		      if(!e.getMoveData().isEmpty())
		        this.moves.addAll(e.getMoveData());
		    }
		
		    public String getName(){
		      return this.name;
		    }
		    public void setName(String name){
		      this.name = name;
		    }
		    public String getType(){
		      return this.type;
		    }
		    public void setType(String type){
		      this.type = type;
		    }
		    public List<AttributeData> getAttributes(){
		      return attribute;
		    }
		
		    public EntityState getEntityState(){
		      return state;
		    }
		
		    public void setEntityState(EntityState state){
		      this.state = state;
		    }
		
		    public void addAttribute(AttributeData attribute){
		      this.attribute.add(attribute);
		    }
		
		    public List<MoveData> getMoveData(){
		      return moves;
		    }
		
		    public List<String> getMoveNameList(){
		      List<String> moveNames = new ArrayList<>();
		      for (MoveData moveData : getMoveData()) {
		          moveNames.add(moveData.getMoveName());
		      }
		      return moveNames;
		    }
		    
		    public void addMoveData(MoveData moveData, Map<String, Number> multipliers){
		      for (AttributeData attributeData : moveData.getMoveAttributes()){
		        if (multipliers.containsKey(attributeData.getAttributeName())){
		          String attName = attributeData.getAttributeName();
		          Number number = attributeData.getNumber();
		          if (number instanceof Float || multipliers.get(attName) instanceof Float){
		            attributeData.setNumber(number.floatValue() * multipliers.get(attributeData.getAttributeName()).floatValue());
		          } else {
		            attributeData.setNumber(number.intValue() * multipliers.get(attributeData.getAttributeName()).intValue());
		          }
		        }
		      }
		      moves.add(moveData);
		    }
		}
		'''
	}
	
	def CharSequence generateEntityEnum(Entities entities){
		var entityEnum = ""
		var i = 1
		for(entity : entities.entity){
			entityEnum += entity.name
			if(i < entities.entity.size){
				entityEnum += ", "
				i++
			} else {
				entityEnum += ";"
			}
		}
		'''
		enum EntityEnum{
			�entityEnum�
		}
		'''
	}
	
	def CharSequence generateEntityState(){
		'''
		public enum EntityState {
		    DEAD, ALIVE
		}
		'''
	}
	
	def CharSequence generateEntityInit(Entities entities){	
		'''
		import java.util.*;
		
		public class EntityInit{
			public void createEntities(List<Entity> entities){
				�FOR entity : entities.entity�
				Entity �entity.name.toLowerCase� = new Entity();
				Map<String, Number> �entity.name.toLowerCase�Multipliers = new HashMap<>();
				�entity.name.toLowerCase�.setName("�entity.name�");
				�entity.name.toLowerCase�.setType("�entity.EType.type.name�");
				�FOR move : entity.EMoves.move�
				�FOR modification : move.moveModification�
				�entity.name.toLowerCase�Multipliers.put("�modification.attribute.name.toLowerCase�", �modification.multiplier.new_exp�);
				�ENDFOR�
				�entity.name.toLowerCase�.addMoveData(Move.getInstance().getMove("�move.getMoveName.name�"), �entity.name.toLowerCase�Multipliers);
				�ENDFOR�
				�FOR att : entity.att�
				�entity.name.toLowerCase�.addAttribute(new AttributeData("�att.attribute.name�", �getNumberValue(att.av.an)�));
				�ENDFOR�
				entities.add(�entity.name.toLowerCase�);
				�ENDFOR�
				
			}
		}
		
		'''
	}
	
	def generateComp(Comparator op) {
		switch op { Eq: '==' Smaller: '<' Bigger: '>' SmallerEq: '<=' BiggerEq: '>=' NEq: '!=' }
	}

	def dispatch CharSequence new_logic(Or x){
		'''(�x.left.new_logic�||�x.right.new_logic�)'''
	}
	def dispatch CharSequence new_logic(And x){
		'''(�x.left.new_logic�&&�x.right.new_logic�)'''
	}
	def dispatch CharSequence new_logic(NumberComparing x){
		'''(�x.left.new_exp��x.comp.generateComp��x.right.new_exp�)'''
	}
	def dispatch CharSequence new_exp(Add x){
		'''(�x.left.new_exp�+�x.right.new_exp�)'''
	}
	def dispatch CharSequence new_exp(Sub x){
		'''(�x.left.new_exp�-�x.right.new_exp�)'''
	}
	def dispatch CharSequence new_exp(Mult x){
		'''(�x.left.new_exp�*�x.right.new_exp�)'''
	}
	def dispatch CharSequence new_exp(Div x){
		'''(�x.left.new_exp�/�x.right.new_exp�)'''
	}
	def dispatch CharSequence new_exp(IntNum x){
		Integer.toString(x.value)
	}
	def dispatch CharSequence new_exp(FloatNum x){
		Integer.toString(x.i) + '.' + Integer.toString(x.decimal)
	}
	def dispatch CharSequence new_exp(NameAttribute x){
		if(x.attribute.AVal.LTypes !== null && x.attribute.AVal.LTypes.equals("Integer")){
			x.target.toLowerCase + "EntityData.get(" + '"' +x.attribute.name + '"' + ").intValue()"
		}else if(x.attribute.AVal.LTypes !== null && x.attribute.AVal.LTypes.equals("Float")){ 
			x.target.toLowerCase + "EntityData.get(" + '"' +x.attribute.name + '"' + ").floatValue()"
		}else if(x.attribute.AVal.an !== null && x.attribute.AVal.an instanceof IntNum){
			x.target.toLowerCase + "EntityData.get(" + '"' +x.attribute.name + '"' + ").intValue()"
		}else if(x.attribute.AVal.an !== null && x.attribute.AVal.an instanceof FloatNum){
			x.target.toLowerCase + "EntityData.get(" + '"' +x.attribute.name + '"' + ").floatValue()"
		} else {
			"Something went wrong" 
		}
	}
	
	def dispatch Number getNumberValue(IntNum x){
		x.value
	}
	def dispatch Number getNumberValue(FloatNum x){
		val floatstring = x.i + "." + x.decimal
		Float.valueOf(floatstring)
	}
	
	def generateLocations(IFileSystemAccess2 fsa, Locations locations){
		fsa.generateFile("Location.java", generateLocation)
		fsa.generateFile("LocationsInit.java", locations.generateLocationInit)
	}
	
	def CharSequence generateLocation(){
		
		'''
		import java.util.*;
		
		public class Location {
		    private List<String> locations;
		    private String currentLocation;
		    private String currentTeam;
		
		    private Map<String, String> teams;
		
		    private static Location location;    
		
		    private Location(){
		        locations = new ArrayList<>();
		        teams = new HashMap<>();
		
		    }
		
		    public static Location getInstance(){
		        if(location == null){
		            location = new Location();
		        }
		        return location;
		    }
		
		    public String getCurrentLocation(){
		        return this.currentLocation;
		    }
		
		    public String getCurrentTeam(){
		        return this.currentTeam;
		    }
		
		    public Map<String, String> getTeams(){
		        return this.teams;
		    }
		
		    public List<String> getLocations(){
		        return this.locations;
		    }
		
		    public void setLocations(List<String> locations){
		        this.locations = locations;
		    }
		
		    public void setCurrentLocation(String currentLocation){
		        this.currentLocation = currentLocation;
		    }
		
		    public void addLocation(String location){
		        locations.add(location);
		    }
		
		    public void addTeamToLocation(String location, String team){
		        if(locations.contains(location)){
		            teams.put(location, team);
		        } else {
		        	addLocation(location);
		        	teams.put(location, team);
		        }
		    }
		
		
		}
		'''
	}
	
	def CharSequence generateLocationInit(Locations locations){
		'''
		public class LocationsInit{
			public void addLocations(Location location){
				String locationName;
				String teamName;
				�FOR location : locations.loc�
				locationName = "�location.name�";
				teamName = "�location.team.name�";
				location.addTeamToLocation(locationName, teamName);
				�ENDFOR�
			}
		}
		'''
	}
	
	def generateMoves(IFileSystemAccess2 fsa, Moves moves){
		fsa.generateFile("Move.java", generateMove)
		fsa.generateFile("MoveEnum.java", moves.generateMoveEnum)
		fsa.generateFile("MoveInit.java", moves.generateMoveInit)
		fsa.generateFile("MoveData.java", generateMoveData)
	}
	
	def CharSequence generateMove(){
		'''
		import java.util.*;
				
		public class Move{			
		
			private static Move move;
			private List<MoveData> moves = new ArrayList<>();
			
			private Move(){}
		
			public static Move getInstance(){
				if (move == null){
					move = new Move();
				}
				return move;
			}
		
			public void addMove(MoveData move){
				moves.add(move);
			}
		
			public MoveData getMove(String move){
				MoveData mD = null;
		
				for (MoveData moveData : moves) {
					if(moveData.getMoveName().equals(move)){
						mD = moveData;
					}
				}
				return mD;
			}
		
			public List<MoveData> getMoves(){
				return moves;
			}
		
		}
			
		'''
		
	}
	
	def CharSequence generateMoveData(){
		'''
		import java.util.*;
		
		public class MoveData{
		
		    private String moveName;
			private String type;
		    private List<AttributeData> moveAttributes;
		    private List<Effect> effects;
		
		    public MoveData(){
		        this.moveAttributes = new ArrayList<>();
				this.effects = new ArrayList<>();
		    }
		
		    public MoveData(String moveName, String type, List<AttributeData> moveAttributes, List<Effect> effects) {
		        this.moveName = moveName;
		        this.type = type;
		        this.moveAttributes = moveAttributes;
				this.effects = effects;
		    }
		
		    public String getMoveName(){
		        return this.moveName;
		    }
		
		    public void setMoveName(String moveName) {
		        this.moveName = moveName;
		    }
		
		    public String getType() {
		        return this.type;
		    }
		
		    public void setType(String type) {
		        this.type = type;
		    }
		
		    public List<AttributeData> getMoveAttributes() {
		        return this.moveAttributes;
		    }
		
		    public void setMoveAttributes(List<AttributeData> moveAttributes) {
		        this.moveAttributes = moveAttributes;
		    }
		
		    public void addAttribute(AttributeData attribute){
		        moveAttributes.add(attribute);
		    }
			
			
			public List<Effect> getEffects(){
				return this.effects;
			}
			
			
			public void addEffect(Effect effect){
				this.effects.add(effect);
			}
			
		
		    @Override
		    public boolean equals(Object o) {
		        if (o == this)
		            return true;
		        if (!(o instanceof MoveData)) {
		            return false;
		        }
		        MoveData moveData = (MoveData) o;
		        return Objects.equals(moveName, moveData.moveName) && Objects.equals(type, moveData.type) && Objects.equals(moveAttributes, moveData.moveAttributes);
		    }
		
		    @Override
		    public int hashCode() {
		        return Objects.hash(moveName, type, moveAttributes, effects);
		    }
		
		    @Override
		    public String toString() {
		        return getMoveName();
		    }
		
		}
		'''
	}

	def CharSequence generateMoveEnum(Moves moves){
		var moveEnums = ""
		var i = 1
		for(move : moves.move){
			var name = move.name
			var type = move.getEType().type.name
			moveEnums += name
			moveEnums += "(" + '"' + type + '"' + ')'
			if(i < moves.move.size){
				moveEnums += ", "
				i++
			} else {
				moveEnums += ";"
			}
		}
		
		'''
		enum MoveEnum{
		    �moveEnums�
		    private String type;
		
		    private MoveEnum(String type){
		        this.type = type;
		    }
		
		    public String getType(){
		        return this.type;
		    }
		}
		'''
	}
	
	def CharSequence generateMoveInit(Moves moves){
		'''
		public class MoveInit{
			public void addMoves(Move moves){ //private Move moves = Move.getInstance()
				MoveData tempMoveData;
				�FOR move : moves.move�
				tempMoveData = new MoveData();
				tempMoveData.setMoveName("�move.name�");
				tempMoveData.setType("�move.EType.type.name�");
				�FOR att : move.att�
				tempMoveData.addAttribute(new AttributeData("�att.attribute.name�", �getNumberValue(att.av.an)�));
				�ENDFOR�
				�FOR moveEffect : move.MEffect�
				�IF moveEffect !== null�
				tempMoveData.addEffect(new �moveEffect.moveEName.name�());
				�ENDIF�
				�ENDFOR�				
				moves.addMove(tempMoveData);
				�ENDFOR�
			}
		}
		'''
		
	}
	
	def generateTeams(IFileSystemAccess2 fsa, Teams teams){
		fsa.generateFile("Team.java", generateTeam)
		fsa.generateFile("TeamInit.java", teams.generateTeamInit)
	}
	
	def String addTeamMemberString(Team team){
		var createTeamString = "team.addTeamMember(" + '"' + team.name + '"' + ", "
		var i = 1
		for(Entity e : team.members.entity){
			createTeamString += "findEntityByName(" + '"'+ e.name + '"' + ", entities" + ")"
			if(team.members.entity.size() > i){
				i++
				createTeamString += ", "
			} else {
				createTeamString += ");"
			}
		}
		createTeamString
	}
	
	def CharSequence generateTeam(){
		'''
		import java.util.*;
		
		public class Team {
		    private Map<String, List<Entity>> teams;
		    private List<String> teamNames;
		
		    public Team() {
		        teams = new HashMap<>();
		        teamNames = new ArrayList<>(); 
		    }
		
		    public List<Entity> getTeamByName(String name) {
		        if (!teams.containsKey(name)) {
		            return null;
		        }
		        return teams.get(name);
		    }
		
		    public void addTeamMember(String team, Entity... entity) {
		        if (!teams.containsKey(team)) {
		            teams.put(team, entityAdder(entity));
		            teamNames.add(team);
		        } else {
		            teams.get(team).addAll(entityAdder(entity));
		        }
		    }
		
		    public List<Entity> entityAdder(Entity... entity) {
		        List<Entity> eList = new ArrayList<>();
		        for (Entity entity2 : entity) {
		            Entity tempEntity = new Entity(entity2);
		            eList.add(tempEntity);
		        }
		        return eList;
		    }
		
		    public Map<String, List<Entity>> getTeams(){
		        return teams;
		    }
		
		    public List<Entity> getPlayerTeam(){
		        return teams.get(teamNames.get(0));
		    }
		
		    public boolean checkPlayerEntities(){
		        int playerTeamSize = getPlayerTeam().size();
		        int deadEntities = 0;
		        for (Entity entity : getPlayerTeam()) {
		            if(entity.getEntityState() == EntityState.DEAD) break;
		            deadEntities++;
		            if(deadEntities == playerTeamSize) return true;
		        }
		        return false;
		    }
		
		    public int playerEntitiesAlive(){
		        int alive = 0;
		        for (Entity entity : getPlayerTeam()) {
		            if(entity.getEntityState() != EntityState.DEAD) alive++;
		        }
		        return alive;
		    }
		}
		'''
	}
	
	def CharSequence generateTeamInit(Teams teams){
		'''
		import java.util.*;
		
		public class TeamInit{
			public void createTeams(Team team, List<Entity> entities){
				�FOR team : teams.team�
				�addTeamMemberString(team)�
				�ENDFOR�
			}
			
			private Entity findEntityByName(String name, List<Entity> entities){
				for(Entity e : entities){
					if(e.getName().equals(name)){
						return e;
					}
				}
				return null;
			}
		}
		
		
		
		
		'''
	}
	
	def generateTypes(IFileSystemAccess2 fsa, Relations relations){
		fsa.generateFile("Type.java", generateType)
		fsa.generateFile("TypeEnum.java", relations.generateTypeEnum)
		fsa.generateFile("TypeRelation.java", generateTypeRelation)
		fsa.generateFile("TypeRelationsInit.java", relations.generateTypeInit)
	}
	
	def CharSequence generateTypeRelation(){
		'''
		import java.util.ArrayList;
				
				public class TypeRelation {
				
					private float strongRelationMultiplier;
					private float weakRelationMultiplier;
				    private ArrayList<String> weakAgainst;
				    private ArrayList<String> strongAgainst;
				
				    public TypeRelation(){
				        weakAgainst = new ArrayList<>();
				        strongAgainst = new ArrayList<>();
				    }
				
				    public void addStrongAgainst(String strong){
				        strongAgainst.add(strong);
				    }
				
				    public void addWeakAgainst(String weak){
				        weakAgainst.add(weak);
				    }
				
				    public ArrayList<String> getWeakAgainst(){
				        return weakAgainst;
				    }
				
				    public ArrayList<String> getStrongAgainst(){
				        return strongAgainst;
				    }
				    
				    public float getStrongRelationMultiplier(){
				    	return strongRelationMultiplier;
				    }
				    
				    public void setStrongRelationMultiplier(float x){
				    	strongRelationMultiplier = x;
				    }
				    
				    public float getWeakRelationMultiplier(){
				    	return weakRelationMultiplier;
				    }
				    
				    public void setWeakRelationMultiplier(float x){
				    	weakRelationMultiplier = x;
				    }
				
				}
		'''
	}
	
	def CharSequence generateTypeInit(Relations relations){
		
		'''
		public class TypeRelationsInit{
			public void createRelations(Type type){
				TypeRelation tr;
				String currentType;
				�FOR t : relations.type�
				tr = new TypeRelation();
				currentType = "�t.name�";
				�IF t.TExpression !== null�
				tr.addStrongAgainst("�t.TExpression.strong.name�");
				�FOR better : t.TExpression.strong2�
				tr.addStrongAgainst("�better.name�");
				�ENDFOR�
				tr.addWeakAgainst("�t.TExpression.weak.name�");
				�FOR worse : t.TExpression.weak2�
				tr.addWeakAgainst("�worse.name�");
				�ENDFOR�
				tr.setStrongRelationMultiplier((float) �t.TExpression.relationStrong.numberValue�);
				tr.setWeakRelationMultiplier((float) �t.TExpression.relationWeak.numberValue�);
				�ENDIF�
				type.addTypeRelation(currentType, tr);
				�ENDFOR�
			}
		}
		'''
	}
	
	def CharSequence generateType(){
		'''
		import java.util.*;
				
		public class Type{
				
			private List<String> types = new ArrayList<>();
			private HashMap<String, TypeRelation> typeRelations = new HashMap<>();
		
			private static Type type;
					
			private Type(){}
		
			public static Type getInstance(){
				if(type == null){
					type = new Type();
				}
				return type;
			}
							
			public void addType(String type){
				types.add(type);
			}
		
			public List<String> getTypes(){
				return types;
			}
		
			public void addTypeRelation(String typeString, TypeRelation tr){
				typeRelations.put(typeString, tr);
			}
		
			public HashMap<String, TypeRelation> getTypeRelations(){
				return typeRelations;
			}
		}
		'''
	}

	def generateTypeEnum(Relations relations){
        '''
        public enum TypeEnum{
        �FOR type: relations.type �
            �type.name�,
        �ENDFOR�
        }
        '''
    }
	
}