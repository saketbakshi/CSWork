/* Saket Bakshi. Mr. Caces. AP Computer Science A. Due 23 October 2018.
This class takes Strings as objects and converts them to hyphenated concatenations in compliance with ICAO.
*/
public class ICAOTranslatorLab
{
	//instance variables

	private String input;
	private String output;
	
	/** This class takes strings and converts them to ICAO words, disregarding puncutation.
	@param input the input line
	*/
	public ICAOTranslatorLab(String input)
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

	/** Creates the output String in ICAO form
	*/
	public void runThroughInput()
	{
		String tempInput = this.input.toLowerCase();
		//System.out.println(tempInput);

		String character = tempInput.substring(0, 1);	
		//System.out.println(character);
			if(character.equals("a"))
				this.output = this.output + "Alpha";
			else if(character.equals("b"))
				this.output = this.output + "Bravo";
			else if(character.equals("c"))
				this.output = this.output + "Charlie";
			else if(character.equals("d"))
				this.output = this.output + "Delta";
			else if(character.equals("e"))
				this.output = this.output + "Echo";
			else if(character.equals("f"))
				this.output = this.output + "Foxtrot";
			else if(character.equals("g"))
				this.output = this.output + "Golf";
			else if(character.equals("h"))
				this.output = this.output + "Hotel";
			else if(character.equals("i"))
				this.output = this.output + "India";
			else if(character.equals("j"))
				this.output = this.output + "Juliet";
			else if(character.equals("k"))
				this.output = this.output + "Kilo";
			else if(character.equals("l"))
				this.output = this.output + "Lima";
			else if(character.equals("m"))
				this.output = this.output + "Mike";
			else if(character.equals("n"))
				this.output = this.output + "November";
			else if(character.equals("o"))
				this.output = this.output + "Oscar";
			else if(character.equals("p"))
				this.output = this.output + "Papa";
			else if(character.equals("q"))
				this.output = this.output + "Quebec";
			else if(character.equals("r"))
				this.output = this.output + "Romeo";
			else if(character.equals("s"))
				this.output = this.output + "Sierra";
			else if(character.equals("t"))
				this.output = this.output + "Tango";
			else if(character.equals("u"))
				this.output = this.output + "Uniform";
			else if(character.equals("v"))
				this.output = this.output + "Victor";
			else if(character.equals("w"))
				this.output = this.output + "Whiskey";
			else if(character.equals("x"))
				this.output = this.output + "Xray";
			else if(character.equals("y"))
				this.output = this.output + "Yankee";
			else if(character.equals("z"))
				this.output = this.output + "Zulu";

		for(int i = 1; i < this.input.length(); i++)
		{
			character = tempInput.substring(i, i + 1);

			if(character.equals("a"))
				this.output = this.output + "-" + "Alpha";
			else if(character.equals("b"))
				this.output = this.output + "-" + "Bravo";
			else if(character.equals("c"))
				this.output = this.output + "-" + "Charlie";
			else if(character.equals("d"))
				this.output = this.output + "-" + "Delta";
			else if(character.equals("e"))
				this.output = this.output + "-" + "Echo";
			else if(character.equals("f"))
				this.output = this.output + "-" + "Foxtrot";
			else if(character.equals("g"))
				this.output = this.output + "-" + "Golf";
			else if(character.equals("h"))
				this.output = this.output + "-" + "Hotel";
			else if(character.equals("i"))
				this.output = this.output + "-" + "India";
			else if(character.equals("j"))
				this.output = this.output + "-" + "Juliet";
			else if(character.equals("k"))
				this.output = this.output + "-" + "Kilo";
			else if(character.equals("l"))
				this.output = this.output + "-" + "Lima";
			else if(character.equals("m"))
				this.output = this.output + "-" + "Mike";
			else if(character.equals("n"))
				this.output = this.output + "-" + "November";
			else if(character.equals("o"))
				this.output = this.output + "-" + "Oscar";
			else if(character.equals("p"))
				this.output = this.output + "-" + "Papa";
			else if(character.equals("q"))
				this.output = this.output + "-" + "Quebec";
			else if(character.equals("r"))
				this.output = this.output + "-" + "Romeo";
			else if(character.equals("s"))
				this.output = this.output + "-" + "Sierra";
			else if(character.equals("t"))
				this.output = this.output + "-" + "Tango";
			else if(character.equals("u"))
				this.output = this.output + "-" + "Uniform";
			else if(character.equals("v"))
				this.output = this.output + "-" + "Victor";
			else if(character.equals("w"))
				this.output = this.output + "-" + "Whiskey";
			else if(character.equals("x"))
				this.output = this.output + "-" + "Xray";
			else if(character.equals("y"))
				this.output = this.output + "-" + "Yankee";
			else if(character.equals("z"))
				this.output = this.output + "-" + "Zulu";

		}
	}

	/** Returns the output String
	@return the output String
	*/
	public String getOutput()
	{
		return this.output;
	}
}