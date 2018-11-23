import javax.swing.JFrame;

public class Ch2ProjectQ8_1ViewerSBakshi
{
	public static void main(String[] args)
	{
		JFrame plot = new JFrame();

		plot.setSize(300,300);
		plot.setTitle("Circles");
		plot.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		Ch2ProjectQ8_1ComponentSBakshi component = new Ch2ProjectQ8_1ComponentSBakshi();
		plot.add(component);

		plot.setVisible(true);

	}
}