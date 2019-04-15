/**
	Saket Bakshi. 4/14/19. Period 6. This is used for the Tumor Detection Lab.
	Tests the TumorDetection class.
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class TumorTester
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inFile = new File("input.txt");
		Scanner input = new Scanner(inFile);
		input.useDelimiter("");
		ArrayList<Integer> tempScan = new ArrayList<>();
		ArrayList<Integer> tempTumor = new ArrayList<>();
		
		while(input.hasNextInt())
			tempScan.add(input.nextInt());
		
		int[][] scan = new int[tempScan.size()][tempScan.size()];
		
		// Fills in the skin sample
		for(int j = 0; j < tempScan.size(); j++)
			scan[0][j] = tempScan.get(j);
		
		for(int i = 1; i < tempScan.size(); i++)
		{
			input.nextLine();
			for(int j = 0; j < tempScan.size(); j++)
				scan[i][j] = input.nextInt();
		}
		
		input.nextLine();
		
		// Determines the size of the tumor
		while(input.hasNextInt())
			tempTumor.add(input.nextInt());
		
		int[][] tumor = new int[tempTumor.size()][tempTumor.size()];
		
		// Fills in tumor object
		for(int j = 0; j < tempTumor.size(); j++)
			tumor[0][j] = tempTumor.get(j);
		for(int i = 1; i < tempTumor.size(); i++)
		{
			input.nextLine();
			for(int j = 0; j < tempTumor.size(); j++)
				tumor[i][j] = input.nextInt();
		}

		TumorDetection tester = new TumorDetection(tumor);
		tester.checkScan(scan);
	}

	public static void print2DArray(int[][] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array.length; j++)
				System.out.print(array[i][j]);
			
			System.out.println();
		}
	}
}