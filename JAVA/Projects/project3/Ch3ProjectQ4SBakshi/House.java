/* Saket Bakshi, Period 6
Question 4.2 of Ch 3 project. This program creates a house class for a position, with the 
top left corner of the rectangle of the house being the constuctor explcit argument.
*/

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class House
{
	private int xLeft;
	private int yTop;

	/**Constructs a house with a given top left corner for the house rectangle.
	@param x the x-coordinate for the corner
	@param y the y-coordinate for the corner
	*/
	public House(int x, int y)
	{
		this.xLeft = x;
		this.yTop = y;
	}

	/**Draws the house
	@param g2 the graphics context
	*/
	public void draw(Graphics2D g2)
	{
		Line2D.Double ceiling = new Line2D.Double(xLeft, yTop + 40, xLeft + 110, yTop + 40);
		Line2D.Double roof1 = new Line2D.Double(xLeft, yTop + 40, xLeft + 55, yTop);
		Line2D.Double roof2 = new Line2D.Double(xLeft + 110, yTop + 40, xLeft + 55, yTop);
		Rectangle houseBody = new Rectangle(xLeft + 10, yTop + 40, 90, 70);
		Rectangle door = new Rectangle(xLeft + 40, yTop + 60, 30, 50);
		Ellipse2D.Double knob = new Ellipse2D.Double(xLeft + 45, yTop + 85, 5, 5);

		g2.draw(ceiling);
		g2.draw(roof2);
		g2.draw(roof1);
		g2.draw(houseBody);
		g2.draw(door);
		g2.draw(knob);
	}
}