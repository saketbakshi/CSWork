public class Frame
{
	private int roll1;
	private int roll2;
	private String type;

	public Frame(String wholeFrame)
    {
    	if(wholeFrame.length() == 1)
    	{
    		roll1 = 10;
    		roll2 = 0;
    		type = "Strike";
    	}
    	else if(wholeFrame.substring(1,2).equals("/"))
    	{
    		roll1 = Integer.parseInt(wholeFrame.substring(0,1));
    		roll2 = 10 - roll1;
    		type = "Spare";
    	}
    	else
    	{
	    	roll1 = Integer.parseInt(wholeFrame.substring(0,1));
	    	roll2 = Integer.parseInt(wholeFrame.substring(1,2));
	    	type = "Normal";
	    }
    }
    public void setFirstRoll(int roll) {roll1 = roll;}
    public void setSecondRoll(int roll) {roll2 = roll;}
    public void setType(String typeOfRoll) {type = typeOfRoll;}

    public int getFirstRoll() {return roll1;}
    public int getSecondRoll() {return roll2;}
    public String getType() {return type;}
}