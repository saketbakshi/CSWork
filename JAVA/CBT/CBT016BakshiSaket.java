import java.util.Scanner;

public class CBT016BakshiSaket
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		double fir, sec;

		System.out.print("Give me two numbers. First: ");
		fir = key.nextDouble();
		System.out.print("Second: ");
		sec = key.nextDouble();

		if(fir<sec)
		{
			System.out.println(fir + " is LESS THAN " + sec);
		}

		if(fir<=sec)
		{
			System.out.println(fir + " is LESS THAN or EQUAL TO" + sec);
		}

		if(fir==sec)
		{
			System.out.println(fir + " is EQUAL TO " + sec);
		}

		if(fir>=sec)
		{
			System.out.println(fir + " is GREATER THAN or EQUAL TO" + sec);
		}

		if(fir>sec)
		{
			System.out.println(fir + " is GREATER THAN " + sec);
		}

		if(fir!=sec)
			System.out.println(fir + " is NOT EQUAL TO " + sec);

	}
}