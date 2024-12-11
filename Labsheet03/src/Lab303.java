import java.util.*;

import javax.swing.JOptionPane;
public class Lab303 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		String word = JOptionPane.showInputDialog("Input a sentence :");
		boolean sen = false;
		sen = word.endsWith(".");
		while(sen) 
		{
			System.out.print("Input a sentence, again : ");
			word = kb.next();
		}
		if(word.equalsIgnoreCase(".")) {
			JOptionPane.showMessageDialog(null,"Input a sentence : "+ word);
			break;
		}else {
			JOptionPane.showMessageDialog(null,"Input a sentence, again : "+ word );
			continue;			
		}			
		kb.close();

	}
}
