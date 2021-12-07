import java.awt.Color;
import java.awt.Graphics;
import java.io.FileInputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyFrame extends JFrame {
	MyFrame(){
		setTitle("���� ��� v0.1");
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
			int data[] = new int[500*500];
			int W = 256;
			int H = 256;
			int n = 0, temp;
			try {
				FileInputStream fin = new FileInputStream("C:\\Users\\psh99\\Documents\\21-2\\����2\\���迵�� ���ε�\\ȸ������\\GIRL.dat");
				while((temp = fin.read()) != -1) {
					data[n++] = temp;	//1���� �迭�� ���ϴ� ���� �� ��
				}
				fin.close();
			}catch(Exception e){
				System.out.println("���� �б� ����");
			}
			
			
			//2. 1���� �迭->2���� �迭
			int bright = 0;
			int pix[][] = new int[300][300];
			for(int i = 0; i <H; i++) {	//����ũ�⸸ŭ
				for(int j = 0; j < W; j++) {//����ũ�⸸ŭ
					pix[i][j] = 255- data[i*W+j] + bright;	//�����ǵ��� 255���� ����
					if(pix[i][j] > 255)
						pix[i][j] = 255;
				}
			}
			
			
			//3.GUI Graphic ���
			for(int i = 0; i <H; i++) {	
				for(int j = 0; j < W; j++) {
					g.setColor(new Color(pix[i][j],pix[i][j],pix[i][j]));	//���Ͽ� �ִ� ���� ���� �� 
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
