package tests;

import java.util.Scanner;

import geometry.Circle;
import geometry.Color;
import geometry.Point;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(Color.BLUE, new Point(3.0, 4.0), 5.0);
		
		System.out.println("This is c1...");
		ShapeTest.print(c1);
		System.out.println();

		Circle c2 = new Circle();

		System.out.println("This is c2...");
		ShapeTest.print(c2);
		System.out.println();

		System.out.println("Are c1 and c2 equal? " + c1.equals(c2));
		System.out.println();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a new radius for c2: ");
		c2.setRadius(kb.nextDouble());
		
		System.out.println("\tRadius set to " + c2.getRadius());
		System.out.println();
		
		kb.close();
		
		System.out.println("Now, this is c2...");
		ShapeTest.print(c2);
		System.out.println();
		c2.move(3,5);
		System.out.println("After moving c2...");
		System.out.println("Now, this is c2...");
		ShapeTest.print(c2);
		System.exit(0);
	}

}
