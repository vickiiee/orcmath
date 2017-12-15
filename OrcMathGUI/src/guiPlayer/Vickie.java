package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class Vickie extends AnimatedComponent {

	public Vickie() {
		
		super(40, 40, 400, 633);
		
		addSequence("resources/v.png", 150, 0, 633*2, 400, 633, 4);
		Thread animation = new Thread(this);
		animation.start();
		update();
	}

	
	@Override
	public void update(Graphics2D g) {
		//g.setColor(Color.blue);
		//g.fillRect(0, 0, getWidth(), getHeight());
		
		super.update(g);
	}

}
