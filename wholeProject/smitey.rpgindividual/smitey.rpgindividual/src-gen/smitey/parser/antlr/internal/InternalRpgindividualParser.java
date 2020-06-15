package smitey.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import smitey.services.RpgindividualGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRpgindividualParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'effects'", "'effect'", "'attributes'", "'attribute'", "'location'", "'opponents'", "'relations'", "'type'", "'strong('", "'):'", "','", "'weak('", "'moves'", "'move'", "'is'", "'if'", "'then'", "'-'", "'+'", "'entities'", "'death'", "'when'", "'entity'", "'('", "')'", "'*'", "'teams'", "'team'", "'members'", "'OR'", "'AND'", "'<'", "'<='", "'=='", "'>='", "'>'", "'!='", "'/'", "'.'", "'User'", "'Enemy'", "'Float'", "'Integer'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRpgindividualParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRpgindividualParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRpgindividualParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRpgindividual.g"; }



     	private RpgindividualGrammarAccess grammarAccess;

        public InternalRpgindividualParser(TokenStream input, RpgindividualGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SystemRPG";
       	}

       	@Override
       	protected RpgindividualGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystemRPG"
    // InternalRpgindividual.g:64:1: entryRuleSystemRPG returns [EObject current=null] : iv_ruleSystemRPG= ruleSystemRPG EOF ;
    public final EObject entryRuleSystemRPG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemRPG = null;


        try {
            // InternalRpgindividual.g:64:50: (iv_ruleSystemRPG= ruleSystemRPG EOF )
            // InternalRpgindividual.g:65:2: iv_ruleSystemRPG= ruleSystemRPG EOF
            {
             newCompositeNode(grammarAccess.getSystemRPGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemRPG=ruleSystemRPG();

            state._fsp--;

             current =iv_ruleSystemRPG; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemRPG"


    // $ANTLR start "ruleSystemRPG"
    // InternalRpgindividual.g:71:1: ruleSystemRPG returns [EObject current=null] : (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) ;
    public final EObject ruleSystemRPG() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_declarations_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:77:2: ( (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) )
            // InternalRpgindividual.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            {
            // InternalRpgindividual.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            // InternalRpgindividual.g:79:3: otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemRPGAccess().getGameKeyword_0());
            		
            // InternalRpgindividual.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgindividual.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgindividual.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalRpgindividual.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemRPGAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRPGRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRpgindividual.g:101:3: ( (lv_declarations_2_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==14||LA1_0==16||LA1_0==18||LA1_0==24||(LA1_0>=31 && LA1_0<=32)||LA1_0==38) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRpgindividual.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // InternalRpgindividual.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    // InternalRpgindividual.g:103:5: lv_declarations_2_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getSystemRPGAccess().getDeclarationsDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_declarations_2_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRPGRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_2_0,
            	    						"smitey.Rpgindividual.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemRPG"


    // $ANTLR start "entryRuleDeclaration"
    // InternalRpgindividual.g:124:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalRpgindividual.g:124:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalRpgindividual.g:125:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalRpgindividual.g:131:1: ruleDeclaration returns [EObject current=null] : (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Death_5= ruleDeath | this_Attributes_6= ruleAttributes | this_Effects_7= ruleEffects ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Locations_0 = null;

        EObject this_Relations_1 = null;

        EObject this_Moves_2 = null;

        EObject this_Entities_3 = null;

        EObject this_Teams_4 = null;

        EObject this_Death_5 = null;

        EObject this_Attributes_6 = null;

        EObject this_Effects_7 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:137:2: ( (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Death_5= ruleDeath | this_Attributes_6= ruleAttributes | this_Effects_7= ruleEffects ) )
            // InternalRpgindividual.g:138:2: (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Death_5= ruleDeath | this_Attributes_6= ruleAttributes | this_Effects_7= ruleEffects )
            {
            // InternalRpgindividual.g:138:2: (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Death_5= ruleDeath | this_Attributes_6= ruleAttributes | this_Effects_7= ruleEffects )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 31:
                {
                alt2=4;
                }
                break;
            case 38:
                {
                alt2=5;
                }
                break;
            case 32:
                {
                alt2=6;
                }
                break;
            case 14:
                {
                alt2=7;
                }
                break;
            case 12:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRpgindividual.g:139:3: this_Locations_0= ruleLocations
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getLocationsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Locations_0=ruleLocations();

                    state._fsp--;


                    			current = this_Locations_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:148:3: this_Relations_1= ruleRelations
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getRelationsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Relations_1=ruleRelations();

                    state._fsp--;


                    			current = this_Relations_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRpgindividual.g:157:3: this_Moves_2= ruleMoves
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getMovesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Moves_2=ruleMoves();

                    state._fsp--;


                    			current = this_Moves_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRpgindividual.g:166:3: this_Entities_3= ruleEntities
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getEntitiesParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entities_3=ruleEntities();

                    state._fsp--;


                    			current = this_Entities_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRpgindividual.g:175:3: this_Teams_4= ruleTeams
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getTeamsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Teams_4=ruleTeams();

                    state._fsp--;


                    			current = this_Teams_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRpgindividual.g:184:3: this_Death_5= ruleDeath
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getDeathParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Death_5=ruleDeath();

                    state._fsp--;


                    			current = this_Death_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRpgindividual.g:193:3: this_Attributes_6= ruleAttributes
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getAttributesParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attributes_6=ruleAttributes();

                    state._fsp--;


                    			current = this_Attributes_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRpgindividual.g:202:3: this_Effects_7= ruleEffects
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getEffectsParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Effects_7=ruleEffects();

                    state._fsp--;


                    			current = this_Effects_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEffects"
    // InternalRpgindividual.g:214:1: entryRuleEffects returns [EObject current=null] : iv_ruleEffects= ruleEffects EOF ;
    public final EObject entryRuleEffects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffects = null;


        try {
            // InternalRpgindividual.g:214:48: (iv_ruleEffects= ruleEffects EOF )
            // InternalRpgindividual.g:215:2: iv_ruleEffects= ruleEffects EOF
            {
             newCompositeNode(grammarAccess.getEffectsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffects=ruleEffects();

            state._fsp--;

             current =iv_ruleEffects; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffects"


    // $ANTLR start "ruleEffects"
    // InternalRpgindividual.g:221:1: ruleEffects returns [EObject current=null] : (otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+ ) ;
    public final EObject ruleEffects() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_effect_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:227:2: ( (otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+ ) )
            // InternalRpgindividual.g:228:2: (otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+ )
            {
            // InternalRpgindividual.g:228:2: (otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+ )
            // InternalRpgindividual.g:229:3: otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectsAccess().getEffectsKeyword_0());
            		
            // InternalRpgindividual.g:233:3: ( (lv_effect_1_0= ruleEffect ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRpgindividual.g:234:4: (lv_effect_1_0= ruleEffect )
            	    {
            	    // InternalRpgindividual.g:234:4: (lv_effect_1_0= ruleEffect )
            	    // InternalRpgindividual.g:235:5: lv_effect_1_0= ruleEffect
            	    {

            	    					newCompositeNode(grammarAccess.getEffectsAccess().getEffectEffectParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_effect_1_0=ruleEffect();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEffectsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"effect",
            	    						lv_effect_1_0,
            	    						"smitey.Rpgindividual.Effect");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffects"


    // $ANTLR start "entryRuleEffect"
    // InternalRpgindividual.g:256:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalRpgindividual.g:256:47: (iv_ruleEffect= ruleEffect EOF )
            // InternalRpgindividual.g:257:2: iv_ruleEffect= ruleEffect EOF
            {
             newCompositeNode(grammarAccess.getEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffect=ruleEffect();

            state._fsp--;

             current =iv_ruleEffect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalRpgindividual.g:263:1: ruleEffect returns [EObject current=null] : (otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:269:2: ( (otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) ) )
            // InternalRpgindividual.g:270:2: (otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) )
            {
            // InternalRpgindividual.g:270:2: (otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) )
            // InternalRpgindividual.g:271:3: otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectAccess().getEffectKeyword_0());
            		
            // InternalRpgindividual.g:275:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgindividual.g:276:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgindividual.g:276:4: (lv_name_1_0= RULE_ID )
            // InternalRpgindividual.g:277:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEffectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRpgindividual.g:293:3: ( (lv_rule_2_0= ruleRule ) )
            // InternalRpgindividual.g:294:4: (lv_rule_2_0= ruleRule )
            {
            // InternalRpgindividual.g:294:4: (lv_rule_2_0= ruleRule )
            // InternalRpgindividual.g:295:5: lv_rule_2_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getEffectAccess().getRuleRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_rule_2_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectRule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_2_0,
            						"smitey.Rpgindividual.Rule");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleAttributes"
    // InternalRpgindividual.g:316:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // InternalRpgindividual.g:316:51: (iv_ruleAttributes= ruleAttributes EOF )
            // InternalRpgindividual.g:317:2: iv_ruleAttributes= ruleAttributes EOF
            {
             newCompositeNode(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributes=ruleAttributes();

            state._fsp--;

             current =iv_ruleAttributes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // InternalRpgindividual.g:323:1: ruleAttributes returns [EObject current=null] : (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_attribute_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:329:2: ( (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ ) )
            // InternalRpgindividual.g:330:2: (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ )
            {
            // InternalRpgindividual.g:330:2: (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ )
            // InternalRpgindividual.g:331:3: otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributesAccess().getAttributesKeyword_0());
            		
            // InternalRpgindividual.g:335:3: ( (lv_attribute_1_0= ruleAttribute ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRpgindividual.g:336:4: (lv_attribute_1_0= ruleAttribute )
            	    {
            	    // InternalRpgindividual.g:336:4: (lv_attribute_1_0= ruleAttribute )
            	    // InternalRpgindividual.g:337:5: lv_attribute_1_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getAttributesAccess().getAttributeAttributeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attribute_1_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAttributesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attribute",
            	    						lv_attribute_1_0,
            	    						"smitey.Rpgindividual.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleAttribute"
    // InternalRpgindividual.g:358:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalRpgindividual.g:358:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalRpgindividual.g:359:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalRpgindividual.g:365:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_aVal_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:371:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) ) )
            // InternalRpgindividual.g:372:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) )
            {
            // InternalRpgindividual.g:372:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) )
            // InternalRpgindividual.g:373:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalRpgindividual.g:377:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgindividual.g:378:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgindividual.g:378:4: (lv_name_1_0= RULE_ID )
            // InternalRpgindividual.g:379:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRpgindividual.g:395:3: ( (lv_aVal_2_0= ruleAttributeValues ) )
            // InternalRpgindividual.g:396:4: (lv_aVal_2_0= ruleAttributeValues )
            {
            // InternalRpgindividual.g:396:4: (lv_aVal_2_0= ruleAttributeValues )
            // InternalRpgindividual.g:397:5: lv_aVal_2_0= ruleAttributeValues
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getAValAttributeValuesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_aVal_2_0=ruleAttributeValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"aVal",
            						lv_aVal_2_0,
            						"smitey.Rpgindividual.AttributeValues");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleLocations"
    // InternalRpgindividual.g:418:1: entryRuleLocations returns [EObject current=null] : iv_ruleLocations= ruleLocations EOF ;
    public final EObject entryRuleLocations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocations = null;


        try {
            // InternalRpgindividual.g:418:50: (iv_ruleLocations= ruleLocations EOF )
            // InternalRpgindividual.g:419:2: iv_ruleLocations= ruleLocations EOF
            {
             newCompositeNode(grammarAccess.getLocationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocations=ruleLocations();

            state._fsp--;

             current =iv_ruleLocations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocations"


    // $ANTLR start "ruleLocations"
    // InternalRpgindividual.g:425:1: ruleLocations returns [EObject current=null] : (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ ) ;
    public final EObject ruleLocations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_loc_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:431:2: ( (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ ) )
            // InternalRpgindividual.g:432:2: (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ )
            {
            // InternalRpgindividual.g:432:2: (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ )
            // InternalRpgindividual.g:433:3: otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationsAccess().getLocationKeyword_0());
            		
            // InternalRpgindividual.g:437:3: ( (lv_loc_1_0= ruleLoc ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRpgindividual.g:438:4: (lv_loc_1_0= ruleLoc )
            	    {
            	    // InternalRpgindividual.g:438:4: (lv_loc_1_0= ruleLoc )
            	    // InternalRpgindividual.g:439:5: lv_loc_1_0= ruleLoc
            	    {

            	    					newCompositeNode(grammarAccess.getLocationsAccess().getLocLocParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_loc_1_0=ruleLoc();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLocationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"loc",
            	    						lv_loc_1_0,
            	    						"smitey.Rpgindividual.Loc");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocations"


    // $ANTLR start "entryRuleLoc"
    // InternalRpgindividual.g:460:1: entryRuleLoc returns [EObject current=null] : iv_ruleLoc= ruleLoc EOF ;
    public final EObject entryRuleLoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoc = null;


        try {
            // InternalRpgindividual.g:460:44: (iv_ruleLoc= ruleLoc EOF )
            // InternalRpgindividual.g:461:2: iv_ruleLoc= ruleLoc EOF
            {
             newCompositeNode(grammarAccess.getLocRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoc=ruleLoc();

            state._fsp--;

             current =iv_ruleLoc; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoc"


    // $ANTLR start "ruleLoc"
    // InternalRpgindividual.g:467:1: ruleLoc returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleLoc() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:473:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRpgindividual.g:474:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRpgindividual.g:474:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) )
            // InternalRpgindividual.g:475:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) )
            {
            // InternalRpgindividual.g:475:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRpgindividual.g:476:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRpgindividual.g:476:4: (lv_name_0_0= RULE_ID )
            // InternalRpgindividual.g:477:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLocAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLocAccess().getOpponentsKeyword_1());
            		
            // InternalRpgindividual.g:497:3: ( (otherlv_2= RULE_ID ) )
            // InternalRpgindividual.g:498:4: (otherlv_2= RULE_ID )
            {
            // InternalRpgindividual.g:498:4: (otherlv_2= RULE_ID )
            // InternalRpgindividual.g:499:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getLocAccess().getTeamTeamCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoc"


    // $ANTLR start "entryRuleRelations"
    // InternalRpgindividual.g:514:1: entryRuleRelations returns [EObject current=null] : iv_ruleRelations= ruleRelations EOF ;
    public final EObject entryRuleRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelations = null;


        try {
            // InternalRpgindividual.g:514:50: (iv_ruleRelations= ruleRelations EOF )
            // InternalRpgindividual.g:515:2: iv_ruleRelations= ruleRelations EOF
            {
             newCompositeNode(grammarAccess.getRelationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelations=ruleRelations();

            state._fsp--;

             current =iv_ruleRelations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelations"


    // $ANTLR start "ruleRelations"
    // InternalRpgindividual.g:521:1: ruleRelations returns [EObject current=null] : (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ ) ;
    public final EObject ruleRelations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:527:2: ( (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ ) )
            // InternalRpgindividual.g:528:2: (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ )
            {
            // InternalRpgindividual.g:528:2: (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ )
            // InternalRpgindividual.g:529:3: otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationsAccess().getRelationsKeyword_0());
            		
            // InternalRpgindividual.g:533:3: ( (lv_type_1_0= ruleType ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRpgindividual.g:534:4: (lv_type_1_0= ruleType )
            	    {
            	    // InternalRpgindividual.g:534:4: (lv_type_1_0= ruleType )
            	    // InternalRpgindividual.g:535:5: lv_type_1_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getRelationsAccess().getTypeTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_type_1_0=ruleType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRelationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"type",
            	    						lv_type_1_0,
            	    						"smitey.Rpgindividual.Type");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelations"


    // $ANTLR start "entryRuleType"
    // InternalRpgindividual.g:556:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalRpgindividual.g:556:45: (iv_ruleType= ruleType EOF )
            // InternalRpgindividual.g:557:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalRpgindividual.g:563:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_tExpression_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:569:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? ) )
            // InternalRpgindividual.g:570:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? )
            {
            // InternalRpgindividual.g:570:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? )
            // InternalRpgindividual.g:571:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            // InternalRpgindividual.g:575:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgindividual.g:576:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgindividual.g:576:4: (lv_name_1_0= RULE_ID )
            // InternalRpgindividual.g:577:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRpgindividual.g:593:3: ( (lv_tExpression_2_0= ruleTypeExpression ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRpgindividual.g:594:4: (lv_tExpression_2_0= ruleTypeExpression )
                    {
                    // InternalRpgindividual.g:594:4: (lv_tExpression_2_0= ruleTypeExpression )
                    // InternalRpgindividual.g:595:5: lv_tExpression_2_0= ruleTypeExpression
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getTExpressionTypeExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tExpression_2_0=ruleTypeExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"tExpression",
                    						lv_tExpression_2_0,
                    						"smitey.Rpgindividual.TypeExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeExpression"
    // InternalRpgindividual.g:616:1: entryRuleTypeExpression returns [EObject current=null] : iv_ruleTypeExpression= ruleTypeExpression EOF ;
    public final EObject entryRuleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpression = null;


        try {
            // InternalRpgindividual.g:616:55: (iv_ruleTypeExpression= ruleTypeExpression EOF )
            // InternalRpgindividual.g:617:2: iv_ruleTypeExpression= ruleTypeExpression EOF
            {
             newCompositeNode(grammarAccess.getTypeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeExpression=ruleTypeExpression();

            state._fsp--;

             current =iv_ruleTypeExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeExpression"


    // $ANTLR start "ruleTypeExpression"
    // InternalRpgindividual.g:623:1: ruleTypeExpression returns [EObject current=null] : (otherlv_0= 'strong(' ( (lv_relationStrong_1_0= ruleFloatNum ) ) otherlv_2= '):' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'weak(' ( (lv_relationWeak_7_0= ruleFloatNum ) ) otherlv_8= '):' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* ) ;
    public final EObject ruleTypeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_relationStrong_1_0 = null;

        EObject lv_relationWeak_7_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:629:2: ( (otherlv_0= 'strong(' ( (lv_relationStrong_1_0= ruleFloatNum ) ) otherlv_2= '):' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'weak(' ( (lv_relationWeak_7_0= ruleFloatNum ) ) otherlv_8= '):' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* ) )
            // InternalRpgindividual.g:630:2: (otherlv_0= 'strong(' ( (lv_relationStrong_1_0= ruleFloatNum ) ) otherlv_2= '):' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'weak(' ( (lv_relationWeak_7_0= ruleFloatNum ) ) otherlv_8= '):' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )
            {
            // InternalRpgindividual.g:630:2: (otherlv_0= 'strong(' ( (lv_relationStrong_1_0= ruleFloatNum ) ) otherlv_2= '):' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'weak(' ( (lv_relationWeak_7_0= ruleFloatNum ) ) otherlv_8= '):' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )
            // InternalRpgindividual.g:631:3: otherlv_0= 'strong(' ( (lv_relationStrong_1_0= ruleFloatNum ) ) otherlv_2= '):' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'weak(' ( (lv_relationWeak_7_0= ruleFloatNum ) ) otherlv_8= '):' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeExpressionAccess().getStrongKeyword_0());
            		
            // InternalRpgindividual.g:635:3: ( (lv_relationStrong_1_0= ruleFloatNum ) )
            // InternalRpgindividual.g:636:4: (lv_relationStrong_1_0= ruleFloatNum )
            {
            // InternalRpgindividual.g:636:4: (lv_relationStrong_1_0= ruleFloatNum )
            // InternalRpgindividual.g:637:5: lv_relationStrong_1_0= ruleFloatNum
            {

            					newCompositeNode(grammarAccess.getTypeExpressionAccess().getRelationStrongFloatNumParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_relationStrong_1_0=ruleFloatNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeExpressionRule());
            					}
            					set(
            						current,
            						"relationStrong",
            						lv_relationStrong_1_0,
            						"smitey.Rpgindividual.FloatNum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeExpressionAccess().getRightParenthesisColonKeyword_2());
            		
            // InternalRpgindividual.g:658:3: ( (otherlv_3= RULE_ID ) )
            // InternalRpgindividual.g:659:4: (otherlv_3= RULE_ID )
            {
            // InternalRpgindividual.g:659:4: (otherlv_3= RULE_ID )
            // InternalRpgindividual.g:660:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeExpressionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_3, grammarAccess.getTypeExpressionAccess().getStrongTypeCrossReference_3_0());
            				

            }


            }

            // InternalRpgindividual.g:671:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRpgindividual.g:672:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTypeExpressionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRpgindividual.g:676:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalRpgindividual.g:677:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalRpgindividual.g:677:5: (otherlv_5= RULE_ID )
            	    // InternalRpgindividual.g:678:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTypeExpressionRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    						newLeafNode(otherlv_5, grammarAccess.getTypeExpressionAccess().getStrong2TypeCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getTypeExpressionAccess().getWeakKeyword_5());
            		
            // InternalRpgindividual.g:694:3: ( (lv_relationWeak_7_0= ruleFloatNum ) )
            // InternalRpgindividual.g:695:4: (lv_relationWeak_7_0= ruleFloatNum )
            {
            // InternalRpgindividual.g:695:4: (lv_relationWeak_7_0= ruleFloatNum )
            // InternalRpgindividual.g:696:5: lv_relationWeak_7_0= ruleFloatNum
            {

            					newCompositeNode(grammarAccess.getTypeExpressionAccess().getRelationWeakFloatNumParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_17);
            lv_relationWeak_7_0=ruleFloatNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeExpressionRule());
            					}
            					set(
            						current,
            						"relationWeak",
            						lv_relationWeak_7_0,
            						"smitey.Rpgindividual.FloatNum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getTypeExpressionAccess().getRightParenthesisColonKeyword_7());
            		
            // InternalRpgindividual.g:717:3: ( (otherlv_9= RULE_ID ) )
            // InternalRpgindividual.g:718:4: (otherlv_9= RULE_ID )
            {
            // InternalRpgindividual.g:718:4: (otherlv_9= RULE_ID )
            // InternalRpgindividual.g:719:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeExpressionRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_9, grammarAccess.getTypeExpressionAccess().getWeakTypeCrossReference_8_0());
            				

            }


            }

            // InternalRpgindividual.g:730:3: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRpgindividual.g:731:4: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
            	    {
            	    otherlv_10=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_10, grammarAccess.getTypeExpressionAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalRpgindividual.g:735:4: ( (otherlv_11= RULE_ID ) )
            	    // InternalRpgindividual.g:736:5: (otherlv_11= RULE_ID )
            	    {
            	    // InternalRpgindividual.g:736:5: (otherlv_11= RULE_ID )
            	    // InternalRpgindividual.g:737:6: otherlv_11= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTypeExpressionRule());
            	    						}
            	    					
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    						newLeafNode(otherlv_11, grammarAccess.getTypeExpressionAccess().getWeak2TypeCrossReference_9_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeExpression"


    // $ANTLR start "entryRuleMoves"
    // InternalRpgindividual.g:753:1: entryRuleMoves returns [EObject current=null] : iv_ruleMoves= ruleMoves EOF ;
    public final EObject entryRuleMoves() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoves = null;


        try {
            // InternalRpgindividual.g:753:46: (iv_ruleMoves= ruleMoves EOF )
            // InternalRpgindividual.g:754:2: iv_ruleMoves= ruleMoves EOF
            {
             newCompositeNode(grammarAccess.getMovesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoves=ruleMoves();

            state._fsp--;

             current =iv_ruleMoves; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMoves"


    // $ANTLR start "ruleMoves"
    // InternalRpgindividual.g:760:1: ruleMoves returns [EObject current=null] : (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ ) ;
    public final EObject ruleMoves() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_move_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:766:2: ( (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ ) )
            // InternalRpgindividual.g:767:2: (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ )
            {
            // InternalRpgindividual.g:767:2: (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ )
            // InternalRpgindividual.g:768:3: otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+
            {
            otherlv_0=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getMovesAccess().getMovesKeyword_0());
            		
            // InternalRpgindividual.g:772:3: ( (lv_move_1_0= ruleMove ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRpgindividual.g:773:4: (lv_move_1_0= ruleMove )
            	    {
            	    // InternalRpgindividual.g:773:4: (lv_move_1_0= ruleMove )
            	    // InternalRpgindividual.g:774:5: lv_move_1_0= ruleMove
            	    {

            	    					newCompositeNode(grammarAccess.getMovesAccess().getMoveMoveParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_move_1_0=ruleMove();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMovesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"move",
            	    						lv_move_1_0,
            	    						"smitey.Rpgindividual.Move");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoves"


    // $ANTLR start "entryRuleMove"
    // InternalRpgindividual.g:795:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalRpgindividual.g:795:45: (iv_ruleMove= ruleMove EOF )
            // InternalRpgindividual.g:796:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalRpgindividual.g:802:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_mEffect_4_0= ruleMEffect ) )+ ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_eType_2_0 = null;

        EObject lv_att_3_0 = null;

        EObject lv_mEffect_4_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:808:2: ( (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_mEffect_4_0= ruleMEffect ) )+ ) )
            // InternalRpgindividual.g:809:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_mEffect_4_0= ruleMEffect ) )+ )
            {
            // InternalRpgindividual.g:809:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_mEffect_4_0= ruleMEffect ) )+ )
            // InternalRpgindividual.g:810:3: otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_mEffect_4_0= ruleMEffect ) )+
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
            		
            // InternalRpgindividual.g:814:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgindividual.g:815:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgindividual.g:815:4: (lv_name_1_0= RULE_ID )
            // InternalRpgindividual.g:816:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMoveAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRpgindividual.g:832:3: ( (lv_eType_2_0= ruleEType ) )
            // InternalRpgindividual.g:833:4: (lv_eType_2_0= ruleEType )
            {
            // InternalRpgindividual.g:833:4: (lv_eType_2_0= ruleEType )
            // InternalRpgindividual.g:834:5: lv_eType_2_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getETypeETypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_eType_2_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"eType",
            						lv_eType_2_0,
            						"smitey.Rpgindividual.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRpgindividual.g:851:3: ( (lv_att_3_0= ruleAltAttribute ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRpgindividual.g:852:4: (lv_att_3_0= ruleAltAttribute )
            	    {
            	    // InternalRpgindividual.g:852:4: (lv_att_3_0= ruleAltAttribute )
            	    // InternalRpgindividual.g:853:5: lv_att_3_0= ruleAltAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getMoveAccess().getAttAltAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_att_3_0=ruleAltAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMoveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"att",
            	    						lv_att_3_0,
            	    						"smitey.Rpgindividual.AltAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalRpgindividual.g:870:3: ( (lv_mEffect_4_0= ruleMEffect ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==13) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRpgindividual.g:871:4: (lv_mEffect_4_0= ruleMEffect )
            	    {
            	    // InternalRpgindividual.g:871:4: (lv_mEffect_4_0= ruleMEffect )
            	    // InternalRpgindividual.g:872:5: lv_mEffect_4_0= ruleMEffect
            	    {

            	    					newCompositeNode(grammarAccess.getMoveAccess().getMEffectMEffectParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_mEffect_4_0=ruleMEffect();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMoveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mEffect",
            	    						lv_mEffect_4_0,
            	    						"smitey.Rpgindividual.MEffect");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleMEffect"
    // InternalRpgindividual.g:893:1: entryRuleMEffect returns [EObject current=null] : iv_ruleMEffect= ruleMEffect EOF ;
    public final EObject entryRuleMEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEffect = null;


        try {
            // InternalRpgindividual.g:893:48: (iv_ruleMEffect= ruleMEffect EOF )
            // InternalRpgindividual.g:894:2: iv_ruleMEffect= ruleMEffect EOF
            {
             newCompositeNode(grammarAccess.getMEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMEffect=ruleMEffect();

            state._fsp--;

             current =iv_ruleMEffect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMEffect"


    // $ANTLR start "ruleMEffect"
    // InternalRpgindividual.g:900:1: ruleMEffect returns [EObject current=null] : (otherlv_0= 'effect' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleMEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:906:2: ( (otherlv_0= 'effect' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRpgindividual.g:907:2: (otherlv_0= 'effect' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRpgindividual.g:907:2: (otherlv_0= 'effect' ( (otherlv_1= RULE_ID ) ) )
            // InternalRpgindividual.g:908:3: otherlv_0= 'effect' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMEffectAccess().getEffectKeyword_0());
            		
            // InternalRpgindividual.g:912:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgindividual.g:913:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgindividual.g:913:4: (otherlv_1= RULE_ID )
            // InternalRpgindividual.g:914:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMEffectRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getMEffectAccess().getMoveENameEffectCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMEffect"


    // $ANTLR start "entryRuleEType"
    // InternalRpgindividual.g:929:1: entryRuleEType returns [EObject current=null] : iv_ruleEType= ruleEType EOF ;
    public final EObject entryRuleEType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEType = null;


        try {
            // InternalRpgindividual.g:929:46: (iv_ruleEType= ruleEType EOF )
            // InternalRpgindividual.g:930:2: iv_ruleEType= ruleEType EOF
            {
             newCompositeNode(grammarAccess.getETypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEType=ruleEType();

            state._fsp--;

             current =iv_ruleEType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEType"


    // $ANTLR start "ruleEType"
    // InternalRpgindividual.g:936:1: ruleEType returns [EObject current=null] : (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:942:2: ( (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRpgindividual.g:943:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRpgindividual.g:943:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) )
            // InternalRpgindividual.g:944:3: otherlv_0= 'type' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getETypeAccess().getTypeKeyword_0());
            		
            // InternalRpgindividual.g:948:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgindividual.g:949:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgindividual.g:949:4: (otherlv_1= RULE_ID )
            // InternalRpgindividual.g:950:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getETypeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getETypeAccess().getTypeTypeCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEType"


    // $ANTLR start "entryRuleAttributeValues"
    // InternalRpgindividual.g:965:1: entryRuleAttributeValues returns [EObject current=null] : iv_ruleAttributeValues= ruleAttributeValues EOF ;
    public final EObject entryRuleAttributeValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValues = null;


        try {
            // InternalRpgindividual.g:965:56: (iv_ruleAttributeValues= ruleAttributeValues EOF )
            // InternalRpgindividual.g:966:2: iv_ruleAttributeValues= ruleAttributeValues EOF
            {
             newCompositeNode(grammarAccess.getAttributeValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValues=ruleAttributeValues();

            state._fsp--;

             current =iv_ruleAttributeValues; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeValues"


    // $ANTLR start "ruleAttributeValues"
    // InternalRpgindividual.g:972:1: ruleAttributeValues returns [EObject current=null] : (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) ) ;
    public final EObject ruleAttributeValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_lTypes_1_0 = null;

        EObject lv_an_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:978:2: ( (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) ) )
            // InternalRpgindividual.g:979:2: (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) )
            {
            // InternalRpgindividual.g:979:2: (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) )
            // InternalRpgindividual.g:980:3: otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeValuesAccess().getIsKeyword_0());
            		
            // InternalRpgindividual.g:984:3: ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=53 && LA13_0<=54)) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_INT) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRpgindividual.g:985:4: ( (lv_lTypes_1_0= ruleLegalType ) )
                    {
                    // InternalRpgindividual.g:985:4: ( (lv_lTypes_1_0= ruleLegalType ) )
                    // InternalRpgindividual.g:986:5: (lv_lTypes_1_0= ruleLegalType )
                    {
                    // InternalRpgindividual.g:986:5: (lv_lTypes_1_0= ruleLegalType )
                    // InternalRpgindividual.g:987:6: lv_lTypes_1_0= ruleLegalType
                    {

                    						newCompositeNode(grammarAccess.getAttributeValuesAccess().getLTypesLegalTypeParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_lTypes_1_0=ruleLegalType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeValuesRule());
                    						}
                    						set(
                    							current,
                    							"lTypes",
                    							lv_lTypes_1_0,
                    							"smitey.Rpgindividual.LegalType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1005:4: ( (lv_an_2_0= ruleActualNumbers ) )
                    {
                    // InternalRpgindividual.g:1005:4: ( (lv_an_2_0= ruleActualNumbers ) )
                    // InternalRpgindividual.g:1006:5: (lv_an_2_0= ruleActualNumbers )
                    {
                    // InternalRpgindividual.g:1006:5: (lv_an_2_0= ruleActualNumbers )
                    // InternalRpgindividual.g:1007:6: lv_an_2_0= ruleActualNumbers
                    {

                    						newCompositeNode(grammarAccess.getAttributeValuesAccess().getAnActualNumbersParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_an_2_0=ruleActualNumbers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeValuesRule());
                    						}
                    						set(
                    							current,
                    							"an",
                    							lv_an_2_0,
                    							"smitey.Rpgindividual.ActualNumbers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeValues"


    // $ANTLR start "entryRuleAltAttribute"
    // InternalRpgindividual.g:1029:1: entryRuleAltAttribute returns [EObject current=null] : iv_ruleAltAttribute= ruleAltAttribute EOF ;
    public final EObject entryRuleAltAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAltAttribute = null;


        try {
            // InternalRpgindividual.g:1029:53: (iv_ruleAltAttribute= ruleAltAttribute EOF )
            // InternalRpgindividual.g:1030:2: iv_ruleAltAttribute= ruleAltAttribute EOF
            {
             newCompositeNode(grammarAccess.getAltAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAltAttribute=ruleAltAttribute();

            state._fsp--;

             current =iv_ruleAltAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAltAttribute"


    // $ANTLR start "ruleAltAttribute"
    // InternalRpgindividual.g:1036:1: ruleAltAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? ) ;
    public final EObject ruleAltAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_av_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1042:2: ( (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? ) )
            // InternalRpgindividual.g:1043:2: (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? )
            {
            // InternalRpgindividual.g:1043:2: (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? )
            // InternalRpgindividual.g:1044:3: otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAltAttributeAccess().getAttributeKeyword_0());
            		
            // InternalRpgindividual.g:1048:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgindividual.g:1049:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgindividual.g:1049:4: (otherlv_1= RULE_ID )
            // InternalRpgindividual.g:1050:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAltAttributeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_1, grammarAccess.getAltAttributeAccess().getAttributeAttributeCrossReference_1_0());
            				

            }


            }

            // InternalRpgindividual.g:1061:3: ( (lv_av_2_0= ruleAttributeValues ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRpgindividual.g:1062:4: (lv_av_2_0= ruleAttributeValues )
                    {
                    // InternalRpgindividual.g:1062:4: (lv_av_2_0= ruleAttributeValues )
                    // InternalRpgindividual.g:1063:5: lv_av_2_0= ruleAttributeValues
                    {

                    					newCompositeNode(grammarAccess.getAltAttributeAccess().getAvAttributeValuesParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_av_2_0=ruleAttributeValues();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAltAttributeRule());
                    					}
                    					set(
                    						current,
                    						"av",
                    						lv_av_2_0,
                    						"smitey.Rpgindividual.AttributeValues");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAltAttribute"


    // $ANTLR start "entryRuleRule"
    // InternalRpgindividual.g:1084:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalRpgindividual.g:1084:45: (iv_ruleRule= ruleRule EOF )
            // InternalRpgindividual.g:1085:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalRpgindividual.g:1091:1: ruleRule returns [EObject current=null] : ( (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (lv_targetThen_3_0= ruleTarget ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'is' ( ( (lv_change_6_1= '-' | lv_change_6_2= '+' ) ) ) ( (lv_sum_7_0= ruleSum ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_change_6_1=null;
        Token lv_change_6_2=null;
        EObject lv_or_1_0 = null;

        AntlrDatatypeRuleToken lv_targetThen_3_0 = null;

        EObject lv_sum_7_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1097:2: ( ( (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (lv_targetThen_3_0= ruleTarget ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'is' ( ( (lv_change_6_1= '-' | lv_change_6_2= '+' ) ) ) ( (lv_sum_7_0= ruleSum ) ) ) )
            // InternalRpgindividual.g:1098:2: ( (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (lv_targetThen_3_0= ruleTarget ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'is' ( ( (lv_change_6_1= '-' | lv_change_6_2= '+' ) ) ) ( (lv_sum_7_0= ruleSum ) ) )
            {
            // InternalRpgindividual.g:1098:2: ( (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (lv_targetThen_3_0= ruleTarget ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'is' ( ( (lv_change_6_1= '-' | lv_change_6_2= '+' ) ) ) ( (lv_sum_7_0= ruleSum ) ) )
            // InternalRpgindividual.g:1099:3: (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (lv_targetThen_3_0= ruleTarget ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'is' ( ( (lv_change_6_1= '-' | lv_change_6_2= '+' ) ) ) ( (lv_sum_7_0= ruleSum ) )
            {
            // InternalRpgindividual.g:1099:3: (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRpgindividual.g:1100:4: otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getIfKeyword_0_0());
                    			
                    // InternalRpgindividual.g:1104:4: ( (lv_or_1_0= ruleORcondition ) )
                    // InternalRpgindividual.g:1105:5: (lv_or_1_0= ruleORcondition )
                    {
                    // InternalRpgindividual.g:1105:5: (lv_or_1_0= ruleORcondition )
                    // InternalRpgindividual.g:1106:6: lv_or_1_0= ruleORcondition
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getOrORconditionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_or_1_0=ruleORcondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"or",
                    							lv_or_1_0,
                    							"smitey.Rpgindividual.ORcondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getThenKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalRpgindividual.g:1128:3: ( (lv_targetThen_3_0= ruleTarget ) )
            // InternalRpgindividual.g:1129:4: (lv_targetThen_3_0= ruleTarget )
            {
            // InternalRpgindividual.g:1129:4: (lv_targetThen_3_0= ruleTarget )
            // InternalRpgindividual.g:1130:5: lv_targetThen_3_0= ruleTarget
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getTargetThenTargetParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_targetThen_3_0=ruleTarget();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"targetThen",
            						lv_targetThen_3_0,
            						"smitey.Rpgindividual.Target");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRpgindividual.g:1147:3: ( (otherlv_4= RULE_ID ) )
            // InternalRpgindividual.g:1148:4: (otherlv_4= RULE_ID )
            {
            // InternalRpgindividual.g:1148:4: (otherlv_4= RULE_ID )
            // InternalRpgindividual.g:1149:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getTargetAttAttributeCrossReference_2_0());
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_28); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getIsKeyword_3());
            		
            // InternalRpgindividual.g:1164:3: ( ( (lv_change_6_1= '-' | lv_change_6_2= '+' ) ) )
            // InternalRpgindividual.g:1165:4: ( (lv_change_6_1= '-' | lv_change_6_2= '+' ) )
            {
            // InternalRpgindividual.g:1165:4: ( (lv_change_6_1= '-' | lv_change_6_2= '+' ) )
            // InternalRpgindividual.g:1166:5: (lv_change_6_1= '-' | lv_change_6_2= '+' )
            {
            // InternalRpgindividual.g:1166:5: (lv_change_6_1= '-' | lv_change_6_2= '+' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            else if ( (LA16_0==30) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRpgindividual.g:1167:6: lv_change_6_1= '-'
                    {
                    lv_change_6_1=(Token)match(input,29,FOLLOW_29); 

                    						newLeafNode(lv_change_6_1, grammarAccess.getRuleAccess().getChangeHyphenMinusKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    						setWithLastConsumed(current, "change", lv_change_6_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1178:6: lv_change_6_2= '+'
                    {
                    lv_change_6_2=(Token)match(input,30,FOLLOW_29); 

                    						newLeafNode(lv_change_6_2, grammarAccess.getRuleAccess().getChangePlusSignKeyword_4_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    						setWithLastConsumed(current, "change", lv_change_6_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalRpgindividual.g:1191:3: ( (lv_sum_7_0= ruleSum ) )
            // InternalRpgindividual.g:1192:4: (lv_sum_7_0= ruleSum )
            {
            // InternalRpgindividual.g:1192:4: (lv_sum_7_0= ruleSum )
            // InternalRpgindividual.g:1193:5: lv_sum_7_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getSumSumParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_sum_7_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"sum",
            						lv_sum_7_0,
            						"smitey.Rpgindividual.Sum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleEntities"
    // InternalRpgindividual.g:1214:1: entryRuleEntities returns [EObject current=null] : iv_ruleEntities= ruleEntities EOF ;
    public final EObject entryRuleEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntities = null;


        try {
            // InternalRpgindividual.g:1214:49: (iv_ruleEntities= ruleEntities EOF )
            // InternalRpgindividual.g:1215:2: iv_ruleEntities= ruleEntities EOF
            {
             newCompositeNode(grammarAccess.getEntitiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntities=ruleEntities();

            state._fsp--;

             current =iv_ruleEntities; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntities"


    // $ANTLR start "ruleEntities"
    // InternalRpgindividual.g:1221:1: ruleEntities returns [EObject current=null] : (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ ) ;
    public final EObject ruleEntities() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_entity_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1227:2: ( (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ ) )
            // InternalRpgindividual.g:1228:2: (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ )
            {
            // InternalRpgindividual.g:1228:2: (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ )
            // InternalRpgindividual.g:1229:3: otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+
            {
            otherlv_0=(Token)match(input,31,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getEntitiesAccess().getEntitiesKeyword_0());
            		
            // InternalRpgindividual.g:1233:3: ( (lv_entity_1_0= ruleEntity ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRpgindividual.g:1234:4: (lv_entity_1_0= ruleEntity )
            	    {
            	    // InternalRpgindividual.g:1234:4: (lv_entity_1_0= ruleEntity )
            	    // InternalRpgindividual.g:1235:5: lv_entity_1_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getEntitiesAccess().getEntityEntityParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_entity_1_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entity",
            	    						lv_entity_1_0,
            	    						"smitey.Rpgindividual.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntities"


    // $ANTLR start "entryRuleDeath"
    // InternalRpgindividual.g:1256:1: entryRuleDeath returns [EObject current=null] : iv_ruleDeath= ruleDeath EOF ;
    public final EObject entryRuleDeath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeath = null;


        try {
            // InternalRpgindividual.g:1256:46: (iv_ruleDeath= ruleDeath EOF )
            // InternalRpgindividual.g:1257:2: iv_ruleDeath= ruleDeath EOF
            {
             newCompositeNode(grammarAccess.getDeathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeath=ruleDeath();

            state._fsp--;

             current =iv_ruleDeath; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeath"


    // $ANTLR start "ruleDeath"
    // InternalRpgindividual.g:1263:1: ruleDeath returns [EObject current=null] : (otherlv_0= 'death' otherlv_1= 'when' ( (lv_log_2_0= ruleORcondition ) ) ) ;
    public final EObject ruleDeath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_log_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1269:2: ( (otherlv_0= 'death' otherlv_1= 'when' ( (lv_log_2_0= ruleORcondition ) ) ) )
            // InternalRpgindividual.g:1270:2: (otherlv_0= 'death' otherlv_1= 'when' ( (lv_log_2_0= ruleORcondition ) ) )
            {
            // InternalRpgindividual.g:1270:2: (otherlv_0= 'death' otherlv_1= 'when' ( (lv_log_2_0= ruleORcondition ) ) )
            // InternalRpgindividual.g:1271:3: otherlv_0= 'death' otherlv_1= 'when' ( (lv_log_2_0= ruleORcondition ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getDeathAccess().getDeathKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getDeathAccess().getWhenKeyword_1());
            		
            // InternalRpgindividual.g:1279:3: ( (lv_log_2_0= ruleORcondition ) )
            // InternalRpgindividual.g:1280:4: (lv_log_2_0= ruleORcondition )
            {
            // InternalRpgindividual.g:1280:4: (lv_log_2_0= ruleORcondition )
            // InternalRpgindividual.g:1281:5: lv_log_2_0= ruleORcondition
            {

            					newCompositeNode(grammarAccess.getDeathAccess().getLogORconditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_log_2_0=ruleORcondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeathRule());
            					}
            					set(
            						current,
            						"log",
            						lv_log_2_0,
            						"smitey.Rpgindividual.ORcondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeath"


    // $ANTLR start "entryRuleEntity"
    // InternalRpgindividual.g:1302:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalRpgindividual.g:1302:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalRpgindividual.g:1303:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalRpgindividual.g:1309:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_eType_2_0 = null;

        EObject lv_att_3_0 = null;

        EObject lv_eMoves_4_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1315:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) ) )
            // InternalRpgindividual.g:1316:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) )
            {
            // InternalRpgindividual.g:1316:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) )
            // InternalRpgindividual.g:1317:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalRpgindividual.g:1321:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgindividual.g:1322:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgindividual.g:1322:4: (lv_name_1_0= RULE_ID )
            // InternalRpgindividual.g:1323:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRpgindividual.g:1339:3: ( (lv_eType_2_0= ruleEType ) )
            // InternalRpgindividual.g:1340:4: (lv_eType_2_0= ruleEType )
            {
            // InternalRpgindividual.g:1340:4: (lv_eType_2_0= ruleEType )
            // InternalRpgindividual.g:1341:5: lv_eType_2_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getETypeETypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_33);
            lv_eType_2_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"eType",
            						lv_eType_2_0,
            						"smitey.Rpgindividual.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRpgindividual.g:1358:3: ( (lv_att_3_0= ruleAltAttribute ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRpgindividual.g:1359:4: (lv_att_3_0= ruleAltAttribute )
            	    {
            	    // InternalRpgindividual.g:1359:4: (lv_att_3_0= ruleAltAttribute )
            	    // InternalRpgindividual.g:1360:5: lv_att_3_0= ruleAltAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttAltAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_att_3_0=ruleAltAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"att",
            	    						lv_att_3_0,
            	    						"smitey.Rpgindividual.AltAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalRpgindividual.g:1377:3: ( (lv_eMoves_4_0= ruleEntityMoves ) )
            // InternalRpgindividual.g:1378:4: (lv_eMoves_4_0= ruleEntityMoves )
            {
            // InternalRpgindividual.g:1378:4: (lv_eMoves_4_0= ruleEntityMoves )
            // InternalRpgindividual.g:1379:5: lv_eMoves_4_0= ruleEntityMoves
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getEMovesEntityMovesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_eMoves_4_0=ruleEntityMoves();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"eMoves",
            						lv_eMoves_4_0,
            						"smitey.Rpgindividual.EntityMoves");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityMoves"
    // InternalRpgindividual.g:1400:1: entryRuleEntityMoves returns [EObject current=null] : iv_ruleEntityMoves= ruleEntityMoves EOF ;
    public final EObject entryRuleEntityMoves() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityMoves = null;


        try {
            // InternalRpgindividual.g:1400:52: (iv_ruleEntityMoves= ruleEntityMoves EOF )
            // InternalRpgindividual.g:1401:2: iv_ruleEntityMoves= ruleEntityMoves EOF
            {
             newCompositeNode(grammarAccess.getEntityMovesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityMoves=ruleEntityMoves();

            state._fsp--;

             current =iv_ruleEntityMoves; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityMoves"


    // $ANTLR start "ruleEntityMoves"
    // InternalRpgindividual.g:1407:1: ruleEntityMoves returns [EObject current=null] : (otherlv_0= 'move' ( (lv_move_1_0= ruleEntityMoveModifier ) )+ ) ;
    public final EObject ruleEntityMoves() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_move_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1413:2: ( (otherlv_0= 'move' ( (lv_move_1_0= ruleEntityMoveModifier ) )+ ) )
            // InternalRpgindividual.g:1414:2: (otherlv_0= 'move' ( (lv_move_1_0= ruleEntityMoveModifier ) )+ )
            {
            // InternalRpgindividual.g:1414:2: (otherlv_0= 'move' ( (lv_move_1_0= ruleEntityMoveModifier ) )+ )
            // InternalRpgindividual.g:1415:3: otherlv_0= 'move' ( (lv_move_1_0= ruleEntityMoveModifier ) )+
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityMovesAccess().getMoveKeyword_0());
            		
            // InternalRpgindividual.g:1419:3: ( (lv_move_1_0= ruleEntityMoveModifier ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRpgindividual.g:1420:4: (lv_move_1_0= ruleEntityMoveModifier )
            	    {
            	    // InternalRpgindividual.g:1420:4: (lv_move_1_0= ruleEntityMoveModifier )
            	    // InternalRpgindividual.g:1421:5: lv_move_1_0= ruleEntityMoveModifier
            	    {

            	    					newCompositeNode(grammarAccess.getEntityMovesAccess().getMoveEntityMoveModifierParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_move_1_0=ruleEntityMoveModifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityMovesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"move",
            	    						lv_move_1_0,
            	    						"smitey.Rpgindividual.EntityMoveModifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityMoves"


    // $ANTLR start "entryRuleEntityMoveModifier"
    // InternalRpgindividual.g:1442:1: entryRuleEntityMoveModifier returns [EObject current=null] : iv_ruleEntityMoveModifier= ruleEntityMoveModifier EOF ;
    public final EObject entryRuleEntityMoveModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityMoveModifier = null;


        try {
            // InternalRpgindividual.g:1442:59: (iv_ruleEntityMoveModifier= ruleEntityMoveModifier EOF )
            // InternalRpgindividual.g:1443:2: iv_ruleEntityMoveModifier= ruleEntityMoveModifier EOF
            {
             newCompositeNode(grammarAccess.getEntityMoveModifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityMoveModifier=ruleEntityMoveModifier();

            state._fsp--;

             current =iv_ruleEntityMoveModifier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityMoveModifier"


    // $ANTLR start "ruleEntityMoveModifier"
    // InternalRpgindividual.g:1449:1: ruleEntityMoveModifier returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_moveModification_2_0= ruleEntityMoveMultiplier ) )* otherlv_3= ')' ) ;
    public final EObject ruleEntityMoveModifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_moveModification_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1455:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_moveModification_2_0= ruleEntityMoveMultiplier ) )* otherlv_3= ')' ) )
            // InternalRpgindividual.g:1456:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_moveModification_2_0= ruleEntityMoveMultiplier ) )* otherlv_3= ')' )
            {
            // InternalRpgindividual.g:1456:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_moveModification_2_0= ruleEntityMoveMultiplier ) )* otherlv_3= ')' )
            // InternalRpgindividual.g:1457:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_moveModification_2_0= ruleEntityMoveMultiplier ) )* otherlv_3= ')'
            {
            // InternalRpgindividual.g:1457:3: ( (otherlv_0= RULE_ID ) )
            // InternalRpgindividual.g:1458:4: (otherlv_0= RULE_ID )
            {
            // InternalRpgindividual.g:1458:4: (otherlv_0= RULE_ID )
            // InternalRpgindividual.g:1459:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityMoveModifierRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_0, grammarAccess.getEntityMoveModifierAccess().getMoveNameMoveCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityMoveModifierAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRpgindividual.g:1474:3: ( (lv_moveModification_2_0= ruleEntityMoveMultiplier ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRpgindividual.g:1475:4: (lv_moveModification_2_0= ruleEntityMoveMultiplier )
            	    {
            	    // InternalRpgindividual.g:1475:4: (lv_moveModification_2_0= ruleEntityMoveMultiplier )
            	    // InternalRpgindividual.g:1476:5: lv_moveModification_2_0= ruleEntityMoveMultiplier
            	    {

            	    					newCompositeNode(grammarAccess.getEntityMoveModifierAccess().getMoveModificationEntityMoveMultiplierParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_moveModification_2_0=ruleEntityMoveMultiplier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityMoveModifierRule());
            	    					}
            	    					add(
            	    						current,
            	    						"moveModification",
            	    						lv_moveModification_2_0,
            	    						"smitey.Rpgindividual.EntityMoveMultiplier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_3=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityMoveModifierAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityMoveModifier"


    // $ANTLR start "entryRuleEntityMoveMultiplier"
    // InternalRpgindividual.g:1501:1: entryRuleEntityMoveMultiplier returns [EObject current=null] : iv_ruleEntityMoveMultiplier= ruleEntityMoveMultiplier EOF ;
    public final EObject entryRuleEntityMoveMultiplier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityMoveMultiplier = null;


        try {
            // InternalRpgindividual.g:1501:61: (iv_ruleEntityMoveMultiplier= ruleEntityMoveMultiplier EOF )
            // InternalRpgindividual.g:1502:2: iv_ruleEntityMoveMultiplier= ruleEntityMoveMultiplier EOF
            {
             newCompositeNode(grammarAccess.getEntityMoveMultiplierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityMoveMultiplier=ruleEntityMoveMultiplier();

            state._fsp--;

             current =iv_ruleEntityMoveMultiplier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityMoveMultiplier"


    // $ANTLR start "ruleEntityMoveMultiplier"
    // InternalRpgindividual.g:1508:1: ruleEntityMoveMultiplier returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_multiplier_2_0= ruleSum ) ) ) ;
    public final EObject ruleEntityMoveMultiplier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_multiplier_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1514:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_multiplier_2_0= ruleSum ) ) ) )
            // InternalRpgindividual.g:1515:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_multiplier_2_0= ruleSum ) ) )
            {
            // InternalRpgindividual.g:1515:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_multiplier_2_0= ruleSum ) ) )
            // InternalRpgindividual.g:1516:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_multiplier_2_0= ruleSum ) )
            {
            // InternalRpgindividual.g:1516:3: ( (otherlv_0= RULE_ID ) )
            // InternalRpgindividual.g:1517:4: (otherlv_0= RULE_ID )
            {
            // InternalRpgindividual.g:1517:4: (otherlv_0= RULE_ID )
            // InternalRpgindividual.g:1518:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityMoveMultiplierRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_0, grammarAccess.getEntityMoveMultiplierAccess().getAttributeAttributeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityMoveMultiplierAccess().getAsteriskKeyword_1());
            		
            // InternalRpgindividual.g:1533:3: ( (lv_multiplier_2_0= ruleSum ) )
            // InternalRpgindividual.g:1534:4: (lv_multiplier_2_0= ruleSum )
            {
            // InternalRpgindividual.g:1534:4: (lv_multiplier_2_0= ruleSum )
            // InternalRpgindividual.g:1535:5: lv_multiplier_2_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getEntityMoveMultiplierAccess().getMultiplierSumParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_multiplier_2_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityMoveMultiplierRule());
            					}
            					set(
            						current,
            						"multiplier",
            						lv_multiplier_2_0,
            						"smitey.Rpgindividual.Sum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityMoveMultiplier"


    // $ANTLR start "entryRuleTeams"
    // InternalRpgindividual.g:1556:1: entryRuleTeams returns [EObject current=null] : iv_ruleTeams= ruleTeams EOF ;
    public final EObject entryRuleTeams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeams = null;


        try {
            // InternalRpgindividual.g:1556:46: (iv_ruleTeams= ruleTeams EOF )
            // InternalRpgindividual.g:1557:2: iv_ruleTeams= ruleTeams EOF
            {
             newCompositeNode(grammarAccess.getTeamsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeams=ruleTeams();

            state._fsp--;

             current =iv_ruleTeams; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTeams"


    // $ANTLR start "ruleTeams"
    // InternalRpgindividual.g:1563:1: ruleTeams returns [EObject current=null] : (otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+ ) ;
    public final EObject ruleTeams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_team_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1569:2: ( (otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+ ) )
            // InternalRpgindividual.g:1570:2: (otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+ )
            {
            // InternalRpgindividual.g:1570:2: (otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+ )
            // InternalRpgindividual.g:1571:3: otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+
            {
            otherlv_0=(Token)match(input,38,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamsAccess().getTeamsKeyword_0());
            		
            // InternalRpgindividual.g:1575:3: ( (lv_team_1_0= ruleTeam ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==39) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRpgindividual.g:1576:4: (lv_team_1_0= ruleTeam )
            	    {
            	    // InternalRpgindividual.g:1576:4: (lv_team_1_0= ruleTeam )
            	    // InternalRpgindividual.g:1577:5: lv_team_1_0= ruleTeam
            	    {

            	    					newCompositeNode(grammarAccess.getTeamsAccess().getTeamTeamParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_team_1_0=ruleTeam();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTeamsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"team",
            	    						lv_team_1_0,
            	    						"smitey.Rpgindividual.Team");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTeams"


    // $ANTLR start "entryRuleTeam"
    // InternalRpgindividual.g:1598:1: entryRuleTeam returns [EObject current=null] : iv_ruleTeam= ruleTeam EOF ;
    public final EObject entryRuleTeam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeam = null;


        try {
            // InternalRpgindividual.g:1598:45: (iv_ruleTeam= ruleTeam EOF )
            // InternalRpgindividual.g:1599:2: iv_ruleTeam= ruleTeam EOF
            {
             newCompositeNode(grammarAccess.getTeamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeam=ruleTeam();

            state._fsp--;

             current =iv_ruleTeam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTeam"


    // $ANTLR start "ruleTeam"
    // InternalRpgindividual.g:1605:1: ruleTeam returns [EObject current=null] : (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) ) ;
    public final EObject ruleTeam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_members_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1611:2: ( (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) ) )
            // InternalRpgindividual.g:1612:2: (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) )
            {
            // InternalRpgindividual.g:1612:2: (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) )
            // InternalRpgindividual.g:1613:3: otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamAccess().getTeamKeyword_0());
            		
            // InternalRpgindividual.g:1617:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgindividual.g:1618:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgindividual.g:1618:4: (lv_name_1_0= RULE_ID )
            // InternalRpgindividual.g:1619:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRpgindividual.g:1635:3: ( (lv_members_2_0= ruleMembers ) )
            // InternalRpgindividual.g:1636:4: (lv_members_2_0= ruleMembers )
            {
            // InternalRpgindividual.g:1636:4: (lv_members_2_0= ruleMembers )
            // InternalRpgindividual.g:1637:5: lv_members_2_0= ruleMembers
            {

            					newCompositeNode(grammarAccess.getTeamAccess().getMembersMembersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_members_2_0=ruleMembers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeamRule());
            					}
            					set(
            						current,
            						"members",
            						lv_members_2_0,
            						"smitey.Rpgindividual.Members");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRuleMembers"
    // InternalRpgindividual.g:1658:1: entryRuleMembers returns [EObject current=null] : iv_ruleMembers= ruleMembers EOF ;
    public final EObject entryRuleMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMembers = null;


        try {
            // InternalRpgindividual.g:1658:48: (iv_ruleMembers= ruleMembers EOF )
            // InternalRpgindividual.g:1659:2: iv_ruleMembers= ruleMembers EOF
            {
             newCompositeNode(grammarAccess.getMembersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMembers=ruleMembers();

            state._fsp--;

             current =iv_ruleMembers; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMembers"


    // $ANTLR start "ruleMembers"
    // InternalRpgindividual.g:1665:1: ruleMembers returns [EObject current=null] : (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ ) ;
    public final EObject ruleMembers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:1671:2: ( (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ ) )
            // InternalRpgindividual.g:1672:2: (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ )
            {
            // InternalRpgindividual.g:1672:2: (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ )
            // InternalRpgindividual.g:1673:3: otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMembersAccess().getMembersKeyword_0());
            		
            // InternalRpgindividual.g:1677:3: ( (otherlv_1= RULE_ID ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRpgindividual.g:1678:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalRpgindividual.g:1678:4: (otherlv_1= RULE_ID )
            	    // InternalRpgindividual.g:1679:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMembersRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    					newLeafNode(otherlv_1, grammarAccess.getMembersAccess().getEntityEntityCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMembers"


    // $ANTLR start "entryRuleORcondition"
    // InternalRpgindividual.g:1694:1: entryRuleORcondition returns [EObject current=null] : iv_ruleORcondition= ruleORcondition EOF ;
    public final EObject entryRuleORcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORcondition = null;


        try {
            // InternalRpgindividual.g:1694:52: (iv_ruleORcondition= ruleORcondition EOF )
            // InternalRpgindividual.g:1695:2: iv_ruleORcondition= ruleORcondition EOF
            {
             newCompositeNode(grammarAccess.getORconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleORcondition=ruleORcondition();

            state._fsp--;

             current =iv_ruleORcondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleORcondition"


    // $ANTLR start "ruleORcondition"
    // InternalRpgindividual.g:1701:1: ruleORcondition returns [EObject current=null] : (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* ) ;
    public final EObject ruleORcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_ANDcondition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1707:2: ( (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* ) )
            // InternalRpgindividual.g:1708:2: (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* )
            {
            // InternalRpgindividual.g:1708:2: (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* )
            // InternalRpgindividual.g:1709:3: this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )*
            {

            			newCompositeNode(grammarAccess.getORconditionAccess().getANDconditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_ANDcondition_0=ruleANDcondition();

            state._fsp--;


            			current = this_ANDcondition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRpgindividual.g:1717:3: (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==41) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRpgindividual.g:1718:4: otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) )
            	    {
            	    otherlv_1=(Token)match(input,41,FOLLOW_26); 

            	    				newLeafNode(otherlv_1, grammarAccess.getORconditionAccess().getORKeyword_1_0());
            	    			
            	    // InternalRpgindividual.g:1722:4: ()
            	    // InternalRpgindividual.g:1723:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getORconditionAccess().getOrLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRpgindividual.g:1729:4: ( (lv_right_3_0= ruleANDcondition ) )
            	    // InternalRpgindividual.g:1730:5: (lv_right_3_0= ruleANDcondition )
            	    {
            	    // InternalRpgindividual.g:1730:5: (lv_right_3_0= ruleANDcondition )
            	    // InternalRpgindividual.g:1731:6: lv_right_3_0= ruleANDcondition
            	    {

            	    						newCompositeNode(grammarAccess.getORconditionAccess().getRightANDconditionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=ruleANDcondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getORconditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"smitey.Rpgindividual.ANDcondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleORcondition"


    // $ANTLR start "entryRuleANDcondition"
    // InternalRpgindividual.g:1753:1: entryRuleANDcondition returns [EObject current=null] : iv_ruleANDcondition= ruleANDcondition EOF ;
    public final EObject entryRuleANDcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANDcondition = null;


        try {
            // InternalRpgindividual.g:1753:53: (iv_ruleANDcondition= ruleANDcondition EOF )
            // InternalRpgindividual.g:1754:2: iv_ruleANDcondition= ruleANDcondition EOF
            {
             newCompositeNode(grammarAccess.getANDconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleANDcondition=ruleANDcondition();

            state._fsp--;

             current =iv_ruleANDcondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleANDcondition"


    // $ANTLR start "ruleANDcondition"
    // InternalRpgindividual.g:1760:1: ruleANDcondition returns [EObject current=null] : (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* ) ;
    public final EObject ruleANDcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Statement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1766:2: ( (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* ) )
            // InternalRpgindividual.g:1767:2: (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* )
            {
            // InternalRpgindividual.g:1767:2: (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* )
            // InternalRpgindividual.g:1768:3: this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )*
            {

            			newCompositeNode(grammarAccess.getANDconditionAccess().getStatementParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_Statement_0=ruleStatement();

            state._fsp--;


            			current = this_Statement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRpgindividual.g:1776:3: (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==42) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRpgindividual.g:1777:4: otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) )
            	    {
            	    otherlv_1=(Token)match(input,42,FOLLOW_26); 

            	    				newLeafNode(otherlv_1, grammarAccess.getANDconditionAccess().getANDKeyword_1_0());
            	    			
            	    // InternalRpgindividual.g:1781:4: ()
            	    // InternalRpgindividual.g:1782:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getANDconditionAccess().getAndLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRpgindividual.g:1788:4: ( (lv_right_3_0= ruleStatement ) )
            	    // InternalRpgindividual.g:1789:5: (lv_right_3_0= ruleStatement )
            	    {
            	    // InternalRpgindividual.g:1789:5: (lv_right_3_0= ruleStatement )
            	    // InternalRpgindividual.g:1790:6: lv_right_3_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getANDconditionAccess().getRightStatementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_right_3_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getANDconditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"smitey.Rpgindividual.Statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleANDcondition"


    // $ANTLR start "entryRuleStatement"
    // InternalRpgindividual.g:1812:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRpgindividual.g:1812:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRpgindividual.g:1813:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRpgindividual.g:1819:1: ruleStatement returns [EObject current=null] : (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_NumberComparing_0 = null;

        EObject this_ORcondition_2 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1825:2: ( (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) ) )
            // InternalRpgindividual.g:1826:2: (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) )
            {
            // InternalRpgindividual.g:1826:2: (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT||(LA25_0>=51 && LA25_0<=52)) ) {
                alt25=1;
            }
            else if ( (LA25_0==35) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalRpgindividual.g:1827:3: this_NumberComparing_0= ruleNumberComparing
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getNumberComparingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberComparing_0=ruleNumberComparing();

                    state._fsp--;


                    			current = this_NumberComparing_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1836:3: (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' )
                    {
                    // InternalRpgindividual.g:1836:3: (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' )
                    // InternalRpgindividual.g:1837:4: otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getStatementAccess().getORconditionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_42);
                    this_ORcondition_2=ruleORcondition();

                    state._fsp--;


                    				current = this_ORcondition_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleNumberComparing"
    // InternalRpgindividual.g:1858:1: entryRuleNumberComparing returns [EObject current=null] : iv_ruleNumberComparing= ruleNumberComparing EOF ;
    public final EObject entryRuleNumberComparing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberComparing = null;


        try {
            // InternalRpgindividual.g:1858:56: (iv_ruleNumberComparing= ruleNumberComparing EOF )
            // InternalRpgindividual.g:1859:2: iv_ruleNumberComparing= ruleNumberComparing EOF
            {
             newCompositeNode(grammarAccess.getNumberComparingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberComparing=ruleNumberComparing();

            state._fsp--;

             current =iv_ruleNumberComparing; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberComparing"


    // $ANTLR start "ruleNumberComparing"
    // InternalRpgindividual.g:1865:1: ruleNumberComparing returns [EObject current=null] : ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) ) ;
    public final EObject ruleNumberComparing() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_comp_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1871:2: ( ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) ) )
            // InternalRpgindividual.g:1872:2: ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) )
            {
            // InternalRpgindividual.g:1872:2: ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) )
            // InternalRpgindividual.g:1873:3: ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) )
            {
            // InternalRpgindividual.g:1873:3: ( (lv_left_0_0= ruleSum ) )
            // InternalRpgindividual.g:1874:4: (lv_left_0_0= ruleSum )
            {
            // InternalRpgindividual.g:1874:4: (lv_left_0_0= ruleSum )
            // InternalRpgindividual.g:1875:5: lv_left_0_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getNumberComparingAccess().getLeftSumParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
            lv_left_0_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberComparingRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"smitey.Rpgindividual.Sum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRpgindividual.g:1892:3: ( (lv_comp_1_0= ruleComparator ) )
            // InternalRpgindividual.g:1893:4: (lv_comp_1_0= ruleComparator )
            {
            // InternalRpgindividual.g:1893:4: (lv_comp_1_0= ruleComparator )
            // InternalRpgindividual.g:1894:5: lv_comp_1_0= ruleComparator
            {

            					newCompositeNode(grammarAccess.getNumberComparingAccess().getCompComparatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_comp_1_0=ruleComparator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberComparingRule());
            					}
            					set(
            						current,
            						"comp",
            						lv_comp_1_0,
            						"smitey.Rpgindividual.Comparator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRpgindividual.g:1911:3: ( (lv_right_2_0= ruleSum ) )
            // InternalRpgindividual.g:1912:4: (lv_right_2_0= ruleSum )
            {
            // InternalRpgindividual.g:1912:4: (lv_right_2_0= ruleSum )
            // InternalRpgindividual.g:1913:5: lv_right_2_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getNumberComparingAccess().getRightSumParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberComparingRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"smitey.Rpgindividual.Sum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberComparing"


    // $ANTLR start "entryRuleComparator"
    // InternalRpgindividual.g:1934:1: entryRuleComparator returns [EObject current=null] : iv_ruleComparator= ruleComparator EOF ;
    public final EObject entryRuleComparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparator = null;


        try {
            // InternalRpgindividual.g:1934:51: (iv_ruleComparator= ruleComparator EOF )
            // InternalRpgindividual.g:1935:2: iv_ruleComparator= ruleComparator EOF
            {
             newCompositeNode(grammarAccess.getComparatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparator=ruleComparator();

            state._fsp--;

             current =iv_ruleComparator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparator"


    // $ANTLR start "ruleComparator"
    // InternalRpgindividual.g:1941:1: ruleComparator returns [EObject current=null] : ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) ) ;
    public final EObject ruleComparator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:1947:2: ( ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) ) )
            // InternalRpgindividual.g:1948:2: ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) )
            {
            // InternalRpgindividual.g:1948:2: ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt26=1;
                }
                break;
            case 44:
                {
                alt26=2;
                }
                break;
            case 45:
                {
                alt26=3;
                }
                break;
            case 46:
                {
                alt26=4;
                }
                break;
            case 47:
                {
                alt26=5;
                }
                break;
            case 48:
                {
                alt26=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalRpgindividual.g:1949:3: ( () otherlv_1= '<' )
                    {
                    // InternalRpgindividual.g:1949:3: ( () otherlv_1= '<' )
                    // InternalRpgindividual.g:1950:4: () otherlv_1= '<'
                    {
                    // InternalRpgindividual.g:1950:4: ()
                    // InternalRpgindividual.g:1951:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getSmallerAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,43,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getComparatorAccess().getLessThanSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1963:3: ( () otherlv_3= '<=' )
                    {
                    // InternalRpgindividual.g:1963:3: ( () otherlv_3= '<=' )
                    // InternalRpgindividual.g:1964:4: () otherlv_3= '<='
                    {
                    // InternalRpgindividual.g:1964:4: ()
                    // InternalRpgindividual.g:1965:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getSmallerEqAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,44,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getComparatorAccess().getLessThanSignEqualsSignKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRpgindividual.g:1977:3: ( () otherlv_5= '==' )
                    {
                    // InternalRpgindividual.g:1977:3: ( () otherlv_5= '==' )
                    // InternalRpgindividual.g:1978:4: () otherlv_5= '=='
                    {
                    // InternalRpgindividual.g:1978:4: ()
                    // InternalRpgindividual.g:1979:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getEqAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,45,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getComparatorAccess().getEqualsSignEqualsSignKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRpgindividual.g:1991:3: ( () otherlv_7= '>=' )
                    {
                    // InternalRpgindividual.g:1991:3: ( () otherlv_7= '>=' )
                    // InternalRpgindividual.g:1992:4: () otherlv_7= '>='
                    {
                    // InternalRpgindividual.g:1992:4: ()
                    // InternalRpgindividual.g:1993:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getBiggerEqAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,46,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getComparatorAccess().getGreaterThanSignEqualsSignKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRpgindividual.g:2005:3: ( () otherlv_9= '>' )
                    {
                    // InternalRpgindividual.g:2005:3: ( () otherlv_9= '>' )
                    // InternalRpgindividual.g:2006:4: () otherlv_9= '>'
                    {
                    // InternalRpgindividual.g:2006:4: ()
                    // InternalRpgindividual.g:2007:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getBiggerAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,47,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getComparatorAccess().getGreaterThanSignKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRpgindividual.g:2019:3: ( () otherlv_11= '!=' )
                    {
                    // InternalRpgindividual.g:2019:3: ( () otherlv_11= '!=' )
                    // InternalRpgindividual.g:2020:4: () otherlv_11= '!='
                    {
                    // InternalRpgindividual.g:2020:4: ()
                    // InternalRpgindividual.g:2021:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getNEqAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,48,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getComparatorAccess().getExclamationMarkEqualsSignKeyword_5_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparator"


    // $ANTLR start "entryRuleSum"
    // InternalRpgindividual.g:2036:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalRpgindividual.g:2036:44: (iv_ruleSum= ruleSum EOF )
            // InternalRpgindividual.g:2037:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalRpgindividual.g:2043:1: ruleSum returns [EObject current=null] : (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Multiply_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:2049:2: ( (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* ) )
            // InternalRpgindividual.g:2050:2: (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* )
            {
            // InternalRpgindividual.g:2050:2: (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* )
            // InternalRpgindividual.g:2051:3: this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )*
            {

            			newCompositeNode(grammarAccess.getSumAccess().getMultiplyParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_Multiply_0=ruleMultiply();

            state._fsp--;


            			current = this_Multiply_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRpgindividual.g:2059:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=29 && LA28_0<=30)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRpgindividual.g:2060:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) )
            	    {
            	    // InternalRpgindividual.g:2060:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==30) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==29) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalRpgindividual.g:2061:5: (otherlv_1= '+' () )
            	            {
            	            // InternalRpgindividual.g:2061:5: (otherlv_1= '+' () )
            	            // InternalRpgindividual.g:2062:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,30,FOLLOW_29); 

            	            						newLeafNode(otherlv_1, grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalRpgindividual.g:2066:6: ()
            	            // InternalRpgindividual.g:2067:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRpgindividual.g:2075:5: (otherlv_3= '-' () )
            	            {
            	            // InternalRpgindividual.g:2075:5: (otherlv_3= '-' () )
            	            // InternalRpgindividual.g:2076:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,29,FOLLOW_29); 

            	            						newLeafNode(otherlv_3, grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalRpgindividual.g:2080:6: ()
            	            // InternalRpgindividual.g:2081:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRpgindividual.g:2089:4: ( (lv_right_5_0= ruleMultiply ) )
            	    // InternalRpgindividual.g:2090:5: (lv_right_5_0= ruleMultiply )
            	    {
            	    // InternalRpgindividual.g:2090:5: (lv_right_5_0= ruleMultiply )
            	    // InternalRpgindividual.g:2091:6: lv_right_5_0= ruleMultiply
            	    {

            	    						newCompositeNode(grammarAccess.getSumAccess().getRightMultiplyParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
            	    lv_right_5_0=ruleMultiply();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSumRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"smitey.Rpgindividual.Multiply");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleMultiply"
    // InternalRpgindividual.g:2113:1: entryRuleMultiply returns [EObject current=null] : iv_ruleMultiply= ruleMultiply EOF ;
    public final EObject entryRuleMultiply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiply = null;


        try {
            // InternalRpgindividual.g:2113:49: (iv_ruleMultiply= ruleMultiply EOF )
            // InternalRpgindividual.g:2114:2: iv_ruleMultiply= ruleMultiply EOF
            {
             newCompositeNode(grammarAccess.getMultiplyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiply=ruleMultiply();

            state._fsp--;

             current =iv_ruleMultiply; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiply"


    // $ANTLR start "ruleMultiply"
    // InternalRpgindividual.g:2120:1: ruleMultiply returns [EObject current=null] : (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* ) ;
    public final EObject ruleMultiply() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_AtomicNumber_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:2126:2: ( (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* ) )
            // InternalRpgindividual.g:2127:2: (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* )
            {
            // InternalRpgindividual.g:2127:2: (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* )
            // InternalRpgindividual.g:2128:3: this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplyAccess().getAtomicNumberParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_AtomicNumber_0=ruleAtomicNumber();

            state._fsp--;


            			current = this_AtomicNumber_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRpgindividual.g:2136:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==37||LA30_0==49) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRpgindividual.g:2137:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) )
            	    {
            	    // InternalRpgindividual.g:2137:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==37) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==49) ) {
            	        alt29=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalRpgindividual.g:2138:5: (otherlv_1= '*' () )
            	            {
            	            // InternalRpgindividual.g:2138:5: (otherlv_1= '*' () )
            	            // InternalRpgindividual.g:2139:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,37,FOLLOW_29); 

            	            						newLeafNode(otherlv_1, grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalRpgindividual.g:2143:6: ()
            	            // InternalRpgindividual.g:2144:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRpgindividual.g:2152:5: (otherlv_3= '/' () )
            	            {
            	            // InternalRpgindividual.g:2152:5: (otherlv_3= '/' () )
            	            // InternalRpgindividual.g:2153:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,49,FOLLOW_29); 

            	            						newLeafNode(otherlv_3, grammarAccess.getMultiplyAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalRpgindividual.g:2157:6: ()
            	            // InternalRpgindividual.g:2158:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRpgindividual.g:2166:4: ( (lv_right_5_0= ruleAtomicNumber ) )
            	    // InternalRpgindividual.g:2167:5: (lv_right_5_0= ruleAtomicNumber )
            	    {
            	    // InternalRpgindividual.g:2167:5: (lv_right_5_0= ruleAtomicNumber )
            	    // InternalRpgindividual.g:2168:6: lv_right_5_0= ruleAtomicNumber
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplyAccess().getRightAtomicNumberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_45);
            	    lv_right_5_0=ruleAtomicNumber();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplyRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"smitey.Rpgindividual.AtomicNumber");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiply"


    // $ANTLR start "entryRuleAtomicNumber"
    // InternalRpgindividual.g:2190:1: entryRuleAtomicNumber returns [EObject current=null] : iv_ruleAtomicNumber= ruleAtomicNumber EOF ;
    public final EObject entryRuleAtomicNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicNumber = null;


        try {
            // InternalRpgindividual.g:2190:53: (iv_ruleAtomicNumber= ruleAtomicNumber EOF )
            // InternalRpgindividual.g:2191:2: iv_ruleAtomicNumber= ruleAtomicNumber EOF
            {
             newCompositeNode(grammarAccess.getAtomicNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicNumber=ruleAtomicNumber();

            state._fsp--;

             current =iv_ruleAtomicNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicNumber"


    // $ANTLR start "ruleAtomicNumber"
    // InternalRpgindividual.g:2197:1: ruleAtomicNumber returns [EObject current=null] : (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute ) ;
    public final EObject ruleAtomicNumber() throws RecognitionException {
        EObject current = null;

        EObject this_ActualNumbers_0 = null;

        EObject this_NameAttribute_1 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:2203:2: ( (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute ) )
            // InternalRpgindividual.g:2204:2: (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute )
            {
            // InternalRpgindividual.g:2204:2: (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=51 && LA31_0<=52)) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalRpgindividual.g:2205:3: this_ActualNumbers_0= ruleActualNumbers
                    {

                    			newCompositeNode(grammarAccess.getAtomicNumberAccess().getActualNumbersParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActualNumbers_0=ruleActualNumbers();

                    state._fsp--;


                    			current = this_ActualNumbers_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:2214:3: this_NameAttribute_1= ruleNameAttribute
                    {

                    			newCompositeNode(grammarAccess.getAtomicNumberAccess().getNameAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameAttribute_1=ruleNameAttribute();

                    state._fsp--;


                    			current = this_NameAttribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicNumber"


    // $ANTLR start "entryRuleActualNumbers"
    // InternalRpgindividual.g:2226:1: entryRuleActualNumbers returns [EObject current=null] : iv_ruleActualNumbers= ruleActualNumbers EOF ;
    public final EObject entryRuleActualNumbers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualNumbers = null;


        try {
            // InternalRpgindividual.g:2226:54: (iv_ruleActualNumbers= ruleActualNumbers EOF )
            // InternalRpgindividual.g:2227:2: iv_ruleActualNumbers= ruleActualNumbers EOF
            {
             newCompositeNode(grammarAccess.getActualNumbersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActualNumbers=ruleActualNumbers();

            state._fsp--;

             current =iv_ruleActualNumbers; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActualNumbers"


    // $ANTLR start "ruleActualNumbers"
    // InternalRpgindividual.g:2233:1: ruleActualNumbers returns [EObject current=null] : (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum ) ;
    public final EObject ruleActualNumbers() throws RecognitionException {
        EObject current = null;

        EObject this_FloatNum_0 = null;

        EObject this_IntNum_1 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:2239:2: ( (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum ) )
            // InternalRpgindividual.g:2240:2: (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum )
            {
            // InternalRpgindividual.g:2240:2: (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==50) ) {
                    alt32=1;
                }
                else if ( (LA32_1==EOF||LA32_1==RULE_ID||(LA32_1>=12 && LA32_1<=16)||LA32_1==18||(LA32_1>=24 && LA32_1<=25)||(LA32_1>=28 && LA32_1<=32)||(LA32_1>=36 && LA32_1<=38)||(LA32_1>=41 && LA32_1<=49)) ) {
                    alt32=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalRpgindividual.g:2241:3: this_FloatNum_0= ruleFloatNum
                    {

                    			newCompositeNode(grammarAccess.getActualNumbersAccess().getFloatNumParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatNum_0=ruleFloatNum();

                    state._fsp--;


                    			current = this_FloatNum_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:2250:3: this_IntNum_1= ruleIntNum
                    {

                    			newCompositeNode(grammarAccess.getActualNumbersAccess().getIntNumParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntNum_1=ruleIntNum();

                    state._fsp--;


                    			current = this_IntNum_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActualNumbers"


    // $ANTLR start "entryRuleNameAttribute"
    // InternalRpgindividual.g:2262:1: entryRuleNameAttribute returns [EObject current=null] : iv_ruleNameAttribute= ruleNameAttribute EOF ;
    public final EObject entryRuleNameAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameAttribute = null;


        try {
            // InternalRpgindividual.g:2262:54: (iv_ruleNameAttribute= ruleNameAttribute EOF )
            // InternalRpgindividual.g:2263:2: iv_ruleNameAttribute= ruleNameAttribute EOF
            {
             newCompositeNode(grammarAccess.getNameAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameAttribute=ruleNameAttribute();

            state._fsp--;

             current =iv_ruleNameAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameAttribute"


    // $ANTLR start "ruleNameAttribute"
    // InternalRpgindividual.g:2269:1: ruleNameAttribute returns [EObject current=null] : ( ( (lv_target_0_0= ruleTarget ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleNameAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_target_0_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:2275:2: ( ( ( (lv_target_0_0= ruleTarget ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRpgindividual.g:2276:2: ( ( (lv_target_0_0= ruleTarget ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRpgindividual.g:2276:2: ( ( (lv_target_0_0= ruleTarget ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalRpgindividual.g:2277:3: ( (lv_target_0_0= ruleTarget ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalRpgindividual.g:2277:3: ( (lv_target_0_0= ruleTarget ) )
            // InternalRpgindividual.g:2278:4: (lv_target_0_0= ruleTarget )
            {
            // InternalRpgindividual.g:2278:4: (lv_target_0_0= ruleTarget )
            // InternalRpgindividual.g:2279:5: lv_target_0_0= ruleTarget
            {

            					newCompositeNode(grammarAccess.getNameAttributeAccess().getTargetTargetParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_target_0_0=ruleTarget();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameAttributeRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_0_0,
            						"smitey.Rpgindividual.Target");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRpgindividual.g:2296:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgindividual.g:2297:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgindividual.g:2297:4: (otherlv_1= RULE_ID )
            // InternalRpgindividual.g:2298:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNameAttributeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getNameAttributeAccess().getAttributeAttributeCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameAttribute"


    // $ANTLR start "entryRuleIntNum"
    // InternalRpgindividual.g:2313:1: entryRuleIntNum returns [EObject current=null] : iv_ruleIntNum= ruleIntNum EOF ;
    public final EObject entryRuleIntNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntNum = null;


        try {
            // InternalRpgindividual.g:2313:47: (iv_ruleIntNum= ruleIntNum EOF )
            // InternalRpgindividual.g:2314:2: iv_ruleIntNum= ruleIntNum EOF
            {
             newCompositeNode(grammarAccess.getIntNumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntNum=ruleIntNum();

            state._fsp--;

             current =iv_ruleIntNum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntNum"


    // $ANTLR start "ruleIntNum"
    // InternalRpgindividual.g:2320:1: ruleIntNum returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntNum() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:2326:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalRpgindividual.g:2327:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalRpgindividual.g:2327:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalRpgindividual.g:2328:3: (lv_value_0_0= RULE_INT )
            {
            // InternalRpgindividual.g:2328:3: (lv_value_0_0= RULE_INT )
            // InternalRpgindividual.g:2329:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntNumAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntNumRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntNum"


    // $ANTLR start "entryRuleFloatNum"
    // InternalRpgindividual.g:2348:1: entryRuleFloatNum returns [EObject current=null] : iv_ruleFloatNum= ruleFloatNum EOF ;
    public final EObject entryRuleFloatNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatNum = null;


        try {
            // InternalRpgindividual.g:2348:49: (iv_ruleFloatNum= ruleFloatNum EOF )
            // InternalRpgindividual.g:2349:2: iv_ruleFloatNum= ruleFloatNum EOF
            {
             newCompositeNode(grammarAccess.getFloatNumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatNum=ruleFloatNum();

            state._fsp--;

             current =iv_ruleFloatNum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatNum"


    // $ANTLR start "ruleFloatNum"
    // InternalRpgindividual.g:2355:1: ruleFloatNum returns [EObject current=null] : ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFloatNum() throws RecognitionException {
        EObject current = null;

        Token lv_i_0_0=null;
        Token otherlv_1=null;
        Token lv_decimal_2_0=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:2361:2: ( ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) ) )
            // InternalRpgindividual.g:2362:2: ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )
            {
            // InternalRpgindividual.g:2362:2: ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )
            // InternalRpgindividual.g:2363:3: ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )
            {
            // InternalRpgindividual.g:2363:3: ( (lv_i_0_0= RULE_INT ) )
            // InternalRpgindividual.g:2364:4: (lv_i_0_0= RULE_INT )
            {
            // InternalRpgindividual.g:2364:4: (lv_i_0_0= RULE_INT )
            // InternalRpgindividual.g:2365:5: lv_i_0_0= RULE_INT
            {
            lv_i_0_0=(Token)match(input,RULE_INT,FOLLOW_46); 

            					newLeafNode(lv_i_0_0, grammarAccess.getFloatNumAccess().getIINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFloatNumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"i",
            						lv_i_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,50,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatNumAccess().getFullStopKeyword_1());
            		
            // InternalRpgindividual.g:2385:3: ( (lv_decimal_2_0= RULE_INT ) )
            // InternalRpgindividual.g:2386:4: (lv_decimal_2_0= RULE_INT )
            {
            // InternalRpgindividual.g:2386:4: (lv_decimal_2_0= RULE_INT )
            // InternalRpgindividual.g:2387:5: lv_decimal_2_0= RULE_INT
            {
            lv_decimal_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_decimal_2_0, grammarAccess.getFloatNumAccess().getDecimalINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFloatNumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"decimal",
            						lv_decimal_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatNum"


    // $ANTLR start "entryRuleTarget"
    // InternalRpgindividual.g:2407:1: entryRuleTarget returns [String current=null] : iv_ruleTarget= ruleTarget EOF ;
    public final String entryRuleTarget() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTarget = null;


        try {
            // InternalRpgindividual.g:2407:46: (iv_ruleTarget= ruleTarget EOF )
            // InternalRpgindividual.g:2408:2: iv_ruleTarget= ruleTarget EOF
            {
             newCompositeNode(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTarget=ruleTarget();

            state._fsp--;

             current =iv_ruleTarget.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // InternalRpgindividual.g:2414:1: ruleTarget returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'User' | kw= 'Enemy' ) ;
    public final AntlrDatatypeRuleToken ruleTarget() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:2420:2: ( (kw= 'User' | kw= 'Enemy' ) )
            // InternalRpgindividual.g:2421:2: (kw= 'User' | kw= 'Enemy' )
            {
            // InternalRpgindividual.g:2421:2: (kw= 'User' | kw= 'Enemy' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==51) ) {
                alt33=1;
            }
            else if ( (LA33_0==52) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalRpgindividual.g:2422:3: kw= 'User'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTargetAccess().getUserKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:2428:3: kw= 'Enemy'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTargetAccess().getEnemyKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleLegalType"
    // InternalRpgindividual.g:2437:1: entryRuleLegalType returns [String current=null] : iv_ruleLegalType= ruleLegalType EOF ;
    public final String entryRuleLegalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLegalType = null;


        try {
            // InternalRpgindividual.g:2437:49: (iv_ruleLegalType= ruleLegalType EOF )
            // InternalRpgindividual.g:2438:2: iv_ruleLegalType= ruleLegalType EOF
            {
             newCompositeNode(grammarAccess.getLegalTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLegalType=ruleLegalType();

            state._fsp--;

             current =iv_ruleLegalType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLegalType"


    // $ANTLR start "ruleLegalType"
    // InternalRpgindividual.g:2444:1: ruleLegalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Float' | kw= 'Integer' ) ;
    public final AntlrDatatypeRuleToken ruleLegalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:2450:2: ( (kw= 'Float' | kw= 'Integer' ) )
            // InternalRpgindividual.g:2451:2: (kw= 'Float' | kw= 'Integer' )
            {
            // InternalRpgindividual.g:2451:2: (kw= 'Float' | kw= 'Integer' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==53) ) {
                alt34=1;
            }
            else if ( (LA34_0==54) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalRpgindividual.g:2452:3: kw= 'Float'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLegalTypeAccess().getFloatKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:2458:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLegalTypeAccess().getIntegerKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLegalType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004181055002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0018000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0060000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0078000808000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0078000008000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001F80000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002002000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000000L});

}