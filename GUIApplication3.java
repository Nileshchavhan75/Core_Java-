import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUIApplication3 implements ActionListener{
JFrame f;
JLabel l;
JTextField t;
JCheckBox c;
JButton b;
JScrollBar j;
JMenu m;

GUIApplication3(){
f = new JFrame();
f.setSize(600,600);
f.setLayout(null);
f.setVisible(true);


l = new JLabel("Enter text");
l.setBounds(50,50,100,50);
f.add(l);

t = new JTextField();
t.setBounds(150, 50, 100, 30);
f.add(t);

c = new JCheckBox();
c.setBounds(150, 150, 100, 50);
f.add(c);

j = new JScrollBar(JScrollBar.HORIZONTAL);
j.setBounds(150,350, 100,50);
f.add(j);

b = new JButton("click");
b.setBounds(150,250,70,50);
b.addActionListener(this);
f.add(b);

m = new JMenu("File");
JMenuItem m1 = new JMenuItem("Exits");
m.add(m1);
JMenuBar m2 = new JMenuBar();
m2.add(m);
f.setJMenuBar(m2);

}
public void actionPerformed(ActionEvent e){
	if(c.isSelected()){
	JOptionPane.showMessageDialog(c, "welcome to swing");
	}else{
	JOptionPane.showMessageDialog(f,"please accept the term first");
	}

}
public static void main(String args[]){
GUIApplication3 g = new GUIApplication3();
}
}