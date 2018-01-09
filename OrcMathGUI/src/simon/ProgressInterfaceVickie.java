package simon;

import guiTeacher.interfaces.Visible;

public interface ProgressInterfaceVickie extends Visible{

	void gameOver();
	
	void setRound(int num);
	
	void setSequenceSize(int num);
}
