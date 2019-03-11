/* Saket Bakshi. AP Computer Science A. Deletions Easy. Due March 10, 2019.
This class solves the Deletions Easy problem.
*/
public class DeletionsEasyV2
{

	private boolean isCleared; //variable to judge if problem is solved
	private int[] input; //holds the problem sequence
	private int inputLength; //length of sequence
	private int steps; //steps to solve sequence

	/**
		This takes an integer array and solves it according to the rules of the deletions easy directions.
		@param initialSequence the initial array
	*/
	public DeletionsEasyV2(int[] initialSequence)
	{
		isCleared = false;
		input = initialSequence;
		inputLength = initialSequence.length;
		steps = 0;
	}

	/**
		This takes an integer array and solves it according to the rules of the deletions easy directions.
	*/
	public DeletionsEasyV2()
	{
		isCleared = false;
		input = new int[100];
		inputLength = 0;
		steps = 0;
	}

	/**
		This solves the sequence
	*/
	public void doTurn()
	{
		int zeroPlaceholder = 0; //sees if there are zeros, finds location of the rightmost 0.
		for(int i = 0; i < input.length; i++)
		{
			if(input[i] == 0)
			{
				zeroPlaceholder = i;
			}
		}

		if(zeroPlaceholder != 0) //if there is a 0 and it isn't the first digit
		{
			int[] holder = new int[input.length - zeroPlaceholder - 1];
			for(int j = 0; j < holder.length; j++) //cut the input from the beginning to the rightmost 0
			{
				holder[j] = input[input.length - holder.length + j];
			}
			input = holder;
			inputLength = input.length;
			steps++;
		}
		else if(zeroPlaceholder == 0 && input.length == 1 && input[0] == 0) //if there is a 0 in the first part of a 1 digit array
		{
			int[] holder = new int[0];
			input = holder;
			steps++; //clear the array and add a step
		}
			
		checkIfClear();

		if(input.length !=0) //if the array isn't clear
		{
			int max = input[0];
			int placeholder = 0;
			
			for(int i = 1; i < inputLength; i++) //find the rightmost maximum and its place
			{
				if(input[i] > max)
				{
					max = input[i];
				}
				if(input[i] == max)
				{
					placeholder = i;
				}
			}
			
			if(input[placeholder] % 2 == 0) //if even, subtract max by 2
			{
				input[placeholder] = input[placeholder] - 2;
			}
			else //if odd, subtract max by 1
			{
				input[placeholder] = input[placeholder] - 1;
			}
			steps++;
		}
	}
	
	/**
		Checks if the solution has been solved.
	*/
	public void checkIfClear()
	{
		if(input.length == 0)
			isCleared = true;
	}
	
	/**
		Returns if the solution has been solved.
		@return if the solution is solved
	*/
	public boolean isClear() {return isCleared;}
	
	/**
		Returns the input length.
		@return the length of the input
	*/
	public int inpLength() {return inputLength;}
	
	/**
		Returns if the number of steps taken to solve the problem.
		@return the number of steps
	*/
	public int howManySteps() {return steps;}
}