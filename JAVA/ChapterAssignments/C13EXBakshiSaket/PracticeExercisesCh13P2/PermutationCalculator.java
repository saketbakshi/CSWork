/**
	Saket Bakshi. 4/7/19. Period 6. This is used for project 2 of Chapter 13.
	This class computes the permutations of an integer array. This is used to permute Strings, which have problems with repeated characters. By basing the Strings off of their character position on an integer array, we can truly permute any String.
*/
public class PermutationCalculator
{
	private int[] arr;
    private boolean done;

	/**
        Creates an array object to be permuted.
        @param n the length of the array to be permutted
    */
    public PermutationCalculator(int n)
    {
        arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = i;
        }
    }

    /**
        Sends the next permutation of number orders.
        @return the next permutation
    */
    public int[] nextPer()
    {
        if (arr.length <= 1)
        {
            return arr;
        }
        for (int i = arr.length - 1; i > 0 ; i--)
        {
            if (arr[i - 1] < arr[i])
            {
                int j = arr.length - 1;
                while (arr[i - 1] > arr[j])
                {
                    j--;
                }
                swap(i - 1, j);
                reverse(i, arr.length - 1);
                return arr;
            }
        }
        return arr;
    }

    /**
        Checks if there are more permutations to return.
        @return if there are more permutations
    */
    public boolean canPermuteMore()
    {
        if (arr.length <= 1)
        {
            return false;
        }
        for (int i = arr.length - 1; i > 0; i--)
        {
            if (arr[i - 1] < arr[i])
            {
                return true;
            }
        }
        return false;
    }

    /**
        Swaps two items in an array.
        @param i the position of the first element to be swapped
        @param j the position of the second element to be swapped
    */
    public void swap(int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
        Reverses the order of an array from position i to position j
        @param i the first position
        @param j the second position
    */
    public void reverse(int i, int j)
    {
        while (i < j)
        {
            swap(i, j);
            i++;
            j--;
        }
    }
}