package ReplaceTypeCodeWithClass.before;

public class Main {
	public static void main(String[] args) {
		Item book = new Item(Item.TYPECODE_BOOK, "���迪��", 4800);
		Item dvd = new Item(Item.TYPECODE_DVD, "�����ǲ�", 3300);
		Item soft = new Item(Item.TYPECODE_SOFTWARE, "���ķ�����", 9900);
		
		System.out.println(book.toString());
		System.out.println(dvd.toString());
		System.out.println(soft.toString());
	}
}
