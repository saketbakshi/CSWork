import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.PrintWriter;
/**
	Saket Bakshi. 3/22/19. Period 6. This is used for project 3 of Chapter 11.
	Asks a use for a URL, reads all the data, and writes the data to a file. Asks user for name of output file.
*/

public class URLWriter
{
	public static void main(String[] args) throws IOException //throws exceptions
	{
		Scanner keyboard = new Scanner(System.in); //to input keystrokes
		System.out.println("What URL would you like to save to a file?");
		String address = keyboard.nextLine(); //address of website

		URL pageLocation = new URL(address); //creating URL object
		Scanner in = new Scanner(pageLocation.openStream()); //scanning the URL object

		System.out.println("What would you like the output file name to be?"); //choosing output file name (I end in .html so that the finished product opens in browser)
		String outputName = keyboard.nextLine();
		PrintWriter out = new PrintWriter(outputName); //creates object to write to a file

		while(in.hasNextLine()) //copies URL code to output file
		{
			out.println(in.nextLine());
		}
		
		out.close();
		in.close();
		keyboard.close(); //closes objects
	}
}