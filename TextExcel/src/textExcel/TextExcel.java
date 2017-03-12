package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextExcel
{

	public static void main(String[] args){
		//makes new spreadsheet object
		Spreadsheet test = new Spreadsheet();
		Scanner getUserInput = new Scanner(System.in);
		String userInput = getUserInput.next();
		//loop runs until user types quit
		while(!userInput.equals("quit")){
			test.processCommand(userInput);
			userInput = getUserInput.next();
		}
		test.getGridText();
		System.out.println(test.cellInspection("A1"));
		                      
	}
}
