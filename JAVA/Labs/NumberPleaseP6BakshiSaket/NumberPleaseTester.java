import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
	Saket Bakshi. 4/1/19. Period 6. This is used for the Number Please Lab.
	Works with a file to find the sum of all numbers within a given rectangle.
*/
public class NumberPleaseTester
{
	public static void main(String[] args) throws FileNotFoundException
	{
		NumberPlease please = new NumberPlease();

		File inFile = new File("input.txt");
		Scanner scanned = new Scanner(inFile);
		
		while(scanned.hasNext())
		{
			int x1 = scanned.nextInt(); //20, 21, 47, 10
			int y1 = scanned.nextInt();
			int x2 = scanned.nextInt();
			int y2 = scanned.nextInt();
			System.out.println(x1 + ", " + y1 + " and " + x2 + ", " + y2 + ": " + please.findTotal(x1, y1, x2, y2));
			if(scanned.hasNextLine())
				scanned.nextLine();	
		}
	}
}