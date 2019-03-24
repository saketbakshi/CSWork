import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
/**
	Saket Bakshi. 3/22/19. Period 6. This is used for question 1 of Chapter 11.
	Opens a file, rewrites it, closes it, reopens it, and prints it on screen.
*/

public class FileTester
{
	public static void main(String[] args) throws FileNotFoundException
	{
		
		PrintWriter out = new PrintWriter("hello.txt"); //PrintWriter object to write to a file
		out.println("Hello, World!"); //writing to the file
		out.close();

		File inFile = new File("hello.txt"); //rereading the file
		Scanner scanned = new Scanner(inFile);
		System.out.println(scanned.nextLine()); //printing the file line to console
		scanned.close();
	}
}