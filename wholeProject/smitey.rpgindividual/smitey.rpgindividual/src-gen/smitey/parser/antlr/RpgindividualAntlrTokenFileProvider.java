/*
 * generated by Xtext 2.21.0
 */
package smitey.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RpgindividualAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("smitey/parser/antlr/internal/InternalRpgindividual.tokens");
	}
}
