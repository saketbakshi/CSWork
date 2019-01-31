import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inFile = new File("input.txt");
		Scanner scan = new Scanner(inFile);
		
		while(scan.hasNextLine())
		{
			String eOrD = scan.next();
			String key = scan.next();
			String message = scan.nextLine();
			TranspositionLabP6BakshiSaket test = new TranspositionLabP6BakshiSaket(eOrD, key, message);
			test.runThroughInput();
			System.out.println(test.getOutput());
		}
		
		scan.close();
	}
}