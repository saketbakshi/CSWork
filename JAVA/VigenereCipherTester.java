import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class VigenereCipherTester
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inputFile = new File("input.txt");
		Scanner scanFile = new Scanner(inputFile);
		for(int i = 0; i < 4; i++)
		{
			VigenereCipher cipher = new VigenereCipher(scanFile.next().charAt(0), scanFile.next(), scanFile.nextLine());
			cipher.crypt();
			System.out.println(cipher.getInput());
			System.out.println(cipher.getOutput());
		}
	}
}