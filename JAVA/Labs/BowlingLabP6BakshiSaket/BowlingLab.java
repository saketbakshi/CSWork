public class BowlingLab extends FinalFrame
{
	private int totalPoints;
	private Frame[] normalFrames;
	private FinalFrame lastFrame;

	public BowlingLab(Frame[] frames, FinalFrame ultimateFrame)
	{
		totalPoints = 0;
		normalFrames = frames;
		lastFrame = ultimateFrame;
	}

	public int getTotal() {return totalPoints;}

	public void calculatePoints()
	{	
		for(int i = 0; i < 7; i++) //for frames 1 to 7
		{
			if(normalFrames[i].getType().equals("Normal"))
				totalPoints += normalFrames[i].getFirstRoll() + normalFrames[i].getSecondRoll();
			else if(normalFrames[i].getType().equals("Spare"))
				totalPoints += 10 + normalFrames[i+1].getFirstRoll();
			else if(normalFrames[i].getType().equals("Strike"))
			{
				if(!normalFrames[i+1].getType().equals("Strike"))
					totalPoints += 10 + normalFrames[i+1].getFirstRoll() + normalFrames[i+1].getSecondRoll();
				else
					totalPoints += 10 + 10 + normalFrames[i+2].getFirstRoll();
			}
		}

		//for frame 8
		if(normalFrames[7].getType().equals("Normal"))
			totalPoints += normalFrames[i].getFirstRoll() + normalFrames[i].getSecondRoll();
		else if(normalFrames[i].getType().equals("Spare"))
				totalPoints += 10 + normalFrames[i+1].getFirstRoll();
		else if(normalFrames[i].getType().equals("Strike"))
		{
			if(!normalFrames[i+1].getType().equals("Strike"))
					totalPoints += 10 + normalFrames[i+1].getFirstRoll() + normalFrames[i+1].getSecondRoll();
				else
					totalPoints += 10 + 10 + lastFrame.getFirstRoll();
		}

		//for frame 9
		if(normalFrames[8].getType().equals("Normal"))
			totalPoints += normalFrames[i].getFirstRoll() + normalFrames[i].getSecondRoll();
		else if(normalFrames[i].getType().equals("Spare"))
				totalPoints += 10 + lastFrame.getFirstRoll();
		else if(normalFrames[i].getType().equals("Strike"))
			totalPoints += 10 + lastFrame.getFirstRoll() + lastFrame.getSecondRoll();

		//for frame 10
		if(lastFrame.length() == 2)
			totalPoints += lastFrame.getFirstRoll() + lastFrame.getSecondRoll();
		else
		{
			if(wholeFrame.getType().equals("Strike"))
				totalPoints += 10 + wholeFrame.getSecondRoll() + wholeFrame.getThirdRoll();
			else if(wholeFrame.getType().equals("Spare"))
				totalPoints += 10 + wholeFrame.getThirdRoll();
		}
	}
}