package IntroduceNullObject.nested;

public class Label {
	private final String LABEL;
	
	public Label(String label) {
		LABEL = label;
	}
	
	public void display() {
		System.out.println("Display=======" + LABEL);
	}
	
	public String toString() {
		return "Label [" + LABEL + "]";
	}
	
	public boolean isNull() {
		return false;
	}
	
	public static Label newNull() {
		return NullLabel.getInstance();
	}
	
	private static class NullLabel extends Label{
		
		private static final NullLabel singleton = new NullLabel();
		private static NullLabel getInstance() {
			return singleton;
		}
		
		public NullLabel() {
			super("(none)");
		}
		
		@Override
		public void display() {
		}
		
		@Override
		public boolean isNull() {
			return true;
		}
	}
}
