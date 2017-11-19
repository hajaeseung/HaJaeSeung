import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class MoveEx extends JFrame {
	JPanel jp = new JPanel();
	JLabel la = new JLabel("Love Java");
	public MoveEx() {
		
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(jp);//컨텐트팬에 JPanel부착
		jp.addKeyListener(new MyKeyListener());
		jp.add(la);//JPanel에 Love Java 추가
		
		setSize(300,150);
		setVisible(true);
		jp.requestFocus();//컴포넌트에게 포커스 설정
	}
	class MyKeyListener extends KeyAdapter {
		String s = la.getText();//Love Java알아내기
		int i = 0;
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			if(keyCode == KeyEvent.VK_LEFT) {//왼쪽으로 움직일때마다
				i++;
				la.setText(s.substring(i) + s.substring(0, i));;//i번째를 출력
			}
			if(i == s.length()) i = 0;//없으면 출력 안한다
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MoveEx();
	}

}
