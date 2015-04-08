/*
 * PostfixEvaluator.java
 * This class represents an evaluator of postfix expressions. It
 * assumes the operands are numeric literals.
 */

package applications;

import datastructures.Stack;
import datastructures.ArrayStack;

import java.util.Scanner;

public class PostfixEvaluator {

	// Field for the stack where operands are placed
	private Stack<Integer> operands = new ArrayStack<>();

	// Evaluates the specified postfix expression.
	public int evaluate(String expr) {
		int result = 0;
		Scanner tokenizer = new Scanner(expr);

		while (tokenizer.hasNext()) {
			String token = tokenizer.next();

			if (isOperator(token)) {
				int operand2 = operands.pop();
				int operand1 = operands.pop();
				result = evaluateOperator(token, operand1, operand2);
				operands.push(result);
			}
			else
				operands.push(Integer.parseInt(token));
		}
		tokenizer.close();
		return result;
	}

	// Determines if the specified token is an operator.
	private boolean isOperator(String token) {
		return (token.equals("+") || token.equals("-") || 
				token.equals("*") || token.equals("/"));
	}

	// Evaluates a single subexpression consisting of the given operator 
	// and its operands.
	private int evaluateOperator(String operator, 
			int operand1, int operand2) {

		switch (operator) {
		case "+":
			return operand1 + operand2;
		case "-":
			return operand1 - operand2;
		case "*":
			return operand1 * operand2;
		case "/":
			return operand1 / operand2;
		default:
			return 0;
		}
	}

	// Serves as a tester application.
	public static void main(String[] args) {
		PostfixEvaluator evaluator = new PostfixEvaluator();
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a valid postfix expression: ");
		String expression = keyboard.nextLine();
		System.out.println();

		double result = evaluator.evaluate(expression);
		System.out.println("The expression equals " + result);
		System.out.println();

		keyboard.close();
		System.out.println("Thanks for using this program.");
	}

}