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
			VigenereLabP6BakshiSaket bleh = new VigenereLabP6BakshiSaket(inputScanner.next(), inputScanner.next(), inputScanner.nextLine());
			bleh.runThroughInput();
			System.out.println(bleh.getOutput());			
		} while(inputScanner.hasNext()); 
		
		inputScanner.close();
	}	
}