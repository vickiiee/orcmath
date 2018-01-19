package myStuff;

import java.util.List;

import guiPlayer.BookCatalogVickie;
import guiPlayer.CatalogMaker;
import guiPlayer.CatalogMakerBookVickie;
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
	private Button b;
	
	private CatalogMakerBookVickie catalog;
	
	private TextArea textarea;
	private TextArea cover;

	
	public CatalogScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		
		catalog = new CatalogMakerBookVickie();
		
		/*textarea = new TextArea(400, 200, 300, 100, "TEXTAREARAERAEFG");
		viewObjects.add(textarea);*/
		
		
		Title = new TextField(40,40,200,30, "Title.", "Title");
		viewObjects.add(Title);
		
		
		Author = new TextField(40,100,200,30, "Author.", "Author");
		viewObjects.add(Author);
		
		Genre = new TextField(40,160,200,30, "Genre.", "Genre");
		viewObjects.add(Genre);
		
		BookNum = new TextField(40,220,200,30, "Book Number.", "BookNum");
		BookNum.setInputType(TextField.INPUT_TYPE_NUMERIC);
		viewObjects.add(BookNum);
		
		add = new Button(40, 280, 200, 30, "Add", new Action() {
			int num = 0;
			@Override
			public void act() {
				//Title.setText("YOU CLICKED THE BUTTON!");
				num++;
				String n =Integer.toString(num);
				
				/*textarea = new TextArea(400, 200, 300, 100, "TEXTAREARAERAEFG");
				viewObjects.add(textarea);*/
				cover = new TextArea(400, 200, 300, 100, " ");
				viewObjects.add(cover);
				
				textarea = new TextArea(400, 200, 300, 100, n);
				viewObjects.add(textarea);
				//verify();
				
			}
		});
		
		b = new Button(100, 280, 200, 30, "b", new Action() {
			int num = 0;
			@Override
			public void act() {
				//Title.setText("YOU CLICKED THE BUTTON!");
				num++;
				String n =Integer.toString(num);
				
				/*textarea = new TextArea(400, 200, 300, 100, "TEXTAREARAERAEFG");
				viewObjects.add(textarea);*/
				cover = new TextArea(100, 200, 300, 100, " ");
				viewObjects.add(cover);
				
				textarea = new TextArea(400, 200, 300, 100, n);
				viewObjects.add(textarea);
				//verify();
				viewObjects.clear();
			}
		});
		
		viewObjects.add(add);
		viewObjects.add(b);
		
	}

	public void addButtonClicked(){
		BookCatalogVickie b = new BookCatalogVickie(Title.getText(), Author.getText(), Genre.getText(), Integer.parseInt(BookNum.getText()));
		String s = textarea.getText() + b;
		
		catalog.addNewItem(Title.getText(), Author.getText(), Genre.getText(),  Integer.parseInt(BookNum.getText()));
		
		//clear the fields
		Title.setText("");
		Author.setText("");
		Genre.setText("");
		BookNum.setText("");
	}
	
	public void verify() {
		if(Title.getText().equals("") || Author.getText().equals("") || Genre.getText().equals(""))
		{
			System.out.println("ERROROROROROROORR");
		}
	}
}
