import javax.swing.JFrame;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class SizeEx extends JFrame {
	public SizeEx() {
		setTitle("+,- Ű�� ��Ʈ ũ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel la = new JLabel("Love Java");
		Container c = getContentPane();	
		la.addKeyListener(new MyKeyListener());//����Ʈ�濡 Key �����ʸ� ����Ѵ�.
		c.setLayout(new FlowLayout());
		c.add(la);
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		setSize(300,150);
		setVisible(true);
		//����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		la.setFocusable(true);
		la.requestFocus();
	}
	class MyKeyListener extends KeyAdapter {��
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar() == '+') {//�Էµ� Ű�� '+'�� ���
				JLabel la= (JLabel)e.getSource();
				Font f = la.getFont();
				int size = f.getSize();
				la.setFont(new Font("Arial", Font.PLAIN, size+5));
			}
			else if(e.getKeyChar() == '-') {//�Էµ� Ű�� '-'�� ���
				JLabel la= (JLabel)e.getSource();
				Font f = la.getFont();
				int size = f.getSize();
				if(size <= 5)//���� ũ�Ⱑ 5���� �۾����� �ʵ�����
					return;
				la.setFont(new Font("Arial", Font.PLAIN, size-5));
			}
	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SizeEx();
	}
}


