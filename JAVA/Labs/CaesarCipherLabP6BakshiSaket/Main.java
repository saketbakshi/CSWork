/* Saket Bakshi. Mr. Caces. AP Computer Science A. Due 15 November 2018.
This class tests the CaesarCipher class
*/
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
		
		do
		{
			String encodeOrDecode = inputScanner.next();
			
			int movement = inputScanner.nextInt();
			if(movement > 26)
			{
				do
				{
					movement -=26;
				} while(movement > 26);
			}
			else if(movement < -26)
			{
				do
				{
					movement +=26;
				} while(movement < -26);
			}

			String input = inputScanner.nextLine().toUpperCase();

			CaesarCipherLabP6BakshiSaket fml = new CaesarCipherLabP6BakshiSaket(encodeOrDecode, movement, input);
			fml.runThroughInput();
			//System.out.println(fml.getOutput());
		} while(inputScanner.hasNext());

	}
}