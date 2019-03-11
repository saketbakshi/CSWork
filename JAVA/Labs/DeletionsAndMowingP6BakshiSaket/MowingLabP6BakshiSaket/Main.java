/* Saket Bakshi. AP Computer Science A. Mowing. Due March 10, 2019.
This class tests the Mowing problem.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.awt.Point;

public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File text = new File("input.txt"); //inputs the file
		Scanner in = new Scanner(text); //creates scanner object
		
		int loops = Integer.parseInt(in.nextLine()); //takes number of test cases
		for(int a = 0; a < loops; a++)
		{
			StringTokenizer mowerCoordinatesAndLawnSize = new StringTokenizer(in.nextLine(), " ");
			int length = Integer.parseInt(mowerCoordinatesAndLawnSize.nextToken());
			int width = Integer.parseInt(mowerCoordinatesAndLawnSize.nextToken());
			int rowPos = Integer.parseInt(mowerCoordinatesAndLawnSize.nextToken());
			int colPos = Integer.parseInt(mowerCoordinatesAndLawnSize.nextToken());
			
			String[][] lawn = new String[length][width]; //constructs 2D lawn and fills it in
			for(int i = 0; i < length; i++)
			{
				StringTokenizer lawnCreator = new StringTokenizer(in.nextLine(), " ");
				for(int j = 0; j < width; j++)
				{
					lawn[i][j] = lawnCreator.nextToken();
				}
			}
			LawnMower tester = new LawnMower(colPos, rowPos, lawn, length, width);

			//mows everywhere possible without jumping the mower
			mowToTheRight(tester);
			tester.setLocation(colPos, rowPos);
			mowToTheLeft(tester);
			tester.setLocation(colPos, rowPos);
			otherMowToTheRight(tester);
			tester.setLocation(colPos, rowPos);
			otherMowToTheLeft(tester);
			
			for(int x = 0; x < 1000; x++)
			{
				Point scanned = tester.scan();
				Point stop = new Point(-1, -1);
				if(!scanned.equals(stop))
				{
					tester.setLocation(scanned);
					mowToTheRight(tester);
					tester.setLocation(scanned);
					mowToTheLeft(tester);
					tester.setLocation(scanned);
					otherMowToTheRight(tester);
					tester.setLocation(scanned);
					otherMowToTheLeft(tester);
				}
			}
			
			printArray(tester.getLawn());
			if (a < loops-1)
			System.out.println();
		}
	}
		
		
	public static void mowToTheRight(LawnMower mower)
	{
		mower.toTheTop();
		Point temp = mower.getLocation();
		do
		{
			mower.cut();
			if(!mower.atBottomBorder() && !mower.treeBelow())
			{
				mower.moveDown();
			}
		}
		while(!mower.treeBelow() && !mower.atTopBottomBorder());
		mower.cut();
		
		mower.checkRightToTheTop(temp);
		
		if(temp.equals(mower.getLocation()) && !mower.rightIsOpen())
		{
			mowToTheLeft(mower);
		}
		else if(mower.rightIsOpen() && temp.equals(mower.getLocation()))
		{
			mower.moveRight();
			mowToTheRight(mower);
		}
		else
		{
			mowToTheRight(mower);
		}
	}
	
	public static void otherMowToTheRight(LawnMower mower)
	{
		mower.toTheTop();
		do
		{
			mower.cut();
			if(!mower.atBottomBorder() && !mower.treeBelow())
			{
				mower.moveDown();
			}
		}
		while(!mower.treeBelow() && !mower.atTopBottomBorder());
		mower.cut();
		Point temp2 = mower.getLocation();

		mower.toTheTop();
		mower.checkRightToTheBottom(temp2);
		
		if(temp2.equals(mower.getLocation()) && !mower.rightIsOpen())
		{
			otherMowToTheLeft(mower);
		}
		else if(mower.rightIsOpen() && temp2.equals(mower.getLocation()))
		{
			mower.moveRight();
			otherMowToTheRight(mower);
		}
		else
		{
			otherMowToTheRight(mower);
		}
	}
	
	public static void mowToTheLeft(LawnMower mower)
	{
		mower.toTheTop();
		Point temp = mower.getLocation();
		do
		{
			mower.cut();
			if(!mower.atBottomBorder() && !mower.treeBelow())
			{
				mower.moveDown();
			}
			else
			{
				break;
			}
		}
		while(!mower.treeBelow() && !mower.atTopBottomBorder());
		mower.cut();

		mower.checkLeftToTheTop(temp);

		if(temp.equals(mower.getLocation()) && !mower.leftIsOpen())
		{
			
		}
		else if(temp.equals(mower.getLocation()) && mower.leftIsOpen())
		{
			mower.moveLeft();
			mowToTheLeft(mower);
		}
		else
		{
			mowToTheLeft(mower);
		}
	}
	
	public static void otherMowToTheLeft(LawnMower mower)
	{
		mower.toTheTop();
		do
		{
			mower.cut();
			if(!mower.atBottomBorder() && !mower.treeBelow())
			{
				mower.moveDown();
			}
			else
			{
				break;
			}
		}
		while(!mower.treeBelow() && !mower.atTopBottomBorder());
		mower.cut();
		Point temp2 = mower.getLocation();

		mower.toTheTop();
		mower.checkLeftToTheBottom(temp2);

		if(temp2.equals(mower.getLocation()) && !mower.leftIsOpen())
		{
			
		}
		else if(temp2.equals(mower.getLocation()) && mower.leftIsOpen())
		{
			mower.moveLeft();
			otherMowToTheLeft(mower);
		}
		else
		{
			otherMowToTheLeft(mower);
		}
	}
	
	public static void printArray(String[][] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[0].length; j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
