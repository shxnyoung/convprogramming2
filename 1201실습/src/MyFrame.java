import java.awt.Color;
import java.awt.Graphics;
import java.io.FileInputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyFrame extends JFrame {
	MyFrame(){
		setTitle("���� ��� v0.2");
		setContentPane(new MyPanel());	//jframe�� �����̳� ����
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
			int data[] = new int[3*500*500];
			int W = 256;
			int H = 256;
			int n = 0, temp;
			try {
				FileInputStream fin = new FileInputStream("C:\\Users\\psh99\\Documents\\21-2\\����2\\���迵�� ���ε�\\�÷�����\\girl.raw");
				while((temp = fin.read()) != -1) {
					data[n++] = temp;	//1���� �迭�� ���ϴ� ���� �� ��
				}
				fin.close();
			}catch(Exception e){
				System.out.println("���� �б� ����");
			}
			
			
			//2. 1���� �迭->2���� �迭
			int pix[][][] = new int[3][300][300];
			for(int i = 0; i <H; i++) {	//����ũ�⸸ŭ
				for(int j = 0; j < W; j++) {//����ũ�⸸ŭ
					for(int k = 0; k < 3; k++) {
						pix[k][i][j] = data[i*W+j+k];
					}
//					pix[0][i][j] = data[i*W+j];	//i�� W ������ŭ ������Ŵ
//					pix[1][i][j] = data[i*W+j+1];
//					pix[2][i][j] = data[i*W+j+2];
					
				}
			}
			
			
			//3.GUI Graphic ���
			for(int i = 0; i <H; i++) {	
				for(int j = 0; j < W; j++) {
					g.setColor(new Color(pix[0][i][j],pix[1][i][j],pix[2][i][j]));	//���Ͽ� �ִ� ���� ���� �� 
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
