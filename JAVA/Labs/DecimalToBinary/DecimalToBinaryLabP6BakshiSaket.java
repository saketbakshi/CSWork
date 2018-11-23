public class DecimalToBinaryLabP6BakshiSaket
{
	private int newBase;
	private int oldBase;
	private int numberToConvert;
	private int remainder;
	private String newNumber;


	public DecimalToBinaryLabP6BakshiSaket(int baseConverted, int baseOriginal, int numberConverted)
	{
		this.oldBase = baseOriginal;
		this.newBase = baseConverted;
		this.numberToConvert = numberConverted;
	}

	public void convert()
	{
		this.newNumber = "";

		while(this.numberToConvert != 0)
		{
			this.remainder = this.numberToConvert % 2;

			this.newNumber = this.newNumber + String.valueOf(this.remainder);
			this.numberToConvert = this.numberToConvert / 2;
		}

		int numberOfPlaces = this.newNumber.length();
		String tempNewNumber = "";

		for(int i = numberOfPlaces -1 ; i >= 0; i--)
		{
			tempNewNumber = tempNewNumber + this.newNumber.charAt(i);
		}

		this.newNumber = tempNewNumber;
	}

	public String getNewNumber()
	{
		return this.newNumber;
	}
}