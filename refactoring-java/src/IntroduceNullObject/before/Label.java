package IntroduceNullObject.before;

public class Label {
	private final String LABEL;
	
	public Label(String label) {
		LABEL = label;
	}
	
	public void display() {
		System.out.println("Display=======" + LABEL);
	}

	@Override
	public String toString() {
		return "Label [" + LABEL + "]";
	}
}
