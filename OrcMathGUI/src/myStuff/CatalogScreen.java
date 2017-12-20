package myStuff;

import java.util.List;

import guiPlayer.BookCatalog;
import guiPlayer.CatalogMaker;
import guiPlayer.CatalogMakerBook;
import guiTeacher.GUIApplication;
import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {
	
	private TextField Title;
	private TextField Author;
	private TextField Genre;
	private TextField BookNum;
	
	private Button add;
	
	private CatalogMakerBook catalog;
	
	private TextArea textarea;

	public CatalogScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		
		catalog = new CatalogMakerBook();
		
		textarea = new TextArea(40, 400,100,100, "TEXTAREARAERAEFG");
		viewObjects.add(textarea);
		
		
		Title = new TextField(40,40,200,30, "Title.", "Title");
		viewObjects.add(Title);
		
		Author = new TextField(40,100,200,30, "Author.", "Author");
		viewObjects.add(Author);
		
		Genre = new TextField(40,160,200,30, "Genre.", "Genre");
		viewObjects.add(Genre);
		
		BookNum = new TextField(40,220,200,30, "Book Number.", "BookNum");
		viewObjects.add(BookNum);
		
		add = new Button(40, 280, 100, 50, "Add", new Action() {
			
			@Override
			public void act() {
				//Title.setText("YOU CLICKED THE BUTTON!");
				
				
				
			}
		});
		
		viewObjects.add(add);
	}

	public void addButtonClicked(){
		BookCatalog b = new BookCatalog(Title.getText(), Author.getText(), Genre.getText(), Integer.parseInt(BookNum.getText());
		String s = 
		TextArea.setText(s);
		
		catalog.addNewItem(Title.getText(), Author.getText(), Genre.getText(),  Integer.parseInt(BookNum.getText());
		
		//clear the fields
		Title.setText("");
		Author.setText("");
		Genre.setText("");
		BookNum.setText("");
	}
	
}
