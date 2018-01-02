package myStuffff;

import java.awt.Color;
import java.awt.Graphics2D;

import guiPlayer.CustomLabel;
import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class CustomButton extends Button implements CustomLabel{

	private String string1;
	private String string2;
	private Color colorField;
	
	public CustomButton(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, text, action);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateString1(String string) {
		string1 = string;
		
	}

	@Override
	public void updateString2(String string) {
		string2 = string;
		
	}

	@Override
	public void setIconColor(Color color) {
		colorField = color;
	}

	public void drawButton(Graphics2D g, boolean hover){
		g.setColor(Color.black); 
	
	}
}
