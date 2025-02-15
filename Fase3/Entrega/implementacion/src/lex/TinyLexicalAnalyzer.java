package lex;

import err.TinyErrorMgmt;

public class TinyLexicalAnalyzer implements java_cup.runtime.Scanner {
	private final int YY_BUFFER_SIZE = 512;
	private final int YY_F = -1;
	private final int YY_NO_STATE = -1;
	private final int YY_NOT_ACCEPT = 0;
	private final int YY_START = 1;
	private final int YY_END = 2;
	private final int YY_NO_ANCHOR = 4;
	private final int YY_BOL = 65536;
	private final int YY_EOF = 65537;

    private ALexOperations ops;
    private TinyErrorMgmt error;
    public String lexeme()      { return yytext();}
    public int row()            { return yyline+1;}
    public void setErrorMgmt(TinyErrorMgmt error){
	this.error = error;
    }
	private java.io.BufferedReader yy_reader;
	private int yy_buffer_index;
	private int yy_buffer_read;
	private int yy_buffer_start;
	private int yy_buffer_end;
	private char yy_buffer[];
	private int yyline;
	private boolean yy_at_bol;
	private int yy_lexical_state;

	public TinyLexicalAnalyzer (java.io.Reader reader) {
		this ();
		if (null == reader) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(reader);
	}

	public TinyLexicalAnalyzer (java.io.InputStream instream) {
		this ();
		if (null == instream) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(new java.io.InputStreamReader(instream));
	}

	private TinyLexicalAnalyzer () {
		yy_buffer = new char[YY_BUFFER_SIZE];
		yy_buffer_read = 0;
		yy_buffer_index = 0;
		yy_buffer_start = 0;
		yy_buffer_end = 0;
		yyline = 0;
		yy_at_bol = true;
		yy_lexical_state = YYINITIAL;

    ops = new ALexOperations(this);
	}

	private boolean yy_eof_done = false;
	private final int YYINITIAL = 0;
	private final int yy_state_dtrans[] = {
		0
	};
	private void yybegin (int state) {
		yy_lexical_state = state;
	}
	private int yy_advance ()
		throws java.io.IOException {
		int next_read;
		int i;
		int j;

		if (yy_buffer_index < yy_buffer_read) {
			return yy_buffer[yy_buffer_index++];
		}

		if (0 != yy_buffer_start) {
			i = yy_buffer_start;
			j = 0;
			while (i < yy_buffer_read) {
				yy_buffer[j] = yy_buffer[i];
				++i;
				++j;
			}
			yy_buffer_end = yy_buffer_end - yy_buffer_start;
			yy_buffer_start = 0;
			yy_buffer_read = j;
			yy_buffer_index = j;
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}

		while (yy_buffer_index >= yy_buffer_read) {
			if (yy_buffer_index >= yy_buffer.length) {
				yy_buffer = yy_double(yy_buffer);
			}
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}
		return yy_buffer[yy_buffer_index++];
	}
	private void yy_move_end () {
		if (yy_buffer_end > yy_buffer_start &&
		    '\n' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
		if (yy_buffer_end > yy_buffer_start &&
		    '\r' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
	}
	private boolean yy_last_was_cr=false;
	private void yy_mark_start () {
		int i;
		for (i = yy_buffer_start; i < yy_buffer_index; ++i) {
			if ('\n' == yy_buffer[i] && !yy_last_was_cr) {
				++yyline;
			}
			if ('\r' == yy_buffer[i]) {
				++yyline;
				yy_last_was_cr=true;
			} else yy_last_was_cr=false;
		}
		yy_buffer_start = yy_buffer_index;
	}
	private void yy_mark_end () {
		yy_buffer_end = yy_buffer_index;
	}
	private void yy_to_mark () {
		yy_buffer_index = yy_buffer_end;
		yy_at_bol = (yy_buffer_end > yy_buffer_start) &&
		            ('\r' == yy_buffer[yy_buffer_end-1] ||
		             '\n' == yy_buffer[yy_buffer_end-1] ||
		             2028/*LS*/ == yy_buffer[yy_buffer_end-1] ||
		             2029/*PS*/ == yy_buffer[yy_buffer_end-1]);
	}
	private java.lang.String yytext () {
		return (new java.lang.String(yy_buffer,
			yy_buffer_start,
			yy_buffer_end - yy_buffer_start));
	}
	private int yylength () {
		return yy_buffer_end - yy_buffer_start;
	}
	private char[] yy_double (char buf[]) {
		int i;
		char newbuf[];
		newbuf = new char[2*buf.length];
		for (i = 0; i < buf.length; ++i) {
			newbuf[i] = buf[i];
		}
		return newbuf;
	}
	private final int YY_E_INTERNAL = 0;
	private final int YY_E_MATCH = 1;
	private java.lang.String yy_error_string[] = {
		"Error: Internal error.\n",
		"Error: Unmatched input.\n"
	};
	private void yy_error (int code,boolean fatal) {
		java.lang.System.out.print(yy_error_string[code]);
		java.lang.System.out.flush();
		if (fatal) {
			throw new Error("Fatal Error.\n");
		}
	}
	private int[][] unpackFromString(int size1, int size2, String st) {
		int colonIndex = -1;
		String lengthString;
		int sequenceLength = 0;
		int sequenceInteger = 0;

		int commaIndex;
		String workString;

		int res[][] = new int[size1][size2];
		for (int i= 0; i < size1; i++) {
			for (int j= 0; j < size2; j++) {
				if (sequenceLength != 0) {
					res[i][j] = sequenceInteger;
					sequenceLength--;
					continue;
				}
				commaIndex = st.indexOf(',');
				workString = (commaIndex==-1) ? st :
					st.substring(0, commaIndex);
				st = st.substring(commaIndex+1);
				colonIndex = workString.indexOf(':');
				if (colonIndex == -1) {
					res[i][j]=Integer.parseInt(workString);
					continue;
				}
				lengthString =
					workString.substring(colonIndex+1);
				sequenceLength=Integer.parseInt(lengthString);
				workString=workString.substring(0,colonIndex);
				sequenceInteger=Integer.parseInt(workString);
				res[i][j] = sequenceInteger;
				sequenceLength--;
			}
		}
		return res;
	}
	private int yy_acpt[] = {
		/* 0 */ YY_NOT_ACCEPT,
		/* 1 */ YY_NO_ANCHOR,
		/* 2 */ YY_NO_ANCHOR,
		/* 3 */ YY_NO_ANCHOR,
		/* 4 */ YY_NO_ANCHOR,
		/* 5 */ YY_NO_ANCHOR,
		/* 6 */ YY_NO_ANCHOR,
		/* 7 */ YY_NO_ANCHOR,
		/* 8 */ YY_NO_ANCHOR,
		/* 9 */ YY_NO_ANCHOR,
		/* 10 */ YY_NO_ANCHOR,
		/* 11 */ YY_NO_ANCHOR,
		/* 12 */ YY_NO_ANCHOR,
		/* 13 */ YY_NO_ANCHOR,
		/* 14 */ YY_NO_ANCHOR,
		/* 15 */ YY_NO_ANCHOR,
		/* 16 */ YY_NO_ANCHOR,
		/* 17 */ YY_NO_ANCHOR,
		/* 18 */ YY_NO_ANCHOR,
		/* 19 */ YY_NO_ANCHOR,
		/* 20 */ YY_NO_ANCHOR,
		/* 21 */ YY_NO_ANCHOR,
		/* 22 */ YY_NO_ANCHOR,
		/* 23 */ YY_NO_ANCHOR,
		/* 24 */ YY_NO_ANCHOR,
		/* 25 */ YY_NO_ANCHOR,
		/* 26 */ YY_NO_ANCHOR,
		/* 27 */ YY_NO_ANCHOR,
		/* 28 */ YY_NO_ANCHOR,
		/* 29 */ YY_NO_ANCHOR,
		/* 30 */ YY_NO_ANCHOR,
		/* 31 */ YY_NO_ANCHOR,
		/* 32 */ YY_NOT_ACCEPT,
		/* 33 */ YY_NO_ANCHOR,
		/* 34 */ YY_NO_ANCHOR,
		/* 35 */ YY_NO_ANCHOR,
		/* 36 */ YY_NOT_ACCEPT,
		/* 37 */ YY_NO_ANCHOR,
		/* 38 */ YY_NO_ANCHOR,
		/* 39 */ YY_NOT_ACCEPT,
		/* 40 */ YY_NO_ANCHOR,
		/* 41 */ YY_NOT_ACCEPT,
		/* 42 */ YY_NO_ANCHOR,
		/* 43 */ YY_NOT_ACCEPT,
		/* 44 */ YY_NO_ANCHOR,
		/* 45 */ YY_NO_ANCHOR,
		/* 46 */ YY_NO_ANCHOR,
		/* 47 */ YY_NO_ANCHOR,
		/* 48 */ YY_NO_ANCHOR,
		/* 49 */ YY_NO_ANCHOR,
		/* 50 */ YY_NO_ANCHOR,
		/* 51 */ YY_NO_ANCHOR,
		/* 52 */ YY_NO_ANCHOR,
		/* 53 */ YY_NO_ANCHOR,
		/* 54 */ YY_NO_ANCHOR,
		/* 55 */ YY_NO_ANCHOR,
		/* 56 */ YY_NO_ANCHOR,
		/* 57 */ YY_NO_ANCHOR,
		/* 58 */ YY_NO_ANCHOR,
		/* 59 */ YY_NO_ANCHOR,
		/* 60 */ YY_NO_ANCHOR,
		/* 61 */ YY_NO_ANCHOR
	};
	private int yy_cmap[] = unpackFromString(1,65538,
"35:8,1:3,35:2,1,35:18,1,24,35:4,15,35,25,26,19,17,32,18,33,20,30,29:9,35,14" +
",23,16,22,35:2,27:4,34,27:21,35:4,31,35,4,9,28,21,3,12,28:2,6,28:2,5,28,7,1" +
"0,28:2,2,13,8,11,28:5,35:65413,0:2")[0];

	private int yy_rmap[] = unpackFromString(1,62,
"0,1:2,2,1,3,4,5:2,1:2,6,7,1:2,8,9,10,1:5,10:3,11,12,10:4,9,5,13,14,15,16,1," +
"17,18,19,20,21,22,23,24,25,26,27,28,29,10,30,31,32,33,34,10,35,36,37")[0];

	private int yy_nxt[][] = unpackFromString(38,36,
"1,2,3,58,48,58,49,50,59,60,34,58,61,58,4,5,6,7,8,9,10,58,11,12,35,13,14,58:" +
"2,15,16,38,33,38,58,38,-1:38,58,51,58:10,-1:7,58,-1:5,52,58,53:3,-1:2,52,-1" +
":16,18,-1:36,19,-1:48,15,32,-1:21,20,-1:35,21,-1:22,36,-1:25,15:2,-1,36,39," +
"36,-1:34,39,-1:4,58:12,-1:7,58,-1:5,52,58,53:3,-1:2,52,-1:30,26:2,-1:8,36,-" +
"1:25,27,43,-1,36,-1,36,-1:3,17,58:11,-1:7,58,-1:5,52,58,53:3,-1:2,52,-1:17," +
"22,-1:36,41:2,-1:10,26,-1:2,41,-1:5,58:12,-1:7,23,-1:5,52,58,53:3,-1:2,52,-" +
"1:30,27:2,-1:7,58:6,24,58:5,-1:7,58,-1:5,52,58,53:3,-1:2,52,-1:30,26,-1:8,5" +
"8:6,25,58:5,-1:7,58,-1:5,52,58,53:3,-1:2,52,-1:30,27,43,-1:7,58:3,28,58:8,-" +
"1:7,58,-1:5,52,58,53:3,-1:2,52,-1:3,58,29,58:10,-1:7,58,-1:5,52,58,53:3,-1:" +
"2,52,-1:3,58:3,30,58:8,-1:7,58,-1:5,52,58,53:3,-1:2,52,-1:3,58,31,58:10,-1:" +
"7,58,-1:5,52,58,53:3,-1:2,52,-1:3,58:5,37,58:6,-1:7,58,-1:5,52,58,53:3,-1:2" +
",52,-1:3,58:5,40,58:6,-1:7,58,-1:5,52,58,53:3,-1:2,52,-1:3,58:8,42,58:3,-1:" +
"7,58,-1:5,52,58,53:3,-1:2,52,-1:3,58:2,44,58:9,-1:7,58,-1:5,52,58,53:3,-1:2" +
",52,-1:3,53:12,-1:7,53,-1:5,53:5,-1:2,53,-1:3,58:9,45,58:2,-1:7,58,-1:5,52," +
"58,53:3,-1:2,52,-1:3,58:8,46,58:3,-1:7,58,-1:5,52,58,53:3,-1:2,52,-1:3,58:3" +
",57,58:8,-1:7,58,-1:5,52,58,53:3,-1:2,52,-1:3,58:11,47,-1:7,58,-1:5,52,58,5" +
"3:3,-1:2,52,-1:3,54,58:11,-1:7,58,-1:5,52,58,53:3,-1:2,52,-1:3,58:8,55,58:3" +
",-1:7,58,-1:5,52,58,53:3,-1:2,52,-1:3,58:2,56,58:9,-1:7,58,-1:5,52,58,53:3," +
"-1:2,52,-1");

	public java_cup.runtime.Symbol next_token ()
		throws java.io.IOException {
		int yy_lookahead;
		int yy_anchor = YY_NO_ANCHOR;
		int yy_state = yy_state_dtrans[yy_lexical_state];
		int yy_next_state = YY_NO_STATE;
		int yy_last_accept_state = YY_NO_STATE;
		boolean yy_initial = true;
		int yy_this_accept;

		yy_mark_start();
		yy_this_accept = yy_acpt[yy_state];
		if (YY_NOT_ACCEPT != yy_this_accept) {
			yy_last_accept_state = yy_state;
			yy_mark_end();
		}
		while (true) {
			if (yy_initial && yy_at_bol) yy_lookahead = YY_BOL;
			else yy_lookahead = yy_advance();
			yy_next_state = YY_F;
			yy_next_state = yy_nxt[yy_rmap[yy_state]][yy_cmap[yy_lookahead]];
			if (YY_EOF == yy_lookahead && true == yy_initial) {

        return ops.unitEOF();
			}
			if (YY_F != yy_next_state) {
				yy_state = yy_next_state;
				yy_initial = false;
				yy_this_accept = yy_acpt[yy_state];
				if (YY_NOT_ACCEPT != yy_this_accept) {
					yy_last_accept_state = yy_state;
					yy_mark_end();
				}
			}
			else {
				if (YY_NO_STATE == yy_last_accept_state) {
					throw (new Error("Lexical Error: Unmatched Input."));
				}
				else {
					yy_anchor = yy_acpt[yy_last_accept_state];
					if (0 != (YY_END & yy_anchor)) {
						yy_move_end();
					}
					yy_to_mark();
					switch (yy_last_accept_state) {
					case 1:
						
					case -2:
						break;
					case 2:
						{}
					case -3:
						break;
					case 3:
						{return ops.unitVar();}
					case -4:
						break;
					case 4:
						{return ops.unitSC();}
					case -5:
						break;
					case 5:
						{error.lexicalError(row(), lexeme());; }
						break;
					case -6:
						break;
					case 6:
						{return ops.unitEqual();}
					case -7:
						break;
					case 7:
						{return ops.unitPlus();}
					case -8:
						break;
					case 8:
						{return ops.unitMinus();}
					case -9:
						break;
					case 9:
						{return ops.unitMult();}
					case -10:
						break;
					case 10:
						{return ops.unitDiv();}
					case -11:
						break;
					case 11:
						{return ops.unitMayor();}
					case -12:
						break;
					case 12:
						{return ops.unitMinor();}
					case -13:
						break;
					case 13:
						{return ops.unitOpenPar();}
					case -14:
						break;
					case 14:
						{return ops.unitClosePar();}
					case -15:
						break;
					case 15:
						{return ops.unitNumInt();}
					case -16:
						break;
					case 16:
						{return ops.unitNumInt();}
					case -17:
						break;
					case 17:
						{return ops.unitOr();}
					case -18:
						break;
					case 18:
						{return ops.unitEnd();}
					case -19:
						break;
					case 19:
						{return ops.unitEquiv();}
					case -20:
						break;
					case 20:
						{return ops.unitMayorEqual();}
					case -21:
						break;
					case 21:
						{return ops.unitMinorEqual();}
					case -22:
						break;
					case 22:
						{return ops.unitDisequiv();}
					case -23:
						break;
					case 23:
						{return ops.unitAnd();}
					case -24:
						break;
					case 24:
						{return ops.unitInt();}
					case -25:
						break;
					case 25:
						{return ops.unitNot();}
					case -26:
						break;
					case 26:
						{return ops.unitNumReal();}
					case -27:
						break;
					case 27:
						{return ops.unitNumReal();}
					case -28:
						break;
					case 28:
						{return ops.unitReal();}
					case -29:
						break;
					case 29:
						{return ops.unitTrue();}
					case -30:
						break;
					case 30:
						{return ops.unitBool();}
					case -31:
						break;
					case 31:
						{return ops.unitFalse();}
					case -32:
						break;
					case 33:
						{}
					case -33:
						break;
					case 34:
						{return ops.unitVar();}
					case -34:
						break;
					case 35:
						{error.lexicalError(row(), lexeme());; }
						break;
					case -35:
						break;
					case 37:
						{return ops.unitVar();}
					case -36:
						break;
					case 38:
						{error.lexicalError(row(), lexeme());; }
					case -37:
						break;
					case 40:
						{return ops.unitVar();}
					case -38:
						break;
					case 42:
						{return ops.unitVar();}
					case -39:
						break;
					case 44:
						{return ops.unitVar();}
					case -40:
						break;
					case 45:
						{return ops.unitVar();}
					case -41:
						break;
					case 46:
						{return ops.unitVar();}
					case -42:
						break;
					case 47:
						{return ops.unitVar();}
					case -43:
						break;
					case 48:
						{return ops.unitVar();}
					case -44:
						break;
					case 49:
						{return ops.unitVar();}
					case -45:
						break;
					case 50:
						{return ops.unitVar();}
					case -46:
						break;
					case 51:
						{return ops.unitVar();}
					case -47:
						break;
					case 52:
						{return ops.unitVar();}
					case -48:
						break;
					case 53:
						{return ops.unitVar();}
					case -49:
						break;
					case 54:
						{return ops.unitVar();}
					case -50:
						break;
					case 55:
						{return ops.unitVar();}
					case -51:
						break;
					case 56:
						{return ops.unitVar();}
					case -52:
						break;
					case 57:
						{return ops.unitVar();}
					case -53:
						break;
					case 58:
						{return ops.unitVar();}
					case -54:
						break;
					case 59:
						{return ops.unitVar();}
					case -55:
						break;
					case 60:
						{return ops.unitVar();}
					case -56:
						break;
					case 61:
						{return ops.unitVar();}
					case -57:
						break;
					default:
						yy_error(YY_E_INTERNAL,false);
					case -1:
					}
					yy_initial = true;
					yy_state = yy_state_dtrans[yy_lexical_state];
					yy_next_state = YY_NO_STATE;
					yy_last_accept_state = YY_NO_STATE;
					yy_mark_start();
					yy_this_accept = yy_acpt[yy_state];
					if (YY_NOT_ACCEPT != yy_this_accept) {
						yy_last_accept_state = yy_state;
						yy_mark_end();
					}
				}
			}
		}
	}
}