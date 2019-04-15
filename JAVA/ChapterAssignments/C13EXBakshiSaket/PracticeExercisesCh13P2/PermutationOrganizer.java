/**
	Saket Bakshi. 4/7/19. Period 6. This is used for project 2 of Chapter 13.
	This class permutes Strings by calculating permutations of their character positions.
*/
public class PermutationOrganizer
{
	private String word;
    private PermutationCalculator example;

    /**
    	Organizes a PermutationCalculator object to return permutations of a String.
    	@param aWord the word to permute
    */
    public PermutationOrganizer(String aWord)
    {
        word = aWord;
        example = new PermutationCalculator(word.length());
    }

    /**
		Sees if more permutations can be calculated.
		@return if more permutations can be done
	*/
    public boolean canPermuteMore()
    {
        return example.canPermuteMore();
    }

    /**
    	Calculates the next permutation.
    	@return the next permutation
    */
    public String nextPermutation()
    {
        int[] arr = example.nextPer();

        String e = "";
        for (int i = 0; i < arr.length; i++)
        {
            e = e + word.charAt(arr[i]);
        }
        return e;
    }
}