/* Saket Bakshi 12/10/18. Period 6
This program, for #5 of Ch 8, tests the #5 class.
*/
import java.util.Scanner;

public class PracticeExercisesCh8E5Tester
{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		PracticeExercisesCh8E5 test = new PracticeExercisesCh8E5(); //introduces object
		System.out.println("I can calculate volumes and surface areas for certain 3D objects after you give me a certain radius and height.");
		System.out.print("Give me a radius: "); //prompts for dimensions
		double r = key.nextDouble();
		System.out.print("Give me a height: ");
		double h = key.nextDouble();

		System.out.printf("A cube's volume is: %25s", test.cubeVolume(h) + "\n"); //returns and prints all calculations
		System.out.printf("A cube's surface area is: %19s", test.cubeSurface(h) + "\n");
		System.out.printf("A sphere's volume is: %23s", test.sphereVolume(r) + "\n");
		System.out.printf("A sphere's surface area is: %10s", test.sphereSurface(r) + "\n");
		System.out.printf("A cylinder's volume is: %21s", test.cylinderVolume(r, h) + "\n");
		System.out.printf("A cylinder's surface area is: %9s", test.cylinderSurface(r, h) + "\n");
		System.out.printf("A cone's volume is: %25s", test.coneVolume(r, h) + "\n");
		System.out.printf("A cone's surface area is: %19s", test.coneSurface(r, h) + "\n");
	}
}