package ReplaceTypeCodeWithStateStrategy.enum3;

public class Logger {
	
	private enum State {
		STOPPED {
			public void start() {
				System.out.println("*** START LOGGING ***");
			}
			
			public void stop() {
				//아무것도 하지않는다.
			}
			
			public void log(String info) {
				System.out.println("Ignoring : " + info);
			}
		},
		
		LOGGING {
			public void start() {
				//아무것도 하지않는다.				
			}
			
			public void stop() {
				System.out.println("*** STOP LOGGING ***");
			}
			
			public void log(String info) {
				System.out.println("Ignoring : " + info);
			}
		};
		
		public abstract void start();
		public abstract void stop();
		public abstract void log(String info);
	}
	
	
	private State state;
	public Logger() {
		setState(State.STOPPED);
	}
	
	public void setState(State state) {
		this.state = state; 
	}
	
	public void start() {
		state.start();
		setState(State.LOGGING);
	}
	
	public void stop() {
		state.stop();
		setState(State.STOPPED);
	}
	
	public void log(String info) {
		state.log(info);
	}
}
