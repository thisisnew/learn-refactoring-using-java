package ExtractClass.mutable;

public class Author implements ImmutableAuthor{
	
	private String name;
	private String mail;
	
	public Author(String name, String mail) {
		this.name = name;
		this.mail = mail;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getMail() {
		return this.mail;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}
