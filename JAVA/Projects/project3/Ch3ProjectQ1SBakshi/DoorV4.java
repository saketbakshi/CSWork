/* Saket Bakshi, Period 6
Question 1.4 of Ch 3 project. This program creates constructors for a door class.
*/
public class DoorV4
{
	private String name;
	private String state;

	public DoorV4(String doorName, String doorState)
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
}