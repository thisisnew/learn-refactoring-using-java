package ReplaceTypeCodeWithClass.enums;

public class Main {
	public static void main(String[] args) {
		Item book = new Item(ItemType.BOOK, "���迪��", 4800);
		Item dvd = new Item(ItemType.DVD, "�����ǲ�", 3300);
		Item soft = new Item(ItemType.SOFTWARE, "���ķ�����", 9900);
		
		System.out.println(book.toString());
		System.out.println(dvd.toString());
		System.out.println(soft.toString());
	}
}
