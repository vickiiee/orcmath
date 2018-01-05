package simon;

import java.awt.Color;

import guiTeacher.components.Action;
import guiTeacher.interfaces.Clickable;

public interface ButtonInterfaceVickie extends Clickable{

	void setColor(Color color);
	
	void setAction(Action a);

	void highlight();

	void dim();

}
