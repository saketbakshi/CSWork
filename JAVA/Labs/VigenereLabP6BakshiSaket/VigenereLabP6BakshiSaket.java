public class VigenereLabP6BakshiSaket
{
	//instance variables
	private String encodeOrDecode;
	private String input;

	private String output;

	public VigenereLabP6BakshiSaket(String encodeOrDecode, String input)
	{
		this.encodeOrDecode = encodeOrDecode;
		this.input = input.replace(" ",""); //deletes spaces in the input

		this.output = "";
	}

	public void runThroughInput()
	{
		int intTemp; //integer for value of the Unicode alphabet
		char temp; //character to convert
		String letterConvert=""; //once the character is converted, it is saved to this String
		int length = this.input.length(); //the length of the input to convert
	
		for (int i = 0; i < length; i++) //does a loop for each character of the input to convert
		{
			// A is 65 and z is 90 in unicode
			temp = this.input.charAt(i); //takes character in input
			intTemp = (int)temp; //takes integer value of Unicode character

			if(intTemp >= 65 && intTemp <= 90) //disregards any non-Uppercase alphabet
			{	
				if(encodeOrDecode.equals("E")) //code for encrypting
					intTemp = intTemp + (intTemp-64);
				else if(encodeOrDecode.equals("D")) //code for decrypting
					intTemp = intTemp - (intTemp+1);
				//loops letter if it goes before a or after z
				if(intTemp < 65) //makes sure to realign letters if below the Unicode value for A
					intTemp += 26;
				else if(intTemp > 90) //makes sure to realign letters if above the Unicode value for Z
					intTemp -=26;
				//places the new integer value for the character into a char variable and then converts the char into a String
				temp = (char)intTemp;
				letterConvert = Character.toString(temp);
				this.output = this.output + letterConvert; //adds the char's String to the output
				this.output = this.output.toUpperCase();
			}
		}
		System.out.println(this.output); //prints the end output
	}
}