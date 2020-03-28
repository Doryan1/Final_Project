import java.util.Random;
import javax.swing.JOptionPane;

public class random {
		public String all(){
			String aj[] = {
					"I have a few jokes about unemployed people, but none of them work " ,
					"When life gives you melons, you're dyslexic" ,
					"I Renamed my iPod The Titanic, so when I plug it in, it says “The Titanic is syncing.”" ,
					"I lost my job at the bank on my very first day. A woman asked me to check her balance, so I pushed her over" ,
					"Did you hear about the guy whose whole left side was cut off? He’s all right now" ,
					"What do you call a bee that can’t make up its mind?\n A maybe" ,
					"A mean crook going down stairs = A condescending con, descending" ,
					"My dad, unfortunately, passed away when we couldn’t remember his blood type… His last words to us were, “Be positive!”" ,
					"Which country’s capital has the fastest-growing population? Ireland. Every day it’s Dublin." ,
					"The guy who invented the door knocker got a no-bell prize" ,
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
					"What do you call someone who refuses to fart in public?\n A private tutor." ,
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
			//JOptionPane.showMessageDialog(null, "Click ok to see a Random Pun") ; 
			JOptionPane.showMessageDialog(null, aj[new Random().nextInt(aj.length)]);
			return null;
		}
}
