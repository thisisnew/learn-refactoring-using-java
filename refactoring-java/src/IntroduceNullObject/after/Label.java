package IntroduceNullObject.after;

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
}
