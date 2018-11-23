/* Saket Bakshi, Period 6
Question 1.8 of Ch 3 project. This program explains what kind of variables state and newState are
*/
/*
state is an instance variable of the DoorV6 class. Each DoorV6 object has a state variable.
newState is a parameter variable of the mutator setState() that is created when a user uses setState()
and deleted when the method is finished.

*/
public class DoorV7
{
	private String name;
	private String state;

	public DoorV7(String doorName, String doorState)
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