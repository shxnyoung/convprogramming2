import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelEx extends JFrame {

	PanelEx(){
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
		MyPanel(){
			setBackground(Color.YELLOW);
		}

		@Override
		protected void paintComponent(Graphics g) {		//g�� ����� �гο� �׸� �� �ִ� ������ ��
			// TODO Auto-generated method stub
			super.paintComponent(g);	//���� �θ� �ϴ� �� �ϰ� ����
			g.setColor(Color.blue);	//�� �Ʒ��� �� �Ķ��� �ǰ�
			g.drawRect(20, 20, 60, 70);
			g.setColor(Color.red);
			g.fillOval(50, 50, 80 , 60);	//�� ��ǥ�� �´� �簢���� �����ϴ� Ÿ���� �׷���
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PanelEx();
	}

}
