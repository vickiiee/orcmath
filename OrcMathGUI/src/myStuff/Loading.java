package myStuff;

import guiTeacher.GUIApplication;

public class Loading extends GUIApplication {
	
	private static Test100Final test;
	private static Loading load;

	public Loading(int width, int height) {
		super(width, height);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		load = new Loading(1000,1000);
		
		Thread run = new Thread(load);
		run.start();
	}

	@Override
	public void initScreen() {
		test = new Test100Final(getWidth(),getHeight());
		
		setScreen(test);
	}
	

}
