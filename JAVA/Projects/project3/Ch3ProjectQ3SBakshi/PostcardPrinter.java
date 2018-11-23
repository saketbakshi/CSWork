/* Saket Bakshi, Period 6
Question 3.4 of Ch 3 project. This program tests the Postcard class.
*/
public class PostcardPrinter
{
	public static void main(String[] args)
	{
		String text = "I am having a great time on\nthe island of Java. Weather\nis great. Wish you were here!";
		Postcard postcard = new Postcard("Janice", text);
		postcard.setRecipient("Sue");
		postcard.print();
		postcard.setRecipient("Tim");
		postcard.print();
	}
}