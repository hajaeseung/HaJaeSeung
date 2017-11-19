import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MouseUpDownEx extends JFrame {
	public MouseUpDownEx() {
		setTitle("���콺 �ø��� ������");//Title ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();	
		c.setLayout(new FlowLayout());
		JLabel la = new JLabel("Love Java");//"Love Java�� ����ϱ� ���� ���̺�
		c.add(la);
	
	la.addMouseListener(new MouseAdapter() {
		public void mouseEntered(MouseEvent e) {
			JLabel la = (JLabel)e.getSource();//�̺�Ʈ �ҽ� �˾Ƴ���
			la.setText("Love Java");//���콺 ���ٴ�� �̰� ���
		}
		public void mouseExited(MouseEvent e) {
			JLabel la = (JLabel)e.getSource();//�̺�Ʈ  �ҽ� �˾Ƴ���
			la.setText("�����");//���콺 ���� �̰� ���
		}
	});
	setSize(250,250);
	setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseUpDownEx();
	}

}
