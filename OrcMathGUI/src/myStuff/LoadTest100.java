package myStuff;

import guiTeacher.GUIApplication;

public class LoadTest100 extends GUIApplication {
	
	private static LoadTest100 loading; //must make static as it is called from static method
	private static Test100Final test;

	public LoadTest100(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public static void main(String[] args) {
		loading = new LoadTest100(1000, 1000);
		
		Thread runner = new Thread(loading);
		runner.start();
	}

	@Override
	public void initScreen() {
		test = new Test100Final(getWidth(), getHeight());
		setScreen(test);
		
		
		
	}

}
