package geometry;

public enum Color {

	BLACK, BLUE, GREEN, RED, YELLOW, WHITE;
	
	public static Color defaultValue(){
		return BLACK;
	}
	
	@Override
	public String toString(){
		switch(this){
			case BLUE: return "Blue";
			case GREEN: return "Green";
			case RED: return "Red";
			case YELLOW: return "Yellow";
			case WHITE: return "White";
			default: return "Black";
		}
	}
}
