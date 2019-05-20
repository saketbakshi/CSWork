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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.sound.sampled.*;
import java.io.*;
import sun.audio.*;

public class JukeboxWindow extends JFrame
{
	private static final int FRAME_WID = 1200;
	private static final int FRAME_HEI = 1050;

	
	public static void main(String[] args) throws FileNotFoundException
	{
		JFrame frame = new JFrame();
				JPanel panel = new JPanel();
					panel.setLayout(null);
				//StructureComponent structure = new StructureComponent();
				//	frame.add(structure);

				JLabel label = new JLabel("Playing: ");
					label.setBounds(100, 200, 200, 50);
					panel.add(label);
				JButton buttonForever = new JButton("Play \"Forever\"");
					buttonForever.setBounds(100, 0, 200, 50); //(x, y, button width, button height)
					class ForeverListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
							//add code for playing song
							//try
							//{
							//	InputStream in = new FileInputStream("Forever.mp3");
							//	AudioStream as = new AudioStream(in);
							//	AudioPlayer.player.start(as);
							//	AudioPlayer.player.stop(as);
							//	File newFile = new File("C:\\Users\\saket\\Git\\CSWork\\JAVA\\Projects\\JukeboxCreator\\Forever.mp3");
							//	Media song1m = new Media(newFile.toURI().toString());
							//	MediaPlayer mediaPlayer = new MediaPlayer(song1m);
							//	mediaPlayer.play();
							//}
							try
							{
						        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/8-Bit-Noise-1.wav").getAbsoluteFile());
						        AudioFormat format = audioInputStream.getFormat();
						        Clip clip = AudioSystem.getClip();
						        DataLine.Info info = new DataLine.Info(Clip.class, format);
						        clip = (Clip) AudioSystem.getLine(info);
						        clip.open(audioInputStream);
						        clip.start();
    						}
    						catch(Exception ex)
    						{
						        System.out.println("Error with playing sound.");
						        ex.printStackTrace();
    						}
							finally
							{
								//sample code:
								label.setText("Playing: \"Forever\"");
							}
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
			
			frame.add(panel);

			frame.setSize(FRAME_WID, FRAME_HEI);
			frame.setTitle("Chris and Saket's Jammin' Jukebox");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
	}
}