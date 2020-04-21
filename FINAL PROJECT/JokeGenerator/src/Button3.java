import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Button3 implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		sound("funnyJokes.wav") ;
		other o = new other() ;
		      o.otherJokes() ; 


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
