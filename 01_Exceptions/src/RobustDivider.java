import java.util.InputMismatchException;
import java.util.Scanner;


public class RobustDivider {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		boolean error = false;
		
		do {
			try {
				System.out.print("Enter two integers: ");
				int num1 = kb.nextInt();
				int num2 = kb.nextInt();
				
				int quo = num1 / num2;
				int rem = num1 % num2;
				
				error = false;
				System.out.println();
				System.out.println("The quotient is " + quo);
				System.out.println("The remainder is " + rem);
			}
			catch (InputMismatchException ex) {
				kb.nextLine();        // empty keyboard buffer
				error = true;
				System.out.println("\tError: not an integer\n");
			}
			catch (ArithmeticException ex) {
				error = true;
				System.out.println("\tError: " + ex.getMessage() + "\n");
			}
		} while (error);		
		kb.close();
		System.exit(0);
	}

}
