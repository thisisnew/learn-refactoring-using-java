package ReplaceTypeCodeWithSubClasses.after;

public class ShapeLine extends Shape{

	protected ShapeLine(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	@Override
	public int getTYPECODE() {
		return Shape.TYPECODE_LINE;
	}

	@Override
	public String getName() {
		return "LINE";
	}

	@Override
	public void draw() {
		drawLine();
	}

	private void drawLine() {
		System.out.println(" drawLine -- " + toString());
	}
	
}
