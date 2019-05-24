import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.sound.sampled.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Image;
import java.io.*;

public class JukeboxWindowV2 extends JFrame
{
	private static final int FRAME_WID = 900;
	private static final int FRAME_HEI = 950;

	public JButton makeButton(String name, File input, int xPos, int yPos, int wid, int hei) {
		JButton result = new JButton(name);
		result.setBounds(xPos, yPos, wid, hei);
		AudioInputStream audioInput = AudioSystem.getAudioInputStream(input);
		DataLine.Info info = new DataLine.Info(Clip,class, audioInput.getFormat());
		Clip clip = (Clip) AudioSystem.getLine(info);
		clip.open(audioInput);
	}


	
	public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException
	{
		JFrame frame = new JFrame();
				JPanel panel = new JPanel();
					panel.setLayout(null);

				JLabel label = new JLabel("Playing: ");
					label.setBounds(100, 850, 300, 50);
					panel.add(label);

				JLabel title = new JLabel("Chris and Saket's Jammin' Jukebox");
					title.setBounds(345, 25, 210, 50);
					panel.add(title);

				JButton buttonBoulevard = new JButton("Play \"Boulevard of Broken Dreams\"");
					buttonBoulevard.setBounds(100, 100, 300, 50); //(x, y, button width, button height)
					AudioInputStream audioInputStreamBoulevard = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/Boulevard of Broken Dreams.wav").getAbsoluteFile());
			        AudioFormat formatBoulevard = audioInputStreamBoulevard.getFormat();
			        DataLine.Info infoBoulevard = new DataLine.Info(Clip.class, formatBoulevard);
			        Clip clipBoulevard = (Clip) AudioSystem.getLine(infoBoulevard);
					clipBoulevard.open(audioInputStreamBoulevard);
					class BoulevardListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
							clipBoulevard.start();
    						label.setText("Playing: \"Boulevard of Broken Dreams\"");
						}
					}
					ActionListener listenerBoulevard = new BoulevardListener();
					buttonBoulevard.addActionListener(listenerBoulevard);
					panel.add(buttonBoulevard);

				JButton buttonForever = new JButton("Play \"Forever\"");
					buttonForever.setBounds(100, 175, 300, 50); //(x, y, button width, button height)
			        AudioInputStream audioInputStreamForever = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/Forever.wav").getAbsoluteFile());
			        AudioFormat formatForever = audioInputStreamForever.getFormat();
			        DataLine.Info infoForever = new DataLine.Info(Clip.class, formatForever);
			        Clip clipForever = (Clip) AudioSystem.getLine(infoForever);
	        		clipForever.open(audioInputStreamForever);
					class ForeverListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
					        clipForever.start();
							label.setText("Playing: \"Forever\"");	
						}
					}
					ActionListener listenerForever = new ForeverListener();
					buttonForever.addActionListener(listenerForever);
					panel.add(buttonForever);

				JButton buttonSeconds = new JButton("Play \"FourFiveSeconds\"");
					buttonSeconds.setBounds(100, 250, 300, 50); //(x, y, button width, button height)
			        AudioInputStream audioInputStreamSeconds = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/FourFiveSeconds.wav").getAbsoluteFile());
			        AudioFormat formatSeconds = audioInputStreamSeconds.getFormat();
			        DataLine.Info infoSeconds = new DataLine.Info(Clip.class, formatSeconds);
			        Clip clipSeconds = (Clip) AudioSystem.getLine(infoSeconds);
	        		clipSeconds.open(audioInputStreamSeconds);
					class SecondsListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
							clipSeconds.start();
							label.setText("Playing: \"FourFiveSeconds\"");
						}
					}
					ActionListener listenerSeconds = new SecondsListener();
					buttonSeconds.addActionListener(listenerSeconds);
					panel.add(buttonSeconds);

				JButton buttonLove = new JButton("Play \"I Love It\"");
					buttonLove.setBounds(100, 325, 300, 50); //(x, y, button width, button height)
			        AudioInputStream audioInputStreamLove = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/I Love It.wav").getAbsoluteFile());
			        AudioFormat formatLove = audioInputStreamLove.getFormat();
			        DataLine.Info infoLove = new DataLine.Info(Clip.class, formatLove);
			        Clip clipLove = (Clip) AudioSystem.getLine(infoLove);
	        		clipLove.open(audioInputStreamLove);
					class LoveListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
					        clipLove.start();
							label.setText("Playing: \"I Love It\"");
						}
					}
					ActionListener listenerLove = new LoveListener();
					buttonLove.addActionListener(listenerLove);
					panel.add(buttonLove);

				JButton buttonIrid = new JButton("Play \"Iridescent\"");
					buttonIrid.setBounds(100, 400, 300, 50); //(x, y, button width, button height)
			        AudioInputStream audioInputStreamIrid = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/Iridescent.wav").getAbsoluteFile());
			        AudioFormat formatIrid = audioInputStreamIrid.getFormat();
			        DataLine.Info infoIrid = new DataLine.Info(Clip.class, formatIrid);
			        Clip clipIrid = (Clip) AudioSystem.getLine(infoIrid);
			        clipIrid.open(audioInputStreamIrid);
					class IridListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
					        clipIrid.start();
							label.setText("Playing: \"Iridescent\"");
						}
					}
					ActionListener listenerIrid = new IridListener();
					buttonIrid.addActionListener(listenerIrid);
					panel.add(buttonIrid);

				JButton buttonAll = new JButton("Play \"All Of The Lights\"");
					buttonAll.setBounds(100, 475, 300, 50); //(x, y, button width, button height)
			        AudioInputStream audioInputStreamAll = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/All Of The Lights (Feat. Rihanna, Drake, John Legend, Kid Cudi, Fergie, Alicia Keys, Ryan Leslie & Elton John).wav").getAbsoluteFile());
			        AudioFormat formatAll = audioInputStreamAll.getFormat();
			        DataLine.Info infoAll = new DataLine.Info(Clip.class, formatAll);
			        Clip clipAll = (Clip) AudioSystem.getLine(infoAll);
			        clipAll.open(audioInputStreamAll);
					class AllListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
					        clipAll.start();
							label.setText("Playing: \"All Of The Lights\"");
						}
					}
					ActionListener listenerAll = new AllListener();
					buttonAll.addActionListener(listenerAll);
					panel.add(buttonAll);

				JButton buttonLoveYourself = new JButton("Play \"Love Yourself\"");
					buttonLoveYourself.setBounds(100, 550, 300, 50); //(x, y, button width, button height)
			        AudioInputStream audioInputStreamLoveYourself = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/Love Yourself.wav").getAbsoluteFile());
			        AudioFormat formatLoveYourself = audioInputStreamLoveYourself.getFormat();
			        DataLine.Info infoLoveYourself = new DataLine.Info(Clip.class, formatLoveYourself);
			        Clip clipLoveYourself = (Clip) AudioSystem.getLine(infoLoveYourself);
			        clipLoveYourself.open(audioInputStreamLoveYourself);
					class LoveYourselfListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
					        clipLoveYourself.start();
    						label.setText("Playing: \"Love Yourself\"");
						}
					}
					ActionListener listenerLoveYourself = new LoveYourselfListener();
					buttonLoveYourself.addActionListener(listenerLoveYourself);
					panel.add(buttonLoveYourself);

				JButton buttonNeo = new JButton("Play \"Neopolitan Dreams (Remix)\"");
					buttonNeo.setBounds(100, 625, 300, 50); //(x, y, button width, button height)
			        AudioInputStream audioInputStreamNeo = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/Neopolitan Dreams (Remix).wav").getAbsoluteFile());
			        AudioFormat formatNeo = audioInputStreamNeo.getFormat();
			        DataLine.Info infoNeo = new DataLine.Info(Clip.class, formatNeo);
			        Clip clipNeo = (Clip) AudioSystem.getLine(infoNeo);
			        clipNeo.open(audioInputStreamNeo);
					class NeoListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
					        clipNeo.start();    				
							label.setText("Playing: \"Neopolitan Dreams (Remix)\"");
						}
					}
					ActionListener listenerNeo = new NeoListener();
					buttonNeo.addActionListener(listenerNeo);
					panel.add(buttonNeo);

				JButton buttonNoPressure = new JButton("Play \"No Pressure\"");
					buttonNoPressure.setBounds(100, 700, 300, 50); //(x, y, button width, button height)
			        AudioInputStream audioInputStreamNoPressure = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/No Pressure (feat. Big Sean).wav").getAbsoluteFile());
			        AudioFormat formatNoPressure = audioInputStreamNoPressure.getFormat();
			        DataLine.Info infoNoPressure = new DataLine.Info(Clip.class, formatNoPressure);
			        Clip clipNoPressure = (Clip) AudioSystem.getLine(infoNoPressure);
			        clipNoPressure.open(audioInputStreamNoPressure);
					class NoPressureListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
					        clipNoPressure.start();
							label.setText("Playing: \"No Pressure\"");
						}
					}
					ActionListener listenerNoPressure = new NoPressureListener();
					buttonNoPressure.addActionListener(listenerNoPressure);
					panel.add(buttonNoPressure);

				JButton buttonRadio = new JButton("Play \"Radioactive\"");
					buttonRadio.setBounds(100, 775, 300, 50); //(x, y, button width, button height)
			        AudioInputStream audioInputStreamRadio = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/Radioactive.wav").getAbsoluteFile());
			        AudioFormat formatRadio = audioInputStreamRadio.getFormat();
			        DataLine.Info infoRadio = new DataLine.Info(Clip.class, formatRadio);
			        Clip clipRadio = (Clip) AudioSystem.getLine(infoRadio);
			        clipRadio.open(audioInputStreamRadio);
					class RadioListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
						    clipRadio.start();
    						label.setText("Playing: \"Radioactive\"");
						}
					}
					ActionListener listenerRadio = new RadioListener();
					buttonRadio.addActionListener(listenerRadio);
					panel.add(buttonRadio);


				JButton buttonRemember = new JButton("Play \"Remember The Name\"");
					buttonRemember.setBounds(500, 100, 300, 50); //(x, y, button width, button height)
			        AudioInputStream audioInputStreamRemember = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/Remember The Name.wav").getAbsoluteFile());
			        AudioFormat formatRemember = audioInputStreamRemember.getFormat();
			        DataLine.Info infoRemember = new DataLine.Info(Clip.class, formatRemember);
			        Clip clipRemember = (Clip) AudioSystem.getLine(infoRemember);
			        clipRemember.open(audioInputStreamRemember);
					class RememberListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
						    clipRemember.start();
    						label.setText("Playing: \"Remember The Name\"");
						}
					}
					ActionListener listenerRemember = new RememberListener();
					buttonRemember.addActionListener(listenerRemember);
					panel.add(buttonRemember);

				JButton buttonSee = new JButton("Play \"See You Again\"");
					buttonSee.setBounds(500, 175, 300, 50); //(x, y, button width, button height)
			        AudioInputStream audioInputStreamSee = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/See You Again (feat. Charlie Puth).wav").getAbsoluteFile());
			        AudioFormat formatSee = audioInputStreamSee.getFormat();
			        DataLine.Info infoSee = new DataLine.Info(Clip.class, formatSee);
			        Clip clipSee = (Clip) AudioSystem.getLine(infoSee);
			        clipSee.open(audioInputStreamSee);
					class SeeListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
					        clipSee.start();
							label.setText("Playing: \"See You Again\"");
						}
					}
					ActionListener listenerSee = new SeeListener();
					buttonSee.addActionListener(listenerSee);
					panel.add(buttonSee);

				JButton buttonSorry = new JButton("Play \"Sorry\"");
					buttonSorry.setBounds(500, 250, 300, 50); //(x, y, button width, button height)
			        AudioInputStream audioInputStreamSorry = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/Sorry.wav").getAbsoluteFile());
			        AudioFormat formatSorry = audioInputStreamSorry.getFormat();
			        DataLine.Info infoSorry = new DataLine.Info(Clip.class, formatSorry);
			        Clip clipSorry = (Clip) AudioSystem.getLine(infoSorry);
			        clipSorry.open(audioInputStreamSorry);
					class SorryListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
					        clipSorry.start();
							label.setText("Playing: \"Sorry\"");
						}
					}
					ActionListener listenerSorry = new SorryListener();
					buttonSorry.addActionListener(listenerSorry);
					panel.add(buttonSorry);

				JButton buttonMan = new JButton("Play \"The Man\"");
					buttonMan.setBounds(500, 325, 300, 50); //(x, y, button width, button height)
			        AudioInputStream audioInputStreamMan = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/The Man.wav").getAbsoluteFile());
			        AudioFormat formatMan = audioInputStreamMan.getFormat();
			        DataLine.Info infoMan = new DataLine.Info(Clip.class, formatMan);
			        Clip clipMan = (Clip) AudioSystem.getLine(infoMan);
			        clipMan.open(audioInputStreamMan);
					class ManListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
					        clipMan.start();
							label.setText("Playing: \"The Man\"");
						}
					}
					ActionListener listenerMan = new ManListener();
					buttonMan.addActionListener(listenerMan);
					panel.add(buttonMan);

				JButton buttonEpisode = new JButton("Play \"The Next Episode (Remix)\"");
					buttonEpisode.setBounds(500, 400, 300, 50); //(x, y, button width, button height)
			        AudioInputStream audioInputStreamEpisode = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/The Next Episode (San Holo Remix).wav").getAbsoluteFile());
			        AudioFormat formatEpisode = audioInputStreamEpisode.getFormat();
			        DataLine.Info infoEpisode = new DataLine.Info(Clip.class, formatEpisode);
			        Clip clipEpisode = (Clip) AudioSystem.getLine(infoEpisode);
			        clipEpisode.open(audioInputStreamEpisode);
					class EpisodeListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
					        clipEpisode.start();
							label.setText("Playing: \"The Next Episode (Remix)\"");
						}
					}
					ActionListener listenerEpisode = new EpisodeListener();
					buttonEpisode.addActionListener(listenerEpisode);
					panel.add(buttonEpisode);

				JButton buttonWake = new JButton("Play \"Wake Me Up\"");
					buttonWake.setBounds(500, 475, 300, 50); //(x, y, button width, button height)
			        AudioInputStream audioInputStreamWake = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/Wake Me Up.wav").getAbsoluteFile());
			        AudioFormat formatWake = audioInputStreamWake.getFormat();
			        DataLine.Info infoWake = new DataLine.Info(Clip.class, formatWake);
			        Clip clipWake = (Clip) AudioSystem.getLine(infoWake);
			        clipWake.open(audioInputStreamWake);
					class WakeListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
					        clipWake.start();
							label.setText("Playing: \"Wake Me Up\"");
						}
					}
					ActionListener listenerWake = new WakeListener();
					buttonWake.addActionListener(listenerWake);
					panel.add(buttonWake);

				JButton buttonWhatRe = new JButton("Play \"What Do You Mean (Remix)\"");
					buttonWhatRe.setBounds(500, 550, 300, 50); //(x, y, button width, button height)
			        AudioInputStream audioInputStreamWhatRe = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/What Do You Mean (Remix).wav").getAbsoluteFile());
			        AudioFormat formatWhatRe = audioInputStreamWhatRe.getFormat();
			        DataLine.Info infoWhatRe = new DataLine.Info(Clip.class, formatWhatRe);
			        Clip clipWhatRe = (Clip) AudioSystem.getLine(infoWhatRe);
			        clipWhatRe.open(audioInputStreamWhatRe);
					class WhatReListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
					        clipWhatRe.start();
							label.setText("Playing: \"What Do You Mean (Remix)\"");
						}
					}
					ActionListener listenerWhatRe = new WhatReListener();
					buttonWhatRe.addActionListener(listenerWhatRe);
					panel.add(buttonWhatRe);

				JButton buttonWhat = new JButton("Play \"What Do You Mean\"");
					buttonWhat.setBounds(500, 625, 300, 50); //(x, y, button width, button height)
			        AudioInputStream audioInputStreamWhat = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/What Do You Mean.wav").getAbsoluteFile());
			        AudioFormat formatWhat = audioInputStreamWhat.getFormat();
			        DataLine.Info infoWhat = new DataLine.Info(Clip.class, formatWhat);
			        Clip clipWhat = (Clip) AudioSystem.getLine(infoWhat);
			        clipWhat.open(audioInputStreamWhat);
					class WhatListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
					        clipWhat.start();
							label.setText("Playing: \"What Do You Mean\"");
						}
					}
					ActionListener listenerWhat = new WhatListener();
					buttonWhat.addActionListener(listenerWhat);
					panel.add(buttonWhat);

				JButton buttonWhere = new JButton("Play \"Where Are U Now\"");
					buttonWhere.setBounds(500, 700, 300, 50); //(x, y, button width, button height)
			        AudioInputStream audioInputStreamWhere = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/Where Are U Now.wav").getAbsoluteFile());
			        AudioFormat formatWhere = audioInputStreamWhere.getFormat();
			        DataLine.Info infoWhere = new DataLine.Info(Clip.class, formatWhere);
			        Clip clipWhere = (Clip) AudioSystem.getLine(infoWhere);
			        clipWhere.open(audioInputStreamWhere);
					class WhereListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
					        clipWhere.start();
							label.setText("Playing: \"Where Are U Now\"");
						}
					}
					ActionListener listenerWhere = new WhereListener();
					buttonWhere.addActionListener(listenerWhere);
					panel.add(buttonWhere);

				JButton buttonBit = new JButton("Play \"8-Bit Sample\"");
					buttonBit.setBounds(500, 775, 300, 50); //(x, y, button width, button height)
			        AudioInputStream audioInputStreamBit = AudioSystem.getAudioInputStream(new File("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/MusicWAV/8-Bit-Noise-1.wav").getAbsoluteFile());
			        AudioFormat formatBit = audioInputStreamBit.getFormat();
			        DataLine.Info infoBit = new DataLine.Info(Clip.class, formatBit);
			        Clip clipBit = (Clip) AudioSystem.getLine(infoBit);
			        clipBit.open(audioInputStreamBit);
					class BitListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
					        clipBit.start();
							label.setText("Playing: \"8-Bit Sample\"");
						}
					}
					ActionListener listenerBit = new BitListener();
					buttonBit.addActionListener(listenerBit);
					panel.add(buttonBit);

				JButton stop = new JButton(new ImageIcon("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/stop.png"));
    				//stop.setIcon("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/stop.bmp");
					/*
					try
					{
						Image img = ImageIO.read(getClass().getResource("C:/Users/saket/Git/CSWork/JAVA/Projects/JukeboxCreator/stop.bmp"));
    				}
    				catch (Exception ex)
    				{
    					System.out.println(ex);
    				}
    				*/
					stop.setBounds(750, 860, 25, 25);
					class StopListener implements ActionListener
					{
						public void actionPerformed(ActionEvent event)
						{
							clipAll.stop();
							clipBoulevard.stop();
							clipBit.stop();
							clipEpisode.stop();
							clipForever.stop();
							clipIrid.stop();
							clipLove.stop();
							clipLoveYourself.stop();
							clipMan.stop();
							clipNeo.stop();
							clipNoPressure.stop();
							clipRadio.stop();
							clipRemember.stop();
							clipSeconds.stop();
							clipSee.stop();
							clipSorry.stop();
							clipWake.stop();
							clipWhat.stop();
							clipWhatRe.stop();
							clipWhere.stop();
							label.setText("Music stopped");
						}
					}
					ActionListener listenerStop = new StopListener();
					stop.addActionListener(listenerStop);
					panel.add(stop);

			frame.add(panel);
			frame.setSize(FRAME_WID, FRAME_HEI);
			frame.setTitle("Chris and Saket's Jammin' Jukebox");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
	}
}