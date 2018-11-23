import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class LineComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;

		Line2D.Double ceiling = new Line2D.Double(5,20,10,20);
		g2.draw(ceiling);

	}
}