public class DeletionsEasy
{
	private int moves;
	private int[] input;
	private int arrayLength;

	public DeletionsEasy()
	{
		moves = 0;
		input = "";
	}

	public DeletionsEasy(String input)
	{
		moves = 0;
		char[] numbersInChar = input.toCharArray();
		this.arrayLength = numbersInChar.length;
		this.input = new int[this.arrayLength];
		for(i = 0; i < this.arrayLength; i++)
		{
			this.input[i] = numbersInChar[i].getNumericValue;
		}
	}

	public void processInput()
	{
		while(!isClear(this.input))
		{
			for(int i = 0; i < this.arrayLength; i++)
			{
				if(this.input[i] == 0)
				{
					for(int a = 0; a < i; a++)
						input[a] = 0;
				}
			}
			this.moves++;
		}
	}

	public static boolean isClear(int[] array)
	{
		boolean clear = true;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] != 0)
				clear = false;
		}
		return clear;
	}


}