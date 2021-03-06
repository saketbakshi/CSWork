/** Saket Bakshi. 2/10/19. Period 6. This is used for project 1 of Chapter 9.
	Makes onetime appointments with dates and descriptions.
*/
public class Onetime extends Appointment
{
	/**
		Makes onetime appointments with dates and descriptions.
	*/
	public Onetime()
	{
		super();
	}

	/**
		Makes appointments with dates and descriptions.
		@param description the description
		@param year the year
		@param month the month
		@param day the day
	*/
	public Onetime(String description, int year, int month, int day)
	{
		super(description, year, month, day);
	}
}