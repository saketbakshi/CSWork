import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DecimalToBinaryLabTesterP6BakshiSaket
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File input = new File("input.txt");
		Scanner key = new Scanner(input);

		int convertTo, firstBase, number;

		convertTo = key.nextInt();
		firstBase = key.nextInt();
		number = key.nextInt();

		DecimalToBinaryLab tester = new DecimalToBinaryLab(convertTo, firstBase, number);

		tester.convert();
		System.out.println(number + " base " + firstBase + " to base " + convertTo + " is: " + tester.getNewNumber() + " base " + convertTo);
	}
}