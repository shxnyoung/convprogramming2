import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawLineEx extends JFrame {

	DrawLineEx(){
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
		//Point start, end;	//이벤트 발생할 때 값을 얻어서 선 그릴 때 사용해야되서 여기에 선언
		//좌표점 기억하게 만들기(그린 선 유지하기)
		Point[] start = new Point[100];
		Point[] end = new Point[100];
		int cnt;
		//private int status = 0;	
		MyPanel(){
			cnt = 0;
			setBackground(Color.YELLOW);
			addMouseListener(new MouseAdapter() {
				//리스너 동작에 필요한 것
				//눌렀을 때
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mousePressed(e);
					start[cnt] = e.getPoint();	//end와 같은 cnt 값이어야 하기 때문에 그대로
					//status = 1;
				}
				//땠을 때 
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mouseReleased(e);
					end[cnt++] = e.getPoint();	//다음 선 그리기 위해서 cnt값 하나 증가
					repaint();	//화면을 다시 그려주라는 이벤트를 발생시켜줌
				}
				
			});
		}

		@Override
		protected void paintComponent(Graphics g) {		//g는 연결된 패널에 그릴 수 있는 정보를 줌
			// TODO Auto-generated method stub
			super.paintComponent(g);	//원래 부모가 하는 일 하게 해줌
			g.setColor(Color.blue);	//이 아래로 다 파란색 되게
			//if(status > 0) //반복문 쓰니까 status 필요 없음 
			for(int i = 0; i < cnt; i++) {
				g.drawLine((int)start[i].getX(), (int)start[i].getY(), (int)end[i].getX(), (int)end[i].getY());
			}
	
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DrawLineEx();
	}

}
