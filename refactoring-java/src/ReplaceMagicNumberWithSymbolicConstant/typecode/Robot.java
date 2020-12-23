package ReplaceMagicNumberWithSymbolicConstant.typecode;

public class Robot {
	private final String name;
	public static final RobotCommand COMMAND_WALK = new RobotCommand("WALK");
	public static final RobotCommand COMMAND_STOP = new RobotCommand("STOP");
	public static final RobotCommand COMMAND_JUMP = new RobotCommand("JUMP");
	
	public Robot(String name) {
		this.name = name;
	}
	
	public void order(RobotCommand robotCommand) {
		if( robotCommand == COMMAND_WALK ) {
			System.out.println(name + "...walks");
		} else if( robotCommand == COMMAND_STOP ) {
			System.out.println(name + "...stops");
		} else if( robotCommand == COMMAND_JUMP ) {
			System.out.println(name + "...jumps");
		} else {
			System.out.println("Command error");
		}
	}
}
