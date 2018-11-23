/* Saket Bakshi. Mr. Caces. AP Computer Science A. Due 15 November 2018.
This class tests the CaesarCipher class
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CaesarCipherLabTester
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//scans in file
		File inputFile = new File("input.txt");
		Scanner inputScanner = new Scanner(inputFile);
		
		do //runs through the loop until all lines of code have been converted
		{
			String encodeOrDecode = inputScanner.next(); //takes first String in the line for knowing to encrypt or decrypt
			
			int movement = inputScanner.nextInt(); //takes next Integer for seeing net movement of decryption or encryption
			if(movement > 26) //brings movements above 26 down to a range below 26
			{
				do
				{
					movement -=26;
				} while(movement > 26);
			}
			else if(movement < -26) //brings movements below -26 up to a range above -26
			{
				do
				{
					movement +=26;
				} while(movement < -26);
			}

			String input = inputScanner.nextLine().toUpperCase(); //converts all inputs to uppercase

			CaesarCipherLabP6BakshiSaket fml = new CaesarCipherLabP6BakshiSaket(encodeOrDecode, movement, input); //creates CaesarCipherLab objects
			fml.runThroughInput(); //runs through the encryption or decryption
		} while(inputScanner.hasNext()); 

	}
}