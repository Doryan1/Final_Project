
import javax.swing.* ;

public class window {
	public static void main(String[] args) {
		JFrame f = new JFrame("The Joke Generator") ; 
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		f.setSize(150, 170) ; 
		f.setLocationRelativeTo(null);
		JPanel panel = new JPanel() ; 
		f.add(panel) ; 
		
		
		JButton b1 = new JButton("Puns") ; 
		panel.add(b1) ; 
		b1.addActionListener(new Button1()) ;
		
		JButton b2 = new JButton("Dad Jokes") ; 
		panel.add(b2) ;
		b2.addActionListener(new Button2()) ;
		
		JButton b3 = new JButton("Funny Jokes") ; 
		panel.add(b3) ;
		b3.addActionListener(new Button3()) ;
		
		JButton b4 = new JButton("Any Joke") ; 
		panel.add(b4) ;
		b4.addActionListener(new Button4()) ; 
	}
}