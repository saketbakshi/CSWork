/* Saket Bakshi. Mr. Caces. AP Computer Science A. Due 23 October 2018.
This class tests the ICAO translator class
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ICAOTranslatorLabTester
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//scans in file
		File inputFile = new File("input.txt");
		Scanner inputScanner = new Scanner(inputFile);

		//takes the amount of Strings to convert
		String firstLine = inputScanner.nextLine();

		int testCases = Integer.parseInt(firstLine);

		//converts all the Strings
		for(int i = testCases; i > 0; i--)
		{
			ICAOTranslatorLab icao = new ICAOTranslatorLab(inputScanner.nextLine());

			icao.runThroughInput();

			System.out.println(icao.getOutput()); //prints out the Strings
		}



	}
}