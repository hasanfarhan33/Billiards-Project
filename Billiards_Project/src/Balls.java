import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

import javax.swing.*;

public class Balls extends JPanel implements ActionListener
{
    double Size = 35;
    
    double REDxSpeed = 5; 
    double REDySpeed = 5;
    double REDSpeed = 0;
    
    
    double YELLOWxSpeed = 2; 
    double YELLOWySpeed = 3; 
    double YELLOWSpeed = 0;
    
    
    double WHITExSpeed = 4; 
    double WHITEySpeed = 2; 
    double WHITESpeed = 0;
    
    double friction = 0.2; 
    
    boolean Collision = false; 
	
	Ellipse2D.Double red = new Ellipse2D.Double(200, 200, Size, Size);
	Ellipse2D.Double yellow = new Ellipse2D.Double(300, 300, Size, Size); 
	Ellipse2D.Double white = new Ellipse2D.Double(150, 400, Size, Size);
	
	Timer t = new Timer(10, this); 
	
	
	Balls()
	{
		t.start(); 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) //SHIT IS MOVING IN HERE 
	{
		
		//RED BALL
		red.x += REDxSpeed; 
		red.y += REDySpeed; 
		REDSpeed = Math.sqrt(REDxSpeed*REDxSpeed + REDySpeed*REDySpeed); 
		
		repaint(); 
		
		if(red.x < 0 || red.x > getWidth() - red.width)
		{
			REDxSpeed = -REDxSpeed; 
		}
		
		if(red.y < 0 || red.y > getHeight() - red.height)
		{
			REDySpeed = -REDySpeed; 
		}
		
		//YELLOW BALL
		yellow.x += YELLOWxSpeed; 
		yellow.y += YELLOWySpeed; 
		YELLOWSpeed = Math.sqrt(YELLOWxSpeed*YELLOWxSpeed + YELLOWySpeed*YELLOWySpeed); 
				
		repaint(); 
		
		if(yellow.x < 0 || yellow.x > getWidth() - yellow.width)
		{
			YELLOWxSpeed = -YELLOWxSpeed; 
		}
		
		if(yellow.y < 0 || yellow.y > getHeight() - yellow.height)
		{
			YELLOWySpeed = -YELLOWySpeed; 
		}
		
		//WHITE BALL
		white.x += WHITExSpeed; 
		white.y += WHITEySpeed; 
		WHITESpeed = Math.sqrt(WHITExSpeed*WHITExSpeed + WHITESpeed*WHITEySpeed);
		repaint(); 
		
		if(white.x < 0 || white.x > getWidth() - white.width)
		{
			WHITExSpeed = -WHITExSpeed; 
		}
		
		if(white.y < 0 || white.y > getHeight() - white.height)
		{
			WHITEySpeed = -WHITEySpeed; 
		}
		
		  
		
		Collision_Detection(); 
		




		
	}
	
	public void paintComponent(Graphics g) //DRAWING MY BALLS
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g; 
		//g2d.setBackground(Color.green);
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.red);
		g2d.fill(red);
		
		g2d.setColor(Color.yellow);
		g2d.fill(yellow);
		
		g2d.setColor(Color.black);
		g2d.fill(white);
		
		
	}
	
	public void Collision_Detection() //Detecting the collision here, all the collision physics should be in this function
	{
		//Collision between red and white balls
		double RED_AND_WHITE_dx = red.getCenterX() - white.getCenterX(); 
		double RED_AND_WHITE_dy = red.getCenterY() - white.getCenterY();
		
		if(RED_AND_WHITE_dx* RED_AND_WHITE_dx + RED_AND_WHITE_dy * RED_AND_WHITE_dy < red.width * white.width) //RED and WHITE BALLS ARE COLLIDING HERE
		{
//			REDxSpeed = -REDxSpeed; 
//			REDySpeed = -REDySpeed; 
//			
//			WHITExSpeed = -WHITExSpeed; 
//			WHITEySpeed = -WHITEySpeed; 
			//t.stop(); 
		}
		
		//Collision between red and yellow balls
		double RED_AND_YELLOW_dx = red.getCenterX() - yellow.getCenterX(); 
		double RED_AND_YELLOW_dy = red.getCenterY() - yellow.getCenterY();
		
		
		
		if(RED_AND_YELLOW_dx * RED_AND_YELLOW_dx + RED_AND_YELLOW_dy * RED_AND_YELLOW_dy < red.width * yellow.width) //RED AND YELLOW BALLS ARE COLLIDING HERE
		{

//			REDxSpeed = -REDxSpeed; 
//			REDySpeed = -REDySpeed; 
//			
//			YELLOWxSpeed = -YELLOWxSpeed; 
//			YELLOWySpeed = - YELLOWySpeed;
			
			//t.stop(); 
		}
		
		
		//Collision between white and yellow balls
		double WHITE_AND_YELLOW_dx = white.getCenterX() - yellow.getCenterX(); 
		double WHITE_AND_YELLOW_dy = white.getCenterY() - yellow.getCenterY();
		
		if(WHITE_AND_YELLOW_dx * WHITE_AND_YELLOW_dx + WHITE_AND_YELLOW_dy * WHITE_AND_YELLOW_dy < white.width * yellow.width)
		{
//			WHITExSpeed = -WHITExSpeed; 
//			WHITEySpeed = -WHITEySpeed; 
//			
//			YELLOWxSpeed = -YELLOWxSpeed; 
//			YELLOWySpeed = - YELLOWySpeed; 
			
			//t.stop(); 
		}
		
		
	}
	
	
	

}
