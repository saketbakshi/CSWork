/* Saket Bakshi. AP Computer Science A. Bowling Lab. Due February 8, 2019.
This class tests BowlingLab class objects for multiple bowling games.
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BowlingLabTester
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inFile = new File("input.txt"); //inputs file
		Scanner scanned = new Scanner(inFile); //inputs scanner object

		int testCases = scanned.nextInt(); //finds number of test cases
		scanned.nextLine();

		for(int g = 0; g < testCases; g++)
		{
			String line = scanned.nextLine().replaceAll("-", "0"); //replaces 0's in game with actual integer 0's

			String[] frames = line.split(","); //separates frame of each game
			Frame[] frameGame = new Frame[9]; //makes array of first 9 frames
			for(int i = 0; i < 9; i++)
			{
				frameGame[i] = new Frame(frames[i]); //initializes each object of the frame
			}
			FinalFrame lastFrame = new FinalFrame(frames[9]); //defines the last frame of the game

			BowlingLab playedGame = new BowlingLab(frameGame, lastFrame); //makes a BowlingLab game object
			playedGame.calculatePoints(); //calculates points
			System.out.println(playedGame.getTotal()); //prints points to console
		}
		scanned.close();
	}
}