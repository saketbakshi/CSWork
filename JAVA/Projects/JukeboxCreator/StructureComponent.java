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
import java.awt.Color;
import javax.swing.JComponent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
import java.io.FileNotFoundException;

public class StructureComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Rectangle jukeboxStructure = new Rectangle(10, 300, 1165, 700);
		g2.setColor(Color.RED);

		g2.fillRect(10, 300, 1165, 700);

		JPanel panel = new JPanel();
			panel.setLayout(null);

		JLabel label = new JLabel("Playing: ");
			label.setBounds(100, 200, 100, 50);
			panel.add(label);
		JButton buttonForever = new JButton("Play \"Forever\"");
			buttonForever.setBounds(100, 0, 200, 50); //(x, y, button width, button height)
			class ForeverListener implements ActionListener
			{
				public void actionPerformed(ActionEvent event)
				{
					//add code for playing song
					File newFile = new File("C:\\Users\\saket\\Git\\CSWork\\JAVA\\Projects\\JukeboxCreator\\Forever.3");
					Media song1m = new Media(newFile.toURI().toString());
					MediaPlayer mediaPlayer = new MediaPlayer(song1m);
					mediaPlayer.play();
					//sample code:
					label.setText("Playing: \"Forever\"");
				}
			}
			ActionListener listenerForever = new ForeverListener();
			buttonForever.addActionListener(listenerForever);
			panel.add(buttonForever);
		JButton buttonBaby = new JButton("Play \"Baby\"");
			buttonBaby.setBounds(100, 100, 200, 50); //(x, y, button width, button height)
			class BabyListener implements ActionListener
			{
				public void actionPerformed(ActionEvent event)
				{
					//add code for playing song
					//sample code:
					label.setText("Playing: \"Baby\"");
				}
			}
			ActionListener listenerBaby = new BabyListener();
			buttonBaby.addActionListener(listenerBaby);
			panel.add(buttonBaby);
	}
}