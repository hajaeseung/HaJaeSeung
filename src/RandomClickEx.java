import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class RandomClickEx extends JFrame {
private JLabel la = new JLabel("C");
	
	public RandomClickEx() {
		setTitle("클릭 연습용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());//컨텐트팬에 Mouse 이벤트 리스너 달기
		c.setLayout(null);
		c.setLocation(100,100);//시작점 (100,100)
		la.setSize(10,10);
		c.add(la);
		setSize(250,250);
		setVisible(true);
		la.requestFocus();//컴포넌트에게 포커스 설정
	}
	class MyMouseAdapter extends MouseAdapter
	{
		public void mousePressed(MouseEvent e) {
			la.setLocation(((int)(Math.random()*200)+50),((int)(Math.random()*200)+50));//위치 (50~250)
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RandomClickEx();
	}

}
