import javax.swing.*;
import java.awt.event.*;;
public class SwingShifting implements ActionListener{
    JFrame f;
    JTextField t;
    JTextField t2;
    JButton b;
    JButton b2;
    JButton b3;
    SwingShifting(){
        f = new JFrame();
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

        t = new JTextField();
        t.setBounds(50, 50, 200, 30);
        f.add(t);
        
        t2 = new JTextField();
        t2.setBounds(300, 50, 200, 30);
        f.add(t2);

        b = new JButton("Copy");
        b.setBounds(50,150,150,50);
        b.addActionListener(this);
        f.add(b);
        
        b2 = new JButton("Shift>>");
        b2.setBounds(250,150,150,50);
        b2.addActionListener(this);
        f.add(b2);
        
        b3 = new JButton("Exchange");
        b3.setBounds(450,150,150,50);
        b3.addActionListener(this);
        f.add(b3);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == b) {
            String s = t.getText();
            t2.setText(s);
            t.setText(null);

        }else if (e.getSource() == b2) {
            String s2 = t.getText();
            t2.setText(s2);
            t.setText(null);


        } else if(e.getSource() == b3) { 
            String s3 = t.getText();
            t.setText(t2.getText());
            t2.setText(s3);
        }
    }

    public static void main(String[] args) {
        SwingShifting s = new SwingShifting();
        
    }
}
