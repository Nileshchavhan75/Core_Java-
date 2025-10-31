import javax.swing.*;
public class SwingJscrollBar {
    SwingJscrollBar(){
        JFrame j = new JFrame();
        JScrollBar f = new JScrollBar();
        f.setBounds(50, 100, 30,100);
        j.add(f);
        j.setSize(300,300);
        j.setLayout(null);
        j.setVisible(true);
    }
    public static void main(String[] args) {
        SwingJscrollBar j1 = new SwingJscrollBar();
       }
}
