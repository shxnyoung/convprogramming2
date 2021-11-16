import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {
	
	JLabel  la = new JLabel("C");	//Field
	
	Main(){
		setTitle("Mouse Click Random Position");
		
		Container c = getContentPane(); //�̹� ������� contentpane�� ��ü������ ����
		c.setLayout(null); //��ġ������ �Ⱦ�
		
		//�ʱⰪ ����, ��ġ������ �����ϱ� ���� ��ġ ��������
		la.setLocation((int) (Math.random()*300),(int) (Math.random()*200));
		la.setSize(50,20);	 
		la.addMouseListener(new MyMouseAdapter());
		c.add(la); //��ư�� �����̳ʿ� �÷���
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //����� ���ҽ����� Ŭ��������
		setSize(400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	
	//AdapterŬ���� 
	class MyMouseAdapter extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mousePressed(e);
			
			//Point p = e.getPoint();
			la.setLocation((int) (Math.random()*300),(int) (Math.random()*200));
			
		}	
		
	}

}
