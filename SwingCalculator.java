import javax.swing.*;
import java.awt.event.*;

public class SwingCalculator implements ActionListener {
    JTextField t1, t2, result;
    JButton sum, sub, mul, div;
    JLabel ans;
    String r = "Result: ";

    SwingCalculator() {
        JFrame j = new JFrame("Swing Calculator");
        j.setSize(400, 400);
        j.setLayout(null);
        j.setVisible(true);

        t1 = new JTextField();
        t1.setBounds(50, 50, 100, 30);
        j.add(t1);

        t2 = new JTextField();
        t2.setBounds(200, 50, 100, 30);
        j.add(t2);

        ans = new JLabel(r);
        ans.setBounds(50, 150, 250, 30);
        j.add(ans);

        result = new JTextField();
        result.setBounds(50, 100, 250, 30);
        result.setEditable(false);
        j.add(result);

        sum = new JButton("+");
        sum.setBounds(50, 200, 60, 40);
        sum.addActionListener(this);
        j.add(sum);

        sub = new JButton("-");
        sub.setBounds(120, 200, 60, 40);
        sub.addActionListener(this);
        j.add(sub);

        mul = new JButton("*");
        mul.setBounds(190, 200, 60, 40);
        mul.addActionListener(this);
        j.add(mul);
 
        div = new JButton("/");
        div.setBounds(260, 200, 60, 40);
        div.addActionListener(this);
        j.add(div);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ref = e.getSource();

        // Parse input values; default to 0 if empty
        int n1 = Integer.parseInt(t1.getText().isEmpty() ? "0" : t1.getText());
        int n2 = Integer.parseInt(t2.getText().isEmpty() ? "0" : t2.getText());

        if (ref == sum) {
            result.setText(String.valueOf(n1 + n2));
            ans.setText(r + (n1 + n2));
        } else if (ref == sub) {
            result.setText(String.valueOf(n1 - n2));
            ans.setText(r + (n1 - n2));
        } else if (ref == mul) {
            result.setText(String.valueOf(n1 * n2));
            ans.setText(r + (n1 * n2));
        } else if (ref == div) {
            if (n2 == 0) {
                result.setText("Cannot divide by 0");
                ans.setText(r + "Division by zero not allowed.");
            } else {
                result.setText(String.valueOf(n1 / n2));
                ans.setText(r + (n1 / n2));
            }
        }
    }

    public static void main(String[] args) {
        new SwingCalculator();
    }
}
