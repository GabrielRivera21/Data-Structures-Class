package geometry;

public abstract class Shape implements Movable {
	
	private Color color;
	private Point location;
	
	public Shape(Color color, Point location) {
		this.color = color;
		this.location = location;
	}
	public Shape(){
		this(Color.defaultValue(),new Point());
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Point getLocation() {
		return location;
	}
	public void setLocation(Point location) {
		this.location = location;
	}
	public abstract double area();
	
	public abstract double perimeter();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(!(obj instanceof Shape))
			return false;
		Shape other = (Shape) obj;
		return this.color.equals(other.color) && this.location.equals(other.location);
	}
	@Override
	public String toString() {
		return "color=" + color + ", location=" + location;
	}
	
	@Override
	public void move(double deltaX, double deltaY){
		location.move(deltaX, deltaY);
	}
	
	
	
	
}
