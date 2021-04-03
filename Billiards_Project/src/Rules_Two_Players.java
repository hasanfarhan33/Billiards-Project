import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Rules_Two_Players {
	JButton play;
	public void RulesWindow()
	{
		JFrame rules = new JFrame();
		
		JLabel Heading = new JLabel("TWO PLAYERS");
		JLabel Rule_1 = new JLabel("There are two balls, yellow and red."); 
		JLabel Rule_2 = new JLabel("You have to hit both balls in one shot");
		JLabel Rule_3 = new JLabel("During the shot the cue ball should hit the border at least 3 times"); 
		JLabel Rule_4 = new JLabel("You get 10 points when you hit succesfully, you will lose 10 if you don't get a successful hit.");
		JLabel Rule_5 = new JLabel("The first one to reach 50, will win the game"); 
		
		  
		//JLabel Instruction = new JLabel("Press ENTER to begin"); 
		 
		
		
		
		rules.setSize(1000, 300);
		rules.setTitle("RULES");
		rules.setVisible(true);
		rules.setResizable(false);
		rules.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Heading.setFont(new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 20));
		Rule_1.setFont(new Font("TimesRoman", Font.BOLD, 20));
		Rule_2.setFont(new Font("TimesRoman", Font.BOLD, 20));
		Rule_3.setFont(new Font("TimesRoman", Font.BOLD, 20));
		Rule_4.setFont(new Font("TimesRoman", Font.BOLD, 20));
		Rule_5.setFont(new Font("TimesRoman", Font.BOLD, 20));
		
		//Instruction.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 20));
		play = new JButton("PLAY"); 
		play.setBounds(950, 480, 100, 50);
		
		JPanel Panel = new JPanel();
		Panel.setLayout(new BoxLayout(Panel, BoxLayout.PAGE_AXIS));
		Panel.add(Heading);
		Panel.add(Rule_1);
		Panel.add(Rule_2);
		Panel.add(Rule_3);
		Panel.add(Rule_4);
		Panel.add(Rule_5);
		Panel.add(play);
		//Panel.add(Instruction);
		
		
		
		
		Panel.add(Box.createRigidArea(new Dimension(0, 5)));
		
		rules.add(Panel);
		
		play.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				play = (JButton)e.getSource();  
				rules.dispose(); 
				Two_Player_Window Game = new Two_Player_Window(); 
				Game.TwoPlayerWindow(); 
				
				//I wanna clear the screen here so we can start the gameplay. 
				//Or should we create another window?  
			}
		});
		
		
		
		//Game.add(Panel.add(Rule_1)); 
		//Game.add(Rule_1); 
		
	}
}
