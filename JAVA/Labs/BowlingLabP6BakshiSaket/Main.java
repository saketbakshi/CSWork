import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inFile = new File("input.txt");
		Scanner scanned = new Scanner(inFile);

		int testCases = scanned.nextInt();

		for(int g = 0; g < testCases; g++)
		{
			String line = scanned.nextLine().replaceAll("-", "0");

			String[] frames = line.split(",");
			Frame[] frameGame = new Frame[9];
			for(int i = 0; i < 9; i++)
			{
				frameGame[i] = new Frame(frames[i]);
			}
			FinalFrame lastFrame = new FinalFrame(frames[9]);

			BowlingLab playedGame = new BowlingLab(frameGame, lastFrame);
			playedGame.calculatePoints();
			playedGame.getTotal();
		}
	}
}