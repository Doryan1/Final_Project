import java.util.Random;

import javax.swing.JOptionPane;

public class puns {
	public String punJokes(){
		String pj[] = {
				"I have a few jokes about unemployed people, but none of them work " ,
				"When life gives you melons, you're dyslexic" ,
				"I Renamed my iPod The Titanic, so when I plug it in, it says “The Titanic is syncing.”" ,
				"I lost my job at the bank on my very first day. A woman asked me to check her balance, so I pushed her over" ,
				"Did you hear about the guy whose whole left side was cut off? He’s all right now" ,
				"What do you call a bee that can’t make up its mind?\n A maybe" ,
				"A mean crook going down stairs = A condescending con, descending" ,
				"My dad, unfortunately, passed away when we couldn’t remember his blood type… His last words to us were, “Be positive!”" ,
				"Which country’s capital has the fastest-growing population? Ireland. Every day it’s Dublin." ,
				"The guy who invented the door knocker got a no-bell prize" 
		} ;
		//JOptionPane.showMessageDialog(null, "Click ok to see a Random Pun") ; 
		JOptionPane.showMessageDialog(null, pj[new Random().nextInt(pj.length)]);
		return null;
	}

}