import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class copyExchageShift
{
	copyExchageShift()
	{
		JFrame jf=new JFrame();
		jf.setSize(400,400);
		jf.setVisible(true);
		jf.setLayout(null);

		JTextField jt=new JTextField();
		jt.setBounds(90,90,90,30);

		JTextField jt1=new JTextField();
		jt1.setBounds(200,90,90,30);

		JButton jb1=new JButton("copy");
		jb1.setBounds(90,120,90,30);

		JButton jb2=new JButton(">>");
		jb2.setBounds(200,120,90,30);

		JButton jb3=new JButton("exchange");
		jb3.setBounds(300,120,90,30);

		jf.add(jt);
		jf.add(jt1);
		jf.add(jb1);
		jf.add(jb2);
		jf.add(jb3);

		jb1.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{
						if(e.getSource()==jb1)
						{
							String s1=jt.getText();
							jt1.setText(s1);
						}
					}
				});

		jb2.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{
						if(e.getSource()==jb2)
						{
							String s1=jt.getText();
							jt1.setText(s1);
							s1=" ";
							jt.setText(s1);
						}
					}
				});

		jb3.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{
						if(e.getSource()==jb3)
						{
							String s1=jt.getText();
							String s2=jt1.getText();
							jt1.setText(s1);
							jt.setText(s2);	
						}
					}
				});

	}
	public static void main(String [] args)
	{
		new copyExchageShift();
	}
}