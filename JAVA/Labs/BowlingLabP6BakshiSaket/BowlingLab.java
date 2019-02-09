/* Saket Bakshi. AP Computer Science A. Bowling Lab. Due February 8, 2019.
This class creates organizes Frame and FinalFrame objects to create a game.
*/
public class BowlingLab extends FinalFrame
{
	private int totalPoints; //total points of the game
	private Frame[] normalFrames; //first 9 frames
	private FinalFrame lastFrame; //last frame

	/** This class creates BowlingLab objects that represent a whole bowling game. It has methods to calculate and return the total points.
    @param frames the Frame array that consists of the first nine rolls of the game.
    @param ultimateFrame the last frame of the game
    */
	public BowlingLab(Frame[] frames, FinalFrame ultimateFrame)
	{
		totalPoints = 0;
		normalFrames = frames;
		lastFrame = ultimateFrame;
	}

	/** returns the total points
    @return the total points
    */
	public int getTotal() {return totalPoints;}

	/** This calculates the total points of all the frames
	*/
	public void calculatePoints()
	{	
		for(int i = 0; i < 7; i++) //for frames 1 to 7
		{
			if(normalFrames[i].getType().equals("Normal")) //if a normal frame, this simply adds pins fallen to the total score
				totalPoints += normalFrames[i].getFirstRoll() + normalFrames[i].getSecondRoll();
			else if(normalFrames[i].getType().equals("Spare")) //if a spare, this checks the next roll and appropriately adds points
				totalPoints += 10 + normalFrames[i+1].getFirstRoll();
			else if(normalFrames[i].getType().equals("Strike")) //if a strike, this checks if the next roll is a strike and appropriately adds points
			{
				if(!normalFrames[i+1].getType().equals("Strike"))
					totalPoints += 10 + normalFrames[i+1].getFirstRoll() + normalFrames[i+1].getSecondRoll();
				else
					totalPoints += 10 + 10 + normalFrames[i+2].getFirstRoll();
			}
		}

		//for frame 8
		if(normalFrames[7].getType().equals("Normal")) //if a normal frame, this simply adds pins fallen to the total score
			totalPoints += normalFrames[7].getFirstRoll() + normalFrames[7].getSecondRoll();
		else if(normalFrames[7].getType().equals("Spare")) //if a spare, this checks the next roll and appropriately adds points
				totalPoints += 10 + normalFrames[8].getFirstRoll();
		else if(normalFrames[7].getType().equals("Strike")) //if a strike, checks if frame 9 is a strike and then frame 10, if needed
		{
			if(!normalFrames[8].getType().equals("Strike"))
					totalPoints += 10 + normalFrames[8].getFirstRoll() + normalFrames[8].getSecondRoll();
				else
					totalPoints += 10 + 10 + lastFrame.getFirstRoll();
		}

		//for frame 9
		if(normalFrames[8].getType().equals("Normal")) //if a normal frame, this simply adds pins fallen to the total score
			totalPoints += normalFrames[8].getFirstRoll() + normalFrames[8].getSecondRoll();
		else if(normalFrames[8].getType().equals("Spare")) //if a spare, this checks the next roll and appropriately adds points
				totalPoints += 10 + lastFrame.getFirstRoll();
		else if(normalFrames[8].getType().equals("Strike")) //if a strike, checks first two rolls of frame 10
			totalPoints += 10 + lastFrame.getFirstRoll() + lastFrame.getSecondRoll();

		//for frame 10
		if(lastFrame.getType().equals("")) //if a normal frame, this simply adds pins fallen to the total score
			totalPoints += lastFrame.getFirstRoll() + lastFrame.getSecondRoll();
		else
		{
			if(lastFrame.getType().equals("Strike")) //if first roll is a strike, this appropriately adds values of all 3 rolls
				totalPoints += 10 + lastFrame.getSecondRoll() + lastFrame.getThirdRoll();
			else if(lastFrame.getType().equals("Spare")) //if second roll is a spare, this appropriately adds values of the third roll as well
				totalPoints += 10 + lastFrame.getThirdRoll();
		}
	}
}