/* Saket Bakshi, Period 6
Question 4.4 of Ch 3 project. This program views
two houses and two cars.
*/

import javax.swing.JFrame;

public class Viewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();

		frame.setSize(300,400);
		frame.setTitle("two cars and two houses");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Component component = new Component();
		frame.add(component);

		frame.setVisible(true);
	}
}