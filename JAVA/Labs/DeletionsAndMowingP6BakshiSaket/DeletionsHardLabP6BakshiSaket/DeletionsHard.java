/* Saket Bakshi. AP Computer Science A. Deletions Hard. Due March 10, 2019.
This class solves the Deletions Hard problem.
*/
public class DeletionsHard
{
	private boolean isCleared; //variable to judge if problem is solved
	private int[] input; //holds the problem sequence
	private int inputLength; //length of sequence
	private int steps; //steps to solve sequence

	/**
		This takes an integer array and solves it according to the rules of the deletions hard directions.
		@param initialSequence the initial array
	*/
	public DeletionsHard(int[] initialSequence)
	{
		isCleared = false;
		input = initialSequence;
		inputLength = initialSequence.length;
		steps = 0;
	}

	/**
		This takes an integer array and solves it according to the rules of the deletions hard directions.
	*/
	public DeletionsHard()
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

		if(zeroPlaceholder != 0 || (input[0] == 0 && input.length > 1)) //if there is a 0 and it isn't the first digit
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
			int common = 0;
			int numberOfCommon = 0;
			for(int i = 0; i <= 9; i++) //goes through each digit from 0-9 to find how often each appears
			{
				int numberOfCurrent = 0; //the amount of digits of the current digit being searched for (i)
				for(int a = 0; a < input.length; a++)
				{
					if(input[a] == i) //finds number of occurences of current digit
						numberOfCurrent++;
				}
				if(numberOfCurrent > numberOfCommon) //if has most occurences, it is saved as most common, with number of occurences saved
				{
					numberOfCommon = numberOfCurrent;
					common = i;
				}
				else if(numberOfCurrent >= numberOfCommon && i > common && numberOfCurrent != 0) //if has an equal number of appearances to most appeared but is larger, this number is saved
				{
					numberOfCommon = numberOfCurrent;
					common = i;
				}
			}
			int commonPlaceholder = 0;
			for(int i = 0; i < input.length; i++) //finds rightmost occurence of most common number
			{
				if(input[i] == common)
					commonPlaceholder = i;
			}
			if(common % 2 == 0)
					input[commonPlaceholder] = input[commonPlaceholder] - 2;
			else
				input[commonPlaceholder] = input[commonPlaceholder] - 1;
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