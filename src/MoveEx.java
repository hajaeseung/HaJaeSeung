import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class MoveEx extends JFrame {
	JPanel jp = new JPanel();
	JLabel la = new JLabel("Love Java");
	public MoveEx() {
		
		setTitle("Left Ű�� ���ڿ� �̵�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(jp);//����Ʈ�ҿ� JPanel����
		jp.addKeyListener(new MyKeyListener());
		jp.add(la);//JPanel�� Love Java �߰�
		
		setSize(300,150);
		setVisible(true);
		jp.requestFocus();//������Ʈ���� ��Ŀ�� ����
	}
	class MyKeyListener extends KeyAdapter {
		String s = la.getText();//Love Java�˾Ƴ���
		int i = 0;
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			if(keyCode == KeyEvent.VK_LEFT) {//�������� �����϶�����
				i++;
				la.setText(s.substring(i) + s.substring(0, i));;//i��°�� ���
			}
			if(i == s.length()) i = 0;//������ ��� ���Ѵ�
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MoveEx();
	}

}
