package ExtractMethod.before;

public class Banner {
	
	private final String CONTENT;
	
	public Banner(String content) {
		this.CONTENT = content;
	}
	
	public void print(int times) {
		
		System.out.print("+");
		
		for( int i = 0; i < CONTENT.length(); i++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
		
		for( int i = 0; i < times; i++ ) {
			System.out.println("|" + CONTENT + "|");
		}
		
		System.out.print("+");
		
		for( int i = 0; i < CONTENT.length(); i++ ) {
			System.out.print("-");
		}
		
		System.out.print("+");
	}
}
