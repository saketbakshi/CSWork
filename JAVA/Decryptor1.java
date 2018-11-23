public class Decryptor1
{
	private String process;
	private int key;
	private String message;
	private String output="";
	
	public Decryptor1 (String process, int key, String message)
	{
		this.process = process;
		this.key = key;
		this.message = message.replace(" ","");
	}
	/*
	takes the input, then either encrypts or decrypts the input using the given key
	*/
	public void decrypt()
	{
		int length, intTemp;
		char temp;
		String newLetter="";
		length = message.length();
	
		for (int b=0; b<length;b++)
		{
			// A is 65 and z is 90 in unicode
			temp = this.message.charAt(b);
			intTemp = (int)temp;
			
			if(process.equals("E"))
				intTemp = intTemp + key;
			else if(process.equals("D"))
				intTemp = intTemp - key;
			//loops letter if it goes before a or after z
			if(intTemp<65)
				intTemp += 26;
			else if(intTemp>90)
				intTemp -=26;
			//casts the new integer into a char and then the char into a String
			temp = (char)intTemp;
			newLetter = Character.toString(temp);
			this.output = this.output+newLetter;
		}
		System.out.println(this.output);
	}
}