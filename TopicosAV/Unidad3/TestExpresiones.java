package Unidad3;
import java.util.Stack;

/**
 * Write a description of class TestExpresiones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestExpresiones
{
    public static void main(String[] args) {
		Stack<ExpressionTree> stack=new Stack<ExpressionTree>();
		ExpressionTree t=new ExpressionTree();
		String st="(3*((7+1)/4))+(8-5)"; //(3*((7+1)/4))+(8-5)
		t.expression(st,0,stack);
		t.inorderPrint(t);
		System.out.println("\n"+t.calculate());

	}

}