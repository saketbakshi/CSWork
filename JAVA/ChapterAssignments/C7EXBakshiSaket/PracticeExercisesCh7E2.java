/* Saket Bakshi 12/10/18. Period 6
This program, for #2 of Ch 7, completes tasks for an array of integers
*/
import java.util.Arrays;

public class PracticeExercisesCh7E2
{
	private int[] values; //original array
	private int[] modifiedValues; //modified array
	private int currentSize; //length of original array

	/** This class completes tasks for integer arrays
	@param initialValues the initial array
	*/
	public PracticeExercisesCh7E2(int[] initialValues)
	{
		this.values = Arrays.copyOf(initialValues, initialValues.length); //copies array, not the reference
		this.modifiedValues = Arrays.copyOf(initialValues, initialValues.length);
		this.currentSize = initialValues.length;
	}

	/** Prints the original array
	*/
	public void getOriginal()
	{
		for(int i = 0; i < this.currentSize; i++)
			System.out.print(this.values[i] + " ");
	}

	/** Prints the modified array
	*/
	public void getModded()
	{
		for(int i = 0; i < this.currentSize; i++)
			System.out.print(this.modifiedValues[i] + " ");
	}

	/** swaps first and last element in array
	*/
	public void partA()
	{
		int temp = this.values[0];
		this.modifiedValues[0] = this.modifiedValues[this.currentSize - 1];
		this.modifiedValues[this.currentSize - 1] = temp;
	}

	/** shifts elements to the right, last element becomes first
	*/
	public void partB()
	{
		int temp = this.values[this.currentSize - 1]; //creates temp value for last element
		for(int i = this.currentSize - 1; i > 0; i--) //shifts array
		{
			this.modifiedValues[i] = this.modifiedValues[i-1];
		}
		this.modifiedValues[0] = temp;
	}
	
	/** replaces even elements with 0
	*/
	public void partC()
	{
		for(int i = 0; i < this.modifiedValues.length-1; i = i + 2) //goes through even indexes of the array
		{
			this.modifiedValues[i] = 0;
		}
	}
	
	/** replaces each element except first and last with the larger of its two neighbors
	*/
	public void partD()
	{
		for(int i = 1; i < this.currentSize - 1; i++)
		{
			if(this.values[i-1] < this.values[i+1]) //checks which neighbor is larger
				this.modifiedValues[i] = this.values[i+1]; //assigns the larger neighbor to the current index
			else if(this.values[i-1] > this.values[i+1])
				this.modifiedValues[i] = this.values[i-1];
			else if(this.values[i-1] == this.values[i+1])
				this.modifiedValues[i] = this.values[i];
		}
	}
	
	/** Removes the middle element if the array length is odd, or the middle two if length is even
	*/
	public void partE()
	{
		if(this.currentSize % 2 == 0) //if array is even in length
		{
			for(int i = (this.currentSize/2) - 1; i < this.currentSize - 2; i++) //shifts the array down two starting from the middle
			{
				this.modifiedValues[i] = this.modifiedValues[i+2];
			}
			
			for(int i = 0; i < this.currentSize - 2; i++)
			{
				System.out.print(this.modifiedValues[i] + " "); //prints all but last 2 elements
			}
		}
		else //if array length is odd
		{
			for(int i = (this.currentSize - 1) / 2; i < this.currentSize - 2; i++) //shift array down one starting from middle
			{
				this.modifiedValues[i] = this.modifiedValues[i+1];
			}
			
			for(int i = 0; i < this.currentSize - 1; i++)
			{
				System.out.print(this.modifiedValues[i] + " "); //prints all but last element
			}
		}
	}

	/** moves even elements to front, preserves rest of order of the array
	*/
	public void partF()
	{
		for(int i = 0; i < this.currentSize; i++) //goes through each element of the array
		{
			if(this.values[i] % 2 == 0) //if element is even
			{
				int temp = this.values[i]; //a temp variable takes the element's value
				for(int j = i; j >= 1; j--) //the array is shifted down by 1 from right to left 
				{
					this.modifiedValues[j] = this.modifiedValues[j-1];
				}
				this.modifiedValues[0] = temp; //first element is set to the temp integer
			}
		}
	}

	/** prints the second largest element
	*/
	public void partG()
	{
		int largest = this.values[0]; //sets largest and second largest to 0
		int secondLargest = this.values[0];
		for(int i = 0; i < this.currentSize; i++)
		{
			if(this.values[i] > largest) //if current value is larger than anything before
			{
				secondLargest = largest; //the previous largest is set to second largest
				largest = this.values[i]; //the new largest is set
			}
		}
		System.out.println(secondLargest);
	}

	/** returns true if array is in increasing order
	*/
	public void partH()
	{
		boolean order = false;
		for(int i = 0; i < this.currentSize - 2; i++) //checks each element until second-to-last
		{
			if(this.values[i] < this.values[i+1]) //checks if next element is greater
				order = true; //maintains boolean as true
			else //or else...
			{
				order = false; //boolean is set to false
				i = currentSize; //loop ends
			}
		}
		if(order)
			System.out.println("true");
		else
			System.out.println("false");
	}

	/** checks if two adjacent elements are duplicates
	*/
	public void partI()
	{
		boolean order = false;
		for(int i = 0; i < this.currentSize - 2; i++)
		{
			if(this.values[i] == this.values[i+1]) //checks is elements are identical
			{
				order = true; //sets boolean to true
				i = currentSize; //ends loop
			}
		}
		if(order)
			System.out.println("true");
		else
			System.out.println("false");
	}

	/** checks if there are duplicate elements
	*/
	public void partJ()
	{
		boolean duplicate = false;
		for(int i = 0; i < this.currentSize - 1; i++) //goes through each number
		{
			for(int j = i + 1; j < this.currentSize - 1; j++) //now goes through rest of numbers
			{
				if(this.values[j]==this.values[i]) //if first number is equal to second...
					duplicate = true; //boolean set to true
					j = this.currentSize; //inner loop ends
			}
			if(duplicate)
				i = this.currentSize; //outer loop ends
		}
		if(duplicate)
			System.out.println("true");
		else
			System.out.println("false");
	}
}