import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class Two_Player_Window {
	float StickX; 
	float StickY; 
	float Stick_Length; 
	float Stick_Width; 
	
	public void TwoPlayerWindow()
	{
		JFrame Two_Players = new JFrame();
		Two_Players.setSize(1000, 500);
		Two_Players.setVisible(true); 
		Two_Players.setResizable(false);
		Two_Players.setTitle("Two Players");
		Two_Players.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Two_Players.getContentPane().setBackground(new Color(0, 1, 0, 0.5f));
		Two_Players.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.GREEN));
		
	}

	

	

}
