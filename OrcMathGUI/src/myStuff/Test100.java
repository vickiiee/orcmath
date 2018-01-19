package myStuff;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class Test100 extends FullFunctionScreen {//implements Runnable{
	
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
	
	private TextArea scoreTA; //change TextArea to TextArea;
	private Button ready;
	private Button clickMe;
	
	private boolean activate;
	
	private int clicks = 0;
	private String score;
	
	private TextArea countdown;
	private int count;
	private String sCount;
	
	private TextArea clock;
	
	public Test100(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		activate = false;
		count = 3;
		//score = Integer.toString(clicks);
		scoreTA = new TextArea(100, 100, 100, 100, "Score: "+clicks);
		
		/*count = 3;
		sCount = Integer.toString(count);
		countdown = new TextArea(300, 300, 100,100, "Countdown: " +sCount);
		*/
		ready = new Button(300, 100, 100, 100, "Ready", new Action() {

			@Override
			public void act() {
				
				if(!activate) {
					activate = !activate;
					countdown = new TextArea(300, 300, 100,100, "Countdown: " +count);
					viewObjects.add(countdown);
				}
				
				//sCount = Integer.toString(count);
								
				/*Thread runner = new Thread();
				runner.start();
				for ( count = 3 ; count>-1 ; count--)
				{ 
					
					sCount = Integer.toString(count);
				    countdown.setText(sCount);
				    try {
						runner.sleep(1000L);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}*/
				
				Timer t = new Timer(); //imported timer and works, but it has to be made in a new class... for it to function correctly
				t.schedule(new TimerTask() {

				            @Override
				            public void run() {
				            	for ( count = 3 ; count>-1 ; count--)
								{ 
									
									sCount = Integer.toString(count);
								    countdown.setText(sCount);
								    try {
										Thread.sleep(1000L);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}

				            }
				        }}, 400);
				
			}});
			
		
		
		viewObjects.add(scoreTA);
		viewObjects.add(ready);
		//viewObjects.add(countdown);
		
	}

	
	/*public void run() {
		this.runTimer();
	}

	private void runTimer() {
		for ( count = 3 ; count>-1 ; count--)
		{
			sCount = Integer.toString(count);
		    countdown.setText(sCount);
		    try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}*/
	

}