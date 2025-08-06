package demo;
class Book{
	String title;
	String author;
	final int bookID;
	static int bookCounter=1000;
	final static String LIBRARY_NAME="Central Library.";
	Book(){
		bookID =bookCounter++;
		title="title";
		author="author";
	}
	Book(String title,String author){
		bookID =bookCounter++;
		this.title=title;
		this.author=author;
	}
	public void displayInfo() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("ID: "+bookID);
	}
	public void displayInfo(boolean showLibrary) {
		/*System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("ID: "+bookID);*/
		displayInfo();
		if (showLibrary) {
			System.out.println("Library Name: "+LIBRARY_NAME);
		}
	}
	public static int displayTotalBooks() {
		return (bookCounter-1000);
	}
}
public class BookDetails {
	public static void main (String [] args) {
		Book b1 = new Book();
		Book b2 = new Book("Batman", "Bob Kane");
		Book b3 = new Book("Harry Potter", "J K Rowling");
		b1.displayInfo();
		b2.displayInfo();
		b3.displayInfo(true);
		System.out.println("Total no. of books: "+Book.displayTotalBooks());
	}
}
