/**
	Saket Bakshi. 4/7/19. Period 6. This is used for project 2 of Chapter 13.
	This class tests the calculation of permutations of a String.
*/
public class PermutationTester
{
	public static void main(String[] args)
	{
		PermutationOrganizer test = new PermutationOrganizer("bruh");
		System.out.println("bruh");

        while (test.canPermuteMore())
        {
            System.out.println(test.nextPermutation());
        }
	}
}