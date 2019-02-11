/** Saket Bakshi. 2/10/19. Period 6. This is used for project 1 of Chapter 9.
	Tests the Appointment class and its subclasses.
*/
import java.util.Scanner;
public class AppointmentTester
{
	public static void main(String[] args)
	{
		System.out.println("Enter 5 appointments with descriptions and dates.\nGive 1 onetime appointment, 2 daily appointments, and 2 monthly appointments.");
		Scanner key = new Scanner(System.in);

		System.out.println("Description for the onetime appointment: ");
		String des1 = key.nextLine();
		System.out.println("Year for the onetime appointment: ");
		int year1 = key.nextInt();
		System.out.println("Month for the onetime appointment: ");
		int month1 = key.nextInt();
		System.out.println("Day for the onetime appointment: ");
		int day1 = key.nextInt();
		Onetime first1 = new Onetime(des1, year1, month1, day1);
		key.nextLine();
		System.out.println();

		System.out.println("Description for the first daily appointment: ");
		String des2 = key.nextLine();
		System.out.println("Year for the first daily appointment: ");
		int year2 = key.nextInt();
		System.out.println("Month for the first daily appointment: ");
		int month2 = key.nextInt();
		System.out.println("Day for the first daily appointment: ");
		int day2 = key.nextInt();
		Daily first2 = new Daily(des2, year2, month2, day2);
		key.nextLine();
		System.out.println();

		System.out.println("Description for the second daily appointment: ");
		String des3 = key.nextLine();
		System.out.println("Year for the second daily appointment: ");
		int year3 = key.nextInt();
		System.out.println("Month for the second daily appointment: ");
		int month3 = key.nextInt();
		System.out.println("Day for the second daily appointment: ");
		int day3 = key.nextInt();
		Daily second3 = new Daily(des3, year3, month3, day3);
		key.nextLine();
		System.out.println();

		System.out.println("Description for the first monthly appointment: ");
		String des4 = key.nextLine();
		System.out.println("Year for the first monthly appointment: ");
		int year4 = key.nextInt();
		System.out.println("Month for the first monthly appointment: ");
		int month4 = key.nextInt();
		System.out.println("Day for the first monthly appointment: ");
		int day4 = key.nextInt();
		Monthly first4 = new Monthly(des4, year4, month4, day4);
		key.nextLine();
		System.out.println();

		System.out.println("Description for the second monthly appointment: ");
		String des5 = key.nextLine();
		System.out.println("Year for the second monthly appointment: ");
		int year5 = key.nextInt();
		System.out.println("Month for the second monthly appointment: ");
		int month5 = key.nextInt();
		System.out.println("Day for the second monthly appointment: ");
		int day5 = key.nextInt();
		Monthly second5 = new Monthly(des5, year5, month5, day5);
		key.nextLine();
		System.out.println();

		System.out.println("Now give me a year, month, and date. I'll tell you what appointments are on that day. What's the year? ");
		int yearTest = key.nextInt();
		System.out.println("What's the month? ");
		int monthTest = key.nextInt();
		System.out.println("What's the day? ");
		int dayTest = key.nextInt();
		System.out.println();

		if(first1.occursOn(yearTest, monthTest, dayTest))
			System.out.println(first1.getDescription() + " is on this day.");

		if(first2.occursOn(yearTest, monthTest, dayTest))
			System.out.println(first2.getDescription() + " is on this day.");
		if(second3.occursOn(yearTest, monthTest, dayTest))
			System.out.println(second3.getDescription() + " is on this day.");

		if(first4.occursOn(yearTest, monthTest, dayTest))
			System.out.println(first4.getDescription() + " is on this day.");
		if(second5.occursOn(yearTest, monthTest, dayTest))
			System.out.println(second5.getDescription() + " is on this day.");
	}
}