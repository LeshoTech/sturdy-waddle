import java.util.*;
import java.lang.*;
import javax.swing.JOptionPane;

public class PasswordChecker {

	public static void main(String[] args) {
		
		Scanner UserPass = new Scanner(System.in);
		Scanner UserName = new Scanner(System.in);
		
		String Name = JOptionPane.showInputDialog(" Hello \n Enter your name please. ");
		
		
		
		
		
		
		for(int i = 3; i >= 0;i--)
		{

			String Password = JOptionPane.showInputDialog(" Enter your Password which is your name ");
			
		
			if (Password.equals(Name)) 
			{
				JOptionPane.showMessageDialog(null," Correct Password! You have been logged in "," Success ",JOptionPane.PLAIN_MESSAGE);
				System.exit(0);
			} 
			
			else if(!Password.equals(Name))
			{
				JOptionPane.showMessageDialog(null," Wrong Password! \n You have " + i + " attempts left."," Invalid ",JOptionPane.WARNING_MESSAGE);
				
			} 
			
			if (i == 0) 
			{
				
				JOptionPane.showMessageDialog(null," You have been locked out ","Invalid ",JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			}
			
		
			
			
				
				
				
		} 
		
}
	
}
