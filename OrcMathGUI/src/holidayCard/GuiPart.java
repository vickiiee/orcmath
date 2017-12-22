package holidayCard;

import java.awt.Color;
import java.awt.Font;
import java.io.File;

import guiTeacher.GUIApplication;
import guiTeacher.components.StyledComponent;

public class GuiPart extends GUIApplication {

	public static GuiPart part;
	public static FirstScreen  windowOne;
	 public static SecondScreen windowTwo;

	public GuiPart(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public static void main(String[] args) {
		part = new GuiPart(440, 640);
		 Thread runner = new Thread(part);
		 runner.start();
	}

	@Override
	public void initScreen() {
		//StyledComponent.setTextColor(Color.white);
		try {

			 File fontFile = new File("resources//christmaseve.ttf");

			 // File fontFile = new File("resources//DayRoman.ttf");

			 Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);

			 Font baseFont=font.deriveFont(20f);

			 StyledComponent.setBaseFont(baseFont);

			 } catch (Exception e) {

			 e.printStackTrace();

			 }
		
		windowOne = new FirstScreen(getWidth(), getHeight());
		windowTwo = new SecondScreen(getWidth(), getHeight());
		setScreen(windowOne);
		
		//setScreen(windowTwo);
	}

	
}
