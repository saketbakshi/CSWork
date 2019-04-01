/**
	Saket Bakshi. 4/1/19. Period 6. This is used for the Number Please Lab.
	Creates a set 10 by 10 number array.
*/
public class NumberPlease
{
	private final int[][] grid = 
		{
			{2, 4, 5, 6, 1, 8, 9, 1, 4, 5},
			{3, 5, 7, 9, 10, 3, 2, 5, 6, 7},
			{6, 4, 4, 5, 10, 8, 5, 6, 7, 8},
			{4, 7, 7, 9, 3, 2, 7, 14, 9, 0},
			{5, 6, 8, 8, 8, 7, 7, 5, 5, 7},
			{6, 5, 4, 6, 4, 1, 3, 6, 8, 7},
			{8, 8, 3, 7, 8, 4, 4, 4, 6, 3},
			{10, 8, 16, 7, 3, 7, 8, 25, 9, 2},
			{4, 8, 3, 8, 2, 4, 6, 7, 10, 4},
			{4, 3, 6, 8, 1, 4, 3, 7, 3, 4},
		}; //the default grid
	private int smallerX;
	private int smallerY;
	private int largerX;
	private int largerY;

	/**
		Creates a NumberPlease class to follow the directions of the Goucher College NumberPlease problem.
	*/
	public NumberPlease()
	{
		smallerX = 0;
		smallerY = 0;
		largerX = 0;
		largerY = 0;
	}

	/**
		Calculates the sum of the numbers within a given triangle.
		@param x1 x-coordinate for one corner of the rectangle
		@param y1 y-coordinate for one corner of the rectangle
		@param x2 x-coordinate for another corner of the rectangle
		@param y2 y-coordinate for another corner of the rectangle
		@return the total sum
	*/
	public int findTotal(int x1, int y1, int x2, int y2)
	{
		int total = 0;

		if(x1 > x2)
		{
			smallerX = x2 - 1;
			largerX = x1 - 1;
		}
		else
		{
			smallerX = x1 - 1;
			largerX = x2 - 1;
		}

		if(y1 > y2)
		{
			smallerY = y2 - 1;
			largerY = y1 - 1;
		}
		else
		{
			smallerY = y1 - 1;
			largerY = y2 - 1;
		}

		for(int a = smallerY; a <= largerY; a++)
		{
			for(int b = smallerX; b <= largerX; b++)
			{
				total += grid[a][b];
			}
		}
		return total;
	}
}