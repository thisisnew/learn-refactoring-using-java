package ReplaceTypeCodeWithClass.after;

public class Item {
	private final ItemType ITEMTYPE;
	private final String TITLE;
	private final int PRICE;
	
	public Item(ItemType itemtype, String title, int price) {
		ITEMTYPE = itemtype;
		TITLE = title;
		PRICE = price;
	}

	public String getTITLE() {
		return TITLE;
	}
	public int getPRICE() {
		return PRICE;
	}

	@Override
	public String toString() {
		return "Item [ITEMTYPE=" + ITEMTYPE.getTYPECODE() + ", TITLE=" + TITLE + ", PRICE=" + PRICE + "]";
	}
}
