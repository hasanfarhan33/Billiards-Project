import javax.swing.JFrame;

public class Highscore_Window extends Main_Menu {
	
	public void HighscoreWindow()
	{
		JFrame highscores = new JFrame(); 
		highscores.setSize(800, 800);
		highscores.setTitle("Highscores");
		highscores.setVisible(true); 
		highscores.setResizable(false);
	}

}
