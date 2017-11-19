import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MouseUpDownEx extends JFrame {
	public MouseUpDownEx() {
		setTitle("마우스 올리기 내리기");//Title 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();	
		c.setLayout(new FlowLayout());
		JLabel la = new JLabel("Love Java");//"Love Java를 출력하기 위한 레이블
		c.add(la);
	
	la.addMouseListener(new MouseAdapter() {
		public void mouseEntered(MouseEvent e) {
			JLabel la = (JLabel)e.getSource();//이벤트 소스 알아내기
			la.setText("Love Java");//마우스 갖다대면 이거 출력
		}
		public void mouseExited(MouseEvent e) {
			JLabel la = (JLabel)e.getSource();//이벤트  소스 알아내기
			la.setText("사랑해");//마우스 때면 이거 출력
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
