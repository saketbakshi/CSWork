import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File input = new File("input.txt");
		Scanner scanned = new Scanner(input);
		String inputer = scanned.nextLine();
		int testCases = Integer.parseInt(inputer);

		for(int counter = testCases; counter > 0; counter--)
		{
			String testString = scanned.nextLine();
			testString = testString.toLowerCase();
			int length = testString.length();


			for(int i = 1; i < length + 1; i++)
			{
				String temp = testString.substring(i-1, i);

				if(temp.equals("a"))
					System.out.print("A");
				else if(temp.equals("e"))
					System.out.print("E");
				else if(temp.equals("i"))
					System.out.print("I");
				else if(temp.equals("o"))
					System.out.print("O");
				else if(temp.equals("u"))
					System.out.print("U");
			}

			System.out.println("");
		}
	}
}