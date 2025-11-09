import javax.swing.*;
import java.awt.event.*;
public class CalculatorN implements ActionListener{
    JFrame f;
    JTextField t, t2,t3;
    JButton sum, sub, div, mul;
    JLabel l;
    CalculatorN(){
        f = new JFrame();
        f.setSize(600,600);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        t = new JTextField();
        t.setBounds(50,50,150,50);
        f.add(t);

        t2 = new JTextField();
        t2.setBounds(250, 50, 150, 50);
        f.add(t2);

        l = new JLabel("Result");
        l.setBounds(50, 150, 100, 50);
        f.add(l);

        t3 = new JTextField();
        t3.setBounds(130, 150, 150, 50);
        t3.setEditable(false);
        f.add(t3);

        sum = new JButton("+");
        sum.setBounds(50, 250, 100, 50);
        sum.addActionListener(this);
        f.add(sum);

        sub = new JButton("-");
        sub.setBounds(200, 250, 100, 50);
        sub.addActionListener(this);
        f.add(sub);

        mul = new JButton("*");
        mul.setBounds(350,250,100,50);
        mul.addActionListener(this);
        f.add(mul);

        div = new JButton("/");
        div.setBounds(500, 250, 100, 50);
        div.addActionListener(this);
        f.add(div);
    }

    public void actionPerformed(ActionEvent e){
        try{
        int num = Integer.parseInt(t.getText());
        int num2 = Integer.parseInt(t2.getText());

        double result = 0;
        if(e.getSource() == sum){
            result = num + num2;
        }else if(e.getSource() == sub){
            result = num - num2;
        }else if(e.getSource() == mul){
            result = num * num2;
        }
            if(e.getSource() == div){
                if(num2 == 0){
                    t3.setText("Error");
                    return;
                }else{
                result = (double)num / num2;
                }
            }
            t3.setText(String.valueOf(result));
        }catch(NumberFormatException n){
            t3.setText("Invalid input");

        }
        
    }
    public static void main(String[] args) {
        CalculatorN n = new CalculatorN();
    }
}
