import javax.swing.JFrame;

public class Ch2ProjectQ7_1ViewerSBakshi
{
	public static void main(String[] args)
	{
		JFrame plot = new JFrame();

		plot.setSize(200,200);
		plot.setTitle("My House");
		plot.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		Ch2ProjectQ7_1ComponentSBakshi component = new Ch2ProjectQ7_1ComponentSBakshi();
		plot.add(component);

		plot.setVisible(true);

	}
}