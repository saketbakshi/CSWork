import java.util.Scanner;

public class CBT021BakshiSaket
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		String title;

		System.out.print("First name: ");
		String first = key.next();
		System.out.print("Last name: ");
		String last = key.next();
		System.out.print("Gender (M/F): ");
		String gender = key.next();
		System.out.print("Age: ");
		int age = key.nextInt();

		if(age <20)
		{
			title = first;
		}
		else
		{
			if(gender.equals("F"))
			{
				System.out.print("Are you married, "+first+"? (Y/N): ");
				String married = key.next();
				if(married.equals("Y"))
				{
					title = "Mrs.";
				}
				else
				{
					title = "Ms.";
				}
			}
			else
			{
				title = "Mr.";
			}
		}

		System.out.println("\n" + title + " " +last);
	}
}