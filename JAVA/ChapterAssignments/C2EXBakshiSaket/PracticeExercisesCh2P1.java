/*
Saket Bakshi
Period 6
9/23/18
This program prints 4 connected rectangles.
*/
import java.awt.Rectangle;

public class PracticeExercisesCh2P1
{
	public static void main(String[] args)
	{
		Rectangle box = new Rectangle(0, 0, 10, 20); //creates top left rectangle
		System.out.println(box);
		box.translate(10,0); //translates to top right rectangle
		System.out.println(box);
		box.translate(0,20); // translates to bottom right rectangle
		System.out.println(box);
		box.translate(-10,0); // translates to bottom left rectangle
		System.out.println(box);
	}
}