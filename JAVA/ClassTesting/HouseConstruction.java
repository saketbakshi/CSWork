import javax.swing.JFrame;

public class HouseConstruction
{
	public static void main(String[] args)
	{
		JFrame plot = new JFrame();

		plot.setSize(200,200);
		plot.setTitle("My House");
		plot.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		HouseRectangles component = new HouseRectangles();
		plot.add(component);

		plot.setVisible(true);
	}
}