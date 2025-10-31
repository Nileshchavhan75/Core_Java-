import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing4 {
    JFrame f;
    Swing4(){
        f = new JFrame();
        JLabel b = new JLabel("Welcome");
        b.setBounds(20, 50, 90, 50);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        Swing4 s1 = new Swing4();
    }
}
