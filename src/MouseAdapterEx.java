import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseAdapterEx extends JFrame {
	
	public MouseAdapterEx() {
		setTitle("���콺 �ø��� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();	
		c.setLayout(new FlowLayout());
		JLabel la = new JLabel("Love Java");
		c.add(la);
	
	la.addMouseListener(new MouseAdapter() {
		public void mouseEntered(MouseEvent e) {
			JLabel la = (JLabel)e.getSource();
			la.setText("Love Java");
		}
		public void mouseExited(MouseEvent e) {
			JLabel la = (JLabel)e.getSource();
			la.setText("�����");
		}
	});
	setSize(250,250);
	setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseAdapterEx();
	}

}
