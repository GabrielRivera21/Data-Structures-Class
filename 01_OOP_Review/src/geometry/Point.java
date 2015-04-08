package geometry;

public class Point implements Movable {
	private double x;
	private double y;
	
	public Point(){}
	
	public Point(double x, double y){
		this.x=x;
		this.y=y;
	}
	public double getX(){
		return x;
	}
	public void setX(double x){
		this.x=x;
	}
	public double getY(){
		return y;
	}
	public void setY(double y){
		this.y=y;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(!(obj instanceof Point))
			return false;
		
		Point other = (Point) obj;
		return (this.x == other.x && this.y==other.y);
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	@Override
	public void move(double deltaX, double deltaY) {
		x+=deltaX;
		y+=deltaY;
		
	}
}
