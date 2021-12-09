import java.awt.Color;
import java.awt.Graphics;
import java.io.FileInputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyFrame extends JFrame {
	MyFrame(){
		setTitle("컬러영상 뷰어 v0.2");
		setContentPane(new MyPanel());	//jframe에 컨테이너 연결
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		setVisible(true);
	}
	class MyPanel extends JPanel{

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			
			//1.file read
			int data[] = new int[600*2000];	//data 저장할 배열 생성
			int W ;
			int H ;
			int n = 0, temp;
			//girl.raw
			//H = 256;
			//W = 256;
			//barbara.raw
			H = 512;
			W = 512;
			//kim.raw
			//H = 380;
			//W = 380;
			int colorW = W*3;
			
			try {
				//FileInputStream fin = new FileInputStream("C:\\Users\\psh99\\Documents\\21-2\\융프2\\실험영상 업로드\\컬러영상\\girl.raw");
				FileInputStream fin = new FileInputStream("C:\\Users\\psh99\\Documents\\21-2\\융프2\\실험영상 업로드\\컬러영상\\barbara.raw");
				
				while((temp = fin.read()) != -1) {
					data[n++] = temp;	//1차원 배열에 원하는 값이 다 들어감
				}
				fin.close();
			}catch(Exception e){
				System.out.println("파일 읽기 오류");
				return;
			}
			
			
			//2. 1차원 배열->2차원 배열
			int R[][] = new int [600][600];
			int G[][] = new int [600][600];
			int B[][] = new int [600][600];
			
			
			for(int i = 0; i <H; i++) {	//세로크기만큼
				for(int j = 0; j < colorW; j++) {//가로크기만큼
					switch(j%3) {	//data = [1.1.R, 1.1.G, 1.1.B ~ 512*3.512.R, 512*3.512.G, 512*3.512.B]
					case 0:
						R[i][j/3] = data[i *colorW+j];	//j를 3으로 나눈 나머지가 0이라면 R배열
						break;
					case 1:
						G[i][j/3] = data[i *colorW+j];	//j를 3으로 나눈 나머지가 1이라면 G배열
						break;
					case 2:
						B[i][j/3] = data[i *colorW+j];	//j를 3으로 나눈 나머지가 2이라면 B배열
						break;
						
					}
				}
			}
			
			
			//3.GUI Graphic 출력
			for(int i = 0; i <H; i++) {	
				for(int j = 0; j < W; j++) {
					g.setColor(new Color(R[i][j], G[i][j], B[i][j]));	//파일에 있는 색상 값을 줌 
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
