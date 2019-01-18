import java.util.Scanner;

public class CBT106Driver
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		System.out.print("Enter a message: ");
		String msg = key.nextLine();
		System.out.print("Number of times: ");
		int n = key.nextInt();

		CBT106BakshiSaket pr = new CBT106BakshiSaket();
		pr.setValues(msg, n);

		System.out.println(pr.getRepeatedPhrase());
	}
}