package ReplaceTypeCodeWithClass.before;

public class Item {
	public static final int TYPECODE_BOOK = 0;
	public static final int TYPECODE_DVD = 1;
	public static final int TYPECODE_SOFTWARE = 2;
	
	private final int TYPECODE;
	private final String TITLE;
	private final int PRICE;
	
	public Item(int typecode, String title, int price) {
		TYPECODE = typecode;
		TITLE = title;
		PRICE = price;
	}
	
	public int getTYPECODE() {
		return TYPECODE;
	}
	public String getTITLE() {
		return TITLE;
	}
	public int getPRICE() {
		return PRICE;
	}
	@Override
	public String toString() {
		return "Item [TYPECODE=" + TYPECODE + ", TITLE=" + TITLE + ", PRICE=" + PRICE + "]";
	}
}
