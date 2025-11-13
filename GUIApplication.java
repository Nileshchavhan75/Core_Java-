import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIApplication implements ActionListener{
    JFrame f;
    JScrollBar J;
    JMenu m1;
    JLabel l;
    JTextField t;
    JButton b;
    JCheckBox c;

    GUIApplication(){
        f = new JFrame();
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);

        m1 = new JMenu("File"); 
        JMenuItem m2 = new JMenuItem("Exit");
        m1.add(m2);
        JMenuBar m3 = new JMenuBar();
        m3.add(m1);
        f.setJMenuBar(m3);

        J = new JScrollBar(JScrollBar.HORIZONTAL);
        J.setBounds(50, 150, 300, 30);
        f.add(J);

        l = new JLabel("Enter Text:");
        l.setBounds(50, 50, 100, 30);
        f.add(l);

        t = new JTextField();
        t.setBounds(150, 50, 200, 30);
        f.add(t);

        c = new JCheckBox("Accept Terms");
        c.setBounds(50, 100, 200, 30);
        f.add(c);

        b = new JButton("Submit");
        b.setBounds(50, 200, 100, 30);
        b.addActionListener(this);
        f.add(b);
        f.getDefaultCloseOperation();
    }
     public void actionPerformed(ActionEvent e){
        if(c.isSelected()){
            JOptionPane.showMessageDialog(c,  "Welcome to Swing");
        }else{
            JOptionPane.showMessageDialog(f, "Please accept the terms first.");
        }
     }
    public static void main(String[] args) {
        GUIApplication g1 = new GUIApplication();
    }
    
}