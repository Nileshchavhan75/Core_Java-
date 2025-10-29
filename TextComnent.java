import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TextComnent implements ActionListener{
    JFrame f;
    TextField t1;
    TextArea t2;
    JButton j1;
    JLabel l;
    TextComnent(){
        f = new JFrame();
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);

        t1 = new TextField();
        t1.setBounds(50, 50, 100, 40);
        f.add(t1);

        t2 = new TextArea();
        t2.setBounds(50, 100, 200, 100);
        f.add(t2);

        j1 = new JButton("Click");
        j1.setBounds(50, 220, 120, 30);
        j1.addActionListener(this);
        f.add(j1);

        l = new JLabel();
        l.setBounds(50, 270, 500, 50);
        f.add(l);
        f.getDefaultCloseOperation();
    }
    
    public void actionPerformed(ActionEvent e){
        String name = t1.getText();
        String address = t2.getText();

        l.setText("Name: " + name + "  Address: "+ address);
    }

    public static void main(String[] args) {
    TextComnent t = new TextComnent();

    }
}