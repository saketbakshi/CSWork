import java.util.Scanner;

public class CBT026BakshiSaket
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int pin, entry;

		pin = 12345;

		System.out.println("WELCOME TO THE BANK OF JAVA.");
		System.out.print("ENTER YOUR PIN ");
		entry = key.nextInt();

		while(entry != pin)
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = key.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
}