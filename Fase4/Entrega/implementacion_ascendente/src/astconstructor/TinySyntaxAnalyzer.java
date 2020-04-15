
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140220
// Wed Apr 15 15:49:36 CEST 2020
//----------------------------------------------------

package astconstructor;

import java_cup.runtime.*;
import lex.TinyLexicalAnalyzer;
import lex.LexicalUnit;
import err.TinyErrorMgmt;
import ast.*;
import java_cup.runtime.ComplexSymbolFactory.Location;

/** CUP v0.11b beta 20140220 generated parser.
  * @version Wed Apr 15 15:49:36 CEST 2020
  */
public class TinySyntaxAnalyzer extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public TinySyntaxAnalyzer() {super();}

  /** Constructor which sets the default scanner. */
  public TinySyntaxAnalyzer(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public TinySyntaxAnalyzer(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\044\000\002\002\005\000\002\002\004\000\002\003" +
    "\003\000\002\003\005\000\002\004\004\000\002\005\003" +
    "\000\002\005\003\000\002\005\003\000\002\006\003\000" +
    "\002\006\005\000\002\007\005\000\002\010\005\000\002" +
    "\010\005\000\002\010\003\000\002\011\005\000\002\011" +
    "\005\000\002\011\003\000\002\012\005\000\002\012\005" +
    "\000\002\012\005\000\002\012\005\000\002\012\005\000" +
    "\002\012\005\000\002\012\003\000\002\013\005\000\002" +
    "\013\005\000\002\013\003\000\002\014\004\000\002\014" +
    "\004\000\002\014\003\000\002\015\005\000\002\015\003" +
    "\000\002\015\003\000\002\015\003\000\002\015\003\000" +
    "\002\015\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\075\000\010\004\012\005\005\006\007\001\002\000" +
    "\004\007\077\001\002\000\004\007\ufffb\001\002\000\004" +
    "\002\076\001\002\000\004\007\ufffa\001\002\000\006\010" +
    "\uffff\034\074\001\002\000\004\010\013\001\002\000\004" +
    "\007\ufffc\001\002\000\004\007\016\001\002\000\006\002" +
    "\ufff9\034\072\001\002\000\004\002\001\001\002\000\004" +
    "\013\017\001\002\000\022\007\021\011\020\012\024\022" +
    "\032\031\033\032\023\035\022\036\025\001\002\000\040" +
    "\002\uffdf\014\uffdf\015\uffdf\016\uffdf\017\uffdf\020\uffdf\021" +
    "\uffdf\023\uffdf\024\uffdf\025\uffdf\026\uffdf\027\uffdf\030\uffdf" +
    "\033\uffdf\034\uffdf\001\002\000\040\002\uffe2\014\uffe2\015" +
    "\uffe2\016\uffe2\017\uffe2\020\uffe2\021\uffe2\023\uffe2\024\uffe2" +
    "\025\uffe2\026\uffe2\027\uffe2\030\uffe2\033\uffe2\034\uffe2\001" +
    "\002\000\040\002\uffe1\014\uffe1\015\uffe1\016\uffe1\017\uffe1" +
    "\020\uffe1\021\uffe1\023\uffe1\024\uffe1\025\uffe1\026\uffe1\027" +
    "\uffe1\030\uffe1\033\uffe1\034\uffe1\001\002\000\022\007\021" +
    "\011\020\012\024\022\032\031\033\032\023\035\022\036" +
    "\025\001\002\000\040\002\uffde\014\uffde\015\uffde\016\uffde" +
    "\017\uffde\020\uffde\021\uffde\023\uffde\024\uffde\025\uffde\026" +
    "\uffde\027\uffde\030\uffde\033\uffde\034\uffde\001\002\000\040" +
    "\002\uffe0\014\uffe0\015\uffe0\016\uffe0\017\uffe0\020\uffe0\021" +
    "\uffe0\023\uffe0\024\uffe0\025\uffe0\026\uffe0\027\uffe0\030\uffe0" +
    "\033\uffe0\034\uffe0\001\002\000\040\002\uffe4\014\uffe4\015" +
    "\uffe4\016\uffe4\017\uffe4\020\uffe4\021\uffe4\023\uffe4\024\uffe4" +
    "\025\uffe4\026\uffe4\027\uffe4\030\uffe4\033\uffe4\034\uffe4\001" +
    "\002\000\040\002\uffe7\014\uffe7\015\uffe7\016\uffe7\017\uffe7" +
    "\020\uffe7\021\uffe7\023\uffe7\024\uffe7\025\uffe7\026\uffe7\027" +
    "\uffe7\030\uffe7\033\uffe7\034\uffe7\001\002\000\040\002\uffea" +
    "\014\uffea\015\uffea\016\052\017\054\020\uffea\021\uffea\023" +
    "\055\024\053\025\051\026\057\027\050\030\056\033\uffea" +
    "\034\uffea\001\002\000\020\002\ufff1\014\ufff1\015\ufff1\020" +
    "\044\021\045\033\ufff1\034\ufff1\001\002\000\016\007\021" +
    "\011\020\012\024\032\023\035\022\036\025\001\002\000" +
    "\022\007\021\011\020\012\024\022\032\031\033\032\023" +
    "\035\022\036\025\001\002\000\014\002\ufff4\014\ufff4\015" +
    "\ufff4\033\ufff4\034\ufff4\001\002\000\012\002\ufff7\014\036" +
    "\015\037\034\ufff7\001\002\000\022\007\021\011\020\012" +
    "\024\022\032\031\033\032\023\035\022\036\025\001\002" +
    "\000\022\007\021\011\020\012\024\022\032\031\033\032" +
    "\023\035\022\036\025\001\002\000\014\002\ufff5\014\ufff5" +
    "\015\ufff5\033\ufff5\034\ufff5\001\002\000\014\002\ufff6\014" +
    "\ufff6\015\ufff6\033\ufff6\034\ufff6\001\002\000\040\002\uffe6" +
    "\014\uffe6\015\uffe6\016\uffe6\017\uffe6\020\uffe6\021\uffe6\023" +
    "\uffe6\024\uffe6\025\uffe6\026\uffe6\027\uffe6\030\uffe6\033\uffe6" +
    "\034\uffe6\001\002\000\040\002\uffe5\014\uffe5\015\uffe5\016" +
    "\uffe5\017\uffe5\020\uffe5\021\uffe5\023\uffe5\024\uffe5\025\uffe5" +
    "\026\uffe5\027\uffe5\030\uffe5\033\uffe5\034\uffe5\001\002\000" +
    "\022\007\021\011\020\012\024\022\032\031\033\032\023" +
    "\035\022\036\025\001\002\000\022\007\021\011\020\012" +
    "\024\022\032\031\033\032\023\035\022\036\025\001\002" +
    "\000\014\002\ufff2\014\ufff2\015\ufff2\033\ufff2\034\ufff2\001" +
    "\002\000\014\002\ufff3\014\ufff3\015\ufff3\033\ufff3\034\ufff3" +
    "\001\002\000\022\007\021\011\020\012\024\022\032\031" +
    "\033\032\023\035\022\036\025\001\002\000\022\007\021" +
    "\011\020\012\024\022\032\031\033\032\023\035\022\036" +
    "\025\001\002\000\022\007\021\011\020\012\024\022\032" +
    "\031\033\032\023\035\022\036\025\001\002\000\022\007" +
    "\021\011\020\012\024\022\032\031\033\032\023\035\022" +
    "\036\025\001\002\000\022\007\021\011\020\012\024\022" +
    "\032\031\033\032\023\035\022\036\025\001\002\000\022" +
    "\007\021\011\020\012\024\022\032\031\033\032\023\035" +
    "\022\036\025\001\002\000\022\007\021\011\020\012\024" +
    "\022\032\031\033\032\023\035\022\036\025\001\002\000" +
    "\022\007\021\011\020\012\024\022\032\031\033\032\023" +
    "\035\022\036\025\001\002\000\024\002\uffee\014\uffee\015" +
    "\uffee\016\052\017\054\020\uffee\021\uffee\033\uffee\034\uffee" +
    "\001\002\000\024\002\uffeb\014\uffeb\015\uffeb\016\052\017" +
    "\054\020\uffeb\021\uffeb\033\uffeb\034\uffeb\001\002\000\024" +
    "\002\uffef\014\uffef\015\uffef\016\052\017\054\020\uffef\021" +
    "\uffef\033\uffef\034\uffef\001\002\000\040\002\uffe8\014\uffe8" +
    "\015\uffe8\016\uffe8\017\uffe8\020\uffe8\021\uffe8\023\uffe8\024" +
    "\uffe8\025\uffe8\026\uffe8\027\uffe8\030\uffe8\033\uffe8\034\uffe8" +
    "\001\002\000\024\002\ufff0\014\ufff0\015\ufff0\016\052\017" +
    "\054\020\ufff0\021\ufff0\033\ufff0\034\ufff0\001\002\000\040" +
    "\002\uffe9\014\uffe9\015\uffe9\016\uffe9\017\uffe9\020\uffe9\021" +
    "\uffe9\023\uffe9\024\uffe9\025\uffe9\026\uffe9\027\uffe9\030\uffe9" +
    "\033\uffe9\034\uffe9\001\002\000\024\002\uffed\014\uffed\015" +
    "\uffed\016\052\017\054\020\uffed\021\uffed\033\uffed\034\uffed" +
    "\001\002\000\024\002\uffec\014\uffec\015\uffec\016\052\017" +
    "\054\020\uffec\021\uffec\033\uffec\034\uffec\001\002\000\010" +
    "\014\036\015\037\033\071\001\002\000\040\002\uffe3\014" +
    "\uffe3\015\uffe3\016\uffe3\017\uffe3\020\uffe3\021\uffe3\023\uffe3" +
    "\024\uffe3\025\uffe3\026\uffe3\027\uffe3\030\uffe3\033\uffe3\034" +
    "\uffe3\001\002\000\004\007\016\001\002\000\004\002\ufff8" +
    "\001\002\000\010\004\012\005\005\006\007\001\002\000" +
    "\004\010\ufffe\001\002\000\004\002\000\001\002\000\006" +
    "\010\ufffd\034\ufffd\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\075\000\012\002\005\003\010\004\007\005\003\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\006\014\007\013\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\016\010" +
    "\034\011\033\012\030\013\027\014\026\015\025\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\016\010\067\011\033\012\030\013\027\014\026\015\025" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\015\042\001\001\000\006\014\041\015\025\001" +
    "\001\000\002\001\001\000\002\001\001\000\014\011\040" +
    "\012\030\013\027\014\026\015\025\001\001\000\014\011" +
    "\037\012\030\013\027\014\026\015\025\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\014\011\046\012\030\013\027\014\026\015\025" +
    "\001\001\000\012\012\045\013\027\014\026\015\025\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\013\066" +
    "\014\026\015\025\001\001\000\010\013\065\014\026\015" +
    "\025\001\001\000\006\014\064\015\025\001\001\000\010" +
    "\013\063\014\026\015\025\001\001\000\006\014\062\015" +
    "\025\001\001\000\010\013\061\014\026\015\025\001\001" +
    "\000\010\013\060\014\026\015\025\001\001\000\010\013" +
    "\057\014\026\015\025\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\006\072\007" +
    "\013\001\001\000\002\001\001\000\010\003\074\004\007" +
    "\005\003\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$TinySyntaxAnalyzer$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$TinySyntaxAnalyzer$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$TinySyntaxAnalyzer$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

	error = new TinyErrorMgmt();
	TinyLexicalAnalyzer lex = (TinyLexicalAnalyzer)getScanner();
	lex.setErrorMgmt(error);

    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return getScanner().next_token(); 
    }


	private TinyErrorMgmt error;
	public void syntax_error(Symbol lexicalUnit){
		error.syntaxError((LexicalUnit) lexicalUnit);
	}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$TinySyntaxAnalyzer$actions {


	private ASTiny as = new ASTiny();

  private final TinySyntaxAnalyzer parser;

  /** Constructor */
  CUP$TinySyntaxAnalyzer$actions(TinySyntaxAnalyzer parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$TinySyntaxAnalyzer$do_action_part00000000(
    int                        CUP$TinySyntaxAnalyzer$act_num,
    java_cup.runtime.lr_parser CUP$TinySyntaxAnalyzer$parser,
    java.util.Stack            CUP$TinySyntaxAnalyzer$stack,
    int                        CUP$TinySyntaxAnalyzer$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$TinySyntaxAnalyzer$result;

      /* select the action based on the action number */
      switch (CUP$TinySyntaxAnalyzer$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // S ::= Ds END Is 
            {
              Object RESULT =null;
		Ds aDeDs = (Ds)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.elementAt(CUP$TinySyntaxAnalyzer$top-2)).value;
		Is aDeIs = (Is)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.decIns(aDeDs, aDeIs); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("S",0, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= S EOF 
            {
              Object RESULT =null;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.elementAt(CUP$TinySyntaxAnalyzer$top-1)).value;
		RESULT = start_val;
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("$START",0, RESULT);
            }
          /* ACCEPT */
          CUP$TinySyntaxAnalyzer$parser.done_parsing();
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Ds ::= D 
            {
              Ds RESULT =null;
		Ds aDeD = (Ds)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.dSimple(aDeD.id(), aDeD.tipoT()); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("Ds",1, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Ds ::= D SEMICOLON Ds 
            {
              Ds RESULT =null;
		Ds aDeD = (Ds)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.elementAt(CUP$TinySyntaxAnalyzer$top-2)).value;
		Ds aDeDs = (Ds)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.dCompuesta(aDeDs, aDeD.id(), aDeD.tipoT()); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("Ds",1, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // D ::= T IDEN 
            {
              Ds RESULT =null;
		T aDeT = (T)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.elementAt(CUP$TinySyntaxAnalyzer$top-1)).value;
		String lexDeIden = (String)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.dSimple(lexDeIden, aDeT); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("D",2, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // T ::= INT 
            {
              T RESULT =null;
		 RESULT=as.tInt(); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("T",3, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // T ::= REAL 
            {
              T RESULT =null;
		 RESULT=as.tReal(); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("T",3, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // T ::= BOOL 
            {
              T RESULT =null;
		 RESULT=as.tBool(); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("T",3, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Is ::= I 
            {
              Is RESULT =null;
		Is aDeI = (Is)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.iSimple(aDeI.id(), aDeI.exp()); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("Is",4, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Is ::= I SEMICOLON Is 
            {
              Is RESULT =null;
		Is aDeI = (Is)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.elementAt(CUP$TinySyntaxAnalyzer$top-2)).value;
		Is aDeIs = (Is)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.iCompuesta(aDeIs, aDeI.id(), aDeI.exp()); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("Is",4, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // I ::= IDEN EQUAL E0 
            {
              Is RESULT =null;
		String lexDeIden = (String)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.elementAt(CUP$TinySyntaxAnalyzer$top-2)).value;
		E aDeE = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.iSimple(lexDeIden, aDeE); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("I",5, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // E0 ::= E0 PLUS E1 
            {
              E RESULT =null;
		E aDeE0 = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.elementAt(CUP$TinySyntaxAnalyzer$top-2)).value;
		E aDeE1 = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT= as.plus(aDeE0, aDeE1); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E0",6, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // E0 ::= E0 MINUS E1 
            {
              E RESULT =null;
		E aDeE0 = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.elementAt(CUP$TinySyntaxAnalyzer$top-2)).value;
		E aDeE1 = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT= as.subtraction(aDeE0, aDeE1); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E0",6, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // E0 ::= E1 
            {
              E RESULT =null;
		E aDeE1 = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=aDeE1; 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E0",6, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // E1 ::= E2 AND E1 
            {
              E RESULT =null;
		E aDeE2 = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.elementAt(CUP$TinySyntaxAnalyzer$top-2)).value;
		E aDeE1 = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.and(aDeE2, aDeE1); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E1",7, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // E1 ::= E2 OR E2 
            {
              E RESULT =null;
		E aDeE2a = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.elementAt(CUP$TinySyntaxAnalyzer$top-2)).value;
		E aDeE2b = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.or(aDeE2a, aDeE2b); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E1",7, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // E1 ::= E2 
            {
              E RESULT =null;
		E aDeE2 = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=aDeE2; 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E1",7, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // E2 ::= E3 MINOR E3 
            {
              E RESULT =null;
		E aDeE3a = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.elementAt(CUP$TinySyntaxAnalyzer$top-2)).value;
		E aDeE3b = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.minor(aDeE3a, aDeE3b); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E2",8, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // E2 ::= E3 MAYOR E3 
            {
              E RESULT =null;
		E aDeE3a = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.elementAt(CUP$TinySyntaxAnalyzer$top-2)).value;
		E aDeE3b = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.mayor(aDeE3a, aDeE3b); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E2",8, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // E2 ::= E3 MINOREQUAL E3 
            {
              E RESULT =null;
		E aDeE3a = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.elementAt(CUP$TinySyntaxAnalyzer$top-2)).value;
		E aDeE3b = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.minorEqual(aDeE3a, aDeE3b); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E2",8, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // E2 ::= E3 MAYOREQUAL E3 
            {
              E RESULT =null;
		E aDeE3a = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.elementAt(CUP$TinySyntaxAnalyzer$top-2)).value;
		E aDeE3b = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.mayorEqual(aDeE3a, aDeE3b); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E2",8, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // E2 ::= E3 EQUIV E3 
            {
              E RESULT =null;
		E aDeE3a = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.elementAt(CUP$TinySyntaxAnalyzer$top-2)).value;
		E aDeE3b = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.equiv(aDeE3a, aDeE3b); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E2",8, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // E2 ::= E3 NONEQUIV E3 
            {
              E RESULT =null;
		E aDeE3a = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.elementAt(CUP$TinySyntaxAnalyzer$top-2)).value;
		E aDeE3b = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.nonEquiv(aDeE3a, aDeE3b); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E2",8, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // E2 ::= E3 
            {
              E RESULT =null;
		E aDeE3 = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=aDeE3; 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E2",8, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // E3 ::= E3 MULT E4 
            {
              E RESULT =null;
		E aDeE3 = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.elementAt(CUP$TinySyntaxAnalyzer$top-2)).value;
		E aDeE4 = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.mult(aDeE3, aDeE4); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E3",9, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // E3 ::= E3 DIV E4 
            {
              E RESULT =null;
		E aDeE3 = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.elementAt(CUP$TinySyntaxAnalyzer$top-2)).value;
		E aDeE4 = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.div(aDeE3, aDeE4); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E3",9, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // E3 ::= E4 
            {
              E RESULT =null;
		E aDeE4 = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=aDeE4; 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E3",9, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // E4 ::= NEG E4 
            {
              E RESULT =null;
		E aDeE4 = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.neg(aDeE4); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E4",10, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // E4 ::= NOT E5 
            {
              E RESULT =null;
		E aDeE5 = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.not(aDeE5); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E4",10, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // E4 ::= E5 
            {
              E RESULT =null;
		E aDeE5 = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=aDeE5; 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E4",10, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // E5 ::= OPPAR E0 CLPAR 
            {
              E RESULT =null;
		E aDeE0 = (E)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.elementAt(CUP$TinySyntaxAnalyzer$top-1)).value;
		 RESULT=aDeE0; 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E5",11, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // E5 ::= IDEN 
            {
              E RESULT =null;
		String lexDeIden = (String)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.id(lexDeIden); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E5",11, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // E5 ::= NUMREAL 
            {
              E RESULT =null;
		String lexDeNum = (String)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.numReal(lexDeNum); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E5",11, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // E5 ::= NUMINT 
            {
              E RESULT =null;
		String lexDeNum = (String)((java_cup.runtime.Symbol) CUP$TinySyntaxAnalyzer$stack.peek()).value;
		 RESULT=as.numInt(lexDeNum); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E5",11, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // E5 ::= TRUE 
            {
              E RESULT =null;
		 RESULT=as.eTrue(); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E5",11, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // E5 ::= FALSE 
            {
              E RESULT =null;
		 RESULT=as.eFalse(); 
              CUP$TinySyntaxAnalyzer$result = parser.getSymbolFactory().newSymbol("E5",11, RESULT);
            }
          return CUP$TinySyntaxAnalyzer$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$TinySyntaxAnalyzer$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$TinySyntaxAnalyzer$do_action(
    int                        CUP$TinySyntaxAnalyzer$act_num,
    java_cup.runtime.lr_parser CUP$TinySyntaxAnalyzer$parser,
    java.util.Stack            CUP$TinySyntaxAnalyzer$stack,
    int                        CUP$TinySyntaxAnalyzer$top)
    throws java.lang.Exception
    {
              return CUP$TinySyntaxAnalyzer$do_action_part00000000(
                               CUP$TinySyntaxAnalyzer$act_num,
                               CUP$TinySyntaxAnalyzer$parser,
                               CUP$TinySyntaxAnalyzer$stack,
                               CUP$TinySyntaxAnalyzer$top);
    }
}
