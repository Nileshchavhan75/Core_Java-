import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CirckeInCircle extends Canvas
{
	public void paint(Graphics g)
		{
			setBackground(Color.WHITE);
			g.drawString("hello",10,40);
			int radius = 100;
			int width = 400;
			int height = 400;
			int centerX = width/2;
			int centerY = height/2;

			for(int i=1;i<10;i++)
			{
				int currentRadius=radius-(i*10);
				 int x=centerX-currentRadius;
				 int y=centerY-currentRadius;
				int daimeter= currentRadius * 2;
				g.drawOval(x,y,daimeter,daimeter);
			}
		}

	public static void main(String [] args)
	{
		JFrame jf=new JFrame("circkeInCircle");
		CirckeInCircle m=new CirckeInCircle();
		jf.add(m);
		jf.setVisible(true);
		jf.setSize(300,300);
	}
}