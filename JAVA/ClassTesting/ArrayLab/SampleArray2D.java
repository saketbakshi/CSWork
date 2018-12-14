import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SampleArray2D
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File input = new File("input.txt");
		Scanner scan = new Scanner(input);
		String message = "";
		String key = "";

		while(scan.hasNextLine())
		{
			encodeDecode = scan.next();
			key = scan.next();
			message = scan.nextLine();

			CipherSample matrix = new CipherSample(encodeDecode, key, message);

			matrix.printArray2D(matrix.getMatrix());
			matrix.fillArray2D(matrix.getMatrix());
			matrix.printArray2D(matrix.getMatrix());
		}
	}
}