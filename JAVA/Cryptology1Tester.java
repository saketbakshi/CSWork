import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Cryptology1Tester
{
	public static void main(String[]args) throws FileNotFoundException
	{
		File input = new File("input.txt");
		Scanner scan = new Scanner(input);
		
		do
		{
			String letter = scan.next();
			int key = scan.nextInt();
			String message = scan.nextLine();
			Cryptology1 boy = new Cryptology1(letter,key,message);
			boy.crackCode();
		} while (scan.hasNext());
	}
}