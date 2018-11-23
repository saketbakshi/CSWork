import java.util.Scanner;

public class CBT029BakshiSaket
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double x, y;

		System.out.print("Give me a number, and I shall find the square root of it. ");

		System.out.print("(No negatives, please.) ");
		x = in.nextDouble();

		while(x<0)
		{
			System.out.print("Sorry, I won't take the square root of a negative.\nNew number: ");
			x = in.nextDouble();
		}

		y = Math.sqrt(x);

		System.out.println("The square root of " + x + " is " + y + ".");
	}
}