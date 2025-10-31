import javax.swing.*;
public class swingTextfiled {
    public static void main(String[] args) {
        JFrame j = new JFrame("Swing");
        JTextField t = new JTextField("Welcome");
        t.setBounds(50, 100, 200, 50);
        j.add(t);
        j.setSize(600, 600);
        j.setLayout(null);
        j.setVisible(true);
    }
}
