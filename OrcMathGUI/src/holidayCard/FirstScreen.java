package holidayCard;

import java.awt.Color;
import java.util.List;

import guiPlayer.BookCatalog;
import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class FirstScreen extends FullFunctionScreen{

	//private Button add;
	
	private Button switchScreen;
	
	public FirstScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		//Graphic forest = new Graphic(0,0, getWidth(), getHeight(), "resources/download.jpg");
		Graphic baymax = new Graphic(0,0, getWidth(), getHeight(), "resources/baymax.jpg");
		
		/*add = new Button(40, 280, 100, 30, "Add", Color.white, new Action() {

			@Override
			public void act() {
				//Title.setText("YOU CLICKED THE BUTTON!");

			}
		});*/
		
		switchScreen = new Button(350, 580, 70, 30, "Page 2", Color.red, new Action() {

			@Override
			public void act() {
				
				GuiPart.part.setScreen(GuiPart.windowTwo);

			}
		});
		
		viewObjects.add(baymax);
		//viewObjects.add(add);
		
		viewObjects.add(switchScreen);
		
	}
	
	/*public void addButtonClicked(){
		//BookCatalog b = new BookCatalog(Title.getText(), Author.getText(), Genre.getText(), Integer.parseInt(BookNum.getText()));
		//String s = textarea.getText() + b;
		
		catalog.addNewItem(Title.getText(), Author.getText(), Genre.getText(),  Integer.parseInt(BookNum.getText()));
		
		//clear the fields
		Title.setText("");
		Author.setText("");
		Genre.setText("");
		BookNum.setText("");
	}*/
	

}
