import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEx extends JFrame {
	
	JLabel  la = new JLabel("Hello");	//Field
	
	MouseAdapterEx(){
		setTitle("Mouse Event 실습");
		
		Container c = getContentPane(); //이미 만들어진 contentpane의 객체정보를 저장
		c.setLayout(null); //배치관리자 안씀
		//Listen 등록 (contentpane이 이벤트 받아들여야되니까 여기에)
		c.addMouseListener(new MyMouseAdapter());
		
		//초기값 설정
		
		//배치관리자 없으니까 내가 위치 지정해줌
		la.setLocation(30,30);
		la.setSize(50,20);	 
		c.add(la); //버튼을 컨테이너에 올려줌
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료시 리소스까지 클리어해줌
		setSize(400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseAdapterEx();
	}
	
	//Adapter클래스 
	class MyMouseAdapter extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mousePressed(e);
			
			Point p = e.getPoint();
			la.setLocation(p);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseEntered(e);
			
			Component c = (Component)e.getSource();
			c.setBackground(Color.cyan);
		}	
		
	}

}
