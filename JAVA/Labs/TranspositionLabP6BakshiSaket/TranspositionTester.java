/* Saket Bakshi. AP Computer Science A. Transposition Lab. Due December 16, 2018.
This class takes tests the TranspositionLab class.
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TranspositionTester
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inFile = new File("input.txt"); //take in file
		Scanner scan = new Scanner(inFile); //create Scanner class object for file
		
		while(scan.hasNextLine())
		{
			String eOrD = scan.next(); //read in parts of Transposition Lab class to construct an object
			String key = scan.next();
			String message = scan.nextLine();
			TranspositionLabP6BakshiSaket test = new TranspositionLabP6BakshiSaket(eOrD, key, message); //construct the object
			test.runThroughInput(); //encrypt or decrypt
			System.out.println(test.getOutput()); //print the output
		}
		
		scan.close(); //closes the scanner
	}
}