import java.util.Scanner;

public class CBT015BakshiSaket
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		int age;

		System.out.print("How old are you? ");
		age = key.nextInt();

		if(age<13)
		{
			System.out.println("You are too young to create a Facebook account.");
		}

		if(age<16)
		{
			System.out.println("You are too young to get a driver's license.");
		}

		if(age<18)
		{
			System.out.println("You are too young to get a tattoo.");
		}

		if(age<21)
		{
			System.out.println("You are too young to drink alcohol.");
		}

		if(age<35)
		{
			System.out.println("You are too young to run for President of the United States.");
			System.out.println("How sad!");
		}


	}
}