import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button1 implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		puns puno = new puns() ;
			 puno.punJokes() ; 
	}
}

