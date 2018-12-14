import java.util.Scanner;

public class CipherSample
{
	private String[][] messageMatrix;
	private String message;
	private String key;
	private String encodeDecode;

	private int row;
	private int columns;


	public CipherSample(String eD, String key, String message)
	{
		this.key = key;
		this.encodeDecode = eD;
		this.message = message.;
		this.columns = key.length;
		this.row = message.calcRows(); //need method to figure out number of rows
		this.messageMatrix = new String[this.rows][this.columns];
	}

	public String[][] getMatrix()
	{
		return this.messageMatrix;
	}

	public int calcRows()
	{
		Scanner rowed = new Scanner(this.message);
		int calculated = 0;
		while(rowed.hasNext())
		{
			rowed.next();
			calculated++;
		}

		return calculated;
	}

	public void printArray2D(String[][] arr2D)
	{
		for(int i = 0; i < arr2D.length; i++)
		{
			for(int j = 0; j < arr2D[i].length; j++)
			{
				System.out.println(arr2D[i][j]);
			}
			System.out.println();
		}
	}

	public void fillArray2D(String[][] arr2d)
	{
		int messageCounter = 0;
		for(int i = 0; i < arr2D.length; i++)
		{
			for(int j = 0; j < arr2D[i].length; j++)
			{
				arr2D[i][j] = this.messageString.substring(messageCounter, messageCounter + 1);
				if(messageCounter = this.message.length())
				{
				}
				else
				{
					messagecounter++;
				}
			}
		}
	}
}