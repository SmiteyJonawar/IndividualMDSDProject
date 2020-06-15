/*
 * generated by Xtext 2.21.0
 */
package smitey.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import smitey.parser.antlr.internal.InternalRpgindividualParser;
import smitey.services.RpgindividualGrammarAccess;

public class RpgindividualParser extends AbstractAntlrParser {

	@Inject
	private RpgindividualGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRpgindividualParser createParser(XtextTokenStream stream) {
		return new InternalRpgindividualParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "SystemRPG";
	}

	public RpgindividualGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RpgindividualGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
