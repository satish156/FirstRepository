package MyFirstWeb;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JfieldEx extends Frame implements ActionListener{
	JTextField tf1 ,tf2,tf3;
	JButton b1,b2,b3,b4;
	JfieldEx(){
		JFrame f = new JFrame("Calculator");
		tf1 = new JTextField();
		tf1.setBounds(50, 50, 150, 20);
		tf2 = new JTextField();
		tf2.setBounds(50, 100, 150, 20);
		tf3 = new JTextField();
		tf3.setBounds(50, 150, 100, 20);
		tf3.setEditable(false);
		b1 = new JButton("+");
		b1.setBounds(50, 200, 50, 20);
		b2 = new JButton("-");
		b2.setBounds(150, 200, 50, 20);
		b3 = new JButton("*");
		b3.setBounds(50, 250, 50, 20);
		b4 = new JButton("/");
		b4.setBounds(150, 250, 50, 20);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JfieldEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int a  = Integer.parseInt(tf1.getText());
		int b  = Integer.parseInt(tf2.getText());
		int c = 0;
		if(e.getSource()==b1 ){
			c = a+b;
		}else if (e.getSource()==b2){
			c= a-b;
		}else if (e.getSource()==b3){
			c = a*b;
		}else if(e.getSource() == b4){
			c = a/b;
		}
		String result = String.valueOf(c);
		tf3.setText(result);
	}

}
