package tests;

import java.util.InputMismatchException;
import java.util.Scanner;

import geometry.Point;

public class PointTest {

	public static void main(String[] args) {
		Point p1 = new Point(3.0, 4.0);
		
		System.out.println("This is p1: " + p1);
		System.out.println();
		
		Point p2 = new Point();

		System.out.println("This is p2: " + p2);
		System.out.println();

		System.out.println("Are p1 and p2 equal? " + p1.equals(p2));
		System.out.println();

		Scanner kb = new Scanner(System.in);
		try{
			System.out.print("Enter new x and y coordinates for p2: ");
			p2.setX(kb.nextDouble());
			p2.setY(kb.nextDouble());
		}catch(InputMismatchException ex){
			System.out.println(ex.getMessage());
		}
		
		kb.close();
		
		System.out.println("Now, the coordinates of p2 are " + p2.getX() + 
				" and " + p2.getY());
		System.out.println();
		
		p2.move(5.0, 6.0);
		System.out.println("After moving p2...");
		System.out.println("This is p2: " + p2);
		System.exit(0);
	}

}
