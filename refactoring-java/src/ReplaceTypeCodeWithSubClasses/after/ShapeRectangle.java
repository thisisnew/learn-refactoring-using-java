package ReplaceTypeCodeWithSubClasses.after;

public class ShapeRectangle extends Shape{

	protected ShapeRectangle(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	@Override
	public int getTYPECODE() {
		return Shape.TYPECODE_RECTANGLE;
	}

	@Override
	public String getName() {
		return "RECTANGLE";
	}

	@Override
	public void draw() {
		drawRectangle();
	}

	private void drawRectangle() {
		System.out.println(" drawRectangle -- " + toString());
	}
	
}
