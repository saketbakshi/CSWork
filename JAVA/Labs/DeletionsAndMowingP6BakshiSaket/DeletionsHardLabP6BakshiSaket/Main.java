/* Saket Bakshi. AP Computer Science A. Deletions Hard. Due March 10, 2019.
This class tests the Deletions Hard problem.
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inFile = new File("input.txt"); //input file and scanner
		Scanner scanned = new Scanner(inFile);
		Scanner amountOfLinesTester = new Scanner(inFile);
		int numberOfLines = 0;
		while(amountOfLinesTester.hasNextLine())
		{
			numberOfLines++;
			amountOfLinesTester.nextLine();
		}
		
		
		for(int i = 0; i < numberOfLines; i++)
		{
			String string = scanned.nextLine().replaceAll("[^0-9]",""); //change line to array of integers
			int[] array = new int[string.length()];
			for(int currentChar = 0; currentChar < string.length(); currentChar++) //fill in array of integers from input
			{
				array[currentChar] = Integer.parseInt(string.substring(currentChar, currentChar + 1));
			}
			
			DeletionsHard tester = new DeletionsHard(array); //make Deletions object
			
			while(!tester.isClear()) //do while the array isn't clear
			{
				tester.doTurn();
			}
			
			System.out.println(tester.howManySteps());
		}
		scanned.close();
	}
}