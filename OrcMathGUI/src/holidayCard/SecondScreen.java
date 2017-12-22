package holidayCard;

import java.awt.Color;
import java.util.List;

import guiPlayer.BookCatalog;
import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.StyledComponent;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class SecondScreen extends FullFunctionScreen{

	private Button back;
	
	public SecondScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {

		Graphic baymaxtree = new Graphic(0,0, getWidth(), getHeight(), "resources/baymaxtree.jpg");
		
		back = new Button(350, 580, 70, 30, "Page 1", Color.red, new Action() {

			public void act() {
				
				GuiPart.part.setScreen(GuiPart.windowOne);

			}
		});
		TextArea ta = new TextArea(140, 180, 330 ,400, "HAPPY NEW YEAR!");
		ta.setTextColor(Color.black);
	
		
		viewObjects.add(baymaxtree);
		viewObjects.add(back);
		viewObjects.add(ta);
		
		 StyledComponent.setButtonOutline(true);
	}
	
}
