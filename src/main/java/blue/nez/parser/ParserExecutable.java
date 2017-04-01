package blue.nez.parser;

import blue.nez.ast.Source;
import blue.nez.peg.Grammar;

public interface ParserExecutable /*
									 * extends
									 * OOption.OptionalFactory<ParserExecutable>
									 */ {
	// public default Class<?> entryClass() {
	// return ParserCompiler.class;
	// }
	public Grammar getGrammar();

	// public <T> void initContext(ParserContext<T> ctx);

	public <T> T exec(ParserContext<T> ctx);

	public <T> ParserContext<T> newContext(Source s, long pos, TreeConstructor<T> newTree, TreeConnector<T> linkTree);

}