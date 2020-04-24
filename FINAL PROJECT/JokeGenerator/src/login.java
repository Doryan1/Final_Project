import java.io.* ; 
import java.awt.event.* ;  
import javax.sound.sampled.* ;
import javax.swing.* ;
import java.util.* ; 

public class login implements ActionListener {
	private static JLabel Userlabel;
	private static JLabel intro ; 
	public static JTextField userText;
	private static JLabel PassLabel;
	public static JPasswordField passText;
	public static JButton LogInbutton;
	private static JLabel LogTrue;
	static int LogSuccess;
	private static JButton newUser ; 
	
	
	public static void main(String[] args) {
		LogSuccess = 2 ; 
		
		JFrame frame = new JFrame();
    	JPanel panel = new JPanel();
    	frame.setSize(450, 170);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.add(panel);
    	panel.setLayout(null);
    	
    	intro = new JLabel("Please enter your username and password to use the joke generator") ; 
    	intro.setBounds(10,90,600,25) ; 
    	panel.add(intro) ;
    	
    	Userlabel = new JLabel("Username:");
    	Userlabel.setBounds(10, 20, 80, 25); 
    	panel.add(Userlabel);
    	
    	
    	userText = new JTextField(20);
    	userText.setBounds(100, 20, 165, 25);
    	panel.add(userText);
    	
    	
    	PassLabel = new JLabel("Password:");
    	PassLabel.setBounds(10, 50, 80, 25);
    	panel.add(PassLabel);
    	
    	
    	passText = new JPasswordField();
    	passText.setBounds(100, 50, 165, 25);
    	panel.add(passText);
    	
    	
        LogInbutton = new JButton("Log In");
    	LogInbutton.setBounds(300, 20, 100, 25);
    	LogInbutton.addActionListener(new login());
    	panel.add(LogInbutton);
    	
    	newUser = new JButton("Create new user") ; 
    	newUser.setBounds(300,55,125,25);
    	newUser.addActionListener(new createNew());
    	panel.add(newUser) ; 
    	
    	
    	LogTrue = new JLabel("");
    	LogTrue.setBounds(10,110,300,25);
    	panel.add(LogTrue);
    	frame.setVisible(true);
    	
	}// no sound has been added yet. will add ding or horn sound if right or wrong
	public static void sound(String soundName) {
			   try {
			    AudioInputStream input = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile( ));
			    Clip clip = AudioSystem.getClip( );
			    clip.open(input);
			    clip.start( );
			   }
			   catch(Exception ex) {
			     System.out.println("Error with playing sound.");
			     ex.printStackTrace( );
			   }
	}
		public void actionPerformed(ActionEvent eb) {
			Scanner userln, passln ; 
			
			ArrayList<String> Usernames = new ArrayList<String>() ;
			ArrayList<String> Passwords = new ArrayList<String>() ; 
			
			int x = 0 ; 
			
			try {
				userln = new Scanner(new File("user.txt")) ; 
				while (userln.hasNextLine())
					Usernames.add(userln.nextLine()) ;
				
				passln = new Scanner(new File("pass.txt")) ;
				while (passln.hasNextLine())
					Passwords.add(passln.nextLine()) ;
				
				String user = userText.getText(); 
				@SuppressWarnings("deprecation")
				String pass = passText.getText();  
				x = 5 ; 
				
				System.out.println(user + " " + pass) ; 
				for (String temp : Usernames)
					if(temp.contains(user)) {
						x = 7 ; 
						
						for(String temp2 : Passwords)
							if(temp2.contains(pass)) {
								x = 10 ; 
								System.out.println("user and pass correct") ; 
								LogTrue.setText("L O G I N      S U C C E S S");
								LogSuccess = 100 ; 
								window win = new window() ; 
					    		win.winner(); 
					 
							}
							else  {
								LogTrue.setText("L O G I N      F A I L E D");
							}
					}
			}
			catch(FileNotFoundException ex)
			
			{
				System.out.println("THERE IS NO username  FILE    ERROR>" + ex) ; 
			}
			System.out.println("if its running correctly with a correct log in x should equal 10, your x = " + x);
			System.out.println("Usernames: " + Usernames);
			System.out.println("Passwords: " + Passwords);
			
		}
		public String getPass() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getUser() {
			// TODO Auto-generated method stub
			return null;
		}
		
}