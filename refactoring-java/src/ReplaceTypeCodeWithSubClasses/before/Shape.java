package ReplaceTypeCodeWithSubClasses.before;

public class Shape {
	public static final int TYPECODE_LINE = 0;
	public static final int TYPECODE_RECTANGLE = 1;
	public static final int TYPECODE_OVAL = 2;
	
	private final int TYPECODE;
	private final int START_X;
	private final int START_Y;
	private final int END_X;
	private final int END_Y;
	
	public Shape(int typecode, int startX, int startY, int endX, int endY) {
		TYPECODE = typecode;
		START_X = startX;
		START_Y = startY;
		END_X = endX;
		END_Y = endY;
	}
	
	public int getTYPECODE() {
		return TYPECODE;
	}
	
	public String getName() {
		switch (TYPECODE) {
		case TYPECODE_LINE:
			return "LINE";
		case TYPECODE_RECTANGLE:
			return "RECTANGLE";
		case TYPECODE_OVAL:
			return "OVAL";
		default:
			return null;
		}
	}

	public String toString() {
		return "Shape [START_X=" + START_X + ", START_Y=" + START_Y + ", END_X=" + END_X + ", END_Y=" + END_Y
				+ ", getName()=" + getName() + "]";
	}
	
	public void draw() {
		switch (TYPECODE) {
		case TYPECODE_LINE:
			drawLine();
			break;
		case TYPECODE_RECTANGLE:
			drawRectangle();
			break;
		case TYPECODE_OVAL:
			drawOval();
			break;
		default:
			break;
		}
	}
	
	private void drawLine() {
		System.out.println("drawLine : " + toString());
	}
	private void drawRectangle() {
		System.out.println("drawRectangle : " + toString());
	}
	private void drawOval() {
		System.out.println("drawOval : " + toString());
	}
}
