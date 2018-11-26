import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class VigenereTesterP6BakshiSaket
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//scans in file
		File inputFile = new File("input.txt");
		Scanner inputScanner = new Scanner(inputFile);
		
		do //runs through the loop until all lines of code have been converted
		{
			String encodeOrDecode = inputScanner.next(); //takes first String in the line for knowing to encrypt or decrypt
			String key = inputScanner.next();

			String input = inputScanner.nextLine().toUpperCase(); //converts all inputs to uppercase

			VigenereLabP6BakshiSaket fml = new VigenereLabP6BakshiSaket(encodeOrDecode, input); //creates CaesarCipherLab objects
			fml.runThroughInput(); //runs through the encryption or decryption
		} while(inputScanner.hasNext()); 

	}	
}