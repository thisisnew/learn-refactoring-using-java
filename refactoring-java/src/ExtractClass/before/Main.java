package ExtractClass.before;

public class Main {
	public static void main(String[] args) {
		Book refactor = new Book("Refactoring",
				"ISBN00000000",
				"44000¿ø",
				"TESTER",
				"TEST@TEST.COM");
		
		Book math = new Book("Math",
				"ISBN11111111111",
				"33300",
				"MATHEMATICIAN",
				"MATHEMATICIAN@MATH.COM");
		
		System.out.println(refactor.toXml());
		System.out.println(math.toXml());
	}
}
