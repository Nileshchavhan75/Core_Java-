import javax.swing.*;
import java.awt.event.*;
class StringCalcu implements ActionListener{
 JFrame f;
 JTextField t;
 JButton b;
 JLabel j;
 StringCalcu(){
 f = new JFrame("MyFrame");
 f.setSize(500,500);
 f.setLayout(null);
 f.setVisible(true);
 
 t = new JTextField();
 t.setBounds(50,50,150,70);
 f.add(t);
 
 b = new JButton("Count");
 b.setBounds(50, 200, 100, 50);
 b.addActionListener(this);
 f.add(b);
 
 j = new JLabel("Length: ");
 j.setBounds(50, 130, 200,50);
 f.add(j);
}
public void actionPerformed(ActionEvent e){
    if(e.getSource() == b){
    String str =  t.getText();
    int lenght = str.length();
    j.setText("Lenght: "+ lenght);
}
}
public static void main(String args[]){
 StringCalcu c = new  StringCalcu();

} 
}
 
 
 
  