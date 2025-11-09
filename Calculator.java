import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CalculatorLogic extends JFrame implements ActionListener{
	private JTextField op1, op2, result;
	private JLabel ans;
	private JButton sum;
	private JButton sub;
	private JButton mul;
	private JButton div;
	private JButton rem;
	private String r = "Result:  ";

	public CalculatorLogic(){
		setTitle("Calculator_By_PSR");
		setSize(450,500);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

		addComponents();

		setVisible(true);
		setDefaultCloseOperation(3);
	}

	public void addComponents(){
		op1 = new JTextField();
		op1.setBounds(50, 50, 120, 40);
		add(op1);
		op2 = new JTextField();
		op2.setBounds(260, 50, 120, 40);
		add(op2);

		result = new JTextField();
		result.setBounds(150, 120, 120, 40);
		result.setEditable(false);
		add(result);

		ans = new JLabel(r);
		ans.setBounds(150, 200, 250, 30);
		add(ans);

		sum = new JButton("+");
		sum.setBounds(50, 300, 50, 50);
		add(sum);

		sub = new JButton("-");
		sub.setBounds(120, 300, 50, 50);
		add(sub);

		mul = new JButton("*");
		mul.setBounds(190, 300, 50, 50);
		add(mul);

		div = new JButton("/");
		div.setBounds(260, 300, 50, 50);
		add(div);

		rem = new JButton("%");
		rem.setBounds(330, 300, 50, 50);
		add(rem);

		sum.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		rem.addActionListener(this);
	}
		public void actionPerformed(ActionEvent e){
			Object ref = e.getSource();

				int n1 = Integer.parseInt(op1.getText().isEmpty()?"0":op1.getText());
				int n2 = Integer.parseInt(op2.getText().isEmpty()?"0":op2.getText());

			if(ref == sum){
				result.setText((n1+n2)+"");
				ans.setText(r+(n1+n2)+"");
			}else if(ref == sub){
				result.setText((n1-n2)+"");
				ans.setText(r+(n1-n2)+"");
			}else if(ref == mul){
				result.setText((n1*n2)+"");
				ans.setText(r+(n1*n2)+"");
			}else if(ref == div){
				try{
					result.setText((n1/n2)+"");
					ans.setText(r+(n1/n2)+"");
				}catch(ArithmeticException a){
					result.setText("Cannot divide by 0");
					ans.setText(r+ "Division by zero not allowed.");
				}

			}else if(ref == rem){
				try{
					result.setText((n1%n2)+"");
					ans.setText(r+(n1%n2)+"");
				}catch(ArithmeticException a){
					result.setText("Cannot divide by 0");
					ans.setText(r+ "Division/Mod by zero not allowed.");
				}
			}
		}
}

public class Calculator{
	public static void main(String[]a){
		new CalculatorLogic();
	}
}