import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
	Saket Bakshi. 3/22/19. Period 6. This is used for question 5 of Chapter 11.
	Asks a user for a file name and prints the number of characters, words, and lines in that file.
*/

public class FileInformer
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What's the file name?");
		String fileName = keyboard.nextLine();

		File inFile = new File(fileName);
		Scanner scanForChar = new Scanner(inFile);
		Scanner scanForWords = new Scanner(inFile);
		Scanner scanForLines = new Scanner(inFile);

		Scanner printTest = new Scanner(inFile);
		while(printTest.hasNextLine())
		{
			System.out.println(printTest.nextLine());
		}

		int numChars = 0;
		scanForChar.useDelimiter("");
		while(scanForChar.hasNext())
		{
			scanForChar.next();
			numChars++;
		}
		System.out.println("Number of characters: " + numChars);

		int numWords = 0;
		while(scanForWords.hasNext())
		{
			scanForWords.next();
			numWords++;
		}
		System.out.println("Number of words: " + numWords);

		int numLines = 0;
		while(scanForLines.hasNextLine())
		{
			scanForLines.nextLine();
			numLines++;
		}
		System.out.println("Number of lines: " + numLines);
	}
}