/* Saket Bakshi. Mr. Caces. AP Computer Science A. Due 4 December 2018.
This class takes 3 parts of multiple lines of an input and either encodes or decodes a message according to the Vigenere Cipher.
*/
public class VigenereLabP6BakshiSaket
{
	//instance variables
	private String decodeOrEncode; //variable for determining to decode or encode
	private String key; //the key word for decoding or encoding
	private String input; //the input to convert
	private String output; //the converted output

	/** This class decodes or encodes messages according to the rules of the Vigenere Cipher 
		@param decodeOrEncode holds whether to encode or decode
		@param key the conversion word key for the cipher
		@param input the message to convert
	*/
	public VigenereLabP6BakshiSaket(String decodeOrEncode, String key, String input)
	{
		this.decodeOrEncode = decodeOrEncode.toUpperCase(); //converts the letter to decode or encode to uppercase
		this.key = key.toLowerCase(); //converts the key word to lowercase
		this.input = input.replaceAll("[^a-zA-Z]","").toLowerCase(); //takes away all non-letters and converts to lowercase
		output = "";
	}

	/** returns the input
		@return the input
	*/
	public String getInput()
	{
		return this.input;
	}

	/** returns the output
		@return the output
	*/	
	public String getOutput()
	{
		return this.output;
	}

	/** Decodes or encodes the input
	*/
	public void runThroughInput()
	{
		int inputLength = this.input.length(); //gets input length
		int keyLength = this.key.length(); //gets key length
		int translateCharInt = 0; //sets temporary translated character variable to 0 
		for(int currentPosition = 0; currentPosition < inputLength; currentPosition++) //does loop for whole input
		{
			char currentChar  = this.input.charAt(currentPosition); //takes character of loop
			char shiftChar = this.key.charAt(currentPosition % keyLength); //takes appropriate section of the key
			int currentCharInt = Character.getNumericValue(currentChar) - 9; //takes integer value of character to convert
			int shiftNumber = Character.getNumericValue(shiftChar) - 9; //takes integer value of the key
			if(this.decodeOrEncode.equals("D")) //does this if decoding
			{
				translateCharInt = currentCharInt - shiftNumber; //sets temp translated character to the new shifted one
			}
			else if(this.decodeOrEncode.equals("E")) //does this if encoding
			{
				translateCharInt = currentCharInt + shiftNumber; //sets temp translated character to the new shifted one
			}
			translateCharInt = translateCharInt % 26; //brings temp translated character to the range of integers for alphabet characters
			while(translateCharInt <= 0) //brings temp translated character to the range of integers for alphabet characters
			{
				translateCharInt = translateCharInt + 26;
			}

			String translateChar = convertToChar(translateCharInt); //converts the temp translated character integer to a character
			output = output + translateChar; //adds the character to the output
			output = output.toUpperCase(); //sets output to uppercase
		}
	}

	/** returns the String of a character from its unicode integer
	*/
	private String convertToChar(int i) 
	{
    	return i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : "";
	}
}