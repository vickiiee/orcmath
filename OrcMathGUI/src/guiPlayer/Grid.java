package guiPlayer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Grid {

	private static String input;

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		System.out.println("type something");

		input = in.nextLine();

		stuff("sjdka.txt", input);

	}

	public static void stuff (String fileName, String input) {
		/*FileWriter fw=new FileWriter(fileName);    

		fw.write("This file was created programmatically.");  */
		try{    

			FileWriter fw=new FileWriter(fileName);    

			fw.write(input);    

			fw.close();    

			System.out.println("Success! File \""+fileName+"\" saved!");

		}catch(IOException e){

			System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");

		}
	}
}
