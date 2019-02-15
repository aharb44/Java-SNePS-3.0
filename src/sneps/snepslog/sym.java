
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package sneps.snepslog;

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int WITHSOME = 65;
  public static final int CLEAR_INFER = 14;
  public static final int UNDEFINE_PATH = 40;
  public static final int UNTRACE = 42;
  public static final int IDENTIFIER = 87;
  public static final int NORMAL = 30;
  public static final int AND_ENTAILMENT = 48;
  public static final int CLOSE_PARAN = 62;
  public static final int DEFINE_RELATION = 20;
  public static final int TRACE = 39;
  public static final int BANGPATH = 82;
  public static final int LIST_CONTEXTS = 26;
  public static final int ASKWH = 8;
  public static final int ASK = 6;
  public static final int INT_LIT = 86;
  public static final int STRING_LIT = 85;
  public static final int NUMERICAL_ENTAILMENT = 88;
  public static final int MANUAL = 13;
  public static final int CLOSE_CURLY = 64;
  public static final int BELIEFS_ABOUT = 10;
  public static final int DEFINE_SEMANTIC = 19;
  public static final int COMMA = 59;
  public static final int ADD_TO_CONTEXT = 5;
  public static final int DEFINE_PATH = 18;
  public static final int WITHALL = 66;
  public static final int UNLABELED = 41;
  public static final int DESCRIBE_TERMS = 23;
  public static final int ALL = 58;
  public static final int IRREFLEXIVE_RESTRICT = 78;
  public static final int BR_MODE = 11;
  public static final int IFDO = 67;
  public static final int EXPAND = 89;
  public static final int NOT = 49;
  public static final int NOR = 54;
  public static final int OR_ENTAILMENT = 47;
  public static final int KPLUS = 74;
  public static final int IMPLICATION = 46;
  public static final int DOMAIN_RESTRICT = 79;
  public static final int EQUALITY = 45;
  public static final int EMPTYPATH = 83;
  public static final int LIST_WFFS = 28;
  public static final int ANDOR = 50;
  public static final int WHENEVERDO = 69;
  public static final int KSTAR = 75;
  public static final int EXPERT = 24;
  public static final int REMOVE_FROM_CONTEXT = 32;
  public static final int ACTING = 44;
  public static final int FILEPATH = 84;
  public static final int CONVERSE = 77;
  public static final int LIST_TERMS = 27;
  public static final int OPEN_PARAN = 61;
  public static final int WFF = 92;
  public static final int NONE = 91;
  public static final int CLEARKB = 15;
  public static final int ASKIFNOT = 7;
  public static final int GOALPLAN = 72;
  public static final int SET_MODE_3 = 37;
  public static final int SET_MODE_2 = 36;
  public static final int SET_MODE_1 = 35;
  public static final int DOT = 4;
  public static final int INFERENCE = 43;
  public static final int LOAD = 29;
  public static final int REDUCE = 90;
  public static final int PERFORM = 31;
  public static final int SHOW = 38;
  public static final int RANGE_RESTRICT = 80;
  public static final int THRESH = 57;
  public static final int EOF = 0;
  public static final int SET_DEFAULT_CONTEXT = 34;
  public static final int BANG = 3;
  public static final int OPEN_CURLY = 63;
  public static final int COMPOSE = 76;
  public static final int DEFINE_FRAME = 17;
  public static final int OR = 52;
  public static final int error = 1;
  public static final int LIST_ASSERTED_WFFS = 25;
  public static final int ACTPLAN = 70;
  public static final int COLON = 60;
  public static final int WHENDO = 68;
  public static final int QUESTION_MARK = 21;
  public static final int DESCRIBE_CONTEXT = 22;
  public static final int PRECONDITION = 73;
  public static final int COPYRIGHT = 16;
  public static final int AND = 51;
  public static final int SET_CONTEXT = 33;
  public static final int ACTIVATE = 2;
  public static final int ASKWHNOT = 9;
  public static final int IFF = 56;
  public static final int AUTO = 12;
  public static final int NAND = 53;
  public static final int XOR = 55;
  public static final int CFRES = 81;
  public static final int EFFECT = 71;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "ACTIVATE",
  "BANG",
  "DOT",
  "ADD_TO_CONTEXT",
  "ASK",
  "ASKIFNOT",
  "ASKWH",
  "ASKWHNOT",
  "BELIEFS_ABOUT",
  "BR_MODE",
  "AUTO",
  "MANUAL",
  "CLEAR_INFER",
  "CLEARKB",
  "COPYRIGHT",
  "DEFINE_FRAME",
  "DEFINE_PATH",
  "DEFINE_SEMANTIC",
  "DEFINE_RELATION",
  "QUESTION_MARK",
  "DESCRIBE_CONTEXT",
  "DESCRIBE_TERMS",
  "EXPERT",
  "LIST_ASSERTED_WFFS",
  "LIST_CONTEXTS",
  "LIST_TERMS",
  "LIST_WFFS",
  "LOAD",
  "NORMAL",
  "PERFORM",
  "REMOVE_FROM_CONTEXT",
  "SET_CONTEXT",
  "SET_DEFAULT_CONTEXT",
  "SET_MODE_1",
  "SET_MODE_2",
  "SET_MODE_3",
  "SHOW",
  "TRACE",
  "UNDEFINE_PATH",
  "UNLABELED",
  "UNTRACE",
  "INFERENCE",
  "ACTING",
  "EQUALITY",
  "IMPLICATION",
  "OR_ENTAILMENT",
  "AND_ENTAILMENT",
  "NOT",
  "ANDOR",
  "AND",
  "OR",
  "NAND",
  "NOR",
  "XOR",
  "IFF",
  "THRESH",
  "ALL",
  "COMMA",
  "COLON",
  "OPEN_PARAN",
  "CLOSE_PARAN",
  "OPEN_CURLY",
  "CLOSE_CURLY",
  "WITHSOME",
  "WITHALL",
  "IFDO",
  "WHENDO",
  "WHENEVERDO",
  "ACTPLAN",
  "EFFECT",
  "GOALPLAN",
  "PRECONDITION",
  "KPLUS",
  "KSTAR",
  "COMPOSE",
  "CONVERSE",
  "IRREFLEXIVE_RESTRICT",
  "DOMAIN_RESTRICT",
  "RANGE_RESTRICT",
  "CFRES",
  "BANGPATH",
  "EMPTYPATH",
  "FILEPATH",
  "STRING_LIT",
  "INT_LIT",
  "IDENTIFIER",
  "NUMERICAL_ENTAILMENT",
  "EXPAND",
  "REDUCE",
  "NONE",
  "WFF"
  };
}
