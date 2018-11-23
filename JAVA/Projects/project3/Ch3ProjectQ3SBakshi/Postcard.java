/* Saket Bakshi, Period 6
Question 3.2 of Ch 3 project. This program declares a Postcard class for sending
postcards with the same message to different recipients.
*/

public class Postcard
{
	//instance variables
	private String message;
	private String sender;
	private String recipient;
	
	/**Makes an object for a postcard class with a sender and a message.
	Has methods to change recipients.
	@param aSender the sender
	@param aMessage the message
	*/
	public Postcard(String aSender, String aMessage)
	{

		this.message = aMessage;
		this.sender = aSender;
		this.recipient = "";
	}

	public void setRecipient(String newRecipient)
	{
		this.recipient = newRecipient;
	}

	public void print()
	{
		System.out.println("Hello, " + this.recipient);
		System.out.println(this.message);
		System.out.println("From,\n" +this.sender);
	}
}