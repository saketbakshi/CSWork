/* Saket Bakshi. Mr. Caces. AP Computer Science A. Due 13 November 2018.
This class takes hyphenated concatenations from ICAO and converts them to Strings.
*/
public class ICAODecoderLabP6BakshiSaket
{
	//instance variables

	private String input;
	private String output;
	
	/** This class takes ICAO words and converts them to Strings.
	@param input the input line
	*/
	public ICAODecoderLabP6BakshiSaket(String input)
	{
		this.input = input;
		this.output = "";
	}

	/** returns the input about to be translated
	@return the input String
	*/
	public String getInput()
	{
		return this.input;
	}

	/** Creates the output String from ICAO form
	*/
	public void runThroughInput()
	{
		String loweredInput = this.input.toLowerCase(); //takes the input and makes it lowercase
		String array1[] = loweredInput.split(" "); //splits individual words of the input
		for(String temp: array1) //makes a loop for each word in the input
		{
			String array2[] = temp.split("-"); //makes a loop for each letter in each word 
			for(String temp2: array2)
			{
				if(temp2.equals("alpha"))
					this.output = this.output + "A";
				else if(temp2.equals("bravo"))
					this.output = this.output + "B";
				else if(temp2.equals("charlie"))
					this.output = this.output + "C";
				else if(temp2.equals("delta"))
					this.output = this.output + "D";
				else if(temp2.equals("echo"))
					this.output = this.output + "E";
				else if(temp2.equals("foxtrot"))
					this.output = this.output + "F";
				else if(temp2.equals("golf"))
					this.output = this.output + "G";
				else if(temp2.equals("hotel"))
					this.output = this.output + "H";
				else if(temp2.equals("india"))
					this.output = this.output + "I";
				else if(temp2.equals("juliet"))
					this.output = this.output + "J";
				else if(temp2.equals("kilo"))
					this.output = this.output + "K";
				else if(temp2.equals("lima"))
					this.output = this.output + "L";
				else if(temp2.equals("mike"))
					this.output = this.output + "M";
				else if(temp2.equals("november"))
					this.output = this.output + "N";
				else if(temp2.equals("oscar"))
					this.output = this.output + "O";
				else if(temp2.equals("papa"))
					this.output = this.output + "P";
				else if(temp2.equals("quebec"))
					this.output = this.output + "Q";
				else if(temp2.equals("romeo"))
					this.output = this.output + "R";
				else if(temp2.equals("sierra"))
					this.output = this.output + "S";
				else if(temp2.equals("tango"))
					this.output = this.output + "T";
				else if(temp2.equals("uniform"))
					this.output = this.output + "U";
				else if(temp2.equals("victor"))
					this.output = this.output + "V";
				else if(temp2.equals("whiskey"))
					this.output = this.output + "W";
				else if(temp2.equals("xray"))
					this.output = this.output + "X";
				else if(temp2.equals("yankee"))
					this.output = this.output + "Y";
				else if(temp2.equals("zulu"))
					this.output = this.output + "Z"; //recognizes words in ICAO form and converts to letters
			}

			this.output = this.output + " "; //adds spaces between words
		}
		this.output = this.output.substring(0, this.output.length() - 1); //removes the last space
	}

	/** Returns the output String
	@return the output String
	*/
	public String getOutput()
	{
		return this.output;
	}
}