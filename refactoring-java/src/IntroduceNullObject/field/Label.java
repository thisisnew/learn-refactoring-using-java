package IntroduceNullObject.field;

public class Label {
	
	public final static Label NULL = new NullLabel();
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
	
	private static class NullLabel extends Label{
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
