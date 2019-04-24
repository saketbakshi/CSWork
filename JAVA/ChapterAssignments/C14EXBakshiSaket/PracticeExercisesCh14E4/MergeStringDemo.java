import java.util.Scanner;

public class MergeStringDemo
{
	public static void main(String[] args) {
		String[] names = {"John", "Nathan", "Saket", "Nic", "Arthur", "Ian", "Aris", "Chris", "Takeru", "Max", "Thinh", "Hung", "Daniel", "Josie", "Randy"};

		System.out.print("Original array: ");
		for(int i = 0; i < names.length - 1; i++)
		{
			System.out.print(names[i] + ", ");
		}
		System.out.print(names[names.length-1]);

		MergeSorterString.sort(names);

		System.out.print("\nSorted array: ");
		for(int i = 0; i < names.length - 1; i++)
		{
			System.out.print(names[i] + ", ");
		}
		System.out.print(names[names.length-1]);		
	}
}