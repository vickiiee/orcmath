package simon;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenVickie extends ClickableScreen implements Runnable{

	/*TextLabel                     (for displaying the current round)
	ButtonInterfaceX[]	            (the buttons on the screen)
	ProgressInterfaceX              (for displaying game info)
	sequenceayList<MoveInterfaceX>       (for storing the sequence)
	*/
	
	private TextLabel label;
	private ButtonInterfaceVickie[] bFace;
	private ProgressInterfaceVickie pFace;
	private ArrayList<MoveInterfaceVickie> sequence;
	
	private boolean acceptingInput;
	
	private int roundNumber;
	private int sequenceIndex;
	private int lastSelectedButton;
	private int numberOfButtons = 5; 
	
	public SimonScreenVickie(int width, int height) {
		super(width, height);
		Thread t = new Thread(this);
		t.start();
	}

	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		
		for(ButtonInterfaceVickie b: bFace){ 
		    viewObjects.add(b); 
		}
		
		pFace = getProgress(); 
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceVickie>();
		//add 2 moves to start
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(pFace);
		viewObjects.add(label);
	}

	public void addButtons() {
		//setbFace(new ButtonInterfaceVickie[numberOfButtons]);
		bFace = new ButtonInterfaceVickie[numberOfButtons];
		Color[] colors = {Color.RED, Color.orange, Color.yellow, Color.green, Color.cyan};
		
		for(int i = 0; i<numberOfButtons; i++) {
			final ButtonInterfaceVickie b = getAButton(); // after it is created, it does not change
			bFace[i] = b;
			
			b.setColor(colors[i]);
		    b.setX(i + 20);
		    b.setY(100);
		    
		    b.setAction(new Action(){

		    	public void act(){

		    		if(acceptingInput) {
		    			Thread blink = new Thread(new Runnable(){

		    				public void run(){ //highlight the button
		    					
		    					 b.highlight();
		    					 try {
		    						 Thread.sleep(800);
		    					 }catch (InterruptedException e) {
		    						 e.printStackTrace();
		    					 }
		    					 b.dim();
		    				}

		    				});
		    			blink.start();
		    			
		    			if(b == sequence.get(sequenceIndex).getButton()) {
		    				sequenceIndex++;
		    			}else {
		    				pFace.gameOver();
		    			}
		    			
		    			if(sequenceIndex == sequence.size()){ 
						    Thread nextRound = new Thread(SimonScreenVickie.this); 
						    nextRound.start(); 
						}
		    		}
		    	}

		    });
		}
	}
	
	/**
	Placeholder until partner finishes implementation of ButtonInterface
	*/
	public ButtonInterfaceVickie getAButton() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	*/
	public ProgressInterfaceVickie getProgress() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public MoveInterfaceVickie randomMove() {
		int bIndex = (int)(Math.random()*bFace.length);
	    while(bIndex == lastSelectedButton){
	        bIndex = (int)(Math.random()*bFace.length);
	    }
	    return getMove(bIndex);
	}
	
	/**
	Placeholder until partner finishes implementation of MoveInterface
	*/
	public MoveInterfaceVickie getMove(int bIndex) {
	    return null;
	}
	
	public void run() {
		label.setText("");
	    nextRound();
	}

	public void nextRound() {
		acceptingInput = false;
		roundNumber++;
		sequence.add(randomMove());
		pFace.setRound(roundNumber);
		pFace.setSequenceSize(sequence.size());
		
		changeText("Simon's turn.");
		label.setText("");
		
		playSequence();
		changeText("Your turn.");
		acceptingInput = true;
		sequenceIndex = 0;
		
	}
	
	public void changeText(String s){
		Thread blink = new Thread(new Runnable(){

			public void run(){
				label.setText(s);
				try {
					Thread.sleep(1000);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
			}

		});
		blink.start();
	}

	public void playSequence() {
		ButtonInterfaceVickie b=null;
		
		for(int i = 0; i < sequence.size(); i++) {
			if (b!=null) {
				b.dim();
				b=sequence.get(i).getButton();
				b.highlight();
				int sleepTime = (int)Math.sqrt(roundNumber);
				Thread blink = new Thread(new Runnable(){

					public void run(){
						try {
							Thread.sleep(sleepTime);
							} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							}
					}

				});
				blink.start();
			}
		}
		b.dim();
	}

	public ButtonInterfaceVickie[] getbFace() {
		return bFace;
	}

	public void setbFace(ButtonInterfaceVickie[] bFace) {
		this.bFace = bFace;
	}


}
