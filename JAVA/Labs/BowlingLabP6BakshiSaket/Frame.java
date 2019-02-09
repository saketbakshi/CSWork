/* Saket Bakshi. AP Computer Science A. Bowling Lab. Due February 8, 2019.
This class creates Frame objects that represent individual rounds of a bowling game.
*/
public class Frame
{
    private int roll1; //first roll value
    private int roll2; //second roll value
    private String type; //tells if Strike or Spare

    /** This class creates Frame objects that represent individual rounds of a bowling game. It has methods to set roll values and the type of frame.
    */
    public Frame()
    {
        roll1 = 0;
        roll2 = 0;
        type = "";
    }

    /** This class creates Frame objects that represent individual rounds of a bowling game. It has methods to set roll values and the type of frame.
    @param wholeFrame the String object that consists of both rolls, whether they are integers, spares, 0's, or strikes.
    */
    public Frame(String wholeFrame)
    {
        if(wholeFrame.length() == 1) //if the frame has a strike
        {
            roll1 = 10;
            roll2 = 0;
            type = "Strike";
        }
        else if(wholeFrame.substring(1,2).equals("/")) //if the frame has a spare
        {
            roll1 = Integer.parseInt(wholeFrame.substring(0,1)); //uses parseInt to find the first roll value
            roll2 = 10 - roll1;
            type = "Spare";
        }
        else //otherwise it's a normal frame
        {
            roll1 = Integer.parseInt(wholeFrame.substring(0,1));
            roll2 = Integer.parseInt(wholeFrame.substring(1,2));
            type = "Normal";
        }
    }

    /** sets the integer value of the first roll
    */
    public void setFirstRoll(int roll) {roll1 = roll;}
    
    /** sets the integer value of the second roll
    */
    public void setSecondRoll(int roll) {roll2 = roll;}

    /** sets the String value of the type of roll. Strikes are "Strike", spares are "Spare", and normal frames are "".
    */
    public void setType(String typeOfRoll) {type = typeOfRoll;}

    /** returns the first roll
    @return the first roll
    */
    public int getFirstRoll() {return roll1;}
    
    /** returns the second roll
    @return the second roll
    */
    public int getSecondRoll() {return roll2;}

    /** returns the type of roll
    @return the type
    */
    public String getType() {return type;}
}