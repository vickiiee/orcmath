package simon;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonJoanna extends Button implements ButtonInterfaceVickie {

	private boolean clicked;
	
	public ButtonJoanna(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, "", null);
		update();
		// TODO Auto-generated constructor stub
		
		
	}

	@Override
	public void setColor(Color color) {
		setBackground(color);

	}

	@Override
	public void highlight() {
		
	
	}

	@Override
	public void dim() {
		// TODO Auto-generated method stub

	}

	public void drawButton(Graphics2D g, boolean hover) {
		g.drawOval(25, 35, 25, 25);
		if(clicked) {
			g.highlight();
		}
	}
}


