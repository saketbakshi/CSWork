import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
	Saket Bakshi. 4/1/19. Period 6. This is used for the Number Please Lab.
	Works with a testcase to find the sum of all numbers within a given rectangle.
*/
public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		NumberPlease please = new NumberPlease();

		File inFile = new File("input.txt");
		Scanner scanned = new Scanner(inFile);
		
		while(scanned.hasNext())
		{
			int x1 = scanned.nextInt();
			int y1 = scanned.nextInt();
			int x2 = scanned.nextInt();
			int y2 = scanned.nextInt();
			System.out.println(please.findTotal(x1, y1, x2, y2));
			if(scanned.hasNextLine())
				scanned.nextLine();	
		}
	}
}