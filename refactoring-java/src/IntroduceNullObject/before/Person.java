package IntroduceNullObject.before;

public class Person {
	private final Label NAME;
	private final Label MAIL;
	
	public Person(Label name, Label mail) {
		NAME = name;
		MAIL = mail;
	}
	
	public Person(Label name) {
		this(name, null);
	}
	
	public void display() {
		if( NAME != null ) {
			NAME.display();
		}
		if( MAIL != null ) {
			MAIL.display();
		}  
	}
	
	public String toString() {
		String result = "[ Person: name=";
		
		if( NAME == null ) {
			result += "none";
		} else {
			result += NAME;
		}
		
		result += " mail=";
		if( MAIL == null ) {
			result += "none";
		} else {
			result += MAIL;
		}
		
		return result;
	}
}
