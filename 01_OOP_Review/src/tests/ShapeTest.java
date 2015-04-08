package tests;

import java.text.DecimalFormat;

import geometry.Shape;

public class ShapeTest {
	// Prints the data, area and perimeter of a shape.
	public static void print(Shape s) {
		DecimalFormat fmt = new DecimalFormat("#,##0.000");

		System.out.println("Data: " + s);
		System.out.println("Area: " + fmt.format(s.area()));
		System.out.println("Perimeter: " + fmt.format(s.perimeter()));
	}
}
