/**
 * PostfixConverter.java
 * Gabriel Rivera Per-ossenkopp
 * 841-11-6930
 * Date: April 24, 2014
 * Description: This program converts an Infix expression to a Postfix expression
 */
package applications;

import java.util.Scanner;

import datastructures.ArrayStack;
import datastructures.Stack;

public class PostfixConverter {
	
	public PostfixConverter() {}
	
	//Converts an infix expression into a Post fix Expression
	public String convert(String expression){
		//Initializes postFix to empty String and also the Stack
		String postFixExp = "";
		Stack<String> stackOperators = new ArrayStack<>();
		//Starts scanning the expression
		Scanner tokenizer = new Scanner(expression);
		while(tokenizer.hasNext()){
			String token = tokenizer.next();
			
			if(!isOperator(token) && !token.equals("(") && !token.equals(")")){
				postFixExp += token + " "; //appends operand
			}else if(token.equals("(")){
				stackOperators.push(token); //push to stack left parenthesis
			}else if(token.equals(")")){
				while(!stackOperators.peek().equals("(")){
					postFixExp += stackOperators.pop() + " "; //appends operators until it finds left parenthesis
				}
				stackOperators.pop();  // pops left parenthesis
			}else if(isOperator(token)){
				while(!stackOperators.isEmpty() && !stackOperators.peek().equals("(") && 
						precedence(token) <= precedence(stackOperators.peek())){
					postFixExp += stackOperators.pop() + " "; //appends operators to postFix Expression
				}
				stackOperators.push(token); //push the operators to stack
			}
		}
		while(!stackOperators.isEmpty())
			postFixExp += stackOperators.pop() + " "; //appends the operators
		tokenizer.close(); // Closes the Scanner
		return postFixExp; //returns postFix expression
	}
	
	//Determines if its an operator
	private boolean isOperator(String token) {
		return (token.equals("+") || token.equals("-") || 
				token.equals("*") || token.equals("/"));
	}
	
	//Shows order of precedence of operators
	private int precedence(String operator){
		switch(operator){
			case "*":
			case "/":
					return 2;
			case "+":
			case "-":
					return 1;
			default:
					return 0;
		}
	}
}
