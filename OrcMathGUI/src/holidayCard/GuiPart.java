package holidayCard;

import guiTeacher.GUIApplication;

public class GuiPart extends GUIApplication {

	public static GuiPart part;
	public static FirstScreen  windowOne;
	 public static SecondScreen windowTwo;

	public GuiPart(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public static void main(String[] args) {
		part = new GuiPart(800, 550);
		 Thread runner = new Thread(part);
		 runner.start();
	}

	@Override
	public void initScreen() {
		windowOne = new FirstScreen(getWidth(), getHeight());
		windowTwo = new SecondScreen(getWidth(), getHeight());
		setScreen(windowOne);
		
		//setScreen(windowTwo);
	}

}
