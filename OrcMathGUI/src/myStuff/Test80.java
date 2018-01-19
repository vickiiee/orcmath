package myStuff;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class Test80 extends FullFunctionScreen{
	
	/*
	 * A window appears on screen on which there are two buttons:
	 *  a Button that says "Lose" and a button that says "Win". 
	 *  If the user clicks the Button that says "Lose", text appears that says "You lose."
	 *   Furthermore, clicking either Button will not do anything 
	 *   (You cannot click the "Win" button after clicking the "Lose" Button) 
	 *   Alternatively, if the user clicks the "Win" button, the text reads "You win." 
	 *   and both Buttons are disabled.
	 */
	private Button lose;
	private Button win;
	
	private boolean work = true;
	
	private TextArea youLose;
	private TextArea youWin;


	public Test80(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		
		youLose = new TextArea(500,200,100,100, "You Lose");
		youWin = new TextArea(500,200,100,100, "You Win");

		lose = new Button(100, 100, 100, 100, "Lose", Color.yellow, new Action() {
			public void act() {
				if (work) {
					work = !work;
					
					//youLose = new TextArea(500,200,100,100, "You Lose");
					viewObjects.add(youLose);
				}
				
			}
			
		});
		
		win = new Button(300,100, 100,100, "Win", Color.yellow, new Action() {

			@Override
			public void act() {
				if (work) {
					work = !work;
					
					//youWin = new TextArea(500,200,100,100, "You Win");
					viewObjects.add(youWin);
				}
			}
			
		});
		
		//youWin.setText("ch");
		viewObjects.add(lose);
		viewObjects.add(win);
	}

}
