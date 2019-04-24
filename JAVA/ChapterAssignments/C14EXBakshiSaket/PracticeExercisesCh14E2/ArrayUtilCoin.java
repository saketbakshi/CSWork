/**
	Saket Bakshi. 4/23/19. Period 6. This is used for problem 2 of Chapter 14.
	Manipulates coin arrays.
*/
public class ArrayUtilCoin
{
	/**
		Swaps two entries of an array.
		@param a the array
		@param i the first position to swap
		@param j the second position to swap
	*/
	public static void swap(Coin[] a, int i, int j)
	{
		Coin temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}