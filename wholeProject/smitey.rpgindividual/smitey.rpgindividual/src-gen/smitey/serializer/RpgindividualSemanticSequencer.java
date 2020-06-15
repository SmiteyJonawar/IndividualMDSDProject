/*
 * generated by Xtext 2.21.0
 */
package smitey.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import smitey.rpgindividual.Add;
import smitey.rpgindividual.AltAttribute;
import smitey.rpgindividual.And;
import smitey.rpgindividual.Attribute;
import smitey.rpgindividual.AttributeValues;
import smitey.rpgindividual.Attributes;
import smitey.rpgindividual.Bigger;
import smitey.rpgindividual.BiggerEq;
import smitey.rpgindividual.Death;
import smitey.rpgindividual.Div;
import smitey.rpgindividual.EType;
import smitey.rpgindividual.Effect;
import smitey.rpgindividual.Effects;
import smitey.rpgindividual.Entities;
import smitey.rpgindividual.Entity;
import smitey.rpgindividual.EntityMoveModifier;
import smitey.rpgindividual.EntityMoveMultiplier;
import smitey.rpgindividual.EntityMoves;
import smitey.rpgindividual.Eq;
import smitey.rpgindividual.FloatNum;
import smitey.rpgindividual.IntNum;
import smitey.rpgindividual.Loc;
import smitey.rpgindividual.Locations;
import smitey.rpgindividual.MEffect;
import smitey.rpgindividual.Members;
import smitey.rpgindividual.Move;
import smitey.rpgindividual.Moves;
import smitey.rpgindividual.Mult;
import smitey.rpgindividual.NEq;
import smitey.rpgindividual.NameAttribute;
import smitey.rpgindividual.NumberComparing;
import smitey.rpgindividual.Or;
import smitey.rpgindividual.Relations;
import smitey.rpgindividual.RpgindividualPackage;
import smitey.rpgindividual.Rule;
import smitey.rpgindividual.Smaller;
import smitey.rpgindividual.SmallerEq;
import smitey.rpgindividual.Sub;
import smitey.rpgindividual.SystemRPG;
import smitey.rpgindividual.Team;
import smitey.rpgindividual.Teams;
import smitey.rpgindividual.Type;
import smitey.rpgindividual.TypeExpression;
import smitey.services.RpgindividualGrammarAccess;

@SuppressWarnings("all")
public class RpgindividualSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RpgindividualGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RpgindividualPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RpgindividualPackage.ADD:
				sequence_Sum(context, (Add) semanticObject); 
				return; 
			case RpgindividualPackage.ALT_ATTRIBUTE:
				sequence_AltAttribute(context, (AltAttribute) semanticObject); 
				return; 
			case RpgindividualPackage.AND:
				sequence_ANDcondition(context, (And) semanticObject); 
				return; 
			case RpgindividualPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case RpgindividualPackage.ATTRIBUTE_VALUES:
				sequence_AttributeValues(context, (AttributeValues) semanticObject); 
				return; 
			case RpgindividualPackage.ATTRIBUTES:
				sequence_Attributes(context, (Attributes) semanticObject); 
				return; 
			case RpgindividualPackage.BIGGER:
				sequence_Comparator(context, (Bigger) semanticObject); 
				return; 
			case RpgindividualPackage.BIGGER_EQ:
				sequence_Comparator(context, (BiggerEq) semanticObject); 
				return; 
			case RpgindividualPackage.DEATH:
				sequence_Death(context, (Death) semanticObject); 
				return; 
			case RpgindividualPackage.DIV:
				sequence_Multiply(context, (Div) semanticObject); 
				return; 
			case RpgindividualPackage.ETYPE:
				sequence_EType(context, (EType) semanticObject); 
				return; 
			case RpgindividualPackage.EFFECT:
				sequence_Effect(context, (Effect) semanticObject); 
				return; 
			case RpgindividualPackage.EFFECTS:
				sequence_Effects(context, (Effects) semanticObject); 
				return; 
			case RpgindividualPackage.ENTITIES:
				sequence_Entities(context, (Entities) semanticObject); 
				return; 
			case RpgindividualPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case RpgindividualPackage.ENTITY_MOVE_MODIFIER:
				sequence_EntityMoveModifier(context, (EntityMoveModifier) semanticObject); 
				return; 
			case RpgindividualPackage.ENTITY_MOVE_MULTIPLIER:
				sequence_EntityMoveMultiplier(context, (EntityMoveMultiplier) semanticObject); 
				return; 
			case RpgindividualPackage.ENTITY_MOVES:
				sequence_EntityMoves(context, (EntityMoves) semanticObject); 
				return; 
			case RpgindividualPackage.EQ:
				sequence_Comparator(context, (Eq) semanticObject); 
				return; 
			case RpgindividualPackage.FLOAT_NUM:
				sequence_FloatNum(context, (FloatNum) semanticObject); 
				return; 
			case RpgindividualPackage.INT_NUM:
				sequence_IntNum(context, (IntNum) semanticObject); 
				return; 
			case RpgindividualPackage.LOC:
				sequence_Loc(context, (Loc) semanticObject); 
				return; 
			case RpgindividualPackage.LOCATIONS:
				sequence_Locations(context, (Locations) semanticObject); 
				return; 
			case RpgindividualPackage.MEFFECT:
				sequence_MEffect(context, (MEffect) semanticObject); 
				return; 
			case RpgindividualPackage.MEMBERS:
				sequence_Members(context, (Members) semanticObject); 
				return; 
			case RpgindividualPackage.MOVE:
				sequence_Move(context, (Move) semanticObject); 
				return; 
			case RpgindividualPackage.MOVES:
				sequence_Moves(context, (Moves) semanticObject); 
				return; 
			case RpgindividualPackage.MULT:
				sequence_Multiply(context, (Mult) semanticObject); 
				return; 
			case RpgindividualPackage.NEQ:
				sequence_Comparator(context, (NEq) semanticObject); 
				return; 
			case RpgindividualPackage.NAME_ATTRIBUTE:
				sequence_NameAttribute(context, (NameAttribute) semanticObject); 
				return; 
			case RpgindividualPackage.NUMBER_COMPARING:
				sequence_NumberComparing(context, (NumberComparing) semanticObject); 
				return; 
			case RpgindividualPackage.OR:
				sequence_ORcondition(context, (Or) semanticObject); 
				return; 
			case RpgindividualPackage.RELATIONS:
				sequence_Relations(context, (Relations) semanticObject); 
				return; 
			case RpgindividualPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case RpgindividualPackage.SMALLER:
				sequence_Comparator(context, (Smaller) semanticObject); 
				return; 
			case RpgindividualPackage.SMALLER_EQ:
				sequence_Comparator(context, (SmallerEq) semanticObject); 
				return; 
			case RpgindividualPackage.SUB:
				sequence_Sum(context, (Sub) semanticObject); 
				return; 
			case RpgindividualPackage.SYSTEM_RPG:
				sequence_SystemRPG(context, (SystemRPG) semanticObject); 
				return; 
			case RpgindividualPackage.TEAM:
				sequence_Team(context, (Team) semanticObject); 
				return; 
			case RpgindividualPackage.TEAMS:
				sequence_Teams(context, (Teams) semanticObject); 
				return; 
			case RpgindividualPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			case RpgindividualPackage.TYPE_EXPRESSION:
				sequence_TypeExpression(context, (TypeExpression) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ORcondition returns And
	 *     ORcondition.Or_1_1 returns And
	 *     ANDcondition returns And
	 *     ANDcondition.And_1_1 returns And
	 *     Statement returns And
	 *
	 * Constraint:
	 *     (left=ANDcondition_And_1_1 right=Statement)
	 */
	protected void sequence_ANDcondition(ISerializationContext context, And semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.AND__LEFT));
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.AND__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getANDconditionAccess().getAndLeftAction_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getANDconditionAccess().getRightStatementParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AltAttribute returns AltAttribute
	 *
	 * Constraint:
	 *     (attribute=[Attribute|ID] av=AttributeValues?)
	 */
	protected void sequence_AltAttribute(ISerializationContext context, AltAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeValues returns AttributeValues
	 *
	 * Constraint:
	 *     (lTypes=LegalType | an=ActualNumbers)
	 */
	protected void sequence_AttributeValues(ISerializationContext context, AttributeValues semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=ID aVal=AttributeValues)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.ATTRIBUTE__NAME));
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.ATTRIBUTE__AVAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.ATTRIBUTE__AVAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getAValAttributeValuesParserRuleCall_2_0(), semanticObject.getAVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Attributes
	 *     Attributes returns Attributes
	 *
	 * Constraint:
	 *     attribute+=Attribute+
	 */
	protected void sequence_Attributes(ISerializationContext context, Attributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comparator returns Bigger
	 *
	 * Constraint:
	 *     {Bigger}
	 */
	protected void sequence_Comparator(ISerializationContext context, Bigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comparator returns BiggerEq
	 *
	 * Constraint:
	 *     {BiggerEq}
	 */
	protected void sequence_Comparator(ISerializationContext context, BiggerEq semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comparator returns Eq
	 *
	 * Constraint:
	 *     {Eq}
	 */
	protected void sequence_Comparator(ISerializationContext context, Eq semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comparator returns NEq
	 *
	 * Constraint:
	 *     {NEq}
	 */
	protected void sequence_Comparator(ISerializationContext context, NEq semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comparator returns Smaller
	 *
	 * Constraint:
	 *     {Smaller}
	 */
	protected void sequence_Comparator(ISerializationContext context, Smaller semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comparator returns SmallerEq
	 *
	 * Constraint:
	 *     {SmallerEq}
	 */
	protected void sequence_Comparator(ISerializationContext context, SmallerEq semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Death
	 *     Death returns Death
	 *
	 * Constraint:
	 *     log=ORcondition
	 */
	protected void sequence_Death(ISerializationContext context, Death semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.DEATH__LOG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.DEATH__LOG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeathAccess().getLogORconditionParserRuleCall_2_0(), semanticObject.getLog());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EType returns EType
	 *
	 * Constraint:
	 *     type=[Type|ID]
	 */
	protected void sequence_EType(ISerializationContext context, EType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.ETYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.ETYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getETypeAccess().getTypeTypeIDTerminalRuleCall_1_0_1(), semanticObject.eGet(RpgindividualPackage.Literals.ETYPE__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Effect returns Effect
	 *
	 * Constraint:
	 *     (name=ID rule=Rule)
	 */
	protected void sequence_Effect(ISerializationContext context, Effect semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.EFFECT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.EFFECT__NAME));
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.EFFECT__RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.EFFECT__RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEffectAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEffectAccess().getRuleRuleParserRuleCall_2_0(), semanticObject.getRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Effects
	 *     Effects returns Effects
	 *
	 * Constraint:
	 *     effect+=Effect+
	 */
	protected void sequence_Effects(ISerializationContext context, Effects semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Entities
	 *     Entities returns Entities
	 *
	 * Constraint:
	 *     entity+=Entity+
	 */
	protected void sequence_Entities(ISerializationContext context, Entities semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityMoveModifier returns EntityMoveModifier
	 *
	 * Constraint:
	 *     (moveName=[Move|ID] moveModification+=EntityMoveMultiplier*)
	 */
	protected void sequence_EntityMoveModifier(ISerializationContext context, EntityMoveModifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityMoveMultiplier returns EntityMoveMultiplier
	 *
	 * Constraint:
	 *     (attribute=[Attribute|ID] multiplier=Sum)
	 */
	protected void sequence_EntityMoveMultiplier(ISerializationContext context, EntityMoveMultiplier semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.ENTITY_MOVE_MULTIPLIER__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.ENTITY_MOVE_MULTIPLIER__ATTRIBUTE));
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.ENTITY_MOVE_MULTIPLIER__MULTIPLIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.ENTITY_MOVE_MULTIPLIER__MULTIPLIER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntityMoveMultiplierAccess().getAttributeAttributeIDTerminalRuleCall_0_0_1(), semanticObject.eGet(RpgindividualPackage.Literals.ENTITY_MOVE_MULTIPLIER__ATTRIBUTE, false));
		feeder.accept(grammarAccess.getEntityMoveMultiplierAccess().getMultiplierSumParserRuleCall_2_0(), semanticObject.getMultiplier());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EntityMoves returns EntityMoves
	 *
	 * Constraint:
	 *     move+=EntityMoveModifier+
	 */
	protected void sequence_EntityMoves(ISerializationContext context, EntityMoves semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID eType=EType att+=AltAttribute* eMoves=EntityMoves)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sum returns FloatNum
	 *     Sum.Add_1_0_0_1 returns FloatNum
	 *     Sum.Sub_1_0_1_1 returns FloatNum
	 *     Multiply returns FloatNum
	 *     Multiply.Mult_1_0_0_1 returns FloatNum
	 *     Multiply.Div_1_0_1_1 returns FloatNum
	 *     AtomicNumber returns FloatNum
	 *     ActualNumbers returns FloatNum
	 *     FloatNum returns FloatNum
	 *
	 * Constraint:
	 *     (i=INT decimal=INT)
	 */
	protected void sequence_FloatNum(ISerializationContext context, FloatNum semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.FLOAT_NUM__I) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.FLOAT_NUM__I));
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.FLOAT_NUM__DECIMAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.FLOAT_NUM__DECIMAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFloatNumAccess().getIINTTerminalRuleCall_0_0(), semanticObject.getI());
		feeder.accept(grammarAccess.getFloatNumAccess().getDecimalINTTerminalRuleCall_2_0(), semanticObject.getDecimal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sum returns IntNum
	 *     Sum.Add_1_0_0_1 returns IntNum
	 *     Sum.Sub_1_0_1_1 returns IntNum
	 *     Multiply returns IntNum
	 *     Multiply.Mult_1_0_0_1 returns IntNum
	 *     Multiply.Div_1_0_1_1 returns IntNum
	 *     AtomicNumber returns IntNum
	 *     ActualNumbers returns IntNum
	 *     IntNum returns IntNum
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntNum(ISerializationContext context, IntNum semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.INT_NUM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.INT_NUM__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntNumAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Loc returns Loc
	 *
	 * Constraint:
	 *     (name=ID team=[Team|ID])
	 */
	protected void sequence_Loc(ISerializationContext context, Loc semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.LOC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.LOC__NAME));
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.LOC__TEAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.LOC__TEAM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLocAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLocAccess().getTeamTeamIDTerminalRuleCall_2_0_1(), semanticObject.eGet(RpgindividualPackage.Literals.LOC__TEAM, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Locations
	 *     Locations returns Locations
	 *
	 * Constraint:
	 *     loc+=Loc+
	 */
	protected void sequence_Locations(ISerializationContext context, Locations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MEffect returns MEffect
	 *
	 * Constraint:
	 *     moveEName=[Effect|ID]
	 */
	protected void sequence_MEffect(ISerializationContext context, MEffect semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.MEFFECT__MOVE_ENAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.MEFFECT__MOVE_ENAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMEffectAccess().getMoveENameEffectIDTerminalRuleCall_1_0_1(), semanticObject.eGet(RpgindividualPackage.Literals.MEFFECT__MOVE_ENAME, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Members returns Members
	 *
	 * Constraint:
	 *     entity+=[Entity|ID]+
	 */
	protected void sequence_Members(ISerializationContext context, Members semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Move returns Move
	 *
	 * Constraint:
	 *     (name=ID eType=EType att+=AltAttribute* mEffect+=MEffect+)
	 */
	protected void sequence_Move(ISerializationContext context, Move semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Moves
	 *     Moves returns Moves
	 *
	 * Constraint:
	 *     move+=Move+
	 */
	protected void sequence_Moves(ISerializationContext context, Moves semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sum returns Div
	 *     Sum.Add_1_0_0_1 returns Div
	 *     Sum.Sub_1_0_1_1 returns Div
	 *     Multiply returns Div
	 *     Multiply.Mult_1_0_0_1 returns Div
	 *     Multiply.Div_1_0_1_1 returns Div
	 *
	 * Constraint:
	 *     (left=Multiply_Div_1_0_1_1 right=AtomicNumber)
	 */
	protected void sequence_Multiply(ISerializationContext context, Div semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.DIV__LEFT));
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.DIV__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplyAccess().getRightAtomicNumberParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sum returns Mult
	 *     Sum.Add_1_0_0_1 returns Mult
	 *     Sum.Sub_1_0_1_1 returns Mult
	 *     Multiply returns Mult
	 *     Multiply.Mult_1_0_0_1 returns Mult
	 *     Multiply.Div_1_0_1_1 returns Mult
	 *
	 * Constraint:
	 *     (left=Multiply_Mult_1_0_0_1 right=AtomicNumber)
	 */
	protected void sequence_Multiply(ISerializationContext context, Mult semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.MULT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.MULT__LEFT));
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.MULT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.MULT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplyAccess().getRightAtomicNumberParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sum returns NameAttribute
	 *     Sum.Add_1_0_0_1 returns NameAttribute
	 *     Sum.Sub_1_0_1_1 returns NameAttribute
	 *     Multiply returns NameAttribute
	 *     Multiply.Mult_1_0_0_1 returns NameAttribute
	 *     Multiply.Div_1_0_1_1 returns NameAttribute
	 *     AtomicNumber returns NameAttribute
	 *     NameAttribute returns NameAttribute
	 *
	 * Constraint:
	 *     (target=Target attribute=[Attribute|ID])
	 */
	protected void sequence_NameAttribute(ISerializationContext context, NameAttribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.NAME_ATTRIBUTE__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.NAME_ATTRIBUTE__TARGET));
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.NAME_ATTRIBUTE__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.NAME_ATTRIBUTE__ATTRIBUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNameAttributeAccess().getTargetTargetParserRuleCall_0_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getNameAttributeAccess().getAttributeAttributeIDTerminalRuleCall_1_0_1(), semanticObject.eGet(RpgindividualPackage.Literals.NAME_ATTRIBUTE__ATTRIBUTE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ORcondition returns NumberComparing
	 *     ORcondition.Or_1_1 returns NumberComparing
	 *     ANDcondition returns NumberComparing
	 *     ANDcondition.And_1_1 returns NumberComparing
	 *     Statement returns NumberComparing
	 *     NumberComparing returns NumberComparing
	 *
	 * Constraint:
	 *     (left=Sum comp=Comparator right=Sum)
	 */
	protected void sequence_NumberComparing(ISerializationContext context, NumberComparing semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.NUMBER_COMPARING__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.NUMBER_COMPARING__LEFT));
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.NUMBER_COMPARING__COMP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.NUMBER_COMPARING__COMP));
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.NUMBER_COMPARING__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.NUMBER_COMPARING__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberComparingAccess().getLeftSumParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getNumberComparingAccess().getCompComparatorParserRuleCall_1_0(), semanticObject.getComp());
		feeder.accept(grammarAccess.getNumberComparingAccess().getRightSumParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ORcondition returns Or
	 *     ORcondition.Or_1_1 returns Or
	 *     ANDcondition returns Or
	 *     ANDcondition.And_1_1 returns Or
	 *     Statement returns Or
	 *
	 * Constraint:
	 *     (left=ORcondition_Or_1_1 right=ANDcondition)
	 */
	protected void sequence_ORcondition(ISerializationContext context, Or semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.OR__LEFT));
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.OR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getORconditionAccess().getOrLeftAction_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getORconditionAccess().getRightANDconditionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Relations
	 *     Relations returns Relations
	 *
	 * Constraint:
	 *     type+=Type+
	 */
	protected void sequence_Relations(ISerializationContext context, Relations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (or=ORcondition? targetThen=Target targetAtt=[Attribute|ID] (change='-' | change='+') sum=Sum)
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sum returns Add
	 *     Sum.Add_1_0_0_1 returns Add
	 *     Sum.Sub_1_0_1_1 returns Add
	 *
	 * Constraint:
	 *     (left=Sum_Add_1_0_0_1 right=Multiply)
	 */
	protected void sequence_Sum(ISerializationContext context, Add semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.ADD__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.ADD__LEFT));
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.ADD__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.ADD__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSumAccess().getRightMultiplyParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sum returns Sub
	 *     Sum.Add_1_0_0_1 returns Sub
	 *     Sum.Sub_1_0_1_1 returns Sub
	 *
	 * Constraint:
	 *     (left=Sum_Sub_1_0_1_1 right=Multiply)
	 */
	protected void sequence_Sum(ISerializationContext context, Sub semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.SUB__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.SUB__LEFT));
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.SUB__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.SUB__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSumAccess().getRightMultiplyParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SystemRPG returns SystemRPG
	 *
	 * Constraint:
	 *     (name=ID declarations+=Declaration*)
	 */
	protected void sequence_SystemRPG(ISerializationContext context, SystemRPG semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Team returns Team
	 *
	 * Constraint:
	 *     (name=ID members=Members)
	 */
	protected void sequence_Team(ISerializationContext context, Team semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.TEAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.TEAM__NAME));
			if (transientValues.isValueTransient(semanticObject, RpgindividualPackage.Literals.TEAM__MEMBERS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RpgindividualPackage.Literals.TEAM__MEMBERS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTeamAccess().getMembersMembersParserRuleCall_2_0(), semanticObject.getMembers());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Teams
	 *     Teams returns Teams
	 *
	 * Constraint:
	 *     team+=Team+
	 */
	protected void sequence_Teams(ISerializationContext context, Teams semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeExpression returns TypeExpression
	 *
	 * Constraint:
	 *     (
	 *         relationStrong=FloatNum 
	 *         strong=[Type|ID] 
	 *         strong2+=[Type|ID]* 
	 *         relationWeak=FloatNum 
	 *         weak=[Type|ID] 
	 *         weak2+=[Type|ID]*
	 *     )
	 */
	protected void sequence_TypeExpression(ISerializationContext context, TypeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Type
	 *
	 * Constraint:
	 *     (name=ID tExpression=TypeExpression?)
	 */
	protected void sequence_Type(ISerializationContext context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}