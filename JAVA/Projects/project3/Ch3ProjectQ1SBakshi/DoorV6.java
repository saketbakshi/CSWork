/* Saket Bakshi, Period 6
Question 1.6 of Ch 3 project. This program creates mutator methods for a door class.
*/
public class DoorV6
{
	private String name;
	private String state;

	public DoorV6(String doorName, String doorState)
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

	public void setName(String newName)
	{
		this.name = newName;
	}

	public void setState(String newState)
	{
		this.state = newState;
	}
}