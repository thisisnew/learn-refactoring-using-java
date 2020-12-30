package ReplaceTypeCodeWithStateStrategy.enum3;

public class Main {
	public static void main(String[] args) {
		Logger logger = new Logger();
		logger.log("Infornation #1");
		
		logger.start();
		logger.log("Infornation #2");

		logger.start();
		logger.log("Infornation #3");
		
		logger.stop();
		logger.log("Infornation #4");
		
		logger.stop();
		logger.log("Infornation #5");
	}
}
