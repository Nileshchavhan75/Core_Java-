import javax.swing.*;
import java.awt.event.*;
public class SwingShifting2 implements ActionListener{
    JFrame f;
    JTextField t1, t2;
    JButton b1, b2,b3;
    SwingShifting2(){
        f = new JFrame();
        f.setSize(500,600);
        f.setLayout(null);

        t1 = new JTextField();
        t1.setBounds(50,50,150,50);
        f.add(t1);

        t2 = new JTextField();
        t2.setBounds(250,50,150,50);
        f.add(t2);

        b1 = new JButton("copy");
        b1.setBounds(50,150,100,50);
        b1.addActionListener(this);
        f.add(b1);

        b2 = new JButton(">>");
        b2.setBounds(200,150,100,50);
        b2.addActionListener(this);
        f.add(b2);

        b3 = new JButton("Exchange");
        b3.setBounds(350,150,100,50);
        b3.addActionListener(this);
        f.add(b3);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            String s = t1.getText();
            t2.setText(s);
            
        }
        else if(e.getSource()== b2){
            String s = t1.getText();
            t2.setText(s);
            t1.setText(null);
        }
        else if(e.getSource() == b3){
            String s = t1.getText();
            t1.setText(t2.getText());
            t2.setText(s);
            
        }
    }
    public static void main(String[] args) {
        SwingShifting2 s = new SwingShifting2();
    }
}
