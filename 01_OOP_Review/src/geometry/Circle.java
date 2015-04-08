package geometry;

public class Circle extends Shape {
	
	private double radius = 1.0;
	
	
	public Circle(Color color, Point location, double radius) {
		super(color, location);
		this.radius = radius;
	}
	
	public Circle(){
		super();
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius<0)
			throw new InvalidRadiusException("Negative Radius");
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2.0);
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}
	
	@Override
	public boolean equals(Object obj){
		if(!super.equals(obj) && (obj instanceof Circle))
			return false;
		Circle other = (Circle) obj;
		return this.radius == other.radius;
		
	}
	
	@Override
	public String toString() {
		return super.toString() + ", radius=" + radius ;
	}
	
	

}
