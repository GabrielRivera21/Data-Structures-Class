/*
 * TowerOfHanoi.java
 * By Antonio F. Huertas
 * Class that solves the Towers of Hanoi game.
 * 
 * Description of the game:
 * In this game, there are three pegs and the first one contains
 * a set of discs stacked in order of size, with the largest one
 * at the bottom.  The goal of the game is to move all the discs
 * from the first peg to the last one, using the middle one as a
 * temporary holder.
 * 
 * Rules:
 * 1. Only one disk may be moved at a time.
 * 2. A disk cannot be placed on top of a smaller disc.
 * 3. All discs must be stored on a peg except while being moved.
 */

package applications;

public class TowerOfHanoi {

	// Fields for the number of discs to move and the steps it takes
	private int discs;
	private boolean solved = false;
	private String steps = "";

	// Creates a new game with the given number of discs.
	public TowerOfHanoi(int discs) {
		this.discs = discs;
	}

	// Solves this game by moving the discs.
	public void solve() {
		moveDiscs(discs, 1, 2, 3);
		solved = true;
	}

	// Moves the discs from the first to the last peg, using a temporary
	// peg as needed.
	private void moveDiscs(int num, int startPeg, int tempPeg, int endPeg) {
		if (num == 1)
			steps += "Move a disc from peg " + startPeg +
					" to peg " + endPeg + "\n";
		else {
			moveDiscs(num - 1, startPeg, endPeg, tempPeg);
			steps += "Move a disc from peg " + startPeg +
					" to peg " + endPeg + "\n";
			moveDiscs(num - 1, tempPeg, startPeg, endPeg);
		}
	}

	// Returns the string representation of this game.
	@Override
	public String toString() {
		return solved? steps : "Call solve method\n";
	}

}