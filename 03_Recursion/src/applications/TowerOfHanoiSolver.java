/*
 * TowerOfHanoiSolver.java
 * By Antonio F. Huertas
 * Application that solves the Tower of Hanoi game.
 */

package applications;

import java.util.Scanner;

public class TowerOfHanoiSolver {

	// Serves as the entry point for the application.
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number of discs: ");
		int numDiscs = kb.nextInt();
		kb.close();

		if (numDiscs < 1) {
			System.err.println("Fatal error: Cannot move less than 1 disc.");
			System.exit(1);  // exit with an error status code
		}
		TowerOfHanoi game = new TowerOfHanoi(numDiscs);
		game.solve();
		
		System.out.println("Steps to solve with " + numDiscs + " discs...");
		System.out.println(game);
		
		System.out.println("End of game.");
		System.exit(0);
	}

}