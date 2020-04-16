import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button5 implements ActionListener {
	// ActionListener will wait for tap and then pull ActionEvente below
	public void actionPerformed(ActionEvent e) {
		// Button 5 will eventually call the quiz class to pull the quiz function.
		// this quiz was mostly made by Breanna 
		Quiz q = new Quiz() ; 
			 q.questionare() ;

	}

}
