// https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html
// document for the yes no cancel option 

import java.io.File;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class Quiz {
	
	public void questionare() {
		int y = 0 ; 
		int n = 0 ;  
		int response = JOptionPane.YES_NO_CANCEL_OPTION ; 
	
		// Breanna came up with the questions to ask to determine the joke
		// Group decided the order it will go into 
		// Doryan, Cameron in process of of working on quiz implementation. 
		//all 5 questions might not show. Maybe 2-3 question will actually give the output
		
		int mes1 = JOptionPane.showConfirmDialog(null, "Are you in a happy mood?", null , response) ;
			if (mes1 == JOptionPane.YES_OPTION) 
			{
				sound("clap1.wav") ;
				y++ ;
			}
			else if (mes1 == JOptionPane.NO_OPTION) 
			{
				sound("clap1.wav") ;
				n++ ; 
			}
			else if (mes1 == JOptionPane.CANCEL_OPTION) 
			{
				sound("clap1.wav") ;
				System.exit(0);
			}
			
			
		int mes2 = JOptionPane.showConfirmDialog(null, "Do you like to hear short (no) or long jokes(yes)?", null, response) ;
			if (mes2 == JOptionPane.YES_OPTION) 
			{
				sound("clap1.wav") ;
				y++ ; 
			}
			else if (mes2 == JOptionPane.NO_OPTION) 
			{
				sound("clap1.wav") ;
				n++ ; 
			}
			else if (mes2 == JOptionPane.CANCEL_OPTION) 
			{
				sound("clap1.wav") ;
				System.exit(0);
			}
		
			
		int mes3 = JOptionPane.showConfirmDialog(null, "if a tree falls in a forest, and no one is around, does it make a sound?", null , response) ;
			if (mes3 == JOptionPane.YES_OPTION) 
			{
				sound("clap1.wav") ;
				y++ ;
			}
			else if (mes3 == JOptionPane.NO_OPTION) 
			{ 
				sound("clap1.wav") ;
				n++ ; 
			}
			else if (mes3 == JOptionPane.CANCEL_OPTION) 
			{
				sound("clap1.wav") ;
				System.exit(0); 
			}
			
			
		int mes4 = JOptionPane.showConfirmDialog(null, "Are you above the age of 30? ", null , response) ;
			if (mes4 == JOptionPane.YES_OPTION) 
			{
				sound("clap1.wav") ;
				y++ ;
			}
			else if (mes4 == JOptionPane.NO_OPTION) 
			{
				sound("clap1.wav") ;
				n++ ; 
			}
			else if (mes4 == JOptionPane.CANCEL_OPTION)
			{
				sound("clap1.wav") ;
				System.exit(0); 
			}
		
			
		int mes5 = JOptionPane.showConfirmDialog(null, "Do you have children?", null , response) ; 
			if (mes5 == JOptionPane.YES_OPTION) 
			{
				sound("clap1.wav") ;
				y++ ;;
			}
			else if (mes5 == JOptionPane.NO_OPTION) 
			{
				sound("clap1.wav") ;
				n++ ;
			}
			else if (mes5 == JOptionPane.CANCEL_OPTION) 
			{
				sound("clap1.wav") ;
				System.exit(0);
			}	
			
			String yes1 [] = { 
					"I thought my neighbours were lovely people. Then they went and put a password on their wi-fi" ,
					"Q: What starts with E, ends with E, and has only one letter in it? \nA: An envelope" , 
					"When does a joke become a dad joke? When it becomes apparent!" , 
					"How do you spot a blind man on a nude beach? It’s not hard" , 
					"Why did the man fall down the well? Because he couldn’t see that well."  
					} ;
			String yes2 [] = { 
					"Why did the ketchup blush? He saw the salad dressing." ,
					"Why does Santa Claus have such a big sack?\n He only comes once a year." , 
					"Dogs can’t operate MRI machines, but catscan." , 
					"How do you make holy water? You boil the hell out of it. " , 
					"If a child refuses to sleep during nap time, are they guilty of resisting a rest?" , 
					};
			String yes3 [] = { 
					"out3 1" , 
					"out3 2" , 
					"out3 3" , 
					"out3 4" , 
					"out3 5" 
					};
			String yes4 [] = { 
					"out4 1" ,
					"out4 2" ,
					"out4 3" , 
					"out4 4" ,
					"out4 5"
					};
			String yes5 [] = { 
					"out5 1" ,
					"out5 2" ,
					"out5 3" ,
					"out5 4" ,
					"out5 5" 
					};
		//loop to count the y and n integers and display a joke based on its count
	while (y > 0) {
		JOptionPane.showMessageDialog(null , "Here is your Custom Joke") ;
			sound("clap3.wav"); 
			
			if (y==1 && n==4) 
			{
				JOptionPane.showMessageDialog(null, yes1[new Random().nextInt(yes1.length)]);
				break ;
			}
			else if (y==2 && n==3) {
				JOptionPane.showMessageDialog(null, yes2[new Random().nextInt(yes2.length)]);
				break ;
			}
			else if (y==3 && n==2) {
				JOptionPane.showMessageDialog(null, yes3[new Random().nextInt(yes3.length)]);
				break ;
			}
			else if (y==4 && n==1) {
				JOptionPane.showMessageDialog(null, yes4[new Random().nextInt(yes4.length)]);
				break ;
			}
			else if (y==5 && n==0) {
				JOptionPane.showMessageDialog(null, yes5[new Random().nextInt(yes5.length)]);
				break ;
			}
	}
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

		
		// counts the responses the user gives and will show a different category for how many yes's and no's counted.
		//could make separate joke classes , 
		//could use if else statements 
		
		
