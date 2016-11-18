// Generated from PHPParser.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PHPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SeaWhitespace=1, HtmlText=2, PHPStart=3, HtmlScriptOpen=4, HtmlStyleOpen=5, 
		HtmlComment=6, HtmlDtd=7, HtmlOpen=8, Shebang=9, Error=10, PHPStartInside=11, 
		HtmlClose=12, HtmlSlashClose=13, HtmlSlash=14, HtmlEquals=15, HtmlStartQuoteString=16, 
		HtmlStartDoubleQuoteString=17, HtmlHex=18, HtmlDecimal=19, HtmlSpace=20, 
		HtmlName=21, ErrorInside=22, PHPStartInsideQuoteString=23, HtmlEndQuoteString=24, 
		HtmlQuoteString=25, ErrorHtmlQuote=26, PHPStartDoubleQuoteString=27, HtmlEndDoubleQuoteString=28, 
		HtmlDoubleQuoteString=29, ErrorHtmlDoubleQuote=30, ScriptText=31, ScriptClose=32, 
		PHPStartInsideScript=33, StyleBody=34, PHPEnd=35, Whitespace=36, MultiLineComment=37, 
		SingleLineComment=38, ShellStyleComment=39, Abstract=40, Array=41, As=42, 
		BinaryCast=43, BoolType=44, BooleanConstant=45, Break=46, Callable=47, 
		Case=48, Catch=49, Class=50, Clone=51, Const=52, Continue=53, Declare=54, 
		Default=55, Do=56, DoubleCast=57, DoubleType=58, Echo=59, Else=60, ElseIf=61, 
		Empty=62, EndDeclare=63, EndFor=64, EndForeach=65, EndIf=66, EndSwitch=67, 
		EndWhile=68, Eval=69, Exit=70, Extends=71, Final=72, Finally=73, FloatCast=74, 
		For=75, Foreach=76, Function=77, Global=78, Goto=79, If=80, Implements=81, 
		Import=82, Include=83, IncludeOnce=84, InstanceOf=85, InsteadOf=86, Int8Cast=87, 
		Int16Cast=88, Int64Type=89, IntType=90, Interface=91, IsSet=92, List=93, 
		LogicalAnd=94, LogicalOr=95, LogicalXor=96, Namespace=97, New=98, Null=99, 
		ObjectType=100, Parent_=101, Partial=102, Print=103, Private=104, Protected=105, 
		Public=106, Require=107, RequireOnce=108, Resource=109, Return=110, Static=111, 
		StringType=112, Switch=113, Throw=114, Trait=115, Try=116, Typeof=117, 
		UintCast=118, UnicodeCast=119, Unset=120, Use=121, Var=122, While=123, 
		Yield=124, Get=125, Set=126, Call=127, CallStatic=128, Constructor=129, 
		Destruct=130, Wakeup=131, Sleep=132, Autoload=133, IsSet__=134, Unset__=135, 
		ToString__=136, Invoke=137, SetState=138, Clone__=139, DebugInfo=140, 
		Namespace__=141, Class__=142, Traic__=143, Function__=144, Method__=145, 
		Line__=146, File__=147, Dir__=148, Lgeneric=149, Rgeneric=150, DoubleArrow=151, 
		Inc=152, Dec=153, IsIdentical=154, IsNoidentical=155, IsEqual=156, IsNotEq=157, 
		IsSmallerOrEqual=158, IsGreaterOrEqual=159, PlusEqual=160, MinusEqual=161, 
		MulEqual=162, Pow=163, PowEqual=164, DivEqual=165, Concaequal=166, ModEqual=167, 
		ShiftLeftEqual=168, ShiftRightEqual=169, AndEqual=170, OrEqual=171, XorEqual=172, 
		BooleanOr=173, BooleanAnd=174, ShiftLeft=175, ShiftRight=176, DoubleColon=177, 
		ObjectOperator=178, NamespaceSeparator=179, Ellipsis=180, Less=181, Greater=182, 
		Ampersand=183, Pipe=184, Bang=185, Caret=186, Plus=187, Minus=188, Asterisk=189, 
		Percent=190, Divide=191, Tilde=192, SuppressWarnings=193, Dollar=194, 
		Dot=195, QuestionMark=196, OpenRoundBracket=197, CloseRoundBracket=198, 
		OpenSquareBracket=199, CloseSquareBracket=200, OpenCurlyBracket=201, CloseCurlyBracket=202, 
		Comma=203, Colon=204, SemiColon=205, Eq=206, Quote=207, BackQuote=208, 
		VarName=209, Label=210, Octal=211, Decimal=212, Real=213, Hex=214, Binary=215, 
		BackQuoteString=216, SingleQuoteString=217, DoubleQuote=218, StartNowDoc=219, 
		StartHereDoc=220, ErrorPhp=221, CurlyDollar=222, StringPart=223, Comment=224, 
		PHPEndSingleLineComment=225, CommentEnd=226, HereDocText=227;
	public static final int
		RULE_htmlDocument = 0, RULE_htmlElementOrPhpBlock = 1, RULE_htmlElement = 2, 
		RULE_scriptTextPart = 3, RULE_phpBlock = 4, RULE_importStatement = 5, 
		RULE_topStatement = 6, RULE_useDeclaration = 7, RULE_useDeclarationContentList = 8, 
		RULE_useDeclarationContent = 9, RULE_namespaceDeclaration = 10, RULE_namespaceStatement = 11, 
		RULE_functionDeclaration = 12, RULE_classDeclaration = 13, RULE_classEntryType = 14, 
		RULE_interfaceList = 15, RULE_typeParameterListInBrackets = 16, RULE_typeParameterList = 17, 
		RULE_typeParameterWithDefaultsList = 18, RULE_typeParameterDecl = 19, 
		RULE_typeParameterWithDefaultDecl = 20, RULE_genericDynamicArgs = 21, 
		RULE_attributes = 22, RULE_attributesGroup = 23, RULE_attribute = 24, 
		RULE_attributeArgList = 25, RULE_attributeNamedArgList = 26, RULE_attributeNamedArg = 27, 
		RULE_innerStatementList = 28, RULE_innerStatement = 29, RULE_statement = 30, 
		RULE_emptyStatement = 31, RULE_nonEmptyStatement = 32, RULE_blockStatement = 33, 
		RULE_ifStatement = 34, RULE_elseIfStatement = 35, RULE_elseIfColonStatement = 36, 
		RULE_elseStatement = 37, RULE_elseColonStatement = 38, RULE_whileStatement = 39, 
		RULE_doWhileStatement = 40, RULE_forStatement = 41, RULE_forInit = 42, 
		RULE_forUpdate = 43, RULE_switchStatement = 44, RULE_switchBlock = 45, 
		RULE_breakStatement = 46, RULE_continueStatement = 47, RULE_returnStatement = 48, 
		RULE_expressionStatement = 49, RULE_assignmentStatement = 50, RULE_unsetStatement = 51, 
		RULE_foreachStatement = 52, RULE_tryCatchFinally = 53, RULE_catchClause = 54, 
		RULE_finallyStatement = 55, RULE_throwStatement = 56, RULE_gotoStatement = 57, 
		RULE_declareStatement = 58, RULE_inlineHtml = 59, RULE_declareList = 60, 
		RULE_formalParameterList = 61, RULE_formalParameter = 62, RULE_typeHint = 63, 
		RULE_globalStatement = 64, RULE_globalVar = 65, RULE_echoStatement = 66, 
		RULE_staticVariableStatement = 67, RULE_classStatement = 68, RULE_traitAdaptations = 69, 
		RULE_traitAdaptationStatement = 70, RULE_traitPrecedence = 71, RULE_traitAlias = 72, 
		RULE_traitMethodReference = 73, RULE_baseCtorCall = 74, RULE_methodBody = 75, 
		RULE_propertyModifiers = 76, RULE_memberModifiers = 77, RULE_variableInitializer = 78, 
		RULE_identifierInititalizer = 79, RULE_globalConstantDeclaration = 80, 
		RULE_expressionList = 81, RULE_parenthesis = 82, RULE_expression = 83, 
		RULE_andOrExpression = 84, RULE_comparisonExpression = 85, RULE_additionExpression = 86, 
		RULE_multiplicationExpression = 87, RULE_notLeftRecursionExpression = 88, 
		RULE_newExpr = 89, RULE_assignmentOperator = 90, RULE_yieldExpression = 91, 
		RULE_arrayItemList = 92, RULE_arrayItem = 93, RULE_lambdaFunctionUseVars = 94, 
		RULE_lambdaFunctionUseVar = 95, RULE_qualifiedStaticTypeRef = 96, RULE_typeRef = 97, 
		RULE_indirectTypeRef = 98, RULE_qualifiedNamespaceName = 99, RULE_namespaceNameList = 100, 
		RULE_qualifiedNamespaceNameList = 101, RULE_arguments = 102, RULE_actualArgument = 103, 
		RULE_constantInititalizer = 104, RULE_constantArrayItemList = 105, RULE_constantArrayItem = 106, 
		RULE_constant = 107, RULE_literalConstant = 108, RULE_numericConstant = 109, 
		RULE_classConstant = 110, RULE_stringConstant = 111, RULE_string = 112, 
		RULE_interpolatedStringPart = 113, RULE_chainList = 114, RULE_chain = 115, 
		RULE_memberAccess = 116, RULE_functionCall = 117, RULE_functionCallName = 118, 
		RULE_actualArguments = 119, RULE_chainBase = 120, RULE_keyedFieldName = 121, 
		RULE_keyedSimpleFieldName = 122, RULE_keyedVariable = 123, RULE_squareCurlyExpression = 124, 
		RULE_assignmentList = 125, RULE_assignmentListElement = 126, RULE_modifier = 127, 
		RULE_identifier = 128, RULE_memberModifier = 129, RULE_magicConstant = 130, 
		RULE_magicMethod = 131, RULE_primitiveType = 132, RULE_castOperation = 133;
	public static final String[] ruleNames = {
		"htmlDocument", "htmlElementOrPhpBlock", "htmlElement", "scriptTextPart", 
		"phpBlock", "importStatement", "topStatement", "useDeclaration", "useDeclarationContentList", 
		"useDeclarationContent", "namespaceDeclaration", "namespaceStatement", 
		"functionDeclaration", "classDeclaration", "classEntryType", "interfaceList", 
		"typeParameterListInBrackets", "typeParameterList", "typeParameterWithDefaultsList", 
		"typeParameterDecl", "typeParameterWithDefaultDecl", "genericDynamicArgs", 
		"attributes", "attributesGroup", "attribute", "attributeArgList", "attributeNamedArgList", 
		"attributeNamedArg", "innerStatementList", "innerStatement", "statement", 
		"emptyStatement", "nonEmptyStatement", "blockStatement", "ifStatement", 
		"elseIfStatement", "elseIfColonStatement", "elseStatement", "elseColonStatement", 
		"whileStatement", "doWhileStatement", "forStatement", "forInit", "forUpdate", 
		"switchStatement", "switchBlock", "breakStatement", "continueStatement", 
		"returnStatement", "expressionStatement", "assignmentStatement", "unsetStatement", 
		"foreachStatement", "tryCatchFinally", "catchClause", "finallyStatement", 
		"throwStatement", "gotoStatement", "declareStatement", "inlineHtml", "declareList", 
		"formalParameterList", "formalParameter", "typeHint", "globalStatement", 
		"globalVar", "echoStatement", "staticVariableStatement", "classStatement", 
		"traitAdaptations", "traitAdaptationStatement", "traitPrecedence", "traitAlias", 
		"traitMethodReference", "baseCtorCall", "methodBody", "propertyModifiers", 
		"memberModifiers", "variableInitializer", "identifierInititalizer", "globalConstantDeclaration", 
		"expressionList", "parenthesis", "expression", "andOrExpression", "comparisonExpression", 
		"additionExpression", "multiplicationExpression", "notLeftRecursionExpression", 
		"newExpr", "assignmentOperator", "yieldExpression", "arrayItemList", "arrayItem", 
		"lambdaFunctionUseVars", "lambdaFunctionUseVar", "qualifiedStaticTypeRef", 
		"typeRef", "indirectTypeRef", "qualifiedNamespaceName", "namespaceNameList", 
		"qualifiedNamespaceNameList", "arguments", "actualArgument", "constantInititalizer", 
		"constantArrayItemList", "constantArrayItem", "constant", "literalConstant", 
		"numericConstant", "classConstant", "stringConstant", "string", "interpolatedStringPart", 
		"chainList", "chain", "memberAccess", "functionCall", "functionCallName", 
		"actualArguments", "chainBase", "keyedFieldName", "keyedSimpleFieldName", 
		"keyedVariable", "squareCurlyExpression", "assignmentList", "assignmentListElement", 
		"modifier", "identifier", "memberModifier", "magicConstant", "magicMethod", 
		"primitiveType", "castOperation"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'/>'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'//'", "'#'", "'abstract'", "'array'", "'as'", "'binary'", 
		null, null, "'break'", "'callable'", "'case'", "'catch'", "'class'", "'clone'", 
		"'const'", "'continue'", "'declare'", "'default'", "'do'", "'real'", "'double'", 
		"'echo'", "'else'", "'elseif'", "'empty'", "'enddeclare'", "'endfor'", 
		"'endforeach'", "'endif'", "'endswitch'", "'endwhile'", "'eval'", "'die'", 
		"'extends'", "'final'", "'finally'", "'float'", "'for'", "'foreach'", 
		"'function'", "'global'", "'goto'", "'if'", "'implements'", "'import'", 
		"'include'", "'include_once'", "'instanceof'", "'insteadof'", "'int8'", 
		"'int16'", "'int64'", null, "'interface'", "'isset'", "'list'", "'and'", 
		"'or'", "'xor'", "'namespace'", "'new'", "'null'", "'object'", "'parent'", 
		"'partial'", "'print'", "'private'", "'protected'", "'public'", "'require'", 
		"'require_once'", "'resource'", "'return'", "'static'", "'string'", "'switch'", 
		"'throw'", "'trait'", "'try'", "'clrtypeof'", null, "'unicode'", "'unset'", 
		"'use'", "'var'", "'while'", "'yield'", "'__get'", "'__set'", "'__call'", 
		"'__callstatic'", "'__construct'", "'__destruct'", "'__wakeup'", "'__sleep'", 
		"'__autoload'", "'__isset'", "'__unset'", "'__tostring'", "'__invoke'", 
		"'__set_state'", "'__clone'", "'__debuginfo'", "'__namespace__'", "'__class__'", 
		"'__trait__'", "'__function__'", "'__method__'", "'__line__'", "'__file__'", 
		"'__dir__'", "'<:'", "':>'", "'=>'", "'++'", "'--'", "'==='", "'!=='", 
		"'=='", null, "'<='", "'>='", "'+='", "'-='", "'*='", "'**'", "'**='", 
		"'/='", "'.='", "'%='", "'<<='", "'>>='", "'&='", "'|='", "'^='", "'||'", 
		"'&&'", "'<<'", "'>>'", "'::'", "'->'", "'\\'", "'...'", null, null, "'&'", 
		"'|'", "'!'", "'^'", "'+'", "'-'", "'*'", "'%'", null, "'~'", "'@'", null, 
		"'.'", "'?'", "'('", "')'", "'['", "']'", null, "'}'", "','", "':'", "';'", 
		null, "'''", "'`'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SeaWhitespace", "HtmlText", "PHPStart", "HtmlScriptOpen", "HtmlStyleOpen", 
		"HtmlComment", "HtmlDtd", "HtmlOpen", "Shebang", "Error", "PHPStartInside", 
		"HtmlClose", "HtmlSlashClose", "HtmlSlash", "HtmlEquals", "HtmlStartQuoteString", 
		"HtmlStartDoubleQuoteString", "HtmlHex", "HtmlDecimal", "HtmlSpace", "HtmlName", 
		"ErrorInside", "PHPStartInsideQuoteString", "HtmlEndQuoteString", "HtmlQuoteString", 
		"ErrorHtmlQuote", "PHPStartDoubleQuoteString", "HtmlEndDoubleQuoteString", 
		"HtmlDoubleQuoteString", "ErrorHtmlDoubleQuote", "ScriptText", "ScriptClose", 
		"PHPStartInsideScript", "StyleBody", "PHPEnd", "Whitespace", "MultiLineComment", 
		"SingleLineComment", "ShellStyleComment", "Abstract", "Array", "As", "BinaryCast", 
		"BoolType", "BooleanConstant", "Break", "Callable", "Case", "Catch", "Class", 
		"Clone", "Const", "Continue", "Declare", "Default", "Do", "DoubleCast", 
		"DoubleType", "Echo", "Else", "ElseIf", "Empty", "EndDeclare", "EndFor", 
		"EndForeach", "EndIf", "EndSwitch", "EndWhile", "Eval", "Exit", "Extends", 
		"Final", "Finally", "FloatCast", "For", "Foreach", "Function", "Global", 
		"Goto", "If", "Implements", "Import", "Include", "IncludeOnce", "InstanceOf", 
		"InsteadOf", "Int8Cast", "Int16Cast", "Int64Type", "IntType", "Interface", 
		"IsSet", "List", "LogicalAnd", "LogicalOr", "LogicalXor", "Namespace", 
		"New", "Null", "ObjectType", "Parent_", "Partial", "Print", "Private", 
		"Protected", "Public", "Require", "RequireOnce", "Resource", "Return", 
		"Static", "StringType", "Switch", "Throw", "Trait", "Try", "Typeof", "UintCast", 
		"UnicodeCast", "Unset", "Use", "Var", "While", "Yield", "Get", "Set", 
		"Call", "CallStatic", "Constructor", "Destruct", "Wakeup", "Sleep", "Autoload", 
		"IsSet__", "Unset__", "ToString__", "Invoke", "SetState", "Clone__", "DebugInfo", 
		"Namespace__", "Class__", "Traic__", "Function__", "Method__", "Line__", 
		"File__", "Dir__", "Lgeneric", "Rgeneric", "DoubleArrow", "Inc", "Dec", 
		"IsIdentical", "IsNoidentical", "IsEqual", "IsNotEq", "IsSmallerOrEqual", 
		"IsGreaterOrEqual", "PlusEqual", "MinusEqual", "MulEqual", "Pow", "PowEqual", 
		"DivEqual", "Concaequal", "ModEqual", "ShiftLeftEqual", "ShiftRightEqual", 
		"AndEqual", "OrEqual", "XorEqual", "BooleanOr", "BooleanAnd", "ShiftLeft", 
		"ShiftRight", "DoubleColon", "ObjectOperator", "NamespaceSeparator", "Ellipsis", 
		"Less", "Greater", "Ampersand", "Pipe", "Bang", "Caret", "Plus", "Minus", 
		"Asterisk", "Percent", "Divide", "Tilde", "SuppressWarnings", "Dollar", 
		"Dot", "QuestionMark", "OpenRoundBracket", "CloseRoundBracket", "OpenSquareBracket", 
		"CloseSquareBracket", "OpenCurlyBracket", "CloseCurlyBracket", "Comma", 
		"Colon", "SemiColon", "Eq", "Quote", "BackQuote", "VarName", "Label", 
		"Octal", "Decimal", "Real", "Hex", "Binary", "BackQuoteString", "SingleQuoteString", 
		"DoubleQuote", "StartNowDoc", "StartHereDoc", "ErrorPhp", "CurlyDollar", 
		"StringPart", "Comment", "PHPEndSingleLineComment", "CommentEnd", "HereDocText"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PHPParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PHPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class HtmlDocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PHPParser.EOF, 0); }
		public TerminalNode Shebang() { return getToken(PHPParser.Shebang, 0); }
		public List<HtmlElementOrPhpBlockContext> htmlElementOrPhpBlock() {
			return getRuleContexts(HtmlElementOrPhpBlockContext.class);
		}
		public HtmlElementOrPhpBlockContext htmlElementOrPhpBlock(int i) {
			return getRuleContext(HtmlElementOrPhpBlockContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if (_la==Shebang) {
				{
				setState(268);
				match(Shebang);
				}
			}

			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HtmlText) | (1L << HtmlScriptOpen) | (1L << HtmlStyleOpen) | (1L << HtmlDtd) | (1L << HtmlOpen) | (1L << HtmlClose) | (1L << HtmlSlashClose) | (1L << HtmlSlash) | (1L << HtmlEquals) | (1L << HtmlStartQuoteString) | (1L << HtmlStartDoubleQuoteString) | (1L << HtmlHex) | (1L << HtmlDecimal) | (1L << HtmlName) | (1L << HtmlEndQuoteString) | (1L << HtmlQuoteString) | (1L << HtmlEndDoubleQuoteString) | (1L << HtmlDoubleQuoteString) | (1L << ScriptText) | (1L << ScriptClose) | (1L << StyleBody) | (1L << Abstract) | (1L << Array) | (1L << As) | (1L << BinaryCast) | (1L << BoolType) | (1L << BooleanConstant) | (1L << Break) | (1L << Callable) | (1L << Case) | (1L << Catch) | (1L << Class) | (1L << Clone) | (1L << Const) | (1L << Continue) | (1L << Declare) | (1L << Default) | (1L << Do) | (1L << DoubleCast) | (1L << DoubleType) | (1L << Echo) | (1L << Else) | (1L << ElseIf) | (1L << Empty) | (1L << EndDeclare))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EndFor - 64)) | (1L << (EndForeach - 64)) | (1L << (EndIf - 64)) | (1L << (EndSwitch - 64)) | (1L << (EndWhile - 64)) | (1L << (Eval - 64)) | (1L << (Exit - 64)) | (1L << (Extends - 64)) | (1L << (Final - 64)) | (1L << (Finally - 64)) | (1L << (FloatCast - 64)) | (1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (Function - 64)) | (1L << (Global - 64)) | (1L << (Goto - 64)) | (1L << (If - 64)) | (1L << (Implements - 64)) | (1L << (Import - 64)) | (1L << (Include - 64)) | (1L << (IncludeOnce - 64)) | (1L << (InstanceOf - 64)) | (1L << (InsteadOf - 64)) | (1L << (Int8Cast - 64)) | (1L << (Int16Cast - 64)) | (1L << (Int64Type - 64)) | (1L << (IntType - 64)) | (1L << (Interface - 64)) | (1L << (IsSet - 64)) | (1L << (List - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalXor - 64)) | (1L << (Namespace - 64)) | (1L << (New - 64)) | (1L << (Null - 64)) | (1L << (ObjectType - 64)) | (1L << (Parent_ - 64)) | (1L << (Partial - 64)) | (1L << (Print - 64)) | (1L << (Private - 64)) | (1L << (Protected - 64)) | (1L << (Public - 64)) | (1L << (Require - 64)) | (1L << (RequireOnce - 64)) | (1L << (Resource - 64)) | (1L << (Return - 64)) | (1L << (Static - 64)) | (1L << (StringType - 64)) | (1L << (Switch - 64)) | (1L << (Throw - 64)) | (1L << (Trait - 64)) | (1L << (Try - 64)) | (1L << (Typeof - 64)) | (1L << (UintCast - 64)) | (1L << (UnicodeCast - 64)) | (1L << (Unset - 64)) | (1L << (Use - 64)) | (1L << (Var - 64)) | (1L << (While - 64)) | (1L << (Yield - 64)) | (1L << (Get - 64)) | (1L << (Set - 64)) | (1L << (Call - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (CallStatic - 128)) | (1L << (Constructor - 128)) | (1L << (Destruct - 128)) | (1L << (Wakeup - 128)) | (1L << (Sleep - 128)) | (1L << (Autoload - 128)) | (1L << (IsSet__ - 128)) | (1L << (Unset__ - 128)) | (1L << (ToString__ - 128)) | (1L << (Invoke - 128)) | (1L << (SetState - 128)) | (1L << (Clone__ - 128)) | (1L << (DebugInfo - 128)) | (1L << (Namespace__ - 128)) | (1L << (Class__ - 128)) | (1L << (Traic__ - 128)) | (1L << (Function__ - 128)) | (1L << (Method__ - 128)) | (1L << (Line__ - 128)) | (1L << (File__ - 128)) | (1L << (Dir__ - 128)) | (1L << (Inc - 128)) | (1L << (Dec - 128)) | (1L << (NamespaceSeparator - 128)) | (1L << (Bang - 128)) | (1L << (Plus - 128)) | (1L << (Minus - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (Tilde - 192)) | (1L << (SuppressWarnings - 192)) | (1L << (Dollar - 192)) | (1L << (OpenRoundBracket - 192)) | (1L << (OpenSquareBracket - 192)) | (1L << (OpenCurlyBracket - 192)) | (1L << (SemiColon - 192)) | (1L << (VarName - 192)) | (1L << (Label - 192)) | (1L << (Octal - 192)) | (1L << (Decimal - 192)) | (1L << (Real - 192)) | (1L << (Hex - 192)) | (1L << (Binary - 192)) | (1L << (BackQuoteString - 192)) | (1L << (SingleQuoteString - 192)) | (1L << (DoubleQuote - 192)) | (1L << (StartNowDoc - 192)) | (1L << (StartHereDoc - 192)))) != 0)) {
				{
				{
				setState(271);
				htmlElementOrPhpBlock();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlElementOrPhpBlockContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public PhpBlockContext phpBlock() {
			return getRuleContext(PhpBlockContext.class,0);
		}
		public ScriptTextPartContext scriptTextPart() {
			return getRuleContext(ScriptTextPartContext.class,0);
		}
		public HtmlElementOrPhpBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElementOrPhpBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtmlElementOrPhpBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtmlElementOrPhpBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitHtmlElementOrPhpBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementOrPhpBlockContext htmlElementOrPhpBlock() throws RecognitionException {
		HtmlElementOrPhpBlockContext _localctx = new HtmlElementOrPhpBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlElementOrPhpBlock);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				htmlElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				phpBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				scriptTextPart();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode HtmlDtd() { return getToken(PHPParser.HtmlDtd, 0); }
		public TerminalNode HtmlScriptOpen() { return getToken(PHPParser.HtmlScriptOpen, 0); }
		public TerminalNode HtmlClose() { return getToken(PHPParser.HtmlClose, 0); }
		public List<TerminalNode> HtmlStyleOpen() { return getTokens(PHPParser.HtmlStyleOpen); }
		public TerminalNode HtmlStyleOpen(int i) {
			return getToken(PHPParser.HtmlStyleOpen, i);
		}
		public TerminalNode ScriptClose() { return getToken(PHPParser.ScriptClose, 0); }
		public TerminalNode StyleBody() { return getToken(PHPParser.StyleBody, 0); }
		public TerminalNode HtmlOpen() { return getToken(PHPParser.HtmlOpen, 0); }
		public TerminalNode HtmlName() { return getToken(PHPParser.HtmlName, 0); }
		public TerminalNode HtmlSlash() { return getToken(PHPParser.HtmlSlash, 0); }
		public TerminalNode HtmlText() { return getToken(PHPParser.HtmlText, 0); }
		public TerminalNode HtmlEquals() { return getToken(PHPParser.HtmlEquals, 0); }
		public TerminalNode HtmlStartQuoteString() { return getToken(PHPParser.HtmlStartQuoteString, 0); }
		public TerminalNode HtmlEndQuoteString() { return getToken(PHPParser.HtmlEndQuoteString, 0); }
		public TerminalNode HtmlStartDoubleQuoteString() { return getToken(PHPParser.HtmlStartDoubleQuoteString, 0); }
		public TerminalNode HtmlEndDoubleQuoteString() { return getToken(PHPParser.HtmlEndDoubleQuoteString, 0); }
		public TerminalNode HtmlHex() { return getToken(PHPParser.HtmlHex, 0); }
		public TerminalNode HtmlDecimal() { return getToken(PHPParser.HtmlDecimal, 0); }
		public TerminalNode HtmlQuoteString() { return getToken(PHPParser.HtmlQuoteString, 0); }
		public TerminalNode HtmlDoubleQuoteString() { return getToken(PHPParser.HtmlDoubleQuoteString, 0); }
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HtmlText) | (1L << HtmlScriptOpen) | (1L << HtmlStyleOpen) | (1L << HtmlDtd) | (1L << HtmlOpen) | (1L << HtmlClose) | (1L << HtmlSlashClose) | (1L << HtmlSlash) | (1L << HtmlEquals) | (1L << HtmlStartQuoteString) | (1L << HtmlStartDoubleQuoteString) | (1L << HtmlHex) | (1L << HtmlDecimal) | (1L << HtmlName) | (1L << HtmlEndQuoteString) | (1L << HtmlQuoteString) | (1L << HtmlEndDoubleQuoteString) | (1L << HtmlDoubleQuoteString) | (1L << ScriptClose) | (1L << StyleBody))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptTextPartContext extends ParserRuleContext {
		public List<TerminalNode> ScriptText() { return getTokens(PHPParser.ScriptText); }
		public TerminalNode ScriptText(int i) {
			return getToken(PHPParser.ScriptText, i);
		}
		public ScriptTextPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptTextPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterScriptTextPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitScriptTextPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitScriptTextPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptTextPartContext scriptTextPart() throws RecognitionException {
		ScriptTextPartContext _localctx = new ScriptTextPartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scriptTextPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(286);
					match(ScriptText);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(289); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PhpBlockContext extends ParserRuleContext {
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<TopStatementContext> topStatement() {
			return getRuleContexts(TopStatementContext.class);
		}
		public TopStatementContext topStatement(int i) {
			return getRuleContext(TopStatementContext.class,i);
		}
		public PhpBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phpBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterPhpBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitPhpBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitPhpBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhpBlockContext phpBlock() throws RecognitionException {
		PhpBlockContext _localctx = new PhpBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_phpBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(291);
					importStatement();
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(298); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(297);
					topStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(300); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(PHPParser.Import, 0); }
		public TerminalNode Namespace() { return getToken(PHPParser.Namespace, 0); }
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(Import);
			setState(303);
			match(Namespace);
			setState(304);
			namespaceNameList();
			setState(305);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopStatementContext extends ParserRuleContext {
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public NonEmptyStatementContext nonEmptyStatement() {
			return getRuleContext(NonEmptyStatementContext.class,0);
		}
		public UseDeclarationContext useDeclaration() {
			return getRuleContext(UseDeclarationContext.class,0);
		}
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public GlobalConstantDeclarationContext globalConstantDeclaration() {
			return getRuleContext(GlobalConstantDeclarationContext.class,0);
		}
		public TopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitTopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopStatementContext topStatement() throws RecognitionException {
		TopStatementContext _localctx = new TopStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_topStatement);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				emptyStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				nonEmptyStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				useDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				namespaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				functionDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(312);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(313);
				globalConstantDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseDeclarationContext extends ParserRuleContext {
		public TerminalNode Use() { return getToken(PHPParser.Use, 0); }
		public UseDeclarationContentListContext useDeclarationContentList() {
			return getRuleContext(UseDeclarationContentListContext.class,0);
		}
		public TerminalNode Function() { return getToken(PHPParser.Function, 0); }
		public TerminalNode Const() { return getToken(PHPParser.Const, 0); }
		public UseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterUseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitUseDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitUseDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDeclarationContext useDeclaration() throws RecognitionException {
		UseDeclarationContext _localctx = new UseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_useDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(Use);
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(317);
				_la = _input.LA(1);
				if ( !(_la==Const || _la==Function) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(320);
			useDeclarationContentList();
			setState(321);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseDeclarationContentListContext extends ParserRuleContext {
		public List<UseDeclarationContentContext> useDeclarationContent() {
			return getRuleContexts(UseDeclarationContentContext.class);
		}
		public UseDeclarationContentContext useDeclarationContent(int i) {
			return getRuleContext(UseDeclarationContentContext.class,i);
		}
		public UseDeclarationContentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclarationContentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterUseDeclarationContentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitUseDeclarationContentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitUseDeclarationContentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDeclarationContentListContext useDeclarationContentList() throws RecognitionException {
		UseDeclarationContentListContext _localctx = new UseDeclarationContentListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_useDeclarationContentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(323);
				match(NamespaceSeparator);
				}
			}

			setState(326);
			useDeclarationContent();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(327);
				match(Comma);
				setState(329);
				_la = _input.LA(1);
				if (_la==NamespaceSeparator) {
					{
					setState(328);
					match(NamespaceSeparator);
					}
				}

				setState(331);
				useDeclarationContent();
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseDeclarationContentContext extends ParserRuleContext {
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public TerminalNode As() { return getToken(PHPParser.As, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UseDeclarationContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclarationContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterUseDeclarationContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitUseDeclarationContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitUseDeclarationContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDeclarationContentContext useDeclarationContent() throws RecognitionException {
		UseDeclarationContentContext _localctx = new UseDeclarationContentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_useDeclarationContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			namespaceNameList();
			setState(340);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(338);
				match(As);
				setState(339);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(PHPParser.Namespace, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public List<NamespaceStatementContext> namespaceStatement() {
			return getRuleContexts(NamespaceStatementContext.class);
		}
		public NamespaceStatementContext namespaceStatement(int i) {
			return getRuleContext(NamespaceStatementContext.class,i);
		}
		public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNamespaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNamespaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitNamespaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDeclarationContext namespaceDeclaration() throws RecognitionException {
		NamespaceDeclarationContext _localctx = new NamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_namespaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(Namespace);
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(344);
				_la = _input.LA(1);
				if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || _la==Label) {
					{
					setState(343);
					namespaceNameList();
					}
				}

				setState(346);
				match(OpenCurlyBracket);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HtmlText) | (1L << HtmlScriptOpen) | (1L << HtmlStyleOpen) | (1L << HtmlDtd) | (1L << HtmlOpen) | (1L << HtmlClose) | (1L << HtmlSlashClose) | (1L << HtmlSlash) | (1L << HtmlEquals) | (1L << HtmlStartQuoteString) | (1L << HtmlStartDoubleQuoteString) | (1L << HtmlHex) | (1L << HtmlDecimal) | (1L << HtmlName) | (1L << HtmlEndQuoteString) | (1L << HtmlQuoteString) | (1L << HtmlEndDoubleQuoteString) | (1L << HtmlDoubleQuoteString) | (1L << ScriptText) | (1L << ScriptClose) | (1L << StyleBody) | (1L << Abstract) | (1L << Array) | (1L << As) | (1L << BinaryCast) | (1L << BoolType) | (1L << BooleanConstant) | (1L << Break) | (1L << Callable) | (1L << Case) | (1L << Catch) | (1L << Class) | (1L << Clone) | (1L << Const) | (1L << Continue) | (1L << Declare) | (1L << Default) | (1L << Do) | (1L << DoubleCast) | (1L << DoubleType) | (1L << Echo) | (1L << Else) | (1L << ElseIf) | (1L << Empty) | (1L << EndDeclare))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EndFor - 64)) | (1L << (EndForeach - 64)) | (1L << (EndIf - 64)) | (1L << (EndSwitch - 64)) | (1L << (EndWhile - 64)) | (1L << (Eval - 64)) | (1L << (Exit - 64)) | (1L << (Extends - 64)) | (1L << (Final - 64)) | (1L << (Finally - 64)) | (1L << (FloatCast - 64)) | (1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (Function - 64)) | (1L << (Global - 64)) | (1L << (Goto - 64)) | (1L << (If - 64)) | (1L << (Implements - 64)) | (1L << (Import - 64)) | (1L << (Include - 64)) | (1L << (IncludeOnce - 64)) | (1L << (InstanceOf - 64)) | (1L << (InsteadOf - 64)) | (1L << (Int8Cast - 64)) | (1L << (Int16Cast - 64)) | (1L << (Int64Type - 64)) | (1L << (IntType - 64)) | (1L << (Interface - 64)) | (1L << (IsSet - 64)) | (1L << (List - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalXor - 64)) | (1L << (Namespace - 64)) | (1L << (New - 64)) | (1L << (Null - 64)) | (1L << (ObjectType - 64)) | (1L << (Parent_ - 64)) | (1L << (Partial - 64)) | (1L << (Print - 64)) | (1L << (Private - 64)) | (1L << (Protected - 64)) | (1L << (Public - 64)) | (1L << (Require - 64)) | (1L << (RequireOnce - 64)) | (1L << (Resource - 64)) | (1L << (Return - 64)) | (1L << (Static - 64)) | (1L << (StringType - 64)) | (1L << (Switch - 64)) | (1L << (Throw - 64)) | (1L << (Trait - 64)) | (1L << (Try - 64)) | (1L << (Typeof - 64)) | (1L << (UintCast - 64)) | (1L << (UnicodeCast - 64)) | (1L << (Unset - 64)) | (1L << (Use - 64)) | (1L << (Var - 64)) | (1L << (While - 64)) | (1L << (Yield - 64)) | (1L << (Get - 64)) | (1L << (Set - 64)) | (1L << (Call - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (CallStatic - 128)) | (1L << (Constructor - 128)) | (1L << (Destruct - 128)) | (1L << (Wakeup - 128)) | (1L << (Sleep - 128)) | (1L << (Autoload - 128)) | (1L << (IsSet__ - 128)) | (1L << (Unset__ - 128)) | (1L << (ToString__ - 128)) | (1L << (Invoke - 128)) | (1L << (SetState - 128)) | (1L << (Clone__ - 128)) | (1L << (DebugInfo - 128)) | (1L << (Namespace__ - 128)) | (1L << (Class__ - 128)) | (1L << (Traic__ - 128)) | (1L << (Function__ - 128)) | (1L << (Method__ - 128)) | (1L << (Line__ - 128)) | (1L << (File__ - 128)) | (1L << (Dir__ - 128)) | (1L << (Inc - 128)) | (1L << (Dec - 128)) | (1L << (NamespaceSeparator - 128)) | (1L << (Bang - 128)) | (1L << (Plus - 128)) | (1L << (Minus - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (Tilde - 192)) | (1L << (SuppressWarnings - 192)) | (1L << (Dollar - 192)) | (1L << (OpenRoundBracket - 192)) | (1L << (OpenSquareBracket - 192)) | (1L << (OpenCurlyBracket - 192)) | (1L << (VarName - 192)) | (1L << (Label - 192)) | (1L << (Octal - 192)) | (1L << (Decimal - 192)) | (1L << (Real - 192)) | (1L << (Hex - 192)) | (1L << (Binary - 192)) | (1L << (BackQuoteString - 192)) | (1L << (SingleQuoteString - 192)) | (1L << (DoubleQuote - 192)) | (1L << (StartNowDoc - 192)) | (1L << (StartHereDoc - 192)))) != 0)) {
					{
					{
					setState(347);
					namespaceStatement();
					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(353);
				match(CloseCurlyBracket);
				}
				break;
			case 2:
				{
				setState(354);
				namespaceNameList();
				setState(355);
				match(SemiColon);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceStatementContext extends ParserRuleContext {
		public NonEmptyStatementContext nonEmptyStatement() {
			return getRuleContext(NonEmptyStatementContext.class,0);
		}
		public UseDeclarationContext useDeclaration() {
			return getRuleContext(UseDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public GlobalConstantDeclarationContext globalConstantDeclaration() {
			return getRuleContext(GlobalConstantDeclarationContext.class,0);
		}
		public NamespaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNamespaceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNamespaceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitNamespaceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceStatementContext namespaceStatement() throws RecognitionException {
		NamespaceStatementContext _localctx = new NamespaceStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_namespaceStatement);
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				nonEmptyStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				useDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
				globalConstantDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Function() { return getToken(PHPParser.Function, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			attributes();
			setState(367);
			match(Function);
			setState(369);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(368);
				match(Ampersand);
				}
			}

			setState(371);
			identifier();
			setState(373);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(372);
				typeParameterListInBrackets();
				}
			}

			setState(375);
			match(OpenRoundBracket);
			setState(376);
			formalParameterList();
			setState(377);
			match(CloseRoundBracket);
			setState(378);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public ClassEntryTypeContext classEntryType() {
			return getRuleContext(ClassEntryTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Interface() { return getToken(PHPParser.Interface, 0); }
		public TerminalNode Private() { return getToken(PHPParser.Private, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode Partial() { return getToken(PHPParser.Partial, 0); }
		public List<ClassStatementContext> classStatement() {
			return getRuleContexts(ClassStatementContext.class);
		}
		public ClassStatementContext classStatement(int i) {
			return getRuleContext(ClassStatementContext.class,i);
		}
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public TerminalNode Extends() { return getToken(PHPParser.Extends, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public TerminalNode Implements() { return getToken(PHPParser.Implements, 0); }
		public InterfaceListContext interfaceList() {
			return getRuleContext(InterfaceListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			attributes();
			setState(382);
			_la = _input.LA(1);
			if (_la==Private) {
				{
				setState(381);
				match(Private);
				}
			}

			setState(385);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(384);
				modifier();
				}
			}

			setState(388);
			_la = _input.LA(1);
			if (_la==Partial) {
				{
				setState(387);
				match(Partial);
				}
			}

			setState(412);
			switch (_input.LA(1)) {
			case Class:
			case Trait:
				{
				setState(390);
				classEntryType();
				setState(391);
				identifier();
				setState(393);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(392);
					typeParameterListInBrackets();
					}
				}

				setState(397);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(395);
					match(Extends);
					setState(396);
					qualifiedStaticTypeRef();
					}
				}

				setState(401);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(399);
					match(Implements);
					setState(400);
					interfaceList();
					}
				}

				}
				break;
			case Interface:
				{
				setState(403);
				match(Interface);
				setState(404);
				identifier();
				setState(406);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(405);
					typeParameterListInBrackets();
					}
				}

				setState(410);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(408);
					match(Extends);
					setState(409);
					interfaceList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(414);
			match(OpenCurlyBracket);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Abstract || _la==Const || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Final - 72)) | (1L << (Function - 72)) | (1L << (Private - 72)) | (1L << (Protected - 72)) | (1L << (Public - 72)) | (1L << (Static - 72)) | (1L << (Use - 72)) | (1L << (Var - 72)))) != 0) || _la==OpenSquareBracket) {
				{
				{
				setState(415);
				classStatement();
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(421);
			match(CloseCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassEntryTypeContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(PHPParser.Class, 0); }
		public TerminalNode Trait() { return getToken(PHPParser.Trait, 0); }
		public ClassEntryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classEntryType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterClassEntryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitClassEntryType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitClassEntryType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassEntryTypeContext classEntryType() throws RecognitionException {
		ClassEntryTypeContext _localctx = new ClassEntryTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classEntryType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_la = _input.LA(1);
			if ( !(_la==Class || _la==Trait) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceListContext extends ParserRuleContext {
		public List<QualifiedStaticTypeRefContext> qualifiedStaticTypeRef() {
			return getRuleContexts(QualifiedStaticTypeRefContext.class);
		}
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef(int i) {
			return getRuleContext(QualifiedStaticTypeRefContext.class,i);
		}
		public InterfaceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInterfaceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInterfaceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitInterfaceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceListContext interfaceList() throws RecognitionException {
		InterfaceListContext _localctx = new InterfaceListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			qualifiedStaticTypeRef();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(426);
				match(Comma);
				setState(427);
				qualifiedStaticTypeRef();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListInBracketsContext extends ParserRuleContext {
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TypeParameterWithDefaultsListContext typeParameterWithDefaultsList() {
			return getRuleContext(TypeParameterWithDefaultsListContext.class,0);
		}
		public TypeParameterListInBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterListInBrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTypeParameterListInBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTypeParameterListInBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitTypeParameterListInBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListInBracketsContext typeParameterListInBrackets() throws RecognitionException {
		TypeParameterListInBracketsContext _localctx = new TypeParameterListInBracketsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeParameterListInBrackets);
		try {
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(Lgeneric);
				setState(434);
				typeParameterList();
				setState(435);
				match(Rgeneric);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(Lgeneric);
				setState(438);
				typeParameterWithDefaultsList();
				setState(439);
				match(Rgeneric);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				match(Lgeneric);
				setState(442);
				typeParameterList();
				setState(443);
				match(Comma);
				setState(444);
				typeParameterWithDefaultsList();
				setState(445);
				match(Rgeneric);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterDeclContext> typeParameterDecl() {
			return getRuleContexts(TypeParameterDeclContext.class);
		}
		public TypeParameterDeclContext typeParameterDecl(int i) {
			return getRuleContext(TypeParameterDeclContext.class,i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			typeParameterDecl();
			setState(454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(450);
					match(Comma);
					setState(451);
					typeParameterDecl();
					}
					} 
				}
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterWithDefaultsListContext extends ParserRuleContext {
		public List<TypeParameterWithDefaultDeclContext> typeParameterWithDefaultDecl() {
			return getRuleContexts(TypeParameterWithDefaultDeclContext.class);
		}
		public TypeParameterWithDefaultDeclContext typeParameterWithDefaultDecl(int i) {
			return getRuleContext(TypeParameterWithDefaultDeclContext.class,i);
		}
		public TypeParameterWithDefaultsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterWithDefaultsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTypeParameterWithDefaultsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTypeParameterWithDefaultsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitTypeParameterWithDefaultsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterWithDefaultsListContext typeParameterWithDefaultsList() throws RecognitionException {
		TypeParameterWithDefaultsListContext _localctx = new TypeParameterWithDefaultsListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameterWithDefaultsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			typeParameterWithDefaultDecl();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(458);
				match(Comma);
				setState(459);
				typeParameterWithDefaultDecl();
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterDeclContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTypeParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTypeParameterDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitTypeParameterDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterDeclContext typeParameterDecl() throws RecognitionException {
		TypeParameterDeclContext _localctx = new TypeParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeParameterDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			attributes();
			setState(466);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterWithDefaultDeclContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Eq() { return getToken(PHPParser.Eq, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeParameterWithDefaultDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterWithDefaultDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTypeParameterWithDefaultDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTypeParameterWithDefaultDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitTypeParameterWithDefaultDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterWithDefaultDeclContext typeParameterWithDefaultDecl() throws RecognitionException {
		TypeParameterWithDefaultDeclContext _localctx = new TypeParameterWithDefaultDeclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeParameterWithDefaultDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			attributes();
			setState(469);
			identifier();
			setState(470);
			match(Eq);
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(471);
				qualifiedStaticTypeRef();
				}
				break;
			case 2:
				{
				setState(472);
				primitiveType();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericDynamicArgsContext extends ParserRuleContext {
		public List<TypeRefContext> typeRef() {
			return getRuleContexts(TypeRefContext.class);
		}
		public TypeRefContext typeRef(int i) {
			return getRuleContext(TypeRefContext.class,i);
		}
		public GenericDynamicArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericDynamicArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterGenericDynamicArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitGenericDynamicArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitGenericDynamicArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericDynamicArgsContext genericDynamicArgs() throws RecognitionException {
		GenericDynamicArgsContext _localctx = new GenericDynamicArgsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_genericDynamicArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(Lgeneric);
			setState(476);
			typeRef();
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(477);
				match(Comma);
				setState(478);
				typeRef();
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(484);
			match(Rgeneric);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributesGroupContext> attributesGroup() {
			return getRuleContexts(AttributesGroupContext.class);
		}
		public AttributesGroupContext attributesGroup(int i) {
			return getRuleContext(AttributesGroupContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenSquareBracket) {
				{
				{
				setState(486);
				attributesGroup();
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesGroupContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributesGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAttributesGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAttributesGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitAttributesGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesGroupContext attributesGroup() throws RecognitionException {
		AttributesGroupContext _localctx = new AttributesGroupContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_attributesGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(OpenSquareBracket);
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(493);
				identifier();
				setState(494);
				match(Colon);
				}
				break;
			}
			setState(498);
			attribute();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(499);
				match(Comma);
				setState(500);
				attribute();
				}
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(506);
			match(CloseSquareBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public AttributeArgListContext attributeArgList() {
			return getRuleContext(AttributeArgListContext.class,0);
		}
		public AttributeNamedArgListContext attributeNamedArgList() {
			return getRuleContext(AttributeNamedArgListContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_attribute);
		try {
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				qualifiedNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				qualifiedNamespaceName();
				setState(510);
				match(OpenRoundBracket);
				setState(511);
				attributeArgList();
				setState(512);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(514);
				qualifiedNamespaceName();
				setState(515);
				match(OpenRoundBracket);
				setState(516);
				attributeNamedArgList();
				setState(517);
				match(CloseRoundBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(519);
				qualifiedNamespaceName();
				setState(520);
				match(OpenRoundBracket);
				setState(521);
				attributeArgList();
				setState(522);
				match(Comma);
				setState(523);
				attributeNamedArgList();
				setState(524);
				match(CloseRoundBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeArgListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AttributeArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAttributeArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAttributeArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitAttributeArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeArgListContext attributeArgList() throws RecognitionException {
		AttributeArgListContext _localctx = new AttributeArgListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_attributeArgList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			expression(0);
			setState(533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(529);
					match(Comma);
					setState(530);
					expression(0);
					}
					} 
				}
				setState(535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeNamedArgListContext extends ParserRuleContext {
		public List<AttributeNamedArgContext> attributeNamedArg() {
			return getRuleContexts(AttributeNamedArgContext.class);
		}
		public AttributeNamedArgContext attributeNamedArg(int i) {
			return getRuleContext(AttributeNamedArgContext.class,i);
		}
		public AttributeNamedArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNamedArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAttributeNamedArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAttributeNamedArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitAttributeNamedArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNamedArgListContext attributeNamedArgList() throws RecognitionException {
		AttributeNamedArgListContext _localctx = new AttributeNamedArgListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_attributeNamedArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			attributeNamedArg();
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(537);
				match(Comma);
				setState(538);
				attributeNamedArg();
				}
				}
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeNamedArgContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PHPParser.VarName, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributeNamedArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNamedArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAttributeNamedArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAttributeNamedArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitAttributeNamedArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNamedArgContext attributeNamedArg() throws RecognitionException {
		AttributeNamedArgContext _localctx = new AttributeNamedArgContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_attributeNamedArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(VarName);
			setState(545);
			match(DoubleArrow);
			setState(546);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerStatementListContext extends ParserRuleContext {
		public List<InnerStatementContext> innerStatement() {
			return getRuleContexts(InnerStatementContext.class);
		}
		public InnerStatementContext innerStatement(int i) {
			return getRuleContext(InnerStatementContext.class,i);
		}
		public InnerStatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerStatementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInnerStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInnerStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitInnerStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerStatementListContext innerStatementList() throws RecognitionException {
		InnerStatementListContext _localctx = new InnerStatementListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_innerStatementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(548);
					innerStatement();
					}
					} 
				}
				setState(553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InnerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInnerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInnerStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitInnerStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerStatementContext innerStatement() throws RecognitionException {
		InnerStatementContext _localctx = new InnerStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_innerStatement);
		try {
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				classDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public NonEmptyStatementContext nonEmptyStatement() {
			return getRuleContext(NonEmptyStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement);
		try {
			setState(561);
			switch (_input.LA(1)) {
			case HtmlText:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case ScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				nonEmptyStatement();
				}
				break;
			case SemiColon:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				emptyStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonEmptyStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public YieldExpressionContext yieldExpression() {
			return getRuleContext(YieldExpressionContext.class,0);
		}
		public GlobalStatementContext globalStatement() {
			return getRuleContext(GlobalStatementContext.class,0);
		}
		public StaticVariableStatementContext staticVariableStatement() {
			return getRuleContext(StaticVariableStatementContext.class,0);
		}
		public EchoStatementContext echoStatement() {
			return getRuleContext(EchoStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public UnsetStatementContext unsetStatement() {
			return getRuleContext(UnsetStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public TryCatchFinallyContext tryCatchFinally() {
			return getRuleContext(TryCatchFinallyContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public DeclareStatementContext declareStatement() {
			return getRuleContext(DeclareStatementContext.class,0);
		}
		public InlineHtmlContext inlineHtml() {
			return getRuleContext(InlineHtmlContext.class,0);
		}
		public NonEmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonEmptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNonEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNonEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitNonEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonEmptyStatementContext nonEmptyStatement() throws RecognitionException {
		NonEmptyStatementContext _localctx = new NonEmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_nonEmptyStatement);
		try {
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				identifier();
				setState(566);
				match(Colon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				blockStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(569);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(570);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(571);
				doWhileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(572);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(573);
				switchStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(574);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(575);
				continueStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(576);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(577);
				yieldExpression();
				setState(578);
				match(SemiColon);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(580);
				globalStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(581);
				staticVariableStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(582);
				echoStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(583);
				expressionStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(584);
				assignmentStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(585);
				unsetStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(586);
				foreachStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(587);
				tryCatchFinally();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(588);
				throwStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(589);
				gotoStatement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(590);
				declareStatement();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(591);
				inlineHtml();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(OpenCurlyBracket);
			setState(595);
			innerStatementList();
			setState(596);
			match(CloseCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(PHPParser.If, 0); }
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndIf() { return getToken(PHPParser.EndIf, 0); }
		public List<ElseIfColonStatementContext> elseIfColonStatement() {
			return getRuleContexts(ElseIfColonStatementContext.class);
		}
		public ElseIfColonStatementContext elseIfColonStatement(int i) {
			return getRuleContext(ElseIfColonStatementContext.class,i);
		}
		public ElseColonStatementContext elseColonStatement() {
			return getRuleContext(ElseColonStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				match(If);
				setState(599);
				parenthesis();
				setState(600);
				statement();
				setState(604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(601);
						elseIfStatement();
						}
						} 
					}
					setState(606);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(607);
					elseStatement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				match(If);
				setState(611);
				parenthesis();
				setState(612);
				match(Colon);
				setState(613);
				innerStatementList();
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ElseIf) {
					{
					{
					setState(614);
					elseIfColonStatement();
					}
					}
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(621);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(620);
					elseColonStatement();
					}
				}

				setState(623);
				match(EndIf);
				setState(624);
				match(SemiColon);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode ElseIf() { return getToken(PHPParser.ElseIf, 0); }
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(ElseIf);
			setState(629);
			parenthesis();
			setState(630);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfColonStatementContext extends ParserRuleContext {
		public TerminalNode ElseIf() { return getToken(PHPParser.ElseIf, 0); }
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public ElseIfColonStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfColonStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterElseIfColonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitElseIfColonStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitElseIfColonStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfColonStatementContext elseIfColonStatement() throws RecognitionException {
		ElseIfColonStatementContext _localctx = new ElseIfColonStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elseIfColonStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(ElseIf);
			setState(633);
			parenthesis();
			setState(634);
			match(Colon);
			setState(635);
			innerStatementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(PHPParser.Else, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(Else);
			setState(638);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseColonStatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(PHPParser.Else, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public ElseColonStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseColonStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterElseColonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitElseColonStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitElseColonStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseColonStatementContext elseColonStatement() throws RecognitionException {
		ElseColonStatementContext _localctx = new ElseColonStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_elseColonStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(Else);
			setState(641);
			match(Colon);
			setState(642);
			innerStatementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(PHPParser.While, 0); }
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndWhile() { return getToken(PHPParser.EndWhile, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(While);
			setState(645);
			parenthesis();
			setState(652);
			switch (_input.LA(1)) {
			case HtmlText:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case ScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(646);
				statement();
				}
				break;
			case Colon:
				{
				setState(647);
				match(Colon);
				setState(648);
				innerStatementList();
				setState(649);
				match(EndWhile);
				setState(650);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(PHPParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(PHPParser.While, 0); }
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(Do);
			setState(655);
			statement();
			setState(656);
			match(While);
			setState(657);
			parenthesis();
			setState(658);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(PHPParser.For, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndFor() { return getToken(PHPParser.EndFor, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(For);
			setState(661);
			match(OpenRoundBracket);
			setState(663);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
				{
				setState(662);
				forInit();
				}
			}

			setState(665);
			match(SemiColon);
			setState(667);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
				{
				setState(666);
				expressionList();
				}
			}

			setState(669);
			match(SemiColon);
			setState(671);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
				{
				setState(670);
				forUpdate();
				}
			}

			setState(673);
			match(CloseRoundBracket);
			setState(680);
			switch (_input.LA(1)) {
			case HtmlText:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case ScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(674);
				statement();
				}
				break;
			case Colon:
				{
				setState(675);
				match(Colon);
				setState(676);
				innerStatementList();
				setState(677);
				match(EndFor);
				setState(678);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(PHPParser.Switch, 0); }
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public TerminalNode EndSwitch() { return getToken(PHPParser.EndSwitch, 0); }
		public List<SwitchBlockContext> switchBlock() {
			return getRuleContexts(SwitchBlockContext.class);
		}
		public SwitchBlockContext switchBlock(int i) {
			return getRuleContext(SwitchBlockContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(Switch);
			setState(687);
			parenthesis();
			setState(711);
			switch (_input.LA(1)) {
			case OpenCurlyBracket:
				{
				setState(688);
				match(OpenCurlyBracket);
				setState(690);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(689);
					match(SemiColon);
					}
				}

				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(692);
					switchBlock();
					}
					}
					setState(697);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(698);
				match(CloseCurlyBracket);
				}
				break;
			case Colon:
				{
				setState(699);
				match(Colon);
				setState(701);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(700);
					match(SemiColon);
					}
				}

				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(703);
					switchBlock();
					}
					}
					setState(708);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(709);
				match(EndSwitch);
				setState(710);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public List<TerminalNode> Case() { return getTokens(PHPParser.Case); }
		public TerminalNode Case(int i) {
			return getToken(PHPParser.Case, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Default() { return getTokens(PHPParser.Default); }
		public TerminalNode Default(int i) {
			return getToken(PHPParser.Default, i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(719); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(716);
					switch (_input.LA(1)) {
					case Case:
						{
						setState(713);
						match(Case);
						setState(714);
						expression(0);
						}
						break;
					case Default:
						{
						setState(715);
						match(Default);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(718);
					_la = _input.LA(1);
					if ( !(_la==Colon || _la==SemiColon) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(721); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(723);
			innerStatementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(PHPParser.Break, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(Break);
			setState(727);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
				{
				setState(726);
				expression(0);
				}
			}

			setState(729);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(PHPParser.Continue, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(Continue);
			setState(733);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
				{
				setState(732);
				expression(0);
				}
			}

			setState(735);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(PHPParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(Return);
			setState(739);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
				{
				setState(738);
				expression(0);
				}
			}

			setState(741);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			expression(0);
			setState(744);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public List<ChainContext> chain() {
			return getRuleContexts(ChainContext.class);
		}
		public ChainContext chain(int i) {
			return getRuleContext(ChainContext.class,i);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Eq() { return getToken(PHPParser.Eq, 0); }
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_assignmentStatement);
		try {
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(746);
				chain();
				setState(747);
				assignmentOperator();
				setState(748);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				chain();
				setState(751);
				match(Eq);
				setState(752);
				match(Ampersand);
				setState(755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(753);
					chain();
					}
					break;
				case 2:
					{
					setState(754);
					newExpr();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsetStatementContext extends ParserRuleContext {
		public TerminalNode Unset() { return getToken(PHPParser.Unset, 0); }
		public ChainListContext chainList() {
			return getRuleContext(ChainListContext.class,0);
		}
		public UnsetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsetStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterUnsetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitUnsetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitUnsetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsetStatementContext unsetStatement() throws RecognitionException {
		UnsetStatementContext _localctx = new UnsetStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_unsetStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(Unset);
			setState(760);
			match(OpenRoundBracket);
			setState(761);
			chainList();
			setState(762);
			match(CloseRoundBracket);
			setState(763);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachStatementContext extends ParserRuleContext {
		public TerminalNode Foreach() { return getToken(PHPParser.Foreach, 0); }
		public List<ChainContext> chain() {
			return getRuleContexts(ChainContext.class);
		}
		public ChainContext chain(int i) {
			return getRuleContext(ChainContext.class,i);
		}
		public TerminalNode As() { return getToken(PHPParser.As, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode List() { return getToken(PHPParser.List, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndForeach() { return getToken(PHPParser.EndForeach, 0); }
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitForeachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_foreachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(Foreach);
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(766);
				match(OpenRoundBracket);
				setState(767);
				chain();
				setState(768);
				match(As);
				setState(770);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(769);
					match(Ampersand);
					}
				}

				setState(772);
				chain();
				setState(778);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(773);
					match(DoubleArrow);
					setState(775);
					_la = _input.LA(1);
					if (_la==Ampersand) {
						{
						setState(774);
						match(Ampersand);
						}
					}

					setState(777);
					chain();
					}
				}

				setState(780);
				match(CloseRoundBracket);
				}
				break;
			case 2:
				{
				setState(782);
				match(OpenRoundBracket);
				setState(783);
				expression(0);
				setState(784);
				match(As);
				setState(785);
				chain();
				setState(791);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(786);
					match(DoubleArrow);
					setState(788);
					_la = _input.LA(1);
					if (_la==Ampersand) {
						{
						setState(787);
						match(Ampersand);
						}
					}

					setState(790);
					chain();
					}
				}

				setState(793);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				{
				setState(795);
				match(OpenRoundBracket);
				setState(796);
				chain();
				setState(797);
				match(As);
				setState(798);
				match(List);
				setState(799);
				match(OpenRoundBracket);
				setState(800);
				assignmentList();
				setState(801);
				match(CloseRoundBracket);
				setState(802);
				match(CloseRoundBracket);
				}
				break;
			}
			setState(812);
			switch (_input.LA(1)) {
			case HtmlText:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case ScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(806);
				statement();
				}
				break;
			case Colon:
				{
				setState(807);
				match(Colon);
				setState(808);
				innerStatementList();
				setState(809);
				match(EndForeach);
				setState(810);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryCatchFinallyContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(PHPParser.Try, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FinallyStatementContext finallyStatement() {
			return getRuleContext(FinallyStatementContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryCatchFinallyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchFinally; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTryCatchFinally(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTryCatchFinally(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitTryCatchFinally(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchFinallyContext tryCatchFinally() throws RecognitionException {
		TryCatchFinallyContext _localctx = new TryCatchFinallyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tryCatchFinally);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(Try);
			setState(815);
			blockStatement();
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(817); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(816);
						catchClause();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(819); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(822);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(821);
					finallyStatement();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Catch) {
					{
					{
					setState(824);
					catchClause();
					}
					}
					setState(829);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(830);
				finallyStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(PHPParser.Catch, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public TerminalNode VarName() { return getToken(PHPParser.VarName, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(Catch);
			setState(834);
			match(OpenRoundBracket);
			setState(835);
			qualifiedStaticTypeRef();
			setState(836);
			match(VarName);
			setState(837);
			match(CloseRoundBracket);
			setState(838);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyStatementContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(PHPParser.Finally, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FinallyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFinallyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFinallyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitFinallyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyStatementContext finallyStatement() throws RecognitionException {
		FinallyStatementContext _localctx = new FinallyStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_finallyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(Finally);
			setState(841);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(PHPParser.Throw, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(Throw);
			setState(844);
			expression(0);
			setState(845);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GotoStatementContext extends ParserRuleContext {
		public TerminalNode Goto() { return getToken(PHPParser.Goto, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(Goto);
			setState(848);
			identifier();
			setState(849);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareStatementContext extends ParserRuleContext {
		public TerminalNode Declare() { return getToken(PHPParser.Declare, 0); }
		public DeclareListContext declareList() {
			return getRuleContext(DeclareListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndDeclare() { return getToken(PHPParser.EndDeclare, 0); }
		public DeclareStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterDeclareStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitDeclareStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitDeclareStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareStatementContext declareStatement() throws RecognitionException {
		DeclareStatementContext _localctx = new DeclareStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_declareStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match(Declare);
			setState(852);
			match(OpenRoundBracket);
			setState(853);
			declareList();
			setState(854);
			match(CloseRoundBracket);
			setState(861);
			switch (_input.LA(1)) {
			case HtmlText:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case ScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(855);
				statement();
				}
				break;
			case Colon:
				{
				setState(856);
				match(Colon);
				setState(857);
				innerStatementList();
				setState(858);
				match(EndDeclare);
				setState(859);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineHtmlContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<ScriptTextPartContext> scriptTextPart() {
			return getRuleContexts(ScriptTextPartContext.class);
		}
		public ScriptTextPartContext scriptTextPart(int i) {
			return getRuleContext(ScriptTextPartContext.class,i);
		}
		public InlineHtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineHtml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInlineHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInlineHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitInlineHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineHtmlContext inlineHtml() throws RecognitionException {
		InlineHtmlContext _localctx = new InlineHtmlContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_inlineHtml);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(865); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(865);
					switch (_input.LA(1)) {
					case HtmlText:
					case HtmlScriptOpen:
					case HtmlStyleOpen:
					case HtmlDtd:
					case HtmlOpen:
					case HtmlClose:
					case HtmlSlashClose:
					case HtmlSlash:
					case HtmlEquals:
					case HtmlStartQuoteString:
					case HtmlStartDoubleQuoteString:
					case HtmlHex:
					case HtmlDecimal:
					case HtmlName:
					case HtmlEndQuoteString:
					case HtmlQuoteString:
					case HtmlEndDoubleQuoteString:
					case HtmlDoubleQuoteString:
					case ScriptClose:
					case StyleBody:
						{
						setState(863);
						htmlElement();
						}
						break;
					case ScriptText:
						{
						setState(864);
						scriptTextPart();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(867); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareListContext extends ParserRuleContext {
		public List<IdentifierInititalizerContext> identifierInititalizer() {
			return getRuleContexts(IdentifierInititalizerContext.class);
		}
		public IdentifierInititalizerContext identifierInititalizer(int i) {
			return getRuleContext(IdentifierInititalizerContext.class,i);
		}
		public DeclareListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterDeclareList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitDeclareList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitDeclareList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareListContext declareList() throws RecognitionException {
		DeclareListContext _localctx = new DeclareListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_declareList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			identifierInititalizer();
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(870);
				match(Comma);
				setState(871);
				identifierInititalizer();
				}
				}
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Ellipsis - 179)) | (1L << (Ampersand - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)))) != 0)) {
				{
				setState(877);
				formalParameter();
				}
			}

			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(880);
				match(Comma);
				setState(881);
				formalParameter();
				}
				}
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			attributes();
			setState(889);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || _la==NamespaceSeparator || _la==Label) {
				{
				setState(888);
				typeHint();
				}
			}

			setState(892);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(891);
				match(Ampersand);
				}
			}

			setState(895);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(894);
				match(Ellipsis);
				}
			}

			setState(897);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeHintContext extends ParserRuleContext {
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public TerminalNode Callable() { return getToken(PHPParser.Callable, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeHint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTypeHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTypeHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitTypeHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeHintContext typeHint() throws RecognitionException {
		TypeHintContext _localctx = new TypeHintContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_typeHint);
		try {
			setState(902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(899);
				qualifiedStaticTypeRef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(900);
				match(Callable);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(901);
				primitiveType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalStatementContext extends ParserRuleContext {
		public TerminalNode Global() { return getToken(PHPParser.Global, 0); }
		public List<GlobalVarContext> globalVar() {
			return getRuleContexts(GlobalVarContext.class);
		}
		public GlobalVarContext globalVar(int i) {
			return getRuleContext(GlobalVarContext.class,i);
		}
		public GlobalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterGlobalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitGlobalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitGlobalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalStatementContext globalStatement() throws RecognitionException {
		GlobalStatementContext _localctx = new GlobalStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_globalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(Global);
			setState(905);
			globalVar();
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(906);
				match(Comma);
				setState(907);
				globalVar();
				}
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(913);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalVarContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PHPParser.VarName, 0); }
		public TerminalNode Dollar() { return getToken(PHPParser.Dollar, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GlobalVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterGlobalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitGlobalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitGlobalVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalVarContext globalVar() throws RecognitionException {
		GlobalVarContext _localctx = new GlobalVarContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_globalVar);
		try {
			setState(923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(915);
				match(VarName);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(916);
				match(Dollar);
				setState(917);
				chain();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(918);
				match(Dollar);
				setState(919);
				match(OpenCurlyBracket);
				setState(920);
				expression(0);
				setState(921);
				match(CloseCurlyBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EchoStatementContext extends ParserRuleContext {
		public TerminalNode Echo() { return getToken(PHPParser.Echo, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public EchoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_echoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterEchoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitEchoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitEchoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EchoStatementContext echoStatement() throws RecognitionException {
		EchoStatementContext _localctx = new EchoStatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_echoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			match(Echo);
			setState(926);
			expressionList();
			setState(927);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticVariableStatementContext extends ParserRuleContext {
		public TerminalNode Static() { return getToken(PHPParser.Static, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public StaticVariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticVariableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterStaticVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitStaticVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitStaticVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticVariableStatementContext staticVariableStatement() throws RecognitionException {
		StaticVariableStatementContext _localctx = new StaticVariableStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_staticVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			match(Static);
			setState(930);
			variableInitializer();
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(931);
				match(Comma);
				setState(932);
				variableInitializer();
				}
				}
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(938);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassStatementContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public PropertyModifiersContext propertyModifiers() {
			return getRuleContext(PropertyModifiersContext.class,0);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public TerminalNode Const() { return getToken(PHPParser.Const, 0); }
		public List<IdentifierInititalizerContext> identifierInititalizer() {
			return getRuleContexts(IdentifierInititalizerContext.class);
		}
		public IdentifierInititalizerContext identifierInititalizer(int i) {
			return getRuleContext(IdentifierInititalizerContext.class,i);
		}
		public TerminalNode Function() { return getToken(PHPParser.Function, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MemberModifiersContext memberModifiers() {
			return getRuleContext(MemberModifiersContext.class,0);
		}
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public BaseCtorCallContext baseCtorCall() {
			return getRuleContext(BaseCtorCallContext.class,0);
		}
		public TerminalNode Use() { return getToken(PHPParser.Use, 0); }
		public QualifiedNamespaceNameListContext qualifiedNamespaceNameList() {
			return getRuleContext(QualifiedNamespaceNameListContext.class,0);
		}
		public TraitAdaptationsContext traitAdaptations() {
			return getRuleContext(TraitAdaptationsContext.class,0);
		}
		public ClassStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterClassStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitClassStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitClassStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassStatementContext classStatement() throws RecognitionException {
		ClassStatementContext _localctx = new ClassStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_classStatement);
		int _la;
		try {
			setState(988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(940);
				attributes();
				setState(941);
				propertyModifiers();
				setState(942);
				variableInitializer();
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(943);
					match(Comma);
					setState(944);
					variableInitializer();
					}
					}
					setState(949);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(950);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				attributes();
				setState(953);
				match(Const);
				setState(954);
				identifierInititalizer();
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(955);
					match(Comma);
					setState(956);
					identifierInititalizer();
					}
					}
					setState(961);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(962);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(964);
				attributes();
				setState(966);
				_la = _input.LA(1);
				if (_la==Abstract || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Final - 72)) | (1L << (Private - 72)) | (1L << (Protected - 72)) | (1L << (Public - 72)) | (1L << (Static - 72)))) != 0)) {
					{
					setState(965);
					memberModifiers();
					}
				}

				setState(968);
				match(Function);
				setState(970);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(969);
					match(Ampersand);
					}
				}

				setState(972);
				identifier();
				setState(974);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(973);
					typeParameterListInBrackets();
					}
				}

				setState(976);
				match(OpenRoundBracket);
				setState(977);
				formalParameterList();
				setState(978);
				match(CloseRoundBracket);
				setState(980);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(979);
					baseCtorCall();
					}
				}

				setState(982);
				methodBody();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(984);
				match(Use);
				setState(985);
				qualifiedNamespaceNameList();
				setState(986);
				traitAdaptations();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraitAdaptationsContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public List<TraitAdaptationStatementContext> traitAdaptationStatement() {
			return getRuleContexts(TraitAdaptationStatementContext.class);
		}
		public TraitAdaptationStatementContext traitAdaptationStatement(int i) {
			return getRuleContext(TraitAdaptationStatementContext.class,i);
		}
		public TraitAdaptationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitAdaptations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTraitAdaptations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTraitAdaptations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitTraitAdaptations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitAdaptationsContext traitAdaptations() throws RecognitionException {
		TraitAdaptationsContext _localctx = new TraitAdaptationsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_traitAdaptations);
		int _la;
		try {
			setState(999);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
				match(OpenCurlyBracket);
				setState(995);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || _la==NamespaceSeparator || _la==Label) {
					{
					{
					setState(992);
					traitAdaptationStatement();
					}
					}
					setState(997);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(998);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraitAdaptationStatementContext extends ParserRuleContext {
		public TraitPrecedenceContext traitPrecedence() {
			return getRuleContext(TraitPrecedenceContext.class,0);
		}
		public TraitAliasContext traitAlias() {
			return getRuleContext(TraitAliasContext.class,0);
		}
		public TraitAdaptationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitAdaptationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTraitAdaptationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTraitAdaptationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitTraitAdaptationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitAdaptationStatementContext traitAdaptationStatement() throws RecognitionException {
		TraitAdaptationStatementContext _localctx = new TraitAdaptationStatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_traitAdaptationStatement);
		try {
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				traitPrecedence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				traitAlias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraitPrecedenceContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode InsteadOf() { return getToken(PHPParser.InsteadOf, 0); }
		public QualifiedNamespaceNameListContext qualifiedNamespaceNameList() {
			return getRuleContext(QualifiedNamespaceNameListContext.class,0);
		}
		public TraitPrecedenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitPrecedence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTraitPrecedence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTraitPrecedence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitTraitPrecedence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitPrecedenceContext traitPrecedence() throws RecognitionException {
		TraitPrecedenceContext _localctx = new TraitPrecedenceContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_traitPrecedence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			qualifiedNamespaceName();
			setState(1006);
			match(DoubleColon);
			setState(1007);
			identifier();
			setState(1008);
			match(InsteadOf);
			setState(1009);
			qualifiedNamespaceNameList();
			setState(1010);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraitAliasContext extends ParserRuleContext {
		public TraitMethodReferenceContext traitMethodReference() {
			return getRuleContext(TraitMethodReferenceContext.class,0);
		}
		public TerminalNode As() { return getToken(PHPParser.As, 0); }
		public MemberModifierContext memberModifier() {
			return getRuleContext(MemberModifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TraitAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTraitAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTraitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitTraitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitAliasContext traitAlias() throws RecognitionException {
		TraitAliasContext _localctx = new TraitAliasContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_traitAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			traitMethodReference();
			setState(1013);
			match(As);
			setState(1019);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1014);
				memberModifier();
				}
				break;
			case 2:
				{
				setState(1016);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(1015);
					memberModifier();
					}
					break;
				}
				setState(1018);
				identifier();
				}
				break;
			}
			setState(1021);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraitMethodReferenceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public TraitMethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitMethodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTraitMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTraitMethodReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitTraitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitMethodReferenceContext traitMethodReference() throws RecognitionException {
		TraitMethodReferenceContext _localctx = new TraitMethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_traitMethodReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1023);
				qualifiedNamespaceName();
				setState(1024);
				match(DoubleColon);
				}
				break;
			}
			setState(1028);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseCtorCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public BaseCtorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseCtorCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBaseCtorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBaseCtorCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitBaseCtorCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseCtorCallContext baseCtorCall() throws RecognitionException {
		BaseCtorCallContext _localctx = new BaseCtorCallContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_baseCtorCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			match(Colon);
			setState(1031);
			identifier();
			setState(1032);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_methodBody);
		try {
			setState(1036);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1035);
				blockStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyModifiersContext extends ParserRuleContext {
		public MemberModifiersContext memberModifiers() {
			return getRuleContext(MemberModifiersContext.class,0);
		}
		public TerminalNode Var() { return getToken(PHPParser.Var, 0); }
		public PropertyModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterPropertyModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitPropertyModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitPropertyModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyModifiersContext propertyModifiers() throws RecognitionException {
		PropertyModifiersContext _localctx = new PropertyModifiersContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_propertyModifiers);
		try {
			setState(1040);
			switch (_input.LA(1)) {
			case Abstract:
			case Final:
			case Private:
			case Protected:
			case Public:
			case Static:
				enterOuterAlt(_localctx, 1);
				{
				setState(1038);
				memberModifiers();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(1039);
				match(Var);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberModifiersContext extends ParserRuleContext {
		public List<MemberModifierContext> memberModifier() {
			return getRuleContexts(MemberModifierContext.class);
		}
		public MemberModifierContext memberModifier(int i) {
			return getRuleContext(MemberModifierContext.class,i);
		}
		public MemberModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterMemberModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitMemberModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitMemberModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberModifiersContext memberModifiers() throws RecognitionException {
		MemberModifiersContext _localctx = new MemberModifiersContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_memberModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1042);
				memberModifier();
				}
				}
				setState(1045); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Abstract || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Final - 72)) | (1L << (Private - 72)) | (1L << (Protected - 72)) | (1L << (Public - 72)) | (1L << (Static - 72)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PHPParser.VarName, 0); }
		public TerminalNode Eq() { return getToken(PHPParser.Eq, 0); }
		public ConstantInititalizerContext constantInititalizer() {
			return getRuleContext(ConstantInititalizerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_variableInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			match(VarName);
			setState(1050);
			_la = _input.LA(1);
			if (_la==Eq) {
				{
				setState(1048);
				match(Eq);
				setState(1049);
				constantInititalizer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierInititalizerContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Eq() { return getToken(PHPParser.Eq, 0); }
		public ConstantInititalizerContext constantInititalizer() {
			return getRuleContext(ConstantInititalizerContext.class,0);
		}
		public IdentifierInititalizerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierInititalizer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterIdentifierInititalizer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitIdentifierInititalizer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitIdentifierInititalizer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierInititalizerContext identifierInititalizer() throws RecognitionException {
		IdentifierInititalizerContext _localctx = new IdentifierInititalizerContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_identifierInititalizer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			identifier();
			setState(1053);
			match(Eq);
			setState(1054);
			constantInititalizer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalConstantDeclarationContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Const() { return getToken(PHPParser.Const, 0); }
		public List<IdentifierInititalizerContext> identifierInititalizer() {
			return getRuleContexts(IdentifierInititalizerContext.class);
		}
		public IdentifierInititalizerContext identifierInititalizer(int i) {
			return getRuleContext(IdentifierInititalizerContext.class,i);
		}
		public GlobalConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalConstantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterGlobalConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitGlobalConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitGlobalConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalConstantDeclarationContext globalConstantDeclaration() throws RecognitionException {
		GlobalConstantDeclarationContext _localctx = new GlobalConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_globalConstantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			attributes();
			setState(1057);
			match(Const);
			setState(1058);
			identifierInititalizer();
			setState(1063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1059);
				match(Comma);
				setState(1060);
				identifierInititalizer();
				}
				}
				setState(1065);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1066);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			expression(0);
			setState(1073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1069);
				match(Comma);
				setState(1070);
				expression(0);
				}
				}
				setState(1075);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesisContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public YieldExpressionContext yieldExpression() {
			return getRuleContext(YieldExpressionContext.class,0);
		}
		public ParenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesisContext parenthesis() throws RecognitionException {
		ParenthesisContext _localctx = new ParenthesisContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			match(OpenRoundBracket);
			setState(1079);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1077);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1078);
				yieldExpression();
				}
				break;
			}
			setState(1081);
			match(CloseRoundBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AndOrExpressionContext andOrExpression() {
			return getRuleContext(AndOrExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QuestionMark() { return getToken(PHPParser.QuestionMark, 0); }
		public TerminalNode LogicalAnd() { return getToken(PHPParser.LogicalAnd, 0); }
		public TerminalNode LogicalXor() { return getToken(PHPParser.LogicalXor, 0); }
		public TerminalNode LogicalOr() { return getToken(PHPParser.LogicalOr, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1084);
			andOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1086);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1087);
						match(QuestionMark);
						setState(1089);
						_la = _input.LA(1);
						if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
							{
							setState(1088);
							expression(0);
							}
						}

						setState(1091);
						match(Colon);
						setState(1092);
						andOrExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1093);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1094);
						match(LogicalAnd);
						setState(1095);
						andOrExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1096);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1097);
						match(LogicalXor);
						setState(1098);
						andOrExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1099);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1100);
						match(LogicalOr);
						setState(1101);
						andOrExpression(0);
						}
						break;
					}
					} 
				}
				setState(1106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndOrExpressionContext extends ParserRuleContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public AndOrExpressionContext andOrExpression() {
			return getRuleContext(AndOrExpressionContext.class,0);
		}
		public AndOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAndOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAndOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitAndOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndOrExpressionContext andOrExpression() throws RecognitionException {
		return andOrExpression(0);
	}

	private AndOrExpressionContext andOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndOrExpressionContext _localctx = new AndOrExpressionContext(_ctx, _parentState);
		AndOrExpressionContext _prevctx = _localctx;
		int _startState = 168;
		enterRecursionRule(_localctx, 168, RULE_andOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1108);
			comparisonExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
					case 1:
						{
						_localctx = new AndOrExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_andOrExpression);
						setState(1110);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1111);
						match(Ampersand);
						setState(1112);
						comparisonExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AndOrExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_andOrExpression);
						setState(1113);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1114);
						match(Caret);
						setState(1115);
						comparisonExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new AndOrExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_andOrExpression);
						setState(1116);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1117);
						match(Pipe);
						setState(1118);
						comparisonExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new AndOrExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_andOrExpression);
						setState(1119);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1120);
						match(BooleanAnd);
						setState(1121);
						comparisonExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new AndOrExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_andOrExpression);
						setState(1122);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1123);
						match(BooleanOr);
						setState(1124);
						comparisonExpression(0);
						}
						break;
					}
					} 
				}
				setState(1129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public AdditionExpressionContext additionExpression() {
			return getRuleContext(AdditionExpressionContext.class,0);
		}
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public TerminalNode Less() { return getToken(PHPParser.Less, 0); }
		public TerminalNode Greater() { return getToken(PHPParser.Greater, 0); }
		public TerminalNode IsNotEq() { return getToken(PHPParser.IsNotEq, 0); }
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		return comparisonExpression(0);
	}

	private ComparisonExpressionContext comparisonExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, _parentState);
		ComparisonExpressionContext _prevctx = _localctx;
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_comparisonExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1131);
			additionExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(1133);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1134);
						_la = _input.LA(1);
						if ( !(_la==ShiftLeft || _la==ShiftRight) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1135);
						additionExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ComparisonExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(1136);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1137);
						_la = _input.LA(1);
						if ( !(((((_la - 158)) & ~0x3f) == 0 && ((1L << (_la - 158)) & ((1L << (IsSmallerOrEqual - 158)) | (1L << (IsGreaterOrEqual - 158)) | (1L << (Less - 158)) | (1L << (Greater - 158)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1138);
						additionExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(1139);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1140);
						_la = _input.LA(1);
						if ( !(((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (IsIdentical - 154)) | (1L << (IsNoidentical - 154)) | (1L << (IsEqual - 154)) | (1L << (IsNotEq - 154)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1141);
						additionExpression(0);
						}
						break;
					}
					} 
				}
				setState(1146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditionExpressionContext extends ParserRuleContext {
		public MultiplicationExpressionContext multiplicationExpression() {
			return getRuleContext(MultiplicationExpressionContext.class,0);
		}
		public AdditionExpressionContext additionExpression() {
			return getRuleContext(AdditionExpressionContext.class,0);
		}
		public AdditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAdditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAdditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitAdditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionExpressionContext additionExpression() throws RecognitionException {
		return additionExpression(0);
	}

	private AdditionExpressionContext additionExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditionExpressionContext _localctx = new AdditionExpressionContext(_ctx, _parentState);
		AdditionExpressionContext _prevctx = _localctx;
		int _startState = 172;
		enterRecursionRule(_localctx, 172, RULE_additionExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1148);
			multiplicationExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditionExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additionExpression);
					setState(1150);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1151);
					_la = _input.LA(1);
					if ( !(((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (Plus - 187)) | (1L << (Minus - 187)) | (1L << (Dot - 187)))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1152);
					multiplicationExpression(0);
					}
					} 
				}
				setState(1157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicationExpressionContext extends ParserRuleContext {
		public NotLeftRecursionExpressionContext notLeftRecursionExpression() {
			return getRuleContext(NotLeftRecursionExpressionContext.class,0);
		}
		public MultiplicationExpressionContext multiplicationExpression() {
			return getRuleContext(MultiplicationExpressionContext.class,0);
		}
		public TerminalNode InstanceOf() { return getToken(PHPParser.InstanceOf, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode Divide() { return getToken(PHPParser.Divide, 0); }
		public MultiplicationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterMultiplicationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitMultiplicationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitMultiplicationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicationExpressionContext multiplicationExpression() throws RecognitionException {
		return multiplicationExpression(0);
	}

	private MultiplicationExpressionContext multiplicationExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicationExpressionContext _localctx = new MultiplicationExpressionContext(_ctx, _parentState);
		MultiplicationExpressionContext _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_multiplicationExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1159);
				notLeftRecursionExpression();
				}
				break;
			case 2:
				{
				setState(1160);
				notLeftRecursionExpression();
				setState(1161);
				match(Pow);
				setState(1162);
				multiplicationExpression(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicationExpression);
						setState(1166);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1167);
						match(InstanceOf);
						setState(1168);
						typeRef();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicationExpression);
						setState(1169);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1170);
						_la = _input.LA(1);
						if ( !(((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (Asterisk - 189)) | (1L << (Percent - 189)) | (1L << (Divide - 189)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1171);
						notLeftRecursionExpression();
						}
						break;
					}
					} 
				}
				setState(1176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NotLeftRecursionExpressionContext extends ParserRuleContext {
		public NotLeftRecursionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notLeftRecursionExpression; }
	 
		public NotLeftRecursionExpressionContext() { }
		public void copyFrom(NotLeftRecursionExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChainExpressionContext extends NotLeftRecursionExpressionContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ChainExpressionContext(NotLeftRecursionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterChainExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitChainExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitChainExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOperatorExpressionContext extends NotLeftRecursionExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryOperatorExpressionContext(NotLeftRecursionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterUnaryOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitUnaryOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitUnaryOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialWordExpressionContext extends NotLeftRecursionExpressionContext {
		public TerminalNode Yield() { return getToken(PHPParser.Yield, 0); }
		public TerminalNode List() { return getToken(PHPParser.List, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public TerminalNode Eq() { return getToken(PHPParser.Eq, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IsSet() { return getToken(PHPParser.IsSet, 0); }
		public ChainListContext chainList() {
			return getRuleContext(ChainListContext.class,0);
		}
		public TerminalNode Empty() { return getToken(PHPParser.Empty, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode Eval() { return getToken(PHPParser.Eval, 0); }
		public TerminalNode Exit() { return getToken(PHPParser.Exit, 0); }
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public TerminalNode Include() { return getToken(PHPParser.Include, 0); }
		public TerminalNode IncludeOnce() { return getToken(PHPParser.IncludeOnce, 0); }
		public TerminalNode Require() { return getToken(PHPParser.Require, 0); }
		public TerminalNode RequireOnce() { return getToken(PHPParser.RequireOnce, 0); }
		public SpecialWordExpressionContext(NotLeftRecursionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterSpecialWordExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitSpecialWordExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitSpecialWordExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayCreationExpressionContext extends NotLeftRecursionExpressionContext {
		public TerminalNode Array() { return getToken(PHPParser.Array, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayItemListContext arrayItemList() {
			return getRuleContext(ArrayItemListContext.class,0);
		}
		public ArrayCreationExpressionContext(NotLeftRecursionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitArrayCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitArrayCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewExpressionContext extends NotLeftRecursionExpressionContext {
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public NewExpressionContext(NotLeftRecursionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExpressionContext extends NotLeftRecursionExpressionContext {
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public ParenthesisExpressionContext(NotLeftRecursionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BackQuoteStringExpressionContext extends NotLeftRecursionExpressionContext {
		public TerminalNode BackQuoteString() { return getToken(PHPParser.BackQuoteString, 0); }
		public BackQuoteStringExpressionContext(NotLeftRecursionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBackQuoteStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBackQuoteStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitBackQuoteStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexerExpressionContext extends NotLeftRecursionExpressionContext {
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexerExpressionContext(NotLeftRecursionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterIndexerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitIndexerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitIndexerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScalarExpressionContext extends NotLeftRecursionExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode Label() { return getToken(PHPParser.Label, 0); }
		public ScalarExpressionContext(NotLeftRecursionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterScalarExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitScalarExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitScalarExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixIncDecExpressionContext extends NotLeftRecursionExpressionContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public PrefixIncDecExpressionContext(NotLeftRecursionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterPrefixIncDecExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitPrefixIncDecExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitPrefixIncDecExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExpressionContext extends NotLeftRecursionExpressionContext {
		public TerminalNode Print() { return getToken(PHPParser.Print, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintExpressionContext(NotLeftRecursionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterPrintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitPrintExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitPrintExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostfixIncDecExpressionContext extends NotLeftRecursionExpressionContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public PostfixIncDecExpressionContext(NotLeftRecursionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterPostfixIncDecExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitPostfixIncDecExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitPostfixIncDecExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastExpressionContext extends NotLeftRecursionExpressionContext {
		public CastOperationContext castOperation() {
			return getRuleContext(CastOperationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(NotLeftRecursionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaFunctionExpressionContext extends NotLeftRecursionExpressionContext {
		public TerminalNode Function() { return getToken(PHPParser.Function, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode Static() { return getToken(PHPParser.Static, 0); }
		public LambdaFunctionUseVarsContext lambdaFunctionUseVars() {
			return getRuleContext(LambdaFunctionUseVarsContext.class,0);
		}
		public LambdaFunctionExpressionContext(NotLeftRecursionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterLambdaFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitLambdaFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitLambdaFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CloneExpressionContext extends NotLeftRecursionExpressionContext {
		public TerminalNode Clone() { return getToken(PHPParser.Clone, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CloneExpressionContext(NotLeftRecursionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterCloneExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitCloneExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitCloneExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotLeftRecursionExpressionContext notLeftRecursionExpression() throws RecognitionException {
		NotLeftRecursionExpressionContext _localctx = new NotLeftRecursionExpressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_notLeftRecursionExpression);
		int _la;
		try {
			setState(1274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				_localctx = new CloneExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1177);
				match(Clone);
				setState(1178);
				expression(0);
				}
				break;
			case 2:
				_localctx = new NewExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1179);
				newExpr();
				}
				break;
			case 3:
				_localctx = new IndexerExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1180);
				stringConstant();
				setState(1181);
				match(OpenSquareBracket);
				setState(1182);
				expression(0);
				setState(1183);
				match(CloseSquareBracket);
				}
				break;
			case 4:
				_localctx = new CastExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1185);
				match(OpenRoundBracket);
				setState(1186);
				castOperation();
				setState(1187);
				match(CloseRoundBracket);
				setState(1188);
				expression(0);
				}
				break;
			case 5:
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1190);
				_la = _input.LA(1);
				if ( !(_la==Tilde || _la==SuppressWarnings) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1191);
				expression(0);
				}
				break;
			case 6:
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1192);
				_la = _input.LA(1);
				if ( !(((((_la - 185)) & ~0x3f) == 0 && ((1L << (_la - 185)) & ((1L << (Bang - 185)) | (1L << (Plus - 185)) | (1L << (Minus - 185)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1193);
				expression(0);
				}
				break;
			case 7:
				_localctx = new PrefixIncDecExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1194);
				_la = _input.LA(1);
				if ( !(_la==Inc || _la==Dec) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1195);
				chain();
				}
				break;
			case 8:
				_localctx = new PostfixIncDecExpressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1196);
				chain();
				setState(1197);
				_la = _input.LA(1);
				if ( !(_la==Inc || _la==Dec) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 9:
				_localctx = new PrintExpressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1199);
				match(Print);
				setState(1200);
				expression(0);
				}
				break;
			case 10:
				_localctx = new ChainExpressionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1201);
				chain();
				}
				break;
			case 11:
				_localctx = new ScalarExpressionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1202);
				constant();
				}
				break;
			case 12:
				_localctx = new ScalarExpressionContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1203);
				string();
				}
				break;
			case 13:
				_localctx = new ScalarExpressionContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1204);
				match(Label);
				}
				break;
			case 14:
				_localctx = new BackQuoteStringExpressionContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1205);
				match(BackQuoteString);
				}
				break;
			case 15:
				_localctx = new ParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1206);
				parenthesis();
				}
				break;
			case 16:
				_localctx = new ArrayCreationExpressionContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1218);
				switch (_input.LA(1)) {
				case Array:
					{
					setState(1207);
					match(Array);
					setState(1208);
					match(OpenRoundBracket);
					setState(1210);
					_la = _input.LA(1);
					if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Ampersand - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
						{
						setState(1209);
						arrayItemList();
						}
					}

					setState(1212);
					match(CloseRoundBracket);
					}
					break;
				case OpenSquareBracket:
					{
					setState(1213);
					match(OpenSquareBracket);
					setState(1215);
					_la = _input.LA(1);
					if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Ampersand - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
						{
						setState(1214);
						arrayItemList();
						}
					}

					setState(1217);
					match(CloseSquareBracket);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1224);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1220);
					match(OpenSquareBracket);
					setState(1221);
					expression(0);
					setState(1222);
					match(CloseSquareBracket);
					}
					break;
				}
				}
				break;
			case 17:
				_localctx = new SpecialWordExpressionContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1226);
				match(Yield);
				}
				break;
			case 18:
				_localctx = new SpecialWordExpressionContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1227);
				match(List);
				setState(1228);
				match(OpenRoundBracket);
				setState(1229);
				assignmentList();
				setState(1230);
				match(CloseRoundBracket);
				setState(1231);
				match(Eq);
				setState(1232);
				expression(0);
				}
				break;
			case 19:
				_localctx = new SpecialWordExpressionContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(1234);
				match(IsSet);
				setState(1235);
				match(OpenRoundBracket);
				setState(1236);
				chainList();
				setState(1237);
				match(CloseRoundBracket);
				}
				break;
			case 20:
				_localctx = new SpecialWordExpressionContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(1239);
				match(Empty);
				setState(1240);
				match(OpenRoundBracket);
				setState(1241);
				chain();
				setState(1242);
				match(CloseRoundBracket);
				}
				break;
			case 21:
				_localctx = new SpecialWordExpressionContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(1244);
				match(Eval);
				setState(1245);
				match(OpenRoundBracket);
				setState(1246);
				expression(0);
				setState(1247);
				match(CloseRoundBracket);
				}
				break;
			case 22:
				_localctx = new SpecialWordExpressionContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(1249);
				match(Exit);
				setState(1253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1250);
					match(OpenRoundBracket);
					setState(1251);
					match(CloseRoundBracket);
					}
					break;
				case 2:
					{
					setState(1252);
					parenthesis();
					}
					break;
				}
				}
				break;
			case 23:
				_localctx = new SpecialWordExpressionContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(1255);
				_la = _input.LA(1);
				if ( !(_la==Include || _la==IncludeOnce) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1256);
				expression(0);
				}
				break;
			case 24:
				_localctx = new SpecialWordExpressionContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(1257);
				_la = _input.LA(1);
				if ( !(_la==Require || _la==RequireOnce) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1258);
				expression(0);
				}
				break;
			case 25:
				_localctx = new LambdaFunctionExpressionContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(1260);
				_la = _input.LA(1);
				if (_la==Static) {
					{
					setState(1259);
					match(Static);
					}
				}

				setState(1262);
				match(Function);
				setState(1264);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(1263);
					match(Ampersand);
					}
				}

				setState(1266);
				match(OpenRoundBracket);
				setState(1267);
				formalParameterList();
				setState(1268);
				match(CloseRoundBracket);
				setState(1270);
				_la = _input.LA(1);
				if (_la==Use) {
					{
					setState(1269);
					lambdaFunctionUseVars();
					}
				}

				setState(1272);
				blockStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewExprContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(PHPParser.New, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NewExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNewExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExprContext newExpr() throws RecognitionException {
		NewExprContext _localctx = new NewExprContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_newExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			match(New);
			setState(1277);
			typeRef();
			setState(1279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1278);
				arguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Eq() { return getToken(PHPParser.Eq, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			_la = _input.LA(1);
			if ( !(((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & ((1L << (PlusEqual - 160)) | (1L << (MinusEqual - 160)) | (1L << (MulEqual - 160)) | (1L << (PowEqual - 160)) | (1L << (DivEqual - 160)) | (1L << (Concaequal - 160)) | (1L << (ModEqual - 160)) | (1L << (ShiftLeftEqual - 160)) | (1L << (ShiftRightEqual - 160)) | (1L << (AndEqual - 160)) | (1L << (OrEqual - 160)) | (1L << (XorEqual - 160)) | (1L << (Eq - 160)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YieldExpressionContext extends ParserRuleContext {
		public TerminalNode Yield() { return getToken(PHPParser.Yield, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public YieldExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterYieldExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitYieldExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitYieldExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldExpressionContext yieldExpression() throws RecognitionException {
		YieldExpressionContext _localctx = new YieldExpressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_yieldExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			match(Yield);
			setState(1284);
			expression(0);
			setState(1287);
			_la = _input.LA(1);
			if (_la==DoubleArrow) {
				{
				setState(1285);
				match(DoubleArrow);
				setState(1286);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayItemListContext extends ParserRuleContext {
		public List<ArrayItemContext> arrayItem() {
			return getRuleContexts(ArrayItemContext.class);
		}
		public ArrayItemContext arrayItem(int i) {
			return getRuleContext(ArrayItemContext.class,i);
		}
		public ArrayItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterArrayItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitArrayItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitArrayItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayItemListContext arrayItemList() throws RecognitionException {
		ArrayItemListContext _localctx = new ArrayItemListContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_arrayItemList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			arrayItem();
			setState(1294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1290);
					match(Comma);
					setState(1291);
					arrayItem();
					}
					} 
				}
				setState(1296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			}
			setState(1298);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1297);
				match(Comma);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayItemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ArrayItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterArrayItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitArrayItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitArrayItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayItemContext arrayItem() throws RecognitionException {
		ArrayItemContext _localctx = new ArrayItemContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_arrayItem);
		int _la;
		try {
			setState(1312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1300);
				expression(0);
				setState(1303);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(1301);
					match(DoubleArrow);
					setState(1302);
					expression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1308);
				_la = _input.LA(1);
				if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
					{
					setState(1305);
					expression(0);
					setState(1306);
					match(DoubleArrow);
					}
				}

				setState(1310);
				match(Ampersand);
				setState(1311);
				chain();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaFunctionUseVarsContext extends ParserRuleContext {
		public TerminalNode Use() { return getToken(PHPParser.Use, 0); }
		public List<LambdaFunctionUseVarContext> lambdaFunctionUseVar() {
			return getRuleContexts(LambdaFunctionUseVarContext.class);
		}
		public LambdaFunctionUseVarContext lambdaFunctionUseVar(int i) {
			return getRuleContext(LambdaFunctionUseVarContext.class,i);
		}
		public LambdaFunctionUseVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctionUseVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterLambdaFunctionUseVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitLambdaFunctionUseVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitLambdaFunctionUseVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionUseVarsContext lambdaFunctionUseVars() throws RecognitionException {
		LambdaFunctionUseVarsContext _localctx = new LambdaFunctionUseVarsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_lambdaFunctionUseVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			match(Use);
			setState(1315);
			match(OpenRoundBracket);
			setState(1316);
			lambdaFunctionUseVar();
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1317);
				match(Comma);
				setState(1318);
				lambdaFunctionUseVar();
				}
				}
				setState(1323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1324);
			match(CloseRoundBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaFunctionUseVarContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PHPParser.VarName, 0); }
		public LambdaFunctionUseVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctionUseVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterLambdaFunctionUseVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitLambdaFunctionUseVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitLambdaFunctionUseVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionUseVarContext lambdaFunctionUseVar() throws RecognitionException {
		LambdaFunctionUseVarContext _localctx = new LambdaFunctionUseVarContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_lambdaFunctionUseVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(1326);
				match(Ampersand);
				}
			}

			setState(1329);
			match(VarName);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedStaticTypeRefContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public GenericDynamicArgsContext genericDynamicArgs() {
			return getRuleContext(GenericDynamicArgsContext.class,0);
		}
		public TerminalNode Static() { return getToken(PHPParser.Static, 0); }
		public QualifiedStaticTypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedStaticTypeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterQualifiedStaticTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitQualifiedStaticTypeRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitQualifiedStaticTypeRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedStaticTypeRefContext qualifiedStaticTypeRef() throws RecognitionException {
		QualifiedStaticTypeRefContext _localctx = new QualifiedStaticTypeRefContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_qualifiedStaticTypeRef);
		int _la;
		try {
			setState(1336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1331);
				qualifiedNamespaceName();
				setState(1333);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1332);
					genericDynamicArgs();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1335);
				match(Static);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeRefContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public IndirectTypeRefContext indirectTypeRef() {
			return getRuleContext(IndirectTypeRefContext.class,0);
		}
		public GenericDynamicArgsContext genericDynamicArgs() {
			return getRuleContext(GenericDynamicArgsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode Static() { return getToken(PHPParser.Static, 0); }
		public TypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTypeRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitTypeRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeRefContext typeRef() throws RecognitionException {
		TypeRefContext _localctx = new TypeRefContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_typeRef);
		try {
			setState(1347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1340);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1338);
					qualifiedNamespaceName();
					}
					break;
				case 2:
					{
					setState(1339);
					indirectTypeRef();
					}
					break;
				}
				setState(1343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1342);
					genericDynamicArgs();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1345);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1346);
				match(Static);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndirectTypeRefContext extends ParserRuleContext {
		public ChainBaseContext chainBase() {
			return getRuleContext(ChainBaseContext.class,0);
		}
		public List<KeyedFieldNameContext> keyedFieldName() {
			return getRuleContexts(KeyedFieldNameContext.class);
		}
		public KeyedFieldNameContext keyedFieldName(int i) {
			return getRuleContext(KeyedFieldNameContext.class,i);
		}
		public IndirectTypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indirectTypeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterIndirectTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitIndirectTypeRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitIndirectTypeRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndirectTypeRefContext indirectTypeRef() throws RecognitionException {
		IndirectTypeRefContext _localctx = new IndirectTypeRefContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_indirectTypeRef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			chainBase();
			setState(1354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1350);
					match(ObjectOperator);
					setState(1351);
					keyedFieldName();
					}
					} 
				}
				setState(1356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNamespaceNameContext extends ParserRuleContext {
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public TerminalNode Namespace() { return getToken(PHPParser.Namespace, 0); }
		public QualifiedNamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNamespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterQualifiedNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitQualifiedNamespaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitQualifiedNamespaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNamespaceNameContext qualifiedNamespaceName() throws RecognitionException {
		QualifiedNamespaceNameContext _localctx = new QualifiedNamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_qualifiedNamespaceName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1357);
				match(Namespace);
				}
				break;
			}
			setState(1361);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(1360);
				match(NamespaceSeparator);
				}
			}

			setState(1363);
			namespaceNameList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceNameListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public NamespaceNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNamespaceNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNamespaceNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitNamespaceNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceNameListContext namespaceNameList() throws RecognitionException {
		NamespaceNameListContext _localctx = new NamespaceNameListContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_namespaceNameList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			identifier();
			setState(1370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1366);
					match(NamespaceSeparator);
					setState(1367);
					identifier();
					}
					} 
				}
				setState(1372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNamespaceNameListContext extends ParserRuleContext {
		public List<QualifiedNamespaceNameContext> qualifiedNamespaceName() {
			return getRuleContexts(QualifiedNamespaceNameContext.class);
		}
		public QualifiedNamespaceNameContext qualifiedNamespaceName(int i) {
			return getRuleContext(QualifiedNamespaceNameContext.class,i);
		}
		public QualifiedNamespaceNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNamespaceNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterQualifiedNamespaceNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitQualifiedNamespaceNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitQualifiedNamespaceNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNamespaceNameListContext qualifiedNamespaceNameList() throws RecognitionException {
		QualifiedNamespaceNameListContext _localctx = new QualifiedNamespaceNameListContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_qualifiedNamespaceNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			qualifiedNamespaceName();
			setState(1378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1374);
				match(Comma);
				setState(1375);
				qualifiedNamespaceName();
				}
				}
				setState(1380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ActualArgumentContext> actualArgument() {
			return getRuleContexts(ActualArgumentContext.class);
		}
		public ActualArgumentContext actualArgument(int i) {
			return getRuleContext(ActualArgumentContext.class,i);
		}
		public YieldExpressionContext yieldExpression() {
			return getRuleContext(YieldExpressionContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			match(OpenRoundBracket);
			setState(1391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1382);
				actualArgument();
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1383);
					match(Comma);
					setState(1384);
					actualArgument();
					}
					}
					setState(1389);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1390);
				yieldExpression();
				}
				break;
			}
			setState(1393);
			match(CloseRoundBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActualArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ActualArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterActualArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitActualArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitActualArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualArgumentContext actualArgument() throws RecognitionException {
		ActualArgumentContext _localctx = new ActualArgumentContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_actualArgument);
		int _la;
		try {
			setState(1401);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Ellipsis:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(1396);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1395);
					match(Ellipsis);
					}
				}

				setState(1398);
				expression(0);
				}
				break;
			case Ampersand:
				enterOuterAlt(_localctx, 2);
				{
				setState(1399);
				match(Ampersand);
				setState(1400);
				chain();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantInititalizerContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode Array() { return getToken(PHPParser.Array, 0); }
		public ConstantArrayItemListContext constantArrayItemList() {
			return getRuleContext(ConstantArrayItemListContext.class,0);
		}
		public ConstantInititalizerContext constantInititalizer() {
			return getRuleContext(ConstantInititalizerContext.class,0);
		}
		public ConstantInititalizerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantInititalizer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterConstantInititalizer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitConstantInititalizer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitConstantInititalizer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantInititalizerContext constantInititalizer() throws RecognitionException {
		ConstantInititalizerContext _localctx = new ConstantInititalizerContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_constantInititalizer);
		int _la;
		try {
			setState(1424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1403);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1404);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1405);
				match(Array);
				setState(1406);
				match(OpenRoundBracket);
				setState(1411);
				_la = _input.LA(1);
				if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Dollar - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
					{
					setState(1407);
					constantArrayItemList();
					setState(1409);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1408);
						match(Comma);
						}
					}

					}
				}

				setState(1413);
				match(CloseRoundBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1414);
				match(OpenSquareBracket);
				setState(1419);
				_la = _input.LA(1);
				if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Dollar - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
					{
					setState(1415);
					constantArrayItemList();
					setState(1417);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1416);
						match(Comma);
						}
					}

					}
				}

				setState(1421);
				match(CloseSquareBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1422);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1423);
				constantInititalizer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantArrayItemListContext extends ParserRuleContext {
		public List<ConstantArrayItemContext> constantArrayItem() {
			return getRuleContexts(ConstantArrayItemContext.class);
		}
		public ConstantArrayItemContext constantArrayItem(int i) {
			return getRuleContext(ConstantArrayItemContext.class,i);
		}
		public ConstantArrayItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantArrayItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterConstantArrayItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitConstantArrayItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitConstantArrayItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantArrayItemListContext constantArrayItemList() throws RecognitionException {
		ConstantArrayItemListContext _localctx = new ConstantArrayItemListContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_constantArrayItemList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			constantArrayItem();
			setState(1431);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1427);
					match(Comma);
					setState(1428);
					constantArrayItem();
					}
					} 
				}
				setState(1433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantArrayItemContext extends ParserRuleContext {
		public List<ConstantInititalizerContext> constantInititalizer() {
			return getRuleContexts(ConstantInititalizerContext.class);
		}
		public ConstantInititalizerContext constantInititalizer(int i) {
			return getRuleContext(ConstantInititalizerContext.class,i);
		}
		public ConstantArrayItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantArrayItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterConstantArrayItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitConstantArrayItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitConstantArrayItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantArrayItemContext constantArrayItem() throws RecognitionException {
		ConstantArrayItemContext _localctx = new ConstantArrayItemContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constantArrayItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			constantInititalizer();
			setState(1437);
			_la = _input.LA(1);
			if (_la==DoubleArrow) {
				{
				setState(1435);
				match(DoubleArrow);
				setState(1436);
				constantInititalizer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode Null() { return getToken(PHPParser.Null, 0); }
		public LiteralConstantContext literalConstant() {
			return getRuleContext(LiteralConstantContext.class,0);
		}
		public MagicConstantContext magicConstant() {
			return getRuleContext(MagicConstantContext.class,0);
		}
		public ClassConstantContext classConstant() {
			return getRuleContext(ClassConstantContext.class,0);
		}
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_constant);
		try {
			setState(1444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1439);
				match(Null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1440);
				literalConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1441);
				magicConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1442);
				classConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1443);
				qualifiedNamespaceName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralConstantContext extends ParserRuleContext {
		public TerminalNode Real() { return getToken(PHPParser.Real, 0); }
		public TerminalNode BooleanConstant() { return getToken(PHPParser.BooleanConstant, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public LiteralConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterLiteralConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitLiteralConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitLiteralConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralConstantContext literalConstant() throws RecognitionException {
		LiteralConstantContext _localctx = new LiteralConstantContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_literalConstant);
		try {
			setState(1450);
			switch (_input.LA(1)) {
			case Real:
				enterOuterAlt(_localctx, 1);
				{
				setState(1446);
				match(Real);
				}
				break;
			case BooleanConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(1447);
				match(BooleanConstant);
				}
				break;
			case Octal:
			case Decimal:
			case Hex:
			case Binary:
				enterOuterAlt(_localctx, 3);
				{
				setState(1448);
				numericConstant();
				}
				break;
			case Label:
				enterOuterAlt(_localctx, 4);
				{
				setState(1449);
				stringConstant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericConstantContext extends ParserRuleContext {
		public TerminalNode Octal() { return getToken(PHPParser.Octal, 0); }
		public TerminalNode Decimal() { return getToken(PHPParser.Decimal, 0); }
		public TerminalNode Hex() { return getToken(PHPParser.Hex, 0); }
		public TerminalNode Binary() { return getToken(PHPParser.Binary, 0); }
		public NumericConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNumericConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNumericConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitNumericConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericConstantContext numericConstant() throws RecognitionException {
		NumericConstantContext _localctx = new NumericConstantContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_numericConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			_la = _input.LA(1);
			if ( !(((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (Octal - 211)) | (1L << (Decimal - 211)) | (1L << (Hex - 211)) | (1L << (Binary - 211)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassConstantContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(PHPParser.Class, 0); }
		public TerminalNode Parent_() { return getToken(PHPParser.Parent_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Constructor() { return getToken(PHPParser.Constructor, 0); }
		public TerminalNode Get() { return getToken(PHPParser.Get, 0); }
		public TerminalNode Set() { return getToken(PHPParser.Set, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public KeyedVariableContext keyedVariable() {
			return getRuleContext(KeyedVariableContext.class,0);
		}
		public ClassConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterClassConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitClassConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitClassConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassConstantContext classConstant() throws RecognitionException {
		ClassConstantContext _localctx = new ClassConstantContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_classConstant);
		int _la;
		try {
			setState(1469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1454);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==Parent_) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1455);
				match(DoubleColon);
				setState(1460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1456);
					identifier();
					}
					break;
				case 2:
					{
					setState(1457);
					match(Constructor);
					}
					break;
				case 3:
					{
					setState(1458);
					match(Get);
					}
					break;
				case 4:
					{
					setState(1459);
					match(Set);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1464);
				switch (_input.LA(1)) {
				case Abstract:
				case Array:
				case As:
				case BinaryCast:
				case BoolType:
				case BooleanConstant:
				case Break:
				case Callable:
				case Case:
				case Catch:
				case Class:
				case Clone:
				case Const:
				case Continue:
				case Declare:
				case Default:
				case Do:
				case DoubleCast:
				case DoubleType:
				case Echo:
				case Else:
				case ElseIf:
				case Empty:
				case EndDeclare:
				case EndFor:
				case EndForeach:
				case EndIf:
				case EndSwitch:
				case EndWhile:
				case Eval:
				case Exit:
				case Extends:
				case Final:
				case Finally:
				case FloatCast:
				case For:
				case Foreach:
				case Function:
				case Global:
				case Goto:
				case If:
				case Implements:
				case Import:
				case Include:
				case IncludeOnce:
				case InstanceOf:
				case InsteadOf:
				case Int8Cast:
				case Int16Cast:
				case Int64Type:
				case IntType:
				case Interface:
				case IsSet:
				case List:
				case LogicalAnd:
				case LogicalOr:
				case LogicalXor:
				case Namespace:
				case New:
				case Null:
				case ObjectType:
				case Parent_:
				case Partial:
				case Print:
				case Private:
				case Protected:
				case Public:
				case Require:
				case RequireOnce:
				case Resource:
				case Return:
				case Static:
				case StringType:
				case Switch:
				case Throw:
				case Trait:
				case Try:
				case Typeof:
				case UintCast:
				case UnicodeCast:
				case Unset:
				case Use:
				case Var:
				case While:
				case Yield:
				case Get:
				case Set:
				case Call:
				case CallStatic:
				case Constructor:
				case Destruct:
				case Wakeup:
				case Sleep:
				case Autoload:
				case IsSet__:
				case Unset__:
				case ToString__:
				case Invoke:
				case SetState:
				case Clone__:
				case DebugInfo:
				case Namespace__:
				case Class__:
				case Traic__:
				case Function__:
				case Method__:
				case Line__:
				case File__:
				case Dir__:
				case NamespaceSeparator:
				case Label:
					{
					setState(1462);
					qualifiedStaticTypeRef();
					}
					break;
				case Dollar:
				case VarName:
					{
					setState(1463);
					keyedVariable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1466);
				match(DoubleColon);
				setState(1467);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringConstantContext extends ParserRuleContext {
		public TerminalNode Label() { return getToken(PHPParser.Label, 0); }
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitStringConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
			match(Label);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode StartHereDoc() { return getToken(PHPParser.StartHereDoc, 0); }
		public List<TerminalNode> HereDocText() { return getTokens(PHPParser.HereDocText); }
		public TerminalNode HereDocText(int i) {
			return getToken(PHPParser.HereDocText, i);
		}
		public TerminalNode StartNowDoc() { return getToken(PHPParser.StartNowDoc, 0); }
		public TerminalNode SingleQuoteString() { return getToken(PHPParser.SingleQuoteString, 0); }
		public List<TerminalNode> DoubleQuote() { return getTokens(PHPParser.DoubleQuote); }
		public TerminalNode DoubleQuote(int i) {
			return getToken(PHPParser.DoubleQuote, i);
		}
		public List<InterpolatedStringPartContext> interpolatedStringPart() {
			return getRuleContexts(InterpolatedStringPartContext.class);
		}
		public InterpolatedStringPartContext interpolatedStringPart(int i) {
			return getRuleContext(InterpolatedStringPartContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_string);
		int _la;
		try {
			int _alt;
			setState(1494);
			switch (_input.LA(1)) {
			case StartHereDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(1473);
				match(StartHereDoc);
				setState(1475); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1474);
						match(HereDocText);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1477); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case StartNowDoc:
				enterOuterAlt(_localctx, 2);
				{
				setState(1479);
				match(StartNowDoc);
				setState(1481); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1480);
						match(HereDocText);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1483); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SingleQuoteString:
				enterOuterAlt(_localctx, 3);
				{
				setState(1485);
				match(SingleQuoteString);
				}
				break;
			case DoubleQuote:
				enterOuterAlt(_localctx, 4);
				{
				setState(1486);
				match(DoubleQuote);
				setState(1490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (StringPart - 179)))) != 0)) {
					{
					{
					setState(1487);
					interpolatedStringPart();
					}
					}
					setState(1492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1493);
				match(DoubleQuote);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterpolatedStringPartContext extends ParserRuleContext {
		public TerminalNode StringPart() { return getToken(PHPParser.StringPart, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public InterpolatedStringPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolatedStringPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInterpolatedStringPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInterpolatedStringPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitInterpolatedStringPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolatedStringPartContext interpolatedStringPart() throws RecognitionException {
		InterpolatedStringPartContext _localctx = new InterpolatedStringPartContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_interpolatedStringPart);
		try {
			setState(1498);
			switch (_input.LA(1)) {
			case StringPart:
				enterOuterAlt(_localctx, 1);
				{
				setState(1496);
				match(StringPart);
				}
				break;
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case NamespaceSeparator:
			case Dollar:
			case OpenRoundBracket:
			case VarName:
			case Label:
				enterOuterAlt(_localctx, 2);
				{
				setState(1497);
				chain();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChainListContext extends ParserRuleContext {
		public List<ChainContext> chain() {
			return getRuleContexts(ChainContext.class);
		}
		public ChainContext chain(int i) {
			return getRuleContext(ChainContext.class,i);
		}
		public ChainListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterChainList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitChainList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitChainList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainListContext chainList() throws RecognitionException {
		ChainListContext _localctx = new ChainListContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_chainList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			chain();
			setState(1505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1501);
				match(Comma);
				setState(1502);
				chain();
				}
				}
				setState(1507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChainContext extends ParserRuleContext {
		public ChainBaseContext chainBase() {
			return getRuleContext(ChainBaseContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public List<MemberAccessContext> memberAccess() {
			return getRuleContexts(MemberAccessContext.class);
		}
		public MemberAccessContext memberAccess(int i) {
			return getRuleContext(MemberAccessContext.class,i);
		}
		public ChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainContext chain() throws RecognitionException {
		ChainContext _localctx = new ChainContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_chain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1508);
				chainBase();
				}
				break;
			case 2:
				{
				setState(1509);
				functionCall();
				}
				break;
			case 3:
				{
				setState(1510);
				match(OpenRoundBracket);
				setState(1511);
				newExpr();
				setState(1512);
				match(CloseRoundBracket);
				}
				break;
			}
			setState(1519);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1516);
					memberAccess();
					}
					} 
				}
				setState(1521);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberAccessContext extends ParserRuleContext {
		public KeyedFieldNameContext keyedFieldName() {
			return getRuleContext(KeyedFieldNameContext.class,0);
		}
		public ActualArgumentsContext actualArguments() {
			return getRuleContext(ActualArgumentsContext.class,0);
		}
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_memberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			match(ObjectOperator);
			setState(1523);
			keyedFieldName();
			setState(1525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1524);
				actualArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallNameContext functionCallName() {
			return getRuleContext(FunctionCallNameContext.class,0);
		}
		public ActualArgumentsContext actualArguments() {
			return getRuleContext(ActualArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			functionCallName();
			setState(1528);
			actualArguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallNameContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public ClassConstantContext classConstant() {
			return getRuleContext(ClassConstantContext.class,0);
		}
		public ChainBaseContext chainBase() {
			return getRuleContext(ChainBaseContext.class,0);
		}
		public FunctionCallNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFunctionCallName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFunctionCallName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitFunctionCallName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallNameContext functionCallName() throws RecognitionException {
		FunctionCallNameContext _localctx = new FunctionCallNameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_functionCallName);
		try {
			setState(1533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1530);
				qualifiedNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1531);
				classConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1532);
				chainBase();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActualArgumentsContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public GenericDynamicArgsContext genericDynamicArgs() {
			return getRuleContext(GenericDynamicArgsContext.class,0);
		}
		public List<SquareCurlyExpressionContext> squareCurlyExpression() {
			return getRuleContexts(SquareCurlyExpressionContext.class);
		}
		public SquareCurlyExpressionContext squareCurlyExpression(int i) {
			return getRuleContext(SquareCurlyExpressionContext.class,i);
		}
		public ActualArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterActualArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitActualArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitActualArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualArgumentsContext actualArguments() throws RecognitionException {
		ActualArgumentsContext _localctx = new ActualArgumentsContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_actualArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(1535);
				genericDynamicArgs();
				}
			}

			setState(1538);
			arguments();
			setState(1542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1539);
					squareCurlyExpression();
					}
					} 
				}
				setState(1544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChainBaseContext extends ParserRuleContext {
		public List<KeyedVariableContext> keyedVariable() {
			return getRuleContexts(KeyedVariableContext.class);
		}
		public KeyedVariableContext keyedVariable(int i) {
			return getRuleContext(KeyedVariableContext.class,i);
		}
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public ChainBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterChainBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitChainBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitChainBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainBaseContext chainBase() throws RecognitionException {
		ChainBaseContext _localctx = new ChainBaseContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_chainBase);
		try {
			setState(1554);
			switch (_input.LA(1)) {
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1545);
				keyedVariable();
				setState(1548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1546);
					match(DoubleColon);
					setState(1547);
					keyedVariable();
					}
					break;
				}
				}
				break;
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case NamespaceSeparator:
			case Label:
				enterOuterAlt(_localctx, 2);
				{
				setState(1550);
				qualifiedStaticTypeRef();
				setState(1551);
				match(DoubleColon);
				setState(1552);
				keyedVariable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyedFieldNameContext extends ParserRuleContext {
		public KeyedSimpleFieldNameContext keyedSimpleFieldName() {
			return getRuleContext(KeyedSimpleFieldNameContext.class,0);
		}
		public KeyedVariableContext keyedVariable() {
			return getRuleContext(KeyedVariableContext.class,0);
		}
		public KeyedFieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedFieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterKeyedFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitKeyedFieldName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitKeyedFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyedFieldNameContext keyedFieldName() throws RecognitionException {
		KeyedFieldNameContext _localctx = new KeyedFieldNameContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_keyedFieldName);
		try {
			setState(1558);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case OpenCurlyBracket:
			case Label:
				enterOuterAlt(_localctx, 1);
				{
				setState(1556);
				keyedSimpleFieldName();
				}
				break;
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 2);
				{
				setState(1557);
				keyedVariable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyedSimpleFieldNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<SquareCurlyExpressionContext> squareCurlyExpression() {
			return getRuleContexts(SquareCurlyExpressionContext.class);
		}
		public SquareCurlyExpressionContext squareCurlyExpression(int i) {
			return getRuleContext(SquareCurlyExpressionContext.class,i);
		}
		public KeyedSimpleFieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedSimpleFieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterKeyedSimpleFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitKeyedSimpleFieldName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitKeyedSimpleFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyedSimpleFieldNameContext keyedSimpleFieldName() throws RecognitionException {
		KeyedSimpleFieldNameContext _localctx = new KeyedSimpleFieldNameContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_keyedSimpleFieldName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Label:
				{
				setState(1560);
				identifier();
				}
				break;
			case OpenCurlyBracket:
				{
				setState(1561);
				match(OpenCurlyBracket);
				setState(1562);
				expression(0);
				setState(1563);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1570);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1567);
					squareCurlyExpression();
					}
					} 
				}
				setState(1572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyedVariableContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PHPParser.VarName, 0); }
		public List<TerminalNode> Dollar() { return getTokens(PHPParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PHPParser.Dollar, i);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<SquareCurlyExpressionContext> squareCurlyExpression() {
			return getRuleContexts(SquareCurlyExpressionContext.class);
		}
		public SquareCurlyExpressionContext squareCurlyExpression(int i) {
			return getRuleContext(SquareCurlyExpressionContext.class,i);
		}
		public KeyedVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterKeyedVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitKeyedVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitKeyedVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyedVariableContext keyedVariable() throws RecognitionException {
		KeyedVariableContext _localctx = new KeyedVariableContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_keyedVariable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1573);
					match(Dollar);
					}
					} 
				}
				setState(1578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			}
			setState(1585);
			switch (_input.LA(1)) {
			case VarName:
				{
				setState(1579);
				match(VarName);
				}
				break;
			case Dollar:
				{
				setState(1580);
				match(Dollar);
				setState(1581);
				match(OpenCurlyBracket);
				setState(1582);
				expression(0);
				setState(1583);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1587);
					squareCurlyExpression();
					}
					} 
				}
				setState(1592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SquareCurlyExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public SquareCurlyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_squareCurlyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterSquareCurlyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitSquareCurlyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitSquareCurlyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SquareCurlyExpressionContext squareCurlyExpression() throws RecognitionException {
		SquareCurlyExpressionContext _localctx = new SquareCurlyExpressionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_squareCurlyExpression);
		int _la;
		try {
			setState(1602);
			switch (_input.LA(1)) {
			case OpenSquareBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1593);
				match(OpenSquareBracket);
				setState(1595);
				_la = _input.LA(1);
				if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
					{
					setState(1594);
					expression(0);
					}
				}

				setState(1597);
				match(CloseSquareBracket);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1598);
				match(OpenCurlyBracket);
				setState(1599);
				expression(0);
				setState(1600);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentListElementContext> assignmentListElement() {
			return getRuleContexts(AssignmentListElementContext.class);
		}
		public AssignmentListElementContext assignmentListElement(int i) {
			return getRuleContext(AssignmentListElementContext.class,i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)))) != 0)) {
				{
				setState(1604);
				assignmentListElement();
				}
			}

			setState(1613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1607);
				match(Comma);
				setState(1609);
				_la = _input.LA(1);
				if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)))) != 0)) {
					{
					setState(1608);
					assignmentListElement();
					}
				}

				}
				}
				setState(1615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentListElementContext extends ParserRuleContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode List() { return getToken(PHPParser.List, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public AssignmentListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAssignmentListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAssignmentListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitAssignmentListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListElementContext assignmentListElement() throws RecognitionException {
		AssignmentListElementContext _localctx = new AssignmentListElementContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_assignmentListElement);
		try {
			setState(1622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1616);
				chain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1617);
				match(List);
				setState(1618);
				match(OpenRoundBracket);
				setState(1619);
				assignmentList();
				setState(1620);
				match(CloseRoundBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode Abstract() { return getToken(PHPParser.Abstract, 0); }
		public TerminalNode Final() { return getToken(PHPParser.Final, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			_la = _input.LA(1);
			if ( !(_la==Abstract || _la==Final) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Label() { return getToken(PHPParser.Label, 0); }
		public TerminalNode Abstract() { return getToken(PHPParser.Abstract, 0); }
		public TerminalNode Array() { return getToken(PHPParser.Array, 0); }
		public TerminalNode As() { return getToken(PHPParser.As, 0); }
		public TerminalNode BinaryCast() { return getToken(PHPParser.BinaryCast, 0); }
		public TerminalNode BoolType() { return getToken(PHPParser.BoolType, 0); }
		public TerminalNode BooleanConstant() { return getToken(PHPParser.BooleanConstant, 0); }
		public TerminalNode Break() { return getToken(PHPParser.Break, 0); }
		public TerminalNode Callable() { return getToken(PHPParser.Callable, 0); }
		public TerminalNode Case() { return getToken(PHPParser.Case, 0); }
		public TerminalNode Catch() { return getToken(PHPParser.Catch, 0); }
		public TerminalNode Class() { return getToken(PHPParser.Class, 0); }
		public TerminalNode Clone() { return getToken(PHPParser.Clone, 0); }
		public TerminalNode Const() { return getToken(PHPParser.Const, 0); }
		public TerminalNode Continue() { return getToken(PHPParser.Continue, 0); }
		public TerminalNode Declare() { return getToken(PHPParser.Declare, 0); }
		public TerminalNode Default() { return getToken(PHPParser.Default, 0); }
		public TerminalNode Do() { return getToken(PHPParser.Do, 0); }
		public TerminalNode DoubleCast() { return getToken(PHPParser.DoubleCast, 0); }
		public TerminalNode DoubleType() { return getToken(PHPParser.DoubleType, 0); }
		public TerminalNode Echo() { return getToken(PHPParser.Echo, 0); }
		public TerminalNode Else() { return getToken(PHPParser.Else, 0); }
		public TerminalNode ElseIf() { return getToken(PHPParser.ElseIf, 0); }
		public TerminalNode Empty() { return getToken(PHPParser.Empty, 0); }
		public TerminalNode EndDeclare() { return getToken(PHPParser.EndDeclare, 0); }
		public TerminalNode EndFor() { return getToken(PHPParser.EndFor, 0); }
		public TerminalNode EndForeach() { return getToken(PHPParser.EndForeach, 0); }
		public TerminalNode EndIf() { return getToken(PHPParser.EndIf, 0); }
		public TerminalNode EndSwitch() { return getToken(PHPParser.EndSwitch, 0); }
		public TerminalNode EndWhile() { return getToken(PHPParser.EndWhile, 0); }
		public TerminalNode Eval() { return getToken(PHPParser.Eval, 0); }
		public TerminalNode Exit() { return getToken(PHPParser.Exit, 0); }
		public TerminalNode Extends() { return getToken(PHPParser.Extends, 0); }
		public TerminalNode Final() { return getToken(PHPParser.Final, 0); }
		public TerminalNode Finally() { return getToken(PHPParser.Finally, 0); }
		public TerminalNode FloatCast() { return getToken(PHPParser.FloatCast, 0); }
		public TerminalNode For() { return getToken(PHPParser.For, 0); }
		public TerminalNode Foreach() { return getToken(PHPParser.Foreach, 0); }
		public TerminalNode Function() { return getToken(PHPParser.Function, 0); }
		public TerminalNode Global() { return getToken(PHPParser.Global, 0); }
		public TerminalNode Goto() { return getToken(PHPParser.Goto, 0); }
		public TerminalNode If() { return getToken(PHPParser.If, 0); }
		public TerminalNode Implements() { return getToken(PHPParser.Implements, 0); }
		public TerminalNode Import() { return getToken(PHPParser.Import, 0); }
		public TerminalNode Include() { return getToken(PHPParser.Include, 0); }
		public TerminalNode IncludeOnce() { return getToken(PHPParser.IncludeOnce, 0); }
		public TerminalNode InstanceOf() { return getToken(PHPParser.InstanceOf, 0); }
		public TerminalNode InsteadOf() { return getToken(PHPParser.InsteadOf, 0); }
		public TerminalNode Int16Cast() { return getToken(PHPParser.Int16Cast, 0); }
		public TerminalNode Int64Type() { return getToken(PHPParser.Int64Type, 0); }
		public TerminalNode Int8Cast() { return getToken(PHPParser.Int8Cast, 0); }
		public TerminalNode Interface() { return getToken(PHPParser.Interface, 0); }
		public TerminalNode IntType() { return getToken(PHPParser.IntType, 0); }
		public TerminalNode IsSet() { return getToken(PHPParser.IsSet, 0); }
		public TerminalNode List() { return getToken(PHPParser.List, 0); }
		public TerminalNode LogicalAnd() { return getToken(PHPParser.LogicalAnd, 0); }
		public TerminalNode LogicalOr() { return getToken(PHPParser.LogicalOr, 0); }
		public TerminalNode LogicalXor() { return getToken(PHPParser.LogicalXor, 0); }
		public TerminalNode Namespace() { return getToken(PHPParser.Namespace, 0); }
		public TerminalNode New() { return getToken(PHPParser.New, 0); }
		public TerminalNode Null() { return getToken(PHPParser.Null, 0); }
		public TerminalNode ObjectType() { return getToken(PHPParser.ObjectType, 0); }
		public TerminalNode Parent_() { return getToken(PHPParser.Parent_, 0); }
		public TerminalNode Partial() { return getToken(PHPParser.Partial, 0); }
		public TerminalNode Print() { return getToken(PHPParser.Print, 0); }
		public TerminalNode Private() { return getToken(PHPParser.Private, 0); }
		public TerminalNode Protected() { return getToken(PHPParser.Protected, 0); }
		public TerminalNode Public() { return getToken(PHPParser.Public, 0); }
		public TerminalNode Require() { return getToken(PHPParser.Require, 0); }
		public TerminalNode RequireOnce() { return getToken(PHPParser.RequireOnce, 0); }
		public TerminalNode Resource() { return getToken(PHPParser.Resource, 0); }
		public TerminalNode Return() { return getToken(PHPParser.Return, 0); }
		public TerminalNode Static() { return getToken(PHPParser.Static, 0); }
		public TerminalNode StringType() { return getToken(PHPParser.StringType, 0); }
		public TerminalNode Switch() { return getToken(PHPParser.Switch, 0); }
		public TerminalNode Throw() { return getToken(PHPParser.Throw, 0); }
		public TerminalNode Trait() { return getToken(PHPParser.Trait, 0); }
		public TerminalNode Try() { return getToken(PHPParser.Try, 0); }
		public TerminalNode Typeof() { return getToken(PHPParser.Typeof, 0); }
		public TerminalNode UintCast() { return getToken(PHPParser.UintCast, 0); }
		public TerminalNode UnicodeCast() { return getToken(PHPParser.UnicodeCast, 0); }
		public TerminalNode Unset() { return getToken(PHPParser.Unset, 0); }
		public TerminalNode Use() { return getToken(PHPParser.Use, 0); }
		public TerminalNode Var() { return getToken(PHPParser.Var, 0); }
		public TerminalNode While() { return getToken(PHPParser.While, 0); }
		public TerminalNode Yield() { return getToken(PHPParser.Yield, 0); }
		public TerminalNode Get() { return getToken(PHPParser.Get, 0); }
		public TerminalNode Set() { return getToken(PHPParser.Set, 0); }
		public TerminalNode Call() { return getToken(PHPParser.Call, 0); }
		public TerminalNode CallStatic() { return getToken(PHPParser.CallStatic, 0); }
		public TerminalNode Constructor() { return getToken(PHPParser.Constructor, 0); }
		public TerminalNode Destruct() { return getToken(PHPParser.Destruct, 0); }
		public TerminalNode Wakeup() { return getToken(PHPParser.Wakeup, 0); }
		public TerminalNode Sleep() { return getToken(PHPParser.Sleep, 0); }
		public TerminalNode Autoload() { return getToken(PHPParser.Autoload, 0); }
		public TerminalNode IsSet__() { return getToken(PHPParser.IsSet__, 0); }
		public TerminalNode Unset__() { return getToken(PHPParser.Unset__, 0); }
		public TerminalNode ToString__() { return getToken(PHPParser.ToString__, 0); }
		public TerminalNode Invoke() { return getToken(PHPParser.Invoke, 0); }
		public TerminalNode SetState() { return getToken(PHPParser.SetState, 0); }
		public TerminalNode Clone__() { return getToken(PHPParser.Clone__, 0); }
		public TerminalNode DebugInfo() { return getToken(PHPParser.DebugInfo, 0); }
		public TerminalNode Namespace__() { return getToken(PHPParser.Namespace__, 0); }
		public TerminalNode Class__() { return getToken(PHPParser.Class__, 0); }
		public TerminalNode Traic__() { return getToken(PHPParser.Traic__, 0); }
		public TerminalNode Function__() { return getToken(PHPParser.Function__, 0); }
		public TerminalNode Method__() { return getToken(PHPParser.Method__, 0); }
		public TerminalNode Line__() { return getToken(PHPParser.Line__, 0); }
		public TerminalNode File__() { return getToken(PHPParser.File__, 0); }
		public TerminalNode Dir__() { return getToken(PHPParser.Dir__, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			_la = _input.LA(1);
			if ( !(((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || _la==Label) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberModifierContext extends ParserRuleContext {
		public TerminalNode Public() { return getToken(PHPParser.Public, 0); }
		public TerminalNode Protected() { return getToken(PHPParser.Protected, 0); }
		public TerminalNode Private() { return getToken(PHPParser.Private, 0); }
		public TerminalNode Static() { return getToken(PHPParser.Static, 0); }
		public TerminalNode Abstract() { return getToken(PHPParser.Abstract, 0); }
		public TerminalNode Final() { return getToken(PHPParser.Final, 0); }
		public MemberModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterMemberModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitMemberModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitMemberModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberModifierContext memberModifier() throws RecognitionException {
		MemberModifierContext _localctx = new MemberModifierContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_memberModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			_la = _input.LA(1);
			if ( !(_la==Abstract || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Final - 72)) | (1L << (Private - 72)) | (1L << (Protected - 72)) | (1L << (Public - 72)) | (1L << (Static - 72)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MagicConstantContext extends ParserRuleContext {
		public TerminalNode Namespace__() { return getToken(PHPParser.Namespace__, 0); }
		public TerminalNode Class__() { return getToken(PHPParser.Class__, 0); }
		public TerminalNode Traic__() { return getToken(PHPParser.Traic__, 0); }
		public TerminalNode Function__() { return getToken(PHPParser.Function__, 0); }
		public TerminalNode Method__() { return getToken(PHPParser.Method__, 0); }
		public TerminalNode Line__() { return getToken(PHPParser.Line__, 0); }
		public TerminalNode File__() { return getToken(PHPParser.File__, 0); }
		public TerminalNode Dir__() { return getToken(PHPParser.Dir__, 0); }
		public MagicConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magicConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterMagicConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitMagicConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitMagicConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MagicConstantContext magicConstant() throws RecognitionException {
		MagicConstantContext _localctx = new MagicConstantContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_magicConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			_la = _input.LA(1);
			if ( !(((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (Namespace__ - 141)) | (1L << (Class__ - 141)) | (1L << (Traic__ - 141)) | (1L << (Function__ - 141)) | (1L << (Method__ - 141)) | (1L << (Line__ - 141)) | (1L << (File__ - 141)) | (1L << (Dir__ - 141)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MagicMethodContext extends ParserRuleContext {
		public TerminalNode Get() { return getToken(PHPParser.Get, 0); }
		public TerminalNode Set() { return getToken(PHPParser.Set, 0); }
		public TerminalNode Call() { return getToken(PHPParser.Call, 0); }
		public TerminalNode CallStatic() { return getToken(PHPParser.CallStatic, 0); }
		public TerminalNode Constructor() { return getToken(PHPParser.Constructor, 0); }
		public TerminalNode Destruct() { return getToken(PHPParser.Destruct, 0); }
		public TerminalNode Wakeup() { return getToken(PHPParser.Wakeup, 0); }
		public TerminalNode Sleep() { return getToken(PHPParser.Sleep, 0); }
		public TerminalNode Autoload() { return getToken(PHPParser.Autoload, 0); }
		public TerminalNode IsSet__() { return getToken(PHPParser.IsSet__, 0); }
		public TerminalNode Unset__() { return getToken(PHPParser.Unset__, 0); }
		public TerminalNode ToString__() { return getToken(PHPParser.ToString__, 0); }
		public TerminalNode Invoke() { return getToken(PHPParser.Invoke, 0); }
		public TerminalNode SetState() { return getToken(PHPParser.SetState, 0); }
		public TerminalNode Clone__() { return getToken(PHPParser.Clone__, 0); }
		public TerminalNode DebugInfo() { return getToken(PHPParser.DebugInfo, 0); }
		public MagicMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magicMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterMagicMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitMagicMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitMagicMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MagicMethodContext magicMethod() throws RecognitionException {
		MagicMethodContext _localctx = new MagicMethodContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_magicMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
			_la = _input.LA(1);
			if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (Get - 125)) | (1L << (Set - 125)) | (1L << (Call - 125)) | (1L << (CallStatic - 125)) | (1L << (Constructor - 125)) | (1L << (Destruct - 125)) | (1L << (Wakeup - 125)) | (1L << (Sleep - 125)) | (1L << (Autoload - 125)) | (1L << (IsSet__ - 125)) | (1L << (Unset__ - 125)) | (1L << (ToString__ - 125)) | (1L << (Invoke - 125)) | (1L << (SetState - 125)) | (1L << (Clone__ - 125)) | (1L << (DebugInfo - 125)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BoolType() { return getToken(PHPParser.BoolType, 0); }
		public TerminalNode IntType() { return getToken(PHPParser.IntType, 0); }
		public TerminalNode Int64Type() { return getToken(PHPParser.Int64Type, 0); }
		public TerminalNode DoubleType() { return getToken(PHPParser.DoubleType, 0); }
		public TerminalNode StringType() { return getToken(PHPParser.StringType, 0); }
		public TerminalNode Resource() { return getToken(PHPParser.Resource, 0); }
		public TerminalNode ObjectType() { return getToken(PHPParser.ObjectType, 0); }
		public TerminalNode Array() { return getToken(PHPParser.Array, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Array) | (1L << BoolType) | (1L << DoubleType))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (Int64Type - 89)) | (1L << (IntType - 89)) | (1L << (ObjectType - 89)) | (1L << (Resource - 89)) | (1L << (StringType - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastOperationContext extends ParserRuleContext {
		public TerminalNode BoolType() { return getToken(PHPParser.BoolType, 0); }
		public TerminalNode Int8Cast() { return getToken(PHPParser.Int8Cast, 0); }
		public TerminalNode Int16Cast() { return getToken(PHPParser.Int16Cast, 0); }
		public TerminalNode IntType() { return getToken(PHPParser.IntType, 0); }
		public TerminalNode Int64Type() { return getToken(PHPParser.Int64Type, 0); }
		public TerminalNode UintCast() { return getToken(PHPParser.UintCast, 0); }
		public TerminalNode DoubleCast() { return getToken(PHPParser.DoubleCast, 0); }
		public TerminalNode DoubleType() { return getToken(PHPParser.DoubleType, 0); }
		public TerminalNode FloatCast() { return getToken(PHPParser.FloatCast, 0); }
		public TerminalNode StringType() { return getToken(PHPParser.StringType, 0); }
		public TerminalNode BinaryCast() { return getToken(PHPParser.BinaryCast, 0); }
		public TerminalNode UnicodeCast() { return getToken(PHPParser.UnicodeCast, 0); }
		public TerminalNode Array() { return getToken(PHPParser.Array, 0); }
		public TerminalNode ObjectType() { return getToken(PHPParser.ObjectType, 0); }
		public TerminalNode Resource() { return getToken(PHPParser.Resource, 0); }
		public TerminalNode Unset() { return getToken(PHPParser.Unset, 0); }
		public CastOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterCastOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitCastOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHPParserVisitor ) return ((PHPParserVisitor<? extends T>)visitor).visitCastOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastOperationContext castOperation() throws RecognitionException {
		CastOperationContext _localctx = new CastOperationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_castOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Array) | (1L << BinaryCast) | (1L << BoolType) | (1L << DoubleCast) | (1L << DoubleType))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (FloatCast - 74)) | (1L << (Int8Cast - 74)) | (1L << (Int16Cast - 74)) | (1L << (Int64Type - 74)) | (1L << (IntType - 74)) | (1L << (ObjectType - 74)) | (1L << (Resource - 74)) | (1L << (StringType - 74)) | (1L << (UintCast - 74)) | (1L << (UnicodeCast - 74)) | (1L << (Unset - 74)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 83:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 84:
			return andOrExpression_sempred((AndOrExpressionContext)_localctx, predIndex);
		case 85:
			return comparisonExpression_sempred((ComparisonExpressionContext)_localctx, predIndex);
		case 86:
			return additionExpression_sempred((AdditionExpressionContext)_localctx, predIndex);
		case 87:
			return multiplicationExpression_sempred((MultiplicationExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andOrExpression_sempred(AndOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean comparisonExpression_sempred(ComparisonExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additionExpression_sempred(AdditionExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicationExpression_sempred(MultiplicationExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00e5\u0669\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\3\2\5\2\u0110\n\2\3\2\7\2\u0113"+
		"\n\2\f\2\16\2\u0116\13\2\3\2\3\2\3\3\3\3\3\3\5\3\u011d\n\3\3\4\3\4\3\5"+
		"\6\5\u0122\n\5\r\5\16\5\u0123\3\6\7\6\u0127\n\6\f\6\16\6\u012a\13\6\3"+
		"\6\6\6\u012d\n\6\r\6\16\6\u012e\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u013d\n\b\3\t\3\t\5\t\u0141\n\t\3\t\3\t\3\t\3\n\5\n\u0147"+
		"\n\n\3\n\3\n\3\n\5\n\u014c\n\n\3\n\7\n\u014f\n\n\f\n\16\n\u0152\13\n\3"+
		"\13\3\13\3\13\5\13\u0157\n\13\3\f\3\f\5\f\u015b\n\f\3\f\3\f\7\f\u015f"+
		"\n\f\f\f\16\f\u0162\13\f\3\f\3\f\3\f\3\f\5\f\u0168\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u016f\n\r\3\16\3\16\3\16\5\16\u0174\n\16\3\16\3\16\5\16\u0178"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u0181\n\17\3\17\5\17\u0184"+
		"\n\17\3\17\5\17\u0187\n\17\3\17\3\17\3\17\5\17\u018c\n\17\3\17\3\17\5"+
		"\17\u0190\n\17\3\17\3\17\5\17\u0194\n\17\3\17\3\17\3\17\5\17\u0199\n\17"+
		"\3\17\3\17\5\17\u019d\n\17\5\17\u019f\n\17\3\17\3\17\7\17\u01a3\n\17\f"+
		"\17\16\17\u01a6\13\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21\u01af\n"+
		"\21\f\21\16\21\u01b2\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u01c2\n\22\3\23\3\23\3\23\7\23\u01c7\n"+
		"\23\f\23\16\23\u01ca\13\23\3\24\3\24\3\24\7\24\u01cf\n\24\f\24\16\24\u01d2"+
		"\13\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u01dc\n\26\3\27\3"+
		"\27\3\27\3\27\7\27\u01e2\n\27\f\27\16\27\u01e5\13\27\3\27\3\27\3\30\7"+
		"\30\u01ea\n\30\f\30\16\30\u01ed\13\30\3\31\3\31\3\31\3\31\5\31\u01f3\n"+
		"\31\3\31\3\31\3\31\7\31\u01f8\n\31\f\31\16\31\u01fb\13\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u0211\n\32\3\33\3\33\3\33\7\33\u0216\n\33\f\33"+
		"\16\33\u0219\13\33\3\34\3\34\3\34\7\34\u021e\n\34\f\34\16\34\u0221\13"+
		"\34\3\35\3\35\3\35\3\35\3\36\7\36\u0228\n\36\f\36\16\36\u022b\13\36\3"+
		"\37\3\37\3\37\5\37\u0230\n\37\3 \3 \5 \u0234\n \3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\5\"\u0253\n\"\3#\3#\3#\3#\3$\3$\3$\3$\7$\u025d"+
		"\n$\f$\16$\u0260\13$\3$\5$\u0263\n$\3$\3$\3$\3$\3$\7$\u026a\n$\f$\16$"+
		"\u026d\13$\3$\5$\u0270\n$\3$\3$\3$\5$\u0275\n$\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u028f\n)\3*\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\5+\u029a\n+\3+\3+\5+\u029e\n+\3+\3+\5+\u02a2\n"+
		"+\3+\3+\3+\3+\3+\3+\3+\5+\u02ab\n+\3,\3,\3-\3-\3.\3.\3.\3.\5.\u02b5\n"+
		".\3.\7.\u02b8\n.\f.\16.\u02bb\13.\3.\3.\3.\5.\u02c0\n.\3.\7.\u02c3\n."+
		"\f.\16.\u02c6\13.\3.\3.\5.\u02ca\n.\3/\3/\3/\5/\u02cf\n/\3/\6/\u02d2\n"+
		"/\r/\16/\u02d3\3/\3/\3\60\3\60\5\60\u02da\n\60\3\60\3\60\3\61\3\61\5\61"+
		"\u02e0\n\61\3\61\3\61\3\62\3\62\5\62\u02e6\n\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u02f6\n\64\5\64"+
		"\u02f8\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u0305\n\66\3\66\3\66\3\66\5\66\u030a\n\66\3\66\5\66\u030d\n\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0317\n\66\3\66\5\66\u031a\n\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0327\n\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u032f\n\66\3\67\3\67\3\67\6\67\u0334"+
		"\n\67\r\67\16\67\u0335\3\67\5\67\u0339\n\67\3\67\7\67\u033c\n\67\f\67"+
		"\16\67\u033f\13\67\3\67\5\67\u0342\n\67\38\38\38\38\38\38\38\39\39\39"+
		"\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0360\n<\3="+
		"\3=\6=\u0364\n=\r=\16=\u0365\3>\3>\3>\7>\u036b\n>\f>\16>\u036e\13>\3?"+
		"\5?\u0371\n?\3?\3?\7?\u0375\n?\f?\16?\u0378\13?\3@\3@\5@\u037c\n@\3@\5"+
		"@\u037f\n@\3@\5@\u0382\n@\3@\3@\3A\3A\3A\5A\u0389\nA\3B\3B\3B\3B\7B\u038f"+
		"\nB\fB\16B\u0392\13B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\5C\u039e\nC\3D\3D\3"+
		"D\3D\3E\3E\3E\3E\7E\u03a8\nE\fE\16E\u03ab\13E\3E\3E\3F\3F\3F\3F\3F\7F"+
		"\u03b4\nF\fF\16F\u03b7\13F\3F\3F\3F\3F\3F\3F\3F\7F\u03c0\nF\fF\16F\u03c3"+
		"\13F\3F\3F\3F\3F\5F\u03c9\nF\3F\3F\5F\u03cd\nF\3F\3F\5F\u03d1\nF\3F\3"+
		"F\3F\3F\5F\u03d7\nF\3F\3F\3F\3F\3F\3F\5F\u03df\nF\3G\3G\3G\7G\u03e4\n"+
		"G\fG\16G\u03e7\13G\3G\5G\u03ea\nG\3H\3H\5H\u03ee\nH\3I\3I\3I\3I\3I\3I"+
		"\3I\3J\3J\3J\3J\5J\u03fb\nJ\3J\5J\u03fe\nJ\3J\3J\3K\3K\3K\5K\u0405\nK"+
		"\3K\3K\3L\3L\3L\3L\3M\3M\5M\u040f\nM\3N\3N\5N\u0413\nN\3O\6O\u0416\nO"+
		"\rO\16O\u0417\3P\3P\3P\5P\u041d\nP\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\7R\u0428"+
		"\nR\fR\16R\u042b\13R\3R\3R\3S\3S\3S\7S\u0432\nS\fS\16S\u0435\13S\3T\3"+
		"T\3T\5T\u043a\nT\3T\3T\3U\3U\3U\3U\3U\3U\5U\u0444\nU\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\7U\u0451\nU\fU\16U\u0454\13U\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\7V\u0468\nV\fV\16V\u046b\13V\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\7W\u0479\nW\fW\16W\u047c\13W\3X\3X\3X\3X\3X"+
		"\3X\7X\u0484\nX\fX\16X\u0487\13X\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u048f\nY\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\7Y\u0497\nY\fY\16Y\u049a\13Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\5Z\u04bd\nZ\3Z\3Z\3Z\5Z\u04c2\nZ\3Z\5Z\u04c5\nZ\3Z\3Z\3Z\3Z\5Z\u04cb"+
		"\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\5Z\u04e8\nZ\3Z\3Z\3Z\3Z\3Z\5Z\u04ef\nZ\3Z\3Z\5Z\u04f3"+
		"\nZ\3Z\3Z\3Z\3Z\5Z\u04f9\nZ\3Z\3Z\5Z\u04fd\nZ\3[\3[\3[\5[\u0502\n[\3\\"+
		"\3\\\3]\3]\3]\3]\5]\u050a\n]\3^\3^\3^\7^\u050f\n^\f^\16^\u0512\13^\3^"+
		"\5^\u0515\n^\3_\3_\3_\5_\u051a\n_\3_\3_\3_\5_\u051f\n_\3_\3_\5_\u0523"+
		"\n_\3`\3`\3`\3`\3`\7`\u052a\n`\f`\16`\u052d\13`\3`\3`\3a\5a\u0532\na\3"+
		"a\3a\3b\3b\5b\u0538\nb\3b\5b\u053b\nb\3c\3c\5c\u053f\nc\3c\5c\u0542\n"+
		"c\3c\3c\5c\u0546\nc\3d\3d\3d\7d\u054b\nd\fd\16d\u054e\13d\3e\5e\u0551"+
		"\ne\3e\5e\u0554\ne\3e\3e\3f\3f\3f\7f\u055b\nf\ff\16f\u055e\13f\3g\3g\3"+
		"g\7g\u0563\ng\fg\16g\u0566\13g\3h\3h\3h\3h\7h\u056c\nh\fh\16h\u056f\13"+
		"h\3h\5h\u0572\nh\3h\3h\3i\5i\u0577\ni\3i\3i\3i\5i\u057c\ni\3j\3j\3j\3"+
		"j\3j\3j\5j\u0584\nj\5j\u0586\nj\3j\3j\3j\3j\5j\u058c\nj\5j\u058e\nj\3"+
		"j\3j\3j\5j\u0593\nj\3k\3k\3k\7k\u0598\nk\fk\16k\u059b\13k\3l\3l\3l\5l"+
		"\u05a0\nl\3m\3m\3m\3m\3m\5m\u05a7\nm\3n\3n\3n\3n\5n\u05ad\nn\3o\3o\3p"+
		"\3p\3p\3p\3p\3p\5p\u05b7\np\3p\3p\5p\u05bb\np\3p\3p\3p\5p\u05c0\np\3q"+
		"\3q\3r\3r\6r\u05c6\nr\rr\16r\u05c7\3r\3r\6r\u05cc\nr\rr\16r\u05cd\3r\3"+
		"r\3r\7r\u05d3\nr\fr\16r\u05d6\13r\3r\5r\u05d9\nr\3s\3s\5s\u05dd\ns\3t"+
		"\3t\3t\7t\u05e2\nt\ft\16t\u05e5\13t\3u\3u\3u\3u\3u\3u\5u\u05ed\nu\3u\7"+
		"u\u05f0\nu\fu\16u\u05f3\13u\3v\3v\3v\5v\u05f8\nv\3w\3w\3w\3x\3x\3x\5x"+
		"\u0600\nx\3y\5y\u0603\ny\3y\3y\7y\u0607\ny\fy\16y\u060a\13y\3z\3z\3z\5"+
		"z\u060f\nz\3z\3z\3z\3z\5z\u0615\nz\3{\3{\5{\u0619\n{\3|\3|\3|\3|\3|\5"+
		"|\u0620\n|\3|\7|\u0623\n|\f|\16|\u0626\13|\3}\7}\u0629\n}\f}\16}\u062c"+
		"\13}\3}\3}\3}\3}\3}\3}\5}\u0634\n}\3}\7}\u0637\n}\f}\16}\u063a\13}\3~"+
		"\3~\5~\u063e\n~\3~\3~\3~\3~\3~\5~\u0645\n~\3\177\5\177\u0648\n\177\3\177"+
		"\3\177\5\177\u064c\n\177\7\177\u064e\n\177\f\177\16\177\u0651\13\177\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0659\n\u0080\3"+
		"\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085"+
		"\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\2\7\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u0088\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\2\33\13\2\4\4\6\7\t\n\16\25"+
		"\27\27\32\33\36\37\"\"$$\4\2\66\66OO\4\2\64\64uu\3\2\u00ce\u00cf\3\2\u00b1"+
		"\u00b2\4\2\u00a0\u00a1\u00b7\u00b8\3\2\u009c\u009f\4\2\u00bd\u00be\u00c5"+
		"\u00c5\3\2\u00bf\u00c1\3\2\u00c2\u00c3\4\2\u00bb\u00bb\u00bd\u00be\3\2"+
		"\u009a\u009b\3\2UV\3\2mn\5\2\u00a2\u00a4\u00a6\u00ae\u00d0\u00d0\3\2\u00bd"+
		"\u00be\4\2\u00d5\u00d6\u00d8\u00d9\4\2\64\64gg\4\2**JJ\4\2*\u0096\u00d4"+
		"\u00d4\6\2**JJjlqq\3\2\u008f\u0096\3\2\177\u008e\t\2++..<<[\\ffoorr\13"+
		"\2++-.;<LLY\\ffoorrxz\u06f6\2\u010f\3\2\2\2\4\u011c\3\2\2\2\6\u011e\3"+
		"\2\2\2\b\u0121\3\2\2\2\n\u0128\3\2\2\2\f\u0130\3\2\2\2\16\u013c\3\2\2"+
		"\2\20\u013e\3\2\2\2\22\u0146\3\2\2\2\24\u0153\3\2\2\2\26\u0158\3\2\2\2"+
		"\30\u016e\3\2\2\2\32\u0170\3\2\2\2\34\u017e\3\2\2\2\36\u01a9\3\2\2\2 "+
		"\u01ab\3\2\2\2\"\u01c1\3\2\2\2$\u01c3\3\2\2\2&\u01cb\3\2\2\2(\u01d3\3"+
		"\2\2\2*\u01d6\3\2\2\2,\u01dd\3\2\2\2.\u01eb\3\2\2\2\60\u01ee\3\2\2\2\62"+
		"\u0210\3\2\2\2\64\u0212\3\2\2\2\66\u021a\3\2\2\28\u0222\3\2\2\2:\u0229"+
		"\3\2\2\2<\u022f\3\2\2\2>\u0233\3\2\2\2@\u0235\3\2\2\2B\u0252\3\2\2\2D"+
		"\u0254\3\2\2\2F\u0274\3\2\2\2H\u0276\3\2\2\2J\u027a\3\2\2\2L\u027f\3\2"+
		"\2\2N\u0282\3\2\2\2P\u0286\3\2\2\2R\u0290\3\2\2\2T\u0296\3\2\2\2V\u02ac"+
		"\3\2\2\2X\u02ae\3\2\2\2Z\u02b0\3\2\2\2\\\u02d1\3\2\2\2^\u02d7\3\2\2\2"+
		"`\u02dd\3\2\2\2b\u02e3\3\2\2\2d\u02e9\3\2\2\2f\u02f7\3\2\2\2h\u02f9\3"+
		"\2\2\2j\u02ff\3\2\2\2l\u0330\3\2\2\2n\u0343\3\2\2\2p\u034a\3\2\2\2r\u034d"+
		"\3\2\2\2t\u0351\3\2\2\2v\u0355\3\2\2\2x\u0363\3\2\2\2z\u0367\3\2\2\2|"+
		"\u0370\3\2\2\2~\u0379\3\2\2\2\u0080\u0388\3\2\2\2\u0082\u038a\3\2\2\2"+
		"\u0084\u039d\3\2\2\2\u0086\u039f\3\2\2\2\u0088\u03a3\3\2\2\2\u008a\u03de"+
		"\3\2\2\2\u008c\u03e9\3\2\2\2\u008e\u03ed\3\2\2\2\u0090\u03ef\3\2\2\2\u0092"+
		"\u03f6\3\2\2\2\u0094\u0404\3\2\2\2\u0096\u0408\3\2\2\2\u0098\u040e\3\2"+
		"\2\2\u009a\u0412\3\2\2\2\u009c\u0415\3\2\2\2\u009e\u0419\3\2\2\2\u00a0"+
		"\u041e\3\2\2\2\u00a2\u0422\3\2\2\2\u00a4\u042e\3\2\2\2\u00a6\u0436\3\2"+
		"\2\2\u00a8\u043d\3\2\2\2\u00aa\u0455\3\2\2\2\u00ac\u046c\3\2\2\2\u00ae"+
		"\u047d\3\2\2\2\u00b0\u048e\3\2\2\2\u00b2\u04fc\3\2\2\2\u00b4\u04fe\3\2"+
		"\2\2\u00b6\u0503\3\2\2\2\u00b8\u0505\3\2\2\2\u00ba\u050b\3\2\2\2\u00bc"+
		"\u0522\3\2\2\2\u00be\u0524\3\2\2\2\u00c0\u0531\3\2\2\2\u00c2\u053a\3\2"+
		"\2\2\u00c4\u0545\3\2\2\2\u00c6\u0547\3\2\2\2\u00c8\u0550\3\2\2\2\u00ca"+
		"\u0557\3\2\2\2\u00cc\u055f\3\2\2\2\u00ce\u0567\3\2\2\2\u00d0\u057b\3\2"+
		"\2\2\u00d2\u0592\3\2\2\2\u00d4\u0594\3\2\2\2\u00d6\u059c\3\2\2\2\u00d8"+
		"\u05a6\3\2\2\2\u00da\u05ac\3\2\2\2\u00dc\u05ae\3\2\2\2\u00de\u05bf\3\2"+
		"\2\2\u00e0\u05c1\3\2\2\2\u00e2\u05d8\3\2\2\2\u00e4\u05dc\3\2\2\2\u00e6"+
		"\u05de\3\2\2\2\u00e8\u05ec\3\2\2\2\u00ea\u05f4\3\2\2\2\u00ec\u05f9\3\2"+
		"\2\2\u00ee\u05ff\3\2\2\2\u00f0\u0602\3\2\2\2\u00f2\u0614\3\2\2\2\u00f4"+
		"\u0618\3\2\2\2\u00f6\u061f\3\2\2\2\u00f8\u062a\3\2\2\2\u00fa\u0644\3\2"+
		"\2\2\u00fc\u0647\3\2\2\2\u00fe\u0658\3\2\2\2\u0100\u065a\3\2\2\2\u0102"+
		"\u065c\3\2\2\2\u0104\u065e\3\2\2\2\u0106\u0660\3\2\2\2\u0108\u0662\3\2"+
		"\2\2\u010a\u0664\3\2\2\2\u010c\u0666\3\2\2\2\u010e\u0110\7\13\2\2\u010f"+
		"\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0114\3\2\2\2\u0111\u0113\5\4"+
		"\3\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7\2"+
		"\2\3\u0118\3\3\2\2\2\u0119\u011d\5\6\4\2\u011a\u011d\5\n\6\2\u011b\u011d"+
		"\5\b\5\2\u011c\u0119\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d"+
		"\5\3\2\2\2\u011e\u011f\t\2\2\2\u011f\7\3\2\2\2\u0120\u0122\7!\2\2\u0121"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\t\3\2\2\2\u0125\u0127\5\f\7\2\u0126\u0125\3\2\2\2\u0127\u012a"+
		"\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012d\5\16\b\2\u012c\u012b\3\2\2\2\u012d\u012e\3"+
		"\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\13\3\2\2\2\u0130"+
		"\u0131\7T\2\2\u0131\u0132\7c\2\2\u0132\u0133\5\u00caf\2\u0133\u0134\7"+
		"\u00cf\2\2\u0134\r\3\2\2\2\u0135\u013d\5@!\2\u0136\u013d\5B\"\2\u0137"+
		"\u013d\5\20\t\2\u0138\u013d\5\26\f\2\u0139\u013d\5\32\16\2\u013a\u013d"+
		"\5\34\17\2\u013b\u013d\5\u00a2R\2\u013c\u0135\3\2\2\2\u013c\u0136\3\2"+
		"\2\2\u013c\u0137\3\2\2\2\u013c\u0138\3\2\2\2\u013c\u0139\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d\17\3\2\2\2\u013e\u0140\7{\2\2"+
		"\u013f\u0141\t\3\2\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\u0143\5\22\n\2\u0143\u0144\7\u00cf\2\2\u0144\21\3\2\2\2"+
		"\u0145\u0147\7\u00b5\2\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0150\5\24\13\2\u0149\u014b\7\u00cd\2\2\u014a\u014c"+
		"\7\u00b5\2\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2"+
		"\2\u014d\u014f\5\24\13\2\u014e\u0149\3\2\2\2\u014f\u0152\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\23\3\2\2\2\u0152\u0150\3\2\2"+
		"\2\u0153\u0156\5\u00caf\2\u0154\u0155\7,\2\2\u0155\u0157\5\u0102\u0082"+
		"\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\25\3\2\2\2\u0158\u0167"+
		"\7c\2\2\u0159\u015b\5\u00caf\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2"+
		"\u015b\u015c\3\2\2\2\u015c\u0160\7\u00cb\2\2\u015d\u015f\5\30\r\2\u015e"+
		"\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0168\7\u00cc\2\2\u0164"+
		"\u0165\5\u00caf\2\u0165\u0166\7\u00cf\2\2\u0166\u0168\3\2\2\2\u0167\u015a"+
		"\3\2\2\2\u0167\u0164\3\2\2\2\u0168\27\3\2\2\2\u0169\u016f\5B\"\2\u016a"+
		"\u016f\5\20\t\2\u016b\u016f\5\32\16\2\u016c\u016f\5\34\17\2\u016d\u016f"+
		"\5\u00a2R\2\u016e\u0169\3\2\2\2\u016e\u016a\3\2\2\2\u016e\u016b\3\2\2"+
		"\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016f\31\3\2\2\2\u0170\u0171"+
		"\5.\30\2\u0171\u0173\7O\2\2\u0172\u0174\7\u00b9\2\2\u0173\u0172\3\2\2"+
		"\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\5\u0102\u0082\2"+
		"\u0176\u0178\5\"\22\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179\u017a\7\u00c7\2\2\u017a\u017b\5|?\2\u017b\u017c\7\u00c8"+
		"\2\2\u017c\u017d\5D#\2\u017d\33\3\2\2\2\u017e\u0180\5.\30\2\u017f\u0181"+
		"\7j\2\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182"+
		"\u0184\5\u0100\u0081\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186"+
		"\3\2\2\2\u0185\u0187\7h\2\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u019e\3\2\2\2\u0188\u0189\5\36\20\2\u0189\u018b\5\u0102\u0082\2\u018a"+
		"\u018c\5\"\22\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018f\3"+
		"\2\2\2\u018d\u018e\7I\2\2\u018e\u0190\5\u00c2b\2\u018f\u018d\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u0192\7S\2\2\u0192\u0194\5 \21"+
		"\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u019f\3\2\2\2\u0195\u0196"+
		"\7]\2\2\u0196\u0198\5\u0102\u0082\2\u0197\u0199\5\"\22\2\u0198\u0197\3"+
		"\2\2\2\u0198\u0199\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u019b\7I\2\2\u019b"+
		"\u019d\5 \21\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2"+
		"\2\2\u019e\u0188\3\2\2\2\u019e\u0195\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a4\7\u00cb\2\2\u01a1\u01a3\5\u008aF\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6"+
		"\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a7\u01a8\7\u00cc\2\2\u01a8\35\3\2\2\2\u01a9\u01aa\t"+
		"\4\2\2\u01aa\37\3\2\2\2\u01ab\u01b0\5\u00c2b\2\u01ac\u01ad\7\u00cd\2\2"+
		"\u01ad\u01af\5\u00c2b\2\u01ae\u01ac\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1!\3\2\2\2\u01b2\u01b0\3\2\2\2"+
		"\u01b3\u01b4\7\u0097\2\2\u01b4\u01b5\5$\23\2\u01b5\u01b6\7\u0098\2\2\u01b6"+
		"\u01c2\3\2\2\2\u01b7\u01b8\7\u0097\2\2\u01b8\u01b9\5&\24\2\u01b9\u01ba"+
		"\7\u0098\2\2\u01ba\u01c2\3\2\2\2\u01bb\u01bc\7\u0097\2\2\u01bc\u01bd\5"+
		"$\23\2\u01bd\u01be\7\u00cd\2\2\u01be\u01bf\5&\24\2\u01bf\u01c0\7\u0098"+
		"\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01b3\3\2\2\2\u01c1\u01b7\3\2\2\2\u01c1"+
		"\u01bb\3\2\2\2\u01c2#\3\2\2\2\u01c3\u01c8\5(\25\2\u01c4\u01c5\7\u00cd"+
		"\2\2\u01c5\u01c7\5(\25\2\u01c6\u01c4\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9%\3\2\2\2\u01ca\u01c8\3\2\2\2"+
		"\u01cb\u01d0\5*\26\2\u01cc\u01cd\7\u00cd\2\2\u01cd\u01cf\5*\26\2\u01ce"+
		"\u01cc\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\'\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\5.\30\2\u01d4\u01d5"+
		"\5\u0102\u0082\2\u01d5)\3\2\2\2\u01d6\u01d7\5.\30\2\u01d7\u01d8\5\u0102"+
		"\u0082\2\u01d8\u01db\7\u00d0\2\2\u01d9\u01dc\5\u00c2b\2\u01da\u01dc\5"+
		"\u010a\u0086\2\u01db\u01d9\3\2\2\2\u01db\u01da\3\2\2\2\u01dc+\3\2\2\2"+
		"\u01dd\u01de\7\u0097\2\2\u01de\u01e3\5\u00c4c\2\u01df\u01e0\7\u00cd\2"+
		"\2\u01e0\u01e2\5\u00c4c\2\u01e1\u01df\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e3\3\2"+
		"\2\2\u01e6\u01e7\7\u0098\2\2\u01e7-\3\2\2\2\u01e8\u01ea\5\60\31\2\u01e9"+
		"\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec/\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f2\7\u00c9\2\2\u01ef"+
		"\u01f0\5\u0102\u0082\2\u01f0\u01f1\7\u00ce\2\2\u01f1\u01f3\3\2\2\2\u01f2"+
		"\u01ef\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f9\5\62"+
		"\32\2\u01f5\u01f6\7\u00cd\2\2\u01f6\u01f8\5\62\32\2\u01f7\u01f5\3\2\2"+
		"\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc"+
		"\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fd\7\u00ca\2\2\u01fd\61\3\2\2\2"+
		"\u01fe\u0211\5\u00c8e\2\u01ff\u0200\5\u00c8e\2\u0200\u0201\7\u00c7\2\2"+
		"\u0201\u0202\5\64\33\2\u0202\u0203\7\u00c8\2\2\u0203\u0211\3\2\2\2\u0204"+
		"\u0205\5\u00c8e\2\u0205\u0206\7\u00c7\2\2\u0206\u0207\5\66\34\2\u0207"+
		"\u0208\7\u00c8\2\2\u0208\u0211\3\2\2\2\u0209\u020a\5\u00c8e\2\u020a\u020b"+
		"\7\u00c7\2\2\u020b\u020c\5\64\33\2\u020c\u020d\7\u00cd\2\2\u020d\u020e"+
		"\5\66\34\2\u020e\u020f\7\u00c8\2\2\u020f\u0211\3\2\2\2\u0210\u01fe\3\2"+
		"\2\2\u0210\u01ff\3\2\2\2\u0210\u0204\3\2\2\2\u0210\u0209\3\2\2\2\u0211"+
		"\63\3\2\2\2\u0212\u0217\5\u00a8U\2\u0213\u0214\7\u00cd\2\2\u0214\u0216"+
		"\5\u00a8U\2\u0215\u0213\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2"+
		"\2\u0217\u0218\3\2\2\2\u0218\65\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021f"+
		"\58\35\2\u021b\u021c\7\u00cd\2\2\u021c\u021e\58\35\2\u021d\u021b\3\2\2"+
		"\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\67"+
		"\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0223\7\u00d3\2\2\u0223\u0224\7\u0099"+
		"\2\2\u0224\u0225\5\u00a8U\2\u02259\3\2\2\2\u0226\u0228\5<\37\2\u0227\u0226"+
		"\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		";\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u0230\5> \2\u022d\u0230\5\32\16\2"+
		"\u022e\u0230\5\34\17\2\u022f\u022c\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u022e"+
		"\3\2\2\2\u0230=\3\2\2\2\u0231\u0234\5B\"\2\u0232\u0234\5@!\2\u0233\u0231"+
		"\3\2\2\2\u0233\u0232\3\2\2\2\u0234?\3\2\2\2\u0235\u0236\7\u00cf\2\2\u0236"+
		"A\3\2\2\2\u0237\u0238\5\u0102\u0082\2\u0238\u0239\7\u00ce\2\2\u0239\u0253"+
		"\3\2\2\2\u023a\u0253\5D#\2\u023b\u0253\5F$\2\u023c\u0253\5P)\2\u023d\u0253"+
		"\5R*\2\u023e\u0253\5T+\2\u023f\u0253\5Z.\2\u0240\u0253\5^\60\2\u0241\u0253"+
		"\5`\61\2\u0242\u0253\5b\62\2\u0243\u0244\5\u00b8]\2\u0244\u0245\7\u00cf"+
		"\2\2\u0245\u0253\3\2\2\2\u0246\u0253\5\u0082B\2\u0247\u0253\5\u0088E\2"+
		"\u0248\u0253\5\u0086D\2\u0249\u0253\5d\63\2\u024a\u0253\5f\64\2\u024b"+
		"\u0253\5h\65\2\u024c\u0253\5j\66\2\u024d\u0253\5l\67\2\u024e\u0253\5r"+
		":\2\u024f\u0253\5t;\2\u0250\u0253\5v<\2\u0251\u0253\5x=\2\u0252\u0237"+
		"\3\2\2\2\u0252\u023a\3\2\2\2\u0252\u023b\3\2\2\2\u0252\u023c\3\2\2\2\u0252"+
		"\u023d\3\2\2\2\u0252\u023e\3\2\2\2\u0252\u023f\3\2\2\2\u0252\u0240\3\2"+
		"\2\2\u0252\u0241\3\2\2\2\u0252\u0242\3\2\2\2\u0252\u0243\3\2\2\2\u0252"+
		"\u0246\3\2\2\2\u0252\u0247\3\2\2\2\u0252\u0248\3\2\2\2\u0252\u0249\3\2"+
		"\2\2\u0252\u024a\3\2\2\2\u0252\u024b\3\2\2\2\u0252\u024c\3\2\2\2\u0252"+
		"\u024d\3\2\2\2\u0252\u024e\3\2\2\2\u0252\u024f\3\2\2\2\u0252\u0250\3\2"+
		"\2\2\u0252\u0251\3\2\2\2\u0253C\3\2\2\2\u0254\u0255\7\u00cb\2\2\u0255"+
		"\u0256\5:\36\2\u0256\u0257\7\u00cc\2\2\u0257E\3\2\2\2\u0258\u0259\7R\2"+
		"\2\u0259\u025a\5\u00a6T\2\u025a\u025e\5> \2\u025b\u025d\5H%\2\u025c\u025b"+
		"\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0263\5L\'\2\u0262\u0261\3\2"+
		"\2\2\u0262\u0263\3\2\2\2\u0263\u0275\3\2\2\2\u0264\u0265\7R\2\2\u0265"+
		"\u0266\5\u00a6T\2\u0266\u0267\7\u00ce\2\2\u0267\u026b\5:\36\2\u0268\u026a"+
		"\5J&\2\u0269\u0268\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u0270\5N"+
		"(\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"\u0272\7D\2\2\u0272\u0273\7\u00cf\2\2\u0273\u0275\3\2\2\2\u0274\u0258"+
		"\3\2\2\2\u0274\u0264\3\2\2\2\u0275G\3\2\2\2\u0276\u0277\7?\2\2\u0277\u0278"+
		"\5\u00a6T\2\u0278\u0279\5> \2\u0279I\3\2\2\2\u027a\u027b\7?\2\2\u027b"+
		"\u027c\5\u00a6T\2\u027c\u027d\7\u00ce\2\2\u027d\u027e\5:\36\2\u027eK\3"+
		"\2\2\2\u027f\u0280\7>\2\2\u0280\u0281\5> \2\u0281M\3\2\2\2\u0282\u0283"+
		"\7>\2\2\u0283\u0284\7\u00ce\2\2\u0284\u0285\5:\36\2\u0285O\3\2\2\2\u0286"+
		"\u0287\7}\2\2\u0287\u028e\5\u00a6T\2\u0288\u028f\5> \2\u0289\u028a\7\u00ce"+
		"\2\2\u028a\u028b\5:\36\2\u028b\u028c\7F\2\2\u028c\u028d\7\u00cf\2\2\u028d"+
		"\u028f\3\2\2\2\u028e\u0288\3\2\2\2\u028e\u0289\3\2\2\2\u028fQ\3\2\2\2"+
		"\u0290\u0291\7:\2\2\u0291\u0292\5> \2\u0292\u0293\7}\2\2\u0293\u0294\5"+
		"\u00a6T\2\u0294\u0295\7\u00cf\2\2\u0295S\3\2\2\2\u0296\u0297\7M\2\2\u0297"+
		"\u0299\7\u00c7\2\2\u0298\u029a\5V,\2\u0299\u0298\3\2\2\2\u0299\u029a\3"+
		"\2\2\2\u029a\u029b\3\2\2\2\u029b\u029d\7\u00cf\2\2\u029c\u029e\5\u00a4"+
		"S\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2\2\2\u029f"+
		"\u02a1\7\u00cf\2\2\u02a0\u02a2\5X-\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3"+
		"\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02aa\7\u00c8\2\2\u02a4\u02ab\5> \2\u02a5"+
		"\u02a6\7\u00ce\2\2\u02a6\u02a7\5:\36\2\u02a7\u02a8\7B\2\2\u02a8\u02a9"+
		"\7\u00cf\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02a4\3\2\2\2\u02aa\u02a5\3\2\2"+
		"\2\u02abU\3\2\2\2\u02ac\u02ad\5\u00a4S\2\u02adW\3\2\2\2\u02ae\u02af\5"+
		"\u00a4S\2\u02afY\3\2\2\2\u02b0\u02b1\7s\2\2\u02b1\u02c9\5\u00a6T\2\u02b2"+
		"\u02b4\7\u00cb\2\2\u02b3\u02b5\7\u00cf\2\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5"+
		"\3\2\2\2\u02b5\u02b9\3\2\2\2\u02b6\u02b8\5\\/\2\u02b7\u02b6\3\2\2\2\u02b8"+
		"\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bc\3\2"+
		"\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02ca\7\u00cc\2\2\u02bd\u02bf\7\u00ce\2"+
		"\2\u02be\u02c0\7\u00cf\2\2\u02bf\u02be\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0"+
		"\u02c4\3\2\2\2\u02c1\u02c3\5\\/\2\u02c2\u02c1\3\2\2\2\u02c3\u02c6\3\2"+
		"\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c7\3\2\2\2\u02c6"+
		"\u02c4\3\2\2\2\u02c7\u02c8\7E\2\2\u02c8\u02ca\7\u00cf\2\2\u02c9\u02b2"+
		"\3\2\2\2\u02c9\u02bd\3\2\2\2\u02ca[\3\2\2\2\u02cb\u02cc\7\62\2\2\u02cc"+
		"\u02cf\5\u00a8U\2\u02cd\u02cf\79\2\2\u02ce\u02cb\3\2\2\2\u02ce\u02cd\3"+
		"\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\t\5\2\2\u02d1\u02ce\3\2\2\2\u02d2"+
		"\u02d3\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\3\2"+
		"\2\2\u02d5\u02d6\5:\36\2\u02d6]\3\2\2\2\u02d7\u02d9\7\60\2\2\u02d8\u02da"+
		"\5\u00a8U\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\3\2\2"+
		"\2\u02db\u02dc\7\u00cf\2\2\u02dc_\3\2\2\2\u02dd\u02df\7\67\2\2\u02de\u02e0"+
		"\5\u00a8U\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2"+
		"\2\u02e1\u02e2\7\u00cf\2\2\u02e2a\3\2\2\2\u02e3\u02e5\7p\2\2\u02e4\u02e6"+
		"\5\u00a8U\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\3\2\2"+
		"\2\u02e7\u02e8\7\u00cf\2\2\u02e8c\3\2\2\2\u02e9\u02ea\5\u00a8U\2\u02ea"+
		"\u02eb\7\u00cf\2\2\u02ebe\3\2\2\2\u02ec\u02ed\5\u00e8u\2\u02ed\u02ee\5"+
		"\u00b6\\\2\u02ee\u02ef\5\u00a8U\2\u02ef\u02f8\3\2\2\2\u02f0\u02f1\5\u00e8"+
		"u\2\u02f1\u02f2\7\u00d0\2\2\u02f2\u02f5\7\u00b9\2\2\u02f3\u02f6\5\u00e8"+
		"u\2\u02f4\u02f6\5\u00b4[\2\u02f5\u02f3\3\2\2\2\u02f5\u02f4\3\2\2\2\u02f6"+
		"\u02f8\3\2\2\2\u02f7\u02ec\3\2\2\2\u02f7\u02f0\3\2\2\2\u02f8g\3\2\2\2"+
		"\u02f9\u02fa\7z\2\2\u02fa\u02fb\7\u00c7\2\2\u02fb\u02fc\5\u00e6t\2\u02fc"+
		"\u02fd\7\u00c8\2\2\u02fd\u02fe\7\u00cf\2\2\u02fei\3\2\2\2\u02ff\u0326"+
		"\7N\2\2\u0300\u0301\7\u00c7\2\2\u0301\u0302\5\u00e8u\2\u0302\u0304\7,"+
		"\2\2\u0303\u0305\7\u00b9\2\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2\2\2\u0305"+
		"\u0306\3\2\2\2\u0306\u030c\5\u00e8u\2\u0307\u0309\7\u0099\2\2\u0308\u030a"+
		"\7\u00b9\2\2\u0309\u0308\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\3\2\2"+
		"\2\u030b\u030d\5\u00e8u\2\u030c\u0307\3\2\2\2\u030c\u030d\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u030f\7\u00c8\2\2\u030f\u0327\3\2\2\2\u0310\u0311"+
		"\7\u00c7\2\2\u0311\u0312\5\u00a8U\2\u0312\u0313\7,\2\2\u0313\u0319\5\u00e8"+
		"u\2\u0314\u0316\7\u0099\2\2\u0315\u0317\7\u00b9\2\2\u0316\u0315\3\2\2"+
		"\2\u0316\u0317\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031a\5\u00e8u\2\u0319"+
		"\u0314\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\7\u00c8"+
		"\2\2\u031c\u0327\3\2\2\2\u031d\u031e\7\u00c7\2\2\u031e\u031f\5\u00e8u"+
		"\2\u031f\u0320\7,\2\2\u0320\u0321\7_\2\2\u0321\u0322\7\u00c7\2\2\u0322"+
		"\u0323\5\u00fc\177\2\u0323\u0324\7\u00c8\2\2\u0324\u0325\7\u00c8\2\2\u0325"+
		"\u0327\3\2\2\2\u0326\u0300\3\2\2\2\u0326\u0310\3\2\2\2\u0326\u031d\3\2"+
		"\2\2\u0327\u032e\3\2\2\2\u0328\u032f\5> \2\u0329\u032a\7\u00ce\2\2\u032a"+
		"\u032b\5:\36\2\u032b\u032c\7C\2\2\u032c\u032d\7\u00cf\2\2\u032d\u032f"+
		"\3\2\2\2\u032e\u0328\3\2\2\2\u032e\u0329\3\2\2\2\u032fk\3\2\2\2\u0330"+
		"\u0331\7v\2\2\u0331\u0341\5D#\2\u0332\u0334\5n8\2\u0333\u0332\3\2\2\2"+
		"\u0334\u0335\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0338"+
		"\3\2\2\2\u0337\u0339\5p9\2\u0338\u0337\3\2\2\2\u0338\u0339\3\2\2\2\u0339"+
		"\u0342\3\2\2\2\u033a\u033c\5n8\2\u033b\u033a\3\2\2\2\u033c\u033f\3\2\2"+
		"\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0340\3\2\2\2\u033f\u033d"+
		"\3\2\2\2\u0340\u0342\5p9\2\u0341\u0333\3\2\2\2\u0341\u033d\3\2\2\2\u0342"+
		"m\3\2\2\2\u0343\u0344\7\63\2\2\u0344\u0345\7\u00c7\2\2\u0345\u0346\5\u00c2"+
		"b\2\u0346\u0347\7\u00d3\2\2\u0347\u0348\7\u00c8\2\2\u0348\u0349\5D#\2"+
		"\u0349o\3\2\2\2\u034a\u034b\7K\2\2\u034b\u034c\5D#\2\u034cq\3\2\2\2\u034d"+
		"\u034e\7t\2\2\u034e\u034f\5\u00a8U\2\u034f\u0350\7\u00cf\2\2\u0350s\3"+
		"\2\2\2\u0351\u0352\7Q\2\2\u0352\u0353\5\u0102\u0082\2\u0353\u0354\7\u00cf"+
		"\2\2\u0354u\3\2\2\2\u0355\u0356\78\2\2\u0356\u0357\7\u00c7\2\2\u0357\u0358"+
		"\5z>\2\u0358\u035f\7\u00c8\2\2\u0359\u0360\5> \2\u035a\u035b\7\u00ce\2"+
		"\2\u035b\u035c\5:\36\2\u035c\u035d\7A\2\2\u035d\u035e\7\u00cf\2\2\u035e"+
		"\u0360\3\2\2\2\u035f\u0359\3\2\2\2\u035f\u035a\3\2\2\2\u0360w\3\2\2\2"+
		"\u0361\u0364\5\6\4\2\u0362\u0364\5\b\5\2\u0363\u0361\3\2\2\2\u0363\u0362"+
		"\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366"+
		"y\3\2\2\2\u0367\u036c\5\u00a0Q\2\u0368\u0369\7\u00cd\2\2\u0369\u036b\5"+
		"\u00a0Q\2\u036a\u0368\3\2\2\2\u036b\u036e\3\2\2\2\u036c\u036a\3\2\2\2"+
		"\u036c\u036d\3\2\2\2\u036d{\3\2\2\2\u036e\u036c\3\2\2\2\u036f\u0371\5"+
		"~@\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0376\3\2\2\2\u0372"+
		"\u0373\7\u00cd\2\2\u0373\u0375\5~@\2\u0374\u0372\3\2\2\2\u0375\u0378\3"+
		"\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377}\3\2\2\2\u0378\u0376"+
		"\3\2\2\2\u0379\u037b\5.\30\2\u037a\u037c\5\u0080A\2\u037b\u037a\3\2\2"+
		"\2\u037b\u037c\3\2\2\2\u037c\u037e\3\2\2\2\u037d\u037f\7\u00b9\2\2\u037e"+
		"\u037d\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0381\3\2\2\2\u0380\u0382\7\u00b6"+
		"\2\2\u0381\u0380\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\3\2\2\2\u0383"+
		"\u0384\5\u009eP\2\u0384\177\3\2\2\2\u0385\u0389\5\u00c2b\2\u0386\u0389"+
		"\7\61\2\2\u0387\u0389\5\u010a\u0086\2\u0388\u0385\3\2\2\2\u0388\u0386"+
		"\3\2\2\2\u0388\u0387\3\2\2\2\u0389\u0081\3\2\2\2\u038a\u038b\7P\2\2\u038b"+
		"\u0390\5\u0084C\2\u038c\u038d\7\u00cd\2\2\u038d\u038f\5\u0084C\2\u038e"+
		"\u038c\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2"+
		"\2\2\u0391\u0393\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0394\7\u00cf\2\2\u0394"+
		"\u0083\3\2\2\2\u0395\u039e\7\u00d3\2\2\u0396\u0397\7\u00c4\2\2\u0397\u039e"+
		"\5\u00e8u\2\u0398\u0399\7\u00c4\2\2\u0399\u039a\7\u00cb\2\2\u039a\u039b"+
		"\5\u00a8U\2\u039b\u039c\7\u00cc\2\2\u039c\u039e\3\2\2\2\u039d\u0395\3"+
		"\2\2\2\u039d\u0396\3\2\2\2\u039d\u0398\3\2\2\2\u039e\u0085\3\2\2\2\u039f"+
		"\u03a0\7=\2\2\u03a0\u03a1\5\u00a4S\2\u03a1\u03a2\7\u00cf\2\2\u03a2\u0087"+
		"\3\2\2\2\u03a3\u03a4\7q\2\2\u03a4\u03a9\5\u009eP\2\u03a5\u03a6\7\u00cd"+
		"\2\2\u03a6\u03a8\5\u009eP\2\u03a7\u03a5\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9"+
		"\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ac\3\2\2\2\u03ab\u03a9\3\2"+
		"\2\2\u03ac\u03ad\7\u00cf\2\2\u03ad\u0089\3\2\2\2\u03ae\u03af\5.\30\2\u03af"+
		"\u03b0\5\u009aN\2\u03b0\u03b5\5\u009eP\2\u03b1\u03b2\7\u00cd\2\2\u03b2"+
		"\u03b4\5\u009eP\2\u03b3\u03b1\3\2\2\2\u03b4\u03b7\3\2\2\2\u03b5\u03b3"+
		"\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b8\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b8"+
		"\u03b9\7\u00cf\2\2\u03b9\u03df\3\2\2\2\u03ba\u03bb\5.\30\2\u03bb\u03bc"+
		"\7\66\2\2\u03bc\u03c1\5\u00a0Q\2\u03bd\u03be\7\u00cd\2\2\u03be\u03c0\5"+
		"\u00a0Q\2\u03bf\u03bd\3\2\2\2\u03c0\u03c3\3\2\2\2\u03c1\u03bf\3\2\2\2"+
		"\u03c1\u03c2\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c4\u03c5"+
		"\7\u00cf\2\2\u03c5\u03df\3\2\2\2\u03c6\u03c8\5.\30\2\u03c7\u03c9\5\u009c"+
		"O\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca"+
		"\u03cc\7O\2\2\u03cb\u03cd\7\u00b9\2\2\u03cc\u03cb\3\2\2\2\u03cc\u03cd"+
		"\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d0\5\u0102\u0082\2\u03cf\u03d1\5"+
		"\"\22\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2"+
		"\u03d3\7\u00c7\2\2\u03d3\u03d4\5|?\2\u03d4\u03d6\7\u00c8\2\2\u03d5\u03d7"+
		"\5\u0096L\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d8\3\2\2"+
		"\2\u03d8\u03d9\5\u0098M\2\u03d9\u03df\3\2\2\2\u03da\u03db\7{\2\2\u03db"+
		"\u03dc\5\u00ccg\2\u03dc\u03dd\5\u008cG\2\u03dd\u03df\3\2\2\2\u03de\u03ae"+
		"\3\2\2\2\u03de\u03ba\3\2\2\2\u03de\u03c6\3\2\2\2\u03de\u03da\3\2\2\2\u03df"+
		"\u008b\3\2\2\2\u03e0\u03ea\7\u00cf\2\2\u03e1\u03e5\7\u00cb\2\2\u03e2\u03e4"+
		"\5\u008eH\2\u03e3\u03e2\3\2\2\2\u03e4\u03e7\3\2\2\2\u03e5\u03e3\3\2\2"+
		"\2\u03e5\u03e6\3\2\2\2\u03e6\u03e8\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e8\u03ea"+
		"\7\u00cc\2\2\u03e9\u03e0\3\2\2\2\u03e9\u03e1\3\2\2\2\u03ea\u008d\3\2\2"+
		"\2\u03eb\u03ee\5\u0090I\2\u03ec\u03ee\5\u0092J\2\u03ed\u03eb\3\2\2\2\u03ed"+
		"\u03ec\3\2\2\2\u03ee\u008f\3\2\2\2\u03ef\u03f0\5\u00c8e\2\u03f0\u03f1"+
		"\7\u00b3\2\2\u03f1\u03f2\5\u0102\u0082\2\u03f2\u03f3\7X\2\2\u03f3\u03f4"+
		"\5\u00ccg\2\u03f4\u03f5\7\u00cf\2\2\u03f5\u0091\3\2\2\2\u03f6\u03f7\5"+
		"\u0094K\2\u03f7\u03fd\7,\2\2\u03f8\u03fe\5\u0104\u0083\2\u03f9\u03fb\5"+
		"\u0104\u0083\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\3\2"+
		"\2\2\u03fc\u03fe\5\u0102\u0082\2\u03fd\u03f8\3\2\2\2\u03fd\u03fa\3\2\2"+
		"\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\7\u00cf\2\2\u0400\u0093\3\2\2\2\u0401"+
		"\u0402\5\u00c8e\2\u0402\u0403\7\u00b3\2\2\u0403\u0405\3\2\2\2\u0404\u0401"+
		"\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407\5\u0102\u0082"+
		"\2\u0407\u0095\3\2\2\2\u0408\u0409\7\u00ce\2\2\u0409\u040a\5\u0102\u0082"+
		"\2\u040a\u040b\5\u00ceh\2\u040b\u0097\3\2\2\2\u040c\u040f\7\u00cf\2\2"+
		"\u040d\u040f\5D#\2\u040e\u040c\3\2\2\2\u040e\u040d\3\2\2\2\u040f\u0099"+
		"\3\2\2\2\u0410\u0413\5\u009cO\2\u0411\u0413\7|\2\2\u0412\u0410\3\2\2\2"+
		"\u0412\u0411\3\2\2\2\u0413\u009b\3\2\2\2\u0414\u0416\5\u0104\u0083\2\u0415"+
		"\u0414\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0415\3\2\2\2\u0417\u0418\3\2"+
		"\2\2\u0418\u009d\3\2\2\2\u0419\u041c\7\u00d3\2\2\u041a\u041b\7\u00d0\2"+
		"\2\u041b\u041d\5\u00d2j\2\u041c\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d"+
		"\u009f\3\2\2\2\u041e\u041f\5\u0102\u0082\2\u041f\u0420\7\u00d0\2\2\u0420"+
		"\u0421\5\u00d2j\2\u0421\u00a1\3\2\2\2\u0422\u0423\5.\30\2\u0423\u0424"+
		"\7\66\2\2\u0424\u0429\5\u00a0Q\2\u0425\u0426\7\u00cd\2\2\u0426\u0428\5"+
		"\u00a0Q\2\u0427\u0425\3\2\2\2\u0428\u042b\3\2\2\2\u0429\u0427\3\2\2\2"+
		"\u0429\u042a\3\2\2\2\u042a\u042c\3\2\2\2\u042b\u0429\3\2\2\2\u042c\u042d"+
		"\7\u00cf\2\2\u042d\u00a3\3\2\2\2\u042e\u0433\5\u00a8U\2\u042f\u0430\7"+
		"\u00cd\2\2\u0430\u0432\5\u00a8U\2\u0431\u042f\3\2\2\2\u0432\u0435\3\2"+
		"\2\2\u0433\u0431\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u00a5\3\2\2\2\u0435"+
		"\u0433\3\2\2\2\u0436\u0439\7\u00c7\2\2\u0437\u043a\5\u00a8U\2\u0438\u043a"+
		"\5\u00b8]\2\u0439\u0437\3\2\2\2\u0439\u0438\3\2\2\2\u043a\u043b\3\2\2"+
		"\2\u043b\u043c\7\u00c8\2\2\u043c\u00a7\3\2\2\2\u043d\u043e\bU\1\2\u043e"+
		"\u043f\5\u00aaV\2\u043f\u0452\3\2\2\2\u0440\u0441\f\6\2\2\u0441\u0443"+
		"\7\u00c6\2\2\u0442\u0444\5\u00a8U\2\u0443\u0442\3\2\2\2\u0443\u0444\3"+
		"\2\2\2\u0444\u0445\3\2\2\2\u0445\u0446\7\u00ce\2\2\u0446\u0451\5\u00aa"+
		"V\2\u0447\u0448\f\5\2\2\u0448\u0449\7`\2\2\u0449\u0451\5\u00aaV\2\u044a"+
		"\u044b\f\4\2\2\u044b\u044c\7b\2\2\u044c\u0451\5\u00aaV\2\u044d\u044e\f"+
		"\3\2\2\u044e\u044f\7a\2\2\u044f\u0451\5\u00aaV\2\u0450\u0440\3\2\2\2\u0450"+
		"\u0447\3\2\2\2\u0450\u044a\3\2\2\2\u0450\u044d\3\2\2\2\u0451\u0454\3\2"+
		"\2\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u00a9\3\2\2\2\u0454"+
		"\u0452\3\2\2\2\u0455\u0456\bV\1\2\u0456\u0457\5\u00acW\2\u0457\u0469\3"+
		"\2\2\2\u0458\u0459\f\7\2\2\u0459\u045a\7\u00b9\2\2\u045a\u0468\5\u00ac"+
		"W\2\u045b\u045c\f\6\2\2\u045c\u045d\7\u00bc\2\2\u045d\u0468\5\u00acW\2"+
		"\u045e\u045f\f\5\2\2\u045f\u0460\7\u00ba\2\2\u0460\u0468\5\u00acW\2\u0461"+
		"\u0462\f\4\2\2\u0462\u0463\7\u00b0\2\2\u0463\u0468\5\u00acW\2\u0464\u0465"+
		"\f\3\2\2\u0465\u0466\7\u00af\2\2\u0466\u0468\5\u00acW\2\u0467\u0458\3"+
		"\2\2\2\u0467\u045b\3\2\2\2\u0467\u045e\3\2\2\2\u0467\u0461\3\2\2\2\u0467"+
		"\u0464\3\2\2\2\u0468\u046b\3\2\2\2\u0469\u0467\3\2\2\2\u0469\u046a\3\2"+
		"\2\2\u046a\u00ab\3\2\2\2\u046b\u0469\3\2\2\2\u046c\u046d\bW\1\2\u046d"+
		"\u046e\5\u00aeX\2\u046e\u047a\3\2\2\2\u046f\u0470\f\5\2\2\u0470\u0471"+
		"\t\6\2\2\u0471\u0479\5\u00aeX\2\u0472\u0473\f\4\2\2\u0473\u0474\t\7\2"+
		"\2\u0474\u0479\5\u00aeX\2\u0475\u0476\f\3\2\2\u0476\u0477\t\b\2\2\u0477"+
		"\u0479\5\u00aeX\2\u0478\u046f\3\2\2\2\u0478\u0472\3\2\2\2\u0478\u0475"+
		"\3\2\2\2\u0479\u047c\3\2\2\2\u047a\u0478\3\2\2\2\u047a\u047b\3\2\2\2\u047b"+
		"\u00ad\3\2\2\2\u047c\u047a\3\2\2\2\u047d\u047e\bX\1\2\u047e\u047f\5\u00b0"+
		"Y\2\u047f\u0485\3\2\2\2\u0480\u0481\f\3\2\2\u0481\u0482\t\t\2\2\u0482"+
		"\u0484\5\u00b0Y\2\u0483\u0480\3\2\2\2\u0484\u0487\3\2\2\2\u0485\u0483"+
		"\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u00af\3\2\2\2\u0487\u0485\3\2\2\2\u0488"+
		"\u0489\bY\1\2\u0489\u048f\5\u00b2Z\2\u048a\u048b\5\u00b2Z\2\u048b\u048c"+
		"\7\u00a5\2\2\u048c\u048d\5\u00b0Y\5\u048d\u048f\3\2\2\2\u048e\u0488\3"+
		"\2\2\2\u048e\u048a\3\2\2\2\u048f\u0498\3\2\2\2\u0490\u0491\f\4\2\2\u0491"+
		"\u0492\7W\2\2\u0492\u0497\5\u00c4c\2\u0493\u0494\f\3\2\2\u0494\u0495\t"+
		"\n\2\2\u0495\u0497\5\u00b2Z\2\u0496\u0490\3\2\2\2\u0496\u0493\3\2\2\2"+
		"\u0497\u049a\3\2\2\2\u0498\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u00b1"+
		"\3\2\2\2\u049a\u0498\3\2\2\2\u049b\u049c\7\65\2\2\u049c\u04fd\5\u00a8"+
		"U\2\u049d\u04fd\5\u00b4[\2\u049e\u049f\5\u00e0q\2\u049f\u04a0\7\u00c9"+
		"\2\2\u04a0\u04a1\5\u00a8U\2\u04a1\u04a2\7\u00ca\2\2\u04a2\u04fd\3\2\2"+
		"\2\u04a3\u04a4\7\u00c7\2\2\u04a4\u04a5\5\u010c\u0087\2\u04a5\u04a6\7\u00c8"+
		"\2\2\u04a6\u04a7\5\u00a8U\2\u04a7\u04fd\3\2\2\2\u04a8\u04a9\t\13\2\2\u04a9"+
		"\u04fd\5\u00a8U\2\u04aa\u04ab\t\f\2\2\u04ab\u04fd\5\u00a8U\2\u04ac\u04ad"+
		"\t\r\2\2\u04ad\u04fd\5\u00e8u\2\u04ae\u04af\5\u00e8u\2\u04af\u04b0\t\r"+
		"\2\2\u04b0\u04fd\3\2\2\2\u04b1\u04b2\7i\2\2\u04b2\u04fd\5\u00a8U\2\u04b3"+
		"\u04fd\5\u00e8u\2\u04b4\u04fd\5\u00d8m\2\u04b5\u04fd\5\u00e2r\2\u04b6"+
		"\u04fd\7\u00d4\2\2\u04b7\u04fd\7\u00da\2\2\u04b8\u04fd\5\u00a6T\2\u04b9"+
		"\u04ba\7+\2\2\u04ba\u04bc\7\u00c7\2\2\u04bb\u04bd\5\u00ba^\2\u04bc\u04bb"+
		"\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04c5\7\u00c8\2"+
		"\2\u04bf\u04c1\7\u00c9\2\2\u04c0\u04c2\5\u00ba^\2\u04c1\u04c0\3\2\2\2"+
		"\u04c1\u04c2\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c5\7\u00ca\2\2\u04c4"+
		"\u04b9\3\2\2\2\u04c4\u04bf\3\2\2\2\u04c5\u04ca\3\2\2\2\u04c6\u04c7\7\u00c9"+
		"\2\2\u04c7\u04c8\5\u00a8U\2\u04c8\u04c9\7\u00ca\2\2\u04c9\u04cb\3\2\2"+
		"\2\u04ca\u04c6\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04fd\3\2\2\2\u04cc\u04fd"+
		"\7~\2\2\u04cd\u04ce\7_\2\2\u04ce\u04cf\7\u00c7\2\2\u04cf\u04d0\5\u00fc"+
		"\177\2\u04d0\u04d1\7\u00c8\2\2\u04d1\u04d2\7\u00d0\2\2\u04d2\u04d3\5\u00a8"+
		"U\2\u04d3\u04fd\3\2\2\2\u04d4\u04d5\7^\2\2\u04d5\u04d6\7\u00c7\2\2\u04d6"+
		"\u04d7\5\u00e6t\2\u04d7\u04d8\7\u00c8\2\2\u04d8\u04fd\3\2\2\2\u04d9\u04da"+
		"\7@\2\2\u04da\u04db\7\u00c7\2\2\u04db\u04dc\5\u00e8u\2\u04dc\u04dd\7\u00c8"+
		"\2\2\u04dd\u04fd\3\2\2\2\u04de\u04df\7G\2\2\u04df\u04e0\7\u00c7\2\2\u04e0"+
		"\u04e1\5\u00a8U\2\u04e1\u04e2\7\u00c8\2\2\u04e2\u04fd\3\2\2\2\u04e3\u04e7"+
		"\7H\2\2\u04e4\u04e5\7\u00c7\2\2\u04e5\u04e8\7\u00c8\2\2\u04e6\u04e8\5"+
		"\u00a6T\2\u04e7\u04e4\3\2\2\2\u04e7\u04e6\3\2\2\2\u04e7\u04e8\3\2\2\2"+
		"\u04e8\u04fd\3\2\2\2\u04e9\u04ea\t\16\2\2\u04ea\u04fd\5\u00a8U\2\u04eb"+
		"\u04ec\t\17\2\2\u04ec\u04fd\5\u00a8U\2\u04ed\u04ef\7q\2\2\u04ee\u04ed"+
		"\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f2\7O\2\2\u04f1"+
		"\u04f3\7\u00b9\2\2\u04f2\u04f1\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4"+
		"\3\2\2\2\u04f4\u04f5\7\u00c7\2\2\u04f5\u04f6\5|?\2\u04f6\u04f8\7\u00c8"+
		"\2\2\u04f7\u04f9\5\u00be`\2\u04f8\u04f7\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9"+
		"\u04fa\3\2\2\2\u04fa\u04fb\5D#\2\u04fb\u04fd\3\2\2\2\u04fc\u049b\3\2\2"+
		"\2\u04fc\u049d\3\2\2\2\u04fc\u049e\3\2\2\2\u04fc\u04a3\3\2\2\2\u04fc\u04a8"+
		"\3\2\2\2\u04fc\u04aa\3\2\2\2\u04fc\u04ac\3\2\2\2\u04fc\u04ae\3\2\2\2\u04fc"+
		"\u04b1\3\2\2\2\u04fc\u04b3\3\2\2\2\u04fc\u04b4\3\2\2\2\u04fc\u04b5\3\2"+
		"\2\2\u04fc\u04b6\3\2\2\2\u04fc\u04b7\3\2\2\2\u04fc\u04b8\3\2\2\2\u04fc"+
		"\u04c4\3\2\2\2\u04fc\u04cc\3\2\2\2\u04fc\u04cd\3\2\2\2\u04fc\u04d4\3\2"+
		"\2\2\u04fc\u04d9\3\2\2\2\u04fc\u04de\3\2\2\2\u04fc\u04e3\3\2\2\2\u04fc"+
		"\u04e9\3\2\2\2\u04fc\u04eb\3\2\2\2\u04fc\u04ee\3\2\2\2\u04fd\u00b3\3\2"+
		"\2\2\u04fe\u04ff\7d\2\2\u04ff\u0501\5\u00c4c\2\u0500\u0502\5\u00ceh\2"+
		"\u0501\u0500\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u00b5\3\2\2\2\u0503\u0504"+
		"\t\20\2\2\u0504\u00b7\3\2\2\2\u0505\u0506\7~\2\2\u0506\u0509\5\u00a8U"+
		"\2\u0507\u0508\7\u0099\2\2\u0508\u050a\5\u00a8U\2\u0509\u0507\3\2\2\2"+
		"\u0509\u050a\3\2\2\2\u050a\u00b9\3\2\2\2\u050b\u0510\5\u00bc_\2\u050c"+
		"\u050d\7\u00cd\2\2\u050d\u050f\5\u00bc_\2\u050e\u050c\3\2\2\2\u050f\u0512"+
		"\3\2\2\2\u0510\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0514\3\2\2\2\u0512"+
		"\u0510\3\2\2\2\u0513\u0515\7\u00cd\2\2\u0514\u0513\3\2\2\2\u0514\u0515"+
		"\3\2\2\2\u0515\u00bb\3\2\2\2\u0516\u0519\5\u00a8U\2\u0517\u0518\7\u0099"+
		"\2\2\u0518\u051a\5\u00a8U\2\u0519\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a"+
		"\u0523\3\2\2\2\u051b\u051c\5\u00a8U\2\u051c\u051d\7\u0099\2\2\u051d\u051f"+
		"\3\2\2\2\u051e\u051b\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0520\3\2\2\2\u0520"+
		"\u0521\7\u00b9\2\2\u0521\u0523\5\u00e8u\2\u0522\u0516\3\2\2\2\u0522\u051e"+
		"\3\2\2\2\u0523\u00bd\3\2\2\2\u0524\u0525\7{\2\2\u0525\u0526\7\u00c7\2"+
		"\2\u0526\u052b\5\u00c0a\2\u0527\u0528\7\u00cd\2\2\u0528\u052a\5\u00c0"+
		"a\2\u0529\u0527\3\2\2\2\u052a\u052d\3\2\2\2\u052b\u0529\3\2\2\2\u052b"+
		"\u052c\3\2\2\2\u052c\u052e\3\2\2\2\u052d\u052b\3\2\2\2\u052e\u052f\7\u00c8"+
		"\2\2\u052f\u00bf\3\2\2\2\u0530\u0532\7\u00b9\2\2\u0531\u0530\3\2\2\2\u0531"+
		"\u0532\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534\7\u00d3\2\2\u0534\u00c1"+
		"\3\2\2\2\u0535\u0537\5\u00c8e\2\u0536\u0538\5,\27\2\u0537\u0536\3\2\2"+
		"\2\u0537\u0538\3\2\2\2\u0538\u053b\3\2\2\2\u0539\u053b\7q\2\2\u053a\u0535"+
		"\3\2\2\2\u053a\u0539\3\2\2\2\u053b\u00c3\3\2\2\2\u053c\u053f\5\u00c8e"+
		"\2\u053d\u053f\5\u00c6d\2\u053e\u053c\3\2\2\2\u053e\u053d\3\2\2\2\u053f"+
		"\u0541\3\2\2\2\u0540\u0542\5,\27\2\u0541\u0540\3\2\2\2\u0541\u0542\3\2"+
		"\2\2\u0542\u0546\3\2\2\2\u0543\u0546\5\u010a\u0086\2\u0544\u0546\7q\2"+
		"\2\u0545\u053e\3\2\2\2\u0545\u0543\3\2\2\2\u0545\u0544\3\2\2\2\u0546\u00c5"+
		"\3\2\2\2\u0547\u054c\5\u00f2z\2\u0548\u0549\7\u00b4\2\2\u0549\u054b\5"+
		"\u00f4{\2\u054a\u0548\3\2\2\2\u054b\u054e\3\2\2\2\u054c\u054a\3\2\2\2"+
		"\u054c\u054d\3\2\2\2\u054d\u00c7\3\2\2\2\u054e\u054c\3\2\2\2\u054f\u0551"+
		"\7c\2\2\u0550\u054f\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0553\3\2\2\2\u0552"+
		"\u0554\7\u00b5\2\2\u0553\u0552\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0555"+
		"\3\2\2\2\u0555\u0556\5\u00caf\2\u0556\u00c9\3\2\2\2\u0557\u055c\5\u0102"+
		"\u0082\2\u0558\u0559\7\u00b5\2\2\u0559\u055b\5\u0102\u0082\2\u055a\u0558"+
		"\3\2\2\2\u055b\u055e\3\2\2\2\u055c\u055a\3\2\2\2\u055c\u055d\3\2\2\2\u055d"+
		"\u00cb\3\2\2\2\u055e\u055c\3\2\2\2\u055f\u0564\5\u00c8e\2\u0560\u0561"+
		"\7\u00cd\2\2\u0561\u0563\5\u00c8e\2\u0562\u0560\3\2\2\2\u0563\u0566\3"+
		"\2\2\2\u0564\u0562\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u00cd\3\2\2\2\u0566"+
		"\u0564\3\2\2\2\u0567\u0571\7\u00c7\2\2\u0568\u056d\5\u00d0i\2\u0569\u056a"+
		"\7\u00cd\2\2\u056a\u056c\5\u00d0i\2\u056b\u0569\3\2\2\2\u056c\u056f\3"+
		"\2\2\2\u056d\u056b\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u0572\3\2\2\2\u056f"+
		"\u056d\3\2\2\2\u0570\u0572\5\u00b8]\2\u0571\u0568\3\2\2\2\u0571\u0570"+
		"\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u0574\7\u00c8\2"+
		"\2\u0574\u00cf\3\2\2\2\u0575\u0577\7\u00b6\2\2\u0576\u0575\3\2\2\2\u0576"+
		"\u0577\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u057c\5\u00a8U\2\u0579\u057a"+
		"\7\u00b9\2\2\u057a\u057c\5\u00e8u\2\u057b\u0576\3\2\2\2\u057b\u0579\3"+
		"\2\2\2\u057c\u00d1\3\2\2\2\u057d\u0593\5\u00d8m\2\u057e\u0593\5\u00e2"+
		"r\2\u057f\u0580\7+\2\2\u0580\u0585\7\u00c7\2\2\u0581\u0583\5\u00d4k\2"+
		"\u0582\u0584\7\u00cd\2\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584"+
		"\u0586\3\2\2\2\u0585\u0581\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u0587\3\2"+
		"\2\2\u0587\u0593\7\u00c8\2\2\u0588\u058d\7\u00c9\2\2\u0589\u058b\5\u00d4"+
		"k\2\u058a\u058c\7\u00cd\2\2\u058b\u058a\3\2\2\2\u058b\u058c\3\2\2\2\u058c"+
		"\u058e\3\2\2\2\u058d\u0589\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u058f\3\2"+
		"\2\2\u058f\u0593\7\u00ca\2\2\u0590\u0591\t\21\2\2\u0591\u0593\5\u00d2"+
		"j\2\u0592\u057d\3\2\2\2\u0592\u057e\3\2\2\2\u0592\u057f\3\2\2\2\u0592"+
		"\u0588\3\2\2\2\u0592\u0590\3\2\2\2\u0593\u00d3\3\2\2\2\u0594\u0599\5\u00d6"+
		"l\2\u0595\u0596\7\u00cd\2\2\u0596\u0598\5\u00d6l\2\u0597\u0595\3\2\2\2"+
		"\u0598\u059b\3\2\2\2\u0599\u0597\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u00d5"+
		"\3\2\2\2\u059b\u0599\3\2\2\2\u059c\u059f\5\u00d2j\2\u059d\u059e\7\u0099"+
		"\2\2\u059e\u05a0\5\u00d2j\2\u059f\u059d\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0"+
		"\u00d7\3\2\2\2\u05a1\u05a7\7e\2\2\u05a2\u05a7\5\u00dan\2\u05a3\u05a7\5"+
		"\u0106\u0084\2\u05a4\u05a7\5\u00dep\2\u05a5\u05a7\5\u00c8e\2\u05a6\u05a1"+
		"\3\2\2\2\u05a6\u05a2\3\2\2\2\u05a6\u05a3\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a6"+
		"\u05a5\3\2\2\2\u05a7\u00d9\3\2\2\2\u05a8\u05ad\7\u00d7\2\2\u05a9\u05ad"+
		"\7/\2\2\u05aa\u05ad\5\u00dco\2\u05ab\u05ad\5\u00e0q\2\u05ac\u05a8\3\2"+
		"\2\2\u05ac\u05a9\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ac\u05ab\3\2\2\2\u05ad"+
		"\u00db\3\2\2\2\u05ae\u05af\t\22\2\2\u05af\u00dd\3\2\2\2\u05b0\u05b1\t"+
		"\23\2\2\u05b1\u05b6\7\u00b3\2\2\u05b2\u05b7\5\u0102\u0082\2\u05b3\u05b7"+
		"\7\u0083\2\2\u05b4\u05b7\7\177\2\2\u05b5\u05b7\7\u0080\2\2\u05b6\u05b2"+
		"\3\2\2\2\u05b6\u05b3\3\2\2\2\u05b6\u05b4\3\2\2\2\u05b6\u05b5\3\2\2\2\u05b7"+
		"\u05c0\3\2\2\2\u05b8\u05bb\5\u00c2b\2\u05b9\u05bb\5\u00f8}\2\u05ba\u05b8"+
		"\3\2\2\2\u05ba\u05b9\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05bd\7\u00b3\2"+
		"\2\u05bd\u05be\5\u0102\u0082\2\u05be\u05c0\3\2\2\2\u05bf\u05b0\3\2\2\2"+
		"\u05bf\u05ba\3\2\2\2\u05c0\u00df\3\2\2\2\u05c1\u05c2\7\u00d4\2\2\u05c2"+
		"\u00e1\3\2\2\2\u05c3\u05c5\7\u00de\2\2\u05c4\u05c6\7\u00e5\2\2\u05c5\u05c4"+
		"\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8"+
		"\u05d9\3\2\2\2\u05c9\u05cb\7\u00dd\2\2\u05ca\u05cc\7\u00e5\2\2\u05cb\u05ca"+
		"\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05cb\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce"+
		"\u05d9\3\2\2\2\u05cf\u05d9\7\u00db\2\2\u05d0\u05d4\7\u00dc\2\2\u05d1\u05d3"+
		"\5\u00e4s\2\u05d2\u05d1\3\2\2\2\u05d3\u05d6\3\2\2\2\u05d4\u05d2\3\2\2"+
		"\2\u05d4\u05d5\3\2\2\2\u05d5\u05d7\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d7\u05d9"+
		"\7\u00dc\2\2\u05d8\u05c3\3\2\2\2\u05d8\u05c9\3\2\2\2\u05d8\u05cf\3\2\2"+
		"\2\u05d8\u05d0\3\2\2\2\u05d9\u00e3\3\2\2\2\u05da\u05dd\7\u00e1\2\2\u05db"+
		"\u05dd\5\u00e8u\2\u05dc\u05da\3\2\2\2\u05dc\u05db\3\2\2\2\u05dd\u00e5"+
		"\3\2\2\2\u05de\u05e3\5\u00e8u\2\u05df\u05e0\7\u00cd\2\2\u05e0\u05e2\5"+
		"\u00e8u\2\u05e1\u05df\3\2\2\2\u05e2\u05e5\3\2\2\2\u05e3\u05e1\3\2\2\2"+
		"\u05e3\u05e4\3\2\2\2\u05e4\u00e7\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e6\u05ed"+
		"\5\u00f2z\2\u05e7\u05ed\5\u00ecw\2\u05e8\u05e9\7\u00c7\2\2\u05e9\u05ea"+
		"\5\u00b4[\2\u05ea\u05eb\7\u00c8\2\2\u05eb\u05ed\3\2\2\2\u05ec\u05e6\3"+
		"\2\2\2\u05ec\u05e7\3\2\2\2\u05ec\u05e8\3\2\2\2\u05ed\u05f1\3\2\2\2\u05ee"+
		"\u05f0\5\u00eav\2\u05ef\u05ee\3\2\2\2\u05f0\u05f3\3\2\2\2\u05f1\u05ef"+
		"\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u00e9\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f4"+
		"\u05f5\7\u00b4\2\2\u05f5\u05f7\5\u00f4{\2\u05f6\u05f8\5\u00f0y\2\u05f7"+
		"\u05f6\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u00eb\3\2\2\2\u05f9\u05fa\5\u00ee"+
		"x\2\u05fa\u05fb\5\u00f0y\2\u05fb\u00ed\3\2\2\2\u05fc\u0600\5\u00c8e\2"+
		"\u05fd\u0600\5\u00dep\2\u05fe\u0600\5\u00f2z\2\u05ff\u05fc\3\2\2\2\u05ff"+
		"\u05fd\3\2\2\2\u05ff\u05fe\3\2\2\2\u0600\u00ef\3\2\2\2\u0601\u0603\5,"+
		"\27\2\u0602\u0601\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u0604\3\2\2\2\u0604"+
		"\u0608\5\u00ceh\2\u0605\u0607\5\u00fa~\2\u0606\u0605\3\2\2\2\u0607\u060a"+
		"\3\2\2\2\u0608\u0606\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u00f1\3\2\2\2\u060a"+
		"\u0608\3\2\2\2\u060b\u060e\5\u00f8}\2\u060c\u060d\7\u00b3\2\2\u060d\u060f"+
		"\5\u00f8}\2\u060e\u060c\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0615\3\2\2"+
		"\2\u0610\u0611\5\u00c2b\2\u0611\u0612\7\u00b3\2\2\u0612\u0613\5\u00f8"+
		"}\2\u0613\u0615\3\2\2\2\u0614\u060b\3\2\2\2\u0614\u0610\3\2\2\2\u0615"+
		"\u00f3\3\2\2\2\u0616\u0619\5\u00f6|\2\u0617\u0619\5\u00f8}\2\u0618\u0616"+
		"\3\2\2\2\u0618\u0617\3\2\2\2\u0619\u00f5\3\2\2\2\u061a\u0620\5\u0102\u0082"+
		"\2\u061b\u061c\7\u00cb\2\2\u061c\u061d\5\u00a8U\2\u061d\u061e\7\u00cc"+
		"\2\2\u061e\u0620\3\2\2\2\u061f\u061a\3\2\2\2\u061f\u061b\3\2\2\2\u0620"+
		"\u0624\3\2\2\2\u0621\u0623\5\u00fa~\2\u0622\u0621\3\2\2\2\u0623\u0626"+
		"\3\2\2\2\u0624\u0622\3\2\2\2\u0624\u0625\3\2\2\2\u0625\u00f7\3\2\2\2\u0626"+
		"\u0624\3\2\2\2\u0627\u0629\7\u00c4\2\2\u0628\u0627\3\2\2\2\u0629\u062c"+
		"\3\2\2\2\u062a\u0628\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u0633\3\2\2\2\u062c"+
		"\u062a\3\2\2\2\u062d\u0634\7\u00d3\2\2\u062e\u062f\7\u00c4\2\2\u062f\u0630"+
		"\7\u00cb\2\2\u0630\u0631\5\u00a8U\2\u0631\u0632\7\u00cc\2\2\u0632\u0634"+
		"\3\2\2\2\u0633\u062d\3\2\2\2\u0633\u062e\3\2\2\2\u0634\u0638\3\2\2\2\u0635"+
		"\u0637\5\u00fa~\2\u0636\u0635\3\2\2\2\u0637\u063a\3\2\2\2\u0638\u0636"+
		"\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u00f9\3\2\2\2\u063a\u0638\3\2\2\2\u063b"+
		"\u063d\7\u00c9\2\2\u063c\u063e\5\u00a8U\2\u063d\u063c\3\2\2\2\u063d\u063e"+
		"\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0645\7\u00ca\2\2\u0640\u0641\7\u00cb"+
		"\2\2\u0641\u0642\5\u00a8U\2\u0642\u0643\7\u00cc\2\2\u0643\u0645\3\2\2"+
		"\2\u0644\u063b\3\2\2\2\u0644\u0640\3\2\2\2\u0645\u00fb\3\2\2\2\u0646\u0648"+
		"\5\u00fe\u0080\2\u0647\u0646\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u064f\3"+
		"\2\2\2\u0649\u064b\7\u00cd\2\2\u064a\u064c\5\u00fe\u0080\2\u064b\u064a"+
		"\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064e\3\2\2\2\u064d\u0649\3\2\2\2\u064e"+
		"\u0651\3\2\2\2\u064f\u064d\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u00fd\3\2"+
		"\2\2\u0651\u064f\3\2\2\2\u0652\u0659\5\u00e8u\2\u0653\u0654\7_\2\2\u0654"+
		"\u0655\7\u00c7\2\2\u0655\u0656\5\u00fc\177\2\u0656\u0657\7\u00c8\2\2\u0657"+
		"\u0659\3\2\2\2\u0658\u0652\3\2\2\2\u0658\u0653\3\2\2\2\u0659\u00ff\3\2"+
		"\2\2\u065a\u065b\t\24\2\2\u065b\u0101\3\2\2\2\u065c\u065d\t\25\2\2\u065d"+
		"\u0103\3\2\2\2\u065e\u065f\t\26\2\2\u065f\u0105\3\2\2\2\u0660\u0661\t"+
		"\27\2\2\u0661\u0107\3\2\2\2\u0662\u0663\t\30\2\2\u0663\u0109\3\2\2\2\u0664"+
		"\u0665\t\31\2\2\u0665\u010b\3\2\2\2\u0666\u0667\t\32\2\2\u0667\u010d\3"+
		"\2\2\2\u00c1\u010f\u0114\u011c\u0123\u0128\u012e\u013c\u0140\u0146\u014b"+
		"\u0150\u0156\u015a\u0160\u0167\u016e\u0173\u0177\u0180\u0183\u0186\u018b"+
		"\u018f\u0193\u0198\u019c\u019e\u01a4\u01b0\u01c1\u01c8\u01d0\u01db\u01e3"+
		"\u01eb\u01f2\u01f9\u0210\u0217\u021f\u0229\u022f\u0233\u0252\u025e\u0262"+
		"\u026b\u026f\u0274\u028e\u0299\u029d\u02a1\u02aa\u02b4\u02b9\u02bf\u02c4"+
		"\u02c9\u02ce\u02d3\u02d9\u02df\u02e5\u02f5\u02f7\u0304\u0309\u030c\u0316"+
		"\u0319\u0326\u032e\u0335\u0338\u033d\u0341\u035f\u0363\u0365\u036c\u0370"+
		"\u0376\u037b\u037e\u0381\u0388\u0390\u039d\u03a9\u03b5\u03c1\u03c8\u03cc"+
		"\u03d0\u03d6\u03de\u03e5\u03e9\u03ed\u03fa\u03fd\u0404\u040e\u0412\u0417"+
		"\u041c\u0429\u0433\u0439\u0443\u0450\u0452\u0467\u0469\u0478\u047a\u0485"+
		"\u048e\u0496\u0498\u04bc\u04c1\u04c4\u04ca\u04e7\u04ee\u04f2\u04f8\u04fc"+
		"\u0501\u0509\u0510\u0514\u0519\u051e\u0522\u052b\u0531\u0537\u053a\u053e"+
		"\u0541\u0545\u054c\u0550\u0553\u055c\u0564\u056d\u0571\u0576\u057b\u0583"+
		"\u0585\u058b\u058d\u0592\u0599\u059f\u05a6\u05ac\u05b6\u05ba\u05bf\u05c7"+
		"\u05cd\u05d4\u05d8\u05dc\u05e3\u05ec\u05f1\u05f7\u05ff\u0602\u0608\u060e"+
		"\u0614\u0618\u061f\u0624\u062a\u0633\u0638\u063d\u0644\u0647\u064b\u064f"+
		"\u0658";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}