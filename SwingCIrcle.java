
import java.awt.*;

import javax.swing.*;

public class SwingCIrcle extends Canvas {
    public void paint(Graphics g){
        int x = 50, y = 50, w = 400, h = 400;
        for(int i = 0; i<10; i++){
            if(i % 2 == 0){
                g.setColor(Color.BLUE);
            }else{
                g.setColor(Color.RED);
            }
            g.fillOval(x+(i*20), y+(i*20), w-(i*40), h-(i*40));
        }

    }
    public static void main(String[] args) {
        SwingCIrcle s = new SwingCIrcle();
        JFrame j = new JFrame();
        j.add(s);
        j.setSize(500,500);
        j.setVisible(true);

    }
}

