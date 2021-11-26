import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelEx extends JFrame {

	PanelEx(){
		setTitle("그래픽 실습");
		
		//setContentPane(new JPanel());	//이렇게만 쓰면 디폴트로 제공되는 페인트 컴포넌트가 사용됨. 새로운거 그리려면 JPanel 오버라이딩
		setContentPane(new MyPanel());	//MyPanel로 바꾸면 내가 지정한거로 바뀜
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		MyPanel(){
			setBackground(Color.YELLOW);
		}

		@Override
		protected void paintComponent(Graphics g) {		//g는 연결된 패널에 그릴 수 있는 정보를 줌
			// TODO Auto-generated method stub
			super.paintComponent(g);	//원래 부모가 하는 일 하게 해줌
			g.setColor(Color.blue);	//이 아래로 다 파란색 되게
			g.drawRect(20, 20, 60, 70);
			g.setColor(Color.red);
			g.fillOval(50, 50, 80 , 60);	//이 좌표에 맞는 사각형에 내접하는 타원이 그려짐
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PanelEx();
	}

}
