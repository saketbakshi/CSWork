import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Temp
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inputFile = new File("input.txt");
		Scanner inputScanner = new Scanner(inputFile);

		int counter = 0;
		while(inputScanner.hasNextLine())
		{
			counter++;
			String temp = inputScanner.nextLine();
			System.out.println(temp);
			System.out.println(counter);
		}
		inputScanner.reset();

	}
}