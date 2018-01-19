package myStuff;

import guiTeacher.GUIApplication;

public class LoadTest80 extends GUIApplication{

	private static LoadTest80 loading;
	private static Test80 test;
	
	public LoadTest80(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public static void main(String[] args) {
		loading = new LoadTest80(1000, 800);
		
		 Thread runner = new Thread(loading);
		 runner.start();
	}
	
	public void initScreen() {
		test = new Test80(getWidth(), getHeight());
		setScreen(test);
		
	}

}
