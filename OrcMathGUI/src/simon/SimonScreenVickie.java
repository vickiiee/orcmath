package simon;

import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

///////////////////////////////STEP 10

public class SimonScreenVickie extends ClickableScreen implements Runnable{

	/*TextLabel                     (for displaying the current round)
	ButtonInterfaceX[]	            (the buttons on the screen)
	ProgressInterfaceX              (for displaying game info)
	ArrayList<MoveInterfaceX>       (for storing the sequence)
	*/
	
	private TextLabel currRound;
	private ButtonInterfaceVickie bFace;
	private ProgressInterfaceVickie pFace;
	private ArrayList<MoveInterfaceVickie> arr;
	
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;
	
	private Object progress;
	
	
	public SimonScreenVickie(int width, int height) {
		super(width, height);
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		
		for(ButtonInterfaceVickie b: buttons){ //not sure what this variable is....
		    viewObjects.add(b); 
		}
		
		pFace = getProgress(); //set it to pFace?
		currRound = new TextLabel(130,230,300,40,"Let's play Simon!");
		arr = new ArrayList<MoveInterfaceVickie>();
		//add 2 moves to start
		lastSelectedButton = -1;
		arr.add(randomMove());
		arr.add(randomMove());
		roundNumber = 0;
		viewObjects.add(pFace);
		viewObjects.add(currRound);
	}

	private MoveInterfaceVickie randomMove() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	*/
	private ProgressInterfaceVickie getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		// TODO Auto-generated method stub
		
	}

}
