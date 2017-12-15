package guiPlayer;

import java.util.ArrayList;
import java.util.Scanner;


public class CatalogMaker {

	private ArrayList<BookCatalog> list = new ArrayList<BookCatalog>();
	private static Scanner input;
	
	public CatalogMaker() {
		list.add(new BookCatalog("Harry Potter and the Sorceror's Stone", "J.K.Rowling", "Fantasy", 1));
		list.add(new BookCatalog("Percy Jackson and the Lightning Thief", "Rick Riordan", "Fantasy",1));
		list.add(new BookCatalog("Cinder", "Marissa Meyer", "Fantasy",1));
		list.add(new BookCatalog("The Hunger Games", "Suzanne Collins", "Dystopia",1));
		list.add(new BookCatalog("Legend", "Marie Lu", "Dystopia", 1));
	}

	public String getCsvContent() {
		String data = "Title, Author, Genre, Book Number \n";
		
		for(BookCatalog b: list) {
			data += b + " \n";
		}
		return data;
		
	}
	public static void main(String[] args) {
		CatalogMaker book = new CatalogMaker();
		
		input = new Scanner(System.in);
		System.out.println("Type in title, author, genre, and the book number of the book in the series. Separate each with a comma.");
		userInput = book.input; //get user input
		
		//search for three commmas
			//return the index
		
		System.out.print(book.getCsvContent());
		
		
	}
	
	public void addNewItem(String title, String author, String genre, int bookNum) {
		list.add(new BookCatalog(title, author, genre, bookNum));
		System.out.println("Book added successfully!");
	}

}
