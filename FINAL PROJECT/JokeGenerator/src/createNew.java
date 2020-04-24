import java.awt.event.* ;
import java.io.* ; 
import java.util.* ;

public class createNew implements ActionListener {
	
	public void actionPerformed(ActionEvent E) {
		
		Scanner userIn ; 
		Scanner passIn ; 
		
		ArrayList<String> Usernames = new ArrayList<String>();
    	ArrayList<String> Passwords = new ArrayList<String>();
    	
    	try {
    		userIn = new Scanner(new File("user.txt")) ; 
    		
    		while(userIn.hasNextLine())
    			Usernames.add(userIn.nextLine()) ;
    		
    		passIn = new Scanner(new File("user.txt"));
    		
    		while(passIn.hasNextLine())
    			Passwords.add(passIn.nextLine());
    		
    		
    		login callUP = new login();
    		String User = callUP.getUser();
    		String Pass = callUP.getPass();
    		
    		
    		Usernames.add(User);
    		Passwords.add(Pass);
    		File userUP = new File("user.txt");
    		File passUP = new File("pass.txt");
    		
    		BufferedWriter Uwriter = new BufferedWriter(new FileWriter(userUP, true));
    		Uwriter.newLine();
    		Uwriter.write(User);
    		Uwriter.close();
    		
    		BufferedWriter Pwriter = new BufferedWriter(new FileWriter(passUP, true));
    		Pwriter.newLine();
    		Pwriter.write(Pass);
    		Pwriter.close();
    		}
    	
    	
    		catch (IOException ex)  {
            System.out.println("THERE IS NO FILES         ERROR>" + ex);
    		}
	}

}
