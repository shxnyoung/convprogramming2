import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent extends JFrame {
	
	JLabel  la = new JLabel("Hello");	//Field
	
	MouseEvent(){
		setTitle("Mouse Event �ǽ�");
		
		Container c = getContentPane(); //�̹� ������� contentpane�� ��ü������ ����
		c.setLayout(null); //��ġ������ �Ⱦ�
		//Listen ��� (contentpane�� �̺�Ʈ �޾Ƶ鿩�ߵǴϱ� ���⿡)
		c.addMouseListener(new MyMouseListener());
		
		//�ʱⰪ ����
		
		//��ġ������ �����ϱ� ���� ��ġ ��������
		la.setLocation(30,30);
		la.setSize(50,20);	 
		c.add(la); //��ư�� �����̳ʿ� �÷���
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //����� ���ҽ����� Ŭ��������
		setSize(400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEvent();
	}
	
	//����Ŭ���� ->field(la) ���� ���� 
	class MyMouseListener implements MouseListener{
	
		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mousePressed(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			//setLocation�� �޾Ƽ� �װ� �ٲ��ָ� ��
			//int x = e.getX();
			//int y = e.getY();
			Point p = e.getPoint();
			la.setLocation(p);
		}
	
		@Override
		public void mouseReleased(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mouseEntered(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mouseExited(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
