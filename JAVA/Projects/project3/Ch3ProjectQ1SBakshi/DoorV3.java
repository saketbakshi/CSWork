/* Saket Bakshi, Period 6
Question 1.3 of Ch 3 project. This program creates methods for a door class.
*/
public class DoorV3
{
	private String name;
	private String state;

	public void close()
	{
		state = "close";
	}

	public void open()
	{
		state = "open";
	}
}