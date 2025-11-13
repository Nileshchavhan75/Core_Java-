import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIApplication2 implements ActionListener {
    JScrollBar j;
    JMenu m;
    JTextField t;
    JCheckBox c;
    JButton b;
    JLabel l;
    JFrame f;

    GUIApplication2() {
        // Create JFrame
        f = new JFrame();
        f.setSize(500, 600);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setVisible(true);

        
        m = new JMenu("File");
        JMenuItem m1 = new JMenuItem("Exit");
        m.add(m1);
        JMenuBar m3 = new JMenuBar();
        m3.add(m);
        f.setJMenuBar(m3);

        // Create TextField
        t = new JTextField();
        t.setBounds(150, 50, 200, 50);
        f.add(t);

        // Create CheckBox
        c = new JCheckBox("Accept Terms");
        c.setBounds(150, 170, 150, 30);
        f.add(c);

        // Create ScrollBar
        j = new JScrollBar(JScrollBar.HORIZONTAL);
        j.setBounds(50, 350, 200, 50);
        f.add(j);

        // Create Button
        b = new JButton("Click");
        b.setBounds(150, 250, 100, 50);
        b.addActionListener(this);
        f.add(b);

        // Create Label
        l = new JLabel("Enter Text: ");
        l.setBounds(50, 50, 100, 50);
        f.add(l); // Add label to the frame
    }
    public void actionPerformed(ActionEvent e){
        if(c.isSelected()){
            JOptionPane.showMessageDialog(c, "Welcome to Swing");
        }else{
            JOptionPane.showMessageDialog(f,"Please accept the term first");
        }
    }


    public static void main(String[] args) {
        new GUIApplication2();
    }
}
