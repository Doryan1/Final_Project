import java.util.Random;

import javax.swing.JOptionPane;

public class other {
	public String otherJokes(){
		String oj[] = {
				"I invented a new word.\n “Plagiarism”",
				"Once my dog ate all the Scrabble tiles.\n For days he kept leaving little messages around the house.",
				"Someone stole my mood ring...I don't know how to feel about it.",
				"What fortnite mode do cows play?\n Cattle Royale!",
				"The past, present and future walked into a bar.\n It was tense.",
				"A lot of people cry when they cut an onion.\n The trick is not to form an emotional bond.",
				"What did one DNA strand say to the other?\nDoes my bum look big in these genes?",
				"What did the grape say when he was pinched?\nNothing, he gave a little wine.",
				"I thought my neighbours were lovely people.\nThen they went and put a password on their wi-fi.",
				"A police recruit was asked during the exam, \"What would you do if you had to arrest your own mother?\nHe said, \"Call for backup.”",
				"Why does Santa Claus have such a big sack?\n He only comes once a year.",
				"Why does Dr. Pepper come in a bottle?\n Because his wife died.",
				"What’s the best part about gardening?\n Getting down and dirty with your hoes.",
				"How is a girlfriend like a laxative?\n They both irritate the shit out of you.",
				"What do you call someone who refuses to fart in public?\n A private tutor."	
		} ;
		//JOptionPane.showMessageDialog(null, "Click ok to see a Random Funny Joke") ; 
		JOptionPane.showMessageDialog(null, oj[new Random().nextInt(oj.length)]);
		return null;
	}

}

