import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEx extends JFrame {
	
	JLabel  la = new JLabel("Hello");	//Field
	
	MouseAdapterEx(){
		setTitle("Mouse Event �ǽ�");
		
		Container c = getContentPane(); //�̹� ������� contentpane�� ��ü������ ����
		c.setLayout(null); //��ġ������ �Ⱦ�
		//Listen ��� (contentpane�� �̺�Ʈ �޾Ƶ鿩�ߵǴϱ� ���⿡)
		c.addMouseListener(new MyMouseAdapter());
		
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
		new MouseAdapterEx();
	}
	
	//AdapterŬ���� 
	class MyMouseAdapter extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mousePressed(e);
			
			Point p = e.getPoint();
			la.setLocation(p);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseEntered(e);
			
			Component c = (Component)e.getSource();
			c.setBackground(Color.cyan);
		}	
		
	}

}
