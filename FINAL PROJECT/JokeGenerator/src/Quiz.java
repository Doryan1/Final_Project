//https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html
//import java.util.Random;

import java.util.Random;

import javax.swing.*;

public class Quiz {
	
	public void questionare() {
		window win = new window() ;
		int y = 0 ; 
//		@SuppressWarnings("unused")
		int n = 0 ; 
		int response = JOptionPane.YES_NO_CANCEL_OPTION ; 
		String yes2 [] = 
			{ "out2 1" , "out2 2" , "out2 3" , "out2 4" , "out2 5" , "out2 6" , "out2 7" , "out2 8" , "out2 9" , "out2 10"};
		String yes1 [] = 
			{ "out1 1" , "out1 2" , "out1 3" , "out1 4" , "out1 5" , "out1 6" , "out1 7" , "out1 8" , "out1 9" , "out1 10"} ;
		String yes3 [] = 
			{ "out3 1" , "out3 2" , "out3 3" , "out3 4" , "out3 5" , "out3 6" , "out3 7" , "out3 8" , "out3 9" , "out3 10"};
		String yes4 [] = 
			{ "out4 1" , "out4 2" , "out4 3" , "out4 4" , "out4 5" , "out4 6" , "out4 7" , "out4 8" , "out4 9" , "out4 10"};
		String yes5 [] = 
			{ "out5 1" , "out5 2" , "out5 3" , "out5 4" , "out5 5" , "out5 6" , "out5 7" , "out5 8" , "out5 9" , "out5 10"};
		// Breanna came up with the questions to ask to determine the joke
		// Group decided the order it will go into 
		// Doryan, Cameron in process of of working on quiz implementation. 
		//all 5 questions might not show. Maybe 2-3 question will actually give the output
		
		int mes1 = JOptionPane.showConfirmDialog(null, "Are you in a happy mood?", null , response) ;
			if (mes1 == JOptionPane.YES_OPTION) 
			{
				y++ ;
			}
			else if (mes1 == JOptionPane.NO_OPTION) 
			{
				n++ ; 
			}
			else if (mes1 == JOptionPane.CANCEL_OPTION) 
			{
				System.exit(0);
			}
			
		int mes2 = JOptionPane.showConfirmDialog(null, "Do you like to hear short or long jokes?", null, response) ;
			if (mes2 == JOptionPane.YES_OPTION) 
			{
				y++ ; 
			}
			else if (mes2 == JOptionPane.NO_OPTION) 
			{
				n++ ; 
			}
			else if (mes2 == JOptionPane.CANCEL_OPTION) 
			{
				System.exit(0);
			}
		
		int mes3 = JOptionPane.showConfirmDialog(null, "Are you a female(click no) or male (click yes) ?", null , response) ;
			if (mes3 == JOptionPane.YES_OPTION) 
			{
				y++ ;
			}
			else if (mes3 == JOptionPane.NO_OPTION) 
			{ 
				n++ ; 
			}
			else if (mes3 == JOptionPane.CANCEL_OPTION) 
			{
				System.exit(0); 
			}
			
		int mes4 = JOptionPane.showConfirmDialog(null, "Are you above the age of 30? ", null , response) ;
			if (mes4 == JOptionPane.YES_OPTION) 
			{
				y++ ;
			}
			else if (mes4 == JOptionPane.NO_OPTION) 
			{
				n++ ; 
			}
			else if (mes4 == JOptionPane.CANCEL_OPTION)
			{
				System.exit(0); 
			}
		
		int mes5 = JOptionPane.showConfirmDialog(null, "Do you have children?", null , response) ; 
			if (mes5 == JOptionPane.YES_OPTION) 
			{
				y++ ;;
			}
			else if (mes5 == JOptionPane.NO_OPTION) 
			{
				n++ ;
			}
			else if (mes5 == JOptionPane.CANCEL_OPTION) 
			{
				System.exit(0);
			}
		
		// Displays the amount of Yes, and No responses 
//		JOptionPane.showMessageDialog(null, y);
//		JOptionPane.showMessageDialog(null, n);
		
		
	while (y > 0) {
		JOptionPane.showMessageDialog(null , "Here is your Custom Joke") ;
		
		if (y==1 && n==4) {
//			JOptionPane.showMessageDialog(null , "You choose 1 yes and 4 no") ;
			JOptionPane.showMessageDialog(null, yes1[new Random().nextInt(yes1.length)]);
			break ;
		}
		
		else if (y==2 && n==3) {
//			JOptionPane.showMessageDialog(null , "You choose 2 yes and 3 no") ;
			JOptionPane.showMessageDialog(null, yes2[new Random().nextInt(yes2.length)]);
			break ;
		}
		
		else if (y==3 && n==2) {
//			JOptionPane.showMessageDialog(null , "You choose 3 yes and 2 no") ;
			JOptionPane.showMessageDialog(null, yes3[new Random().nextInt(yes3.length)]);
			break ;
		}
		
		else if (y==4 && n==1) {
//			JOptionPane.showMessageDialog(null , "You choose 4 yes and 1 no ") ;
			JOptionPane.showMessageDialog(null, yes4[new Random().nextInt(yes4.length)]);
			break ;
		}
		
		else if (y==5 && n==0) {
//			JOptionPane.showMessageDialog(null , "You choose 5 yes and 0 no ") ;
			JOptionPane.showMessageDialog(null, yes5[new Random().nextInt(yes5.length)]);
			break ; 
		
			}
		} 
	}
}

		
		// counts the responses the user gives and will show a different category for how many yes's and no's counted.
		//could make separate joke classes , 
		//could use if else statements 
		
		
