package simon;

import guiTeacher.GUIApplication;

public class SimonGameVickie extends GUIApplication{

	private static SimonGameVickie game;
	private SimonScreenVickie screen;

	public SimonGameVickie(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public static void main(String[] args) {
		game = new SimonGameVickie(1000, 1000); // the dimensions of the screen 
		Thread runner = new Thread(game);
		runner.start();
	}
	
	public void initScreen() {
		screen = new SimonScreenVickie(getWidth(), getHeight());
	}

}
