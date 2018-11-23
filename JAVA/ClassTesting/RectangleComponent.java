import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;

		Rectangle track = new Rectangle(5,10,20,30);
		g2.draw(track);

		track.translate(15,25);

		g2.draw(track);
	}
}