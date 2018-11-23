/* Saket Bakshi. Mr. Caces. AP Computer Science A. Due 21 October 2018.
This program tests the FracCalc class.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FracCalcTester
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inFile = new File("input.txt"); //reads input.txt
		Scanner input = new Scanner(inFile); 

		for(int i = 5; i >= 1; i--) //reads 5 lines of input
		{
			FracCalc fc = new FracCalc(input.nextLine()); //rewrites input for FracCalc class object from next line

			System.out.println(fc.getInputLine()); //prints the input

			fc.doCalculation(); //calculates the answer

			fc.simplify(); //simplifies the answer

			fc.getAnswer(); //prints the answer
		}

	}
}