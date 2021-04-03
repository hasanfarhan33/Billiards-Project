import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.*;

public class Main_Menu extends JFrame {
	
	//JLabel Backdrop;
	//ImageIcon background; 
	
	JButton Start; 
	JButton Highscores; 
	JButton Exit; 
	
	
	
	
	public void initGui()
	{
		//GridLayout layout = new GridLayout(3,1);
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 10, 20); 
		//setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\hasan\\Desktop\\Programming\\Java Programs\\Billiards_Project\\Reference files\\Another Background.jpg")));
		setSize(800,800);
		setTitle("Billiards on a Budget");
		setLayout(new FlowLayout()); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true); 
		setResizable(false); 
		 
		
		//background = new ImageIcon("Background.jpg"); 
		//Backdrop = new JLabel("", background, JLabel.CENTER); 
		//Backdrop.setBounds(0, 0, 800, 800);
		 
		
		Start = new JButton("Start");
		Highscores = new JButton("Highscores"); 
		Exit = new JButton("Exit"); 
		
		Start.setBounds(350,280,100,50);
		Highscores.setBounds(350,350,100,50);
		Exit.setBounds(350,420,100,50);
		
		
		
		Start.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						Start = (JButton)e.getSource(); 
						GameModeWindow Gamemode = new GameModeWindow(); 
						Gamemode.Game_Mode();
					}
				});
		
		Highscores.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						Highscores = (JButton)e.getSource(); 
						Highscore_Window high = new Highscore_Window(); 
						high.HighscoreWindow();
						
					}
			
				});
		
		Exit.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						Exit = (JButton)e.getSource(); 
						dispose(); 
						
					}
			
				});

		
		add(Start); 
	    add(Highscores); 
	    add(Exit); 
	} 
	
	
	
	


}
