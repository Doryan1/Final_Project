//Assistance List
// Doryan Created the window that the user would first see when the application is opened
// Doryan , Brendon , Adam worked on working on making the window better
//everyone in the group a

//plan to make it more customizable by drawing out each button instead of using the default one
import java.awt.Color;
import java.awt.GridLayout;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.* ;

public class window {
	
	public void winner() {
		//setting up how JFrame will be set up
		JFrame f = new JFrame("The Joke Generator") ; 
		f.setVisible(true);
		f.getContentPane().setBackground(Color.LIGHT_GRAY) ; 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		f.setSize(450, 350) ;
		f.setLayout(new GridLayout(3,3)) ; 
		f.setLocationRelativeTo(null); // makes the application start in the middle of the screen
//		JPanel panel = new JPanel() ; 
//		f.add(panel) ;
		// creates the panel the buttons will sit o
		// This is the button layout and what order they will be in. b1 will be first and b5 will be last
		JButton b1 = new JButton("Puns") ; // pulls the pun class
		f.add(b1) ;
//		panel.add(b1) ; 
		b1.addActionListener(new Button1()) ;
		
		JButton b2 = new JButton("Dad Jokes") ; // pulls the dad class
		f.add(b2) ;
//		panel.add(b2) ;
		b2.addActionListener(new Button2()) ;
		
		JButton b3 = new JButton("Funny Jokes") ; // pulls the other class
		f.add(b3) ;
//		panel.add(b3) ;
		b3.addActionListener(new Button3()) ;
		
		JButton b4 = new JButton("Random") ; //pulls the random class(all of the classes put together)
		f.add(b4) ;
//		panel.add(b4) ;
		b4.addActionListener(new Button4()) ; 
		
		JButton b5 = new JButton("Take a Quiz For a Joke") ; // will pull the quiz class for the user to answer 
		f.add(b5) ;
//		panel.add(b5) ; 
		b5.addActionListener(new Button5());
		
		JButton b6 = new JButton("Do You Like Sounds?") ; 
		f.add(b6) ;
//		panel.add(b6) ; 
		b6.addActionListener(new Button6()) ; 
		
		JButton b7 = new JButton("Exit") ; 
		f.add(b7) ; 
		b7.addActionListener(new Button7()) ; 
		
		sound("narration.wav") ; 
	}
	public static void sound(String soundName) {
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
