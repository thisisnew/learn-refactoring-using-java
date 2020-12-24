package ExtractMethod.after;

public class Banner {
	
	private final String CONTENT;
	
	public Banner(String content) {
		this.CONTENT = content;
	}
	
	public void print(int times) {
		
		printBorder();
		printContent(times); 
		printBorder();
		
	}
	
	private void printBorder() {
		System.out.print("+");
		
		for( int i = 0; i < CONTENT.length(); i++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
	private void printContent(int times) {
		for( int i = 0; i < times; i++ ) {
			System.out.println("|" + CONTENT + "|");
		}
	}
}
