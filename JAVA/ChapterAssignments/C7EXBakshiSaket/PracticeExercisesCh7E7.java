/* Saket Bakshi 12/10/18. Period 6
This program, for #7 of Ch 7, reverses the order of an array
*/
import java.util.Random;
import java.util.Arrays;

public class PracticeExercisesCh7E7
{
	public static void main(String[] args)
	{
		Random r = new Random();
		
		int lengthArray = 0;
		do
		{
			lengthArray = r.nextInt(20);
		} while(lengthArray % 2 != 0 && lengthArray > 0); //gets an even number greater than 0

		int[] original = new int[lengthArray]; //constructs array
		for(int i = 0; i < original.length; i++) //fills array with random integers from 0 to 19, inclusive
			original[i] = r.nextInt(20);

		for(int i = 0; i < original.length; i++) //prints original array values
			System.out.print(original[i] + " ");
		System.out.println();
		
		int[] temp = Arrays.copyOf(original, original.length); //makes a copy of the original array

		int i = 0; //sets first index
		int j = original.length-1; //sets last index
		while(i < original.length/2) //takes first index to midpoint
		{
			original[i] = temp[j]; //sets lower index value to higher index value
			original[j] = temp[i]; //vice versa
			i++; //increases lower index
			j--; //decreases higher index
		}

		for(int k = 0; k < original.length; k++) //prints new array
			System.out.print(original[k] + " ");
	}
}