import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.*; 

public class Stick extends JPanel implements MouseListener, MouseMotionListener, ActionListener {
	int xLocation = 50; 
	int yLocation = 50; 
	int Width = 50;  
	int Height = 15;
	
	Rectangle2D.Double stick = new Rectangle2D.Double(200, 200, Width, Height); 
	
	Timer t = new Timer(10, this); 
	
	Stick()
	{
		t.start();
	}
	
	public void PaintComponent(Graphics g)
	{
		super.paintComponent(g); 
		Graphics2D g2d = (Graphics2D)g; 
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		
		g2d.setColor(Color.ORANGE);
		g2d.fill(stick);
		
	}
	

	public void actionPerformed(ActionEvent e) 
	{
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
