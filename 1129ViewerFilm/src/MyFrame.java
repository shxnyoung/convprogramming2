import java.awt.Color;
import java.awt.Graphics;
import java.io.FileInputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyFrame extends JFrame {
	MyFrame(){
		setTitle("영상 뷰어 v0.1");
		setContentPane(new MyPanel());	//jframe에 컨테이너 연결
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
	}
	class MyPanel extends JPanel{

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			
			//1.file read
			int data[] = new int[500*500];
			int W = 256;
			int H = 256;
			int n = 0, temp;
			try {
				FileInputStream fin = new FileInputStream("C:\\Users\\psh99\\Documents\\21-2\\융프2\\실험영상 업로드\\회색영상\\GIRL.dat");
				while((temp = fin.read()) != -1) {
					data[n++] = temp;	//1차원 배열에 원하는 값이 다 들어감
				}
				fin.close();
			}catch(Exception e){
				System.out.println("파일 읽기 오류");
			}
			
			
			//2. 1차원 배열->2차원 배열
			int bright = 0;
			int pix[][] = new int[300][300];
			for(int i = 0; i <H; i++) {	//세로크기만큼
				for(int j = 0; j < W; j++) {//가로크기만큼
					pix[i][j] = 255- data[i*W+j] + bright;	//반전되도록 255에서 빼줌
					if(pix[i][j] > 255)
						pix[i][j] = 255;
				}
			}
			
			
			//3.GUI Graphic 출력
			for(int i = 0; i <H; i++) {	
				for(int j = 0; j < W; j++) {
					g.setColor(new Color(pix[i][j],pix[i][j],pix[i][j]));	//파일에 있는 색상 값을 줌 
					g.drawOval(20+j, 20+i, 1, 1);	//한픽셀만큼 원 그리기
				}
			}

		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
