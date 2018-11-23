/* Saket Bakshi. 10/15/18. Period 6
This program takes a radius and returns the area and circumference of a circle with that radius as well as the volume and surface area of a sphere with that radius.
Ch 4, Exercise 7
*/
import java.util.Scanner;

public class PracticeExercisesCh4E7
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		System.out.println("What is your radius? ");
		int radius = key.nextInt(); //makes variable to store radius

		double area, circumference, volume, surfaceArea; //makes variables for circle and sphere parameters

		area = Math.PI * radius * radius;
		circumference = 2 * Math.PI * radius;
		volume = 4 / 3 * Math.PI * Math.pow(radius, 3);
		surfaceArea = 4 * Math.PI * Math.pow(radius, 2); //doing all calculations

		System.out.println("For a circle of radius " + radius + ", the area is " + area + " and the circumference is " + circumference + ".");
		System.out.println("For a sphere of radius " + radius + ", the volume is " + volume + " and the surface area is " + surfaceArea + ".");		
		//Prints the parameters
	}
}