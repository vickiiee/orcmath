package holidayCard;

import java.util.List;

import guiPlayer.BookCatalog;
import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class SecondScreen extends FullFunctionScreen{

	private Button add;
	
	public SecondScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		add = new Button(40, 280, 200, 30, "Add", new Action() {

			@Override
			public void act() {
				//Title.setText("YOU CLICKED THE BUTTON!");

			

			}
		});

		viewObjects.add(add);
	}

	/*public void addButtonClicked(){
		BookCatalog b = new BookCatalog(Title.getText(), Author.getText(), Genre.getText(), Integer.parseInt(BookNum.getText()));
		String s = textarea.getText() + b;
		
		catalog.addNewItem(Title.getText(), Author.getText(), Genre.getText(),  Integer.parseInt(BookNum.getText()));
		
		//clear the fields
		Title.setText("");
		Author.setText("");
		Genre.setText("");
		BookNum.setText("");
	}*/
	
}
