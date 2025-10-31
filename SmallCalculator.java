import javax.swing.*;
import java.awt.event.*;;
class SmallCalculator implements ActionListener{
    JTextField t1,t2,t3;
       JButton b1;
    SmallCalculator(){
        JFrame j = new JFrame("Small Calculator");
       j.setSize(600,600);
       j.setLayout(null);
       j.setVisible(true);
       
       t1 = new JTextField();
       t1.setBounds(20,50,100,50);
       j.add(t1);

       t2 = new JTextField();
       t2.setBounds(200,50,100,50);
       j.add(t2);

       t3 = new JTextField();
       t3.setBounds(100,150,100,50);
       t3.setEditable(false);
       j.add(t3);

       b1 = new JButton("+");
       b1.setBounds(100, 300, 100, 50);
       b1.addActionListener(this);
       j.add(b1);
    }

    public void actionPerformed(ActionEvent e){
        String s1 = t1.getText();
        String s2 = t2.getText();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        int c = 0;
        if(e.getSource() == b1){
            c = a + b;
            String result = String.valueOf(c);
            t3.setText(result);
        }
    }
    
    public static void main(String[] args) {
       SmallCalculator s1 = new SmallCalculator();

    }
}
