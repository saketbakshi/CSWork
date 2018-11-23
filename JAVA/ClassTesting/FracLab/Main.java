import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inFile = new File("input.txt");
		Scanner input = new Scanner(inFile);

		for(int i = 5; i >= 1; i--)
		{
			FracCalc fc = new FracCalc(input.nextLine());

			fc.doCalculation();

			fc.simplify();

			fc.getAnswer();

		}
	}
}