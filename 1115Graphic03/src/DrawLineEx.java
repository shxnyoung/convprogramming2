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
		setTitle("�׷��� �ǽ�");
		
	
		Container c = getContentPane();	//��ü ����Ʈ�� �޾ƿͼ�
		c.add(new NorthPanel(), BorderLayout.NORTH);	//�ϳ��� �߰�����
		c.add(new MyPanel(), BorderLayout.CENTER); 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
	}
	
	class NorthPanel extends JPanel{
		NorthPanel(){
			setBackground(Color.green);
			//�гο� ��ư �ø���
			add(new JButton("��ư ������!"));
			
		}
		
	}
	class MyPanel extends JPanel{
		//Point start, end;	//�̺�Ʈ �߻��� �� ���� �� �� �׸� �� ����ؾߵǼ� ���⿡ ����
		//��ǥ�� ����ϰ� �����(�׸� �� �����ϱ�)
		Point[] start = new Point[100];
		Point[] end = new Point[100];
		int cnt;
		//private int status = 0;	
		MyPanel(){
			cnt = 0;
			setBackground(Color.YELLOW);
			addMouseListener(new MouseAdapter() {
				//������ ���ۿ� �ʿ��� ��
				//������ ��
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mousePressed(e);
					start[cnt] = e.getPoint();	//end�� ���� cnt ���̾�� �ϱ� ������ �״��
					//status = 1;
				}
				//���� �� 
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mouseReleased(e);
					end[cnt++] = e.getPoint();	//���� �� �׸��� ���ؼ� cnt�� �ϳ� ����
					repaint();	//ȭ���� �ٽ� �׷��ֶ�� �̺�Ʈ�� �߻�������
				}
				
			});
		}

		@Override
		protected void paintComponent(Graphics g) {		//g�� ����� �гο� �׸� �� �ִ� ������ ��
			// TODO Auto-generated method stub
			super.paintComponent(g);	//���� �θ� �ϴ� �� �ϰ� ����
			g.setColor(Color.blue);	//�� �Ʒ��� �� �Ķ��� �ǰ�
			//if(status > 0) //�ݺ��� ���ϱ� status �ʿ� ���� 
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
