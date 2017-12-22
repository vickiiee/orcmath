package holidayCard;

import java.awt.Color;
import java.util.List;

import guiPlayer.BookCatalog;
import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class SecondScreen extends FullFunctionScreen{

	private Button back;
	
	public SecondScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
		Graphic baymaxtree = new Graphic(0,0, getWidth(), getHeight(), "resources/baymaxtree.gif");
		
		back = new Button(350, 580, 70, 30, "Page 1", Color.red, new Action() {

			@Override
			public void act() {
				
				GuiPart.part.setScreen(GuiPart.windowOne);

			}
		});
		
		
		viewObjects.add(baymaxtree);
		//viewObjects.add(add);
		
		viewObjects.add(back);
		
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
