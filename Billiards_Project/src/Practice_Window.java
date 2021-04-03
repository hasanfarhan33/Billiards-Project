import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener; 




public class Practice_Window implements MouseListener, MouseMotionListener, KeyListener {
	
	JFrame Practice_Mode = new JFrame(); 
	Balls myBalls = new Balls(); 
	Stick myStick = new Stick(); 
	
	public void PracticeWindow()
	{
		
		Practice_Mode.setSize(1000, 500);
		Practice_Mode.setVisible(true); 
		Practice_Mode.setResizable(false);
		Practice_Mode.setTitle("Practice Mode");
		Practice_Mode.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Practice_Mode.getContentPane().setBackground(new Color(0, 1, 0, 0.5f)); //Not visible after i add my balls
		Practice_Mode.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.GREEN));
		
		Practice_Mode.add(myBalls);
		//Practice_Mode.add(myStick); 
		//Practice_Mode.add(myStick);
		//JPanel p = new JPanel();
		
		//Timer t= new Timer(10, myBalls); 
		
	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
		

	
	
	
}
