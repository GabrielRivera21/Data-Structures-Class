/*
 * PostfixConverterMain.java
 * Gabriel Rivera Per-ossenkopp
 * 841-11-6930
 * Date: April 24, 2014
 * Description: Main Application of PostFixConverter class.
 * 
 */
package applications;

import java.util.Scanner;

public class PostfixConverterMain {

	//Starts main application
	public static void main(String[] args) {
		PostfixConverter converter = new PostfixConverter();
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter a valid Infix Expression: ");
		String expression = kb.nextLine();
		String postFix = converter.convert(expression);
		kb.close();

		System.out.println("This is the PostFix Expression");
		System.out.println(postFix);

		System.out.println("End of Application");
		System.exit(0);
	}

}
