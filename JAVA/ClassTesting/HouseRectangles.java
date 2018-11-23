import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;

public class HouseRectangles extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;

		Rectangle structure = new Rectangle(30,30,50,40);
		g2.draw(structure);

		Rectangle windowOne = new Rectangle(35,35,10,10);
		g2.draw(windowOne);
		windowOne.translate(30,0);

		g2.draw(windowOne);

		Rectangle door = new Rectangle(50,50,10,20);
		g2.draw(door);

		Line2D.Double ceiling = new Line2D.Double(20,30,90,30);
		g2.draw(ceiling);

		Line2D.Double roof1 = new Line2D.Double(20,30,55,15);
		g2.draw(roof1);

		Line2D.Double roof2 = new Line2D.Double(55,15,90,30);
		g2.draw(roof2);

		Ellipse2D.Double handle = new Ellipse2D.Double(51,60,2,2);
		g2.draw(handle);
	}
}