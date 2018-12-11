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
			String[] parts = new String[3];
			parts[0] = inputScanner.next();
			parts[1] = inputScanner.next();
			parts[2] = inputScanner.nextLine();

			VigenereLabP6BakshiSaket bleh = new VigenereLabP6BakshiSaket(parts[0], parts[1], parts[2]);
			bleh.runThroughInput();
			System.out.println(bleh.getOutput());			
		} while(inputScanner.hasNext()); 
		
		inputScanner.close();
	}	
}