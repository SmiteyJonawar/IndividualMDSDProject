package smitey.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import smitey.services.RpgindividualGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRpgindividualParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'+'", "'User'", "'Enemy'", "'Float'", "'Integer'", "'game'", "'effects'", "'effect'", "'attributes'", "'attribute'", "'location'", "'opponents'", "'relations'", "'type'", "'strong('", "'):'", "'weak('", "','", "'moves'", "'move'", "'is'", "'if'", "'then'", "'entities'", "'death'", "'when'", "'entity'", "'('", "')'", "'*'", "'teams'", "'team'", "'members'", "'OR'", "'AND'", "'<'", "'<='", "'=='", "'>='", "'>'", "'!='", "'/'", "'.'"
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

    	public void setGrammarAccess(RpgindividualGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSystemRPG"
    // InternalRpgindividual.g:53:1: entryRuleSystemRPG : ruleSystemRPG EOF ;
    public final void entryRuleSystemRPG() throws RecognitionException {
        try {
            // InternalRpgindividual.g:54:1: ( ruleSystemRPG EOF )
            // InternalRpgindividual.g:55:1: ruleSystemRPG EOF
            {
             before(grammarAccess.getSystemRPGRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemRPG();

            state._fsp--;

             after(grammarAccess.getSystemRPGRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystemRPG"


    // $ANTLR start "ruleSystemRPG"
    // InternalRpgindividual.g:62:1: ruleSystemRPG : ( ( rule__SystemRPG__Group__0 ) ) ;
    public final void ruleSystemRPG() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:66:2: ( ( ( rule__SystemRPG__Group__0 ) ) )
            // InternalRpgindividual.g:67:2: ( ( rule__SystemRPG__Group__0 ) )
            {
            // InternalRpgindividual.g:67:2: ( ( rule__SystemRPG__Group__0 ) )
            // InternalRpgindividual.g:68:3: ( rule__SystemRPG__Group__0 )
            {
             before(grammarAccess.getSystemRPGAccess().getGroup()); 
            // InternalRpgindividual.g:69:3: ( rule__SystemRPG__Group__0 )
            // InternalRpgindividual.g:69:4: rule__SystemRPG__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemRPG__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemRPGAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemRPG"


    // $ANTLR start "entryRuleDeclaration"
    // InternalRpgindividual.g:78:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalRpgindividual.g:79:1: ( ruleDeclaration EOF )
            // InternalRpgindividual.g:80:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalRpgindividual.g:87:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:91:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalRpgindividual.g:92:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalRpgindividual.g:92:2: ( ( rule__Declaration__Alternatives ) )
            // InternalRpgindividual.g:93:3: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalRpgindividual.g:94:3: ( rule__Declaration__Alternatives )
            // InternalRpgindividual.g:94:4: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEffects"
    // InternalRpgindividual.g:103:1: entryRuleEffects : ruleEffects EOF ;
    public final void entryRuleEffects() throws RecognitionException {
        try {
            // InternalRpgindividual.g:104:1: ( ruleEffects EOF )
            // InternalRpgindividual.g:105:1: ruleEffects EOF
            {
             before(grammarAccess.getEffectsRule()); 
            pushFollow(FOLLOW_1);
            ruleEffects();

            state._fsp--;

             after(grammarAccess.getEffectsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffects"


    // $ANTLR start "ruleEffects"
    // InternalRpgindividual.g:112:1: ruleEffects : ( ( rule__Effects__Group__0 ) ) ;
    public final void ruleEffects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:116:2: ( ( ( rule__Effects__Group__0 ) ) )
            // InternalRpgindividual.g:117:2: ( ( rule__Effects__Group__0 ) )
            {
            // InternalRpgindividual.g:117:2: ( ( rule__Effects__Group__0 ) )
            // InternalRpgindividual.g:118:3: ( rule__Effects__Group__0 )
            {
             before(grammarAccess.getEffectsAccess().getGroup()); 
            // InternalRpgindividual.g:119:3: ( rule__Effects__Group__0 )
            // InternalRpgindividual.g:119:4: rule__Effects__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Effects__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffects"


    // $ANTLR start "entryRuleEffect"
    // InternalRpgindividual.g:128:1: entryRuleEffect : ruleEffect EOF ;
    public final void entryRuleEffect() throws RecognitionException {
        try {
            // InternalRpgindividual.g:129:1: ( ruleEffect EOF )
            // InternalRpgindividual.g:130:1: ruleEffect EOF
            {
             before(grammarAccess.getEffectRule()); 
            pushFollow(FOLLOW_1);
            ruleEffect();

            state._fsp--;

             after(grammarAccess.getEffectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalRpgindividual.g:137:1: ruleEffect : ( ( rule__Effect__Group__0 ) ) ;
    public final void ruleEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:141:2: ( ( ( rule__Effect__Group__0 ) ) )
            // InternalRpgindividual.g:142:2: ( ( rule__Effect__Group__0 ) )
            {
            // InternalRpgindividual.g:142:2: ( ( rule__Effect__Group__0 ) )
            // InternalRpgindividual.g:143:3: ( rule__Effect__Group__0 )
            {
             before(grammarAccess.getEffectAccess().getGroup()); 
            // InternalRpgindividual.g:144:3: ( rule__Effect__Group__0 )
            // InternalRpgindividual.g:144:4: rule__Effect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Effect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleAttributes"
    // InternalRpgindividual.g:153:1: entryRuleAttributes : ruleAttributes EOF ;
    public final void entryRuleAttributes() throws RecognitionException {
        try {
            // InternalRpgindividual.g:154:1: ( ruleAttributes EOF )
            // InternalRpgindividual.g:155:1: ruleAttributes EOF
            {
             before(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getAttributesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // InternalRpgindividual.g:162:1: ruleAttributes : ( ( rule__Attributes__Group__0 ) ) ;
    public final void ruleAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:166:2: ( ( ( rule__Attributes__Group__0 ) ) )
            // InternalRpgindividual.g:167:2: ( ( rule__Attributes__Group__0 ) )
            {
            // InternalRpgindividual.g:167:2: ( ( rule__Attributes__Group__0 ) )
            // InternalRpgindividual.g:168:3: ( rule__Attributes__Group__0 )
            {
             before(grammarAccess.getAttributesAccess().getGroup()); 
            // InternalRpgindividual.g:169:3: ( rule__Attributes__Group__0 )
            // InternalRpgindividual.g:169:4: rule__Attributes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleAttribute"
    // InternalRpgindividual.g:178:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalRpgindividual.g:179:1: ( ruleAttribute EOF )
            // InternalRpgindividual.g:180:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalRpgindividual.g:187:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:191:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalRpgindividual.g:192:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalRpgindividual.g:192:2: ( ( rule__Attribute__Group__0 ) )
            // InternalRpgindividual.g:193:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalRpgindividual.g:194:3: ( rule__Attribute__Group__0 )
            // InternalRpgindividual.g:194:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleLocations"
    // InternalRpgindividual.g:203:1: entryRuleLocations : ruleLocations EOF ;
    public final void entryRuleLocations() throws RecognitionException {
        try {
            // InternalRpgindividual.g:204:1: ( ruleLocations EOF )
            // InternalRpgindividual.g:205:1: ruleLocations EOF
            {
             before(grammarAccess.getLocationsRule()); 
            pushFollow(FOLLOW_1);
            ruleLocations();

            state._fsp--;

             after(grammarAccess.getLocationsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocations"


    // $ANTLR start "ruleLocations"
    // InternalRpgindividual.g:212:1: ruleLocations : ( ( rule__Locations__Group__0 ) ) ;
    public final void ruleLocations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:216:2: ( ( ( rule__Locations__Group__0 ) ) )
            // InternalRpgindividual.g:217:2: ( ( rule__Locations__Group__0 ) )
            {
            // InternalRpgindividual.g:217:2: ( ( rule__Locations__Group__0 ) )
            // InternalRpgindividual.g:218:3: ( rule__Locations__Group__0 )
            {
             before(grammarAccess.getLocationsAccess().getGroup()); 
            // InternalRpgindividual.g:219:3: ( rule__Locations__Group__0 )
            // InternalRpgindividual.g:219:4: rule__Locations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Locations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocations"


    // $ANTLR start "entryRuleLoc"
    // InternalRpgindividual.g:228:1: entryRuleLoc : ruleLoc EOF ;
    public final void entryRuleLoc() throws RecognitionException {
        try {
            // InternalRpgindividual.g:229:1: ( ruleLoc EOF )
            // InternalRpgindividual.g:230:1: ruleLoc EOF
            {
             before(grammarAccess.getLocRule()); 
            pushFollow(FOLLOW_1);
            ruleLoc();

            state._fsp--;

             after(grammarAccess.getLocRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoc"


    // $ANTLR start "ruleLoc"
    // InternalRpgindividual.g:237:1: ruleLoc : ( ( rule__Loc__Group__0 ) ) ;
    public final void ruleLoc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:241:2: ( ( ( rule__Loc__Group__0 ) ) )
            // InternalRpgindividual.g:242:2: ( ( rule__Loc__Group__0 ) )
            {
            // InternalRpgindividual.g:242:2: ( ( rule__Loc__Group__0 ) )
            // InternalRpgindividual.g:243:3: ( rule__Loc__Group__0 )
            {
             before(grammarAccess.getLocAccess().getGroup()); 
            // InternalRpgindividual.g:244:3: ( rule__Loc__Group__0 )
            // InternalRpgindividual.g:244:4: rule__Loc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoc"


    // $ANTLR start "entryRuleRelations"
    // InternalRpgindividual.g:253:1: entryRuleRelations : ruleRelations EOF ;
    public final void entryRuleRelations() throws RecognitionException {
        try {
            // InternalRpgindividual.g:254:1: ( ruleRelations EOF )
            // InternalRpgindividual.g:255:1: ruleRelations EOF
            {
             before(grammarAccess.getRelationsRule()); 
            pushFollow(FOLLOW_1);
            ruleRelations();

            state._fsp--;

             after(grammarAccess.getRelationsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelations"


    // $ANTLR start "ruleRelations"
    // InternalRpgindividual.g:262:1: ruleRelations : ( ( rule__Relations__Group__0 ) ) ;
    public final void ruleRelations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:266:2: ( ( ( rule__Relations__Group__0 ) ) )
            // InternalRpgindividual.g:267:2: ( ( rule__Relations__Group__0 ) )
            {
            // InternalRpgindividual.g:267:2: ( ( rule__Relations__Group__0 ) )
            // InternalRpgindividual.g:268:3: ( rule__Relations__Group__0 )
            {
             before(grammarAccess.getRelationsAccess().getGroup()); 
            // InternalRpgindividual.g:269:3: ( rule__Relations__Group__0 )
            // InternalRpgindividual.g:269:4: rule__Relations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelations"


    // $ANTLR start "entryRuleType"
    // InternalRpgindividual.g:278:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalRpgindividual.g:279:1: ( ruleType EOF )
            // InternalRpgindividual.g:280:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalRpgindividual.g:287:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:291:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalRpgindividual.g:292:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalRpgindividual.g:292:2: ( ( rule__Type__Group__0 ) )
            // InternalRpgindividual.g:293:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalRpgindividual.g:294:3: ( rule__Type__Group__0 )
            // InternalRpgindividual.g:294:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeExpression"
    // InternalRpgindividual.g:303:1: entryRuleTypeExpression : ruleTypeExpression EOF ;
    public final void entryRuleTypeExpression() throws RecognitionException {
        try {
            // InternalRpgindividual.g:304:1: ( ruleTypeExpression EOF )
            // InternalRpgindividual.g:305:1: ruleTypeExpression EOF
            {
             before(grammarAccess.getTypeExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeExpression();

            state._fsp--;

             after(grammarAccess.getTypeExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeExpression"


    // $ANTLR start "ruleTypeExpression"
    // InternalRpgindividual.g:312:1: ruleTypeExpression : ( ( rule__TypeExpression__Group__0 ) ) ;
    public final void ruleTypeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:316:2: ( ( ( rule__TypeExpression__Group__0 ) ) )
            // InternalRpgindividual.g:317:2: ( ( rule__TypeExpression__Group__0 ) )
            {
            // InternalRpgindividual.g:317:2: ( ( rule__TypeExpression__Group__0 ) )
            // InternalRpgindividual.g:318:3: ( rule__TypeExpression__Group__0 )
            {
             before(grammarAccess.getTypeExpressionAccess().getGroup()); 
            // InternalRpgindividual.g:319:3: ( rule__TypeExpression__Group__0 )
            // InternalRpgindividual.g:319:4: rule__TypeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeExpression"


    // $ANTLR start "entryRuleMoves"
    // InternalRpgindividual.g:328:1: entryRuleMoves : ruleMoves EOF ;
    public final void entryRuleMoves() throws RecognitionException {
        try {
            // InternalRpgindividual.g:329:1: ( ruleMoves EOF )
            // InternalRpgindividual.g:330:1: ruleMoves EOF
            {
             before(grammarAccess.getMovesRule()); 
            pushFollow(FOLLOW_1);
            ruleMoves();

            state._fsp--;

             after(grammarAccess.getMovesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoves"


    // $ANTLR start "ruleMoves"
    // InternalRpgindividual.g:337:1: ruleMoves : ( ( rule__Moves__Group__0 ) ) ;
    public final void ruleMoves() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:341:2: ( ( ( rule__Moves__Group__0 ) ) )
            // InternalRpgindividual.g:342:2: ( ( rule__Moves__Group__0 ) )
            {
            // InternalRpgindividual.g:342:2: ( ( rule__Moves__Group__0 ) )
            // InternalRpgindividual.g:343:3: ( rule__Moves__Group__0 )
            {
             before(grammarAccess.getMovesAccess().getGroup()); 
            // InternalRpgindividual.g:344:3: ( rule__Moves__Group__0 )
            // InternalRpgindividual.g:344:4: rule__Moves__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Moves__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMovesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoves"


    // $ANTLR start "entryRuleMove"
    // InternalRpgindividual.g:353:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalRpgindividual.g:354:1: ( ruleMove EOF )
            // InternalRpgindividual.g:355:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalRpgindividual.g:362:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:366:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalRpgindividual.g:367:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalRpgindividual.g:367:2: ( ( rule__Move__Group__0 ) )
            // InternalRpgindividual.g:368:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalRpgindividual.g:369:3: ( rule__Move__Group__0 )
            // InternalRpgindividual.g:369:4: rule__Move__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleMEffect"
    // InternalRpgindividual.g:378:1: entryRuleMEffect : ruleMEffect EOF ;
    public final void entryRuleMEffect() throws RecognitionException {
        try {
            // InternalRpgindividual.g:379:1: ( ruleMEffect EOF )
            // InternalRpgindividual.g:380:1: ruleMEffect EOF
            {
             before(grammarAccess.getMEffectRule()); 
            pushFollow(FOLLOW_1);
            ruleMEffect();

            state._fsp--;

             after(grammarAccess.getMEffectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMEffect"


    // $ANTLR start "ruleMEffect"
    // InternalRpgindividual.g:387:1: ruleMEffect : ( ( rule__MEffect__Group__0 ) ) ;
    public final void ruleMEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:391:2: ( ( ( rule__MEffect__Group__0 ) ) )
            // InternalRpgindividual.g:392:2: ( ( rule__MEffect__Group__0 ) )
            {
            // InternalRpgindividual.g:392:2: ( ( rule__MEffect__Group__0 ) )
            // InternalRpgindividual.g:393:3: ( rule__MEffect__Group__0 )
            {
             before(grammarAccess.getMEffectAccess().getGroup()); 
            // InternalRpgindividual.g:394:3: ( rule__MEffect__Group__0 )
            // InternalRpgindividual.g:394:4: rule__MEffect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MEffect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMEffectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMEffect"


    // $ANTLR start "entryRuleEType"
    // InternalRpgindividual.g:403:1: entryRuleEType : ruleEType EOF ;
    public final void entryRuleEType() throws RecognitionException {
        try {
            // InternalRpgindividual.g:404:1: ( ruleEType EOF )
            // InternalRpgindividual.g:405:1: ruleEType EOF
            {
             before(grammarAccess.getETypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEType();

            state._fsp--;

             after(grammarAccess.getETypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEType"


    // $ANTLR start "ruleEType"
    // InternalRpgindividual.g:412:1: ruleEType : ( ( rule__EType__Group__0 ) ) ;
    public final void ruleEType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:416:2: ( ( ( rule__EType__Group__0 ) ) )
            // InternalRpgindividual.g:417:2: ( ( rule__EType__Group__0 ) )
            {
            // InternalRpgindividual.g:417:2: ( ( rule__EType__Group__0 ) )
            // InternalRpgindividual.g:418:3: ( rule__EType__Group__0 )
            {
             before(grammarAccess.getETypeAccess().getGroup()); 
            // InternalRpgindividual.g:419:3: ( rule__EType__Group__0 )
            // InternalRpgindividual.g:419:4: rule__EType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getETypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEType"


    // $ANTLR start "entryRuleAttributeValues"
    // InternalRpgindividual.g:428:1: entryRuleAttributeValues : ruleAttributeValues EOF ;
    public final void entryRuleAttributeValues() throws RecognitionException {
        try {
            // InternalRpgindividual.g:429:1: ( ruleAttributeValues EOF )
            // InternalRpgindividual.g:430:1: ruleAttributeValues EOF
            {
             before(grammarAccess.getAttributeValuesRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeValues();

            state._fsp--;

             after(grammarAccess.getAttributeValuesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeValues"


    // $ANTLR start "ruleAttributeValues"
    // InternalRpgindividual.g:437:1: ruleAttributeValues : ( ( rule__AttributeValues__Group__0 ) ) ;
    public final void ruleAttributeValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:441:2: ( ( ( rule__AttributeValues__Group__0 ) ) )
            // InternalRpgindividual.g:442:2: ( ( rule__AttributeValues__Group__0 ) )
            {
            // InternalRpgindividual.g:442:2: ( ( rule__AttributeValues__Group__0 ) )
            // InternalRpgindividual.g:443:3: ( rule__AttributeValues__Group__0 )
            {
             before(grammarAccess.getAttributeValuesAccess().getGroup()); 
            // InternalRpgindividual.g:444:3: ( rule__AttributeValues__Group__0 )
            // InternalRpgindividual.g:444:4: rule__AttributeValues__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeValues__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeValuesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeValues"


    // $ANTLR start "entryRuleAltAttribute"
    // InternalRpgindividual.g:453:1: entryRuleAltAttribute : ruleAltAttribute EOF ;
    public final void entryRuleAltAttribute() throws RecognitionException {
        try {
            // InternalRpgindividual.g:454:1: ( ruleAltAttribute EOF )
            // InternalRpgindividual.g:455:1: ruleAltAttribute EOF
            {
             before(grammarAccess.getAltAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAltAttribute();

            state._fsp--;

             after(grammarAccess.getAltAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAltAttribute"


    // $ANTLR start "ruleAltAttribute"
    // InternalRpgindividual.g:462:1: ruleAltAttribute : ( ( rule__AltAttribute__Group__0 ) ) ;
    public final void ruleAltAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:466:2: ( ( ( rule__AltAttribute__Group__0 ) ) )
            // InternalRpgindividual.g:467:2: ( ( rule__AltAttribute__Group__0 ) )
            {
            // InternalRpgindividual.g:467:2: ( ( rule__AltAttribute__Group__0 ) )
            // InternalRpgindividual.g:468:3: ( rule__AltAttribute__Group__0 )
            {
             before(grammarAccess.getAltAttributeAccess().getGroup()); 
            // InternalRpgindividual.g:469:3: ( rule__AltAttribute__Group__0 )
            // InternalRpgindividual.g:469:4: rule__AltAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AltAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAltAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAltAttribute"


    // $ANTLR start "entryRuleRule"
    // InternalRpgindividual.g:478:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalRpgindividual.g:479:1: ( ruleRule EOF )
            // InternalRpgindividual.g:480:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalRpgindividual.g:487:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:491:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalRpgindividual.g:492:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalRpgindividual.g:492:2: ( ( rule__Rule__Group__0 ) )
            // InternalRpgindividual.g:493:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalRpgindividual.g:494:3: ( rule__Rule__Group__0 )
            // InternalRpgindividual.g:494:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleEntities"
    // InternalRpgindividual.g:503:1: entryRuleEntities : ruleEntities EOF ;
    public final void entryRuleEntities() throws RecognitionException {
        try {
            // InternalRpgindividual.g:504:1: ( ruleEntities EOF )
            // InternalRpgindividual.g:505:1: ruleEntities EOF
            {
             before(grammarAccess.getEntitiesRule()); 
            pushFollow(FOLLOW_1);
            ruleEntities();

            state._fsp--;

             after(grammarAccess.getEntitiesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntities"


    // $ANTLR start "ruleEntities"
    // InternalRpgindividual.g:512:1: ruleEntities : ( ( rule__Entities__Group__0 ) ) ;
    public final void ruleEntities() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:516:2: ( ( ( rule__Entities__Group__0 ) ) )
            // InternalRpgindividual.g:517:2: ( ( rule__Entities__Group__0 ) )
            {
            // InternalRpgindividual.g:517:2: ( ( rule__Entities__Group__0 ) )
            // InternalRpgindividual.g:518:3: ( rule__Entities__Group__0 )
            {
             before(grammarAccess.getEntitiesAccess().getGroup()); 
            // InternalRpgindividual.g:519:3: ( rule__Entities__Group__0 )
            // InternalRpgindividual.g:519:4: rule__Entities__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entities__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntities"


    // $ANTLR start "entryRuleDeath"
    // InternalRpgindividual.g:528:1: entryRuleDeath : ruleDeath EOF ;
    public final void entryRuleDeath() throws RecognitionException {
        try {
            // InternalRpgindividual.g:529:1: ( ruleDeath EOF )
            // InternalRpgindividual.g:530:1: ruleDeath EOF
            {
             before(grammarAccess.getDeathRule()); 
            pushFollow(FOLLOW_1);
            ruleDeath();

            state._fsp--;

             after(grammarAccess.getDeathRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeath"


    // $ANTLR start "ruleDeath"
    // InternalRpgindividual.g:537:1: ruleDeath : ( ( rule__Death__Group__0 ) ) ;
    public final void ruleDeath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:541:2: ( ( ( rule__Death__Group__0 ) ) )
            // InternalRpgindividual.g:542:2: ( ( rule__Death__Group__0 ) )
            {
            // InternalRpgindividual.g:542:2: ( ( rule__Death__Group__0 ) )
            // InternalRpgindividual.g:543:3: ( rule__Death__Group__0 )
            {
             before(grammarAccess.getDeathAccess().getGroup()); 
            // InternalRpgindividual.g:544:3: ( rule__Death__Group__0 )
            // InternalRpgindividual.g:544:4: rule__Death__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Death__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeath"


    // $ANTLR start "entryRuleEntity"
    // InternalRpgindividual.g:553:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalRpgindividual.g:554:1: ( ruleEntity EOF )
            // InternalRpgindividual.g:555:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalRpgindividual.g:562:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:566:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalRpgindividual.g:567:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalRpgindividual.g:567:2: ( ( rule__Entity__Group__0 ) )
            // InternalRpgindividual.g:568:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalRpgindividual.g:569:3: ( rule__Entity__Group__0 )
            // InternalRpgindividual.g:569:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityMoves"
    // InternalRpgindividual.g:578:1: entryRuleEntityMoves : ruleEntityMoves EOF ;
    public final void entryRuleEntityMoves() throws RecognitionException {
        try {
            // InternalRpgindividual.g:579:1: ( ruleEntityMoves EOF )
            // InternalRpgindividual.g:580:1: ruleEntityMoves EOF
            {
             before(grammarAccess.getEntityMovesRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityMoves();

            state._fsp--;

             after(grammarAccess.getEntityMovesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityMoves"


    // $ANTLR start "ruleEntityMoves"
    // InternalRpgindividual.g:587:1: ruleEntityMoves : ( ( rule__EntityMoves__Group__0 ) ) ;
    public final void ruleEntityMoves() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:591:2: ( ( ( rule__EntityMoves__Group__0 ) ) )
            // InternalRpgindividual.g:592:2: ( ( rule__EntityMoves__Group__0 ) )
            {
            // InternalRpgindividual.g:592:2: ( ( rule__EntityMoves__Group__0 ) )
            // InternalRpgindividual.g:593:3: ( rule__EntityMoves__Group__0 )
            {
             before(grammarAccess.getEntityMovesAccess().getGroup()); 
            // InternalRpgindividual.g:594:3: ( rule__EntityMoves__Group__0 )
            // InternalRpgindividual.g:594:4: rule__EntityMoves__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoves__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityMovesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityMoves"


    // $ANTLR start "entryRuleEntityMoveModifier"
    // InternalRpgindividual.g:603:1: entryRuleEntityMoveModifier : ruleEntityMoveModifier EOF ;
    public final void entryRuleEntityMoveModifier() throws RecognitionException {
        try {
            // InternalRpgindividual.g:604:1: ( ruleEntityMoveModifier EOF )
            // InternalRpgindividual.g:605:1: ruleEntityMoveModifier EOF
            {
             before(grammarAccess.getEntityMoveModifierRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityMoveModifier();

            state._fsp--;

             after(grammarAccess.getEntityMoveModifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityMoveModifier"


    // $ANTLR start "ruleEntityMoveModifier"
    // InternalRpgindividual.g:612:1: ruleEntityMoveModifier : ( ( rule__EntityMoveModifier__Group__0 ) ) ;
    public final void ruleEntityMoveModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:616:2: ( ( ( rule__EntityMoveModifier__Group__0 ) ) )
            // InternalRpgindividual.g:617:2: ( ( rule__EntityMoveModifier__Group__0 ) )
            {
            // InternalRpgindividual.g:617:2: ( ( rule__EntityMoveModifier__Group__0 ) )
            // InternalRpgindividual.g:618:3: ( rule__EntityMoveModifier__Group__0 )
            {
             before(grammarAccess.getEntityMoveModifierAccess().getGroup()); 
            // InternalRpgindividual.g:619:3: ( rule__EntityMoveModifier__Group__0 )
            // InternalRpgindividual.g:619:4: rule__EntityMoveModifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoveModifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityMoveModifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityMoveModifier"


    // $ANTLR start "entryRuleEntityMoveMultiplier"
    // InternalRpgindividual.g:628:1: entryRuleEntityMoveMultiplier : ruleEntityMoveMultiplier EOF ;
    public final void entryRuleEntityMoveMultiplier() throws RecognitionException {
        try {
            // InternalRpgindividual.g:629:1: ( ruleEntityMoveMultiplier EOF )
            // InternalRpgindividual.g:630:1: ruleEntityMoveMultiplier EOF
            {
             before(grammarAccess.getEntityMoveMultiplierRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityMoveMultiplier();

            state._fsp--;

             after(grammarAccess.getEntityMoveMultiplierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityMoveMultiplier"


    // $ANTLR start "ruleEntityMoveMultiplier"
    // InternalRpgindividual.g:637:1: ruleEntityMoveMultiplier : ( ( rule__EntityMoveMultiplier__Group__0 ) ) ;
    public final void ruleEntityMoveMultiplier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:641:2: ( ( ( rule__EntityMoveMultiplier__Group__0 ) ) )
            // InternalRpgindividual.g:642:2: ( ( rule__EntityMoveMultiplier__Group__0 ) )
            {
            // InternalRpgindividual.g:642:2: ( ( rule__EntityMoveMultiplier__Group__0 ) )
            // InternalRpgindividual.g:643:3: ( rule__EntityMoveMultiplier__Group__0 )
            {
             before(grammarAccess.getEntityMoveMultiplierAccess().getGroup()); 
            // InternalRpgindividual.g:644:3: ( rule__EntityMoveMultiplier__Group__0 )
            // InternalRpgindividual.g:644:4: rule__EntityMoveMultiplier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoveMultiplier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityMoveMultiplierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityMoveMultiplier"


    // $ANTLR start "entryRuleTeams"
    // InternalRpgindividual.g:653:1: entryRuleTeams : ruleTeams EOF ;
    public final void entryRuleTeams() throws RecognitionException {
        try {
            // InternalRpgindividual.g:654:1: ( ruleTeams EOF )
            // InternalRpgindividual.g:655:1: ruleTeams EOF
            {
             before(grammarAccess.getTeamsRule()); 
            pushFollow(FOLLOW_1);
            ruleTeams();

            state._fsp--;

             after(grammarAccess.getTeamsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTeams"


    // $ANTLR start "ruleTeams"
    // InternalRpgindividual.g:662:1: ruleTeams : ( ( rule__Teams__Group__0 ) ) ;
    public final void ruleTeams() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:666:2: ( ( ( rule__Teams__Group__0 ) ) )
            // InternalRpgindividual.g:667:2: ( ( rule__Teams__Group__0 ) )
            {
            // InternalRpgindividual.g:667:2: ( ( rule__Teams__Group__0 ) )
            // InternalRpgindividual.g:668:3: ( rule__Teams__Group__0 )
            {
             before(grammarAccess.getTeamsAccess().getGroup()); 
            // InternalRpgindividual.g:669:3: ( rule__Teams__Group__0 )
            // InternalRpgindividual.g:669:4: rule__Teams__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Teams__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTeamsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTeams"


    // $ANTLR start "entryRuleTeam"
    // InternalRpgindividual.g:678:1: entryRuleTeam : ruleTeam EOF ;
    public final void entryRuleTeam() throws RecognitionException {
        try {
            // InternalRpgindividual.g:679:1: ( ruleTeam EOF )
            // InternalRpgindividual.g:680:1: ruleTeam EOF
            {
             before(grammarAccess.getTeamRule()); 
            pushFollow(FOLLOW_1);
            ruleTeam();

            state._fsp--;

             after(grammarAccess.getTeamRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTeam"


    // $ANTLR start "ruleTeam"
    // InternalRpgindividual.g:687:1: ruleTeam : ( ( rule__Team__Group__0 ) ) ;
    public final void ruleTeam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:691:2: ( ( ( rule__Team__Group__0 ) ) )
            // InternalRpgindividual.g:692:2: ( ( rule__Team__Group__0 ) )
            {
            // InternalRpgindividual.g:692:2: ( ( rule__Team__Group__0 ) )
            // InternalRpgindividual.g:693:3: ( rule__Team__Group__0 )
            {
             before(grammarAccess.getTeamAccess().getGroup()); 
            // InternalRpgindividual.g:694:3: ( rule__Team__Group__0 )
            // InternalRpgindividual.g:694:4: rule__Team__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Team__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRuleMembers"
    // InternalRpgindividual.g:703:1: entryRuleMembers : ruleMembers EOF ;
    public final void entryRuleMembers() throws RecognitionException {
        try {
            // InternalRpgindividual.g:704:1: ( ruleMembers EOF )
            // InternalRpgindividual.g:705:1: ruleMembers EOF
            {
             before(grammarAccess.getMembersRule()); 
            pushFollow(FOLLOW_1);
            ruleMembers();

            state._fsp--;

             after(grammarAccess.getMembersRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMembers"


    // $ANTLR start "ruleMembers"
    // InternalRpgindividual.g:712:1: ruleMembers : ( ( rule__Members__Group__0 ) ) ;
    public final void ruleMembers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:716:2: ( ( ( rule__Members__Group__0 ) ) )
            // InternalRpgindividual.g:717:2: ( ( rule__Members__Group__0 ) )
            {
            // InternalRpgindividual.g:717:2: ( ( rule__Members__Group__0 ) )
            // InternalRpgindividual.g:718:3: ( rule__Members__Group__0 )
            {
             before(grammarAccess.getMembersAccess().getGroup()); 
            // InternalRpgindividual.g:719:3: ( rule__Members__Group__0 )
            // InternalRpgindividual.g:719:4: rule__Members__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Members__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMembersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMembers"


    // $ANTLR start "entryRuleORcondition"
    // InternalRpgindividual.g:728:1: entryRuleORcondition : ruleORcondition EOF ;
    public final void entryRuleORcondition() throws RecognitionException {
        try {
            // InternalRpgindividual.g:729:1: ( ruleORcondition EOF )
            // InternalRpgindividual.g:730:1: ruleORcondition EOF
            {
             before(grammarAccess.getORconditionRule()); 
            pushFollow(FOLLOW_1);
            ruleORcondition();

            state._fsp--;

             after(grammarAccess.getORconditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleORcondition"


    // $ANTLR start "ruleORcondition"
    // InternalRpgindividual.g:737:1: ruleORcondition : ( ( rule__ORcondition__Group__0 ) ) ;
    public final void ruleORcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:741:2: ( ( ( rule__ORcondition__Group__0 ) ) )
            // InternalRpgindividual.g:742:2: ( ( rule__ORcondition__Group__0 ) )
            {
            // InternalRpgindividual.g:742:2: ( ( rule__ORcondition__Group__0 ) )
            // InternalRpgindividual.g:743:3: ( rule__ORcondition__Group__0 )
            {
             before(grammarAccess.getORconditionAccess().getGroup()); 
            // InternalRpgindividual.g:744:3: ( rule__ORcondition__Group__0 )
            // InternalRpgindividual.g:744:4: rule__ORcondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ORcondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getORconditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleORcondition"


    // $ANTLR start "entryRuleANDcondition"
    // InternalRpgindividual.g:753:1: entryRuleANDcondition : ruleANDcondition EOF ;
    public final void entryRuleANDcondition() throws RecognitionException {
        try {
            // InternalRpgindividual.g:754:1: ( ruleANDcondition EOF )
            // InternalRpgindividual.g:755:1: ruleANDcondition EOF
            {
             before(grammarAccess.getANDconditionRule()); 
            pushFollow(FOLLOW_1);
            ruleANDcondition();

            state._fsp--;

             after(grammarAccess.getANDconditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleANDcondition"


    // $ANTLR start "ruleANDcondition"
    // InternalRpgindividual.g:762:1: ruleANDcondition : ( ( rule__ANDcondition__Group__0 ) ) ;
    public final void ruleANDcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:766:2: ( ( ( rule__ANDcondition__Group__0 ) ) )
            // InternalRpgindividual.g:767:2: ( ( rule__ANDcondition__Group__0 ) )
            {
            // InternalRpgindividual.g:767:2: ( ( rule__ANDcondition__Group__0 ) )
            // InternalRpgindividual.g:768:3: ( rule__ANDcondition__Group__0 )
            {
             before(grammarAccess.getANDconditionAccess().getGroup()); 
            // InternalRpgindividual.g:769:3: ( rule__ANDcondition__Group__0 )
            // InternalRpgindividual.g:769:4: rule__ANDcondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ANDcondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getANDconditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleANDcondition"


    // $ANTLR start "entryRuleStatement"
    // InternalRpgindividual.g:778:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalRpgindividual.g:779:1: ( ruleStatement EOF )
            // InternalRpgindividual.g:780:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRpgindividual.g:787:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:791:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalRpgindividual.g:792:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalRpgindividual.g:792:2: ( ( rule__Statement__Alternatives ) )
            // InternalRpgindividual.g:793:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalRpgindividual.g:794:3: ( rule__Statement__Alternatives )
            // InternalRpgindividual.g:794:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleNumberComparing"
    // InternalRpgindividual.g:803:1: entryRuleNumberComparing : ruleNumberComparing EOF ;
    public final void entryRuleNumberComparing() throws RecognitionException {
        try {
            // InternalRpgindividual.g:804:1: ( ruleNumberComparing EOF )
            // InternalRpgindividual.g:805:1: ruleNumberComparing EOF
            {
             before(grammarAccess.getNumberComparingRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberComparing();

            state._fsp--;

             after(grammarAccess.getNumberComparingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberComparing"


    // $ANTLR start "ruleNumberComparing"
    // InternalRpgindividual.g:812:1: ruleNumberComparing : ( ( rule__NumberComparing__Group__0 ) ) ;
    public final void ruleNumberComparing() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:816:2: ( ( ( rule__NumberComparing__Group__0 ) ) )
            // InternalRpgindividual.g:817:2: ( ( rule__NumberComparing__Group__0 ) )
            {
            // InternalRpgindividual.g:817:2: ( ( rule__NumberComparing__Group__0 ) )
            // InternalRpgindividual.g:818:3: ( rule__NumberComparing__Group__0 )
            {
             before(grammarAccess.getNumberComparingAccess().getGroup()); 
            // InternalRpgindividual.g:819:3: ( rule__NumberComparing__Group__0 )
            // InternalRpgindividual.g:819:4: rule__NumberComparing__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberComparing__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberComparingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberComparing"


    // $ANTLR start "entryRuleComparator"
    // InternalRpgindividual.g:828:1: entryRuleComparator : ruleComparator EOF ;
    public final void entryRuleComparator() throws RecognitionException {
        try {
            // InternalRpgindividual.g:829:1: ( ruleComparator EOF )
            // InternalRpgindividual.g:830:1: ruleComparator EOF
            {
             before(grammarAccess.getComparatorRule()); 
            pushFollow(FOLLOW_1);
            ruleComparator();

            state._fsp--;

             after(grammarAccess.getComparatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparator"


    // $ANTLR start "ruleComparator"
    // InternalRpgindividual.g:837:1: ruleComparator : ( ( rule__Comparator__Alternatives ) ) ;
    public final void ruleComparator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:841:2: ( ( ( rule__Comparator__Alternatives ) ) )
            // InternalRpgindividual.g:842:2: ( ( rule__Comparator__Alternatives ) )
            {
            // InternalRpgindividual.g:842:2: ( ( rule__Comparator__Alternatives ) )
            // InternalRpgindividual.g:843:3: ( rule__Comparator__Alternatives )
            {
             before(grammarAccess.getComparatorAccess().getAlternatives()); 
            // InternalRpgindividual.g:844:3: ( rule__Comparator__Alternatives )
            // InternalRpgindividual.g:844:4: rule__Comparator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparator"


    // $ANTLR start "entryRuleSum"
    // InternalRpgindividual.g:853:1: entryRuleSum : ruleSum EOF ;
    public final void entryRuleSum() throws RecognitionException {
        try {
            // InternalRpgindividual.g:854:1: ( ruleSum EOF )
            // InternalRpgindividual.g:855:1: ruleSum EOF
            {
             before(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getSumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalRpgindividual.g:862:1: ruleSum : ( ( rule__Sum__Group__0 ) ) ;
    public final void ruleSum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:866:2: ( ( ( rule__Sum__Group__0 ) ) )
            // InternalRpgindividual.g:867:2: ( ( rule__Sum__Group__0 ) )
            {
            // InternalRpgindividual.g:867:2: ( ( rule__Sum__Group__0 ) )
            // InternalRpgindividual.g:868:3: ( rule__Sum__Group__0 )
            {
             before(grammarAccess.getSumAccess().getGroup()); 
            // InternalRpgindividual.g:869:3: ( rule__Sum__Group__0 )
            // InternalRpgindividual.g:869:4: rule__Sum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleMultiply"
    // InternalRpgindividual.g:878:1: entryRuleMultiply : ruleMultiply EOF ;
    public final void entryRuleMultiply() throws RecognitionException {
        try {
            // InternalRpgindividual.g:879:1: ( ruleMultiply EOF )
            // InternalRpgindividual.g:880:1: ruleMultiply EOF
            {
             before(grammarAccess.getMultiplyRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiply();

            state._fsp--;

             after(grammarAccess.getMultiplyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiply"


    // $ANTLR start "ruleMultiply"
    // InternalRpgindividual.g:887:1: ruleMultiply : ( ( rule__Multiply__Group__0 ) ) ;
    public final void ruleMultiply() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:891:2: ( ( ( rule__Multiply__Group__0 ) ) )
            // InternalRpgindividual.g:892:2: ( ( rule__Multiply__Group__0 ) )
            {
            // InternalRpgindividual.g:892:2: ( ( rule__Multiply__Group__0 ) )
            // InternalRpgindividual.g:893:3: ( rule__Multiply__Group__0 )
            {
             before(grammarAccess.getMultiplyAccess().getGroup()); 
            // InternalRpgindividual.g:894:3: ( rule__Multiply__Group__0 )
            // InternalRpgindividual.g:894:4: rule__Multiply__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiply"


    // $ANTLR start "entryRuleAtomicNumber"
    // InternalRpgindividual.g:903:1: entryRuleAtomicNumber : ruleAtomicNumber EOF ;
    public final void entryRuleAtomicNumber() throws RecognitionException {
        try {
            // InternalRpgindividual.g:904:1: ( ruleAtomicNumber EOF )
            // InternalRpgindividual.g:905:1: ruleAtomicNumber EOF
            {
             before(grammarAccess.getAtomicNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomicNumber();

            state._fsp--;

             after(grammarAccess.getAtomicNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomicNumber"


    // $ANTLR start "ruleAtomicNumber"
    // InternalRpgindividual.g:912:1: ruleAtomicNumber : ( ( rule__AtomicNumber__Alternatives ) ) ;
    public final void ruleAtomicNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:916:2: ( ( ( rule__AtomicNumber__Alternatives ) ) )
            // InternalRpgindividual.g:917:2: ( ( rule__AtomicNumber__Alternatives ) )
            {
            // InternalRpgindividual.g:917:2: ( ( rule__AtomicNumber__Alternatives ) )
            // InternalRpgindividual.g:918:3: ( rule__AtomicNumber__Alternatives )
            {
             before(grammarAccess.getAtomicNumberAccess().getAlternatives()); 
            // InternalRpgindividual.g:919:3: ( rule__AtomicNumber__Alternatives )
            // InternalRpgindividual.g:919:4: rule__AtomicNumber__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AtomicNumber__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicNumberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomicNumber"


    // $ANTLR start "entryRuleActualNumbers"
    // InternalRpgindividual.g:928:1: entryRuleActualNumbers : ruleActualNumbers EOF ;
    public final void entryRuleActualNumbers() throws RecognitionException {
        try {
            // InternalRpgindividual.g:929:1: ( ruleActualNumbers EOF )
            // InternalRpgindividual.g:930:1: ruleActualNumbers EOF
            {
             before(grammarAccess.getActualNumbersRule()); 
            pushFollow(FOLLOW_1);
            ruleActualNumbers();

            state._fsp--;

             after(grammarAccess.getActualNumbersRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActualNumbers"


    // $ANTLR start "ruleActualNumbers"
    // InternalRpgindividual.g:937:1: ruleActualNumbers : ( ( rule__ActualNumbers__Alternatives ) ) ;
    public final void ruleActualNumbers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:941:2: ( ( ( rule__ActualNumbers__Alternatives ) ) )
            // InternalRpgindividual.g:942:2: ( ( rule__ActualNumbers__Alternatives ) )
            {
            // InternalRpgindividual.g:942:2: ( ( rule__ActualNumbers__Alternatives ) )
            // InternalRpgindividual.g:943:3: ( rule__ActualNumbers__Alternatives )
            {
             before(grammarAccess.getActualNumbersAccess().getAlternatives()); 
            // InternalRpgindividual.g:944:3: ( rule__ActualNumbers__Alternatives )
            // InternalRpgindividual.g:944:4: rule__ActualNumbers__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActualNumbers__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActualNumbersAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActualNumbers"


    // $ANTLR start "entryRuleNameAttribute"
    // InternalRpgindividual.g:953:1: entryRuleNameAttribute : ruleNameAttribute EOF ;
    public final void entryRuleNameAttribute() throws RecognitionException {
        try {
            // InternalRpgindividual.g:954:1: ( ruleNameAttribute EOF )
            // InternalRpgindividual.g:955:1: ruleNameAttribute EOF
            {
             before(grammarAccess.getNameAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleNameAttribute();

            state._fsp--;

             after(grammarAccess.getNameAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNameAttribute"


    // $ANTLR start "ruleNameAttribute"
    // InternalRpgindividual.g:962:1: ruleNameAttribute : ( ( rule__NameAttribute__Group__0 ) ) ;
    public final void ruleNameAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:966:2: ( ( ( rule__NameAttribute__Group__0 ) ) )
            // InternalRpgindividual.g:967:2: ( ( rule__NameAttribute__Group__0 ) )
            {
            // InternalRpgindividual.g:967:2: ( ( rule__NameAttribute__Group__0 ) )
            // InternalRpgindividual.g:968:3: ( rule__NameAttribute__Group__0 )
            {
             before(grammarAccess.getNameAttributeAccess().getGroup()); 
            // InternalRpgindividual.g:969:3: ( rule__NameAttribute__Group__0 )
            // InternalRpgindividual.g:969:4: rule__NameAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NameAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNameAttribute"


    // $ANTLR start "entryRuleIntNum"
    // InternalRpgindividual.g:978:1: entryRuleIntNum : ruleIntNum EOF ;
    public final void entryRuleIntNum() throws RecognitionException {
        try {
            // InternalRpgindividual.g:979:1: ( ruleIntNum EOF )
            // InternalRpgindividual.g:980:1: ruleIntNum EOF
            {
             before(grammarAccess.getIntNumRule()); 
            pushFollow(FOLLOW_1);
            ruleIntNum();

            state._fsp--;

             after(grammarAccess.getIntNumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntNum"


    // $ANTLR start "ruleIntNum"
    // InternalRpgindividual.g:987:1: ruleIntNum : ( ( rule__IntNum__ValueAssignment ) ) ;
    public final void ruleIntNum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:991:2: ( ( ( rule__IntNum__ValueAssignment ) ) )
            // InternalRpgindividual.g:992:2: ( ( rule__IntNum__ValueAssignment ) )
            {
            // InternalRpgindividual.g:992:2: ( ( rule__IntNum__ValueAssignment ) )
            // InternalRpgindividual.g:993:3: ( rule__IntNum__ValueAssignment )
            {
             before(grammarAccess.getIntNumAccess().getValueAssignment()); 
            // InternalRpgindividual.g:994:3: ( rule__IntNum__ValueAssignment )
            // InternalRpgindividual.g:994:4: rule__IntNum__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntNum__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntNumAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntNum"


    // $ANTLR start "entryRuleFloatNum"
    // InternalRpgindividual.g:1003:1: entryRuleFloatNum : ruleFloatNum EOF ;
    public final void entryRuleFloatNum() throws RecognitionException {
        try {
            // InternalRpgindividual.g:1004:1: ( ruleFloatNum EOF )
            // InternalRpgindividual.g:1005:1: ruleFloatNum EOF
            {
             before(grammarAccess.getFloatNumRule()); 
            pushFollow(FOLLOW_1);
            ruleFloatNum();

            state._fsp--;

             after(grammarAccess.getFloatNumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloatNum"


    // $ANTLR start "ruleFloatNum"
    // InternalRpgindividual.g:1012:1: ruleFloatNum : ( ( rule__FloatNum__Group__0 ) ) ;
    public final void ruleFloatNum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1016:2: ( ( ( rule__FloatNum__Group__0 ) ) )
            // InternalRpgindividual.g:1017:2: ( ( rule__FloatNum__Group__0 ) )
            {
            // InternalRpgindividual.g:1017:2: ( ( rule__FloatNum__Group__0 ) )
            // InternalRpgindividual.g:1018:3: ( rule__FloatNum__Group__0 )
            {
             before(grammarAccess.getFloatNumAccess().getGroup()); 
            // InternalRpgindividual.g:1019:3: ( rule__FloatNum__Group__0 )
            // InternalRpgindividual.g:1019:4: rule__FloatNum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FloatNum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatNumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatNum"


    // $ANTLR start "entryRuleTarget"
    // InternalRpgindividual.g:1028:1: entryRuleTarget : ruleTarget EOF ;
    public final void entryRuleTarget() throws RecognitionException {
        try {
            // InternalRpgindividual.g:1029:1: ( ruleTarget EOF )
            // InternalRpgindividual.g:1030:1: ruleTarget EOF
            {
             before(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_1);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getTargetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // InternalRpgindividual.g:1037:1: ruleTarget : ( ( rule__Target__Alternatives ) ) ;
    public final void ruleTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1041:2: ( ( ( rule__Target__Alternatives ) ) )
            // InternalRpgindividual.g:1042:2: ( ( rule__Target__Alternatives ) )
            {
            // InternalRpgindividual.g:1042:2: ( ( rule__Target__Alternatives ) )
            // InternalRpgindividual.g:1043:3: ( rule__Target__Alternatives )
            {
             before(grammarAccess.getTargetAccess().getAlternatives()); 
            // InternalRpgindividual.g:1044:3: ( rule__Target__Alternatives )
            // InternalRpgindividual.g:1044:4: rule__Target__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Target__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleLegalType"
    // InternalRpgindividual.g:1053:1: entryRuleLegalType : ruleLegalType EOF ;
    public final void entryRuleLegalType() throws RecognitionException {
        try {
            // InternalRpgindividual.g:1054:1: ( ruleLegalType EOF )
            // InternalRpgindividual.g:1055:1: ruleLegalType EOF
            {
             before(grammarAccess.getLegalTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleLegalType();

            state._fsp--;

             after(grammarAccess.getLegalTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLegalType"


    // $ANTLR start "ruleLegalType"
    // InternalRpgindividual.g:1062:1: ruleLegalType : ( ( rule__LegalType__Alternatives ) ) ;
    public final void ruleLegalType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1066:2: ( ( ( rule__LegalType__Alternatives ) ) )
            // InternalRpgindividual.g:1067:2: ( ( rule__LegalType__Alternatives ) )
            {
            // InternalRpgindividual.g:1067:2: ( ( rule__LegalType__Alternatives ) )
            // InternalRpgindividual.g:1068:3: ( rule__LegalType__Alternatives )
            {
             before(grammarAccess.getLegalTypeAccess().getAlternatives()); 
            // InternalRpgindividual.g:1069:3: ( rule__LegalType__Alternatives )
            // InternalRpgindividual.g:1069:4: rule__LegalType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LegalType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLegalTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLegalType"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalRpgindividual.g:1077:1: rule__Declaration__Alternatives : ( ( ruleLocations ) | ( ruleRelations ) | ( ruleMoves ) | ( ruleEntities ) | ( ruleTeams ) | ( ruleDeath ) | ( ruleAttributes ) | ( ruleEffects ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1081:1: ( ( ruleLocations ) | ( ruleRelations ) | ( ruleMoves ) | ( ruleEntities ) | ( ruleTeams ) | ( ruleDeath ) | ( ruleAttributes ) | ( ruleEffects ) )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case 30:
                {
                alt1=3;
                }
                break;
            case 35:
                {
                alt1=4;
                }
                break;
            case 42:
                {
                alt1=5;
                }
                break;
            case 36:
                {
                alt1=6;
                }
                break;
            case 20:
                {
                alt1=7;
                }
                break;
            case 18:
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRpgindividual.g:1082:2: ( ruleLocations )
                    {
                    // InternalRpgindividual.g:1082:2: ( ruleLocations )
                    // InternalRpgindividual.g:1083:3: ruleLocations
                    {
                     before(grammarAccess.getDeclarationAccess().getLocationsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLocations();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getLocationsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1088:2: ( ruleRelations )
                    {
                    // InternalRpgindividual.g:1088:2: ( ruleRelations )
                    // InternalRpgindividual.g:1089:3: ruleRelations
                    {
                     before(grammarAccess.getDeclarationAccess().getRelationsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRelations();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getRelationsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRpgindividual.g:1094:2: ( ruleMoves )
                    {
                    // InternalRpgindividual.g:1094:2: ( ruleMoves )
                    // InternalRpgindividual.g:1095:3: ruleMoves
                    {
                     before(grammarAccess.getDeclarationAccess().getMovesParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMoves();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getMovesParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRpgindividual.g:1100:2: ( ruleEntities )
                    {
                    // InternalRpgindividual.g:1100:2: ( ruleEntities )
                    // InternalRpgindividual.g:1101:3: ruleEntities
                    {
                     before(grammarAccess.getDeclarationAccess().getEntitiesParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEntities();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getEntitiesParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRpgindividual.g:1106:2: ( ruleTeams )
                    {
                    // InternalRpgindividual.g:1106:2: ( ruleTeams )
                    // InternalRpgindividual.g:1107:3: ruleTeams
                    {
                     before(grammarAccess.getDeclarationAccess().getTeamsParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleTeams();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getTeamsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRpgindividual.g:1112:2: ( ruleDeath )
                    {
                    // InternalRpgindividual.g:1112:2: ( ruleDeath )
                    // InternalRpgindividual.g:1113:3: ruleDeath
                    {
                     before(grammarAccess.getDeclarationAccess().getDeathParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDeath();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getDeathParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRpgindividual.g:1118:2: ( ruleAttributes )
                    {
                    // InternalRpgindividual.g:1118:2: ( ruleAttributes )
                    // InternalRpgindividual.g:1119:3: ruleAttributes
                    {
                     before(grammarAccess.getDeclarationAccess().getAttributesParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributes();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getAttributesParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRpgindividual.g:1124:2: ( ruleEffects )
                    {
                    // InternalRpgindividual.g:1124:2: ( ruleEffects )
                    // InternalRpgindividual.g:1125:3: ruleEffects
                    {
                     before(grammarAccess.getDeclarationAccess().getEffectsParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleEffects();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getEffectsParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__AttributeValues__Alternatives_1"
    // InternalRpgindividual.g:1134:1: rule__AttributeValues__Alternatives_1 : ( ( ( rule__AttributeValues__LTypesAssignment_1_0 ) ) | ( ( rule__AttributeValues__AnAssignment_1_1 ) ) );
    public final void rule__AttributeValues__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1138:1: ( ( ( rule__AttributeValues__LTypesAssignment_1_0 ) ) | ( ( rule__AttributeValues__AnAssignment_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=15 && LA2_0<=16)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRpgindividual.g:1139:2: ( ( rule__AttributeValues__LTypesAssignment_1_0 ) )
                    {
                    // InternalRpgindividual.g:1139:2: ( ( rule__AttributeValues__LTypesAssignment_1_0 ) )
                    // InternalRpgindividual.g:1140:3: ( rule__AttributeValues__LTypesAssignment_1_0 )
                    {
                     before(grammarAccess.getAttributeValuesAccess().getLTypesAssignment_1_0()); 
                    // InternalRpgindividual.g:1141:3: ( rule__AttributeValues__LTypesAssignment_1_0 )
                    // InternalRpgindividual.g:1141:4: rule__AttributeValues__LTypesAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeValues__LTypesAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValuesAccess().getLTypesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1145:2: ( ( rule__AttributeValues__AnAssignment_1_1 ) )
                    {
                    // InternalRpgindividual.g:1145:2: ( ( rule__AttributeValues__AnAssignment_1_1 ) )
                    // InternalRpgindividual.g:1146:3: ( rule__AttributeValues__AnAssignment_1_1 )
                    {
                     before(grammarAccess.getAttributeValuesAccess().getAnAssignment_1_1()); 
                    // InternalRpgindividual.g:1147:3: ( rule__AttributeValues__AnAssignment_1_1 )
                    // InternalRpgindividual.g:1147:4: rule__AttributeValues__AnAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeValues__AnAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValuesAccess().getAnAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValues__Alternatives_1"


    // $ANTLR start "rule__Rule__ChangeAlternatives_4_0"
    // InternalRpgindividual.g:1155:1: rule__Rule__ChangeAlternatives_4_0 : ( ( '-' ) | ( '+' ) );
    public final void rule__Rule__ChangeAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1159:1: ( ( '-' ) | ( '+' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRpgindividual.g:1160:2: ( '-' )
                    {
                    // InternalRpgindividual.g:1160:2: ( '-' )
                    // InternalRpgindividual.g:1161:3: '-'
                    {
                     before(grammarAccess.getRuleAccess().getChangeHyphenMinusKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getChangeHyphenMinusKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1166:2: ( '+' )
                    {
                    // InternalRpgindividual.g:1166:2: ( '+' )
                    // InternalRpgindividual.g:1167:3: '+'
                    {
                     before(grammarAccess.getRuleAccess().getChangePlusSignKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getChangePlusSignKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ChangeAlternatives_4_0"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalRpgindividual.g:1176:1: rule__Statement__Alternatives : ( ( ruleNumberComparing ) | ( ( rule__Statement__Group_1__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1180:1: ( ( ruleNumberComparing ) | ( ( rule__Statement__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||(LA4_0>=13 && LA4_0<=14)) ) {
                alt4=1;
            }
            else if ( (LA4_0==39) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRpgindividual.g:1181:2: ( ruleNumberComparing )
                    {
                    // InternalRpgindividual.g:1181:2: ( ruleNumberComparing )
                    // InternalRpgindividual.g:1182:3: ruleNumberComparing
                    {
                     before(grammarAccess.getStatementAccess().getNumberComparingParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberComparing();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getNumberComparingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1187:2: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // InternalRpgindividual.g:1187:2: ( ( rule__Statement__Group_1__0 ) )
                    // InternalRpgindividual.g:1188:3: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // InternalRpgindividual.g:1189:3: ( rule__Statement__Group_1__0 )
                    // InternalRpgindividual.g:1189:4: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Comparator__Alternatives"
    // InternalRpgindividual.g:1197:1: rule__Comparator__Alternatives : ( ( ( rule__Comparator__Group_0__0 ) ) | ( ( rule__Comparator__Group_1__0 ) ) | ( ( rule__Comparator__Group_2__0 ) ) | ( ( rule__Comparator__Group_3__0 ) ) | ( ( rule__Comparator__Group_4__0 ) ) | ( ( rule__Comparator__Group_5__0 ) ) );
    public final void rule__Comparator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1201:1: ( ( ( rule__Comparator__Group_0__0 ) ) | ( ( rule__Comparator__Group_1__0 ) ) | ( ( rule__Comparator__Group_2__0 ) ) | ( ( rule__Comparator__Group_3__0 ) ) | ( ( rule__Comparator__Group_4__0 ) ) | ( ( rule__Comparator__Group_5__0 ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt5=1;
                }
                break;
            case 48:
                {
                alt5=2;
                }
                break;
            case 49:
                {
                alt5=3;
                }
                break;
            case 50:
                {
                alt5=4;
                }
                break;
            case 51:
                {
                alt5=5;
                }
                break;
            case 52:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRpgindividual.g:1202:2: ( ( rule__Comparator__Group_0__0 ) )
                    {
                    // InternalRpgindividual.g:1202:2: ( ( rule__Comparator__Group_0__0 ) )
                    // InternalRpgindividual.g:1203:3: ( rule__Comparator__Group_0__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_0()); 
                    // InternalRpgindividual.g:1204:3: ( rule__Comparator__Group_0__0 )
                    // InternalRpgindividual.g:1204:4: rule__Comparator__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparator__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparatorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1208:2: ( ( rule__Comparator__Group_1__0 ) )
                    {
                    // InternalRpgindividual.g:1208:2: ( ( rule__Comparator__Group_1__0 ) )
                    // InternalRpgindividual.g:1209:3: ( rule__Comparator__Group_1__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_1()); 
                    // InternalRpgindividual.g:1210:3: ( rule__Comparator__Group_1__0 )
                    // InternalRpgindividual.g:1210:4: rule__Comparator__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparator__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparatorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRpgindividual.g:1214:2: ( ( rule__Comparator__Group_2__0 ) )
                    {
                    // InternalRpgindividual.g:1214:2: ( ( rule__Comparator__Group_2__0 ) )
                    // InternalRpgindividual.g:1215:3: ( rule__Comparator__Group_2__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_2()); 
                    // InternalRpgindividual.g:1216:3: ( rule__Comparator__Group_2__0 )
                    // InternalRpgindividual.g:1216:4: rule__Comparator__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparator__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparatorAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRpgindividual.g:1220:2: ( ( rule__Comparator__Group_3__0 ) )
                    {
                    // InternalRpgindividual.g:1220:2: ( ( rule__Comparator__Group_3__0 ) )
                    // InternalRpgindividual.g:1221:3: ( rule__Comparator__Group_3__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_3()); 
                    // InternalRpgindividual.g:1222:3: ( rule__Comparator__Group_3__0 )
                    // InternalRpgindividual.g:1222:4: rule__Comparator__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparator__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparatorAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRpgindividual.g:1226:2: ( ( rule__Comparator__Group_4__0 ) )
                    {
                    // InternalRpgindividual.g:1226:2: ( ( rule__Comparator__Group_4__0 ) )
                    // InternalRpgindividual.g:1227:3: ( rule__Comparator__Group_4__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_4()); 
                    // InternalRpgindividual.g:1228:3: ( rule__Comparator__Group_4__0 )
                    // InternalRpgindividual.g:1228:4: rule__Comparator__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparator__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparatorAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRpgindividual.g:1232:2: ( ( rule__Comparator__Group_5__0 ) )
                    {
                    // InternalRpgindividual.g:1232:2: ( ( rule__Comparator__Group_5__0 ) )
                    // InternalRpgindividual.g:1233:3: ( rule__Comparator__Group_5__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_5()); 
                    // InternalRpgindividual.g:1234:3: ( rule__Comparator__Group_5__0 )
                    // InternalRpgindividual.g:1234:4: rule__Comparator__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparator__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparatorAccess().getGroup_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Alternatives"


    // $ANTLR start "rule__Sum__Alternatives_1_0"
    // InternalRpgindividual.g:1242:1: rule__Sum__Alternatives_1_0 : ( ( ( rule__Sum__Group_1_0_0__0 ) ) | ( ( rule__Sum__Group_1_0_1__0 ) ) );
    public final void rule__Sum__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1246:1: ( ( ( rule__Sum__Group_1_0_0__0 ) ) | ( ( rule__Sum__Group_1_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==11) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRpgindividual.g:1247:2: ( ( rule__Sum__Group_1_0_0__0 ) )
                    {
                    // InternalRpgindividual.g:1247:2: ( ( rule__Sum__Group_1_0_0__0 ) )
                    // InternalRpgindividual.g:1248:3: ( rule__Sum__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getSumAccess().getGroup_1_0_0()); 
                    // InternalRpgindividual.g:1249:3: ( rule__Sum__Group_1_0_0__0 )
                    // InternalRpgindividual.g:1249:4: rule__Sum__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sum__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSumAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1253:2: ( ( rule__Sum__Group_1_0_1__0 ) )
                    {
                    // InternalRpgindividual.g:1253:2: ( ( rule__Sum__Group_1_0_1__0 ) )
                    // InternalRpgindividual.g:1254:3: ( rule__Sum__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getSumAccess().getGroup_1_0_1()); 
                    // InternalRpgindividual.g:1255:3: ( rule__Sum__Group_1_0_1__0 )
                    // InternalRpgindividual.g:1255:4: rule__Sum__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sum__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSumAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Alternatives_1_0"


    // $ANTLR start "rule__Multiply__Alternatives_1_0"
    // InternalRpgindividual.g:1263:1: rule__Multiply__Alternatives_1_0 : ( ( ( rule__Multiply__Group_1_0_0__0 ) ) | ( ( rule__Multiply__Group_1_0_1__0 ) ) );
    public final void rule__Multiply__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1267:1: ( ( ( rule__Multiply__Group_1_0_0__0 ) ) | ( ( rule__Multiply__Group_1_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==41) ) {
                alt7=1;
            }
            else if ( (LA7_0==53) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRpgindividual.g:1268:2: ( ( rule__Multiply__Group_1_0_0__0 ) )
                    {
                    // InternalRpgindividual.g:1268:2: ( ( rule__Multiply__Group_1_0_0__0 ) )
                    // InternalRpgindividual.g:1269:3: ( rule__Multiply__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplyAccess().getGroup_1_0_0()); 
                    // InternalRpgindividual.g:1270:3: ( rule__Multiply__Group_1_0_0__0 )
                    // InternalRpgindividual.g:1270:4: rule__Multiply__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiply__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplyAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1274:2: ( ( rule__Multiply__Group_1_0_1__0 ) )
                    {
                    // InternalRpgindividual.g:1274:2: ( ( rule__Multiply__Group_1_0_1__0 ) )
                    // InternalRpgindividual.g:1275:3: ( rule__Multiply__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplyAccess().getGroup_1_0_1()); 
                    // InternalRpgindividual.g:1276:3: ( rule__Multiply__Group_1_0_1__0 )
                    // InternalRpgindividual.g:1276:4: rule__Multiply__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiply__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplyAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Alternatives_1_0"


    // $ANTLR start "rule__AtomicNumber__Alternatives"
    // InternalRpgindividual.g:1284:1: rule__AtomicNumber__Alternatives : ( ( ruleActualNumbers ) | ( ruleNameAttribute ) );
    public final void rule__AtomicNumber__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1288:1: ( ( ruleActualNumbers ) | ( ruleNameAttribute ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=13 && LA8_0<=14)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRpgindividual.g:1289:2: ( ruleActualNumbers )
                    {
                    // InternalRpgindividual.g:1289:2: ( ruleActualNumbers )
                    // InternalRpgindividual.g:1290:3: ruleActualNumbers
                    {
                     before(grammarAccess.getAtomicNumberAccess().getActualNumbersParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActualNumbers();

                    state._fsp--;

                     after(grammarAccess.getAtomicNumberAccess().getActualNumbersParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1295:2: ( ruleNameAttribute )
                    {
                    // InternalRpgindividual.g:1295:2: ( ruleNameAttribute )
                    // InternalRpgindividual.g:1296:3: ruleNameAttribute
                    {
                     before(grammarAccess.getAtomicNumberAccess().getNameAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNameAttribute();

                    state._fsp--;

                     after(grammarAccess.getAtomicNumberAccess().getNameAttributeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicNumber__Alternatives"


    // $ANTLR start "rule__ActualNumbers__Alternatives"
    // InternalRpgindividual.g:1305:1: rule__ActualNumbers__Alternatives : ( ( ruleFloatNum ) | ( ruleIntNum ) );
    public final void rule__ActualNumbers__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1309:1: ( ( ruleFloatNum ) | ( ruleIntNum ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||LA9_1==RULE_ID||(LA9_1>=11 && LA9_1<=12)||(LA9_1>=18 && LA9_1<=22)||LA9_1==24||(LA9_1>=30 && LA9_1<=31)||(LA9_1>=34 && LA9_1<=36)||(LA9_1>=40 && LA9_1<=42)||(LA9_1>=45 && LA9_1<=53)) ) {
                    alt9=2;
                }
                else if ( (LA9_1==54) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRpgindividual.g:1310:2: ( ruleFloatNum )
                    {
                    // InternalRpgindividual.g:1310:2: ( ruleFloatNum )
                    // InternalRpgindividual.g:1311:3: ruleFloatNum
                    {
                     before(grammarAccess.getActualNumbersAccess().getFloatNumParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFloatNum();

                    state._fsp--;

                     after(grammarAccess.getActualNumbersAccess().getFloatNumParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1316:2: ( ruleIntNum )
                    {
                    // InternalRpgindividual.g:1316:2: ( ruleIntNum )
                    // InternalRpgindividual.g:1317:3: ruleIntNum
                    {
                     before(grammarAccess.getActualNumbersAccess().getIntNumParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntNum();

                    state._fsp--;

                     after(grammarAccess.getActualNumbersAccess().getIntNumParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualNumbers__Alternatives"


    // $ANTLR start "rule__Target__Alternatives"
    // InternalRpgindividual.g:1326:1: rule__Target__Alternatives : ( ( 'User' ) | ( 'Enemy' ) );
    public final void rule__Target__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1330:1: ( ( 'User' ) | ( 'Enemy' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            else if ( (LA10_0==14) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRpgindividual.g:1331:2: ( 'User' )
                    {
                    // InternalRpgindividual.g:1331:2: ( 'User' )
                    // InternalRpgindividual.g:1332:3: 'User'
                    {
                     before(grammarAccess.getTargetAccess().getUserKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTargetAccess().getUserKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1337:2: ( 'Enemy' )
                    {
                    // InternalRpgindividual.g:1337:2: ( 'Enemy' )
                    // InternalRpgindividual.g:1338:3: 'Enemy'
                    {
                     before(grammarAccess.getTargetAccess().getEnemyKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTargetAccess().getEnemyKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Alternatives"


    // $ANTLR start "rule__LegalType__Alternatives"
    // InternalRpgindividual.g:1347:1: rule__LegalType__Alternatives : ( ( 'Float' ) | ( 'Integer' ) );
    public final void rule__LegalType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1351:1: ( ( 'Float' ) | ( 'Integer' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            else if ( (LA11_0==16) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRpgindividual.g:1352:2: ( 'Float' )
                    {
                    // InternalRpgindividual.g:1352:2: ( 'Float' )
                    // InternalRpgindividual.g:1353:3: 'Float'
                    {
                     before(grammarAccess.getLegalTypeAccess().getFloatKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getLegalTypeAccess().getFloatKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1358:2: ( 'Integer' )
                    {
                    // InternalRpgindividual.g:1358:2: ( 'Integer' )
                    // InternalRpgindividual.g:1359:3: 'Integer'
                    {
                     before(grammarAccess.getLegalTypeAccess().getIntegerKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getLegalTypeAccess().getIntegerKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LegalType__Alternatives"


    // $ANTLR start "rule__SystemRPG__Group__0"
    // InternalRpgindividual.g:1368:1: rule__SystemRPG__Group__0 : rule__SystemRPG__Group__0__Impl rule__SystemRPG__Group__1 ;
    public final void rule__SystemRPG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1372:1: ( rule__SystemRPG__Group__0__Impl rule__SystemRPG__Group__1 )
            // InternalRpgindividual.g:1373:2: rule__SystemRPG__Group__0__Impl rule__SystemRPG__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SystemRPG__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemRPG__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRPG__Group__0"


    // $ANTLR start "rule__SystemRPG__Group__0__Impl"
    // InternalRpgindividual.g:1380:1: rule__SystemRPG__Group__0__Impl : ( 'game' ) ;
    public final void rule__SystemRPG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1384:1: ( ( 'game' ) )
            // InternalRpgindividual.g:1385:1: ( 'game' )
            {
            // InternalRpgindividual.g:1385:1: ( 'game' )
            // InternalRpgindividual.g:1386:2: 'game'
            {
             before(grammarAccess.getSystemRPGAccess().getGameKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSystemRPGAccess().getGameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRPG__Group__0__Impl"


    // $ANTLR start "rule__SystemRPG__Group__1"
    // InternalRpgindividual.g:1395:1: rule__SystemRPG__Group__1 : rule__SystemRPG__Group__1__Impl rule__SystemRPG__Group__2 ;
    public final void rule__SystemRPG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1399:1: ( rule__SystemRPG__Group__1__Impl rule__SystemRPG__Group__2 )
            // InternalRpgindividual.g:1400:2: rule__SystemRPG__Group__1__Impl rule__SystemRPG__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SystemRPG__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemRPG__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRPG__Group__1"


    // $ANTLR start "rule__SystemRPG__Group__1__Impl"
    // InternalRpgindividual.g:1407:1: rule__SystemRPG__Group__1__Impl : ( ( rule__SystemRPG__NameAssignment_1 ) ) ;
    public final void rule__SystemRPG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1411:1: ( ( ( rule__SystemRPG__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:1412:1: ( ( rule__SystemRPG__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:1412:1: ( ( rule__SystemRPG__NameAssignment_1 ) )
            // InternalRpgindividual.g:1413:2: ( rule__SystemRPG__NameAssignment_1 )
            {
             before(grammarAccess.getSystemRPGAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:1414:2: ( rule__SystemRPG__NameAssignment_1 )
            // InternalRpgindividual.g:1414:3: rule__SystemRPG__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemRPG__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemRPGAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRPG__Group__1__Impl"


    // $ANTLR start "rule__SystemRPG__Group__2"
    // InternalRpgindividual.g:1422:1: rule__SystemRPG__Group__2 : rule__SystemRPG__Group__2__Impl ;
    public final void rule__SystemRPG__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1426:1: ( rule__SystemRPG__Group__2__Impl )
            // InternalRpgindividual.g:1427:2: rule__SystemRPG__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemRPG__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRPG__Group__2"


    // $ANTLR start "rule__SystemRPG__Group__2__Impl"
    // InternalRpgindividual.g:1433:1: rule__SystemRPG__Group__2__Impl : ( ( rule__SystemRPG__DeclarationsAssignment_2 )* ) ;
    public final void rule__SystemRPG__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1437:1: ( ( ( rule__SystemRPG__DeclarationsAssignment_2 )* ) )
            // InternalRpgindividual.g:1438:1: ( ( rule__SystemRPG__DeclarationsAssignment_2 )* )
            {
            // InternalRpgindividual.g:1438:1: ( ( rule__SystemRPG__DeclarationsAssignment_2 )* )
            // InternalRpgindividual.g:1439:2: ( rule__SystemRPG__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getSystemRPGAccess().getDeclarationsAssignment_2()); 
            // InternalRpgindividual.g:1440:2: ( rule__SystemRPG__DeclarationsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18||LA12_0==20||LA12_0==22||LA12_0==24||LA12_0==30||(LA12_0>=35 && LA12_0<=36)||LA12_0==42) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRpgindividual.g:1440:3: rule__SystemRPG__DeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__SystemRPG__DeclarationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSystemRPGAccess().getDeclarationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRPG__Group__2__Impl"


    // $ANTLR start "rule__Effects__Group__0"
    // InternalRpgindividual.g:1449:1: rule__Effects__Group__0 : rule__Effects__Group__0__Impl rule__Effects__Group__1 ;
    public final void rule__Effects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1453:1: ( rule__Effects__Group__0__Impl rule__Effects__Group__1 )
            // InternalRpgindividual.g:1454:2: rule__Effects__Group__0__Impl rule__Effects__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Effects__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effects__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effects__Group__0"


    // $ANTLR start "rule__Effects__Group__0__Impl"
    // InternalRpgindividual.g:1461:1: rule__Effects__Group__0__Impl : ( 'effects' ) ;
    public final void rule__Effects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1465:1: ( ( 'effects' ) )
            // InternalRpgindividual.g:1466:1: ( 'effects' )
            {
            // InternalRpgindividual.g:1466:1: ( 'effects' )
            // InternalRpgindividual.g:1467:2: 'effects'
            {
             before(grammarAccess.getEffectsAccess().getEffectsKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEffectsAccess().getEffectsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effects__Group__0__Impl"


    // $ANTLR start "rule__Effects__Group__1"
    // InternalRpgindividual.g:1476:1: rule__Effects__Group__1 : rule__Effects__Group__1__Impl ;
    public final void rule__Effects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1480:1: ( rule__Effects__Group__1__Impl )
            // InternalRpgindividual.g:1481:2: rule__Effects__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Effects__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effects__Group__1"


    // $ANTLR start "rule__Effects__Group__1__Impl"
    // InternalRpgindividual.g:1487:1: rule__Effects__Group__1__Impl : ( ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* ) ) ;
    public final void rule__Effects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1491:1: ( ( ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* ) ) )
            // InternalRpgindividual.g:1492:1: ( ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:1492:1: ( ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* ) )
            // InternalRpgindividual.g:1493:2: ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* )
            {
            // InternalRpgindividual.g:1493:2: ( ( rule__Effects__EffectAssignment_1 ) )
            // InternalRpgindividual.g:1494:3: ( rule__Effects__EffectAssignment_1 )
            {
             before(grammarAccess.getEffectsAccess().getEffectAssignment_1()); 
            // InternalRpgindividual.g:1495:3: ( rule__Effects__EffectAssignment_1 )
            // InternalRpgindividual.g:1495:4: rule__Effects__EffectAssignment_1
            {
            pushFollow(FOLLOW_7);
            rule__Effects__EffectAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectsAccess().getEffectAssignment_1()); 

            }

            // InternalRpgindividual.g:1498:2: ( ( rule__Effects__EffectAssignment_1 )* )
            // InternalRpgindividual.g:1499:3: ( rule__Effects__EffectAssignment_1 )*
            {
             before(grammarAccess.getEffectsAccess().getEffectAssignment_1()); 
            // InternalRpgindividual.g:1500:3: ( rule__Effects__EffectAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRpgindividual.g:1500:4: rule__Effects__EffectAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Effects__EffectAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getEffectsAccess().getEffectAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effects__Group__1__Impl"


    // $ANTLR start "rule__Effect__Group__0"
    // InternalRpgindividual.g:1510:1: rule__Effect__Group__0 : rule__Effect__Group__0__Impl rule__Effect__Group__1 ;
    public final void rule__Effect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1514:1: ( rule__Effect__Group__0__Impl rule__Effect__Group__1 )
            // InternalRpgindividual.g:1515:2: rule__Effect__Group__0__Impl rule__Effect__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Effect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__0"


    // $ANTLR start "rule__Effect__Group__0__Impl"
    // InternalRpgindividual.g:1522:1: rule__Effect__Group__0__Impl : ( 'effect' ) ;
    public final void rule__Effect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1526:1: ( ( 'effect' ) )
            // InternalRpgindividual.g:1527:1: ( 'effect' )
            {
            // InternalRpgindividual.g:1527:1: ( 'effect' )
            // InternalRpgindividual.g:1528:2: 'effect'
            {
             before(grammarAccess.getEffectAccess().getEffectKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEffectAccess().getEffectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__0__Impl"


    // $ANTLR start "rule__Effect__Group__1"
    // InternalRpgindividual.g:1537:1: rule__Effect__Group__1 : rule__Effect__Group__1__Impl rule__Effect__Group__2 ;
    public final void rule__Effect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1541:1: ( rule__Effect__Group__1__Impl rule__Effect__Group__2 )
            // InternalRpgindividual.g:1542:2: rule__Effect__Group__1__Impl rule__Effect__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Effect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__1"


    // $ANTLR start "rule__Effect__Group__1__Impl"
    // InternalRpgindividual.g:1549:1: rule__Effect__Group__1__Impl : ( ( rule__Effect__NameAssignment_1 ) ) ;
    public final void rule__Effect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1553:1: ( ( ( rule__Effect__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:1554:1: ( ( rule__Effect__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:1554:1: ( ( rule__Effect__NameAssignment_1 ) )
            // InternalRpgindividual.g:1555:2: ( rule__Effect__NameAssignment_1 )
            {
             before(grammarAccess.getEffectAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:1556:2: ( rule__Effect__NameAssignment_1 )
            // InternalRpgindividual.g:1556:3: rule__Effect__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Effect__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__1__Impl"


    // $ANTLR start "rule__Effect__Group__2"
    // InternalRpgindividual.g:1564:1: rule__Effect__Group__2 : rule__Effect__Group__2__Impl ;
    public final void rule__Effect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1568:1: ( rule__Effect__Group__2__Impl )
            // InternalRpgindividual.g:1569:2: rule__Effect__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Effect__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__2"


    // $ANTLR start "rule__Effect__Group__2__Impl"
    // InternalRpgindividual.g:1575:1: rule__Effect__Group__2__Impl : ( ( rule__Effect__RuleAssignment_2 ) ) ;
    public final void rule__Effect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1579:1: ( ( ( rule__Effect__RuleAssignment_2 ) ) )
            // InternalRpgindividual.g:1580:1: ( ( rule__Effect__RuleAssignment_2 ) )
            {
            // InternalRpgindividual.g:1580:1: ( ( rule__Effect__RuleAssignment_2 ) )
            // InternalRpgindividual.g:1581:2: ( rule__Effect__RuleAssignment_2 )
            {
             before(grammarAccess.getEffectAccess().getRuleAssignment_2()); 
            // InternalRpgindividual.g:1582:2: ( rule__Effect__RuleAssignment_2 )
            // InternalRpgindividual.g:1582:3: rule__Effect__RuleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Effect__RuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getRuleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__2__Impl"


    // $ANTLR start "rule__Attributes__Group__0"
    // InternalRpgindividual.g:1591:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1595:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // InternalRpgindividual.g:1596:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Attributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__0"


    // $ANTLR start "rule__Attributes__Group__0__Impl"
    // InternalRpgindividual.g:1603:1: rule__Attributes__Group__0__Impl : ( 'attributes' ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1607:1: ( ( 'attributes' ) )
            // InternalRpgindividual.g:1608:1: ( 'attributes' )
            {
            // InternalRpgindividual.g:1608:1: ( 'attributes' )
            // InternalRpgindividual.g:1609:2: 'attributes'
            {
             before(grammarAccess.getAttributesAccess().getAttributesKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributesAccess().getAttributesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__0__Impl"


    // $ANTLR start "rule__Attributes__Group__1"
    // InternalRpgindividual.g:1618:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1622:1: ( rule__Attributes__Group__1__Impl )
            // InternalRpgindividual.g:1623:2: rule__Attributes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__1"


    // $ANTLR start "rule__Attributes__Group__1__Impl"
    // InternalRpgindividual.g:1629:1: rule__Attributes__Group__1__Impl : ( ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* ) ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1633:1: ( ( ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* ) ) )
            // InternalRpgindividual.g:1634:1: ( ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:1634:1: ( ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* ) )
            // InternalRpgindividual.g:1635:2: ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* )
            {
            // InternalRpgindividual.g:1635:2: ( ( rule__Attributes__AttributeAssignment_1 ) )
            // InternalRpgindividual.g:1636:3: ( rule__Attributes__AttributeAssignment_1 )
            {
             before(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 
            // InternalRpgindividual.g:1637:3: ( rule__Attributes__AttributeAssignment_1 )
            // InternalRpgindividual.g:1637:4: rule__Attributes__AttributeAssignment_1
            {
            pushFollow(FOLLOW_10);
            rule__Attributes__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 

            }

            // InternalRpgindividual.g:1640:2: ( ( rule__Attributes__AttributeAssignment_1 )* )
            // InternalRpgindividual.g:1641:3: ( rule__Attributes__AttributeAssignment_1 )*
            {
             before(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 
            // InternalRpgindividual.g:1642:3: ( rule__Attributes__AttributeAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRpgindividual.g:1642:4: rule__Attributes__AttributeAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Attributes__AttributeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalRpgindividual.g:1652:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1656:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalRpgindividual.g:1657:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalRpgindividual.g:1664:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1668:1: ( ( 'attribute' ) )
            // InternalRpgindividual.g:1669:1: ( 'attribute' )
            {
            // InternalRpgindividual.g:1669:1: ( 'attribute' )
            // InternalRpgindividual.g:1670:2: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalRpgindividual.g:1679:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1683:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalRpgindividual.g:1684:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalRpgindividual.g:1691:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1695:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:1696:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:1696:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalRpgindividual.g:1697:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:1698:2: ( rule__Attribute__NameAssignment_1 )
            // InternalRpgindividual.g:1698:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalRpgindividual.g:1706:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1710:1: ( rule__Attribute__Group__2__Impl )
            // InternalRpgindividual.g:1711:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalRpgindividual.g:1717:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__AValAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1721:1: ( ( ( rule__Attribute__AValAssignment_2 ) ) )
            // InternalRpgindividual.g:1722:1: ( ( rule__Attribute__AValAssignment_2 ) )
            {
            // InternalRpgindividual.g:1722:1: ( ( rule__Attribute__AValAssignment_2 ) )
            // InternalRpgindividual.g:1723:2: ( rule__Attribute__AValAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getAValAssignment_2()); 
            // InternalRpgindividual.g:1724:2: ( rule__Attribute__AValAssignment_2 )
            // InternalRpgindividual.g:1724:3: rule__Attribute__AValAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AValAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAValAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Locations__Group__0"
    // InternalRpgindividual.g:1733:1: rule__Locations__Group__0 : rule__Locations__Group__0__Impl rule__Locations__Group__1 ;
    public final void rule__Locations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1737:1: ( rule__Locations__Group__0__Impl rule__Locations__Group__1 )
            // InternalRpgindividual.g:1738:2: rule__Locations__Group__0__Impl rule__Locations__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Locations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Locations__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locations__Group__0"


    // $ANTLR start "rule__Locations__Group__0__Impl"
    // InternalRpgindividual.g:1745:1: rule__Locations__Group__0__Impl : ( 'location' ) ;
    public final void rule__Locations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1749:1: ( ( 'location' ) )
            // InternalRpgindividual.g:1750:1: ( 'location' )
            {
            // InternalRpgindividual.g:1750:1: ( 'location' )
            // InternalRpgindividual.g:1751:2: 'location'
            {
             before(grammarAccess.getLocationsAccess().getLocationKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLocationsAccess().getLocationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locations__Group__0__Impl"


    // $ANTLR start "rule__Locations__Group__1"
    // InternalRpgindividual.g:1760:1: rule__Locations__Group__1 : rule__Locations__Group__1__Impl ;
    public final void rule__Locations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1764:1: ( rule__Locations__Group__1__Impl )
            // InternalRpgindividual.g:1765:2: rule__Locations__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Locations__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locations__Group__1"


    // $ANTLR start "rule__Locations__Group__1__Impl"
    // InternalRpgindividual.g:1771:1: rule__Locations__Group__1__Impl : ( ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* ) ) ;
    public final void rule__Locations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1775:1: ( ( ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* ) ) )
            // InternalRpgindividual.g:1776:1: ( ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:1776:1: ( ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* ) )
            // InternalRpgindividual.g:1777:2: ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* )
            {
            // InternalRpgindividual.g:1777:2: ( ( rule__Locations__LocAssignment_1 ) )
            // InternalRpgindividual.g:1778:3: ( rule__Locations__LocAssignment_1 )
            {
             before(grammarAccess.getLocationsAccess().getLocAssignment_1()); 
            // InternalRpgindividual.g:1779:3: ( rule__Locations__LocAssignment_1 )
            // InternalRpgindividual.g:1779:4: rule__Locations__LocAssignment_1
            {
            pushFollow(FOLLOW_12);
            rule__Locations__LocAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocationsAccess().getLocAssignment_1()); 

            }

            // InternalRpgindividual.g:1782:2: ( ( rule__Locations__LocAssignment_1 )* )
            // InternalRpgindividual.g:1783:3: ( rule__Locations__LocAssignment_1 )*
            {
             before(grammarAccess.getLocationsAccess().getLocAssignment_1()); 
            // InternalRpgindividual.g:1784:3: ( rule__Locations__LocAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRpgindividual.g:1784:4: rule__Locations__LocAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Locations__LocAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getLocationsAccess().getLocAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locations__Group__1__Impl"


    // $ANTLR start "rule__Loc__Group__0"
    // InternalRpgindividual.g:1794:1: rule__Loc__Group__0 : rule__Loc__Group__0__Impl rule__Loc__Group__1 ;
    public final void rule__Loc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1798:1: ( rule__Loc__Group__0__Impl rule__Loc__Group__1 )
            // InternalRpgindividual.g:1799:2: rule__Loc__Group__0__Impl rule__Loc__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Loc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__Group__0"


    // $ANTLR start "rule__Loc__Group__0__Impl"
    // InternalRpgindividual.g:1806:1: rule__Loc__Group__0__Impl : ( ( rule__Loc__NameAssignment_0 ) ) ;
    public final void rule__Loc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1810:1: ( ( ( rule__Loc__NameAssignment_0 ) ) )
            // InternalRpgindividual.g:1811:1: ( ( rule__Loc__NameAssignment_0 ) )
            {
            // InternalRpgindividual.g:1811:1: ( ( rule__Loc__NameAssignment_0 ) )
            // InternalRpgindividual.g:1812:2: ( rule__Loc__NameAssignment_0 )
            {
             before(grammarAccess.getLocAccess().getNameAssignment_0()); 
            // InternalRpgindividual.g:1813:2: ( rule__Loc__NameAssignment_0 )
            // InternalRpgindividual.g:1813:3: rule__Loc__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Loc__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLocAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__Group__0__Impl"


    // $ANTLR start "rule__Loc__Group__1"
    // InternalRpgindividual.g:1821:1: rule__Loc__Group__1 : rule__Loc__Group__1__Impl rule__Loc__Group__2 ;
    public final void rule__Loc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1825:1: ( rule__Loc__Group__1__Impl rule__Loc__Group__2 )
            // InternalRpgindividual.g:1826:2: rule__Loc__Group__1__Impl rule__Loc__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Loc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__Group__1"


    // $ANTLR start "rule__Loc__Group__1__Impl"
    // InternalRpgindividual.g:1833:1: rule__Loc__Group__1__Impl : ( 'opponents' ) ;
    public final void rule__Loc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1837:1: ( ( 'opponents' ) )
            // InternalRpgindividual.g:1838:1: ( 'opponents' )
            {
            // InternalRpgindividual.g:1838:1: ( 'opponents' )
            // InternalRpgindividual.g:1839:2: 'opponents'
            {
             before(grammarAccess.getLocAccess().getOpponentsKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLocAccess().getOpponentsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__Group__1__Impl"


    // $ANTLR start "rule__Loc__Group__2"
    // InternalRpgindividual.g:1848:1: rule__Loc__Group__2 : rule__Loc__Group__2__Impl ;
    public final void rule__Loc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1852:1: ( rule__Loc__Group__2__Impl )
            // InternalRpgindividual.g:1853:2: rule__Loc__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loc__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__Group__2"


    // $ANTLR start "rule__Loc__Group__2__Impl"
    // InternalRpgindividual.g:1859:1: rule__Loc__Group__2__Impl : ( ( rule__Loc__TeamAssignment_2 ) ) ;
    public final void rule__Loc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1863:1: ( ( ( rule__Loc__TeamAssignment_2 ) ) )
            // InternalRpgindividual.g:1864:1: ( ( rule__Loc__TeamAssignment_2 ) )
            {
            // InternalRpgindividual.g:1864:1: ( ( rule__Loc__TeamAssignment_2 ) )
            // InternalRpgindividual.g:1865:2: ( rule__Loc__TeamAssignment_2 )
            {
             before(grammarAccess.getLocAccess().getTeamAssignment_2()); 
            // InternalRpgindividual.g:1866:2: ( rule__Loc__TeamAssignment_2 )
            // InternalRpgindividual.g:1866:3: rule__Loc__TeamAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Loc__TeamAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLocAccess().getTeamAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__Group__2__Impl"


    // $ANTLR start "rule__Relations__Group__0"
    // InternalRpgindividual.g:1875:1: rule__Relations__Group__0 : rule__Relations__Group__0__Impl rule__Relations__Group__1 ;
    public final void rule__Relations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1879:1: ( rule__Relations__Group__0__Impl rule__Relations__Group__1 )
            // InternalRpgindividual.g:1880:2: rule__Relations__Group__0__Impl rule__Relations__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Relations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relations__Group__0"


    // $ANTLR start "rule__Relations__Group__0__Impl"
    // InternalRpgindividual.g:1887:1: rule__Relations__Group__0__Impl : ( 'relations' ) ;
    public final void rule__Relations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1891:1: ( ( 'relations' ) )
            // InternalRpgindividual.g:1892:1: ( 'relations' )
            {
            // InternalRpgindividual.g:1892:1: ( 'relations' )
            // InternalRpgindividual.g:1893:2: 'relations'
            {
             before(grammarAccess.getRelationsAccess().getRelationsKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRelationsAccess().getRelationsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relations__Group__0__Impl"


    // $ANTLR start "rule__Relations__Group__1"
    // InternalRpgindividual.g:1902:1: rule__Relations__Group__1 : rule__Relations__Group__1__Impl ;
    public final void rule__Relations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1906:1: ( rule__Relations__Group__1__Impl )
            // InternalRpgindividual.g:1907:2: rule__Relations__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relations__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relations__Group__1"


    // $ANTLR start "rule__Relations__Group__1__Impl"
    // InternalRpgindividual.g:1913:1: rule__Relations__Group__1__Impl : ( ( ( rule__Relations__TypeAssignment_1 ) ) ( ( rule__Relations__TypeAssignment_1 )* ) ) ;
    public final void rule__Relations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1917:1: ( ( ( ( rule__Relations__TypeAssignment_1 ) ) ( ( rule__Relations__TypeAssignment_1 )* ) ) )
            // InternalRpgindividual.g:1918:1: ( ( ( rule__Relations__TypeAssignment_1 ) ) ( ( rule__Relations__TypeAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:1918:1: ( ( ( rule__Relations__TypeAssignment_1 ) ) ( ( rule__Relations__TypeAssignment_1 )* ) )
            // InternalRpgindividual.g:1919:2: ( ( rule__Relations__TypeAssignment_1 ) ) ( ( rule__Relations__TypeAssignment_1 )* )
            {
            // InternalRpgindividual.g:1919:2: ( ( rule__Relations__TypeAssignment_1 ) )
            // InternalRpgindividual.g:1920:3: ( rule__Relations__TypeAssignment_1 )
            {
             before(grammarAccess.getRelationsAccess().getTypeAssignment_1()); 
            // InternalRpgindividual.g:1921:3: ( rule__Relations__TypeAssignment_1 )
            // InternalRpgindividual.g:1921:4: rule__Relations__TypeAssignment_1
            {
            pushFollow(FOLLOW_15);
            rule__Relations__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getTypeAssignment_1()); 

            }

            // InternalRpgindividual.g:1924:2: ( ( rule__Relations__TypeAssignment_1 )* )
            // InternalRpgindividual.g:1925:3: ( rule__Relations__TypeAssignment_1 )*
            {
             before(grammarAccess.getRelationsAccess().getTypeAssignment_1()); 
            // InternalRpgindividual.g:1926:3: ( rule__Relations__TypeAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRpgindividual.g:1926:4: rule__Relations__TypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Relations__TypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getRelationsAccess().getTypeAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relations__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalRpgindividual.g:1936:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1940:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalRpgindividual.g:1941:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalRpgindividual.g:1948:1: rule__Type__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1952:1: ( ( 'type' ) )
            // InternalRpgindividual.g:1953:1: ( 'type' )
            {
            // InternalRpgindividual.g:1953:1: ( 'type' )
            // InternalRpgindividual.g:1954:2: 'type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalRpgindividual.g:1963:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1967:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalRpgindividual.g:1968:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalRpgindividual.g:1975:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1979:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:1980:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:1980:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalRpgindividual.g:1981:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:1982:2: ( rule__Type__NameAssignment_1 )
            // InternalRpgindividual.g:1982:3: rule__Type__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // InternalRpgindividual.g:1990:1: rule__Type__Group__2 : rule__Type__Group__2__Impl ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1994:1: ( rule__Type__Group__2__Impl )
            // InternalRpgindividual.g:1995:2: rule__Type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // InternalRpgindividual.g:2001:1: rule__Type__Group__2__Impl : ( ( rule__Type__TExpressionAssignment_2 )? ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2005:1: ( ( ( rule__Type__TExpressionAssignment_2 )? ) )
            // InternalRpgindividual.g:2006:1: ( ( rule__Type__TExpressionAssignment_2 )? )
            {
            // InternalRpgindividual.g:2006:1: ( ( rule__Type__TExpressionAssignment_2 )? )
            // InternalRpgindividual.g:2007:2: ( rule__Type__TExpressionAssignment_2 )?
            {
             before(grammarAccess.getTypeAccess().getTExpressionAssignment_2()); 
            // InternalRpgindividual.g:2008:2: ( rule__Type__TExpressionAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRpgindividual.g:2008:3: rule__Type__TExpressionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TExpressionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getTExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__TypeExpression__Group__0"
    // InternalRpgindividual.g:2017:1: rule__TypeExpression__Group__0 : rule__TypeExpression__Group__0__Impl rule__TypeExpression__Group__1 ;
    public final void rule__TypeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2021:1: ( rule__TypeExpression__Group__0__Impl rule__TypeExpression__Group__1 )
            // InternalRpgindividual.g:2022:2: rule__TypeExpression__Group__0__Impl rule__TypeExpression__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__TypeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__0"


    // $ANTLR start "rule__TypeExpression__Group__0__Impl"
    // InternalRpgindividual.g:2029:1: rule__TypeExpression__Group__0__Impl : ( 'strong(' ) ;
    public final void rule__TypeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2033:1: ( ( 'strong(' ) )
            // InternalRpgindividual.g:2034:1: ( 'strong(' )
            {
            // InternalRpgindividual.g:2034:1: ( 'strong(' )
            // InternalRpgindividual.g:2035:2: 'strong('
            {
             before(grammarAccess.getTypeExpressionAccess().getStrongKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getStrongKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__0__Impl"


    // $ANTLR start "rule__TypeExpression__Group__1"
    // InternalRpgindividual.g:2044:1: rule__TypeExpression__Group__1 : rule__TypeExpression__Group__1__Impl rule__TypeExpression__Group__2 ;
    public final void rule__TypeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2048:1: ( rule__TypeExpression__Group__1__Impl rule__TypeExpression__Group__2 )
            // InternalRpgindividual.g:2049:2: rule__TypeExpression__Group__1__Impl rule__TypeExpression__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__TypeExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__1"


    // $ANTLR start "rule__TypeExpression__Group__1__Impl"
    // InternalRpgindividual.g:2056:1: rule__TypeExpression__Group__1__Impl : ( ( rule__TypeExpression__RelationStrongAssignment_1 ) ) ;
    public final void rule__TypeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2060:1: ( ( ( rule__TypeExpression__RelationStrongAssignment_1 ) ) )
            // InternalRpgindividual.g:2061:1: ( ( rule__TypeExpression__RelationStrongAssignment_1 ) )
            {
            // InternalRpgindividual.g:2061:1: ( ( rule__TypeExpression__RelationStrongAssignment_1 ) )
            // InternalRpgindividual.g:2062:2: ( rule__TypeExpression__RelationStrongAssignment_1 )
            {
             before(grammarAccess.getTypeExpressionAccess().getRelationStrongAssignment_1()); 
            // InternalRpgindividual.g:2063:2: ( rule__TypeExpression__RelationStrongAssignment_1 )
            // InternalRpgindividual.g:2063:3: rule__TypeExpression__RelationStrongAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__RelationStrongAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpressionAccess().getRelationStrongAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__1__Impl"


    // $ANTLR start "rule__TypeExpression__Group__2"
    // InternalRpgindividual.g:2071:1: rule__TypeExpression__Group__2 : rule__TypeExpression__Group__2__Impl rule__TypeExpression__Group__3 ;
    public final void rule__TypeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2075:1: ( rule__TypeExpression__Group__2__Impl rule__TypeExpression__Group__3 )
            // InternalRpgindividual.g:2076:2: rule__TypeExpression__Group__2__Impl rule__TypeExpression__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__TypeExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__2"


    // $ANTLR start "rule__TypeExpression__Group__2__Impl"
    // InternalRpgindividual.g:2083:1: rule__TypeExpression__Group__2__Impl : ( '):' ) ;
    public final void rule__TypeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2087:1: ( ( '):' ) )
            // InternalRpgindividual.g:2088:1: ( '):' )
            {
            // InternalRpgindividual.g:2088:1: ( '):' )
            // InternalRpgindividual.g:2089:2: '):'
            {
             before(grammarAccess.getTypeExpressionAccess().getRightParenthesisColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getRightParenthesisColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__2__Impl"


    // $ANTLR start "rule__TypeExpression__Group__3"
    // InternalRpgindividual.g:2098:1: rule__TypeExpression__Group__3 : rule__TypeExpression__Group__3__Impl rule__TypeExpression__Group__4 ;
    public final void rule__TypeExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2102:1: ( rule__TypeExpression__Group__3__Impl rule__TypeExpression__Group__4 )
            // InternalRpgindividual.g:2103:2: rule__TypeExpression__Group__3__Impl rule__TypeExpression__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__TypeExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__3"


    // $ANTLR start "rule__TypeExpression__Group__3__Impl"
    // InternalRpgindividual.g:2110:1: rule__TypeExpression__Group__3__Impl : ( ( rule__TypeExpression__StrongAssignment_3 ) ) ;
    public final void rule__TypeExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2114:1: ( ( ( rule__TypeExpression__StrongAssignment_3 ) ) )
            // InternalRpgindividual.g:2115:1: ( ( rule__TypeExpression__StrongAssignment_3 ) )
            {
            // InternalRpgindividual.g:2115:1: ( ( rule__TypeExpression__StrongAssignment_3 ) )
            // InternalRpgindividual.g:2116:2: ( rule__TypeExpression__StrongAssignment_3 )
            {
             before(grammarAccess.getTypeExpressionAccess().getStrongAssignment_3()); 
            // InternalRpgindividual.g:2117:2: ( rule__TypeExpression__StrongAssignment_3 )
            // InternalRpgindividual.g:2117:3: rule__TypeExpression__StrongAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__StrongAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpressionAccess().getStrongAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__3__Impl"


    // $ANTLR start "rule__TypeExpression__Group__4"
    // InternalRpgindividual.g:2125:1: rule__TypeExpression__Group__4 : rule__TypeExpression__Group__4__Impl rule__TypeExpression__Group__5 ;
    public final void rule__TypeExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2129:1: ( rule__TypeExpression__Group__4__Impl rule__TypeExpression__Group__5 )
            // InternalRpgindividual.g:2130:2: rule__TypeExpression__Group__4__Impl rule__TypeExpression__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__TypeExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__4"


    // $ANTLR start "rule__TypeExpression__Group__4__Impl"
    // InternalRpgindividual.g:2137:1: rule__TypeExpression__Group__4__Impl : ( ( rule__TypeExpression__Group_4__0 )* ) ;
    public final void rule__TypeExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2141:1: ( ( ( rule__TypeExpression__Group_4__0 )* ) )
            // InternalRpgindividual.g:2142:1: ( ( rule__TypeExpression__Group_4__0 )* )
            {
            // InternalRpgindividual.g:2142:1: ( ( rule__TypeExpression__Group_4__0 )* )
            // InternalRpgindividual.g:2143:2: ( rule__TypeExpression__Group_4__0 )*
            {
             before(grammarAccess.getTypeExpressionAccess().getGroup_4()); 
            // InternalRpgindividual.g:2144:2: ( rule__TypeExpression__Group_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRpgindividual.g:2144:3: rule__TypeExpression__Group_4__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__TypeExpression__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getTypeExpressionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__4__Impl"


    // $ANTLR start "rule__TypeExpression__Group__5"
    // InternalRpgindividual.g:2152:1: rule__TypeExpression__Group__5 : rule__TypeExpression__Group__5__Impl rule__TypeExpression__Group__6 ;
    public final void rule__TypeExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2156:1: ( rule__TypeExpression__Group__5__Impl rule__TypeExpression__Group__6 )
            // InternalRpgindividual.g:2157:2: rule__TypeExpression__Group__5__Impl rule__TypeExpression__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__TypeExpression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__5"


    // $ANTLR start "rule__TypeExpression__Group__5__Impl"
    // InternalRpgindividual.g:2164:1: rule__TypeExpression__Group__5__Impl : ( 'weak(' ) ;
    public final void rule__TypeExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2168:1: ( ( 'weak(' ) )
            // InternalRpgindividual.g:2169:1: ( 'weak(' )
            {
            // InternalRpgindividual.g:2169:1: ( 'weak(' )
            // InternalRpgindividual.g:2170:2: 'weak('
            {
             before(grammarAccess.getTypeExpressionAccess().getWeakKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getWeakKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__5__Impl"


    // $ANTLR start "rule__TypeExpression__Group__6"
    // InternalRpgindividual.g:2179:1: rule__TypeExpression__Group__6 : rule__TypeExpression__Group__6__Impl rule__TypeExpression__Group__7 ;
    public final void rule__TypeExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2183:1: ( rule__TypeExpression__Group__6__Impl rule__TypeExpression__Group__7 )
            // InternalRpgindividual.g:2184:2: rule__TypeExpression__Group__6__Impl rule__TypeExpression__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__TypeExpression__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__6"


    // $ANTLR start "rule__TypeExpression__Group__6__Impl"
    // InternalRpgindividual.g:2191:1: rule__TypeExpression__Group__6__Impl : ( ( rule__TypeExpression__RelationWeakAssignment_6 ) ) ;
    public final void rule__TypeExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2195:1: ( ( ( rule__TypeExpression__RelationWeakAssignment_6 ) ) )
            // InternalRpgindividual.g:2196:1: ( ( rule__TypeExpression__RelationWeakAssignment_6 ) )
            {
            // InternalRpgindividual.g:2196:1: ( ( rule__TypeExpression__RelationWeakAssignment_6 ) )
            // InternalRpgindividual.g:2197:2: ( rule__TypeExpression__RelationWeakAssignment_6 )
            {
             before(grammarAccess.getTypeExpressionAccess().getRelationWeakAssignment_6()); 
            // InternalRpgindividual.g:2198:2: ( rule__TypeExpression__RelationWeakAssignment_6 )
            // InternalRpgindividual.g:2198:3: rule__TypeExpression__RelationWeakAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__RelationWeakAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpressionAccess().getRelationWeakAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__6__Impl"


    // $ANTLR start "rule__TypeExpression__Group__7"
    // InternalRpgindividual.g:2206:1: rule__TypeExpression__Group__7 : rule__TypeExpression__Group__7__Impl rule__TypeExpression__Group__8 ;
    public final void rule__TypeExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2210:1: ( rule__TypeExpression__Group__7__Impl rule__TypeExpression__Group__8 )
            // InternalRpgindividual.g:2211:2: rule__TypeExpression__Group__7__Impl rule__TypeExpression__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__TypeExpression__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__7"


    // $ANTLR start "rule__TypeExpression__Group__7__Impl"
    // InternalRpgindividual.g:2218:1: rule__TypeExpression__Group__7__Impl : ( '):' ) ;
    public final void rule__TypeExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2222:1: ( ( '):' ) )
            // InternalRpgindividual.g:2223:1: ( '):' )
            {
            // InternalRpgindividual.g:2223:1: ( '):' )
            // InternalRpgindividual.g:2224:2: '):'
            {
             before(grammarAccess.getTypeExpressionAccess().getRightParenthesisColonKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getRightParenthesisColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__7__Impl"


    // $ANTLR start "rule__TypeExpression__Group__8"
    // InternalRpgindividual.g:2233:1: rule__TypeExpression__Group__8 : rule__TypeExpression__Group__8__Impl rule__TypeExpression__Group__9 ;
    public final void rule__TypeExpression__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2237:1: ( rule__TypeExpression__Group__8__Impl rule__TypeExpression__Group__9 )
            // InternalRpgindividual.g:2238:2: rule__TypeExpression__Group__8__Impl rule__TypeExpression__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__TypeExpression__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__8"


    // $ANTLR start "rule__TypeExpression__Group__8__Impl"
    // InternalRpgindividual.g:2245:1: rule__TypeExpression__Group__8__Impl : ( ( rule__TypeExpression__WeakAssignment_8 ) ) ;
    public final void rule__TypeExpression__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2249:1: ( ( ( rule__TypeExpression__WeakAssignment_8 ) ) )
            // InternalRpgindividual.g:2250:1: ( ( rule__TypeExpression__WeakAssignment_8 ) )
            {
            // InternalRpgindividual.g:2250:1: ( ( rule__TypeExpression__WeakAssignment_8 ) )
            // InternalRpgindividual.g:2251:2: ( rule__TypeExpression__WeakAssignment_8 )
            {
             before(grammarAccess.getTypeExpressionAccess().getWeakAssignment_8()); 
            // InternalRpgindividual.g:2252:2: ( rule__TypeExpression__WeakAssignment_8 )
            // InternalRpgindividual.g:2252:3: rule__TypeExpression__WeakAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__WeakAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpressionAccess().getWeakAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__8__Impl"


    // $ANTLR start "rule__TypeExpression__Group__9"
    // InternalRpgindividual.g:2260:1: rule__TypeExpression__Group__9 : rule__TypeExpression__Group__9__Impl ;
    public final void rule__TypeExpression__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2264:1: ( rule__TypeExpression__Group__9__Impl )
            // InternalRpgindividual.g:2265:2: rule__TypeExpression__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__9"


    // $ANTLR start "rule__TypeExpression__Group__9__Impl"
    // InternalRpgindividual.g:2271:1: rule__TypeExpression__Group__9__Impl : ( ( rule__TypeExpression__Group_9__0 )* ) ;
    public final void rule__TypeExpression__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2275:1: ( ( ( rule__TypeExpression__Group_9__0 )* ) )
            // InternalRpgindividual.g:2276:1: ( ( rule__TypeExpression__Group_9__0 )* )
            {
            // InternalRpgindividual.g:2276:1: ( ( rule__TypeExpression__Group_9__0 )* )
            // InternalRpgindividual.g:2277:2: ( rule__TypeExpression__Group_9__0 )*
            {
             before(grammarAccess.getTypeExpressionAccess().getGroup_9()); 
            // InternalRpgindividual.g:2278:2: ( rule__TypeExpression__Group_9__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRpgindividual.g:2278:3: rule__TypeExpression__Group_9__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__TypeExpression__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTypeExpressionAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group__9__Impl"


    // $ANTLR start "rule__TypeExpression__Group_4__0"
    // InternalRpgindividual.g:2287:1: rule__TypeExpression__Group_4__0 : rule__TypeExpression__Group_4__0__Impl rule__TypeExpression__Group_4__1 ;
    public final void rule__TypeExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2291:1: ( rule__TypeExpression__Group_4__0__Impl rule__TypeExpression__Group_4__1 )
            // InternalRpgindividual.g:2292:2: rule__TypeExpression__Group_4__0__Impl rule__TypeExpression__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__TypeExpression__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group_4__0"


    // $ANTLR start "rule__TypeExpression__Group_4__0__Impl"
    // InternalRpgindividual.g:2299:1: rule__TypeExpression__Group_4__0__Impl : ( ',' ) ;
    public final void rule__TypeExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2303:1: ( ( ',' ) )
            // InternalRpgindividual.g:2304:1: ( ',' )
            {
            // InternalRpgindividual.g:2304:1: ( ',' )
            // InternalRpgindividual.g:2305:2: ','
            {
             before(grammarAccess.getTypeExpressionAccess().getCommaKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group_4__0__Impl"


    // $ANTLR start "rule__TypeExpression__Group_4__1"
    // InternalRpgindividual.g:2314:1: rule__TypeExpression__Group_4__1 : rule__TypeExpression__Group_4__1__Impl ;
    public final void rule__TypeExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2318:1: ( rule__TypeExpression__Group_4__1__Impl )
            // InternalRpgindividual.g:2319:2: rule__TypeExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group_4__1"


    // $ANTLR start "rule__TypeExpression__Group_4__1__Impl"
    // InternalRpgindividual.g:2325:1: rule__TypeExpression__Group_4__1__Impl : ( ( rule__TypeExpression__Strong2Assignment_4_1 ) ) ;
    public final void rule__TypeExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2329:1: ( ( ( rule__TypeExpression__Strong2Assignment_4_1 ) ) )
            // InternalRpgindividual.g:2330:1: ( ( rule__TypeExpression__Strong2Assignment_4_1 ) )
            {
            // InternalRpgindividual.g:2330:1: ( ( rule__TypeExpression__Strong2Assignment_4_1 ) )
            // InternalRpgindividual.g:2331:2: ( rule__TypeExpression__Strong2Assignment_4_1 )
            {
             before(grammarAccess.getTypeExpressionAccess().getStrong2Assignment_4_1()); 
            // InternalRpgindividual.g:2332:2: ( rule__TypeExpression__Strong2Assignment_4_1 )
            // InternalRpgindividual.g:2332:3: rule__TypeExpression__Strong2Assignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__Strong2Assignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpressionAccess().getStrong2Assignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group_4__1__Impl"


    // $ANTLR start "rule__TypeExpression__Group_9__0"
    // InternalRpgindividual.g:2341:1: rule__TypeExpression__Group_9__0 : rule__TypeExpression__Group_9__0__Impl rule__TypeExpression__Group_9__1 ;
    public final void rule__TypeExpression__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2345:1: ( rule__TypeExpression__Group_9__0__Impl rule__TypeExpression__Group_9__1 )
            // InternalRpgindividual.g:2346:2: rule__TypeExpression__Group_9__0__Impl rule__TypeExpression__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__TypeExpression__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group_9__0"


    // $ANTLR start "rule__TypeExpression__Group_9__0__Impl"
    // InternalRpgindividual.g:2353:1: rule__TypeExpression__Group_9__0__Impl : ( ',' ) ;
    public final void rule__TypeExpression__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2357:1: ( ( ',' ) )
            // InternalRpgindividual.g:2358:1: ( ',' )
            {
            // InternalRpgindividual.g:2358:1: ( ',' )
            // InternalRpgindividual.g:2359:2: ','
            {
             before(grammarAccess.getTypeExpressionAccess().getCommaKeyword_9_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group_9__0__Impl"


    // $ANTLR start "rule__TypeExpression__Group_9__1"
    // InternalRpgindividual.g:2368:1: rule__TypeExpression__Group_9__1 : rule__TypeExpression__Group_9__1__Impl ;
    public final void rule__TypeExpression__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2372:1: ( rule__TypeExpression__Group_9__1__Impl )
            // InternalRpgindividual.g:2373:2: rule__TypeExpression__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group_9__1"


    // $ANTLR start "rule__TypeExpression__Group_9__1__Impl"
    // InternalRpgindividual.g:2379:1: rule__TypeExpression__Group_9__1__Impl : ( ( rule__TypeExpression__Weak2Assignment_9_1 ) ) ;
    public final void rule__TypeExpression__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2383:1: ( ( ( rule__TypeExpression__Weak2Assignment_9_1 ) ) )
            // InternalRpgindividual.g:2384:1: ( ( rule__TypeExpression__Weak2Assignment_9_1 ) )
            {
            // InternalRpgindividual.g:2384:1: ( ( rule__TypeExpression__Weak2Assignment_9_1 ) )
            // InternalRpgindividual.g:2385:2: ( rule__TypeExpression__Weak2Assignment_9_1 )
            {
             before(grammarAccess.getTypeExpressionAccess().getWeak2Assignment_9_1()); 
            // InternalRpgindividual.g:2386:2: ( rule__TypeExpression__Weak2Assignment_9_1 )
            // InternalRpgindividual.g:2386:3: rule__TypeExpression__Weak2Assignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__Weak2Assignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpressionAccess().getWeak2Assignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Group_9__1__Impl"


    // $ANTLR start "rule__Moves__Group__0"
    // InternalRpgindividual.g:2395:1: rule__Moves__Group__0 : rule__Moves__Group__0__Impl rule__Moves__Group__1 ;
    public final void rule__Moves__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2399:1: ( rule__Moves__Group__0__Impl rule__Moves__Group__1 )
            // InternalRpgindividual.g:2400:2: rule__Moves__Group__0__Impl rule__Moves__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Moves__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Moves__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Moves__Group__0"


    // $ANTLR start "rule__Moves__Group__0__Impl"
    // InternalRpgindividual.g:2407:1: rule__Moves__Group__0__Impl : ( 'moves' ) ;
    public final void rule__Moves__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2411:1: ( ( 'moves' ) )
            // InternalRpgindividual.g:2412:1: ( 'moves' )
            {
            // InternalRpgindividual.g:2412:1: ( 'moves' )
            // InternalRpgindividual.g:2413:2: 'moves'
            {
             before(grammarAccess.getMovesAccess().getMovesKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMovesAccess().getMovesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Moves__Group__0__Impl"


    // $ANTLR start "rule__Moves__Group__1"
    // InternalRpgindividual.g:2422:1: rule__Moves__Group__1 : rule__Moves__Group__1__Impl ;
    public final void rule__Moves__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2426:1: ( rule__Moves__Group__1__Impl )
            // InternalRpgindividual.g:2427:2: rule__Moves__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Moves__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Moves__Group__1"


    // $ANTLR start "rule__Moves__Group__1__Impl"
    // InternalRpgindividual.g:2433:1: rule__Moves__Group__1__Impl : ( ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* ) ) ;
    public final void rule__Moves__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2437:1: ( ( ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* ) ) )
            // InternalRpgindividual.g:2438:1: ( ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:2438:1: ( ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* ) )
            // InternalRpgindividual.g:2439:2: ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* )
            {
            // InternalRpgindividual.g:2439:2: ( ( rule__Moves__MoveAssignment_1 ) )
            // InternalRpgindividual.g:2440:3: ( rule__Moves__MoveAssignment_1 )
            {
             before(grammarAccess.getMovesAccess().getMoveAssignment_1()); 
            // InternalRpgindividual.g:2441:3: ( rule__Moves__MoveAssignment_1 )
            // InternalRpgindividual.g:2441:4: rule__Moves__MoveAssignment_1
            {
            pushFollow(FOLLOW_23);
            rule__Moves__MoveAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMovesAccess().getMoveAssignment_1()); 

            }

            // InternalRpgindividual.g:2444:2: ( ( rule__Moves__MoveAssignment_1 )* )
            // InternalRpgindividual.g:2445:3: ( rule__Moves__MoveAssignment_1 )*
            {
             before(grammarAccess.getMovesAccess().getMoveAssignment_1()); 
            // InternalRpgindividual.g:2446:3: ( rule__Moves__MoveAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRpgindividual.g:2446:4: rule__Moves__MoveAssignment_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Moves__MoveAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMovesAccess().getMoveAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Moves__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // InternalRpgindividual.g:2456:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2460:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalRpgindividual.g:2461:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // InternalRpgindividual.g:2468:1: rule__Move__Group__0__Impl : ( 'move' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2472:1: ( ( 'move' ) )
            // InternalRpgindividual.g:2473:1: ( 'move' )
            {
            // InternalRpgindividual.g:2473:1: ( 'move' )
            // InternalRpgindividual.g:2474:2: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // InternalRpgindividual.g:2483:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2487:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // InternalRpgindividual.g:2488:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // InternalRpgindividual.g:2495:1: rule__Move__Group__1__Impl : ( ( rule__Move__NameAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2499:1: ( ( ( rule__Move__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:2500:1: ( ( rule__Move__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:2500:1: ( ( rule__Move__NameAssignment_1 ) )
            // InternalRpgindividual.g:2501:2: ( rule__Move__NameAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:2502:2: ( rule__Move__NameAssignment_1 )
            // InternalRpgindividual.g:2502:3: rule__Move__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Move__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__2"
    // InternalRpgindividual.g:2510:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2514:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // InternalRpgindividual.g:2515:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2"


    // $ANTLR start "rule__Move__Group__2__Impl"
    // InternalRpgindividual.g:2522:1: rule__Move__Group__2__Impl : ( ( rule__Move__ETypeAssignment_2 ) ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2526:1: ( ( ( rule__Move__ETypeAssignment_2 ) ) )
            // InternalRpgindividual.g:2527:1: ( ( rule__Move__ETypeAssignment_2 ) )
            {
            // InternalRpgindividual.g:2527:1: ( ( rule__Move__ETypeAssignment_2 ) )
            // InternalRpgindividual.g:2528:2: ( rule__Move__ETypeAssignment_2 )
            {
             before(grammarAccess.getMoveAccess().getETypeAssignment_2()); 
            // InternalRpgindividual.g:2529:2: ( rule__Move__ETypeAssignment_2 )
            // InternalRpgindividual.g:2529:3: rule__Move__ETypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Move__ETypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getETypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2__Impl"


    // $ANTLR start "rule__Move__Group__3"
    // InternalRpgindividual.g:2537:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2541:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // InternalRpgindividual.g:2542:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Move__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__3"


    // $ANTLR start "rule__Move__Group__3__Impl"
    // InternalRpgindividual.g:2549:1: rule__Move__Group__3__Impl : ( ( rule__Move__AttAssignment_3 )* ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2553:1: ( ( ( rule__Move__AttAssignment_3 )* ) )
            // InternalRpgindividual.g:2554:1: ( ( rule__Move__AttAssignment_3 )* )
            {
            // InternalRpgindividual.g:2554:1: ( ( rule__Move__AttAssignment_3 )* )
            // InternalRpgindividual.g:2555:2: ( rule__Move__AttAssignment_3 )*
            {
             before(grammarAccess.getMoveAccess().getAttAssignment_3()); 
            // InternalRpgindividual.g:2556:2: ( rule__Move__AttAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRpgindividual.g:2556:3: rule__Move__AttAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Move__AttAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getMoveAccess().getAttAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__3__Impl"


    // $ANTLR start "rule__Move__Group__4"
    // InternalRpgindividual.g:2564:1: rule__Move__Group__4 : rule__Move__Group__4__Impl ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2568:1: ( rule__Move__Group__4__Impl )
            // InternalRpgindividual.g:2569:2: rule__Move__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__4"


    // $ANTLR start "rule__Move__Group__4__Impl"
    // InternalRpgindividual.g:2575:1: rule__Move__Group__4__Impl : ( ( ( rule__Move__MEffectAssignment_4 ) ) ( ( rule__Move__MEffectAssignment_4 )* ) ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2579:1: ( ( ( ( rule__Move__MEffectAssignment_4 ) ) ( ( rule__Move__MEffectAssignment_4 )* ) ) )
            // InternalRpgindividual.g:2580:1: ( ( ( rule__Move__MEffectAssignment_4 ) ) ( ( rule__Move__MEffectAssignment_4 )* ) )
            {
            // InternalRpgindividual.g:2580:1: ( ( ( rule__Move__MEffectAssignment_4 ) ) ( ( rule__Move__MEffectAssignment_4 )* ) )
            // InternalRpgindividual.g:2581:2: ( ( rule__Move__MEffectAssignment_4 ) ) ( ( rule__Move__MEffectAssignment_4 )* )
            {
            // InternalRpgindividual.g:2581:2: ( ( rule__Move__MEffectAssignment_4 ) )
            // InternalRpgindividual.g:2582:3: ( rule__Move__MEffectAssignment_4 )
            {
             before(grammarAccess.getMoveAccess().getMEffectAssignment_4()); 
            // InternalRpgindividual.g:2583:3: ( rule__Move__MEffectAssignment_4 )
            // InternalRpgindividual.g:2583:4: rule__Move__MEffectAssignment_4
            {
            pushFollow(FOLLOW_25);
            rule__Move__MEffectAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getMEffectAssignment_4()); 

            }

            // InternalRpgindividual.g:2586:2: ( ( rule__Move__MEffectAssignment_4 )* )
            // InternalRpgindividual.g:2587:3: ( rule__Move__MEffectAssignment_4 )*
            {
             before(grammarAccess.getMoveAccess().getMEffectAssignment_4()); 
            // InternalRpgindividual.g:2588:3: ( rule__Move__MEffectAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==19) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRpgindividual.g:2588:4: rule__Move__MEffectAssignment_4
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Move__MEffectAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getMoveAccess().getMEffectAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__4__Impl"


    // $ANTLR start "rule__MEffect__Group__0"
    // InternalRpgindividual.g:2598:1: rule__MEffect__Group__0 : rule__MEffect__Group__0__Impl rule__MEffect__Group__1 ;
    public final void rule__MEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2602:1: ( rule__MEffect__Group__0__Impl rule__MEffect__Group__1 )
            // InternalRpgindividual.g:2603:2: rule__MEffect__Group__0__Impl rule__MEffect__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MEffect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MEffect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEffect__Group__0"


    // $ANTLR start "rule__MEffect__Group__0__Impl"
    // InternalRpgindividual.g:2610:1: rule__MEffect__Group__0__Impl : ( 'effect' ) ;
    public final void rule__MEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2614:1: ( ( 'effect' ) )
            // InternalRpgindividual.g:2615:1: ( 'effect' )
            {
            // InternalRpgindividual.g:2615:1: ( 'effect' )
            // InternalRpgindividual.g:2616:2: 'effect'
            {
             before(grammarAccess.getMEffectAccess().getEffectKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMEffectAccess().getEffectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEffect__Group__0__Impl"


    // $ANTLR start "rule__MEffect__Group__1"
    // InternalRpgindividual.g:2625:1: rule__MEffect__Group__1 : rule__MEffect__Group__1__Impl ;
    public final void rule__MEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2629:1: ( rule__MEffect__Group__1__Impl )
            // InternalRpgindividual.g:2630:2: rule__MEffect__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MEffect__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEffect__Group__1"


    // $ANTLR start "rule__MEffect__Group__1__Impl"
    // InternalRpgindividual.g:2636:1: rule__MEffect__Group__1__Impl : ( ( rule__MEffect__MoveENameAssignment_1 ) ) ;
    public final void rule__MEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2640:1: ( ( ( rule__MEffect__MoveENameAssignment_1 ) ) )
            // InternalRpgindividual.g:2641:1: ( ( rule__MEffect__MoveENameAssignment_1 ) )
            {
            // InternalRpgindividual.g:2641:1: ( ( rule__MEffect__MoveENameAssignment_1 ) )
            // InternalRpgindividual.g:2642:2: ( rule__MEffect__MoveENameAssignment_1 )
            {
             before(grammarAccess.getMEffectAccess().getMoveENameAssignment_1()); 
            // InternalRpgindividual.g:2643:2: ( rule__MEffect__MoveENameAssignment_1 )
            // InternalRpgindividual.g:2643:3: rule__MEffect__MoveENameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MEffect__MoveENameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMEffectAccess().getMoveENameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEffect__Group__1__Impl"


    // $ANTLR start "rule__EType__Group__0"
    // InternalRpgindividual.g:2652:1: rule__EType__Group__0 : rule__EType__Group__0__Impl rule__EType__Group__1 ;
    public final void rule__EType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2656:1: ( rule__EType__Group__0__Impl rule__EType__Group__1 )
            // InternalRpgindividual.g:2657:2: rule__EType__Group__0__Impl rule__EType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EType__Group__0"


    // $ANTLR start "rule__EType__Group__0__Impl"
    // InternalRpgindividual.g:2664:1: rule__EType__Group__0__Impl : ( 'type' ) ;
    public final void rule__EType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2668:1: ( ( 'type' ) )
            // InternalRpgindividual.g:2669:1: ( 'type' )
            {
            // InternalRpgindividual.g:2669:1: ( 'type' )
            // InternalRpgindividual.g:2670:2: 'type'
            {
             before(grammarAccess.getETypeAccess().getTypeKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getETypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EType__Group__0__Impl"


    // $ANTLR start "rule__EType__Group__1"
    // InternalRpgindividual.g:2679:1: rule__EType__Group__1 : rule__EType__Group__1__Impl ;
    public final void rule__EType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2683:1: ( rule__EType__Group__1__Impl )
            // InternalRpgindividual.g:2684:2: rule__EType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EType__Group__1"


    // $ANTLR start "rule__EType__Group__1__Impl"
    // InternalRpgindividual.g:2690:1: rule__EType__Group__1__Impl : ( ( rule__EType__TypeAssignment_1 ) ) ;
    public final void rule__EType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2694:1: ( ( ( rule__EType__TypeAssignment_1 ) ) )
            // InternalRpgindividual.g:2695:1: ( ( rule__EType__TypeAssignment_1 ) )
            {
            // InternalRpgindividual.g:2695:1: ( ( rule__EType__TypeAssignment_1 ) )
            // InternalRpgindividual.g:2696:2: ( rule__EType__TypeAssignment_1 )
            {
             before(grammarAccess.getETypeAccess().getTypeAssignment_1()); 
            // InternalRpgindividual.g:2697:2: ( rule__EType__TypeAssignment_1 )
            // InternalRpgindividual.g:2697:3: rule__EType__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EType__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getETypeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EType__Group__1__Impl"


    // $ANTLR start "rule__AttributeValues__Group__0"
    // InternalRpgindividual.g:2706:1: rule__AttributeValues__Group__0 : rule__AttributeValues__Group__0__Impl rule__AttributeValues__Group__1 ;
    public final void rule__AttributeValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2710:1: ( rule__AttributeValues__Group__0__Impl rule__AttributeValues__Group__1 )
            // InternalRpgindividual.g:2711:2: rule__AttributeValues__Group__0__Impl rule__AttributeValues__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__AttributeValues__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeValues__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValues__Group__0"


    // $ANTLR start "rule__AttributeValues__Group__0__Impl"
    // InternalRpgindividual.g:2718:1: rule__AttributeValues__Group__0__Impl : ( 'is' ) ;
    public final void rule__AttributeValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2722:1: ( ( 'is' ) )
            // InternalRpgindividual.g:2723:1: ( 'is' )
            {
            // InternalRpgindividual.g:2723:1: ( 'is' )
            // InternalRpgindividual.g:2724:2: 'is'
            {
             before(grammarAccess.getAttributeValuesAccess().getIsKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAttributeValuesAccess().getIsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValues__Group__0__Impl"


    // $ANTLR start "rule__AttributeValues__Group__1"
    // InternalRpgindividual.g:2733:1: rule__AttributeValues__Group__1 : rule__AttributeValues__Group__1__Impl ;
    public final void rule__AttributeValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2737:1: ( rule__AttributeValues__Group__1__Impl )
            // InternalRpgindividual.g:2738:2: rule__AttributeValues__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeValues__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValues__Group__1"


    // $ANTLR start "rule__AttributeValues__Group__1__Impl"
    // InternalRpgindividual.g:2744:1: rule__AttributeValues__Group__1__Impl : ( ( rule__AttributeValues__Alternatives_1 ) ) ;
    public final void rule__AttributeValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2748:1: ( ( ( rule__AttributeValues__Alternatives_1 ) ) )
            // InternalRpgindividual.g:2749:1: ( ( rule__AttributeValues__Alternatives_1 ) )
            {
            // InternalRpgindividual.g:2749:1: ( ( rule__AttributeValues__Alternatives_1 ) )
            // InternalRpgindividual.g:2750:2: ( rule__AttributeValues__Alternatives_1 )
            {
             before(grammarAccess.getAttributeValuesAccess().getAlternatives_1()); 
            // InternalRpgindividual.g:2751:2: ( rule__AttributeValues__Alternatives_1 )
            // InternalRpgindividual.g:2751:3: rule__AttributeValues__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeValues__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeValuesAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValues__Group__1__Impl"


    // $ANTLR start "rule__AltAttribute__Group__0"
    // InternalRpgindividual.g:2760:1: rule__AltAttribute__Group__0 : rule__AltAttribute__Group__0__Impl rule__AltAttribute__Group__1 ;
    public final void rule__AltAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2764:1: ( rule__AltAttribute__Group__0__Impl rule__AltAttribute__Group__1 )
            // InternalRpgindividual.g:2765:2: rule__AltAttribute__Group__0__Impl rule__AltAttribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AltAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AltAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AltAttribute__Group__0"


    // $ANTLR start "rule__AltAttribute__Group__0__Impl"
    // InternalRpgindividual.g:2772:1: rule__AltAttribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__AltAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2776:1: ( ( 'attribute' ) )
            // InternalRpgindividual.g:2777:1: ( 'attribute' )
            {
            // InternalRpgindividual.g:2777:1: ( 'attribute' )
            // InternalRpgindividual.g:2778:2: 'attribute'
            {
             before(grammarAccess.getAltAttributeAccess().getAttributeKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAltAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AltAttribute__Group__0__Impl"


    // $ANTLR start "rule__AltAttribute__Group__1"
    // InternalRpgindividual.g:2787:1: rule__AltAttribute__Group__1 : rule__AltAttribute__Group__1__Impl rule__AltAttribute__Group__2 ;
    public final void rule__AltAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2791:1: ( rule__AltAttribute__Group__1__Impl rule__AltAttribute__Group__2 )
            // InternalRpgindividual.g:2792:2: rule__AltAttribute__Group__1__Impl rule__AltAttribute__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__AltAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AltAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AltAttribute__Group__1"


    // $ANTLR start "rule__AltAttribute__Group__1__Impl"
    // InternalRpgindividual.g:2799:1: rule__AltAttribute__Group__1__Impl : ( ( rule__AltAttribute__AttributeAssignment_1 ) ) ;
    public final void rule__AltAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2803:1: ( ( ( rule__AltAttribute__AttributeAssignment_1 ) ) )
            // InternalRpgindividual.g:2804:1: ( ( rule__AltAttribute__AttributeAssignment_1 ) )
            {
            // InternalRpgindividual.g:2804:1: ( ( rule__AltAttribute__AttributeAssignment_1 ) )
            // InternalRpgindividual.g:2805:2: ( rule__AltAttribute__AttributeAssignment_1 )
            {
             before(grammarAccess.getAltAttributeAccess().getAttributeAssignment_1()); 
            // InternalRpgindividual.g:2806:2: ( rule__AltAttribute__AttributeAssignment_1 )
            // InternalRpgindividual.g:2806:3: rule__AltAttribute__AttributeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AltAttribute__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAltAttributeAccess().getAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AltAttribute__Group__1__Impl"


    // $ANTLR start "rule__AltAttribute__Group__2"
    // InternalRpgindividual.g:2814:1: rule__AltAttribute__Group__2 : rule__AltAttribute__Group__2__Impl ;
    public final void rule__AltAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2818:1: ( rule__AltAttribute__Group__2__Impl )
            // InternalRpgindividual.g:2819:2: rule__AltAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AltAttribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AltAttribute__Group__2"


    // $ANTLR start "rule__AltAttribute__Group__2__Impl"
    // InternalRpgindividual.g:2825:1: rule__AltAttribute__Group__2__Impl : ( ( rule__AltAttribute__AvAssignment_2 )? ) ;
    public final void rule__AltAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2829:1: ( ( ( rule__AltAttribute__AvAssignment_2 )? ) )
            // InternalRpgindividual.g:2830:1: ( ( rule__AltAttribute__AvAssignment_2 )? )
            {
            // InternalRpgindividual.g:2830:1: ( ( rule__AltAttribute__AvAssignment_2 )? )
            // InternalRpgindividual.g:2831:2: ( rule__AltAttribute__AvAssignment_2 )?
            {
             before(grammarAccess.getAltAttributeAccess().getAvAssignment_2()); 
            // InternalRpgindividual.g:2832:2: ( rule__AltAttribute__AvAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRpgindividual.g:2832:3: rule__AltAttribute__AvAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__AltAttribute__AvAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAltAttributeAccess().getAvAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AltAttribute__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalRpgindividual.g:2841:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2845:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalRpgindividual.g:2846:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalRpgindividual.g:2853:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__Group_0__0 )? ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2857:1: ( ( ( rule__Rule__Group_0__0 )? ) )
            // InternalRpgindividual.g:2858:1: ( ( rule__Rule__Group_0__0 )? )
            {
            // InternalRpgindividual.g:2858:1: ( ( rule__Rule__Group_0__0 )? )
            // InternalRpgindividual.g:2859:2: ( rule__Rule__Group_0__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_0()); 
            // InternalRpgindividual.g:2860:2: ( rule__Rule__Group_0__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRpgindividual.g:2860:3: rule__Rule__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalRpgindividual.g:2868:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2872:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalRpgindividual.g:2873:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalRpgindividual.g:2880:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__TargetThenAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2884:1: ( ( ( rule__Rule__TargetThenAssignment_1 ) ) )
            // InternalRpgindividual.g:2885:1: ( ( rule__Rule__TargetThenAssignment_1 ) )
            {
            // InternalRpgindividual.g:2885:1: ( ( rule__Rule__TargetThenAssignment_1 ) )
            // InternalRpgindividual.g:2886:2: ( rule__Rule__TargetThenAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getTargetThenAssignment_1()); 
            // InternalRpgindividual.g:2887:2: ( rule__Rule__TargetThenAssignment_1 )
            // InternalRpgindividual.g:2887:3: rule__Rule__TargetThenAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__TargetThenAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getTargetThenAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalRpgindividual.g:2895:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2899:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalRpgindividual.g:2900:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalRpgindividual.g:2907:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__TargetAttAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2911:1: ( ( ( rule__Rule__TargetAttAssignment_2 ) ) )
            // InternalRpgindividual.g:2912:1: ( ( rule__Rule__TargetAttAssignment_2 ) )
            {
            // InternalRpgindividual.g:2912:1: ( ( rule__Rule__TargetAttAssignment_2 ) )
            // InternalRpgindividual.g:2913:2: ( rule__Rule__TargetAttAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getTargetAttAssignment_2()); 
            // InternalRpgindividual.g:2914:2: ( rule__Rule__TargetAttAssignment_2 )
            // InternalRpgindividual.g:2914:3: rule__Rule__TargetAttAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__TargetAttAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getTargetAttAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalRpgindividual.g:2922:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2926:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalRpgindividual.g:2927:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalRpgindividual.g:2934:1: rule__Rule__Group__3__Impl : ( 'is' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2938:1: ( ( 'is' ) )
            // InternalRpgindividual.g:2939:1: ( 'is' )
            {
            // InternalRpgindividual.g:2939:1: ( 'is' )
            // InternalRpgindividual.g:2940:2: 'is'
            {
             before(grammarAccess.getRuleAccess().getIsKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getIsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalRpgindividual.g:2949:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2953:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalRpgindividual.g:2954:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalRpgindividual.g:2961:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__ChangeAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2965:1: ( ( ( rule__Rule__ChangeAssignment_4 ) ) )
            // InternalRpgindividual.g:2966:1: ( ( rule__Rule__ChangeAssignment_4 ) )
            {
            // InternalRpgindividual.g:2966:1: ( ( rule__Rule__ChangeAssignment_4 ) )
            // InternalRpgindividual.g:2967:2: ( rule__Rule__ChangeAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getChangeAssignment_4()); 
            // InternalRpgindividual.g:2968:2: ( rule__Rule__ChangeAssignment_4 )
            // InternalRpgindividual.g:2968:3: rule__Rule__ChangeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ChangeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getChangeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalRpgindividual.g:2976:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2980:1: ( rule__Rule__Group__5__Impl )
            // InternalRpgindividual.g:2981:2: rule__Rule__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalRpgindividual.g:2987:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__SumAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2991:1: ( ( ( rule__Rule__SumAssignment_5 ) ) )
            // InternalRpgindividual.g:2992:1: ( ( rule__Rule__SumAssignment_5 ) )
            {
            // InternalRpgindividual.g:2992:1: ( ( rule__Rule__SumAssignment_5 ) )
            // InternalRpgindividual.g:2993:2: ( rule__Rule__SumAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getSumAssignment_5()); 
            // InternalRpgindividual.g:2994:2: ( rule__Rule__SumAssignment_5 )
            // InternalRpgindividual.g:2994:3: rule__Rule__SumAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Rule__SumAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getSumAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group_0__0"
    // InternalRpgindividual.g:3003:1: rule__Rule__Group_0__0 : rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1 ;
    public final void rule__Rule__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3007:1: ( rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1 )
            // InternalRpgindividual.g:3008:2: rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1
            {
            pushFollow(FOLLOW_29);
            rule__Rule__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_0__0"


    // $ANTLR start "rule__Rule__Group_0__0__Impl"
    // InternalRpgindividual.g:3015:1: rule__Rule__Group_0__0__Impl : ( 'if' ) ;
    public final void rule__Rule__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3019:1: ( ( 'if' ) )
            // InternalRpgindividual.g:3020:1: ( 'if' )
            {
            // InternalRpgindividual.g:3020:1: ( 'if' )
            // InternalRpgindividual.g:3021:2: 'if'
            {
             before(grammarAccess.getRuleAccess().getIfKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getIfKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_0__0__Impl"


    // $ANTLR start "rule__Rule__Group_0__1"
    // InternalRpgindividual.g:3030:1: rule__Rule__Group_0__1 : rule__Rule__Group_0__1__Impl rule__Rule__Group_0__2 ;
    public final void rule__Rule__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3034:1: ( rule__Rule__Group_0__1__Impl rule__Rule__Group_0__2 )
            // InternalRpgindividual.g:3035:2: rule__Rule__Group_0__1__Impl rule__Rule__Group_0__2
            {
            pushFollow(FOLLOW_30);
            rule__Rule__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_0__1"


    // $ANTLR start "rule__Rule__Group_0__1__Impl"
    // InternalRpgindividual.g:3042:1: rule__Rule__Group_0__1__Impl : ( ( rule__Rule__OrAssignment_0_1 ) ) ;
    public final void rule__Rule__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3046:1: ( ( ( rule__Rule__OrAssignment_0_1 ) ) )
            // InternalRpgindividual.g:3047:1: ( ( rule__Rule__OrAssignment_0_1 ) )
            {
            // InternalRpgindividual.g:3047:1: ( ( rule__Rule__OrAssignment_0_1 ) )
            // InternalRpgindividual.g:3048:2: ( rule__Rule__OrAssignment_0_1 )
            {
             before(grammarAccess.getRuleAccess().getOrAssignment_0_1()); 
            // InternalRpgindividual.g:3049:2: ( rule__Rule__OrAssignment_0_1 )
            // InternalRpgindividual.g:3049:3: rule__Rule__OrAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__OrAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getOrAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_0__1__Impl"


    // $ANTLR start "rule__Rule__Group_0__2"
    // InternalRpgindividual.g:3057:1: rule__Rule__Group_0__2 : rule__Rule__Group_0__2__Impl ;
    public final void rule__Rule__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3061:1: ( rule__Rule__Group_0__2__Impl )
            // InternalRpgindividual.g:3062:2: rule__Rule__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_0__2"


    // $ANTLR start "rule__Rule__Group_0__2__Impl"
    // InternalRpgindividual.g:3068:1: rule__Rule__Group_0__2__Impl : ( 'then' ) ;
    public final void rule__Rule__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3072:1: ( ( 'then' ) )
            // InternalRpgindividual.g:3073:1: ( 'then' )
            {
            // InternalRpgindividual.g:3073:1: ( 'then' )
            // InternalRpgindividual.g:3074:2: 'then'
            {
             before(grammarAccess.getRuleAccess().getThenKeyword_0_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getThenKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_0__2__Impl"


    // $ANTLR start "rule__Entities__Group__0"
    // InternalRpgindividual.g:3084:1: rule__Entities__Group__0 : rule__Entities__Group__0__Impl rule__Entities__Group__1 ;
    public final void rule__Entities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3088:1: ( rule__Entities__Group__0__Impl rule__Entities__Group__1 )
            // InternalRpgindividual.g:3089:2: rule__Entities__Group__0__Impl rule__Entities__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Entities__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entities__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__0"


    // $ANTLR start "rule__Entities__Group__0__Impl"
    // InternalRpgindividual.g:3096:1: rule__Entities__Group__0__Impl : ( 'entities' ) ;
    public final void rule__Entities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3100:1: ( ( 'entities' ) )
            // InternalRpgindividual.g:3101:1: ( 'entities' )
            {
            // InternalRpgindividual.g:3101:1: ( 'entities' )
            // InternalRpgindividual.g:3102:2: 'entities'
            {
             before(grammarAccess.getEntitiesAccess().getEntitiesKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEntitiesAccess().getEntitiesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__0__Impl"


    // $ANTLR start "rule__Entities__Group__1"
    // InternalRpgindividual.g:3111:1: rule__Entities__Group__1 : rule__Entities__Group__1__Impl ;
    public final void rule__Entities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3115:1: ( rule__Entities__Group__1__Impl )
            // InternalRpgindividual.g:3116:2: rule__Entities__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entities__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__1"


    // $ANTLR start "rule__Entities__Group__1__Impl"
    // InternalRpgindividual.g:3122:1: rule__Entities__Group__1__Impl : ( ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* ) ) ;
    public final void rule__Entities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3126:1: ( ( ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* ) ) )
            // InternalRpgindividual.g:3127:1: ( ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:3127:1: ( ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* ) )
            // InternalRpgindividual.g:3128:2: ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* )
            {
            // InternalRpgindividual.g:3128:2: ( ( rule__Entities__EntityAssignment_1 ) )
            // InternalRpgindividual.g:3129:3: ( rule__Entities__EntityAssignment_1 )
            {
             before(grammarAccess.getEntitiesAccess().getEntityAssignment_1()); 
            // InternalRpgindividual.g:3130:3: ( rule__Entities__EntityAssignment_1 )
            // InternalRpgindividual.g:3130:4: rule__Entities__EntityAssignment_1
            {
            pushFollow(FOLLOW_32);
            rule__Entities__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesAccess().getEntityAssignment_1()); 

            }

            // InternalRpgindividual.g:3133:2: ( ( rule__Entities__EntityAssignment_1 )* )
            // InternalRpgindividual.g:3134:3: ( rule__Entities__EntityAssignment_1 )*
            {
             before(grammarAccess.getEntitiesAccess().getEntityAssignment_1()); 
            // InternalRpgindividual.g:3135:3: ( rule__Entities__EntityAssignment_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRpgindividual.g:3135:4: rule__Entities__EntityAssignment_1
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Entities__EntityAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getEntitiesAccess().getEntityAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__1__Impl"


    // $ANTLR start "rule__Death__Group__0"
    // InternalRpgindividual.g:3145:1: rule__Death__Group__0 : rule__Death__Group__0__Impl rule__Death__Group__1 ;
    public final void rule__Death__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3149:1: ( rule__Death__Group__0__Impl rule__Death__Group__1 )
            // InternalRpgindividual.g:3150:2: rule__Death__Group__0__Impl rule__Death__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Death__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Death__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Death__Group__0"


    // $ANTLR start "rule__Death__Group__0__Impl"
    // InternalRpgindividual.g:3157:1: rule__Death__Group__0__Impl : ( 'death' ) ;
    public final void rule__Death__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3161:1: ( ( 'death' ) )
            // InternalRpgindividual.g:3162:1: ( 'death' )
            {
            // InternalRpgindividual.g:3162:1: ( 'death' )
            // InternalRpgindividual.g:3163:2: 'death'
            {
             before(grammarAccess.getDeathAccess().getDeathKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDeathAccess().getDeathKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Death__Group__0__Impl"


    // $ANTLR start "rule__Death__Group__1"
    // InternalRpgindividual.g:3172:1: rule__Death__Group__1 : rule__Death__Group__1__Impl rule__Death__Group__2 ;
    public final void rule__Death__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3176:1: ( rule__Death__Group__1__Impl rule__Death__Group__2 )
            // InternalRpgindividual.g:3177:2: rule__Death__Group__1__Impl rule__Death__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Death__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Death__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Death__Group__1"


    // $ANTLR start "rule__Death__Group__1__Impl"
    // InternalRpgindividual.g:3184:1: rule__Death__Group__1__Impl : ( 'when' ) ;
    public final void rule__Death__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3188:1: ( ( 'when' ) )
            // InternalRpgindividual.g:3189:1: ( 'when' )
            {
            // InternalRpgindividual.g:3189:1: ( 'when' )
            // InternalRpgindividual.g:3190:2: 'when'
            {
             before(grammarAccess.getDeathAccess().getWhenKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDeathAccess().getWhenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Death__Group__1__Impl"


    // $ANTLR start "rule__Death__Group__2"
    // InternalRpgindividual.g:3199:1: rule__Death__Group__2 : rule__Death__Group__2__Impl ;
    public final void rule__Death__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3203:1: ( rule__Death__Group__2__Impl )
            // InternalRpgindividual.g:3204:2: rule__Death__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Death__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Death__Group__2"


    // $ANTLR start "rule__Death__Group__2__Impl"
    // InternalRpgindividual.g:3210:1: rule__Death__Group__2__Impl : ( ( rule__Death__LogAssignment_2 ) ) ;
    public final void rule__Death__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3214:1: ( ( ( rule__Death__LogAssignment_2 ) ) )
            // InternalRpgindividual.g:3215:1: ( ( rule__Death__LogAssignment_2 ) )
            {
            // InternalRpgindividual.g:3215:1: ( ( rule__Death__LogAssignment_2 ) )
            // InternalRpgindividual.g:3216:2: ( rule__Death__LogAssignment_2 )
            {
             before(grammarAccess.getDeathAccess().getLogAssignment_2()); 
            // InternalRpgindividual.g:3217:2: ( rule__Death__LogAssignment_2 )
            // InternalRpgindividual.g:3217:3: rule__Death__LogAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Death__LogAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeathAccess().getLogAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Death__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalRpgindividual.g:3226:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3230:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalRpgindividual.g:3231:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalRpgindividual.g:3238:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3242:1: ( ( 'entity' ) )
            // InternalRpgindividual.g:3243:1: ( 'entity' )
            {
            // InternalRpgindividual.g:3243:1: ( 'entity' )
            // InternalRpgindividual.g:3244:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalRpgindividual.g:3253:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3257:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalRpgindividual.g:3258:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalRpgindividual.g:3265:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3269:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:3270:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:3270:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalRpgindividual.g:3271:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:3272:2: ( rule__Entity__NameAssignment_1 )
            // InternalRpgindividual.g:3272:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalRpgindividual.g:3280:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3284:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalRpgindividual.g:3285:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalRpgindividual.g:3292:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__ETypeAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3296:1: ( ( ( rule__Entity__ETypeAssignment_2 ) ) )
            // InternalRpgindividual.g:3297:1: ( ( rule__Entity__ETypeAssignment_2 ) )
            {
            // InternalRpgindividual.g:3297:1: ( ( rule__Entity__ETypeAssignment_2 ) )
            // InternalRpgindividual.g:3298:2: ( rule__Entity__ETypeAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getETypeAssignment_2()); 
            // InternalRpgindividual.g:3299:2: ( rule__Entity__ETypeAssignment_2 )
            // InternalRpgindividual.g:3299:3: rule__Entity__ETypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__ETypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getETypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalRpgindividual.g:3307:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3311:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalRpgindividual.g:3312:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalRpgindividual.g:3319:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3323:1: ( ( ( rule__Entity__AttAssignment_3 )* ) )
            // InternalRpgindividual.g:3324:1: ( ( rule__Entity__AttAssignment_3 )* )
            {
            // InternalRpgindividual.g:3324:1: ( ( rule__Entity__AttAssignment_3 )* )
            // InternalRpgindividual.g:3325:2: ( rule__Entity__AttAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttAssignment_3()); 
            // InternalRpgindividual.g:3326:2: ( rule__Entity__AttAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==21) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRpgindividual.g:3326:3: rule__Entity__AttAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Entity__AttAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalRpgindividual.g:3334:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3338:1: ( rule__Entity__Group__4__Impl )
            // InternalRpgindividual.g:3339:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalRpgindividual.g:3345:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__EMovesAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3349:1: ( ( ( rule__Entity__EMovesAssignment_4 ) ) )
            // InternalRpgindividual.g:3350:1: ( ( rule__Entity__EMovesAssignment_4 ) )
            {
            // InternalRpgindividual.g:3350:1: ( ( rule__Entity__EMovesAssignment_4 ) )
            // InternalRpgindividual.g:3351:2: ( rule__Entity__EMovesAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getEMovesAssignment_4()); 
            // InternalRpgindividual.g:3352:2: ( rule__Entity__EMovesAssignment_4 )
            // InternalRpgindividual.g:3352:3: rule__Entity__EMovesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Entity__EMovesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getEMovesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__EntityMoves__Group__0"
    // InternalRpgindividual.g:3361:1: rule__EntityMoves__Group__0 : rule__EntityMoves__Group__0__Impl rule__EntityMoves__Group__1 ;
    public final void rule__EntityMoves__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3365:1: ( rule__EntityMoves__Group__0__Impl rule__EntityMoves__Group__1 )
            // InternalRpgindividual.g:3366:2: rule__EntityMoves__Group__0__Impl rule__EntityMoves__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EntityMoves__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityMoves__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoves__Group__0"


    // $ANTLR start "rule__EntityMoves__Group__0__Impl"
    // InternalRpgindividual.g:3373:1: rule__EntityMoves__Group__0__Impl : ( 'move' ) ;
    public final void rule__EntityMoves__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3377:1: ( ( 'move' ) )
            // InternalRpgindividual.g:3378:1: ( 'move' )
            {
            // InternalRpgindividual.g:3378:1: ( 'move' )
            // InternalRpgindividual.g:3379:2: 'move'
            {
             before(grammarAccess.getEntityMovesAccess().getMoveKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEntityMovesAccess().getMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoves__Group__0__Impl"


    // $ANTLR start "rule__EntityMoves__Group__1"
    // InternalRpgindividual.g:3388:1: rule__EntityMoves__Group__1 : rule__EntityMoves__Group__1__Impl ;
    public final void rule__EntityMoves__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3392:1: ( rule__EntityMoves__Group__1__Impl )
            // InternalRpgindividual.g:3393:2: rule__EntityMoves__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoves__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoves__Group__1"


    // $ANTLR start "rule__EntityMoves__Group__1__Impl"
    // InternalRpgindividual.g:3399:1: rule__EntityMoves__Group__1__Impl : ( ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* ) ) ;
    public final void rule__EntityMoves__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3403:1: ( ( ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* ) ) )
            // InternalRpgindividual.g:3404:1: ( ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:3404:1: ( ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* ) )
            // InternalRpgindividual.g:3405:2: ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* )
            {
            // InternalRpgindividual.g:3405:2: ( ( rule__EntityMoves__MoveAssignment_1 ) )
            // InternalRpgindividual.g:3406:3: ( rule__EntityMoves__MoveAssignment_1 )
            {
             before(grammarAccess.getEntityMovesAccess().getMoveAssignment_1()); 
            // InternalRpgindividual.g:3407:3: ( rule__EntityMoves__MoveAssignment_1 )
            // InternalRpgindividual.g:3407:4: rule__EntityMoves__MoveAssignment_1
            {
            pushFollow(FOLLOW_12);
            rule__EntityMoves__MoveAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityMovesAccess().getMoveAssignment_1()); 

            }

            // InternalRpgindividual.g:3410:2: ( ( rule__EntityMoves__MoveAssignment_1 )* )
            // InternalRpgindividual.g:3411:3: ( rule__EntityMoves__MoveAssignment_1 )*
            {
             before(grammarAccess.getEntityMovesAccess().getMoveAssignment_1()); 
            // InternalRpgindividual.g:3412:3: ( rule__EntityMoves__MoveAssignment_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRpgindividual.g:3412:4: rule__EntityMoves__MoveAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__EntityMoves__MoveAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getEntityMovesAccess().getMoveAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoves__Group__1__Impl"


    // $ANTLR start "rule__EntityMoveModifier__Group__0"
    // InternalRpgindividual.g:3422:1: rule__EntityMoveModifier__Group__0 : rule__EntityMoveModifier__Group__0__Impl rule__EntityMoveModifier__Group__1 ;
    public final void rule__EntityMoveModifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3426:1: ( rule__EntityMoveModifier__Group__0__Impl rule__EntityMoveModifier__Group__1 )
            // InternalRpgindividual.g:3427:2: rule__EntityMoveModifier__Group__0__Impl rule__EntityMoveModifier__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__EntityMoveModifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityMoveModifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveModifier__Group__0"


    // $ANTLR start "rule__EntityMoveModifier__Group__0__Impl"
    // InternalRpgindividual.g:3434:1: rule__EntityMoveModifier__Group__0__Impl : ( ( rule__EntityMoveModifier__MoveNameAssignment_0 ) ) ;
    public final void rule__EntityMoveModifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3438:1: ( ( ( rule__EntityMoveModifier__MoveNameAssignment_0 ) ) )
            // InternalRpgindividual.g:3439:1: ( ( rule__EntityMoveModifier__MoveNameAssignment_0 ) )
            {
            // InternalRpgindividual.g:3439:1: ( ( rule__EntityMoveModifier__MoveNameAssignment_0 ) )
            // InternalRpgindividual.g:3440:2: ( rule__EntityMoveModifier__MoveNameAssignment_0 )
            {
             before(grammarAccess.getEntityMoveModifierAccess().getMoveNameAssignment_0()); 
            // InternalRpgindividual.g:3441:2: ( rule__EntityMoveModifier__MoveNameAssignment_0 )
            // InternalRpgindividual.g:3441:3: rule__EntityMoveModifier__MoveNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoveModifier__MoveNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityMoveModifierAccess().getMoveNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveModifier__Group__0__Impl"


    // $ANTLR start "rule__EntityMoveModifier__Group__1"
    // InternalRpgindividual.g:3449:1: rule__EntityMoveModifier__Group__1 : rule__EntityMoveModifier__Group__1__Impl rule__EntityMoveModifier__Group__2 ;
    public final void rule__EntityMoveModifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3453:1: ( rule__EntityMoveModifier__Group__1__Impl rule__EntityMoveModifier__Group__2 )
            // InternalRpgindividual.g:3454:2: rule__EntityMoveModifier__Group__1__Impl rule__EntityMoveModifier__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__EntityMoveModifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityMoveModifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveModifier__Group__1"


    // $ANTLR start "rule__EntityMoveModifier__Group__1__Impl"
    // InternalRpgindividual.g:3461:1: rule__EntityMoveModifier__Group__1__Impl : ( '(' ) ;
    public final void rule__EntityMoveModifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3465:1: ( ( '(' ) )
            // InternalRpgindividual.g:3466:1: ( '(' )
            {
            // InternalRpgindividual.g:3466:1: ( '(' )
            // InternalRpgindividual.g:3467:2: '('
            {
             before(grammarAccess.getEntityMoveModifierAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEntityMoveModifierAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveModifier__Group__1__Impl"


    // $ANTLR start "rule__EntityMoveModifier__Group__2"
    // InternalRpgindividual.g:3476:1: rule__EntityMoveModifier__Group__2 : rule__EntityMoveModifier__Group__2__Impl rule__EntityMoveModifier__Group__3 ;
    public final void rule__EntityMoveModifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3480:1: ( rule__EntityMoveModifier__Group__2__Impl rule__EntityMoveModifier__Group__3 )
            // InternalRpgindividual.g:3481:2: rule__EntityMoveModifier__Group__2__Impl rule__EntityMoveModifier__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__EntityMoveModifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityMoveModifier__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveModifier__Group__2"


    // $ANTLR start "rule__EntityMoveModifier__Group__2__Impl"
    // InternalRpgindividual.g:3488:1: rule__EntityMoveModifier__Group__2__Impl : ( ( rule__EntityMoveModifier__MoveModificationAssignment_2 )* ) ;
    public final void rule__EntityMoveModifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3492:1: ( ( ( rule__EntityMoveModifier__MoveModificationAssignment_2 )* ) )
            // InternalRpgindividual.g:3493:1: ( ( rule__EntityMoveModifier__MoveModificationAssignment_2 )* )
            {
            // InternalRpgindividual.g:3493:1: ( ( rule__EntityMoveModifier__MoveModificationAssignment_2 )* )
            // InternalRpgindividual.g:3494:2: ( rule__EntityMoveModifier__MoveModificationAssignment_2 )*
            {
             before(grammarAccess.getEntityMoveModifierAccess().getMoveModificationAssignment_2()); 
            // InternalRpgindividual.g:3495:2: ( rule__EntityMoveModifier__MoveModificationAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRpgindividual.g:3495:3: rule__EntityMoveModifier__MoveModificationAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__EntityMoveModifier__MoveModificationAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getEntityMoveModifierAccess().getMoveModificationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveModifier__Group__2__Impl"


    // $ANTLR start "rule__EntityMoveModifier__Group__3"
    // InternalRpgindividual.g:3503:1: rule__EntityMoveModifier__Group__3 : rule__EntityMoveModifier__Group__3__Impl ;
    public final void rule__EntityMoveModifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3507:1: ( rule__EntityMoveModifier__Group__3__Impl )
            // InternalRpgindividual.g:3508:2: rule__EntityMoveModifier__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoveModifier__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveModifier__Group__3"


    // $ANTLR start "rule__EntityMoveModifier__Group__3__Impl"
    // InternalRpgindividual.g:3514:1: rule__EntityMoveModifier__Group__3__Impl : ( ')' ) ;
    public final void rule__EntityMoveModifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3518:1: ( ( ')' ) )
            // InternalRpgindividual.g:3519:1: ( ')' )
            {
            // InternalRpgindividual.g:3519:1: ( ')' )
            // InternalRpgindividual.g:3520:2: ')'
            {
             before(grammarAccess.getEntityMoveModifierAccess().getRightParenthesisKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEntityMoveModifierAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveModifier__Group__3__Impl"


    // $ANTLR start "rule__EntityMoveMultiplier__Group__0"
    // InternalRpgindividual.g:3530:1: rule__EntityMoveMultiplier__Group__0 : rule__EntityMoveMultiplier__Group__0__Impl rule__EntityMoveMultiplier__Group__1 ;
    public final void rule__EntityMoveMultiplier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3534:1: ( rule__EntityMoveMultiplier__Group__0__Impl rule__EntityMoveMultiplier__Group__1 )
            // InternalRpgindividual.g:3535:2: rule__EntityMoveMultiplier__Group__0__Impl rule__EntityMoveMultiplier__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__EntityMoveMultiplier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityMoveMultiplier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveMultiplier__Group__0"


    // $ANTLR start "rule__EntityMoveMultiplier__Group__0__Impl"
    // InternalRpgindividual.g:3542:1: rule__EntityMoveMultiplier__Group__0__Impl : ( ( rule__EntityMoveMultiplier__AttributeAssignment_0 ) ) ;
    public final void rule__EntityMoveMultiplier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3546:1: ( ( ( rule__EntityMoveMultiplier__AttributeAssignment_0 ) ) )
            // InternalRpgindividual.g:3547:1: ( ( rule__EntityMoveMultiplier__AttributeAssignment_0 ) )
            {
            // InternalRpgindividual.g:3547:1: ( ( rule__EntityMoveMultiplier__AttributeAssignment_0 ) )
            // InternalRpgindividual.g:3548:2: ( rule__EntityMoveMultiplier__AttributeAssignment_0 )
            {
             before(grammarAccess.getEntityMoveMultiplierAccess().getAttributeAssignment_0()); 
            // InternalRpgindividual.g:3549:2: ( rule__EntityMoveMultiplier__AttributeAssignment_0 )
            // InternalRpgindividual.g:3549:3: rule__EntityMoveMultiplier__AttributeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoveMultiplier__AttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityMoveMultiplierAccess().getAttributeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveMultiplier__Group__0__Impl"


    // $ANTLR start "rule__EntityMoveMultiplier__Group__1"
    // InternalRpgindividual.g:3557:1: rule__EntityMoveMultiplier__Group__1 : rule__EntityMoveMultiplier__Group__1__Impl rule__EntityMoveMultiplier__Group__2 ;
    public final void rule__EntityMoveMultiplier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3561:1: ( rule__EntityMoveMultiplier__Group__1__Impl rule__EntityMoveMultiplier__Group__2 )
            // InternalRpgindividual.g:3562:2: rule__EntityMoveMultiplier__Group__1__Impl rule__EntityMoveMultiplier__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__EntityMoveMultiplier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityMoveMultiplier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveMultiplier__Group__1"


    // $ANTLR start "rule__EntityMoveMultiplier__Group__1__Impl"
    // InternalRpgindividual.g:3569:1: rule__EntityMoveMultiplier__Group__1__Impl : ( '*' ) ;
    public final void rule__EntityMoveMultiplier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3573:1: ( ( '*' ) )
            // InternalRpgindividual.g:3574:1: ( '*' )
            {
            // InternalRpgindividual.g:3574:1: ( '*' )
            // InternalRpgindividual.g:3575:2: '*'
            {
             before(grammarAccess.getEntityMoveMultiplierAccess().getAsteriskKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEntityMoveMultiplierAccess().getAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveMultiplier__Group__1__Impl"


    // $ANTLR start "rule__EntityMoveMultiplier__Group__2"
    // InternalRpgindividual.g:3584:1: rule__EntityMoveMultiplier__Group__2 : rule__EntityMoveMultiplier__Group__2__Impl ;
    public final void rule__EntityMoveMultiplier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3588:1: ( rule__EntityMoveMultiplier__Group__2__Impl )
            // InternalRpgindividual.g:3589:2: rule__EntityMoveMultiplier__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoveMultiplier__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveMultiplier__Group__2"


    // $ANTLR start "rule__EntityMoveMultiplier__Group__2__Impl"
    // InternalRpgindividual.g:3595:1: rule__EntityMoveMultiplier__Group__2__Impl : ( ( rule__EntityMoveMultiplier__MultiplierAssignment_2 ) ) ;
    public final void rule__EntityMoveMultiplier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3599:1: ( ( ( rule__EntityMoveMultiplier__MultiplierAssignment_2 ) ) )
            // InternalRpgindividual.g:3600:1: ( ( rule__EntityMoveMultiplier__MultiplierAssignment_2 ) )
            {
            // InternalRpgindividual.g:3600:1: ( ( rule__EntityMoveMultiplier__MultiplierAssignment_2 ) )
            // InternalRpgindividual.g:3601:2: ( rule__EntityMoveMultiplier__MultiplierAssignment_2 )
            {
             before(grammarAccess.getEntityMoveMultiplierAccess().getMultiplierAssignment_2()); 
            // InternalRpgindividual.g:3602:2: ( rule__EntityMoveMultiplier__MultiplierAssignment_2 )
            // InternalRpgindividual.g:3602:3: rule__EntityMoveMultiplier__MultiplierAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoveMultiplier__MultiplierAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityMoveMultiplierAccess().getMultiplierAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveMultiplier__Group__2__Impl"


    // $ANTLR start "rule__Teams__Group__0"
    // InternalRpgindividual.g:3611:1: rule__Teams__Group__0 : rule__Teams__Group__0__Impl rule__Teams__Group__1 ;
    public final void rule__Teams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3615:1: ( rule__Teams__Group__0__Impl rule__Teams__Group__1 )
            // InternalRpgindividual.g:3616:2: rule__Teams__Group__0__Impl rule__Teams__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Teams__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teams__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teams__Group__0"


    // $ANTLR start "rule__Teams__Group__0__Impl"
    // InternalRpgindividual.g:3623:1: rule__Teams__Group__0__Impl : ( 'teams' ) ;
    public final void rule__Teams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3627:1: ( ( 'teams' ) )
            // InternalRpgindividual.g:3628:1: ( 'teams' )
            {
            // InternalRpgindividual.g:3628:1: ( 'teams' )
            // InternalRpgindividual.g:3629:2: 'teams'
            {
             before(grammarAccess.getTeamsAccess().getTeamsKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTeamsAccess().getTeamsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teams__Group__0__Impl"


    // $ANTLR start "rule__Teams__Group__1"
    // InternalRpgindividual.g:3638:1: rule__Teams__Group__1 : rule__Teams__Group__1__Impl ;
    public final void rule__Teams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3642:1: ( rule__Teams__Group__1__Impl )
            // InternalRpgindividual.g:3643:2: rule__Teams__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teams__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teams__Group__1"


    // $ANTLR start "rule__Teams__Group__1__Impl"
    // InternalRpgindividual.g:3649:1: rule__Teams__Group__1__Impl : ( ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* ) ) ;
    public final void rule__Teams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3653:1: ( ( ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* ) ) )
            // InternalRpgindividual.g:3654:1: ( ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:3654:1: ( ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* ) )
            // InternalRpgindividual.g:3655:2: ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* )
            {
            // InternalRpgindividual.g:3655:2: ( ( rule__Teams__TeamAssignment_1 ) )
            // InternalRpgindividual.g:3656:3: ( rule__Teams__TeamAssignment_1 )
            {
             before(grammarAccess.getTeamsAccess().getTeamAssignment_1()); 
            // InternalRpgindividual.g:3657:3: ( rule__Teams__TeamAssignment_1 )
            // InternalRpgindividual.g:3657:4: rule__Teams__TeamAssignment_1
            {
            pushFollow(FOLLOW_39);
            rule__Teams__TeamAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTeamsAccess().getTeamAssignment_1()); 

            }

            // InternalRpgindividual.g:3660:2: ( ( rule__Teams__TeamAssignment_1 )* )
            // InternalRpgindividual.g:3661:3: ( rule__Teams__TeamAssignment_1 )*
            {
             before(grammarAccess.getTeamsAccess().getTeamAssignment_1()); 
            // InternalRpgindividual.g:3662:3: ( rule__Teams__TeamAssignment_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==43) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalRpgindividual.g:3662:4: rule__Teams__TeamAssignment_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Teams__TeamAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getTeamsAccess().getTeamAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teams__Group__1__Impl"


    // $ANTLR start "rule__Team__Group__0"
    // InternalRpgindividual.g:3672:1: rule__Team__Group__0 : rule__Team__Group__0__Impl rule__Team__Group__1 ;
    public final void rule__Team__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3676:1: ( rule__Team__Group__0__Impl rule__Team__Group__1 )
            // InternalRpgindividual.g:3677:2: rule__Team__Group__0__Impl rule__Team__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Team__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__0"


    // $ANTLR start "rule__Team__Group__0__Impl"
    // InternalRpgindividual.g:3684:1: rule__Team__Group__0__Impl : ( 'team' ) ;
    public final void rule__Team__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3688:1: ( ( 'team' ) )
            // InternalRpgindividual.g:3689:1: ( 'team' )
            {
            // InternalRpgindividual.g:3689:1: ( 'team' )
            // InternalRpgindividual.g:3690:2: 'team'
            {
             before(grammarAccess.getTeamAccess().getTeamKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getTeamKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__0__Impl"


    // $ANTLR start "rule__Team__Group__1"
    // InternalRpgindividual.g:3699:1: rule__Team__Group__1 : rule__Team__Group__1__Impl rule__Team__Group__2 ;
    public final void rule__Team__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3703:1: ( rule__Team__Group__1__Impl rule__Team__Group__2 )
            // InternalRpgindividual.g:3704:2: rule__Team__Group__1__Impl rule__Team__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__Team__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__1"


    // $ANTLR start "rule__Team__Group__1__Impl"
    // InternalRpgindividual.g:3711:1: rule__Team__Group__1__Impl : ( ( rule__Team__NameAssignment_1 ) ) ;
    public final void rule__Team__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3715:1: ( ( ( rule__Team__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:3716:1: ( ( rule__Team__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:3716:1: ( ( rule__Team__NameAssignment_1 ) )
            // InternalRpgindividual.g:3717:2: ( rule__Team__NameAssignment_1 )
            {
             before(grammarAccess.getTeamAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:3718:2: ( rule__Team__NameAssignment_1 )
            // InternalRpgindividual.g:3718:3: rule__Team__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Team__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__1__Impl"


    // $ANTLR start "rule__Team__Group__2"
    // InternalRpgindividual.g:3726:1: rule__Team__Group__2 : rule__Team__Group__2__Impl ;
    public final void rule__Team__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3730:1: ( rule__Team__Group__2__Impl )
            // InternalRpgindividual.g:3731:2: rule__Team__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Team__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__2"


    // $ANTLR start "rule__Team__Group__2__Impl"
    // InternalRpgindividual.g:3737:1: rule__Team__Group__2__Impl : ( ( rule__Team__MembersAssignment_2 ) ) ;
    public final void rule__Team__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3741:1: ( ( ( rule__Team__MembersAssignment_2 ) ) )
            // InternalRpgindividual.g:3742:1: ( ( rule__Team__MembersAssignment_2 ) )
            {
            // InternalRpgindividual.g:3742:1: ( ( rule__Team__MembersAssignment_2 ) )
            // InternalRpgindividual.g:3743:2: ( rule__Team__MembersAssignment_2 )
            {
             before(grammarAccess.getTeamAccess().getMembersAssignment_2()); 
            // InternalRpgindividual.g:3744:2: ( rule__Team__MembersAssignment_2 )
            // InternalRpgindividual.g:3744:3: rule__Team__MembersAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Team__MembersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getMembersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__2__Impl"


    // $ANTLR start "rule__Members__Group__0"
    // InternalRpgindividual.g:3753:1: rule__Members__Group__0 : rule__Members__Group__0__Impl rule__Members__Group__1 ;
    public final void rule__Members__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3757:1: ( rule__Members__Group__0__Impl rule__Members__Group__1 )
            // InternalRpgindividual.g:3758:2: rule__Members__Group__0__Impl rule__Members__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Members__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Members__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Members__Group__0"


    // $ANTLR start "rule__Members__Group__0__Impl"
    // InternalRpgindividual.g:3765:1: rule__Members__Group__0__Impl : ( 'members' ) ;
    public final void rule__Members__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3769:1: ( ( 'members' ) )
            // InternalRpgindividual.g:3770:1: ( 'members' )
            {
            // InternalRpgindividual.g:3770:1: ( 'members' )
            // InternalRpgindividual.g:3771:2: 'members'
            {
             before(grammarAccess.getMembersAccess().getMembersKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMembersAccess().getMembersKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Members__Group__0__Impl"


    // $ANTLR start "rule__Members__Group__1"
    // InternalRpgindividual.g:3780:1: rule__Members__Group__1 : rule__Members__Group__1__Impl ;
    public final void rule__Members__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3784:1: ( rule__Members__Group__1__Impl )
            // InternalRpgindividual.g:3785:2: rule__Members__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Members__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Members__Group__1"


    // $ANTLR start "rule__Members__Group__1__Impl"
    // InternalRpgindividual.g:3791:1: rule__Members__Group__1__Impl : ( ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* ) ) ;
    public final void rule__Members__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3795:1: ( ( ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* ) ) )
            // InternalRpgindividual.g:3796:1: ( ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:3796:1: ( ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* ) )
            // InternalRpgindividual.g:3797:2: ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* )
            {
            // InternalRpgindividual.g:3797:2: ( ( rule__Members__EntityAssignment_1 ) )
            // InternalRpgindividual.g:3798:3: ( rule__Members__EntityAssignment_1 )
            {
             before(grammarAccess.getMembersAccess().getEntityAssignment_1()); 
            // InternalRpgindividual.g:3799:3: ( rule__Members__EntityAssignment_1 )
            // InternalRpgindividual.g:3799:4: rule__Members__EntityAssignment_1
            {
            pushFollow(FOLLOW_12);
            rule__Members__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMembersAccess().getEntityAssignment_1()); 

            }

            // InternalRpgindividual.g:3802:2: ( ( rule__Members__EntityAssignment_1 )* )
            // InternalRpgindividual.g:3803:3: ( rule__Members__EntityAssignment_1 )*
            {
             before(grammarAccess.getMembersAccess().getEntityAssignment_1()); 
            // InternalRpgindividual.g:3804:3: ( rule__Members__EntityAssignment_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRpgindividual.g:3804:4: rule__Members__EntityAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Members__EntityAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getMembersAccess().getEntityAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Members__Group__1__Impl"


    // $ANTLR start "rule__ORcondition__Group__0"
    // InternalRpgindividual.g:3814:1: rule__ORcondition__Group__0 : rule__ORcondition__Group__0__Impl rule__ORcondition__Group__1 ;
    public final void rule__ORcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3818:1: ( rule__ORcondition__Group__0__Impl rule__ORcondition__Group__1 )
            // InternalRpgindividual.g:3819:2: rule__ORcondition__Group__0__Impl rule__ORcondition__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__ORcondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ORcondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORcondition__Group__0"


    // $ANTLR start "rule__ORcondition__Group__0__Impl"
    // InternalRpgindividual.g:3826:1: rule__ORcondition__Group__0__Impl : ( ruleANDcondition ) ;
    public final void rule__ORcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3830:1: ( ( ruleANDcondition ) )
            // InternalRpgindividual.g:3831:1: ( ruleANDcondition )
            {
            // InternalRpgindividual.g:3831:1: ( ruleANDcondition )
            // InternalRpgindividual.g:3832:2: ruleANDcondition
            {
             before(grammarAccess.getORconditionAccess().getANDconditionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleANDcondition();

            state._fsp--;

             after(grammarAccess.getORconditionAccess().getANDconditionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORcondition__Group__0__Impl"


    // $ANTLR start "rule__ORcondition__Group__1"
    // InternalRpgindividual.g:3841:1: rule__ORcondition__Group__1 : rule__ORcondition__Group__1__Impl ;
    public final void rule__ORcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3845:1: ( rule__ORcondition__Group__1__Impl )
            // InternalRpgindividual.g:3846:2: rule__ORcondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ORcondition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORcondition__Group__1"


    // $ANTLR start "rule__ORcondition__Group__1__Impl"
    // InternalRpgindividual.g:3852:1: rule__ORcondition__Group__1__Impl : ( ( rule__ORcondition__Group_1__0 )* ) ;
    public final void rule__ORcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3856:1: ( ( ( rule__ORcondition__Group_1__0 )* ) )
            // InternalRpgindividual.g:3857:1: ( ( rule__ORcondition__Group_1__0 )* )
            {
            // InternalRpgindividual.g:3857:1: ( ( rule__ORcondition__Group_1__0 )* )
            // InternalRpgindividual.g:3858:2: ( rule__ORcondition__Group_1__0 )*
            {
             before(grammarAccess.getORconditionAccess().getGroup_1()); 
            // InternalRpgindividual.g:3859:2: ( rule__ORcondition__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==45) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalRpgindividual.g:3859:3: rule__ORcondition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__ORcondition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getORconditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORcondition__Group__1__Impl"


    // $ANTLR start "rule__ORcondition__Group_1__0"
    // InternalRpgindividual.g:3868:1: rule__ORcondition__Group_1__0 : rule__ORcondition__Group_1__0__Impl rule__ORcondition__Group_1__1 ;
    public final void rule__ORcondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3872:1: ( rule__ORcondition__Group_1__0__Impl rule__ORcondition__Group_1__1 )
            // InternalRpgindividual.g:3873:2: rule__ORcondition__Group_1__0__Impl rule__ORcondition__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__ORcondition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ORcondition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORcondition__Group_1__0"


    // $ANTLR start "rule__ORcondition__Group_1__0__Impl"
    // InternalRpgindividual.g:3880:1: rule__ORcondition__Group_1__0__Impl : ( 'OR' ) ;
    public final void rule__ORcondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3884:1: ( ( 'OR' ) )
            // InternalRpgindividual.g:3885:1: ( 'OR' )
            {
            // InternalRpgindividual.g:3885:1: ( 'OR' )
            // InternalRpgindividual.g:3886:2: 'OR'
            {
             before(grammarAccess.getORconditionAccess().getORKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getORconditionAccess().getORKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORcondition__Group_1__0__Impl"


    // $ANTLR start "rule__ORcondition__Group_1__1"
    // InternalRpgindividual.g:3895:1: rule__ORcondition__Group_1__1 : rule__ORcondition__Group_1__1__Impl rule__ORcondition__Group_1__2 ;
    public final void rule__ORcondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3899:1: ( rule__ORcondition__Group_1__1__Impl rule__ORcondition__Group_1__2 )
            // InternalRpgindividual.g:3900:2: rule__ORcondition__Group_1__1__Impl rule__ORcondition__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__ORcondition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ORcondition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORcondition__Group_1__1"


    // $ANTLR start "rule__ORcondition__Group_1__1__Impl"
    // InternalRpgindividual.g:3907:1: rule__ORcondition__Group_1__1__Impl : ( () ) ;
    public final void rule__ORcondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3911:1: ( ( () ) )
            // InternalRpgindividual.g:3912:1: ( () )
            {
            // InternalRpgindividual.g:3912:1: ( () )
            // InternalRpgindividual.g:3913:2: ()
            {
             before(grammarAccess.getORconditionAccess().getOrLeftAction_1_1()); 
            // InternalRpgindividual.g:3914:2: ()
            // InternalRpgindividual.g:3914:3: 
            {
            }

             after(grammarAccess.getORconditionAccess().getOrLeftAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORcondition__Group_1__1__Impl"


    // $ANTLR start "rule__ORcondition__Group_1__2"
    // InternalRpgindividual.g:3922:1: rule__ORcondition__Group_1__2 : rule__ORcondition__Group_1__2__Impl ;
    public final void rule__ORcondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3926:1: ( rule__ORcondition__Group_1__2__Impl )
            // InternalRpgindividual.g:3927:2: rule__ORcondition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ORcondition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORcondition__Group_1__2"


    // $ANTLR start "rule__ORcondition__Group_1__2__Impl"
    // InternalRpgindividual.g:3933:1: rule__ORcondition__Group_1__2__Impl : ( ( rule__ORcondition__RightAssignment_1_2 ) ) ;
    public final void rule__ORcondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3937:1: ( ( ( rule__ORcondition__RightAssignment_1_2 ) ) )
            // InternalRpgindividual.g:3938:1: ( ( rule__ORcondition__RightAssignment_1_2 ) )
            {
            // InternalRpgindividual.g:3938:1: ( ( rule__ORcondition__RightAssignment_1_2 ) )
            // InternalRpgindividual.g:3939:2: ( rule__ORcondition__RightAssignment_1_2 )
            {
             before(grammarAccess.getORconditionAccess().getRightAssignment_1_2()); 
            // InternalRpgindividual.g:3940:2: ( rule__ORcondition__RightAssignment_1_2 )
            // InternalRpgindividual.g:3940:3: rule__ORcondition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ORcondition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getORconditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORcondition__Group_1__2__Impl"


    // $ANTLR start "rule__ANDcondition__Group__0"
    // InternalRpgindividual.g:3949:1: rule__ANDcondition__Group__0 : rule__ANDcondition__Group__0__Impl rule__ANDcondition__Group__1 ;
    public final void rule__ANDcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3953:1: ( rule__ANDcondition__Group__0__Impl rule__ANDcondition__Group__1 )
            // InternalRpgindividual.g:3954:2: rule__ANDcondition__Group__0__Impl rule__ANDcondition__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__ANDcondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANDcondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDcondition__Group__0"


    // $ANTLR start "rule__ANDcondition__Group__0__Impl"
    // InternalRpgindividual.g:3961:1: rule__ANDcondition__Group__0__Impl : ( ruleStatement ) ;
    public final void rule__ANDcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3965:1: ( ( ruleStatement ) )
            // InternalRpgindividual.g:3966:1: ( ruleStatement )
            {
            // InternalRpgindividual.g:3966:1: ( ruleStatement )
            // InternalRpgindividual.g:3967:2: ruleStatement
            {
             before(grammarAccess.getANDconditionAccess().getStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getANDconditionAccess().getStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDcondition__Group__0__Impl"


    // $ANTLR start "rule__ANDcondition__Group__1"
    // InternalRpgindividual.g:3976:1: rule__ANDcondition__Group__1 : rule__ANDcondition__Group__1__Impl ;
    public final void rule__ANDcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3980:1: ( rule__ANDcondition__Group__1__Impl )
            // InternalRpgindividual.g:3981:2: rule__ANDcondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ANDcondition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDcondition__Group__1"


    // $ANTLR start "rule__ANDcondition__Group__1__Impl"
    // InternalRpgindividual.g:3987:1: rule__ANDcondition__Group__1__Impl : ( ( rule__ANDcondition__Group_1__0 )* ) ;
    public final void rule__ANDcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3991:1: ( ( ( rule__ANDcondition__Group_1__0 )* ) )
            // InternalRpgindividual.g:3992:1: ( ( rule__ANDcondition__Group_1__0 )* )
            {
            // InternalRpgindividual.g:3992:1: ( ( rule__ANDcondition__Group_1__0 )* )
            // InternalRpgindividual.g:3993:2: ( rule__ANDcondition__Group_1__0 )*
            {
             before(grammarAccess.getANDconditionAccess().getGroup_1()); 
            // InternalRpgindividual.g:3994:2: ( rule__ANDcondition__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==46) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRpgindividual.g:3994:3: rule__ANDcondition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__ANDcondition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getANDconditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDcondition__Group__1__Impl"


    // $ANTLR start "rule__ANDcondition__Group_1__0"
    // InternalRpgindividual.g:4003:1: rule__ANDcondition__Group_1__0 : rule__ANDcondition__Group_1__0__Impl rule__ANDcondition__Group_1__1 ;
    public final void rule__ANDcondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4007:1: ( rule__ANDcondition__Group_1__0__Impl rule__ANDcondition__Group_1__1 )
            // InternalRpgindividual.g:4008:2: rule__ANDcondition__Group_1__0__Impl rule__ANDcondition__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__ANDcondition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANDcondition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDcondition__Group_1__0"


    // $ANTLR start "rule__ANDcondition__Group_1__0__Impl"
    // InternalRpgindividual.g:4015:1: rule__ANDcondition__Group_1__0__Impl : ( 'AND' ) ;
    public final void rule__ANDcondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4019:1: ( ( 'AND' ) )
            // InternalRpgindividual.g:4020:1: ( 'AND' )
            {
            // InternalRpgindividual.g:4020:1: ( 'AND' )
            // InternalRpgindividual.g:4021:2: 'AND'
            {
             before(grammarAccess.getANDconditionAccess().getANDKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getANDconditionAccess().getANDKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDcondition__Group_1__0__Impl"


    // $ANTLR start "rule__ANDcondition__Group_1__1"
    // InternalRpgindividual.g:4030:1: rule__ANDcondition__Group_1__1 : rule__ANDcondition__Group_1__1__Impl rule__ANDcondition__Group_1__2 ;
    public final void rule__ANDcondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4034:1: ( rule__ANDcondition__Group_1__1__Impl rule__ANDcondition__Group_1__2 )
            // InternalRpgindividual.g:4035:2: rule__ANDcondition__Group_1__1__Impl rule__ANDcondition__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__ANDcondition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANDcondition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDcondition__Group_1__1"


    // $ANTLR start "rule__ANDcondition__Group_1__1__Impl"
    // InternalRpgindividual.g:4042:1: rule__ANDcondition__Group_1__1__Impl : ( () ) ;
    public final void rule__ANDcondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4046:1: ( ( () ) )
            // InternalRpgindividual.g:4047:1: ( () )
            {
            // InternalRpgindividual.g:4047:1: ( () )
            // InternalRpgindividual.g:4048:2: ()
            {
             before(grammarAccess.getANDconditionAccess().getAndLeftAction_1_1()); 
            // InternalRpgindividual.g:4049:2: ()
            // InternalRpgindividual.g:4049:3: 
            {
            }

             after(grammarAccess.getANDconditionAccess().getAndLeftAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDcondition__Group_1__1__Impl"


    // $ANTLR start "rule__ANDcondition__Group_1__2"
    // InternalRpgindividual.g:4057:1: rule__ANDcondition__Group_1__2 : rule__ANDcondition__Group_1__2__Impl ;
    public final void rule__ANDcondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4061:1: ( rule__ANDcondition__Group_1__2__Impl )
            // InternalRpgindividual.g:4062:2: rule__ANDcondition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ANDcondition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDcondition__Group_1__2"


    // $ANTLR start "rule__ANDcondition__Group_1__2__Impl"
    // InternalRpgindividual.g:4068:1: rule__ANDcondition__Group_1__2__Impl : ( ( rule__ANDcondition__RightAssignment_1_2 ) ) ;
    public final void rule__ANDcondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4072:1: ( ( ( rule__ANDcondition__RightAssignment_1_2 ) ) )
            // InternalRpgindividual.g:4073:1: ( ( rule__ANDcondition__RightAssignment_1_2 ) )
            {
            // InternalRpgindividual.g:4073:1: ( ( rule__ANDcondition__RightAssignment_1_2 ) )
            // InternalRpgindividual.g:4074:2: ( rule__ANDcondition__RightAssignment_1_2 )
            {
             before(grammarAccess.getANDconditionAccess().getRightAssignment_1_2()); 
            // InternalRpgindividual.g:4075:2: ( rule__ANDcondition__RightAssignment_1_2 )
            // InternalRpgindividual.g:4075:3: rule__ANDcondition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ANDcondition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getANDconditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDcondition__Group_1__2__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // InternalRpgindividual.g:4084:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4088:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalRpgindividual.g:4089:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // InternalRpgindividual.g:4096:1: rule__Statement__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4100:1: ( ( '(' ) )
            // InternalRpgindividual.g:4101:1: ( '(' )
            {
            // InternalRpgindividual.g:4101:1: ( '(' )
            // InternalRpgindividual.g:4102:2: '('
            {
             before(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // InternalRpgindividual.g:4111:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4115:1: ( rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 )
            // InternalRpgindividual.g:4116:2: rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2
            {
            pushFollow(FOLLOW_45);
            rule__Statement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // InternalRpgindividual.g:4123:1: rule__Statement__Group_1__1__Impl : ( ruleORcondition ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4127:1: ( ( ruleORcondition ) )
            // InternalRpgindividual.g:4128:1: ( ruleORcondition )
            {
            // InternalRpgindividual.g:4128:1: ( ruleORcondition )
            // InternalRpgindividual.g:4129:2: ruleORcondition
            {
             before(grammarAccess.getStatementAccess().getORconditionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleORcondition();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getORconditionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group_1__2"
    // InternalRpgindividual.g:4138:1: rule__Statement__Group_1__2 : rule__Statement__Group_1__2__Impl ;
    public final void rule__Statement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4142:1: ( rule__Statement__Group_1__2__Impl )
            // InternalRpgindividual.g:4143:2: rule__Statement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__2"


    // $ANTLR start "rule__Statement__Group_1__2__Impl"
    // InternalRpgindividual.g:4149:1: rule__Statement__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Statement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4153:1: ( ( ')' ) )
            // InternalRpgindividual.g:4154:1: ( ')' )
            {
            // InternalRpgindividual.g:4154:1: ( ')' )
            // InternalRpgindividual.g:4155:2: ')'
            {
             before(grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__2__Impl"


    // $ANTLR start "rule__NumberComparing__Group__0"
    // InternalRpgindividual.g:4165:1: rule__NumberComparing__Group__0 : rule__NumberComparing__Group__0__Impl rule__NumberComparing__Group__1 ;
    public final void rule__NumberComparing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4169:1: ( rule__NumberComparing__Group__0__Impl rule__NumberComparing__Group__1 )
            // InternalRpgindividual.g:4170:2: rule__NumberComparing__Group__0__Impl rule__NumberComparing__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__NumberComparing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberComparing__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberComparing__Group__0"


    // $ANTLR start "rule__NumberComparing__Group__0__Impl"
    // InternalRpgindividual.g:4177:1: rule__NumberComparing__Group__0__Impl : ( ( rule__NumberComparing__LeftAssignment_0 ) ) ;
    public final void rule__NumberComparing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4181:1: ( ( ( rule__NumberComparing__LeftAssignment_0 ) ) )
            // InternalRpgindividual.g:4182:1: ( ( rule__NumberComparing__LeftAssignment_0 ) )
            {
            // InternalRpgindividual.g:4182:1: ( ( rule__NumberComparing__LeftAssignment_0 ) )
            // InternalRpgindividual.g:4183:2: ( rule__NumberComparing__LeftAssignment_0 )
            {
             before(grammarAccess.getNumberComparingAccess().getLeftAssignment_0()); 
            // InternalRpgindividual.g:4184:2: ( rule__NumberComparing__LeftAssignment_0 )
            // InternalRpgindividual.g:4184:3: rule__NumberComparing__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NumberComparing__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberComparingAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberComparing__Group__0__Impl"


    // $ANTLR start "rule__NumberComparing__Group__1"
    // InternalRpgindividual.g:4192:1: rule__NumberComparing__Group__1 : rule__NumberComparing__Group__1__Impl rule__NumberComparing__Group__2 ;
    public final void rule__NumberComparing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4196:1: ( rule__NumberComparing__Group__1__Impl rule__NumberComparing__Group__2 )
            // InternalRpgindividual.g:4197:2: rule__NumberComparing__Group__1__Impl rule__NumberComparing__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__NumberComparing__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberComparing__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberComparing__Group__1"


    // $ANTLR start "rule__NumberComparing__Group__1__Impl"
    // InternalRpgindividual.g:4204:1: rule__NumberComparing__Group__1__Impl : ( ( rule__NumberComparing__CompAssignment_1 ) ) ;
    public final void rule__NumberComparing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4208:1: ( ( ( rule__NumberComparing__CompAssignment_1 ) ) )
            // InternalRpgindividual.g:4209:1: ( ( rule__NumberComparing__CompAssignment_1 ) )
            {
            // InternalRpgindividual.g:4209:1: ( ( rule__NumberComparing__CompAssignment_1 ) )
            // InternalRpgindividual.g:4210:2: ( rule__NumberComparing__CompAssignment_1 )
            {
             before(grammarAccess.getNumberComparingAccess().getCompAssignment_1()); 
            // InternalRpgindividual.g:4211:2: ( rule__NumberComparing__CompAssignment_1 )
            // InternalRpgindividual.g:4211:3: rule__NumberComparing__CompAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NumberComparing__CompAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberComparingAccess().getCompAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberComparing__Group__1__Impl"


    // $ANTLR start "rule__NumberComparing__Group__2"
    // InternalRpgindividual.g:4219:1: rule__NumberComparing__Group__2 : rule__NumberComparing__Group__2__Impl ;
    public final void rule__NumberComparing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4223:1: ( rule__NumberComparing__Group__2__Impl )
            // InternalRpgindividual.g:4224:2: rule__NumberComparing__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberComparing__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberComparing__Group__2"


    // $ANTLR start "rule__NumberComparing__Group__2__Impl"
    // InternalRpgindividual.g:4230:1: rule__NumberComparing__Group__2__Impl : ( ( rule__NumberComparing__RightAssignment_2 ) ) ;
    public final void rule__NumberComparing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4234:1: ( ( ( rule__NumberComparing__RightAssignment_2 ) ) )
            // InternalRpgindividual.g:4235:1: ( ( rule__NumberComparing__RightAssignment_2 ) )
            {
            // InternalRpgindividual.g:4235:1: ( ( rule__NumberComparing__RightAssignment_2 ) )
            // InternalRpgindividual.g:4236:2: ( rule__NumberComparing__RightAssignment_2 )
            {
             before(grammarAccess.getNumberComparingAccess().getRightAssignment_2()); 
            // InternalRpgindividual.g:4237:2: ( rule__NumberComparing__RightAssignment_2 )
            // InternalRpgindividual.g:4237:3: rule__NumberComparing__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NumberComparing__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNumberComparingAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberComparing__Group__2__Impl"


    // $ANTLR start "rule__Comparator__Group_0__0"
    // InternalRpgindividual.g:4246:1: rule__Comparator__Group_0__0 : rule__Comparator__Group_0__0__Impl rule__Comparator__Group_0__1 ;
    public final void rule__Comparator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4250:1: ( rule__Comparator__Group_0__0__Impl rule__Comparator__Group_0__1 )
            // InternalRpgindividual.g:4251:2: rule__Comparator__Group_0__0__Impl rule__Comparator__Group_0__1
            {
            pushFollow(FOLLOW_47);
            rule__Comparator__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_0__0"


    // $ANTLR start "rule__Comparator__Group_0__0__Impl"
    // InternalRpgindividual.g:4258:1: rule__Comparator__Group_0__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4262:1: ( ( () ) )
            // InternalRpgindividual.g:4263:1: ( () )
            {
            // InternalRpgindividual.g:4263:1: ( () )
            // InternalRpgindividual.g:4264:2: ()
            {
             before(grammarAccess.getComparatorAccess().getSmallerAction_0_0()); 
            // InternalRpgindividual.g:4265:2: ()
            // InternalRpgindividual.g:4265:3: 
            {
            }

             after(grammarAccess.getComparatorAccess().getSmallerAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_0__0__Impl"


    // $ANTLR start "rule__Comparator__Group_0__1"
    // InternalRpgindividual.g:4273:1: rule__Comparator__Group_0__1 : rule__Comparator__Group_0__1__Impl ;
    public final void rule__Comparator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4277:1: ( rule__Comparator__Group_0__1__Impl )
            // InternalRpgindividual.g:4278:2: rule__Comparator__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_0__1"


    // $ANTLR start "rule__Comparator__Group_0__1__Impl"
    // InternalRpgindividual.g:4284:1: rule__Comparator__Group_0__1__Impl : ( '<' ) ;
    public final void rule__Comparator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4288:1: ( ( '<' ) )
            // InternalRpgindividual.g:4289:1: ( '<' )
            {
            // InternalRpgindividual.g:4289:1: ( '<' )
            // InternalRpgindividual.g:4290:2: '<'
            {
             before(grammarAccess.getComparatorAccess().getLessThanSignKeyword_0_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getLessThanSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_0__1__Impl"


    // $ANTLR start "rule__Comparator__Group_1__0"
    // InternalRpgindividual.g:4300:1: rule__Comparator__Group_1__0 : rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1 ;
    public final void rule__Comparator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4304:1: ( rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1 )
            // InternalRpgindividual.g:4305:2: rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1
            {
            pushFollow(FOLLOW_48);
            rule__Comparator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_1__0"


    // $ANTLR start "rule__Comparator__Group_1__0__Impl"
    // InternalRpgindividual.g:4312:1: rule__Comparator__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4316:1: ( ( () ) )
            // InternalRpgindividual.g:4317:1: ( () )
            {
            // InternalRpgindividual.g:4317:1: ( () )
            // InternalRpgindividual.g:4318:2: ()
            {
             before(grammarAccess.getComparatorAccess().getSmallerEqAction_1_0()); 
            // InternalRpgindividual.g:4319:2: ()
            // InternalRpgindividual.g:4319:3: 
            {
            }

             after(grammarAccess.getComparatorAccess().getSmallerEqAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_1__0__Impl"


    // $ANTLR start "rule__Comparator__Group_1__1"
    // InternalRpgindividual.g:4327:1: rule__Comparator__Group_1__1 : rule__Comparator__Group_1__1__Impl ;
    public final void rule__Comparator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4331:1: ( rule__Comparator__Group_1__1__Impl )
            // InternalRpgindividual.g:4332:2: rule__Comparator__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_1__1"


    // $ANTLR start "rule__Comparator__Group_1__1__Impl"
    // InternalRpgindividual.g:4338:1: rule__Comparator__Group_1__1__Impl : ( '<=' ) ;
    public final void rule__Comparator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4342:1: ( ( '<=' ) )
            // InternalRpgindividual.g:4343:1: ( '<=' )
            {
            // InternalRpgindividual.g:4343:1: ( '<=' )
            // InternalRpgindividual.g:4344:2: '<='
            {
             before(grammarAccess.getComparatorAccess().getLessThanSignEqualsSignKeyword_1_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getLessThanSignEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_1__1__Impl"


    // $ANTLR start "rule__Comparator__Group_2__0"
    // InternalRpgindividual.g:4354:1: rule__Comparator__Group_2__0 : rule__Comparator__Group_2__0__Impl rule__Comparator__Group_2__1 ;
    public final void rule__Comparator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4358:1: ( rule__Comparator__Group_2__0__Impl rule__Comparator__Group_2__1 )
            // InternalRpgindividual.g:4359:2: rule__Comparator__Group_2__0__Impl rule__Comparator__Group_2__1
            {
            pushFollow(FOLLOW_49);
            rule__Comparator__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_2__0"


    // $ANTLR start "rule__Comparator__Group_2__0__Impl"
    // InternalRpgindividual.g:4366:1: rule__Comparator__Group_2__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4370:1: ( ( () ) )
            // InternalRpgindividual.g:4371:1: ( () )
            {
            // InternalRpgindividual.g:4371:1: ( () )
            // InternalRpgindividual.g:4372:2: ()
            {
             before(grammarAccess.getComparatorAccess().getEqAction_2_0()); 
            // InternalRpgindividual.g:4373:2: ()
            // InternalRpgindividual.g:4373:3: 
            {
            }

             after(grammarAccess.getComparatorAccess().getEqAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_2__0__Impl"


    // $ANTLR start "rule__Comparator__Group_2__1"
    // InternalRpgindividual.g:4381:1: rule__Comparator__Group_2__1 : rule__Comparator__Group_2__1__Impl ;
    public final void rule__Comparator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4385:1: ( rule__Comparator__Group_2__1__Impl )
            // InternalRpgindividual.g:4386:2: rule__Comparator__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_2__1"


    // $ANTLR start "rule__Comparator__Group_2__1__Impl"
    // InternalRpgindividual.g:4392:1: rule__Comparator__Group_2__1__Impl : ( '==' ) ;
    public final void rule__Comparator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4396:1: ( ( '==' ) )
            // InternalRpgindividual.g:4397:1: ( '==' )
            {
            // InternalRpgindividual.g:4397:1: ( '==' )
            // InternalRpgindividual.g:4398:2: '=='
            {
             before(grammarAccess.getComparatorAccess().getEqualsSignEqualsSignKeyword_2_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getEqualsSignEqualsSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_2__1__Impl"


    // $ANTLR start "rule__Comparator__Group_3__0"
    // InternalRpgindividual.g:4408:1: rule__Comparator__Group_3__0 : rule__Comparator__Group_3__0__Impl rule__Comparator__Group_3__1 ;
    public final void rule__Comparator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4412:1: ( rule__Comparator__Group_3__0__Impl rule__Comparator__Group_3__1 )
            // InternalRpgindividual.g:4413:2: rule__Comparator__Group_3__0__Impl rule__Comparator__Group_3__1
            {
            pushFollow(FOLLOW_50);
            rule__Comparator__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_3__0"


    // $ANTLR start "rule__Comparator__Group_3__0__Impl"
    // InternalRpgindividual.g:4420:1: rule__Comparator__Group_3__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4424:1: ( ( () ) )
            // InternalRpgindividual.g:4425:1: ( () )
            {
            // InternalRpgindividual.g:4425:1: ( () )
            // InternalRpgindividual.g:4426:2: ()
            {
             before(grammarAccess.getComparatorAccess().getBiggerEqAction_3_0()); 
            // InternalRpgindividual.g:4427:2: ()
            // InternalRpgindividual.g:4427:3: 
            {
            }

             after(grammarAccess.getComparatorAccess().getBiggerEqAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_3__0__Impl"


    // $ANTLR start "rule__Comparator__Group_3__1"
    // InternalRpgindividual.g:4435:1: rule__Comparator__Group_3__1 : rule__Comparator__Group_3__1__Impl ;
    public final void rule__Comparator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4439:1: ( rule__Comparator__Group_3__1__Impl )
            // InternalRpgindividual.g:4440:2: rule__Comparator__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_3__1"


    // $ANTLR start "rule__Comparator__Group_3__1__Impl"
    // InternalRpgindividual.g:4446:1: rule__Comparator__Group_3__1__Impl : ( '>=' ) ;
    public final void rule__Comparator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4450:1: ( ( '>=' ) )
            // InternalRpgindividual.g:4451:1: ( '>=' )
            {
            // InternalRpgindividual.g:4451:1: ( '>=' )
            // InternalRpgindividual.g:4452:2: '>='
            {
             before(grammarAccess.getComparatorAccess().getGreaterThanSignEqualsSignKeyword_3_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getGreaterThanSignEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_3__1__Impl"


    // $ANTLR start "rule__Comparator__Group_4__0"
    // InternalRpgindividual.g:4462:1: rule__Comparator__Group_4__0 : rule__Comparator__Group_4__0__Impl rule__Comparator__Group_4__1 ;
    public final void rule__Comparator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4466:1: ( rule__Comparator__Group_4__0__Impl rule__Comparator__Group_4__1 )
            // InternalRpgindividual.g:4467:2: rule__Comparator__Group_4__0__Impl rule__Comparator__Group_4__1
            {
            pushFollow(FOLLOW_51);
            rule__Comparator__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_4__0"


    // $ANTLR start "rule__Comparator__Group_4__0__Impl"
    // InternalRpgindividual.g:4474:1: rule__Comparator__Group_4__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4478:1: ( ( () ) )
            // InternalRpgindividual.g:4479:1: ( () )
            {
            // InternalRpgindividual.g:4479:1: ( () )
            // InternalRpgindividual.g:4480:2: ()
            {
             before(grammarAccess.getComparatorAccess().getBiggerAction_4_0()); 
            // InternalRpgindividual.g:4481:2: ()
            // InternalRpgindividual.g:4481:3: 
            {
            }

             after(grammarAccess.getComparatorAccess().getBiggerAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_4__0__Impl"


    // $ANTLR start "rule__Comparator__Group_4__1"
    // InternalRpgindividual.g:4489:1: rule__Comparator__Group_4__1 : rule__Comparator__Group_4__1__Impl ;
    public final void rule__Comparator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4493:1: ( rule__Comparator__Group_4__1__Impl )
            // InternalRpgindividual.g:4494:2: rule__Comparator__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_4__1"


    // $ANTLR start "rule__Comparator__Group_4__1__Impl"
    // InternalRpgindividual.g:4500:1: rule__Comparator__Group_4__1__Impl : ( '>' ) ;
    public final void rule__Comparator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4504:1: ( ( '>' ) )
            // InternalRpgindividual.g:4505:1: ( '>' )
            {
            // InternalRpgindividual.g:4505:1: ( '>' )
            // InternalRpgindividual.g:4506:2: '>'
            {
             before(grammarAccess.getComparatorAccess().getGreaterThanSignKeyword_4_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getGreaterThanSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_4__1__Impl"


    // $ANTLR start "rule__Comparator__Group_5__0"
    // InternalRpgindividual.g:4516:1: rule__Comparator__Group_5__0 : rule__Comparator__Group_5__0__Impl rule__Comparator__Group_5__1 ;
    public final void rule__Comparator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4520:1: ( rule__Comparator__Group_5__0__Impl rule__Comparator__Group_5__1 )
            // InternalRpgindividual.g:4521:2: rule__Comparator__Group_5__0__Impl rule__Comparator__Group_5__1
            {
            pushFollow(FOLLOW_46);
            rule__Comparator__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_5__0"


    // $ANTLR start "rule__Comparator__Group_5__0__Impl"
    // InternalRpgindividual.g:4528:1: rule__Comparator__Group_5__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4532:1: ( ( () ) )
            // InternalRpgindividual.g:4533:1: ( () )
            {
            // InternalRpgindividual.g:4533:1: ( () )
            // InternalRpgindividual.g:4534:2: ()
            {
             before(grammarAccess.getComparatorAccess().getNEqAction_5_0()); 
            // InternalRpgindividual.g:4535:2: ()
            // InternalRpgindividual.g:4535:3: 
            {
            }

             after(grammarAccess.getComparatorAccess().getNEqAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_5__0__Impl"


    // $ANTLR start "rule__Comparator__Group_5__1"
    // InternalRpgindividual.g:4543:1: rule__Comparator__Group_5__1 : rule__Comparator__Group_5__1__Impl ;
    public final void rule__Comparator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4547:1: ( rule__Comparator__Group_5__1__Impl )
            // InternalRpgindividual.g:4548:2: rule__Comparator__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_5__1"


    // $ANTLR start "rule__Comparator__Group_5__1__Impl"
    // InternalRpgindividual.g:4554:1: rule__Comparator__Group_5__1__Impl : ( '!=' ) ;
    public final void rule__Comparator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4558:1: ( ( '!=' ) )
            // InternalRpgindividual.g:4559:1: ( '!=' )
            {
            // InternalRpgindividual.g:4559:1: ( '!=' )
            // InternalRpgindividual.g:4560:2: '!='
            {
             before(grammarAccess.getComparatorAccess().getExclamationMarkEqualsSignKeyword_5_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getExclamationMarkEqualsSignKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_5__1__Impl"


    // $ANTLR start "rule__Sum__Group__0"
    // InternalRpgindividual.g:4570:1: rule__Sum__Group__0 : rule__Sum__Group__0__Impl rule__Sum__Group__1 ;
    public final void rule__Sum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4574:1: ( rule__Sum__Group__0__Impl rule__Sum__Group__1 )
            // InternalRpgindividual.g:4575:2: rule__Sum__Group__0__Impl rule__Sum__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Sum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__0"


    // $ANTLR start "rule__Sum__Group__0__Impl"
    // InternalRpgindividual.g:4582:1: rule__Sum__Group__0__Impl : ( ruleMultiply ) ;
    public final void rule__Sum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4586:1: ( ( ruleMultiply ) )
            // InternalRpgindividual.g:4587:1: ( ruleMultiply )
            {
            // InternalRpgindividual.g:4587:1: ( ruleMultiply )
            // InternalRpgindividual.g:4588:2: ruleMultiply
            {
             before(grammarAccess.getSumAccess().getMultiplyParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiply();

            state._fsp--;

             after(grammarAccess.getSumAccess().getMultiplyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__0__Impl"


    // $ANTLR start "rule__Sum__Group__1"
    // InternalRpgindividual.g:4597:1: rule__Sum__Group__1 : rule__Sum__Group__1__Impl ;
    public final void rule__Sum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4601:1: ( rule__Sum__Group__1__Impl )
            // InternalRpgindividual.g:4602:2: rule__Sum__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__1"


    // $ANTLR start "rule__Sum__Group__1__Impl"
    // InternalRpgindividual.g:4608:1: rule__Sum__Group__1__Impl : ( ( rule__Sum__Group_1__0 )* ) ;
    public final void rule__Sum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4612:1: ( ( ( rule__Sum__Group_1__0 )* ) )
            // InternalRpgindividual.g:4613:1: ( ( rule__Sum__Group_1__0 )* )
            {
            // InternalRpgindividual.g:4613:1: ( ( rule__Sum__Group_1__0 )* )
            // InternalRpgindividual.g:4614:2: ( rule__Sum__Group_1__0 )*
            {
             before(grammarAccess.getSumAccess().getGroup_1()); 
            // InternalRpgindividual.g:4615:2: ( rule__Sum__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=11 && LA33_0<=12)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRpgindividual.g:4615:3: rule__Sum__Group_1__0
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__Sum__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getSumAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__1__Impl"


    // $ANTLR start "rule__Sum__Group_1__0"
    // InternalRpgindividual.g:4624:1: rule__Sum__Group_1__0 : rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 ;
    public final void rule__Sum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4628:1: ( rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 )
            // InternalRpgindividual.g:4629:2: rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Sum__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1__0"


    // $ANTLR start "rule__Sum__Group_1__0__Impl"
    // InternalRpgindividual.g:4636:1: rule__Sum__Group_1__0__Impl : ( ( rule__Sum__Alternatives_1_0 ) ) ;
    public final void rule__Sum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4640:1: ( ( ( rule__Sum__Alternatives_1_0 ) ) )
            // InternalRpgindividual.g:4641:1: ( ( rule__Sum__Alternatives_1_0 ) )
            {
            // InternalRpgindividual.g:4641:1: ( ( rule__Sum__Alternatives_1_0 ) )
            // InternalRpgindividual.g:4642:2: ( rule__Sum__Alternatives_1_0 )
            {
             before(grammarAccess.getSumAccess().getAlternatives_1_0()); 
            // InternalRpgindividual.g:4643:2: ( rule__Sum__Alternatives_1_0 )
            // InternalRpgindividual.g:4643:3: rule__Sum__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1__0__Impl"


    // $ANTLR start "rule__Sum__Group_1__1"
    // InternalRpgindividual.g:4651:1: rule__Sum__Group_1__1 : rule__Sum__Group_1__1__Impl ;
    public final void rule__Sum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4655:1: ( rule__Sum__Group_1__1__Impl )
            // InternalRpgindividual.g:4656:2: rule__Sum__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1__1"


    // $ANTLR start "rule__Sum__Group_1__1__Impl"
    // InternalRpgindividual.g:4662:1: rule__Sum__Group_1__1__Impl : ( ( rule__Sum__RightAssignment_1_1 ) ) ;
    public final void rule__Sum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4666:1: ( ( ( rule__Sum__RightAssignment_1_1 ) ) )
            // InternalRpgindividual.g:4667:1: ( ( rule__Sum__RightAssignment_1_1 ) )
            {
            // InternalRpgindividual.g:4667:1: ( ( rule__Sum__RightAssignment_1_1 ) )
            // InternalRpgindividual.g:4668:2: ( rule__Sum__RightAssignment_1_1 )
            {
             before(grammarAccess.getSumAccess().getRightAssignment_1_1()); 
            // InternalRpgindividual.g:4669:2: ( rule__Sum__RightAssignment_1_1 )
            // InternalRpgindividual.g:4669:3: rule__Sum__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Sum__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1__1__Impl"


    // $ANTLR start "rule__Sum__Group_1_0_0__0"
    // InternalRpgindividual.g:4678:1: rule__Sum__Group_1_0_0__0 : rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1 ;
    public final void rule__Sum__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4682:1: ( rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1 )
            // InternalRpgindividual.g:4683:2: rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1
            {
            pushFollow(FOLLOW_1);
            rule__Sum__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_0__0"


    // $ANTLR start "rule__Sum__Group_1_0_0__0__Impl"
    // InternalRpgindividual.g:4690:1: rule__Sum__Group_1_0_0__0__Impl : ( '+' ) ;
    public final void rule__Sum__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4694:1: ( ( '+' ) )
            // InternalRpgindividual.g:4695:1: ( '+' )
            {
            // InternalRpgindividual.g:4695:1: ( '+' )
            // InternalRpgindividual.g:4696:2: '+'
            {
             before(grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Sum__Group_1_0_0__1"
    // InternalRpgindividual.g:4705:1: rule__Sum__Group_1_0_0__1 : rule__Sum__Group_1_0_0__1__Impl ;
    public final void rule__Sum__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4709:1: ( rule__Sum__Group_1_0_0__1__Impl )
            // InternalRpgindividual.g:4710:2: rule__Sum__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_0__1"


    // $ANTLR start "rule__Sum__Group_1_0_0__1__Impl"
    // InternalRpgindividual.g:4716:1: rule__Sum__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Sum__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4720:1: ( ( () ) )
            // InternalRpgindividual.g:4721:1: ( () )
            {
            // InternalRpgindividual.g:4721:1: ( () )
            // InternalRpgindividual.g:4722:2: ()
            {
             before(grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1()); 
            // InternalRpgindividual.g:4723:2: ()
            // InternalRpgindividual.g:4723:3: 
            {
            }

             after(grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Sum__Group_1_0_1__0"
    // InternalRpgindividual.g:4732:1: rule__Sum__Group_1_0_1__0 : rule__Sum__Group_1_0_1__0__Impl rule__Sum__Group_1_0_1__1 ;
    public final void rule__Sum__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4736:1: ( rule__Sum__Group_1_0_1__0__Impl rule__Sum__Group_1_0_1__1 )
            // InternalRpgindividual.g:4737:2: rule__Sum__Group_1_0_1__0__Impl rule__Sum__Group_1_0_1__1
            {
            pushFollow(FOLLOW_1);
            rule__Sum__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_1__0"


    // $ANTLR start "rule__Sum__Group_1_0_1__0__Impl"
    // InternalRpgindividual.g:4744:1: rule__Sum__Group_1_0_1__0__Impl : ( '-' ) ;
    public final void rule__Sum__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4748:1: ( ( '-' ) )
            // InternalRpgindividual.g:4749:1: ( '-' )
            {
            // InternalRpgindividual.g:4749:1: ( '-' )
            // InternalRpgindividual.g:4750:2: '-'
            {
             before(grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Sum__Group_1_0_1__1"
    // InternalRpgindividual.g:4759:1: rule__Sum__Group_1_0_1__1 : rule__Sum__Group_1_0_1__1__Impl ;
    public final void rule__Sum__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4763:1: ( rule__Sum__Group_1_0_1__1__Impl )
            // InternalRpgindividual.g:4764:2: rule__Sum__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_1__1"


    // $ANTLR start "rule__Sum__Group_1_0_1__1__Impl"
    // InternalRpgindividual.g:4770:1: rule__Sum__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Sum__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4774:1: ( ( () ) )
            // InternalRpgindividual.g:4775:1: ( () )
            {
            // InternalRpgindividual.g:4775:1: ( () )
            // InternalRpgindividual.g:4776:2: ()
            {
             before(grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1()); 
            // InternalRpgindividual.g:4777:2: ()
            // InternalRpgindividual.g:4777:3: 
            {
            }

             after(grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiply__Group__0"
    // InternalRpgindividual.g:4786:1: rule__Multiply__Group__0 : rule__Multiply__Group__0__Impl rule__Multiply__Group__1 ;
    public final void rule__Multiply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4790:1: ( rule__Multiply__Group__0__Impl rule__Multiply__Group__1 )
            // InternalRpgindividual.g:4791:2: rule__Multiply__Group__0__Impl rule__Multiply__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__Multiply__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiply__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group__0"


    // $ANTLR start "rule__Multiply__Group__0__Impl"
    // InternalRpgindividual.g:4798:1: rule__Multiply__Group__0__Impl : ( ruleAtomicNumber ) ;
    public final void rule__Multiply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4802:1: ( ( ruleAtomicNumber ) )
            // InternalRpgindividual.g:4803:1: ( ruleAtomicNumber )
            {
            // InternalRpgindividual.g:4803:1: ( ruleAtomicNumber )
            // InternalRpgindividual.g:4804:2: ruleAtomicNumber
            {
             before(grammarAccess.getMultiplyAccess().getAtomicNumberParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomicNumber();

            state._fsp--;

             after(grammarAccess.getMultiplyAccess().getAtomicNumberParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group__0__Impl"


    // $ANTLR start "rule__Multiply__Group__1"
    // InternalRpgindividual.g:4813:1: rule__Multiply__Group__1 : rule__Multiply__Group__1__Impl ;
    public final void rule__Multiply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4817:1: ( rule__Multiply__Group__1__Impl )
            // InternalRpgindividual.g:4818:2: rule__Multiply__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group__1"


    // $ANTLR start "rule__Multiply__Group__1__Impl"
    // InternalRpgindividual.g:4824:1: rule__Multiply__Group__1__Impl : ( ( rule__Multiply__Group_1__0 )* ) ;
    public final void rule__Multiply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4828:1: ( ( ( rule__Multiply__Group_1__0 )* ) )
            // InternalRpgindividual.g:4829:1: ( ( rule__Multiply__Group_1__0 )* )
            {
            // InternalRpgindividual.g:4829:1: ( ( rule__Multiply__Group_1__0 )* )
            // InternalRpgindividual.g:4830:2: ( rule__Multiply__Group_1__0 )*
            {
             before(grammarAccess.getMultiplyAccess().getGroup_1()); 
            // InternalRpgindividual.g:4831:2: ( rule__Multiply__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==41||LA34_0==53) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalRpgindividual.g:4831:3: rule__Multiply__Group_1__0
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__Multiply__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getMultiplyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group__1__Impl"


    // $ANTLR start "rule__Multiply__Group_1__0"
    // InternalRpgindividual.g:4840:1: rule__Multiply__Group_1__0 : rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 ;
    public final void rule__Multiply__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4844:1: ( rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 )
            // InternalRpgindividual.g:4845:2: rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Multiply__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1__0"


    // $ANTLR start "rule__Multiply__Group_1__0__Impl"
    // InternalRpgindividual.g:4852:1: rule__Multiply__Group_1__0__Impl : ( ( rule__Multiply__Alternatives_1_0 ) ) ;
    public final void rule__Multiply__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4856:1: ( ( ( rule__Multiply__Alternatives_1_0 ) ) )
            // InternalRpgindividual.g:4857:1: ( ( rule__Multiply__Alternatives_1_0 ) )
            {
            // InternalRpgindividual.g:4857:1: ( ( rule__Multiply__Alternatives_1_0 ) )
            // InternalRpgindividual.g:4858:2: ( rule__Multiply__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplyAccess().getAlternatives_1_0()); 
            // InternalRpgindividual.g:4859:2: ( rule__Multiply__Alternatives_1_0 )
            // InternalRpgindividual.g:4859:3: rule__Multiply__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1__0__Impl"


    // $ANTLR start "rule__Multiply__Group_1__1"
    // InternalRpgindividual.g:4867:1: rule__Multiply__Group_1__1 : rule__Multiply__Group_1__1__Impl ;
    public final void rule__Multiply__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4871:1: ( rule__Multiply__Group_1__1__Impl )
            // InternalRpgindividual.g:4872:2: rule__Multiply__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1__1"


    // $ANTLR start "rule__Multiply__Group_1__1__Impl"
    // InternalRpgindividual.g:4878:1: rule__Multiply__Group_1__1__Impl : ( ( rule__Multiply__RightAssignment_1_1 ) ) ;
    public final void rule__Multiply__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4882:1: ( ( ( rule__Multiply__RightAssignment_1_1 ) ) )
            // InternalRpgindividual.g:4883:1: ( ( rule__Multiply__RightAssignment_1_1 ) )
            {
            // InternalRpgindividual.g:4883:1: ( ( rule__Multiply__RightAssignment_1_1 ) )
            // InternalRpgindividual.g:4884:2: ( rule__Multiply__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplyAccess().getRightAssignment_1_1()); 
            // InternalRpgindividual.g:4885:2: ( rule__Multiply__RightAssignment_1_1 )
            // InternalRpgindividual.g:4885:3: rule__Multiply__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1__1__Impl"


    // $ANTLR start "rule__Multiply__Group_1_0_0__0"
    // InternalRpgindividual.g:4894:1: rule__Multiply__Group_1_0_0__0 : rule__Multiply__Group_1_0_0__0__Impl rule__Multiply__Group_1_0_0__1 ;
    public final void rule__Multiply__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4898:1: ( rule__Multiply__Group_1_0_0__0__Impl rule__Multiply__Group_1_0_0__1 )
            // InternalRpgindividual.g:4899:2: rule__Multiply__Group_1_0_0__0__Impl rule__Multiply__Group_1_0_0__1
            {
            pushFollow(FOLLOW_1);
            rule__Multiply__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1_0_0__0"


    // $ANTLR start "rule__Multiply__Group_1_0_0__0__Impl"
    // InternalRpgindividual.g:4906:1: rule__Multiply__Group_1_0_0__0__Impl : ( '*' ) ;
    public final void rule__Multiply__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4910:1: ( ( '*' ) )
            // InternalRpgindividual.g:4911:1: ( '*' )
            {
            // InternalRpgindividual.g:4911:1: ( '*' )
            // InternalRpgindividual.g:4912:2: '*'
            {
             before(grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_0_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Multiply__Group_1_0_0__1"
    // InternalRpgindividual.g:4921:1: rule__Multiply__Group_1_0_0__1 : rule__Multiply__Group_1_0_0__1__Impl ;
    public final void rule__Multiply__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4925:1: ( rule__Multiply__Group_1_0_0__1__Impl )
            // InternalRpgindividual.g:4926:2: rule__Multiply__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1_0_0__1"


    // $ANTLR start "rule__Multiply__Group_1_0_0__1__Impl"
    // InternalRpgindividual.g:4932:1: rule__Multiply__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Multiply__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4936:1: ( ( () ) )
            // InternalRpgindividual.g:4937:1: ( () )
            {
            // InternalRpgindividual.g:4937:1: ( () )
            // InternalRpgindividual.g:4938:2: ()
            {
             before(grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1()); 
            // InternalRpgindividual.g:4939:2: ()
            // InternalRpgindividual.g:4939:3: 
            {
            }

             after(grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Multiply__Group_1_0_1__0"
    // InternalRpgindividual.g:4948:1: rule__Multiply__Group_1_0_1__0 : rule__Multiply__Group_1_0_1__0__Impl rule__Multiply__Group_1_0_1__1 ;
    public final void rule__Multiply__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4952:1: ( rule__Multiply__Group_1_0_1__0__Impl rule__Multiply__Group_1_0_1__1 )
            // InternalRpgindividual.g:4953:2: rule__Multiply__Group_1_0_1__0__Impl rule__Multiply__Group_1_0_1__1
            {
            pushFollow(FOLLOW_1);
            rule__Multiply__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1_0_1__0"


    // $ANTLR start "rule__Multiply__Group_1_0_1__0__Impl"
    // InternalRpgindividual.g:4960:1: rule__Multiply__Group_1_0_1__0__Impl : ( '/' ) ;
    public final void rule__Multiply__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4964:1: ( ( '/' ) )
            // InternalRpgindividual.g:4965:1: ( '/' )
            {
            // InternalRpgindividual.g:4965:1: ( '/' )
            // InternalRpgindividual.g:4966:2: '/'
            {
             before(grammarAccess.getMultiplyAccess().getSolidusKeyword_1_0_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getMultiplyAccess().getSolidusKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Multiply__Group_1_0_1__1"
    // InternalRpgindividual.g:4975:1: rule__Multiply__Group_1_0_1__1 : rule__Multiply__Group_1_0_1__1__Impl ;
    public final void rule__Multiply__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4979:1: ( rule__Multiply__Group_1_0_1__1__Impl )
            // InternalRpgindividual.g:4980:2: rule__Multiply__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1_0_1__1"


    // $ANTLR start "rule__Multiply__Group_1_0_1__1__Impl"
    // InternalRpgindividual.g:4986:1: rule__Multiply__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Multiply__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4990:1: ( ( () ) )
            // InternalRpgindividual.g:4991:1: ( () )
            {
            // InternalRpgindividual.g:4991:1: ( () )
            // InternalRpgindividual.g:4992:2: ()
            {
             before(grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1()); 
            // InternalRpgindividual.g:4993:2: ()
            // InternalRpgindividual.g:4993:3: 
            {
            }

             after(grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__NameAttribute__Group__0"
    // InternalRpgindividual.g:5002:1: rule__NameAttribute__Group__0 : rule__NameAttribute__Group__0__Impl rule__NameAttribute__Group__1 ;
    public final void rule__NameAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5006:1: ( rule__NameAttribute__Group__0__Impl rule__NameAttribute__Group__1 )
            // InternalRpgindividual.g:5007:2: rule__NameAttribute__Group__0__Impl rule__NameAttribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NameAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameAttribute__Group__0"


    // $ANTLR start "rule__NameAttribute__Group__0__Impl"
    // InternalRpgindividual.g:5014:1: rule__NameAttribute__Group__0__Impl : ( ( rule__NameAttribute__TargetAssignment_0 ) ) ;
    public final void rule__NameAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5018:1: ( ( ( rule__NameAttribute__TargetAssignment_0 ) ) )
            // InternalRpgindividual.g:5019:1: ( ( rule__NameAttribute__TargetAssignment_0 ) )
            {
            // InternalRpgindividual.g:5019:1: ( ( rule__NameAttribute__TargetAssignment_0 ) )
            // InternalRpgindividual.g:5020:2: ( rule__NameAttribute__TargetAssignment_0 )
            {
             before(grammarAccess.getNameAttributeAccess().getTargetAssignment_0()); 
            // InternalRpgindividual.g:5021:2: ( rule__NameAttribute__TargetAssignment_0 )
            // InternalRpgindividual.g:5021:3: rule__NameAttribute__TargetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NameAttribute__TargetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNameAttributeAccess().getTargetAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameAttribute__Group__0__Impl"


    // $ANTLR start "rule__NameAttribute__Group__1"
    // InternalRpgindividual.g:5029:1: rule__NameAttribute__Group__1 : rule__NameAttribute__Group__1__Impl ;
    public final void rule__NameAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5033:1: ( rule__NameAttribute__Group__1__Impl )
            // InternalRpgindividual.g:5034:2: rule__NameAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NameAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameAttribute__Group__1"


    // $ANTLR start "rule__NameAttribute__Group__1__Impl"
    // InternalRpgindividual.g:5040:1: rule__NameAttribute__Group__1__Impl : ( ( rule__NameAttribute__AttributeAssignment_1 ) ) ;
    public final void rule__NameAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5044:1: ( ( ( rule__NameAttribute__AttributeAssignment_1 ) ) )
            // InternalRpgindividual.g:5045:1: ( ( rule__NameAttribute__AttributeAssignment_1 ) )
            {
            // InternalRpgindividual.g:5045:1: ( ( rule__NameAttribute__AttributeAssignment_1 ) )
            // InternalRpgindividual.g:5046:2: ( rule__NameAttribute__AttributeAssignment_1 )
            {
             before(grammarAccess.getNameAttributeAccess().getAttributeAssignment_1()); 
            // InternalRpgindividual.g:5047:2: ( rule__NameAttribute__AttributeAssignment_1 )
            // InternalRpgindividual.g:5047:3: rule__NameAttribute__AttributeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NameAttribute__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNameAttributeAccess().getAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameAttribute__Group__1__Impl"


    // $ANTLR start "rule__FloatNum__Group__0"
    // InternalRpgindividual.g:5056:1: rule__FloatNum__Group__0 : rule__FloatNum__Group__0__Impl rule__FloatNum__Group__1 ;
    public final void rule__FloatNum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5060:1: ( rule__FloatNum__Group__0__Impl rule__FloatNum__Group__1 )
            // InternalRpgindividual.g:5061:2: rule__FloatNum__Group__0__Impl rule__FloatNum__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__FloatNum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatNum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatNum__Group__0"


    // $ANTLR start "rule__FloatNum__Group__0__Impl"
    // InternalRpgindividual.g:5068:1: rule__FloatNum__Group__0__Impl : ( ( rule__FloatNum__IAssignment_0 ) ) ;
    public final void rule__FloatNum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5072:1: ( ( ( rule__FloatNum__IAssignment_0 ) ) )
            // InternalRpgindividual.g:5073:1: ( ( rule__FloatNum__IAssignment_0 ) )
            {
            // InternalRpgindividual.g:5073:1: ( ( rule__FloatNum__IAssignment_0 ) )
            // InternalRpgindividual.g:5074:2: ( rule__FloatNum__IAssignment_0 )
            {
             before(grammarAccess.getFloatNumAccess().getIAssignment_0()); 
            // InternalRpgindividual.g:5075:2: ( rule__FloatNum__IAssignment_0 )
            // InternalRpgindividual.g:5075:3: rule__FloatNum__IAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FloatNum__IAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFloatNumAccess().getIAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatNum__Group__0__Impl"


    // $ANTLR start "rule__FloatNum__Group__1"
    // InternalRpgindividual.g:5083:1: rule__FloatNum__Group__1 : rule__FloatNum__Group__1__Impl rule__FloatNum__Group__2 ;
    public final void rule__FloatNum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5087:1: ( rule__FloatNum__Group__1__Impl rule__FloatNum__Group__2 )
            // InternalRpgindividual.g:5088:2: rule__FloatNum__Group__1__Impl rule__FloatNum__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__FloatNum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatNum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatNum__Group__1"


    // $ANTLR start "rule__FloatNum__Group__1__Impl"
    // InternalRpgindividual.g:5095:1: rule__FloatNum__Group__1__Impl : ( '.' ) ;
    public final void rule__FloatNum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5099:1: ( ( '.' ) )
            // InternalRpgindividual.g:5100:1: ( '.' )
            {
            // InternalRpgindividual.g:5100:1: ( '.' )
            // InternalRpgindividual.g:5101:2: '.'
            {
             before(grammarAccess.getFloatNumAccess().getFullStopKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getFloatNumAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatNum__Group__1__Impl"


    // $ANTLR start "rule__FloatNum__Group__2"
    // InternalRpgindividual.g:5110:1: rule__FloatNum__Group__2 : rule__FloatNum__Group__2__Impl ;
    public final void rule__FloatNum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5114:1: ( rule__FloatNum__Group__2__Impl )
            // InternalRpgindividual.g:5115:2: rule__FloatNum__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatNum__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatNum__Group__2"


    // $ANTLR start "rule__FloatNum__Group__2__Impl"
    // InternalRpgindividual.g:5121:1: rule__FloatNum__Group__2__Impl : ( ( rule__FloatNum__DecimalAssignment_2 ) ) ;
    public final void rule__FloatNum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5125:1: ( ( ( rule__FloatNum__DecimalAssignment_2 ) ) )
            // InternalRpgindividual.g:5126:1: ( ( rule__FloatNum__DecimalAssignment_2 ) )
            {
            // InternalRpgindividual.g:5126:1: ( ( rule__FloatNum__DecimalAssignment_2 ) )
            // InternalRpgindividual.g:5127:2: ( rule__FloatNum__DecimalAssignment_2 )
            {
             before(grammarAccess.getFloatNumAccess().getDecimalAssignment_2()); 
            // InternalRpgindividual.g:5128:2: ( rule__FloatNum__DecimalAssignment_2 )
            // InternalRpgindividual.g:5128:3: rule__FloatNum__DecimalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FloatNum__DecimalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFloatNumAccess().getDecimalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatNum__Group__2__Impl"


    // $ANTLR start "rule__SystemRPG__NameAssignment_1"
    // InternalRpgindividual.g:5137:1: rule__SystemRPG__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SystemRPG__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5141:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5142:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5142:2: ( RULE_ID )
            // InternalRpgindividual.g:5143:3: RULE_ID
            {
             before(grammarAccess.getSystemRPGAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemRPGAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRPG__NameAssignment_1"


    // $ANTLR start "rule__SystemRPG__DeclarationsAssignment_2"
    // InternalRpgindividual.g:5152:1: rule__SystemRPG__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__SystemRPG__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5156:1: ( ( ruleDeclaration ) )
            // InternalRpgindividual.g:5157:2: ( ruleDeclaration )
            {
            // InternalRpgindividual.g:5157:2: ( ruleDeclaration )
            // InternalRpgindividual.g:5158:3: ruleDeclaration
            {
             before(grammarAccess.getSystemRPGAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getSystemRPGAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRPG__DeclarationsAssignment_2"


    // $ANTLR start "rule__Effects__EffectAssignment_1"
    // InternalRpgindividual.g:5167:1: rule__Effects__EffectAssignment_1 : ( ruleEffect ) ;
    public final void rule__Effects__EffectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5171:1: ( ( ruleEffect ) )
            // InternalRpgindividual.g:5172:2: ( ruleEffect )
            {
            // InternalRpgindividual.g:5172:2: ( ruleEffect )
            // InternalRpgindividual.g:5173:3: ruleEffect
            {
             before(grammarAccess.getEffectsAccess().getEffectEffectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEffect();

            state._fsp--;

             after(grammarAccess.getEffectsAccess().getEffectEffectParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effects__EffectAssignment_1"


    // $ANTLR start "rule__Effect__NameAssignment_1"
    // InternalRpgindividual.g:5182:1: rule__Effect__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Effect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5186:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5187:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5187:2: ( RULE_ID )
            // InternalRpgindividual.g:5188:3: RULE_ID
            {
             before(grammarAccess.getEffectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEffectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__NameAssignment_1"


    // $ANTLR start "rule__Effect__RuleAssignment_2"
    // InternalRpgindividual.g:5197:1: rule__Effect__RuleAssignment_2 : ( ruleRule ) ;
    public final void rule__Effect__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5201:1: ( ( ruleRule ) )
            // InternalRpgindividual.g:5202:2: ( ruleRule )
            {
            // InternalRpgindividual.g:5202:2: ( ruleRule )
            // InternalRpgindividual.g:5203:3: ruleRule
            {
             before(grammarAccess.getEffectAccess().getRuleRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getEffectAccess().getRuleRuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__RuleAssignment_2"


    // $ANTLR start "rule__Attributes__AttributeAssignment_1"
    // InternalRpgindividual.g:5212:1: rule__Attributes__AttributeAssignment_1 : ( ruleAttribute ) ;
    public final void rule__Attributes__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5216:1: ( ( ruleAttribute ) )
            // InternalRpgindividual.g:5217:2: ( ruleAttribute )
            {
            // InternalRpgindividual.g:5217:2: ( ruleAttribute )
            // InternalRpgindividual.g:5218:3: ruleAttribute
            {
             before(grammarAccess.getAttributesAccess().getAttributeAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributesAccess().getAttributeAttributeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__AttributeAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalRpgindividual.g:5227:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5231:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5232:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5232:2: ( RULE_ID )
            // InternalRpgindividual.g:5233:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__AValAssignment_2"
    // InternalRpgindividual.g:5242:1: rule__Attribute__AValAssignment_2 : ( ruleAttributeValues ) ;
    public final void rule__Attribute__AValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5246:1: ( ( ruleAttributeValues ) )
            // InternalRpgindividual.g:5247:2: ( ruleAttributeValues )
            {
            // InternalRpgindividual.g:5247:2: ( ruleAttributeValues )
            // InternalRpgindividual.g:5248:3: ruleAttributeValues
            {
             before(grammarAccess.getAttributeAccess().getAValAttributeValuesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeValues();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAValAttributeValuesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AValAssignment_2"


    // $ANTLR start "rule__Locations__LocAssignment_1"
    // InternalRpgindividual.g:5257:1: rule__Locations__LocAssignment_1 : ( ruleLoc ) ;
    public final void rule__Locations__LocAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5261:1: ( ( ruleLoc ) )
            // InternalRpgindividual.g:5262:2: ( ruleLoc )
            {
            // InternalRpgindividual.g:5262:2: ( ruleLoc )
            // InternalRpgindividual.g:5263:3: ruleLoc
            {
             before(grammarAccess.getLocationsAccess().getLocLocParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLoc();

            state._fsp--;

             after(grammarAccess.getLocationsAccess().getLocLocParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locations__LocAssignment_1"


    // $ANTLR start "rule__Loc__NameAssignment_0"
    // InternalRpgindividual.g:5272:1: rule__Loc__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Loc__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5276:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5277:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5277:2: ( RULE_ID )
            // InternalRpgindividual.g:5278:3: RULE_ID
            {
             before(grammarAccess.getLocAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__NameAssignment_0"


    // $ANTLR start "rule__Loc__TeamAssignment_2"
    // InternalRpgindividual.g:5287:1: rule__Loc__TeamAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Loc__TeamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5291:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5292:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5292:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5293:3: ( RULE_ID )
            {
             before(grammarAccess.getLocAccess().getTeamTeamCrossReference_2_0()); 
            // InternalRpgindividual.g:5294:3: ( RULE_ID )
            // InternalRpgindividual.g:5295:4: RULE_ID
            {
             before(grammarAccess.getLocAccess().getTeamTeamIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocAccess().getTeamTeamIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getLocAccess().getTeamTeamCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loc__TeamAssignment_2"


    // $ANTLR start "rule__Relations__TypeAssignment_1"
    // InternalRpgindividual.g:5306:1: rule__Relations__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Relations__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5310:1: ( ( ruleType ) )
            // InternalRpgindividual.g:5311:2: ( ruleType )
            {
            // InternalRpgindividual.g:5311:2: ( ruleType )
            // InternalRpgindividual.g:5312:3: ruleType
            {
             before(grammarAccess.getRelationsAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getRelationsAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relations__TypeAssignment_1"


    // $ANTLR start "rule__Type__NameAssignment_1"
    // InternalRpgindividual.g:5321:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5325:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5326:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5326:2: ( RULE_ID )
            // InternalRpgindividual.g:5327:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_1"


    // $ANTLR start "rule__Type__TExpressionAssignment_2"
    // InternalRpgindividual.g:5336:1: rule__Type__TExpressionAssignment_2 : ( ruleTypeExpression ) ;
    public final void rule__Type__TExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5340:1: ( ( ruleTypeExpression ) )
            // InternalRpgindividual.g:5341:2: ( ruleTypeExpression )
            {
            // InternalRpgindividual.g:5341:2: ( ruleTypeExpression )
            // InternalRpgindividual.g:5342:3: ruleTypeExpression
            {
             before(grammarAccess.getTypeAccess().getTExpressionTypeExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeExpression();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTExpressionTypeExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TExpressionAssignment_2"


    // $ANTLR start "rule__TypeExpression__RelationStrongAssignment_1"
    // InternalRpgindividual.g:5351:1: rule__TypeExpression__RelationStrongAssignment_1 : ( ruleFloatNum ) ;
    public final void rule__TypeExpression__RelationStrongAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5355:1: ( ( ruleFloatNum ) )
            // InternalRpgindividual.g:5356:2: ( ruleFloatNum )
            {
            // InternalRpgindividual.g:5356:2: ( ruleFloatNum )
            // InternalRpgindividual.g:5357:3: ruleFloatNum
            {
             before(grammarAccess.getTypeExpressionAccess().getRelationStrongFloatNumParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFloatNum();

            state._fsp--;

             after(grammarAccess.getTypeExpressionAccess().getRelationStrongFloatNumParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__RelationStrongAssignment_1"


    // $ANTLR start "rule__TypeExpression__StrongAssignment_3"
    // InternalRpgindividual.g:5366:1: rule__TypeExpression__StrongAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__TypeExpression__StrongAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5370:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5371:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5371:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5372:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeExpressionAccess().getStrongTypeCrossReference_3_0()); 
            // InternalRpgindividual.g:5373:3: ( RULE_ID )
            // InternalRpgindividual.g:5374:4: RULE_ID
            {
             before(grammarAccess.getTypeExpressionAccess().getStrongTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getStrongTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTypeExpressionAccess().getStrongTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__StrongAssignment_3"


    // $ANTLR start "rule__TypeExpression__Strong2Assignment_4_1"
    // InternalRpgindividual.g:5385:1: rule__TypeExpression__Strong2Assignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeExpression__Strong2Assignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5389:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5390:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5390:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5391:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeExpressionAccess().getStrong2TypeCrossReference_4_1_0()); 
            // InternalRpgindividual.g:5392:3: ( RULE_ID )
            // InternalRpgindividual.g:5393:4: RULE_ID
            {
             before(grammarAccess.getTypeExpressionAccess().getStrong2TypeIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getStrong2TypeIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getTypeExpressionAccess().getStrong2TypeCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Strong2Assignment_4_1"


    // $ANTLR start "rule__TypeExpression__RelationWeakAssignment_6"
    // InternalRpgindividual.g:5404:1: rule__TypeExpression__RelationWeakAssignment_6 : ( ruleFloatNum ) ;
    public final void rule__TypeExpression__RelationWeakAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5408:1: ( ( ruleFloatNum ) )
            // InternalRpgindividual.g:5409:2: ( ruleFloatNum )
            {
            // InternalRpgindividual.g:5409:2: ( ruleFloatNum )
            // InternalRpgindividual.g:5410:3: ruleFloatNum
            {
             before(grammarAccess.getTypeExpressionAccess().getRelationWeakFloatNumParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFloatNum();

            state._fsp--;

             after(grammarAccess.getTypeExpressionAccess().getRelationWeakFloatNumParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__RelationWeakAssignment_6"


    // $ANTLR start "rule__TypeExpression__WeakAssignment_8"
    // InternalRpgindividual.g:5419:1: rule__TypeExpression__WeakAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__TypeExpression__WeakAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5423:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5424:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5424:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5425:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeExpressionAccess().getWeakTypeCrossReference_8_0()); 
            // InternalRpgindividual.g:5426:3: ( RULE_ID )
            // InternalRpgindividual.g:5427:4: RULE_ID
            {
             before(grammarAccess.getTypeExpressionAccess().getWeakTypeIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getWeakTypeIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getTypeExpressionAccess().getWeakTypeCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__WeakAssignment_8"


    // $ANTLR start "rule__TypeExpression__Weak2Assignment_9_1"
    // InternalRpgindividual.g:5438:1: rule__TypeExpression__Weak2Assignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeExpression__Weak2Assignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5442:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5443:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5443:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5444:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeExpressionAccess().getWeak2TypeCrossReference_9_1_0()); 
            // InternalRpgindividual.g:5445:3: ( RULE_ID )
            // InternalRpgindividual.g:5446:4: RULE_ID
            {
             before(grammarAccess.getTypeExpressionAccess().getWeak2TypeIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getWeak2TypeIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getTypeExpressionAccess().getWeak2TypeCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeExpression__Weak2Assignment_9_1"


    // $ANTLR start "rule__Moves__MoveAssignment_1"
    // InternalRpgindividual.g:5457:1: rule__Moves__MoveAssignment_1 : ( ruleMove ) ;
    public final void rule__Moves__MoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5461:1: ( ( ruleMove ) )
            // InternalRpgindividual.g:5462:2: ( ruleMove )
            {
            // InternalRpgindividual.g:5462:2: ( ruleMove )
            // InternalRpgindividual.g:5463:3: ruleMove
            {
             before(grammarAccess.getMovesAccess().getMoveMoveParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMovesAccess().getMoveMoveParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Moves__MoveAssignment_1"


    // $ANTLR start "rule__Move__NameAssignment_1"
    // InternalRpgindividual.g:5472:1: rule__Move__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Move__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5476:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5477:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5477:2: ( RULE_ID )
            // InternalRpgindividual.g:5478:3: RULE_ID
            {
             before(grammarAccess.getMoveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__NameAssignment_1"


    // $ANTLR start "rule__Move__ETypeAssignment_2"
    // InternalRpgindividual.g:5487:1: rule__Move__ETypeAssignment_2 : ( ruleEType ) ;
    public final void rule__Move__ETypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5491:1: ( ( ruleEType ) )
            // InternalRpgindividual.g:5492:2: ( ruleEType )
            {
            // InternalRpgindividual.g:5492:2: ( ruleEType )
            // InternalRpgindividual.g:5493:3: ruleEType
            {
             before(grammarAccess.getMoveAccess().getETypeETypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEType();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getETypeETypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__ETypeAssignment_2"


    // $ANTLR start "rule__Move__AttAssignment_3"
    // InternalRpgindividual.g:5502:1: rule__Move__AttAssignment_3 : ( ruleAltAttribute ) ;
    public final void rule__Move__AttAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5506:1: ( ( ruleAltAttribute ) )
            // InternalRpgindividual.g:5507:2: ( ruleAltAttribute )
            {
            // InternalRpgindividual.g:5507:2: ( ruleAltAttribute )
            // InternalRpgindividual.g:5508:3: ruleAltAttribute
            {
             before(grammarAccess.getMoveAccess().getAttAltAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAltAttribute();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getAttAltAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__AttAssignment_3"


    // $ANTLR start "rule__Move__MEffectAssignment_4"
    // InternalRpgindividual.g:5517:1: rule__Move__MEffectAssignment_4 : ( ruleMEffect ) ;
    public final void rule__Move__MEffectAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5521:1: ( ( ruleMEffect ) )
            // InternalRpgindividual.g:5522:2: ( ruleMEffect )
            {
            // InternalRpgindividual.g:5522:2: ( ruleMEffect )
            // InternalRpgindividual.g:5523:3: ruleMEffect
            {
             before(grammarAccess.getMoveAccess().getMEffectMEffectParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMEffect();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getMEffectMEffectParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__MEffectAssignment_4"


    // $ANTLR start "rule__MEffect__MoveENameAssignment_1"
    // InternalRpgindividual.g:5532:1: rule__MEffect__MoveENameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MEffect__MoveENameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5536:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5537:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5537:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5538:3: ( RULE_ID )
            {
             before(grammarAccess.getMEffectAccess().getMoveENameEffectCrossReference_1_0()); 
            // InternalRpgindividual.g:5539:3: ( RULE_ID )
            // InternalRpgindividual.g:5540:4: RULE_ID
            {
             before(grammarAccess.getMEffectAccess().getMoveENameEffectIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMEffectAccess().getMoveENameEffectIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMEffectAccess().getMoveENameEffectCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEffect__MoveENameAssignment_1"


    // $ANTLR start "rule__EType__TypeAssignment_1"
    // InternalRpgindividual.g:5551:1: rule__EType__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5555:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5556:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5556:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5557:3: ( RULE_ID )
            {
             before(grammarAccess.getETypeAccess().getTypeTypeCrossReference_1_0()); 
            // InternalRpgindividual.g:5558:3: ( RULE_ID )
            // InternalRpgindividual.g:5559:4: RULE_ID
            {
             before(grammarAccess.getETypeAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getETypeAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getETypeAccess().getTypeTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EType__TypeAssignment_1"


    // $ANTLR start "rule__AttributeValues__LTypesAssignment_1_0"
    // InternalRpgindividual.g:5570:1: rule__AttributeValues__LTypesAssignment_1_0 : ( ruleLegalType ) ;
    public final void rule__AttributeValues__LTypesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5574:1: ( ( ruleLegalType ) )
            // InternalRpgindividual.g:5575:2: ( ruleLegalType )
            {
            // InternalRpgindividual.g:5575:2: ( ruleLegalType )
            // InternalRpgindividual.g:5576:3: ruleLegalType
            {
             before(grammarAccess.getAttributeValuesAccess().getLTypesLegalTypeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLegalType();

            state._fsp--;

             after(grammarAccess.getAttributeValuesAccess().getLTypesLegalTypeParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValues__LTypesAssignment_1_0"


    // $ANTLR start "rule__AttributeValues__AnAssignment_1_1"
    // InternalRpgindividual.g:5585:1: rule__AttributeValues__AnAssignment_1_1 : ( ruleActualNumbers ) ;
    public final void rule__AttributeValues__AnAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5589:1: ( ( ruleActualNumbers ) )
            // InternalRpgindividual.g:5590:2: ( ruleActualNumbers )
            {
            // InternalRpgindividual.g:5590:2: ( ruleActualNumbers )
            // InternalRpgindividual.g:5591:3: ruleActualNumbers
            {
             before(grammarAccess.getAttributeValuesAccess().getAnActualNumbersParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActualNumbers();

            state._fsp--;

             after(grammarAccess.getAttributeValuesAccess().getAnActualNumbersParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValues__AnAssignment_1_1"


    // $ANTLR start "rule__AltAttribute__AttributeAssignment_1"
    // InternalRpgindividual.g:5600:1: rule__AltAttribute__AttributeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AltAttribute__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5604:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5605:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5605:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5606:3: ( RULE_ID )
            {
             before(grammarAccess.getAltAttributeAccess().getAttributeAttributeCrossReference_1_0()); 
            // InternalRpgindividual.g:5607:3: ( RULE_ID )
            // InternalRpgindividual.g:5608:4: RULE_ID
            {
             before(grammarAccess.getAltAttributeAccess().getAttributeAttributeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAltAttributeAccess().getAttributeAttributeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAltAttributeAccess().getAttributeAttributeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AltAttribute__AttributeAssignment_1"


    // $ANTLR start "rule__AltAttribute__AvAssignment_2"
    // InternalRpgindividual.g:5619:1: rule__AltAttribute__AvAssignment_2 : ( ruleAttributeValues ) ;
    public final void rule__AltAttribute__AvAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5623:1: ( ( ruleAttributeValues ) )
            // InternalRpgindividual.g:5624:2: ( ruleAttributeValues )
            {
            // InternalRpgindividual.g:5624:2: ( ruleAttributeValues )
            // InternalRpgindividual.g:5625:3: ruleAttributeValues
            {
             before(grammarAccess.getAltAttributeAccess().getAvAttributeValuesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeValues();

            state._fsp--;

             after(grammarAccess.getAltAttributeAccess().getAvAttributeValuesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AltAttribute__AvAssignment_2"


    // $ANTLR start "rule__Rule__OrAssignment_0_1"
    // InternalRpgindividual.g:5634:1: rule__Rule__OrAssignment_0_1 : ( ruleORcondition ) ;
    public final void rule__Rule__OrAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5638:1: ( ( ruleORcondition ) )
            // InternalRpgindividual.g:5639:2: ( ruleORcondition )
            {
            // InternalRpgindividual.g:5639:2: ( ruleORcondition )
            // InternalRpgindividual.g:5640:3: ruleORcondition
            {
             before(grammarAccess.getRuleAccess().getOrORconditionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleORcondition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getOrORconditionParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__OrAssignment_0_1"


    // $ANTLR start "rule__Rule__TargetThenAssignment_1"
    // InternalRpgindividual.g:5649:1: rule__Rule__TargetThenAssignment_1 : ( ruleTarget ) ;
    public final void rule__Rule__TargetThenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5653:1: ( ( ruleTarget ) )
            // InternalRpgindividual.g:5654:2: ( ruleTarget )
            {
            // InternalRpgindividual.g:5654:2: ( ruleTarget )
            // InternalRpgindividual.g:5655:3: ruleTarget
            {
             before(grammarAccess.getRuleAccess().getTargetThenTargetParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getTargetThenTargetParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__TargetThenAssignment_1"


    // $ANTLR start "rule__Rule__TargetAttAssignment_2"
    // InternalRpgindividual.g:5664:1: rule__Rule__TargetAttAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__TargetAttAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5668:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5669:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5669:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5670:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getTargetAttAttributeCrossReference_2_0()); 
            // InternalRpgindividual.g:5671:3: ( RULE_ID )
            // InternalRpgindividual.g:5672:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getTargetAttAttributeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getTargetAttAttributeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getTargetAttAttributeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__TargetAttAssignment_2"


    // $ANTLR start "rule__Rule__ChangeAssignment_4"
    // InternalRpgindividual.g:5683:1: rule__Rule__ChangeAssignment_4 : ( ( rule__Rule__ChangeAlternatives_4_0 ) ) ;
    public final void rule__Rule__ChangeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5687:1: ( ( ( rule__Rule__ChangeAlternatives_4_0 ) ) )
            // InternalRpgindividual.g:5688:2: ( ( rule__Rule__ChangeAlternatives_4_0 ) )
            {
            // InternalRpgindividual.g:5688:2: ( ( rule__Rule__ChangeAlternatives_4_0 ) )
            // InternalRpgindividual.g:5689:3: ( rule__Rule__ChangeAlternatives_4_0 )
            {
             before(grammarAccess.getRuleAccess().getChangeAlternatives_4_0()); 
            // InternalRpgindividual.g:5690:3: ( rule__Rule__ChangeAlternatives_4_0 )
            // InternalRpgindividual.g:5690:4: rule__Rule__ChangeAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ChangeAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getChangeAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ChangeAssignment_4"


    // $ANTLR start "rule__Rule__SumAssignment_5"
    // InternalRpgindividual.g:5698:1: rule__Rule__SumAssignment_5 : ( ruleSum ) ;
    public final void rule__Rule__SumAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5702:1: ( ( ruleSum ) )
            // InternalRpgindividual.g:5703:2: ( ruleSum )
            {
            // InternalRpgindividual.g:5703:2: ( ruleSum )
            // InternalRpgindividual.g:5704:3: ruleSum
            {
             before(grammarAccess.getRuleAccess().getSumSumParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getSumSumParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__SumAssignment_5"


    // $ANTLR start "rule__Entities__EntityAssignment_1"
    // InternalRpgindividual.g:5713:1: rule__Entities__EntityAssignment_1 : ( ruleEntity ) ;
    public final void rule__Entities__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5717:1: ( ( ruleEntity ) )
            // InternalRpgindividual.g:5718:2: ( ruleEntity )
            {
            // InternalRpgindividual.g:5718:2: ( ruleEntity )
            // InternalRpgindividual.g:5719:3: ruleEntity
            {
             before(grammarAccess.getEntitiesAccess().getEntityEntityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntitiesAccess().getEntityEntityParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__EntityAssignment_1"


    // $ANTLR start "rule__Death__LogAssignment_2"
    // InternalRpgindividual.g:5728:1: rule__Death__LogAssignment_2 : ( ruleORcondition ) ;
    public final void rule__Death__LogAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5732:1: ( ( ruleORcondition ) )
            // InternalRpgindividual.g:5733:2: ( ruleORcondition )
            {
            // InternalRpgindividual.g:5733:2: ( ruleORcondition )
            // InternalRpgindividual.g:5734:3: ruleORcondition
            {
             before(grammarAccess.getDeathAccess().getLogORconditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleORcondition();

            state._fsp--;

             after(grammarAccess.getDeathAccess().getLogORconditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Death__LogAssignment_2"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalRpgindividual.g:5743:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5747:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5748:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5748:2: ( RULE_ID )
            // InternalRpgindividual.g:5749:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__ETypeAssignment_2"
    // InternalRpgindividual.g:5758:1: rule__Entity__ETypeAssignment_2 : ( ruleEType ) ;
    public final void rule__Entity__ETypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5762:1: ( ( ruleEType ) )
            // InternalRpgindividual.g:5763:2: ( ruleEType )
            {
            // InternalRpgindividual.g:5763:2: ( ruleEType )
            // InternalRpgindividual.g:5764:3: ruleEType
            {
             before(grammarAccess.getEntityAccess().getETypeETypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEType();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getETypeETypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ETypeAssignment_2"


    // $ANTLR start "rule__Entity__AttAssignment_3"
    // InternalRpgindividual.g:5773:1: rule__Entity__AttAssignment_3 : ( ruleAltAttribute ) ;
    public final void rule__Entity__AttAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5777:1: ( ( ruleAltAttribute ) )
            // InternalRpgindividual.g:5778:2: ( ruleAltAttribute )
            {
            // InternalRpgindividual.g:5778:2: ( ruleAltAttribute )
            // InternalRpgindividual.g:5779:3: ruleAltAttribute
            {
             before(grammarAccess.getEntityAccess().getAttAltAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAltAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttAltAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttAssignment_3"


    // $ANTLR start "rule__Entity__EMovesAssignment_4"
    // InternalRpgindividual.g:5788:1: rule__Entity__EMovesAssignment_4 : ( ruleEntityMoves ) ;
    public final void rule__Entity__EMovesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5792:1: ( ( ruleEntityMoves ) )
            // InternalRpgindividual.g:5793:2: ( ruleEntityMoves )
            {
            // InternalRpgindividual.g:5793:2: ( ruleEntityMoves )
            // InternalRpgindividual.g:5794:3: ruleEntityMoves
            {
             before(grammarAccess.getEntityAccess().getEMovesEntityMovesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityMoves();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getEMovesEntityMovesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__EMovesAssignment_4"


    // $ANTLR start "rule__EntityMoves__MoveAssignment_1"
    // InternalRpgindividual.g:5803:1: rule__EntityMoves__MoveAssignment_1 : ( ruleEntityMoveModifier ) ;
    public final void rule__EntityMoves__MoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5807:1: ( ( ruleEntityMoveModifier ) )
            // InternalRpgindividual.g:5808:2: ( ruleEntityMoveModifier )
            {
            // InternalRpgindividual.g:5808:2: ( ruleEntityMoveModifier )
            // InternalRpgindividual.g:5809:3: ruleEntityMoveModifier
            {
             before(grammarAccess.getEntityMovesAccess().getMoveEntityMoveModifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityMoveModifier();

            state._fsp--;

             after(grammarAccess.getEntityMovesAccess().getMoveEntityMoveModifierParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoves__MoveAssignment_1"


    // $ANTLR start "rule__EntityMoveModifier__MoveNameAssignment_0"
    // InternalRpgindividual.g:5818:1: rule__EntityMoveModifier__MoveNameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__EntityMoveModifier__MoveNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5822:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5823:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5823:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5824:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityMoveModifierAccess().getMoveNameMoveCrossReference_0_0()); 
            // InternalRpgindividual.g:5825:3: ( RULE_ID )
            // InternalRpgindividual.g:5826:4: RULE_ID
            {
             before(grammarAccess.getEntityMoveModifierAccess().getMoveNameMoveIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityMoveModifierAccess().getMoveNameMoveIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEntityMoveModifierAccess().getMoveNameMoveCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveModifier__MoveNameAssignment_0"


    // $ANTLR start "rule__EntityMoveModifier__MoveModificationAssignment_2"
    // InternalRpgindividual.g:5837:1: rule__EntityMoveModifier__MoveModificationAssignment_2 : ( ruleEntityMoveMultiplier ) ;
    public final void rule__EntityMoveModifier__MoveModificationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5841:1: ( ( ruleEntityMoveMultiplier ) )
            // InternalRpgindividual.g:5842:2: ( ruleEntityMoveMultiplier )
            {
            // InternalRpgindividual.g:5842:2: ( ruleEntityMoveMultiplier )
            // InternalRpgindividual.g:5843:3: ruleEntityMoveMultiplier
            {
             before(grammarAccess.getEntityMoveModifierAccess().getMoveModificationEntityMoveMultiplierParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityMoveMultiplier();

            state._fsp--;

             after(grammarAccess.getEntityMoveModifierAccess().getMoveModificationEntityMoveMultiplierParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveModifier__MoveModificationAssignment_2"


    // $ANTLR start "rule__EntityMoveMultiplier__AttributeAssignment_0"
    // InternalRpgindividual.g:5852:1: rule__EntityMoveMultiplier__AttributeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__EntityMoveMultiplier__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5856:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5857:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5857:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5858:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityMoveMultiplierAccess().getAttributeAttributeCrossReference_0_0()); 
            // InternalRpgindividual.g:5859:3: ( RULE_ID )
            // InternalRpgindividual.g:5860:4: RULE_ID
            {
             before(grammarAccess.getEntityMoveMultiplierAccess().getAttributeAttributeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityMoveMultiplierAccess().getAttributeAttributeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEntityMoveMultiplierAccess().getAttributeAttributeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveMultiplier__AttributeAssignment_0"


    // $ANTLR start "rule__EntityMoveMultiplier__MultiplierAssignment_2"
    // InternalRpgindividual.g:5871:1: rule__EntityMoveMultiplier__MultiplierAssignment_2 : ( ruleSum ) ;
    public final void rule__EntityMoveMultiplier__MultiplierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5875:1: ( ( ruleSum ) )
            // InternalRpgindividual.g:5876:2: ( ruleSum )
            {
            // InternalRpgindividual.g:5876:2: ( ruleSum )
            // InternalRpgindividual.g:5877:3: ruleSum
            {
             before(grammarAccess.getEntityMoveMultiplierAccess().getMultiplierSumParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getEntityMoveMultiplierAccess().getMultiplierSumParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveMultiplier__MultiplierAssignment_2"


    // $ANTLR start "rule__Teams__TeamAssignment_1"
    // InternalRpgindividual.g:5886:1: rule__Teams__TeamAssignment_1 : ( ruleTeam ) ;
    public final void rule__Teams__TeamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5890:1: ( ( ruleTeam ) )
            // InternalRpgindividual.g:5891:2: ( ruleTeam )
            {
            // InternalRpgindividual.g:5891:2: ( ruleTeam )
            // InternalRpgindividual.g:5892:3: ruleTeam
            {
             before(grammarAccess.getTeamsAccess().getTeamTeamParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTeam();

            state._fsp--;

             after(grammarAccess.getTeamsAccess().getTeamTeamParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teams__TeamAssignment_1"


    // $ANTLR start "rule__Team__NameAssignment_1"
    // InternalRpgindividual.g:5901:1: rule__Team__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Team__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5905:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5906:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5906:2: ( RULE_ID )
            // InternalRpgindividual.g:5907:3: RULE_ID
            {
             before(grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__NameAssignment_1"


    // $ANTLR start "rule__Team__MembersAssignment_2"
    // InternalRpgindividual.g:5916:1: rule__Team__MembersAssignment_2 : ( ruleMembers ) ;
    public final void rule__Team__MembersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5920:1: ( ( ruleMembers ) )
            // InternalRpgindividual.g:5921:2: ( ruleMembers )
            {
            // InternalRpgindividual.g:5921:2: ( ruleMembers )
            // InternalRpgindividual.g:5922:3: ruleMembers
            {
             before(grammarAccess.getTeamAccess().getMembersMembersParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMembers();

            state._fsp--;

             after(grammarAccess.getTeamAccess().getMembersMembersParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__MembersAssignment_2"


    // $ANTLR start "rule__Members__EntityAssignment_1"
    // InternalRpgindividual.g:5931:1: rule__Members__EntityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Members__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5935:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5936:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5936:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5937:3: ( RULE_ID )
            {
             before(grammarAccess.getMembersAccess().getEntityEntityCrossReference_1_0()); 
            // InternalRpgindividual.g:5938:3: ( RULE_ID )
            // InternalRpgindividual.g:5939:4: RULE_ID
            {
             before(grammarAccess.getMembersAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMembersAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMembersAccess().getEntityEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Members__EntityAssignment_1"


    // $ANTLR start "rule__ORcondition__RightAssignment_1_2"
    // InternalRpgindividual.g:5950:1: rule__ORcondition__RightAssignment_1_2 : ( ruleANDcondition ) ;
    public final void rule__ORcondition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5954:1: ( ( ruleANDcondition ) )
            // InternalRpgindividual.g:5955:2: ( ruleANDcondition )
            {
            // InternalRpgindividual.g:5955:2: ( ruleANDcondition )
            // InternalRpgindividual.g:5956:3: ruleANDcondition
            {
             before(grammarAccess.getORconditionAccess().getRightANDconditionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleANDcondition();

            state._fsp--;

             after(grammarAccess.getORconditionAccess().getRightANDconditionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORcondition__RightAssignment_1_2"


    // $ANTLR start "rule__ANDcondition__RightAssignment_1_2"
    // InternalRpgindividual.g:5965:1: rule__ANDcondition__RightAssignment_1_2 : ( ruleStatement ) ;
    public final void rule__ANDcondition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5969:1: ( ( ruleStatement ) )
            // InternalRpgindividual.g:5970:2: ( ruleStatement )
            {
            // InternalRpgindividual.g:5970:2: ( ruleStatement )
            // InternalRpgindividual.g:5971:3: ruleStatement
            {
             before(grammarAccess.getANDconditionAccess().getRightStatementParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getANDconditionAccess().getRightStatementParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDcondition__RightAssignment_1_2"


    // $ANTLR start "rule__NumberComparing__LeftAssignment_0"
    // InternalRpgindividual.g:5980:1: rule__NumberComparing__LeftAssignment_0 : ( ruleSum ) ;
    public final void rule__NumberComparing__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5984:1: ( ( ruleSum ) )
            // InternalRpgindividual.g:5985:2: ( ruleSum )
            {
            // InternalRpgindividual.g:5985:2: ( ruleSum )
            // InternalRpgindividual.g:5986:3: ruleSum
            {
             before(grammarAccess.getNumberComparingAccess().getLeftSumParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getNumberComparingAccess().getLeftSumParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberComparing__LeftAssignment_0"


    // $ANTLR start "rule__NumberComparing__CompAssignment_1"
    // InternalRpgindividual.g:5995:1: rule__NumberComparing__CompAssignment_1 : ( ruleComparator ) ;
    public final void rule__NumberComparing__CompAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5999:1: ( ( ruleComparator ) )
            // InternalRpgindividual.g:6000:2: ( ruleComparator )
            {
            // InternalRpgindividual.g:6000:2: ( ruleComparator )
            // InternalRpgindividual.g:6001:3: ruleComparator
            {
             before(grammarAccess.getNumberComparingAccess().getCompComparatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparator();

            state._fsp--;

             after(grammarAccess.getNumberComparingAccess().getCompComparatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberComparing__CompAssignment_1"


    // $ANTLR start "rule__NumberComparing__RightAssignment_2"
    // InternalRpgindividual.g:6010:1: rule__NumberComparing__RightAssignment_2 : ( ruleSum ) ;
    public final void rule__NumberComparing__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6014:1: ( ( ruleSum ) )
            // InternalRpgindividual.g:6015:2: ( ruleSum )
            {
            // InternalRpgindividual.g:6015:2: ( ruleSum )
            // InternalRpgindividual.g:6016:3: ruleSum
            {
             before(grammarAccess.getNumberComparingAccess().getRightSumParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getNumberComparingAccess().getRightSumParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberComparing__RightAssignment_2"


    // $ANTLR start "rule__Sum__RightAssignment_1_1"
    // InternalRpgindividual.g:6025:1: rule__Sum__RightAssignment_1_1 : ( ruleMultiply ) ;
    public final void rule__Sum__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6029:1: ( ( ruleMultiply ) )
            // InternalRpgindividual.g:6030:2: ( ruleMultiply )
            {
            // InternalRpgindividual.g:6030:2: ( ruleMultiply )
            // InternalRpgindividual.g:6031:3: ruleMultiply
            {
             before(grammarAccess.getSumAccess().getRightMultiplyParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiply();

            state._fsp--;

             after(grammarAccess.getSumAccess().getRightMultiplyParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__RightAssignment_1_1"


    // $ANTLR start "rule__Multiply__RightAssignment_1_1"
    // InternalRpgindividual.g:6040:1: rule__Multiply__RightAssignment_1_1 : ( ruleAtomicNumber ) ;
    public final void rule__Multiply__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6044:1: ( ( ruleAtomicNumber ) )
            // InternalRpgindividual.g:6045:2: ( ruleAtomicNumber )
            {
            // InternalRpgindividual.g:6045:2: ( ruleAtomicNumber )
            // InternalRpgindividual.g:6046:3: ruleAtomicNumber
            {
             before(grammarAccess.getMultiplyAccess().getRightAtomicNumberParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomicNumber();

            state._fsp--;

             after(grammarAccess.getMultiplyAccess().getRightAtomicNumberParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__RightAssignment_1_1"


    // $ANTLR start "rule__NameAttribute__TargetAssignment_0"
    // InternalRpgindividual.g:6055:1: rule__NameAttribute__TargetAssignment_0 : ( ruleTarget ) ;
    public final void rule__NameAttribute__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6059:1: ( ( ruleTarget ) )
            // InternalRpgindividual.g:6060:2: ( ruleTarget )
            {
            // InternalRpgindividual.g:6060:2: ( ruleTarget )
            // InternalRpgindividual.g:6061:3: ruleTarget
            {
             before(grammarAccess.getNameAttributeAccess().getTargetTargetParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getNameAttributeAccess().getTargetTargetParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameAttribute__TargetAssignment_0"


    // $ANTLR start "rule__NameAttribute__AttributeAssignment_1"
    // InternalRpgindividual.g:6070:1: rule__NameAttribute__AttributeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__NameAttribute__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6074:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:6075:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:6075:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:6076:3: ( RULE_ID )
            {
             before(grammarAccess.getNameAttributeAccess().getAttributeAttributeCrossReference_1_0()); 
            // InternalRpgindividual.g:6077:3: ( RULE_ID )
            // InternalRpgindividual.g:6078:4: RULE_ID
            {
             before(grammarAccess.getNameAttributeAccess().getAttributeAttributeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameAttributeAccess().getAttributeAttributeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getNameAttributeAccess().getAttributeAttributeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameAttribute__AttributeAssignment_1"


    // $ANTLR start "rule__IntNum__ValueAssignment"
    // InternalRpgindividual.g:6089:1: rule__IntNum__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntNum__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6093:1: ( ( RULE_INT ) )
            // InternalRpgindividual.g:6094:2: ( RULE_INT )
            {
            // InternalRpgindividual.g:6094:2: ( RULE_INT )
            // InternalRpgindividual.g:6095:3: RULE_INT
            {
             before(grammarAccess.getIntNumAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntNumAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntNum__ValueAssignment"


    // $ANTLR start "rule__FloatNum__IAssignment_0"
    // InternalRpgindividual.g:6104:1: rule__FloatNum__IAssignment_0 : ( RULE_INT ) ;
    public final void rule__FloatNum__IAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6108:1: ( ( RULE_INT ) )
            // InternalRpgindividual.g:6109:2: ( RULE_INT )
            {
            // InternalRpgindividual.g:6109:2: ( RULE_INT )
            // InternalRpgindividual.g:6110:3: RULE_INT
            {
             before(grammarAccess.getFloatNumAccess().getIINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatNumAccess().getIINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatNum__IAssignment_0"


    // $ANTLR start "rule__FloatNum__DecimalAssignment_2"
    // InternalRpgindividual.g:6119:1: rule__FloatNum__DecimalAssignment_2 : ( RULE_INT ) ;
    public final void rule__FloatNum__DecimalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6123:1: ( ( RULE_INT ) )
            // InternalRpgindividual.g:6124:2: ( RULE_INT )
            {
            // InternalRpgindividual.g:6124:2: ( RULE_INT )
            // InternalRpgindividual.g:6125:3: RULE_INT
            {
             before(grammarAccess.getFloatNumAccess().getDecimalINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatNumAccess().getDecimalINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatNum__DecimalAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000041841540000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000041841540002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200006000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000018020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000020001E020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000820001E020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x001F800000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020020000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0020020000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0040000000000000L});

}