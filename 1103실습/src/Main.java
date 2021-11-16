import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {
	
	JLabel  la = new JLabel("C");	//Field
	
	Main(){
		setTitle("Mouse Click Random Position");
		
		Container c = getContentPane(); //이미 만들어진 contentpane의 객체정보를 저장
		c.setLayout(null); //배치관리자 안씀
		
		//초기값 설정, 배치관리자 없으니까 내가 위치 지정해줌
		la.setLocation((int) (Math.random()*300),(int) (Math.random()*200));
		la.setSize(50,20);	 
		la.addMouseListener(new MyMouseAdapter());
		c.add(la); //버튼을 컨테이너에 올려줌
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료시 리소스까지 클리어해줌
		setSize(400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	
	//Adapter클래스 
	class MyMouseAdapter extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mousePressed(e);
			
			//Point p = e.getPoint();
			la.setLocation((int) (Math.random()*300),(int) (Math.random()*200));
			
		}	
		
	}

}
