package guiPlayer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CatalogMakerBookVickie {

	private static ArrayList<BookCatalogVickie> list = new ArrayList<BookCatalogVickie>();
	private static Scanner input;
	
	public CatalogMakerBookVickie() {
		list.add(new BookCatalogVickie("Harry Potter and the Sorceror's Stone", "J.K.Rowling", "Fantasy", 1));
		list.add(new BookCatalogVickie("Percy Jackson and the Lightning Thief", "Rick Riordan", "Fantasy",1));
		list.add(new BookCatalogVickie("Cinder", "Marissa Meyer", "Fantasy",1));
		list.add(new BookCatalogVickie("The Hunger Games", "Suzanne Collins", "Dystopia",1));
		list.add(new BookCatalogVickie("Legend", "Marie Lu", "Dystopia", 1));
	}

	public String getCsvContent() {
		String data = "Title, Author, Genre, Book Number \n";
		
		for(BookCatalogVickie b: list) {
			data += b + " \n";
		}
		return data;
		
	}
	

	public static void main(String[] args) {
		CatalogMakerBookVickie book = new CatalogMakerBookVickie();

		input = new Scanner(System.in);
		//System.out.println("Type in title, author, genre, and the book number of the book in the series. Separate each with a comma.");
		//userInput = book.input; //get user input
		
		//search for three commmas
			//return the index
		
		System.out.print(book.getCsvContent());
		
		
		
		/*Scanner in = new Scanner(System.in);

		System.out.println("type something");

		input = in.nextLine(); //get user input
*/
		//stuff("sjdka.txt", input);
		book.testSaveContent("test.csv");
	}
	
	public void testSaveContent(String fileName) {

		/*try{    

			FileWriter fw=new FileWriter(fileName);    

			
			String info = "Rainbow Fairies,Rainbow Fairy,Fantasy,1";
			String [] param = info.split(",");
			list.add(new BookCatalog(param[0], param[1], param[2], Integer.parseInt(param[3])));
			
			//fw.write("This file was created programmatically.");    
			
			fw.write(param[0]);
			fw.write(param[1]);
			fw.write(param[2]);
			
			fw.close();    

			System.out.println("Success! File \""+fileName+"\" saved!");

		}catch(IOException e){

			System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");

		}*/
		
		try{    
			FileWriter fw=new FileWriter("BookCatalog.csv"); 
			for(BookCatalogVickie b: list){	//depends on instances
				fw.write(b+"\n");    	
			}

			fw.close();    
			System.out.println("Success! File \"BookCatalog.csv\" saved!");
		}catch(IOException e){
			System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");
		}
	}
	
	private static List<String> testFileLoading() {

		Scanner in = new Scanner(System.in);

		String fileName = "";

		List<String> content = new ArrayList<String>();

		//use this boolean to control the while loop. The user should have multiple chances to enter a correct filename

		boolean opened = false;

		while(!opened){

			try {

				System.out.println("Enter a file to open");

				fileName = in.nextLine();

				FileReader fileReader = new FileReader(new File(fileName));

				String line = "";

				//a BufferedReader enables us to read teh file one line at a time//

				BufferedReader br = new BufferedReader(fileReader);

				while ((line = br.readLine()) != null) {
					content.add(line);
					
					String info = "Rainbow Fairies,Rainbow Fairy,Fantasy,1";
					String [] param = info.split(",");
					list.add(new BookCatalogVickie(param[0], param[1], param[2], Integer.parseInt(param[3])));
					
					//fw.write("This file was created programmatically.");    
					
				}

				br.close();

				opened = true;

			}catch (IOException e) {

				System.out.println("The file name you specified does not exist.");

			}

		}

		//close the Scanner

		in.close();

		return content;

	}

	
	public void addNewItem(String title, String author, String genre, int bookNum) {
		list.add(new BookCatalogVickie(title, author, genre, bookNum));
		System.out.println("Book added successfully!");
	}
	
	public ArrayList<BookCatalogVickie> getCatalog() {
		return list;
	}

}
