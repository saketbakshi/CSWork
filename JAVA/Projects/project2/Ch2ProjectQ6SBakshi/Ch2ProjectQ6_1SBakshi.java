import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class Ch2ProjectQ6_1SBakshi extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;

		Line2D.Double line1 = new Line2D.Double(10, 50, 20, 50); // (x1,y1, x2,y2)
		Line2D.Double line2 = new Line2D.Double(10, 50, 15, 25);
		Line2D.Double line3 = new Line2D.Double(15, 25, 20, 50);

		g2.draw(line1);
		g2.draw(line2);
		g2.draw(line3);
	}
}