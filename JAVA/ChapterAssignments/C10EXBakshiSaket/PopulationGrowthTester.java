/** Saket Bakshi. 3/4/19. Period 6. This is used for question 1 of Chapter 10.
	Tests a PopulationGrowth class that uses a button to simulate the growth of a cockroach population.
*/
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PopulationGrowthTester
{
	private static final int FRAME_WID = 400; //frame dimensions
	private static final int FRAME_HEI = 100;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("Simulate population increase"); //name of the button

		final PopulationGrowth cockroaches = new PopulationGrowth(2); //creates an initial population of 2

		final JLabel label = new JLabel("population: " + cockroaches.getPop()); //creates a label to show population

		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		frame.add(panel);

		class PopulationDoubleListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				cockroaches.doubler(); //doubles population
				label.setText("population: " + cockroaches.getPop()); //updates the label
			}
		}

		ActionListener listener = new PopulationDoubleListener(); //creates a listener
		button.addActionListener(listener); //adds the listener to the button
		frame.setSize(FRAME_WID, FRAME_HEI);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}