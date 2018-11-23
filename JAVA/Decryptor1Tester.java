import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Decryptor1Tester
{
	public static void main(String[]args) throws FileNotFoundException
	{
		File input = new File("input.txt");
		Scanner scan = new Scanner(input);
		
		do
		{
			String letter = scan.next();
			int key = scan.nextInt();
			String message = scan.next();
			Decryptor1 boy = new Decryptor1(letter,key,message);
			boy.decrypt();
		} while (scan.hasNext());
	}
}