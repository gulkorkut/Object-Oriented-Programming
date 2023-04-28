public class Book{

	private String name;
	private int ISBN;
	private String author_name;
	private String publisher;
	
	public Book(String name,int ISBN,String author_name,String publisher) {
		this.name = name;
		this.ISBN = ISBN;
		this.author_name = author_name;
		this.publisher = publisher;
	}
	
	public String getName() {
		return name;
	}
	public int getISBN() {
		return ISBN;
	}
	public String getAuthor() {
		return author_name;
	}
	public String getPublisher() {
		return publisher;
	}


	public void setName(String newName) {
		name = newName;
	}
	public void setISBN(int newISBN) {
		ISBN = newISBN;
	}
	public void setAuthor(String newAuthor) {
		author_name= newAuthor;
	}
	public void setPublisher(String newPublisher) {
		publisher= newPublisher;
	}
	
	public String getBookDetail() {
		return "Name of the book is:"+name+"\nISBN number is:"+ISBN+"\nAuthor name is:"+author_name+"\nPublisher name is:"+publisher;
	}
	
}