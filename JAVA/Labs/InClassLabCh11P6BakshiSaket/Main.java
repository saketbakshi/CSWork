import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inFile = new File("input.txt");
		Scanner scanned = new Scanner(inFile);
		scanned.useDelimiter("[^A-Za-z]+");
		PrintWriter out = new PrintWriter("output.txt");

		while(scanned.hasNext())
		{
			String firstWord = scanned.next();
			out.printf("%10s", firstWord);
			if(scanned.hasNext())
			{
				String secondWord = scanned.next();
				out.printf("%10s", secondWord);
				if(scanned.hasNext())
					out.println();
			}
		}

		scanned.close();
		out.close();
	}
}