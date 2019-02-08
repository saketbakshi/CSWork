public class FinalFrame extends Frame
{
	private int roll3;

	public FinalFrame(String wholeFrame)
	{
		if(wholeFrame.length() == 2)
		{
			super.setFirstRoll(Integer.parseInt(wholeFrame.substring(0,1)));
			super.setSecondRoll(Integer.parseInt(wholeFrame.substring(1,2)));
			roll3 = 0;
		}
		else if(wholeFrame.length() == 3)
		{
			if(wholeFrame.substring(0,1).equals("X"))
			{
				super.setFirstRoll(10);
				super.setType("Strike");
				if(wholeFrame.substring(1,2).equals("X"))
					super.setSecondRoll(10);
				else
					super.setSecondRoll(Integer.parseInt(wholeFrame.substring(1,2)));
				
				if(wholeFrame.substring(2,3).equals("X"))
					roll3 = 10;
				else if(wholeFrame.substring(2,3).equals("/"))
				{
					super.setSecondRoll(0);
					roll3 = 10;
				}
				else
					roll3 = Integer.parseInt(wholeFrame.substring(2,3));
			}
			else if(wholeFrame.substring(1,2).equals("/"))
			{
				super.setFirstRoll(0);
				super.setSecondRoll(10);
				super.setType("Spare");
				if(wholeFrame.substring(2,3).equals("X"))
					roll3 = 10;
				else
					roll3 = Integer.parseInt(wholeFrame.substring(2,3));
			}
		}
	}

	public int getThirdRoll() {return roll3;}
}