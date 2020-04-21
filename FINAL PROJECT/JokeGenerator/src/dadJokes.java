import javax.swing.*;
import java.util.* ; 

public class dadJokes {
	public String dads(){
		String dad[] = {
				// Kristiana compiled all of the jokes in this section (more has to be added)
				"Today, my son asked \"Can I have a book mark?\" and I burst into tears. \n11 years old and he still doesn't know my name is Brian." ,
				"If you see a robbery at an Apple Store does that make you an iWitness?" ,
				"What did the pirate say on his 80th birthday?\n AYE MATEY " ,
				"Why couldn't the bike standup by itself?\n It was two tired." ,
				"I just watched a documentary about beavers.\n It was the best dam show I ever saw!" ,
				"I was interrogated over the theft of a cheese toastie.\n Man, they really grilled me." ,
				"How many tickles does it take to make an octopus laugh?\nTen-tickles." ,
				"5/4 of people admit that they’re bad with fractions." ,
				"KID: Dad, make me a sandwich!\n DAD: Poof, you’re a sandwich!" ,
				"NURSE: \"Blood type?\nDAD: \"Red." 
		} ;
		//JOptionPane.showMessageDialog(null, "Click okay to see a Random Dad Joke") ; 
		JOptionPane.showMessageDialog(null, dad[new Random().nextInt(dad.length)]) ;
		return null;
		
	}

}
