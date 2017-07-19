package MyFirstWeb;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		JButton b = new JButton("click here");
		b.setBounds(100, 100, 80, 40);
		f.add(b);
		f.setSize(500, 1000);
		f.setLayout(null);
		f.setVisible(true);
		

	}

}
