import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class Workspace
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		StructureComponent structure = new StructureComponent();
		frame.add(structure);
		frame.setSize(1920, 1280);
		frame.setTitle("Chris and Saket's Jammin' Jukebox");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}