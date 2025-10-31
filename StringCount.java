import javax.swing.*;
import java.awt.event.*;
public class StringCount implements ActionListener {
    JFrame f;
    JButton b;
    JLabel l;
    JTextField j;
    StringCount(){
        f = new JFrame();
        f.setSize(500,600);
        f.setLayout(null);

        j  = new JTextField();
        j.setBounds(50,50,150,50);
        f.add(j);

        b = new JButton("Count");
        b.setBounds(100,250,100,50);
        b.addActionListener(this);
        f.add(b);

        l = new JLabel("lenght: ");
        l.setBounds(50, 100, 100, 50);
        f.add(l);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
       if(e.getSource() == b){
        String s = j.getText();
        int len = s.length();
        l.setText("lenght: "+len);

       }
    }
    
    public static void main(String[] args) {
        StringCount s = new StringCount();
        
    }
}
