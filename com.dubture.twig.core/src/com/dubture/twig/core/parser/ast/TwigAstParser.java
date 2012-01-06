
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri Jan 06 18:34:42 CET 2012
//----------------------------------------------------

package com.dubture.twig.core.parser.ast;

import java.util.LinkedList;
import java.util.List;
import com.dubture.twig.core.parser.ast.node.TwigModuleDeclaration;
import com.dubture.twig.core.parser.ast.node.BlockStatement;
import com.dubture.twig.core.parser.ast.node.Variable;
import com.dubture.twig.core.parser.ast.node.PrintStatement;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Statement;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri Jan 06 18:34:42 CET 2012
  */
public class TwigAstParser extends AbstractAstParser {

  /** Default constructor. */
  public TwigAstParser() {super();}

  /** Constructor which sets the default scanner. */
  public TwigAstParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public TwigAstParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\015\000\002\002\003\000\002\002\004\000\002\005" +
    "\004\000\002\005\002\000\002\006\003\000\002\006\003" +
    "\000\002\006\003\000\002\004\005\000\002\003\006\000" +
    "\002\007\004\000\002\007\002\000\002\010\003\000\002" +
    "\011\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\022\000\012\002\ufffe\007\ufffe\011\ufffe\015\ufffe\001" +
    "\002\000\004\002\024\001\002\000\012\002\001\007\011" +
    "\011\006\015\010\001\002\000\004\020\021\001\002\000" +
    "\012\002\ufffc\007\ufffc\011\ufffc\015\ufffc\001\002\000\016" +
    "\002\ufff5\007\ufff5\010\ufff5\011\ufff5\012\ufff5\015\ufff5\001" +
    "\002\000\006\010\ufff7\015\ufff7\001\002\000\012\002\ufffd" +
    "\007\ufffd\011\ufffd\015\ufffd\001\002\000\012\002\ufffb\007" +
    "\ufffb\011\ufffb\015\ufffb\001\002\000\012\002\uffff\007\uffff" +
    "\011\uffff\015\uffff\001\002\000\006\010\017\015\010\001" +
    "\002\000\010\010\ufff8\012\ufff8\015\ufff8\001\002\000\012" +
    "\002\ufffa\007\ufffa\011\ufffa\015\ufffa\001\002\000\010\010" +
    "\ufff6\012\ufff6\015\ufff6\001\002\000\006\012\ufff7\015\ufff7" +
    "\001\002\000\006\012\023\015\010\001\002\000\012\002" +
    "\ufff9\007\ufff9\011\ufff9\015\ufff9\001\002\000\004\002\000" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\022\000\006\002\003\005\004\001\001\000\002\001" +
    "\001\000\012\003\012\004\006\006\013\011\011\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\007\014\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\010\015\011\017\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\007\021\001\001\000\006\010\015\011\017\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$TwigAstParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$TwigAstParser$actions(this);
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
    return action_obj.CUP$TwigAstParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    
    /* Change the method report_error so it will display the line and
       column of where the error occurred in the input as well as the
       reason for the error which is passed into the method in the
       String 'message'. */
    public void report_error(String message, Object info) {
   
        /* Create a StringBuffer called 'm' with the string 'Error' in it. */
        StringBuffer m = new StringBuffer("Error");
   
        /* Check if the information passed to the method is the same
           type as the type java_cup.runtime.Symbol. */
        if (info instanceof java_cup.runtime.Symbol) {
            /* Declare a java_cup.runtime.Symbol object 's' with the
               information in the object info that is being typecasted
               as a java_cup.runtime.Symbol object. */
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
   
            /* Check if the line number in the input is greater or
               equal to zero. */
            if (s.left >= 0) {                
                /* Add to the end of the StringBuffer error message
                   the line number of the error in the input. */
                m.append(" in line "+(s.left+1));   
                /* Check if the column number in the input is greater
                   or equal to zero. */
                if (s.right >= 0)                    
                    /* Add to the end of the StringBuffer error message
                       the column number of the error in the input. */
                    m.append(", column "+(s.right+1));
            }
        }
   
        /* Add to the end of the StringBuffer error message created in
           this method the message that was passed into this method. */
        m.append(" : "+message);
   
        /* Print the contents of the StringBuffer 'm', which contains
           an error message, out on a line. */
        System.err.println(m + " tralala");
    }
   
    /* Change the method report_fatal_error so when it reports a fatal
       error it will display the line and column number of where the
       fatal error occurred in the input as well as the reason for the
       fatal error which is passed into the method in the object
       'message' and then exit.*/
    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
       
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$TwigAstParser$actions {
  private final TwigAstParser parser;

  /** Constructor */
  CUP$TwigAstParser$actions(TwigAstParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$TwigAstParser$do_action(
    int                        CUP$TwigAstParser$act_num,
    java_cup.runtime.lr_parser CUP$TwigAstParser$parser,
    java.util.Stack            CUP$TwigAstParser$stack,
    int                        CUP$TwigAstParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$TwigAstParser$result;

      /* select the action based on the action number */
      switch (CUP$TwigAstParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // statement ::= T_VARIABLE 
            {
              Statement RESULT =null;
		int stmtleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).left;
		int stmtright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).right;
		String stmt = (String)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.peek()).value;
		 
					        RESULT = new Variable(stmtleft, stmtright, stmt); 
					    
              CUP$TwigAstParser$result = parser.getSymbolFactory().newSymbol("statement",7, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // inner_statement ::= statement 
            {
              Statement RESULT =null;
		int statementleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).left;
		int statementright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).right;
		Statement statement = (Statement)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.peek()).value;
		 
					        RESULT = statement; 
					    
              CUP$TwigAstParser$result = parser.getSymbolFactory().newSymbol("inner_statement",6, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // inner_statement_list ::= 
            {
              List RESULT =null;
		 
					        RESULT = new LinkedList(); 
					    
              CUP$TwigAstParser$result = parser.getSymbolFactory().newSymbol("inner_statement_list",5, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // inner_statement_list ::= inner_statement_list inner_statement 
            {
              List RESULT =null;
		int statementListleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).left;
		int statementListright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).right;
		List statementList = (List)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).value;
		int statementleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).left;
		int statementright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).right;
		Statement statement = (Statement)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.peek()).value;
		
							// Ignore null statements
							if(statement != null) {
							    statementList.add(statement);
							}
							RESULT = statementList;
					    
              CUP$TwigAstParser$result = parser.getSymbolFactory().newSymbol("inner_statement_list",5, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)), ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // block ::= TWIG_STMT_OPEN T_BLOCK_NAME inner_statement_list TWIG_STMT_CLOSE 
            {
              BlockStatement RESULT =null;
		int startleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-3)).left;
		int startright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-3)).right;
		Object start = (Object)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-3)).value;
		int nameleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-2)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-2)).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-2)).value;
		int innerleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).left;
		int innerright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).right;
		List inner = (List)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).left;
		int endright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.peek()).value;
		
		                	BlockStatement stmt = new BlockStatement(startleft, endright, name, inner);
		                    RESULT = stmt;
		                
              CUP$TwigAstParser$result = parser.getSymbolFactory().newSymbol("block",1, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-3)), ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // var ::= TWIG_VAR_OPEN inner_statement_list TWIG_VAR_CLOSE 
            {
              PrintStatement RESULT =null;
		int startleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-2)).left;
		int startright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-2)).right;
		Object start = (Object)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-2)).value;
		int innerleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).left;
		int innerright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).right;
		List inner = (List)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).left;
		int endright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.peek()).value;
		
							PrintStatement stmt = new PrintStatement(startleft, endright, inner);
							RESULT = stmt;
						
              CUP$TwigAstParser$result = parser.getSymbolFactory().newSymbol("var",2, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-2)), ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // top_statement ::= block 
            {
              Statement RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).right;
		BlockStatement b = (BlockStatement)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.peek()).value;
		
							RESULT = b; 
						
              CUP$TwigAstParser$result = parser.getSymbolFactory().newSymbol("top_statement",4, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // top_statement ::= var 
            {
              Statement RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).right;
		PrintStatement v = (PrintStatement)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.peek()).value;
		
							RESULT = v; 
						
              CUP$TwigAstParser$result = parser.getSymbolFactory().newSymbol("top_statement",4, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // top_statement ::= statement 
            {
              Statement RESULT =null;
		int statementleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).left;
		int statementright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).right;
		Statement statement = (Statement)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.peek()).value;
		
							RESULT = statement;
						
              CUP$TwigAstParser$result = parser.getSymbolFactory().newSymbol("top_statement",4, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // top_statement_list ::= 
            {
              List RESULT =null;
		 
							RESULT = new LinkedList();
						
              CUP$TwigAstParser$result = parser.getSymbolFactory().newSymbol("top_statement_list",3, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // top_statement_list ::= top_statement_list top_statement 
            {
              List RESULT =null;
		int sListleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).left;
		int sListright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).right;
		List sList = (List)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).value;
		int statementleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).left;
		int statementright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).right;
		Statement statement = (Statement)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.peek()).value;
		
							if(statement != null) {
								sList.add(statement);
							}
							RESULT = sList;
						
              CUP$TwigAstParser$result = parser.getSymbolFactory().newSymbol("top_statement_list",3, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)), ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), RESULT);
            }
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= module EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).right;
		TwigModuleDeclaration start_val = (TwigModuleDeclaration)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)).value;
		RESULT = start_val;
              CUP$TwigAstParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.elementAt(CUP$TwigAstParser$top-1)), ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$TwigAstParser$parser.done_parsing();
          return CUP$TwigAstParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // module ::= top_statement_list 
            {
              TwigModuleDeclaration RESULT =null;
		int sListleft = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).left;
		int sListright = ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()).right;
		List sList = (List)((java_cup.runtime.Symbol) CUP$TwigAstParser$stack.peek()).value;
		                 
                    		TwigModuleDeclaration module = parser.getModuleDeclaration();
                    		module.setStatements(sList);
                    		System.err.println("create module...");
                    		RESULT = module;
                 		
              CUP$TwigAstParser$result = parser.getSymbolFactory().newSymbol("module",0, ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$TwigAstParser$stack.peek()), RESULT);
            }
          return CUP$TwigAstParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

