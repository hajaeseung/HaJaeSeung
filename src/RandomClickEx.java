import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class RandomClickEx extends JFrame {
private JLabel la = new JLabel("C");
	
	public RandomClickEx() {
		setTitle("Ŭ�� ������ �������α׷�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());//����Ʈ�ҿ� Mouse �̺�Ʈ ������ �ޱ�
		c.setLayout(null);
		c.setLocation(100,100);//������ (100,100)
		la.setSize(10,10);
		c.add(la);
		setSize(250,250);
		setVisible(true);
		la.requestFocus();//������Ʈ���� ��Ŀ�� ����
	}
	class MyMouseAdapter extends MouseAdapter
	{
		public void mousePressed(MouseEvent e) {
			la.setLocation(((int)(Math.random()*200)+50),((int)(Math.random()*200)+50));//��ġ (50~250)
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RandomClickEx();
	}

}
