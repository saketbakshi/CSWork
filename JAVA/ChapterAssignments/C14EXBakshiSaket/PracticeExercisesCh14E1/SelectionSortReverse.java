/**
	Saket Bakshi. 4/23/19. Period 6. This is used for problem 1 of Chapter 14.
	Modifies selection sort to sort integers in descending order.
*/
public class SelectionSortReverse
{
	/**
		Sorts an array, using selection sort.
		@param a the array to sort
	*/
	public static void sort(int[] a)
	{
		for(int i = 0; i < a.length - 1; i++)
		{
			int maxPos = maximumPosition(a, i);
			ArrayUtil.swap(a, maxPos, i);
		}
	}

	/**
		Finds the largest element in a tail range of the array.
		@param a the array to sort
		@param from the first position in a to compare
		@return the position of the largest element in the range a[from] . . . a[a.length-1]
	*/
	private static int maximumPosition(int[] a, int from)
	{
		int maxPos = from;
		for(int i = from + 1; i < a.length; i++)
		{
			if(a[i] > a[maxPos]) {maxPos = i;}
		}
		return maxPos;
	}
}