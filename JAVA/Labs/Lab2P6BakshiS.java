import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.awt.Rectangle;
//Import necessary classes for constructing a rectangle and reading files


public class Lab2P6BakshiS
{
	public static void main (String[] args) throws FileNotFoundException
	{
		int x,y,w,h; //declare variables for x and y position of rectangle, also width and height of rectangle
		int a, b; //declares variables for last two numbers of the input

		File inputFile = new File("input.txt"); //declares variable "input.txt" as a File 
        Scanner scanFile = new Scanner(inputFile); //converts File to a Scanner variable
        
        
        x = scanFile.nextInt(); 
        y = scanFile.nextInt();
        w = scanFile.nextInt();
        h = scanFile.nextInt();
        a = scanFile.nextInt();
        b = scanFile.nextInt(); //scans file for input values in order given in file and sets them to the previously declared variables
		

		//1. The first 4 numbers are used as the arguments for a rectangle. print this object. 
		Rectangle test = new Rectangle(x,y,w,h); //sets a new Rectangle variable called test, sets test x, y, width, and height to variables x, y, w, h, respectively
		System.out.println(test); //prints test rectangle

		//2. The last 2 numbers will be used to translate that rectangle. print this edited object.
		test.translate(a,b); //translates x coordinate of test by a units and y coordinate of test by b units
		System.out.println(test); //prints new test rectangle with translated position

		//3. You will multiply the 5th number with the width. The 6th number will multiply with the height. print this object.
		w = w*a; 
		h = h*b; //multiples the width and height of the rectangle by the 5th and 6th numbers, respectively
		test.setSize(w,h); //sets the size of test rectangle to newly set width and height, defined by the newly multiplied w and h, respectively
		System.out.println(test); //prints new test rectangle with new dimensions

		//4. you will also print the height, width x and y on separate lines starting with x then y then width then height. please refer to the java8 API for help
		System.out.println(test.getX()); //prints x-coordinate for position of upper left corner of test rectangle
		System.out.println(test.getY()); //prints y-coordinate for position of upper left corner of test rectangle
		System.out.println(test.getWidth()); //prints width of test rectangle
		System.out.println(test.getHeight()); //prints height of test rectangle
	}
}