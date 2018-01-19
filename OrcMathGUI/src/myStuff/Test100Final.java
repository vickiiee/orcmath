package myStuff;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class Test100Final extends FullFunctionScreen{
	
	private TextLabel scoreBoard;
	private TextLabel countdown;
	
	private Timer timer;
	
	private int preparation;
	private int official;
	private int clicks;
	
	private boolean activate;
	
	private Button b;

	public Test100Final(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		preparation = 4;
		official = 6;
		clicks = 0;
		
		timer = new Timer();
		TimerTask complete = new TimerTask() {
			@Override
			public void run() {
				preparation--;
				if(preparation>0) {
					countdown.setText("Countdown: " + preparation);
				}
				if(preparation ==0) {
					countdown.setText("Countdown: Go!");
					b.setText("CLick ME!");
				}
				if(preparation<0) {
					official--;
					countdown.setText("Countdown: " + official);
				}
				if(official<=0) {
					b.setText("Done!");
					b.setEnabled(false);
					timer.cancel();
				}////////////////////////////CUT OFF HERE//////////////////////////////////////////////////
			}
		};
		
		scoreBoard = new TextLabel(100,100,100,100, "Score: "+ clicks);
		viewObjects.add(scoreBoard);
		
		countdown = new TextLabel(300,100,100,100, "Countdown: "+ preparation);
		
		b = new Button(200, 200, 100, 100, "Ready", new Action() {

			@Override
			public void act() {
				if(!activate) {
					activate = true;
					viewObjects.add(countdown);
					timer.schedule(complete, 0, 1000);
				}
				
				if(preparation<0) {
					clicks++;
					scoreBoard.setText("Score: " + clicks);
				}
				
			}
			
		});
		viewObjects.add(b);
	}
	

}
