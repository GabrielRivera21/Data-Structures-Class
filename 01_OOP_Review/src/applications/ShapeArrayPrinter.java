package applications;

import geometry.Circle;
import geometry.Color;
import geometry.Point;
import geometry.Rectangle;
import geometry.Shape;

import java.text.DecimalFormat;

public class ShapeArrayPrinter {

	// Serves as the entry point for this application.
	public static void main(String[] args) {
		Shape[] list = new Shape[5];

		list[0] = new Circle(Color.YELLOW, new Point(2.0, 1.0), 5.0);
		list[1] = new Rectangle(Color.BLUE, new Point(3.0, 4.0), 7.0, 6.0);
		list[2] = new Circle();
		list[3] = new Rectangle(Color.RED, new Point(7.0, 3.0), 1.0, 2.0);
		list[4] = new Rectangle();

		DecimalFormat threePlaces = new DecimalFormat("#,##0.000");
		System.out.println("These are the shapes...");
		for (Shape element : list) {
			System.out.println("Type: " + element.getClass().getSimpleName());
			System.out.println("Data: " + element);
			System.out.println("Area: " + threePlaces.format(element.area()));
			System.out.println("Perimeter: " + threePlaces.format(element.perimeter()));
			System.out.println();
		}
		System.exit(0);
	}

}

