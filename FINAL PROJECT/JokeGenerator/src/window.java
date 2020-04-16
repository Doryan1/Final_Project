//Assistance List
// Doryan Created the window that the user would first see when the application is opened
// Doryan , Brendon , Adam worked on working on making the window better
//everyone in the group a

//plan to make it more customizable by drawing out each button instead of using the default one
import javax.swing.* ;

public class window {
	public static void main(String[] args) {
		//setting up how JFrame will be set up
		JFrame f = new JFrame("The Joke Generator") ; 
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		f.setSize(187, 200) ; 
		f.setLocationRelativeTo(null); // makes the application start in the middle of the screen
		JPanel panel = new JPanel() ; 
		f.add(panel) ; // creates the panel the buttons will sit on
		
		// This is the button layout and what order they will be in. b1 will be first and b5 will be last
		JButton b1 = new JButton("Puns") ; // pulls the pun class
		panel.add(b1) ; 
		b1.addActionListener(new Button1()) ;
		
		JButton b2 = new JButton("Dad Jokes") ; // pulls the dad class
		panel.add(b2) ;
		b2.addActionListener(new Button2()) ;
		
		JButton b3 = new JButton("Funny Jokes") ; // pulls the other class
		panel.add(b3) ;
		b3.addActionListener(new Button3()) ;
		
		JButton b4 = new JButton("Any Joke") ; //pulls the random class(all of the classes put together)
		panel.add(b4) ;
		b4.addActionListener(new Button4()) ; 
		
		JButton b5 = new JButton("Take a Quiz For a Joke") ; // will pull the quiz class for the user to answer 
		panel.add(b5) ; 
		b5.addActionListener(new Button5());
	}
}