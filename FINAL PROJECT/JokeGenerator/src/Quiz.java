//https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html
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
			if (mes1 == JOptionPane.YES_OPTION) {
				//JOptionPane.showMessageDialog(null, "Nice Choice");
				y++ ;
			}
			else if (mes1 == JOptionPane.NO_OPTION) {
				n++ ; 
			}
			else
				System.exit(0);
		
		int mes2 = JOptionPane.showConfirmDialog(null, "Do you like to hear short or long jokes?", null, response) ;
			if (mes2 == JOptionPane.YES_OPTION) {
				//JOptionPane.showMessageDialog(null, "Nice Choice");
				y++ ;
			}
			else if (mes2 == JOptionPane.NO_OPTION) {
				n++ ; 
			}
			else
				System.exit(0);
		
		int mes3 = JOptionPane.showConfirmDialog(null, "Are you a male or female?", null , response) ;
			if (mes3 == JOptionPane.YES_OPTION) {
				//JOptionPane.showMessageDialog(null, "Nice Choice");
				y++ ;
			}
			else if (mes3 == JOptionPane.NO_OPTION) {
				n++ ; 
			}
			else
				System.exit(0); 
			
		int mes4 = JOptionPane.showConfirmDialog(null, "Are you above the age of 30? ", null , response) ;
			if (mes4 == JOptionPane.YES_OPTION) {
				//JOptionPane.showMessageDialog(null, "Nice Choice");
				y++ ;
			}
			else if (mes4 == JOptionPane.NO_OPTION) {
				n++ ; 
			}
			else
				System.exit(0); 
		
		int mes5 = JOptionPane.showConfirmDialog(null, "Do you have children?", null , response) ; 
			if (mes5 == JOptionPane.YES_OPTION) {
				//JOptionPane.showMessageDialog(null, "Nice Choice");
				y++ ;
			}
			else if (mes1 == JOptionPane.NO_OPTION) {
				n++ ; 
			}
			else
				System.exit(0);
		
		JOptionPane.showConfirmDialog(null , mes1) ;
		JOptionPane.showConfirmDialog(null , mes2) ;
		JOptionPane.showConfirmDialog(null , mes3) ;
		JOptionPane.showConfirmDialog(null , mes4) ;
		JOptionPane.showConfirmDialog(null , mes5) ;

			
		// counts the responses the user gives and will show a different category for how many yes's and no's counted.
		//could make separate joke classes , 
		//could use if else statements 
		
		
	}
}
