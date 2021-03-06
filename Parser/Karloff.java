/* Generated By:JavaCC: Do not edit this line. Karloff.java */
import java.io.*;

public class Karloff implements KarloffConstants {
    public static void main(String args[]) throws ParseException,IOException {
        Karloff parser = new Karloff(new FileInputStream(args[0]));
        parser.Karloff();
    }

  static final public void Karloff() throws ParseException {
    Main();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NFUNC:
      Func();
      break;
    default:
      jj_la1[0] = jj_gen;
      ;
    }
    jj_consume_token(0);
  }

  static final public void Main() throws ParseException {
    jj_consume_token(VOID);
    jj_consume_token(MAIN);
    jj_consume_token(ACHAVES);
    VarDecl();
    SeqComandos();
    jj_consume_token(FCHAVES);
  }

  static final public void VarDecl() throws ParseException {
    VarDecl1();
  }

  static final public void VarDecl1() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NEWVAR:
      jj_consume_token(NEWVAR);
      Tipo();
      jj_consume_token(ID);
      jj_consume_token(PVIRGULA);
      VarDecl1();
      break;
    default:
      jj_la1[1] = jj_gen;
      ;
    }
  }

  static final public void Tipo() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT:
      jj_consume_token(INT);
      break;
    case BOOL:
      jj_consume_token(BOOL);
      break;
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void SeqComandos() throws ParseException {
    SeqComandos1();
  }

  static final public void SeqComandos1() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IF:
    case WHILE:
    case REPEAT:
    case RETURN:
    case PRINT:
    case ID:
      Comando();
      SeqComandos1();
      break;
    default:
      jj_la1[3] = jj_gen;
      ;
    }
  }

  static final public void Comando() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      jj_consume_token(ID);
      Comando_Token_id();
      break;
    case IF:
      jj_consume_token(IF);
      jj_consume_token(APAREN);
      Exp();
      jj_consume_token(FPAREN);
      jj_consume_token(THEN);
      jj_consume_token(ACHAVES);
      SeqComandos();
      jj_consume_token(FCHAVES);
      jj_consume_token(PVIRGULA);
      break;
    case WHILE:
      jj_consume_token(WHILE);
      jj_consume_token(APAREN);
      Exp();
      jj_consume_token(FPAREN);
      jj_consume_token(ACHAVES);
      SeqComandos();
      jj_consume_token(FCHAVES);
      jj_consume_token(PVIRGULA);
      break;
    case REPEAT:
      jj_consume_token(REPEAT);
      jj_consume_token(ACHAVES);
      SeqComandos();
      jj_consume_token(FCHAVES);
      jj_consume_token(UNTIL);
      jj_consume_token(APAREN);
      Exp();
      jj_consume_token(FPAREN);
      jj_consume_token(PVIRGULA);
      break;
    case RETURN:
      jj_consume_token(RETURN);
      Exp();
      jj_consume_token(PVIRGULA);
      break;
    case PRINT:
      jj_consume_token(PRINT);
      jj_consume_token(APAREN);
      Exp();
      jj_consume_token(FPAREN);
      jj_consume_token(PVIRGULA);
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Comando_Token_id() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IGUAL:
      jj_consume_token(IGUAL);
      Exp();
      jj_consume_token(PVIRGULA);
      break;
    case APAREN:
      jj_consume_token(APAREN);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case APAREN:
      case ID:
      case NUMLITERAL:
      case BOOLEANO:
        ListaExp();
        break;
      default:
        jj_la1[5] = jj_gen;
        ;
      }
      jj_consume_token(FPAREN);
      jj_consume_token(PVIRGULA);
      break;
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Exp() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case APAREN:
      jj_consume_token(APAREN);
      Exp();
      jj_consume_token(OP);
      Exp();
      jj_consume_token(FPAREN);
      break;
    case ID:
    case NUMLITERAL:
    case BOOLEANO:
      Fator();
      break;
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Fator() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      jj_consume_token(ID);
      Fator_Token_id();
      break;
    case NUMLITERAL:
      jj_consume_token(NUMLITERAL);
      break;
    case BOOLEANO:
      jj_consume_token(BOOLEANO);
      break;
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Fator_Token_id() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case APAREN:
      jj_consume_token(APAREN);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case APAREN:
      case ID:
      case NUMLITERAL:
      case BOOLEANO:
        ListaExp();
        break;
      default:
        jj_la1[9] = jj_gen;
        ;
      }
      jj_consume_token(FPAREN);
      break;
    default:
      jj_la1[10] = jj_gen;
      ;
    }
  }

  static final public void ListaExp() throws ParseException {
    Exp();
    ListaExp1();
  }

  static final public void ListaExp1() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VIRGULA:
      jj_consume_token(VIRGULA);
      Exp();
      ListaExp1();
      break;
    default:
      jj_la1[11] = jj_gen;
      ;
    }
  }

  static final public void Func() throws ParseException {
    label_1:
    while (true) {
      jj_consume_token(NFUNC);
      Tipo();
      jj_consume_token(ID);
      jj_consume_token(APAREN);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
      case BOOL:
        ListaArg();
        break;
      default:
        jj_la1[12] = jj_gen;
        ;
      }
      jj_consume_token(FPAREN);
      jj_consume_token(ACHAVES);
      VarDecl();
      SeqComandos();
      jj_consume_token(FCHAVES);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NFUNC:
        ;
        break;
      default:
        jj_la1[13] = jj_gen;
        break label_1;
      }
    }
  }

  static final public void ListaArg() throws ParseException {
    Tipo();
    jj_consume_token(ID);
    ListaArg1();
  }

  static final public void ListaArg1() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VIRGULA:
      jj_consume_token(VIRGULA);
      jj_consume_token(ID);
      ListaArg1();
      break;
    default:
      jj_la1[14] = jj_gen;
      ;
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public KarloffTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[15];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x1000000,0x200,0x1400,0x40da000,0x40da000,0x1c100000,0x500000,0x1c100000,0x1c000000,0x1c100000,0x100000,0x800000,0x1400,0x1000000,0x800000,};
   }

  /** Constructor with InputStream. */
  public Karloff(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Karloff(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new KarloffTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Karloff(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new KarloffTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Karloff(KarloffTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(KarloffTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[29];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 15; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 29; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
