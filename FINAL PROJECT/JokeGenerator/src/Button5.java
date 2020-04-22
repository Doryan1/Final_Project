import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.* ; 

public class Button5 implements ActionListener {
	// ActionListener will wait for tap and then pull ActionEvente below
	public void actionPerformed(ActionEvent e) {
		// Button 5 will eventually call the quiz class to pull the quiz function.
		// this quiz was mostly made by Breanna 
		sound("clap1.wav") ;
		Quiz q = new Quiz() ; 
			 q.questionare() ;

	}
	// from a tutorial 
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
