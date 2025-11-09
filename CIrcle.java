import javax.swing.*;
import java.awt.*;


public class CIrcle extends Canvas {
    public void paint(Graphics g){
        int x = 50, y = 50, width = 400, height = 400;
        for(int i = 0; i < 20; i++){
            g.drawOval(x+(10*i), y+(10*i), width -(i*20), height-(i*20));
        }
    }
    public static void main(String[] args) {
        CIrcle c = new CIrcle();
        JFrame f = new JFrame();
        f.add(c);
        f.setSize(500,500);
        f.setVisible(true);
    }
}
