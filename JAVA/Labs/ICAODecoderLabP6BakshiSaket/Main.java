import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main
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
			ICAODecoderLabP6BakshiSaket icao = new ICAODecoderLabP6BakshiSaket(inputScanner.nextLine());

			icao.runThroughInput();

			System.out.println(icao.getOutput()); //prints out the Strings
		}



	}
}