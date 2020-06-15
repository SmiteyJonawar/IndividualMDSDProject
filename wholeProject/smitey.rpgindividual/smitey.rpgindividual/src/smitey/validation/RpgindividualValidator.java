/*
 * generated by Xtext 2.21.0
 */
package smitey.validation;

import java.util.*;
import java.util.stream.Collectors;

import org.eclipse.xtext.validation.Check;

import smitey.rpgindividual.ActualNumbers;
import smitey.rpgindividual.Add;
import smitey.rpgindividual.AltAttribute;
import smitey.rpgindividual.And;
import smitey.rpgindividual.AtomicNumber;
import smitey.rpgindividual.Attribute;
import smitey.rpgindividual.Attributes;
import smitey.rpgindividual.Bigger;
import smitey.rpgindividual.BiggerEq;
import smitey.rpgindividual.Death;
import smitey.rpgindividual.Declaration;
import smitey.rpgindividual.Div;
import smitey.rpgindividual.Effect;
import smitey.rpgindividual.Effects;
import smitey.rpgindividual.Entities;
import smitey.rpgindividual.Entity;
import smitey.rpgindividual.EntityMoveModifier;

import smitey.rpgindividual.Eq;
import smitey.rpgindividual.FloatNum;
import smitey.rpgindividual.IntNum;
import smitey.rpgindividual.Locations;
import smitey.rpgindividual.MEffect;
import smitey.rpgindividual.Move;
import smitey.rpgindividual.Moves;
import smitey.rpgindividual.Mult;
import smitey.rpgindividual.Multiply;
import smitey.rpgindividual.NEq;
import smitey.rpgindividual.NameAttribute;
import smitey.rpgindividual.NumberComparing;
import smitey.rpgindividual.Or;
import smitey.rpgindividual.Proposition;
import smitey.rpgindividual.Relations;
import smitey.rpgindividual.RpgindividualPackage;
import smitey.rpgindividual.Rule;
import smitey.rpgindividual.Smaller;
import smitey.rpgindividual.SmallerEq;
import smitey.rpgindividual.Sub;
import smitey.rpgindividual.Sum;
import smitey.rpgindividual.SystemRPG;
import smitey.rpgindividual.Teams;
import smitey.rpgindividual.Comparator;


/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class RpgindividualValidator extends AbstractRpgindividualValidator {
	

	public static final String INVALID_NAME = "invalidName";
	public static final String UNSUPPORTED_OPERATION = "unsupportedOperation";
	public static final String MISSING_DECLARATION = "missingDeclaration";
	public static final String DUPLICATED_DECLARATION = "duplicatedDeclaration";
	public static final String EMPTY_ENTTIY_ATTRIBUTES = "emptyEntityAttributes";
	public static final String INCORRECT_TEAM_COUNT = "incorrectTeamCount";
	public static final String INDISTINCT_ATTRIBUTES = "indistinctAttributes";
	
	public void checkEntityStartsWithCapital(Entity entity) {
		if (!Character.isUpperCase(entity.getName().charAt(0))) {
			warning("The name of an entity should be a capital letter.",  RpgindividualPackage.Literals.ENTITY__NAME, INVALID_NAME);
		}
	}
	
	public void checkGameStartsWithCapital(SystemRPG sysrpg) {
		if (!Character.isUpperCase(sysrpg.getName().charAt(0))) {
			error("The name of the game should start with a capital letter.",  RpgindividualPackage.Literals.SYSTEM_RPG__NAME, INVALID_NAME);
		}
	}
	
	public void checkEffectStartsWithCapital(Effect effect) {
		if (!Character.isUpperCase(effect.getName().charAt(0))) {
			error("The name of this effect should start with a capital letter.",  RpgindividualPackage.Literals.EFFECT__NAME, INVALID_NAME);
		}
	}
	
	public void checkAttribute(Attribute att) {

		if(att.getAVal().getLTypes() == null) {
			warning("This is currently not supported in the language. Please use Float or Integer instead.", RpgindividualPackage.Literals.ATTRIBUTE__NAME, UNSUPPORTED_OPERATION);
		}
	}
	
	private Map<String, Boolean> setupBooleanDeclarationMap() {
		Map<String, Boolean> mappy = new HashMap<String, Boolean>();
		
		mappy.put("Location", false);
		mappy.put("Relations", false);
		mappy.put("Moves", false);
		mappy.put("Entities", false);
		mappy.put("Teams", false);
		mappy.put("Death", false);
		mappy.put("Attributes", false);
		mappy.put("Effects", false);
		
		return mappy;
	}
	
	private Map<String, Integer> setupIntegerDeclarationMap() {
		Map<String, Integer> mappy = new HashMap<String, Integer>();
		
		mappy.put("Location", 0);
		mappy.put("Relations", 0);
		mappy.put("Moves", 0);
		mappy.put("Entities", 0);
		mappy.put("Teams", 0);
		mappy.put("Death", 0);
		mappy.put("Attributes", 0);
		mappy.put("Effects", 0);
		
		return mappy;
	}
	
	
	@Check
	public void checkDeclarations(SystemRPG sysrpg) {
		// Locations | Relations | Moves | Entities | Teams | Death | Attributes | Effects
		
		Map<String, Boolean> mappy = setupBooleanDeclarationMap();
		
		for(Declaration d : sysrpg.getDeclarations()) {

			if(d instanceof Locations) {
				mappy.computeIfPresent("Location", (k, v) -> true);
			} else if(d instanceof Relations) {
				mappy.computeIfPresent("Relations", (k, v) -> true);
			} else if(d instanceof Moves) {
				mappy.computeIfPresent("Moves", (k, v) -> true);
			} else if(d instanceof Entities) {
				mappy.computeIfPresent("Entities", (k, v) -> true);
			} else if(d instanceof Teams) {
				mappy.computeIfPresent("Teams", (k, v) -> true);
			} else if(d instanceof Death) {
				mappy.computeIfPresent("Death", (k, v) -> true);
			} else if(d instanceof Attributes) {
				mappy.computeIfPresent("Attributes", (k, v) -> true);
			} else if(d instanceof Effects) {
				mappy.computeIfPresent("Effects", (k, v) -> true);
			}			
			
		}
		
		Map<String, Boolean> notPresent = mappy.entrySet().stream()
                .filter(map -> map.getValue() == false)
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
		
		String missing = "";
		for(Map.Entry<String, Boolean> entry : notPresent.entrySet()) {
			missing += " " + "[" +entry.getKey() + "]";
		}
		
		if(notPresent.size() > 0) {
			error("The following declarations are missing:" + missing + ". Please use them in your language.", RpgindividualPackage.Literals.SYSTEM_RPG__NAME, MISSING_DECLARATION);
		}
	}
	
	@Check
	public void checkDuplicateDeclarations(SystemRPG sysrpg) {
		
		Map<String, Integer> mappy = setupIntegerDeclarationMap();
		
		for(Declaration d : sysrpg.getDeclarations()) {

			if(d instanceof Locations) {
				mappy.computeIfPresent("Location", (k, v) -> v+=1);
			} else if(d instanceof Relations) {
				mappy.computeIfPresent("Relations", (k, v) -> v+=1);
			} else if(d instanceof Moves) {
				mappy.computeIfPresent("Moves", (k, v) -> v+=1);
			} else if(d instanceof Entities) {
				mappy.computeIfPresent("Entities", (k, v) -> v+=1);
			} else if(d instanceof Teams) {
				mappy.computeIfPresent("Teams", (k, v) -> v+=1);
			} else if(d instanceof Death) {
				mappy.computeIfPresent("Death", (k, v) -> v+=1);
			} else if(d instanceof Attributes) {
				mappy.computeIfPresent("Attributes", (k, v) -> v+=1);
			} else if(d instanceof Effects) {
				mappy.computeIfPresent("Effects", (k, v) -> v+=1);
			}			
			
		}
		
		Map<String, Integer> notPresent = mappy.entrySet().stream()
                .filter(map -> map.getValue() > 1)
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
		
		String missing = "";
		for(Map.Entry<String, Integer> entry : notPresent.entrySet()) {
			missing += " " + "[" +entry.getKey() + "]";
		}
		
		if(notPresent.size() > 0) {
			error("The following declarations are duplicated:" + missing + ". Please only use one of each.", RpgindividualPackage.Literals.SYSTEM_RPG__NAME, MISSING_DECLARATION);
		}
	}
	
	@Check
	public void checkTeamSize(Teams teams) {
		if(teams.getTeam().size() < 2) {
			warning("There is currently only one team, you will instantly win with no opponents.", RpgindividualPackage.Literals.TEAMS__TEAM, INCORRECT_TEAM_COUNT);
		}
	}
	
	@Check
	public void checkAttributesAreDistinct(SystemRPG sysrpg) {
		ArrayList<String> existingAttributes = new ArrayList<>();
		HashSet<String> moveAttributes = new HashSet<>();
		HashSet<String> entityAttributes = new HashSet<>();
		
		for(Declaration dec : sysrpg.getDeclarations()) {
			if(dec instanceof Attributes) {
				for(Attribute att : ((Attributes) dec).getAttribute()) {
					existingAttributes.add(att.getName());
				}
			} else if(dec instanceof Moves) {
				for(Move mov : ((Moves) dec).getMove()) {
					for(AltAttribute a : mov.getAtt()) {
						moveAttributes.add(a.getAttribute().getName());
					}					
				}
			} else if(dec instanceof Entities) {
				for(Entity ent : ((Entities) dec).getEntity()) {
					for(AltAttribute a : ent.getAtt()) {
						entityAttributes.add(a.getAttribute().getName());
					}
				}
			}
		}
		
		ArrayList<String> duplicates = new ArrayList<String>();
		
		for(String s : moveAttributes) {
			for(String d : entityAttributes) {
				if(s.equals(d)) {
					duplicates.add(d);
				}
			}
		}
		
		if(!duplicates.isEmpty()) {
			warning("Due to way the code has been implemented, using the same attribute in both an entity, and a move,"
					+ " can cause unwanted side effects, please consider changing the following duplicated attribute(s): " 
					+ duplicates, RpgindividualPackage.Literals.SYSTEM_RPG__NAME, INDISTINCT_ATTRIBUTES);
		}
	}

	private String getComparator(Comparator comp) {
		//{Smaller}'<' | {SmallerEq}'<=' | {Eq} '==' | {BiggerEq}'>=' | {Bigger}'>' | {NEq}'!='
		String compString = "";
		if(comp instanceof Smaller) {
			compString = "<";
		}
		if(comp instanceof SmallerEq) {
			compString = "<=";
		}
		if(comp instanceof Eq) {
			compString = "==";
		}
		if(comp instanceof BiggerEq) {
			compString = ">=";
		}
		if(comp instanceof Bigger) {
			compString = ">";
		}
		if(comp instanceof NEq) {
			compString = "!=";
		}
		return compString;
	}
	
	private void propositionToArray(Proposition x, ArrayList<String> al) {
		if(x instanceof Or) {
			propositionToArray(((Or) x).getLeft(), al);
			al.add("||");
			propositionToArray(((Or) x).getRight(), al);
		} else if(x instanceof And) {
			propositionToArray(((And) x).getLeft(), al);
			al.add("&&");
			propositionToArray(((And) x).getRight(), al);
		} else if(x instanceof NumberComparing) {
			propositionToArray(((NumberComparing) x).getLeft(), al);
			al.add(getComparator(((NumberComparing) x).getComp()));
			propositionToArray(((NumberComparing) x).getRight(), al);
		}
	}
	
	
	private void propositionToArray(Sum x, ArrayList<String> al) {
		if(x instanceof Add) {
			propositionToArray(((Add) x).getLeft(), al);
			al.add("+");
			propositionToArray(((Add) x).getRight(), al);
		} else if(x instanceof Sub) {
			propositionToArray(((Sub) x).getLeft(), al);
			al.add("-");
			propositionToArray(((Sub) x).getRight(), al);
		} else {
			propositionToArray((Multiply)x, al);
		}
	}
	
	private void propositionToArray(Multiply x, ArrayList<String> al) {
		if(x instanceof Mult) {
			propositionToArray(((Mult) x).getLeft(), al);
			al.add("*");
			propositionToArray(((Mult) x).getRight(), al);
		} else if(x instanceof Div) {
			propositionToArray(((Div) x).getLeft(), al);
			al.add("/");
			propositionToArray(((Div) x).getRight(), al);
		} else if(x instanceof AtomicNumber){
			propositionToArray((AtomicNumber)x, al);
		}
	}
	
	private void propositionToArray(AtomicNumber x, ArrayList<String> al) {
		//ActualNumbers | NameAttribute
		if(x instanceof ActualNumbers) {
			propositionToArray((ActualNumbers)x, al);
		} else if(x instanceof NameAttribute) {
			propositionToArray((NameAttribute)x, al);
		}
	}
	
	private void propositionToArray(ActualNumbers x, ArrayList<String> al) {
		//FloatNum | IntNum
		if(x instanceof FloatNum) {
			FloatNum fN = (FloatNum)x;
			String fNString = String.valueOf(fN.getI()) + "." + String.valueOf(fN.getDecimal());
			al.add(fNString);
		} else if(x instanceof IntNum) {
			IntNum iN = (IntNum)x;
			String iNString = String.valueOf(iN);
			al.add(iNString);
		}
	}
	
	private void propositionToArray(NameAttribute x, ArrayList<String> al) {
		//target=Target attribute=[Attribute]
		al.add(x.getTarget());
		al.add(x.getAttribute().getName());
	}
	
	private void getAttributesFromArray(ArrayList<String> propositionArray, ArrayList<String> attributeArray) {
		boolean pickNext = false;
		for(String st : propositionArray) {
			if(pickNext) {
				attributeArray.add(st);
				pickNext = false;
			}else if(st.equals("User") || st.equals("Enemy")) {
				pickNext = true;
			}
		}
	}
	
	@Check
	public void checkAllCanDie(SystemRPG sysrpg) {
		HashMap<String, Entity> nameToEntityMap = new HashMap<>();
		//Find attributes
		HashMap<String, ArrayList<String>> entitiesAttributes = new HashMap<>();
		ArrayList<String> deathAttributes = new ArrayList<>();
		for(Declaration d : sysrpg.getDeclarations()) {
			if(d instanceof Entities) {
				for(Entity entity : ((Entities) d).getEntity()) {
					ArrayList<String> entityAttributes = new ArrayList<>();
					for(AltAttribute att : entity.getAtt()) {
						entityAttributes.add(att.getAttribute().getName());
					}
					entitiesAttributes.put(entity.getName(), entityAttributes);
					nameToEntityMap.put(entity.getName(), entity);
				}
			} else if(d instanceof Death) {
				ArrayList<String> al = new ArrayList<String>();
				propositionToArray(((Death) d).getLog(), al);
				getAttributesFromArray(al, deathAttributes);
			}
		}
		//Check if they are all there
		for(Map.Entry<String, ArrayList<String>> entry : entitiesAttributes.entrySet()) {
		    String key = entry.getKey();
		    ArrayList<String> value = entry.getValue();
		    
		    for(String attribute : deathAttributes) {
		    	if(!value.contains(attribute)) {
		    		warning("The entity: " + key +", does not have all the attributes used in Death, which might cause it to be unkillable.",
		    				nameToEntityMap.get(key),
		    				RpgindividualPackage.Literals.ENTITY__ATT);
		    	}
		    }
		}
	}
	
	@Check
	public void checkForMoveDeadlocks(SystemRPG sysrpg) {
		HashMap<String, Entity> nameToEntityMap = new HashMap<>();
		//find entities
		//find effects
		HashMap<String, ArrayList<Move>> entityMap = new HashMap<>();
		HashMap<String, Rule> effectMap = new HashMap<>();
		for(Declaration d : sysrpg.getDeclarations()) {
			if(d instanceof Entities) {
				for(Entity entity : ((Entities) d).getEntity()) {
					ArrayList<Move> moveArray = new ArrayList<>();
					for(EntityMoveModifier eMove : entity.getEMoves().getMove()) {
						moveArray.add(eMove.getMoveName());
					}
					nameToEntityMap.put(entity.getName(), entity);
					entityMap.put(entity.getName(), moveArray);
				}
			} else if (d instanceof Effects) {
				for(Effect effect : ((Effects) d).getEffect()) {
					effectMap.put(effect.getName(), effect.getRule());
				}
			}
		}
		
		//check for preconditions (condition to use a move)
		//find which of them is reduced or increased
		HashMap<String, ArrayList<String>> preAttributesMap = new HashMap<>();
		ArrayList<String> postAttributesList = new ArrayList<>();
		for(Map.Entry<String, Rule> entry : effectMap.entrySet()) {
			String name = entry.getKey();
			Rule rule = entry.getValue();
			if(rule.getOr() != null) {
				ArrayList<String> tempArray = new ArrayList<>();
				propositionToArray(rule.getOr(), tempArray);
				ArrayList<String> rulePreArray = new ArrayList<>();
				getAttributesFromArray(tempArray, rulePreArray);
				preAttributesMap.put(name, rulePreArray);
			}
			
			postAttributesList.add(rule.getTargetAtt().getName());
		}
		
		//find the ones that are in both
		ArrayList<String> possibleDeadlockEffects = new ArrayList<>();
		for(Map.Entry<String, ArrayList<String>> entry : preAttributesMap.entrySet()) {
			String effectName = entry.getKey();
			for(String st : entry.getValue()) {
				if(postAttributesList.contains(st)) {
					possibleDeadlockEffects.add(effectName);
				}
			}
		}
		
		//check if all of an entity's moves contain a possible deadlock effect
		for(Map.Entry<String, ArrayList<Move>> entry : entityMap.entrySet()) {
			String entityName = entry.getKey();
			int movesWithPossibleDeadlockEffect = 0;
			for(Move move : entry.getValue()) {
				for(MEffect mEffect : move.getMEffect()) {
					if(possibleDeadlockEffects.contains(mEffect.getMoveEName().getName())) {
						movesWithPossibleDeadlockEffect++;
						break;
					}
				}
			}
			if(movesWithPossibleDeadlockEffect == entry.getValue().size()) {
				warning("The entity: " + entityName +", only has moves containing possible limited usages, which might cause a deadlock.",
						nameToEntityMap.get(entityName),
						RpgindividualPackage.Literals.ENTITY__NAME
	    				);
			}
		}
	}
}
