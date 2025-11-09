import javax.swing.*;
import java.awt.*;
public class CIrcle2 extends Canvas {
    public void paint(Graphics g){
        int x = 50, y = 50, width = 400, hight = 400;
        for(int i = 0; i<10; i++){
            if(i % 2 == 0){
                g.setColor(Color.BLUE);
            }else{
                g.setColor(Color.red);
            }
            g.fillOval(x+(i*20),y+(i*20),hight-(i*40),width-(i*40));
        }
        
    }
    public static void main(String[] args) {
        CIrcle2 c = new CIrcle2();
        JFrame f = new JFrame();
        f.add(c);
        f.setSize(500,600);
        f.setVisible(true);
        
    }
}
