package tests;

import java.util.Scanner;

import geometry.Color;
import geometry.Point;
import geometry.Rectangle;
public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r1 = new Rectangle(Color.BLUE, new Point(3.0, 4.0), 5.0, 6.0);
		
		System.out.println("This is r1...");
		ShapeTest.print(r1);
		System.out.println();

		Rectangle r2 = new Rectangle();
		
		System.out.println("This is r2...");
		ShapeTest.print(r2);
		System.out.println();
		
		System.out.println("Are r1 and r2 equal? " + r1.equals(r2));
		System.out.println();

		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a new width for r2: ");
		r2.setWidth(kb.nextDouble());
		
		System.out.println("\tWidth set to " + r2.getWidth());
		System.out.println();
		
		System.out.print("Enter a new height for r2: ");
		r2.setHeight(kb.nextDouble());
		
		System.out.println("\tHeight set to " + r2.getHeight());
		System.out.println();		
		
		kb.close();
		
		System.out.println("Now, this is r2...");
		ShapeTest.print(r2);
		System.exit(0);
	}

}
