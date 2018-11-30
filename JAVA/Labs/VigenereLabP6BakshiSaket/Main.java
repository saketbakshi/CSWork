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
		
		do //runs through the loop until all lines of code have been converted
		{
			String encodeOrDecode = inputScanner.next();
			String key = inputScanner.next();
			String message = inputScanner.nextLine();

			VigenereLabP6BakshiSaket bleh = new VigenereLabP6BakshiSaket(encodeOrDecode, key, message);
			bleh.runThroughInput();
			System.out.println(bleh.getOutput());			
		} while(inputScanner.hasNext()); 
		
		inputScanner.close();
	}	
}