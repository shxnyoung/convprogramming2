import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent extends JFrame {
	
	JLabel  la = new JLabel("Hello");	//Field
	
	MouseEvent(){
		setTitle("Mouse Event 실습");
		
		Container c = getContentPane(); //이미 만들어진 contentpane의 객체정보를 저장
		c.setLayout(null); //배치관리자 안씀
		//Listen 등록 (contentpane이 이벤트 받아들여야되니까 여기에)
		c.addMouseListener(new MyMouseListener());
		
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
		new MouseEvent();
	}
	
	//내부클래스 ->field(la) 공유 가능 
	class MyMouseListener implements MouseListener{
	
		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mousePressed(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			//setLocation을 받아서 그걸 바꿔주면 됨
			//int x = e.getX();
			//int y = e.getY();
			Point p = e.getPoint();
			la.setLocation(p);
		}
	
		@Override
		public void mouseReleased(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mouseEntered(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mouseExited(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
