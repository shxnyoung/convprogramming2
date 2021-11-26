import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelEx extends JFrame {

	PanelEx(){
		setTitle("그래픽 실습");
		
	
		Container c = getContentPane();	//전체 컨텐트팬 받아와서
		c.add(new NorthPanel(), BorderLayout.NORTH);	//하나씩 추가해줌
		c.add(new MyPanel(), BorderLayout.CENTER); 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
	}
	
	class NorthPanel extends JPanel{
		NorthPanel(){
			setBackground(Color.green);
			//패널에 버튼 올리기
			add(new JButton("버튼 눌러요!"));
			
		}
		
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
