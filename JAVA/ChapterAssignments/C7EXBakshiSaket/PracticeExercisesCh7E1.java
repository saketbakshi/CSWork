/* Saket Bakshi 12/10/18. Period 6
This program, for #1 of Ch 7, initializes an array with 10 random integers and prints one line for each of the following:
Every element at an even index
Every even element
All elements in reverse order
The first and last element
*/
import java.util.Random;

public class PracticeExercisesCh7E1
{
	public static void main(String[] args)
	{
		Random r = new Random(); //makes Random class object

		int[] array = new int[10]; //makes int type array
		for(int i = 0; i < 10; i++) //puts random int in each array element
		{
			array[i] = r.nextInt();
		}

		System.out.print("The array is: "); //prints the array
		for(int i = 0; i < 10; i++)
		{
			System.out.print(array[i] + " ");
		}		

		System.out.println("");
		System.out.println("");
		for(int i = 0; i < 5; i++) //prints the even elements
		{
			System.out.print(array[2*i] + " ");
		}

		System.out.println("");
		System.out.println("");
		for(int i = 0; i < 10; i++)
		{
			if(array[i] % 2 == 0) //checks if element is even
			{
				System.out.print(array[i] + " "); //prints if even
			}
		}

		System.out.println("");
		System.out.println("");
		for(int i = 9; i >= 0; i--) //loop in array's reverse order
		{
			System.out.print(array[i] + " "); //prints element
		}

		System.out.println("");
		System.out.println("");
		System.out.print(array[0] + " " + array[9]); //prints first and last element
	}
}