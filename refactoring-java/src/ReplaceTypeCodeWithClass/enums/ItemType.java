package ReplaceTypeCodeWithClass.enums;

public enum ItemType {
	BOOK(0),
	DVD(1),
	SOFTWARE(2);
	
	private final int TYPECODE;
	
	private ItemType(int typecode) {
		TYPECODE = typecode;
	}

	public int getTYPECODE() {
		return TYPECODE;
	}
}
