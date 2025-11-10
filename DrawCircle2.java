import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.*;
import javax.swing.*;
class DrawCircle2 extends Canvas{
	public void paint(Graphics g){
	int x = 50, y = 50, height = 400, waight = 400;
	for(int i = 0; i<10; i++){
	if(i % 2 ==0){
	g.setColor(Color.BLUE);
	}else{
	g.setColor(Color.RED);
	}
	g.fillOval(x+(i*20), y+(i*20), waight-(i*40), height-(i*40));
	}
      }

	public static void main(String args[]){
	DrawCircle2 c = new DrawCircle2();
	JFrame f = new JFrame();
	f.add(c);
	f.setSize(500,500);
	f.setVisible(true);
	}
}
