import java.util.Scanner;

public class CBT107Driver
{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double n;

		CBT107BakshiSaket sqrt = new CBT107BakshiSaket();

		do
		{
			System.out.print("Enter a number (or <=0 to quit): ");
			n = key.nextDouble();

			if(n > 0)
			{
				sqrt.setNumber(n);
				System.out.println(sqrt.getRoot());
			}
		} while(n > 0);
	}
}