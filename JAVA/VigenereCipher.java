public class VigenereCipher
{
	private char deOrEn;
	private String shiftWord;
	private String input;
	private String output;

	public String getInput(){return input;}
	public String getOutput(){return output;}
	public String getShiftWord(){return shiftWord;}

	public VigenereCipher(char crypt, String shiftWord, String input)
	{
		deOrEn = Character.toUpperCase(crypt);
		this.shiftWord = shiftWord.toLowerCase();
		this.input = input.replaceAll("[^a-zA-Z]","").toLowerCase();
		output = "";
	}

	public void crypt()
	{
		int inputLength = input.length();
		int shiftWordLength = shiftWord.length();
		int translateCharInt = 0;
		for(int currentCharPos = 0; currentCharPos<inputLength; currentCharPos++)
		{
			char currentChar  = input.charAt(currentCharPos);
			char shiftChar = shiftWord.charAt(currentCharPos % shiftWordLength);
			int currentCharInt = Character.getNumericValue(currentChar) - 9;
			int shiftNumber = Character.getNumericValue(shiftChar) - 9;
			if(deOrEn == 'D')
			{
				translateCharInt = currentCharInt - shiftNumber;
			}
			else if(deOrEn == 'E')
			{
				translateCharInt = currentCharInt + shiftNumber;
			}
			translateCharInt = translateCharInt % 26;
			while(translateCharInt <= 0)
			{
				translateCharInt = translateCharInt + 26;
			}
			// System.out.println(translateCharInt);
			String translateChar = convertToChar(translateCharInt);
			output = output + translateChar;
			output = output.toUpperCase();
		}
		// output = output.substring(1, output.length());
	}

	private String convertToChar(int i) 
	{
    	return i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : "";
	}
}