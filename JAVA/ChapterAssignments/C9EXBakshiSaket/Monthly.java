/** Saket Bakshi. 2/10/19. Period 6. This is used for project 1 of Chapter 9.
	Makes monthly appointments with dates and descriptions.
*/
public class Monthly extends Appointment
{
	/**
		Makes onetime appointments with dates and descriptions.
	*/
	public Monthly()
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
	public Monthly(String description, int year, int month, int day)
	{
		super(description, year, month, day);
	}

	/**
		Checks if an appointment occurs on a given day.
		@param year the year to check for
		@param month the month to check for
		@param day the day to check for
		@return if an appointment occurs on a given day
	*/
	public boolean occursOn(int year, int month, int day)
	{
		if(super.getDay() == day)
			return true;
		else
			return false;
	}
}