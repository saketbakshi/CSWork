import java.util.Scanner;

public class CBT009BakshiSaket
{
	public static void main(String[] args)
	{
		Scanner keypad = new Scanner(System.in);
		double m, kg, bmi;

		System.out.print("Your height in m: ");
		m = keypad.nextDouble();

		System.out.print("Your weight in kg: ");
		kg = keypad.nextDouble();

		bmi = kg/ (m*m);

		System.out.println("Your BMI is " + bmi);
	}
}