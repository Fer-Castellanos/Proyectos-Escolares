package Unidad3;

import java.util.Stack;
/**
 * Write a description of class ExpressionTree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExpressionTree
{
    String datum;
	ExpressionTree left;
	ExpressionTree right;
	
	public ExpressionTree(){
		datum=null;
		left=null;
		right=null;
	}
	
	public void inorderPrint(ExpressionTree tree ) {
	      if ( tree != null ) { 
	         inorderPrint( tree.left );
	         System.out.print( tree.datum);
	         inorderPrint(tree.right);
	      }
	   } 
	   // end inorderPrint()
	
	public void expression(String s, int i, Stack<ExpressionTree> stack){
		ExpressionTree tree;
		char c;
		c=s.charAt(i);
		if (i==s.length()-1){//4*5<---
			if(Character.isDigit(c)){
				if(left==null){
					left=new ExpressionTree();
					left.datum=Character.toString(c);
					return;
				}
				else{
					right=new ExpressionTree();
					right.datum=Character.toString(c);
					return;
					}
				}//is digit
			else //not a digit, possibly a )
				return;
			}//length-1
		if(c==')'||c==' '){
			expression(s,i+1, stack);
		}
		if(c=='('){
			if(i==0)
				stack.push(this);
			if(left==null){
				left=new ExpressionTree();
				stack.push(left);
				left.expression(s,i+1, stack);
			}
			else{
				right=new ExpressionTree();
				stack.push(right);
				right.expression(s,i+1, stack);
			}
		}//parenthesis
		if(Character.isDigit(c)){
			if(left==null){
				left=new ExpressionTree();
				left.datum=Character.toString(c);
				expression(s,i+1, stack);
			}
			else{
				right=new ExpressionTree();
				right.datum=Character.toString(c);
				expression(s,i+1,stack);
			}
		}//operand
		if(c=='+'||c=='-'||c=='*'||c=='/'){
			if(stack.isEmpty()){ // ex. 4*5
				datum=Character.toString(c);
				expression(s,i+1,stack);
			}
			else{
				tree=(ExpressionTree) stack.pop();
				tree.datum=Character.toString(c);
				tree.expression(s,i+1,stack);
			}
		}
	}//expression
	
	public double calculate(){
		String s=datum;
		char c=s.charAt(0);
		//caso base
		if(Character.isDigit(c))
			return Double.parseDouble(String.valueOf(c));
		if(c=='+')
			return(left.calculate()+right.calculate());
		if(c=='-')
			return(left.calculate()-right.calculate());
		if(c=='*')
			return(left.calculate()*right.calculate());
		if(c=='/')
			return(left.calculate()/right.calculate());
		else
			return 0;
	}
}
