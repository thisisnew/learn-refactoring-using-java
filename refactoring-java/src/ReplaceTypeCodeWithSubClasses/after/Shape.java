package ReplaceTypeCodeWithSubClasses.after;

public abstract class Shape {
	public static final int TYPECODE_LINE = 0;
	public static final int TYPECODE_RECTANGLE = 1;
	public static final int TYPECODE_OVAL = 2;
	
	private final int START_X;
	private final int START_Y;
	private final int END_X;
	private final int END_Y;
	
	public static Shape creatShape(int typecode, int startx, int starty, int endx, int endy) {
		switch (typecode) {
		case TYPECODE_LINE: 
			return new ShapeLine(startx, starty, endx, endy);
		case TYPECODE_RECTANGLE:
			return new ShapeRectangle(startx, starty, endx, endy);
		case TYPECODE_OVAL:
			return new ShapeOval(startx, starty, endx, endy);
		default:
			throw new IllegalArgumentException("typecode = " + typecode);
		}
	}
	
	protected Shape(int startX, int startY, int endX, int endY) {
		START_X = startX;
		START_Y = startY;
		END_X = endX;
		END_Y = endY;
	}
	
	public abstract int getTYPECODE();
	
	public abstract String getName(); 
	
	public String toString() {
		return "Shape [START_X=" + START_X + ", START_Y=" + START_Y + ", END_X=" + END_X + ", END_Y=" + END_Y
				+ ", getName()=" + getName() + "]";
	}
	
	public abstract void draw();
}
