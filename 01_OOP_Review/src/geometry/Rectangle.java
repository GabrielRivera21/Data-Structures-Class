package geometry;

public class Rectangle extends Shape{
	// Fields for the width and height of this rectangle
		private double width = 1.0, height = 1.0;

		// Creates a new rectangle with the given values.
		// Precondition: width and height are non-negative
		public Rectangle(Color color, Point location, double width, double height) {
			super(color, location);
			this.width = width;
			this.height = height;
		}

		// Creates a new rectangle with the default values.
		public Rectangle() {
			super();
		}

		// Returns the width of this rectangle.
		public double getWidth() {
			return width;
		}

		// Sets the width of this rectangle to the given value.
		public void setWidth(double width) {
			this.width = width;
		}

		// Returns the height of this rectangle.
		public double getHeight() {
			return height;
		}

		// Sets the height of this rectangle to the given value.
		public void setHeight(double height) {
			this.height = height;
		}
		
		// Returns the area of this rectangle.
		@Override
		public double area() {
			return width * height;
		}

		// Returns the perimeter of this rectangle.
		@Override
		public double perimeter() {
			return 2 * (width + height);
		}

		// Returns true if this rectangle has the same data as the given rectangle.
		@Override
		public boolean equals(Object obj) {
			if (!super.equals(obj) || !(obj instanceof Rectangle))
				return false;
			Rectangle other = (Rectangle)obj;
			return this.width == other.width && this.height == other.height;
		}

		// Returns a string representation of this rectangle.
		@Override
		public String toString() {
			return super.toString() + ", width=" + width + ", height=" + height;
		}

}
