import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
	Saket Bakshi. 3/22/19. Period 6. This is used for question 2 of Chapter 11.
	Reads lines in a text file and prints them out, reformatted.
*/

public class FileModifier
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inFile = new File("input.txt");
		Scanner scanned = new Scanner(inFile);

		Scanner original = new Scanner(inFile);
		System.out.println("Original input file:");
		while(original.hasNextLine())
		{
			System.out.println(original.nextLine());
		}

		int lineNumber = 0;

		System.out.println("\nActual results:");

		scanned.reset();
		while(scanned.hasNextLine())
		{
			lineNumber++;
			System.out.println("/* " + lineNumber + " */ " + scanned.nextLine());
		}

		scanned.close();
	}
}