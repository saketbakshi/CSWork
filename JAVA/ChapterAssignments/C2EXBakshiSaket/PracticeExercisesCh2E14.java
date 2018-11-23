/*
Saket Bakshi
Period 6
9/23/18
This program declares and initializes a square an then replaces it with a different rectangle.
*/
import java.awt.Rectangle;

public class PracticeExercisesCh2E14
{
	public static void main(String[] args)
	{
		Rectangle square = new Rectangle(10, 20, 40, 40);
		System.out.println(square);
		square.setBounds(20, 20, 40, 40);
		System.out.println(square);
	}
}