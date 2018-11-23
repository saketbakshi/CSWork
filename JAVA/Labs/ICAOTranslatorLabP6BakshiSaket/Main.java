/* Saket Bakshi. Mr. Caces. AP Computer Science A. Due 23 October 2018.
This class tests the ICAO translator class
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inputFile = new File("input.txt");
		Scanner inputScanner = new Scanner(inputFile);

		String firstLine = inputScanner.nextLine();

		int testCases = Integer.parseInt(firstLine);

		//System.out.println(testCases);

		for(int i = testCases; i > 0; i--)
		{
			ICAOTranslatorLab icao = new ICAOTranslatorLab(inputScanner.nextLine());

			icao.runThroughInput();

			System.out.println(icao.getOutput());
		}



	}
}