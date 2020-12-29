package ReplaceTypeCodeWithSubClasses.after;

public class Main {

	public static void main(String[] args) {
		Shape line = Shape.creatShape(Shape.TYPECODE_LINE, 0,0,100,200);
		Shape rectangle = Shape.creatShape(Shape.TYPECODE_RECTANGLE, 10, 20, 30, 40);
		Shape oval = Shape.creatShape(Shape.TYPECODE_OVAL, 100, 200, 300, 400);
		
		Shape[] shapes = { line, rectangle, oval };
		
		for( Shape shape : shapes ) {
			shape.draw();
		}
		
	}

}
