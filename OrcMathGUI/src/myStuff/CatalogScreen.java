package myStuff;

import java.util.List;


import guiTeacher.GUIApplication;
import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {
	
	private TextField Title;
	private TextField Author;
	private TextField Genre;
	private TextField Pages;
	
	private Button add;

	public CatalogScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		Title = new TextField(40,40,200,30, "Title.", "Title");
		viewObjects.add(Title);
		
		Author = new TextField(40,100,200,30, "Author.", "Author");
		viewObjects.add(Author);
		
		Genre = new TextField(40,160,200,30, "Genre.", "Genre");
		viewObjects.add(Genre);
		
		Pages = new TextField(40,220,200,30, "Pages.", "Pages");
		viewObjects.add(Pages);
		
		add = new Button(40, 300, 100, 50, "Add", new Action() {
			
			@Override
			public void act() {
				Title.setText("YOU CLICKED THE BUTTON!");
				
			}
		});
		
		viewObjects.add(add);
	}



}
