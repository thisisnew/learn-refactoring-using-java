package ExtractClass.mutable;

public class Book {
	private String title;
	private String isbn;
	private String price;
	private Author author;
	
	public Book( String title, String isbn, String price, String authorName, String authorMail ) {
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.author = new Author(authorName, authorMail);
	}

	public String getTitle() {
		return title;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getPrice() {
		return price;
	}

	public ImmutableAuthor getAuthor() {
		return (ImmutableAuthor) author;
	}

	public String toXml() {
		String author = tag("author", tag("name", getAuthor().getName())) + tag("mail", getAuthor().getMail());
		String book = tag("book", tag("title", title)) + tag("isbn", isbn) + tag("price", price) + author;
		
		return book;
	}
	
	private String tag(String element, String content) {
		return "<" + element + ">" + content + "</" + element + ">";
	}
}
