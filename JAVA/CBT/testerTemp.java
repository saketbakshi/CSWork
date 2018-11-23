//import java.awt.Rectangle;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

//public class testerTemp
public class testerTemp extends JComponent
{
	//public static void main(String[] args)
	public void paintComponent(Graphics g)
	{
		Circle c1 = new Circle(3);
		Circle c2 = c1;
		c1.setRadius(4);
		System.out.println(c2.getRadius());

	}
}