package ReplaceTypeCodeWithClass.enums;

public class Main {
	public static void main(String[] args) {
		Item book = new Item(ItemType.BOOK, "¼¼°è¿ª»ç", 4800);
		Item dvd = new Item(ItemType.DVD, "´º¿åÀÇ²Þ", 3300);
		Item soft = new Item(ItemType.SOFTWARE, "¿¡¹Ä·¹ÀÌÅÍ", 9900);
		
		System.out.println(book.toString());
		System.out.println(dvd.toString());
		System.out.println(soft.toString());
	}
}
