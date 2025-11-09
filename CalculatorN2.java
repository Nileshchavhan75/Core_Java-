import javax.swing.*;
import java.awt.event.*;

public class CalculatorN2 implements ActionListener {
    JFrame f;
    JTextField t1, t2,t3;
    JLabel l;
    JButton sum, sub, div,mul;
    CalculatorN2(){
        f = new JFrame();
        f.setSize(500, 600);
        f.setLayout(null);

        t1 = new JTextField();
        t1.setBounds(50,50,100,40);
        f.add(t1);

        t2 = new JTextField();
        t2.setBounds(200, 50,100,40);
        f.add(t2);

        t3 = new JTextField();
        t3.setBounds(120,170,100,40);
        t3.setEditable(false);
        f.add(t3);

        l = new JLabel("Result: ");
        l.setBounds(50,170,100,30);
        f.add(l);


        sum = new JButton("+");
        sum.setBounds(50, 350, 70, 50);
        sum.addActionListener(this);
        f.add(sum);

        sub = new JButton("-");
        sub.setBounds(150, 350, 70, 50);
        sub.addActionListener(this);
        f.add(sub);

        div = new JButton("/");
        div.setBounds(250, 350, 70, 50);
        div.addActionListener(this);
        f.add(div);

        mul = new JButton("*");
        mul.setBounds(350, 350, 70, 50);
        mul.addActionListener(this);
        f.add(mul);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        try{
        int num = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        double result = 0;
        if(e.getSource() == sum){
            result = num + num2;
        }else if(e.getSource() == sub){
            result = num - num2;
        }else if(e.getSource() == div){
            if(num2 == 0){
                throw new ArithmeticException("Cannot Divide with zero");
            }
            result = num /num2;
        }else if(e.getSource() == mul){
            result = num * num2;
        }
        t3.setText(String.valueOf(result));
    }catch(NumberFormatException ex){
        t3.setText("Invalid input");
    }catch(ArithmeticException ee){
        t3.setText(ee.getMessage());
    }
    }
    public static void main(String[] args) {
        CalculatorN2 c = new CalculatorN2();
    }
}

