import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Button1 implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		sound("punJokes.wav") ; 
		puns puno = new puns() ;
			 puno.punJokes() ; 
	}
	
	public void sound(String soundName) {
		   try {
		    AudioInputStream input = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile( ));
		    Clip clip = AudioSystem.getClip( );
		    clip.open(input);
		    clip.start( );
		   }
		   catch(Exception ex) {
		     System.out.println("Error with playing sound.");
		     ex.printStackTrace( );
		   }
		}

	}

