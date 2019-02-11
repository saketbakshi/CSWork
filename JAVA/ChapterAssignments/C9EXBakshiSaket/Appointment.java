/** Saket Bakshi. 2/10/19. Period 6. This is used for project 1 of Chapter 9.
	Makes appointments with dates and descriptions.
*/
public class Appointment
{
	private String description;

	private int year;
	private int month;
	private int day;

	/**
		Makes appointments with dates and descriptions.
	*/
	public Appointment()
	{
		description = "";
		year = 0;
		month = 0;
		day = 0;
	}

	/**
		Makes appointments with dates and descriptions.
		@param description the description
		@param year the year
		@param month the month
		@param day the day
	*/
	public Appointment(String description, int year, int month, int day)
	{
		this.description = description;
		this.year = year;
		this.month = month;
		this.day = day;
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
		if(this.year == year && this.month == month && this.day == day)
			return true;
		else
			return false;
	}

	/**
		Returns the year
		@return the year
	*/
	public int getYear() {return year;}
	
	/**
		Returns the month
		@return the month
	*/
	public int getMonth() {return month;}

	/**
		Returns the day
		@return the day
	*/
	public int getDay() {return day;}
	
	/**
		Returns the description
		@return the description
	*/
	public String getDescription() {return description;}

	/**
		Sets the year
		@param y the year
	*/
	public void setYear(int y) {year = y;}
	
	/**
		Sets the month
		@param m the month
	*/
	public void setMonth(int m) {month = m;}
	
	/**
		Sets the day
		@param d the day
	*/
	public void setDay(int d) {day = d;}
	
	/**
		Sets the description
		@param d the description
	*/
	public void setDescription(String d) {description = d;}
}