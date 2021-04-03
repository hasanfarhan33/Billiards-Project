import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class GameModeWindow {
	JButton PracticeMode = new JButton("Practice Mode"); 
	JButton TwoPlayers = new JButton("Two Players"); 
	
	public void Game_Mode() 
	{
		JFrame GameMode = new JFrame(); 
		GameMode.setSize(500, 500);
		GameMode.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		GameMode.setVisible(true);
		GameMode.setResizable(false);
		GameMode.setTitle("Select game mode");
		
		
		
		
		
		 JPanel pan = new JPanel(new GridBagLayout()); 
		GridBagConstraints layout = new GridBagConstraints(); 
		layout.insets = new Insets(0, 20, 0, 20);
		
		PracticeMode.setPreferredSize(new Dimension(150, 100));
		TwoPlayers.setPreferredSize(new Dimension(150, 100)); 
		
		pan.add(PracticeMode, layout); 
		 pan.add(TwoPlayers, layout); 
		
		 PracticeMode.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					PracticeMode = (JButton)e.getSource();
					Rules_Practice rules = new Rules_Practice(); 
					rules.RulesWindow();
					GameMode.dispose(); 
					//GameModeWindow Gamemode = new GameModeWindow(); 
					//Gamemode.Game_Mode();
				}
			});
		 
		 TwoPlayers.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					TwoPlayers = (JButton)e.getSource();
					Rules_Two_Players rules = new Rules_Two_Players();
					rules.RulesWindow();
					
					GameMode.dispose(); 
					//Rules_Practice rules = new Rules_Practice(); 
					//rules.RulesWindow(); 
				}
			});
		 
		 GameMode.add(pan); 
		 
		 
		//GameMode.add(PracticeMode);
	     
		//GameMode.add(TwoPlayers); 
		
		
		
	}

}
