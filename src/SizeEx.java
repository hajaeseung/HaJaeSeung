import javax.swing.JFrame;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class SizeEx extends JFrame {
	public SizeEx() {
		setTitle("+,- 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel la = new JLabel("Love Java");
		Container c = getContentPane();	
		la.addKeyListener(new MyKeyListener());//컨텐트펜에 Key 리스너를 등록한다.
		c.setLayout(new FlowLayout());
		c.add(la);
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		setSize(300,150);
		setVisible(true);
		//컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		la.setFocusable(true);
		la.requestFocus();
	}
	class MyKeyListener extends KeyAdapter {ㅡ
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar() == '+') {//입력된 키가 '+'인 경우
				JLabel la= (JLabel)e.getSource();
				Font f = la.getFont();
				int size = f.getSize();
				la.setFont(new Font("Arial", Font.PLAIN, size+5));
			}
			else if(e.getKeyChar() == '-') {//입력된 키가 '-'인 경우
				JLabel la= (JLabel)e.getSource();
				Font f = la.getFont();
				int size = f.getSize();
				if(size <= 5)//글자 크기가 5보다 작아지지 않도록함
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


