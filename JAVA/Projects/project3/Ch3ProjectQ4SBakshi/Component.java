/* Saket Bakshi, Period 6
Question 4.3 of Ch 3 project. This program creates a component class for printing
two houses and two cars.
*/

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
	This component draws 2 cars and 2 houses
*/
public class Component extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;

		Car car1 = new Car(0,0);
		Car car2 = new Car(80,0);
		House house1 = new House(0,40);
		House house2 = new House(0,170);

		car1.draw(g2);
		car2.draw(g2);
		house2.draw(g2);
		house1.draw(g2);
	}
}