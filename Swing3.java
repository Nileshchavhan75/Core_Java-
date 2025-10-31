import javax.swing.*;
public class Swing3 {
    public static void main(String[] args) {
        JFrame j = new JFrame("First Swing");
        JButton b = new JButton("Dab Button");
        b.setBounds(100, 200, 100, 50);
        j.add(b);
        j.setSize(300,500);
        j.setLayout(null);
        j.setVisible(true);
    }
}
