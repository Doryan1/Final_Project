//https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html
//import java.util.Random;

import javax.swing.*;

public class Quiz {
	
	public void questionare() {
		int y = 0 ; 
//		@SuppressWarnings("unused")
//		int n = 0 ; 
		int response = JOptionPane.YES_NO_CANCEL_OPTION ; 
//		String out2[] = 
//			{ "out2 1" , "out2 2" , "out2 3" , "out2 4" , "out2 5" , "out2 6" , "out2 7" , "out2 8" , "out2 9" , "out2 10"};
//		String out1[] = 
//			{ "out1 1" , "out1 2" , "out1 3" , "out1 4" , "out1 5" , "out1 6" , "out1 7" , "out1 8" , "out1 9" , "out1 10"} ;
//		String out3 [] = 
//			{ "out3 1" , "out3 2" , "out3 3" , "out3 4" , "out3 5" , "out3 6" , "out3 7" , "out3 8" , "out3 9" , "out3 10"};
 
		// Breanna came up with the questions to ask to determine the joke
		// Group decided the order it will go into 
		// Doryan, Cameron in process of of working on quiz implementation. 
		//all 5 questions might not show. Maybe 2-3 question will actually give the output
		
		int mes1 = JOptionPane.showConfirmDialog(null, "Are you in a happy mood?", null , response) ;
			if (mes1 == JOptionPane.YES_OPTION) {
				y++ ;
				JOptionPane.showMessageDialog(null, "Yes");
			}
			else if (mes1 == JOptionPane.NO_OPTION) {
//				n++ ; 
				JOptionPane.showMessageDialog(null, "No");
			}
			else if (mes1 == JOptionPane.CANCEL_OPTION) {
				JOptionPane.showMessageDialog(null, "Cancel");
				System.exit(0);
			}
			
		int mes2 = JOptionPane.showConfirmDialog(null, "Do you like to hear short or long jokes?", null, response) ;
			if (mes2 == JOptionPane.YES_OPTION) {
				y++ ;
				JOptionPane.showMessageDialog(null, "Yes");
			}
			else if (mes2 == JOptionPane.NO_OPTION) {
//				n++ ; 
				JOptionPane.showMessageDialog(null, "No");
			}
			else if (mes2 == JOptionPane.CANCEL_OPTION) {
				JOptionPane.showMessageDialog(null, "Cancel");
				System.exit(0);
			}
		
		int mes3 = JOptionPane.showConfirmDialog(null, "Are you a male or female?", null , response) ;
			if (mes3 == JOptionPane.YES_OPTION) {
				y++ ;
				JOptionPane.showMessageDialog(null, "Yes");
			}
			else if (mes3 == JOptionPane.NO_OPTION) {
//				n++ ; 
				JOptionPane.showMessageDialog(null, "No");
			}
			else if (mes3 == JOptionPane.CANCEL_OPTION) {
				JOptionPane.showMessageDialog(null, "Cancel");
				System.exit(0); 
			}
			
		int mes4 = JOptionPane.showConfirmDialog(null, "Are you above the age of 30? ", null , response) ;
			if (mes4 == JOptionPane.YES_OPTION) {
				y++ ;
				JOptionPane.showMessageDialog(null, "Yes");
			}
			else if (mes4 == JOptionPane.NO_OPTION) {
//				n++ ; 
				JOptionPane.showMessageDialog(null, "No");
			}
			else if (mes4 == JOptionPane.CANCEL_OPTION) {
				JOptionPane.showMessageDialog(null, "Cancel");
				System.exit(0); 
			}
		
		int mes5 = JOptionPane.showConfirmDialog(null, "Do you have children?", null , response) ; 
			if (mes5 == JOptionPane.YES_OPTION) {
				y++ ;
				JOptionPane.showMessageDialog(null, "Yes");
			}
			else if (mes5 == JOptionPane.NO_OPTION) {
//				n++ ; 
				JOptionPane.showMessageDialog(null, "No");
			}
			else if (mes5 == JOptionPane.CANCEL_OPTION) {
				JOptionPane.showMessageDialog(null, "Cancel");
				System.exit(0);
			}
		
		
//		JOptionPane.showMessageDialog(null, y);
		
		
	while (y > 0) {
		JOptionPane.showMessageDialog(null , "Here is your custom joke") ;
		
		if (y==1) {
			JOptionPane.showMessageDialog(null , "You choose one yes and 4 no") ;
			System.exit(0);
		}
		
		else if (y==2) {
			JOptionPane.showMessageDialog(null , "You choose two yes and 3 no") ;
			System.exit(0);
		}
		
		else if (y==3) {
			JOptionPane.showMessageDialog(null , "You choose three yes and 2 no") ;
			System.exit(0);
		}
		
		else if (y==4) {
			JOptionPane.showMessageDialog(null , "You choose four yes and 1 no ") ;
			System.exit(0);
		}
		
		else {
			JOptionPane.showMessageDialog(null , "five") ;
			System.exit(0);
		}
		
//		while (y>=1) {
//			if (y==1) {
//				if(n==4) {
//				JOptionPane.showMessageDialog(null , "You choose one yes and 4 no") ;
//				System.exit(0);
//				}
//			}
//			else if (y==2) {
//				if (n==3) {
//				JOptionPane.showMessageDialog(null , "You choose two yes and 3 no") ;
//				System.exit(0);
//				}
//			}
//			else if (y==3) {
//				if (n==2) {
//				JOptionPane.showMessageDialog(null , "You choose three yes and 2 no") ;
//				System.exit(0);
//				}
//			}
//			else if (y==4) {
//				if (n==1) {
//				JOptionPane.showMessageDialog(null , "You choose four yes and 1 no ") ;
//				System.exit(0);
//				}
//			}
//			else {
//				JOptionPane.showMessageDialog(null , "5") ;
//				// this makes one of the jokes from the string to come out randomly
//				JOptionPane.showMessageDialog(null, out1[new Random().nextInt(out1.length)]);
//				System.exit(0);
//			}
		}
	}
}
			
		// counts the responses the user gives and will show a different category for how many yes's and no's counted.
		//could make separate joke classes , 
		//could use if else statements 
		
		
