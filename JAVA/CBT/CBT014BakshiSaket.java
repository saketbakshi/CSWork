import java.util.Scanner;

public class CBT014BakshiSaket
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		int age;
		double income, attractiveness;
		boolean allowed;
		
		System.out.print("Enter your age: ");
		age = key.nextInt();

		System.out.print("Enter your yearly income: ");
		income = key.nextDouble();

		System.out.print("How attractive are you, on a scale of 0.0 to 10.0? ");
		attractiveness = key.nextDouble();

		allowed = (age > 25 && age < 40 && (income >50000 || attractiveness >= 8.5));

		System.out.println("You are allowed to date my grandchild: " + allowed);
	}
}


//import java.io.File;
//import java.io.FileNotFoundException;
// File inputFile = new File("input.txt");
        //Scanner scanFile = new Scanner(inputFile);
        //String word = scanFile.next();