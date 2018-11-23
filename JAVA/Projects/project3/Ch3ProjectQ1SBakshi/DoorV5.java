/* Saket Bakshi, Period 6
Question 1.5 of Ch 3 project. This program creates an accessor method for a door class.
*/
public class DoorV5
{
	private String name;
	private String state;

	public DoorV5(String doorName, String doorState)
	{
		this.name = doorName;
		this.state = doorState;
	}

	public void close()
	{
		state = "close";
	}

	public void open()
	{
		state = "open";
	}

	public String getName()
	{
		return name;
	}

	public String getState()
	{
		return state;
	}
}