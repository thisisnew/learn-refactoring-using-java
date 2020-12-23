package IntroduceNullObject.after;

public class Person {
	private final Label NAME;
	private final Label MAIL;
	
	public Person(Label name, Label mail) {
		NAME = name;
		MAIL = mail;
	}
	
	public Person(Label name) {
		this(name, new NullLabel());
	}
	
	public void display() {
		NAME.display();
		MAIL.display();
	}
	
	public String toString() {
		return "[ Person: name=" + NAME + " mail=" + MAIL + " ]";
	}
}
