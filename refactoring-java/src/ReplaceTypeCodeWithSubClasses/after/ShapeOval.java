package ReplaceTypeCodeWithSubClasses.after;

public class ShapeOval extends Shape{

	protected ShapeOval(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	@Override
	public int getTYPECODE() {
		return Shape.TYPECODE_OVAL;
	}

	@Override
	public String getName() {
		return "OVAL";
	}

	@Override
	public void draw() {
		drawOval();
	}

	private void drawOval() {
		System.out.println(" drawOval -- " + toString());
	}
	
}
