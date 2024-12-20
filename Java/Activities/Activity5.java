package activities;

abstract class Book {
	// Variable to hold the book'stitle
	String title;

	// Abstract to set the title
	public abstract void setTitle(String title);

	// Concrete method to return the title of the book

	public String getTitle() {
		return this.title;

	}
}

class MyBook extends Book {
	// Implement the setTitle function
	public void setTitle(String title) {
		if (title.length() < 3) {
			System.out.println("Title is too small");

		} 
		else {
			this.title = title;
		}
	}
}

public class Activity5 {
	public static void main(String[] args) {
		MyBook bookObj = new MyBook();
		bookObj.setTitle("Percy Jackson and the Lightning Thief");
		System.out.println(bookObj.getTitle());

	}

}
