/* Saket Bakshi. Mr. Caces. AP Computer Science A. Due 21 October 2018.
This program takes two fractions, to be added or subtracted, and properly simplifies the result.
*/
public class FracCalc
{
	//instance variables
	private String inputLine;
	private String firstFrac;
	private String secondFrac;
	private String operator;
	private int whole1;
	private int numer1;
	private int denom1;
	private int whole2;
	private int numer2;
	private int denom2;

	private int wholeAnswer;
	private int wholeNumer;
	private int wholeDenom;

	/** This Fraction Calculator class takes two fractions with single digit numerators, denominators, and whole numbers and adds or subtracts them together. This class has methods to return the input line, get the operator, get the fractional parts, do calculations, simplify the answer, and return the final answer.
	@param inputLine the input equation in the form of "x y/z + a b/c" or "x y/z - a b/c"
	*/
	public FracCalc(String inputLine)
	{
		this.inputLine = inputLine; //sets the input line

		//identifies if addition or subtraction
		if(inputLine.contains(" + ") == true)
		{
			int operatorPosition = 0;
			operatorPosition = this.inputLine.indexOf("+"); 
			this.firstFrac = this.inputLine.substring(0,operatorPosition-1); //sets the first fraction
			this.secondFrac = this.inputLine.substring(operatorPosition+2, this.inputLine.length()); //sets the second fraction
			this.operator = this.inputLine.substring(operatorPosition, operatorPosition+1); //sets the operator
		}
		
		if(inputLine.contains(" - ") == true)
		{
			int operatorPosition = 0;
			operatorPosition = this.inputLine.indexOf("-"); 
			this.firstFrac = this.inputLine.substring(0,operatorPosition-1); //sets the first fraction
			this.secondFrac = this.inputLine.substring(operatorPosition+2, this.inputLine.length()); //sets the second fraction
			this.operator = this.inputLine.substring(operatorPosition, operatorPosition+1); //sets the operator
		}

		//evaluates the input to extract the whole number, numerator, and denominator for both fractions
			char temp = ' ';
			int tempNumber = 0;

			temp = inputLine.charAt(0);
			tempNumber = (int)temp;
			this.whole1 = tempNumber - 48;

			temp = inputLine.charAt(8);
			tempNumber = (int)temp;
			this.whole2 = tempNumber - 48;

			temp = inputLine.charAt(2);
			tempNumber = (int)temp;
			this.numer1 = tempNumber - 48;

			temp = inputLine.charAt(10);
			tempNumber = (int)temp;
			this.numer2 = tempNumber - 48;

			temp = inputLine.charAt(4);
			tempNumber = (int)temp;
			this.denom1 = tempNumber - 48;

			temp = inputLine.charAt(12);
			tempNumber = (int)temp;
			this.denom2 = tempNumber - 48;
	}

	/** This method prints out the whole numbers, numerators, and denominators of the two fractions in order of printing one part of the fraction for both numbers and then proceeding to the next part.
	*/
	public void getFracParts()
	{
		System.out.println(this.whole1);
		System.out.println(this.whole2);
		System.out.println(this.numer1);
		System.out.println(this.numer2);
		System.out.println(this.denom1);
		System.out.println(this.denom2);
	}

	/** This method prints out the operator
	*/
	public void getOperator()
	{
		System.out.println(this.operator);
	}

	/** This method prints out the input
	@return the input line
	*/
	public String getInputLine()
	{
		return inputLine;
	}

	/**this method calculates the answer's whole number, numerator, and denominator
	*/
	public void doCalculation()
	{
		int tempDenom = 0;
		tempDenom = this.denom1 * this.denom2; //finds a common multiple for denomiators

		int tempNumer1, tempNumer2 = 0;
		//finds the equivalent numerators for the new denominators
		tempNumer1 = (this.numer1 * this.denom2) + (this.whole1 * tempDenom); 
		tempNumer2 = (this.numer2 * this.denom1) + (this.whole2 * tempDenom);

		if(this.operator.endsWith("+")==true) //if adding fractions, this path is followed
		{
			this.wholeAnswer = (tempNumer1 + tempNumer2) / tempDenom; //adds new numerators together and divides by denominator. rounded down
			this.wholeNumer = (tempNumer1 + tempNumer2) % tempDenom; //takes remainder of sum of numerators divided by denominator
			this.wholeDenom = tempDenom; //sets denominator
		}

		if(this.operator.endsWith("-")==true) //if subtracting fractions, this path is followed
		{
			this.wholeAnswer = (tempNumer1 - tempNumer2) / tempDenom; //subtracts numerators and divides by denominator
			this.wholeNumer = Math.abs((tempNumer1 - tempNumer2) % tempDenom); //takes absolute value of remainder of difference of numerators divided by denominator
			this.wholeDenom = tempDenom; //sets denominator
		}
	}

	/** This method simplifies the fraction
	*/
	public void simplify()
	{
		for(int i = this.wholeNumer; i > 0; i--) //makes loop from numerator to 0
		{
			if((this.wholeNumer % i == 0) && (this.wholeDenom % i == 0)) //condition is met when number divides evenly into both numerator and denominator
			{
				//simplify!
				this.wholeNumer = this.wholeNumer / i; 
				this.wholeDenom = this.wholeDenom / i;
			}
		}
	}
	/** This method prints out the answer
	*/ 
	public void getAnswer()
	{
		System.out.println(this.wholeAnswer + " " + this.wholeNumer + "/" + this.wholeDenom);
	}
}