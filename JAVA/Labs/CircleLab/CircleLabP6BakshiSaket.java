import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CircleLabP6BakshiSaket
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File input = new File("input.txt");
		Scanner numbers = new Scanner(input);

		double x, y, r;
		double grow;

		x = numbers.nextDouble();
		y = numbers.nextDouble();
		r = numbers.nextDouble();
		grow = numbers.nextDouble();

		CircleP6BakshiSaket testerCircle = new CircleP6BakshiSaket(x, y, r);

		System.out.println("Circle Center: (" + testerCircle.getX_Coordinates() + "," + testerCircle.getY_Coordinates() + ")");
		System.out.println("Circle Radius: " + testerCircle.getRadius());
		System.out.println("Circle Diameter: " + testerCircle.getDiameter());
		System.out.println("Circle Area: " + testerCircle.getArea());
		System.out.println("Circle Circumference: " + testerCircle.getCircumference());
		System.out.println("The circle grows by: " + grow);
		testerCircle.growCircle(grow);
		System.out.println("Circle Center: (" + testerCircle.getX_Coordinates() + "," + testerCircle.getY_Coordinates() + ")");
		System.out.println("Circle Radius: " + testerCircle.getRadius());
		System.out.println("Circle Diameter: " + testerCircle.getDiameter());
		System.out.println("Circle Area: " + testerCircle.getArea());
		System.out.println("Circle Circumference: " + testerCircle.getCircumference());
	}
}