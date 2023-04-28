class Main {

  public static void main(String[] args) {
		
		Book[] books = new Book[5];
		books[0] = new Book("otomatik portakal",12345,"Anthony Burgess","Is bankasi yayinlari");
		System.out.println(books[0].getBookDetail());
		books[0].setISBN(6789);
		System.out.println(books[0].getBookDetail());

	}

}