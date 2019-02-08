import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BowlingLabTester
{
	public static void main(String[] args)
	{
		File inFile = new File("input.txt");
		Scanner scanned = new Scanner(inFile);

		int testCases = scanned.nextInt();

		for(int g = 0; g < testCases; g++)
		{
			String line = scanned.nextLine().replaceAll("-", "0");

			String[] frames = line.split(",");
			String[] normalFrames = Arrays.copyOf(frames, 9);
			String lastFrame = frames[9];

			BowlingGame playedGame = new BowlingGame(normalFrames, lastFrame);
			playedGame.calculatePoints();
			playedGame.getTotal();
		}
	}
}