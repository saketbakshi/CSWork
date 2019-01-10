import java.util.Arrays;

public class TranspositionCipher
{
	private char deOrEn;
	private String input;
	private String output;
	private char[] keyArray;
	private char[] alphaKey;
	private char[][] inputArray;
	private int[] alphaKeyInt;
	
	public String getInput(){return input;}
	public String getOutput(){return output;}
	public String getKeyArray(){return Arrays.toString(keyArray);}
	public String getAlphaKey(){return Arrays.toString(alphaKey);}
	public String getInputArray(){return Arrays.toString(inputArray);}
	public String getAlphaKeyInt(){return Arrays.toString(alphaKeyInt);}


	public TranspositionCipher(char crypt, String key, String input)
	{
		deOrEn = Character.toUpperCase(crypt);
		keyArray = key.toCharArray();
		alphaKey = key.toCharArray();
		output = "";
		alphaKeyInt = new int[keyArray.length];
		this.input = input.replaceAll("[^a-zA-Z@]", "").toUpperCase();
		inputArray = setInputArray(input.replaceAll("[^a-zA-Z@]", ""), key);
	}

	public void crypt()
	{
		if(deOrEn == 'E')
		{
			for(int numberOfTimes = 0; numberOfTimes < alphaKey.length; numberOfTimes++)
			{
				int currentRow = 0;
				while(numberOfTimes != alphaKeyInt[currentRow])
				{
					currentRow++;
				}
				for(int i = 0; i < inputArray.length; i++)
				{
					output = output + inputArray[i][currentRow];
				}
			}
		}
		if(deOrEn == 'D')
		{
			for(int numberOfTimes = 0; numberOfTimes < alphaKey.length; numberOfTimes++)
			{
				int currentColumn = 0;
				System.out.println(currentColumn);
				for(int i = 0; i < inputArray[numberOfTimes].length; i++)
				{
					while(numberOfTimes != alphaKeyInt[currentColumn])
					{
						currentColumn++;
					}
					output = output + inputArray[i][numberOfTimes];
					System.out.println(output);
				}
			}
		}
	}
	public void setKeyPos()
	{
		Arrays.sort(alphaKey);
		// System.out.println(alphaKey);
		int currentKeyPos = 0; // The current character in keyArray
		for(int i = 0; i < keyArray.length; i++)
		{
			int alphaKeyPos = 0; // The current character in alphaKey
			while(keyArray[currentKeyPos] != alphaKey[alphaKeyPos])
			{
				// System.out.println(alphaKeyPos);
				alphaKeyPos++;
			}
			alphaKeyInt[i] = alphaKeyPos ;
			currentKeyPos++;
			// System.out.println(Arrays.toString(alphaKeyInt));
		}
	}
	public char[][] setInputArray(String input, String key)
	{
		double inputLength = input.length();
		char encrypt[][] = new char[(int) (Math.ceil(inputLength/key.length()))][key.length()];
      	int charPos = 0;
      	char aChar = ' ';
    	for (int row = 0; row < encrypt.length; row++)
    	{
    	    for (int column = 0; column < encrypt[row].length; column++)
    	    {
    	        if(charPos < input.length())
    	        {    	        	
		  		  	aChar = input.charAt(charPos);
    	        }
    	        else
    	        {
    	        	aChar = '@';
    	        }
    	        encrypt[row][column] = aChar;
    	        charPos++;
    	    }
    	}
    	System.out.println(Arrays.deepToString(encrypt));
    	return encrypt;
	}

	public void swapColumns(String[][] arr, int column1, int column2)
	{
		String[] temp = new String[this.rows];
		
		//copies 1 column to a temporary array
		for(int j=0;j<arr.length;j++) //arr2D[].length gives the # of rows
		{
				temp[j] = arr[j][column1];
		}
		
		//copies 1 column to another column
		for(int i=0;i<arr.length;i++) //arr2D[].length gives the # of rows
		{
				arr[i][column1] = arr[i][column2];
		}
		//copy the contents of temp array to column 2
		for(int k=0;k<arr.length;k++) //arr2D[].length gives the # of rows
		{
				arr[k][column2] = temp[k];
		}
	}
}

