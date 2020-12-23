package ReplaceMagicNumberWithSymbolicConstant.after;

public class Robot {
	
	public static final int COMMAND_WALK = 0;
	public static final int COMMAND_STOP = 1;
	public static final int COMMAND_JUMP = 2;
	
	private final String name;
	
	public Robot(String name) {
		this.name = name;
	}
	
	public void order(int command) {
		if( command == COMMAND_WALK ) {
			System.out.println(name + "...walks");
		} else if( command == COMMAND_STOP ) {
			System.out.println(name + "...stops");
		} else if( command == COMMAND_JUMP ) {
			System.out.println(name + "...jumps");
		} else {
			System.out.println("Command error");
		}
	}
}
