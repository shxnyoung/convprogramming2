import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame {
	
	Main(){
		
		setTitle("Event Listener �ǽ�");
		
		Container c = getContentPane(); //�̹� ������� contentpane�� ��ü������ ����
		c.setLayout(null); //��ġ������ �Ⱦ�
		JButton  bt = new JButton("Action");	//bt��� ��ü�� �������. container ���� �ö󰡾� ��
		//��ġ������ �����ϱ� ���� ��ġ ��������
		bt.setLocation(100,100);
		bt.setSize(80,30);
		bt.setBackground(Color.YELLOW); //��ü �������� �ʰ� Ŭ������ ��� ����ϴ� ���: static, ���ο� �Ƹ� static���� �Ǿ����� ��
		bt.addActionListener(new ActionListener() {	//�͸�Ŭ������ ����

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("�׼�");
				else
					b.setText("Action");
			}
			
		}); //���
		c.add(bt); //��ư�� �����̳ʿ� �÷���

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //����� ���ҽ����� Ŭ��������
		setSize(400,300);
		setVisible(true);
		
	}
	/*
	//����Ŭ���� (Ŭ���� ���� Ŭ������ ������)
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("�׼�");
			else
				b.setText("Action");
		}
		
		
		
	}
	*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
/*
//����Ŭ������ �̺�Ʈ ������ �����
class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("�׼�");
		else
			b.setText("Action");
	}
	
	
	
}
*/
