import java.awt.Color;
import java.awt.Graphics;
import java.io.FileInputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyFrame extends JFrame {
	MyFrame(){
		setTitle("�÷����� ��� v0.2");
		setContentPane(new MyPanel());	//jframe�� �����̳� ����
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
			int data[] = new int[600*2000];	//data ������ �迭 ����
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
				//FileInputStream fin = new FileInputStream("C:\\Users\\psh99\\Documents\\21-2\\����2\\���迵�� ���ε�\\�÷�����\\girl.raw");
				FileInputStream fin = new FileInputStream("C:\\Users\\psh99\\Documents\\21-2\\����2\\���迵�� ���ε�\\�÷�����\\barbara.raw");
				
				while((temp = fin.read()) != -1) {
					data[n++] = temp;	//1���� �迭�� ���ϴ� ���� �� ��
				}
				fin.close();
			}catch(Exception e){
				System.out.println("���� �б� ����");
				return;
			}
			
			
			//2. 1���� �迭->2���� �迭
			int R[][] = new int [600][600];
			int G[][] = new int [600][600];
			int B[][] = new int [600][600];
			
			
			for(int i = 0; i <H; i++) {	//����ũ�⸸ŭ
				for(int j = 0; j < colorW; j++) {//����ũ�⸸ŭ
					switch(j%3) {	//data = [1.1.R, 1.1.G, 1.1.B ~ 512*3.512.R, 512*3.512.G, 512*3.512.B]
					case 0:
						R[i][j/3] = data[i *colorW+j];	//j�� 3���� ���� �������� 0�̶�� R�迭
						break;
					case 1:
						G[i][j/3] = data[i *colorW+j];	//j�� 3���� ���� �������� 1�̶�� G�迭
						break;
					case 2:
						B[i][j/3] = data[i *colorW+j];	//j�� 3���� ���� �������� 2�̶�� B�迭
						break;
						
					}
				}
			}
			
			
			//3.GUI Graphic ���
			for(int i = 0; i <H; i++) {	
				for(int j = 0; j < W; j++) {
					g.setColor(new Color(R[i][j], G[i][j], B[i][j]));	//���Ͽ� �ִ� ���� ���� �� 
					g.drawOval(20+j, 20+i, 1, 1);	//���ȼ���ŭ �� �׸���
					
				}
			}

		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
