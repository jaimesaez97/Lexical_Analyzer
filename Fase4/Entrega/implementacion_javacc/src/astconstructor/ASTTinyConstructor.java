/* ASTTinyConstructor.java */
/* Generated By:JavaCC: Do not edit this line. ASTTinyConstructor.java */
package astconstructor;

import ast.*;

public class ASTTinyConstructor implements ASTTinyConstructorConstants {
        private ASTiny as = new ASTiny();
        private final static int MAYOR=0;
        private final static int MINOR=1;
        private final static int MAYOREQUAL=2;
        private final static int MINOREQUAL=3;
        private final static int EQUIV=4;
        private final static int NONEQUIV=5;
        private E op(int op, E opnd1, E opnd2){
                switch(op){
                        case MINOR: return as.minor(opnd1, opnd2);
                        case MAYOR: return as.mayor(opnd1, opnd2);
                        case MINOREQUAL: return as.minorEqual(opnd1, opnd2);
                        case MAYOREQUAL: return as.mayorEqual(opnd1, opnd2);
                        case EQUIV: return as.equiv(opnd1, opnd2);
                        case NONEQUIV: return as.nonEquiv(opnd1, opnd2);
                        default: return null;
                }
        }

  final public S Sp() throws ParseException {S ast;
    ast = S();
    jj_consume_token(0);
{if ("" != null) return ast;}
    throw new Error("Missing return statement in function");
  }

  final public S S() throws ParseException {ResulDs ds; ResulIs is;
    ds = Ds();
    jj_consume_token(21);
    is = Is();
{if ("" != null) return as.decIns(ds.a(), is.a());}
    throw new Error("Missing return statement in function");
  }

  final public ResulDs Ds() throws ParseException {ResulD d; Ds fd;
    d = D();
    fd = FD(as.dSimple(d.id(), d.type()));
{if ("" != null) return new ResulDs(fd);}
    throw new Error("Missing return statement in function");
  }

  final public Ds FD(Ds ds) throws ParseException {ResulD d; Ds fd;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 22:{
      jj_consume_token(22);
      d = D();
      fd = FD(as.dCompuesta(ds, d.id(), d.type()));
{if ("" != null) return fd;}
      break;
      }
    default:
      jj_la1[0] = jj_gen;
{if ("" != null) return ds;}
    }
    throw new Error("Missing return statement in function");
  }

  final public ResulD D() throws ParseException {Token id; T t;
    t = T();
    id = jj_consume_token(identificador);
{if ("" != null) return new ResulD(id.image, t);}
    throw new Error("Missing return statement in function");
  }

  final public T T() throws ParseException {Token t;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case bool:{
      t = jj_consume_token(bool);
{if ("" != null) return new TBool();}
      break;
      }
    case intt:{
      t = jj_consume_token(intt);
{if ("" != null) return new TInt();}
      break;
      }
    case real:{
      t = jj_consume_token(real);
{if ("" != null) return new TReal();}
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public ResulIs Is() throws ParseException {ResulI i; Is fi;
    i = I();
    fi = FI(as.iSimple(i.id(), i.exp()));
{if ("" != null) return new ResulIs(fi);}
    throw new Error("Missing return statement in function");
  }

  final public ResulI I() throws ParseException {Token id; E e;
    id = jj_consume_token(identificador);
    jj_consume_token(23);
    e = E0();
{if ("" != null) return new ResulI(id.image, e);}
    throw new Error("Missing return statement in function");
  }

  final public Is FI(Is is) throws ParseException {ResulI i; Is fi;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 22:{
      jj_consume_token(22);
      i = I();
      fi = FI(as.iCompuesta(is, i.id(), i.exp()));
{if ("" != null) return fi;}
      break;
      }
    default:
      jj_la1[2] = jj_gen;
{if ("" != null) return is;}
    }
    throw new Error("Missing return statement in function");
  }

  final public E E0() throws ParseException {E e1, e0;
    e1 = E1();
    e0 = EE0(e1);
{if ("" != null) return e0;}
    throw new Error("Missing return statement in function");
  }

  final public E EE0(E e) throws ParseException {E e1, e0;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 24:{
      jj_consume_token(24);
      e1 = E1();
      e0 = EE0(as.plus(e, e1));
{if ("" != null) return e0;}
      break;
      }
    case 25:{
      jj_consume_token(25);
      e1 = E1();
{if ("" != null) return as.subtraction(e, e1);}
      break;
      }
    default:
      jj_la1[3] = jj_gen;
{if ("" != null) return e;}
    }
    throw new Error("Missing return statement in function");
  }

  final public E E1() throws ParseException {E e2, e1;
    e2 = E2();
    e1 = EE1(e2);
{if ("" != null) return e1;}
    throw new Error("Missing return statement in function");
  }

  final public E EE1(E e) throws ParseException {E e2;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case and:{
      jj_consume_token(and);
      e2 = E1();
{if ("" != null) return as.and(e, e2);}
      break;
      }
    case or:{
      jj_consume_token(or);
      e2 = E2();
{if ("" != null) return as.or(e, e2);}
      break;
      }
    default:
      jj_la1[4] = jj_gen;
{if ("" != null) return e;}
    }
    throw new Error("Missing return statement in function");
  }

  final public E E2() throws ParseException {E e3, e2;
    e3 = E3();
    e2 = EE2(e3);
{if ("" != null) return e2;}
    throw new Error("Missing return statement in function");
  }

  final public E EE2(E e) throws ParseException {E e3; int op;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 30:
    case 31:
    case 32:
    case 33:
    case 35:{
      op = OP();
      e3 = E3();
{if ("" != null) return op(op, e, e3);}
      break;
      }
    default:
      jj_la1[5] = jj_gen;
{if ("" != null) return e;}
    }
    throw new Error("Missing return statement in function");
  }

  final public E E3() throws ParseException {E e4, e3;
    e4 = E4();
    e3 = EE3(e4);
{if ("" != null) return e3;}
    throw new Error("Missing return statement in function");
  }

  final public E EE3(E e) throws ParseException {E e4, e3;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 26:{
      jj_consume_token(26);
      e4 = E4();
{if ("" != null) return as.mult(e, e4);}
      break;
      }
    case 27:{
      jj_consume_token(27);
      e4 = E4();
{if ("" != null) return as.div(e, e4);}
      break;
      }
    default:
      jj_la1[6] = jj_gen;
{if ("" != null) return e;}
    }
    throw new Error("Missing return statement in function");
  }

  final public E E4() throws ParseException {E e;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 25:{
      jj_consume_token(25);
      e = E4();
{if ("" != null) return as.neg(e);}
      break;
      }
    case not:{
      jj_consume_token(not);
      e = E5();
{if ("" != null) return as.not(e);}
      break;
      }
    case ttrue:
    case ffalse:
    case identificador:
    case numInt:
    case numReal:
    case 28:{
      e = E5();
{if ("" != null) return e;}
      break;
      }
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public E E5() throws ParseException {Token t; E e0;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 28:{
      jj_consume_token(28);
      e0 = E0();
      jj_consume_token(29);
{if ("" != null) return e0;}
      break;
      }
    case identificador:{
      t = jj_consume_token(identificador);
{if ("" != null) return as.id(t.image);}
      break;
      }
    case numReal:{
      t = jj_consume_token(numReal);
{if ("" != null) return as.numReal(t.image);}
      break;
      }
    case numInt:{
      t = jj_consume_token(numInt);
{if ("" != null) return as.numInt(t.image);}
      break;
      }
    case ttrue:{
      t = jj_consume_token(ttrue);
{if ("" != null) return as.eTrue();}
      break;
      }
    case ffalse:{
      t = jj_consume_token(ffalse);
{if ("" != null) return as.eFalse();}
      break;
      }
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public int OP() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 30:{
      jj_consume_token(30);
{if ("" != null) return MINOR;}
      break;
      }
    case 31:{
      jj_consume_token(31);
{if ("" != null) return MAYOR;}
      break;
      }
    case 32:{
      jj_consume_token(32);
{if ("" != null) return MINOREQUAL;}
      break;
      }
    case 33:{
      jj_consume_token(33);
{if ("" != null) return MAYOREQUAL;}
      jj_consume_token(34);
{if ("" != null) return EQUIV;}
      break;
      }
    case 35:{
      jj_consume_token(35);
{if ("" != null) return NONEQUIV;}
      break;
      }
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public ASTTinyConstructorTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[10];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x400000,0x1c00,0x400000,0x3000000,0x18000,0xc0000000,0xc000000,0x121e6000,0x101c6000,0xc0000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0xb,0x0,0x0,0x0,0xb,};
   }

  /** Constructor with InputStream. */
  public ASTTinyConstructor(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public ASTTinyConstructor(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ASTTinyConstructorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public ASTTinyConstructor(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ASTTinyConstructorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public ASTTinyConstructor(ASTTinyConstructorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ASTTinyConstructorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
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
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[36];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 10; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 36; i++) {
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
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
