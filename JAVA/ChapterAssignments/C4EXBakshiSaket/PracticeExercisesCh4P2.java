/* Saket Bakshi. 10/15/18. Period 6
This program calculates the date for Easter Sunday.
Ch 4, Project 2
*/
import java.util.Scanner;

public class PracticeExercisesCh4P2
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int year;

		System.out.println("For what year do you want to find the date for Easter Sunday?");

		year = key.nextInt(); //getting the initial year

		int a, c, e, h, k, r, p, b, d, g, j, m, n;

		a = year % 19;
		b = year / 100;
		c = year % 100;
		d = b / 4;
		e = b / 4;
		g = (8 * b + 13) / 25;
		h = (19 * a + b - d - g + 15) / 30;
		j = c / 4;
		k = c % 4;
		m = (a + (11 * h)) / 319;
		r = ((2 * e) + (2 * j ) -k -h -m + 32) % 7;
		n = (h - m + r + 90) / 25;
		p = (h - m + r + n + 19) % 32; //doing Friedrich's calculations

		String month = "";

		if(n == 1)
			month = "January";
		if(n == 2)
			month = "February";
		if(n == 3)
			month = "March";
		if(n == 4)
			month = "April";
		if(n == 5)
			month = "May";
		if(n == 6)
			month = "June";
		if(n == 7)
			month = "July";
		if(n == 8)
			month = "August";
		if(n == 9)
			month = "September";
		if(n == 10)
			month = "October";
		if(n == 11)
			month = "November";
		if(n == 12)
			month = "December";


		System.out.println("Easter will be on day " + p + " of " + month + " in " + year);
		//returning the date and month for the year
	}
}