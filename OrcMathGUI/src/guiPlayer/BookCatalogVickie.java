package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class BookCatalogVickie extends Component {

	private String title;
	private String author;
	private String genre;
	private int bookNum;
	
	
	public BookCatalogVickie(String title, String author, String genre, int bookNum) {///
		super(40, 40, 400, 633);
		
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.bookNum = bookNum;
		
		/*addSequence("resources/v.png", 150, 0, 570*3, 400, 633, 4);
		//height: 633, 633*2, 570*3
		//Thread animation = new Thread(this);
		//animation.start();
		//update();
		*/
		
	}

	public String toString() {
		return title + ", " + author + ", " + genre + ", " + bookNum;
	}
	
	
	@Override
	public void update(Graphics2D g) {
		//g.setColor(Color.blue);
		//g.fillRect(0, 0, getWidth(), getHeight());
		//super.update(g);
	}

}
