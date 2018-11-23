import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class Ch2ProjectQ8_1ComponentSBakshi extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;

		Ellipse2D.Double circle = new Ellipse2D.Double(0,0,200,200);
		g2.draw(circle);

		Ellipse2D.Double circle1 = new Ellipse2D.Double(20,0,160,160);
		g2.draw(circle1);

		Ellipse2D.Double circle2 = new Ellipse2D.Double(40,0,120,120);
		g2.draw(circle2);

		Ellipse2D.Double circle3 = new Ellipse2D.Double(60,0,80,80);
		g2.draw(circle3);

		Ellipse2D.Double circle4 = new Ellipse2D.Double(80,0,40,40);
		g2.draw(circle4);
	}
}