/* Saket Bakshi 12/10/18. Period 6
This program, for project 1 of Ch 7, simulates 20 dice rolls, prints them in order, and markes runs (sequences of adjacent repeated values) with parentheses.
*/
import java.util.Random;

public class PracticeExercisesCh7P1
{
	public static void main(String[] args)
	{
        Random r = new Random();

        int[] diceRoll = new int[20]; //makes 20 length array
        for (int i = 0; i < diceRoll.length; i++) //fills in random rolls
        {
            diceRoll[i] = r.nextInt(7);
        }
        

        runs(diceRoll); //goes through method
    }

    /** checks array for runs
	*/
    public static void runs(int[] diceRoll)
    {
        boolean inRun = false; //sets boolean to not in a run
        int previousValue = diceRoll[0]; //sets temporary index to the 0th index

        for (int i = 0; i < diceRoll.length - 1; i++) //for each element in the array
        {
            if (inRun) //if already in a run
            {
                if (diceRoll[i] != previousValue) //if the new value doesn't continue the run
                {
                    System.out.print(") "); //end the run
                    inRun = false; //set run to false
                    if(diceRoll[i] == diceRoll[i+1]) //if next number continues a new streak
                    {
                    	System.out.print("("); //start a new run
                    	inRun = true; //set run to true
                    }
                }
            }
            else if (!inRun) //if not in a run
            {
                if (diceRoll[i] == diceRoll[i + 1]) //if a streak will start
                {
                    System.out.print("("); //start a run
                    inRun = true; //set the boolean
                }
                else //if no streak
                {
                    System.out.print(" "); //add a space
                }
            }

            previousValue = diceRoll[i]; //sets current roll to previous roll for next round of the loop
            System.out.print(diceRoll[i] + " "); //prints out the current roll value
        }

        if(inRun && diceRoll[diceRoll.length - 1] == previousValue) //for last number, if there is a run and last number continues it
        {
            System.out.print(" " + diceRoll[diceRoll.length - 1] + ") "); //put number then end run
        }
        else if(inRun && diceRoll[diceRoll.length - 1] != previousValue) //if run and not continued
        {
            System.out.print(") " + diceRoll[diceRoll.length - 1]); //end run then put number
        }
        else //if no run
        {
            System.out.print(" " + diceRoll[diceRoll.length - 1]); //print number
        }
    }
}