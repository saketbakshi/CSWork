/**
	Saket Bakshi. 4/23/19. Period 6. This is used for problem 1 of Chapter 14.
	Modifies selection sort to sort integers in descending order.
*/
import java.util.Arrays;
public class SelectionReverseDemo
{
	public static void main(String[] args)
	{
		int[] a = ArrayUtil.randomIntArray(20,100);
		System.out.println(Arrays.toString(a));

		SelectionSortReverse.sort(a);

		System.out.println(Arrays.toString(a));
	}
}