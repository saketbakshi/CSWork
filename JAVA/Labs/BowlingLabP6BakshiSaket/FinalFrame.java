/* Saket Bakshi. AP Computer Science A. Bowling Lab. Due February 8, 2019.
This class creates Frame objects that represent the last round of a bowling game.
*/
public class FinalFrame extends Frame
{
	private int roll3; //third roll value

	/** This class creates Frame objects that represent the last round of a bowling game. It has a method to return the last roll.
    */
	public FinalFrame()
	{
		super.setFirstRoll(0); //uses superclass to set first and second roll, and type
		super.setSecondRoll(0);
		super.setType("");
		roll3 = 0; //sets default third roll
	}

    /** This class creates Frame objects that represent individual rounds of a bowling game. It has a method to return the last roll.
    @param wholeFrame the String object that consists of both rolls, whether they are integers, spares, 0's, or strikes.
    */	
	public FinalFrame(String wholeFrame)
	{
		if(wholeFrame.length() == 2) //if there is no spare or first roll strike
		{
			super.setFirstRoll(Integer.parseInt(wholeFrame.substring(0,1))); //first and second roll are set normally, third roll is 0
			super.setSecondRoll(Integer.parseInt(wholeFrame.substring(1,2)));
			super.setType("");
			roll3 = 0;
		}
		else if(wholeFrame.length() == 3) //if first roll is strike or second roll is a spare
		{
			if(!wholeFrame.substring(0,1).equals("X")) //if the first roll isn't a strike
				super.setFirstRoll(Integer.parseInt(wholeFrame.substring(0,1)));
			if(wholeFrame.substring(0,1).equals("X")) //if it is a strike
			{
				super.setFirstRoll(10);
				super.setType("Strike");
				if(wholeFrame.substring(1,2).equals("X")) //if second roll is a strike
					super.setSecondRoll(10);
				else
					super.setSecondRoll(Integer.parseInt(wholeFrame.substring(1,2)));
				
				if(wholeFrame.substring(2,3).equals("X")) //if last roll is a strike
					roll3 = 10;
				else if(wholeFrame.substring(2,3).equals("/")) //if last roll is a spare
					roll3 = 10 - super.getSecondRoll();
				else //if last roll is normal
					roll3 = Integer.parseInt(wholeFrame.substring(2,3));
			}
			else if(wholeFrame.substring(1,2).equals("/")) //if second roll is a spare
			{
				super.setSecondRoll(10 - super.getFirstRoll());
				super.setType("Spare");
				if(wholeFrame.substring(2,3).equals("X")) //if last roll is a strike
					roll3 = 10;
				else
					roll3 = Integer.parseInt(wholeFrame.substring(2,3));
			}
		}
	}

    /** returns the third roll
    @return the third roll
    */
	public int getThirdRoll() {return roll3;}
}