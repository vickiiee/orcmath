package myStuff;

import java.awt.Color;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class Test100n extends FullFunctionScreen{
	
	/*
	 * A window appears on screen on which there is one Button and text that says "Score: 0".
	 *  The Button says "Ready". When the user clicks the Button, a countdown appears: "3...2...1... Go!"
	 *   After the words "Go" appears, the Text on the Button says "Click Me!". 
	 *   A clock shows that there are five seconds. 
	 *   During this time, (and only during these five seconds) each time the user clicks the button, the Score increases by 1.
	 *    After 5 seconds ends, the text on the Button says "Done". 
	 *    Clicking the button does not have any effect. 
	 *    The Score remains visible on the screen.
	 */
	private TextLabel scoreB;
	
	private Button ready;
	private TextLabel countdown;
	
	private int countdS;
	private int fSec;
	private int clicks;
	
	private Timer time;
	
	private boolean activate;

	public Test100n(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		clicks=0;
		countdS = 4;
		fSec=6;
		scoreB = new TextLabel(100, 100, 100, 100, "Score: " + clicks);
		viewObjects.add(scoreB);
		
		countdown = new TextLabel(500, 500, 100, 100, "Countdown: " + countdS);
		
		time = new Timer();
		TimerTask complete = new TimerTask() {

			@Override
			public void run() {
				countdS --;
				if(countdS>0) {
					countdown.setText("Countdown: "+countdS);
				}
				if(countdS ==0) {
					countdown.setText("Countdown: GO!");
					ready.setText("Click Me!!");
				}
				
				if(countdS<0) {
					fSec --;
					countdown.setText("Countdown: "+fSec);
				}
				
				if(fSec==0) {
					ready.setText("Done");
					ready.setEnabled(false); //disable button
					time.cancel();
				}
				
			}
			
		};
		
		ready = new Button(300, 100, 100, 100, "Ready", Color.orange, new Action() {

			@Override
			public void act() {
				if(!activate) {
					activate = true;
					viewObjects.add(countdown);
				}
				if(countdS <=0) {
					clicks++;
					scoreB.setText("Score: "+clicks);
				}else {
					time.schedule(complete,0,1000); //start timer
				}
				
				
			}
			
		});
		viewObjects.add(ready);
		
	}

}
