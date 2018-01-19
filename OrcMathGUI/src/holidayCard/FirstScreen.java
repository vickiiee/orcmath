package holidayCard;

import java.awt.Color;
import java.util.List;

import guiPlayer.BookCatalogVickie;
import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.StyledComponent;
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
		//Graphic forest = new Graphic(0,0, getWidth(), getHeight(), "resources/download.jpg");
		Graphic baymax = new Graphic(0,0, getWidth(), getHeight(), "resources/baymax.jpg");
		
		
		switchScreen = new Button(350, 580, 70, 30, "Page 2", Color.red, new Action() {
			public void act() {
				
				GuiPart.part.setScreen(GuiPart.windowTwo);

			}
		});
		
		switchScreen.setCustomTextColor(new Color(250,250,250));
		viewObjects.add(baymax);
		//viewObjects.add(add);
		
		viewObjects.add(switchScreen);
		
		//
		 
		
	}
}
