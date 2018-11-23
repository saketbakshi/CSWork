import javax.swing.JFrame;

public class Ch2ProjectQ6_2SBakshi
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(300, 200);
		frame.setTitle("Triangle Viewer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Ch2ProjectQ6_1SBakshi component = new Ch2ProjectQ6_1SBakshi();
		frame.add(component);

		frame.setVisible(true);
	}
}