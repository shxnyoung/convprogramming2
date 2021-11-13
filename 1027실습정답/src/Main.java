import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame {
	Color[] m_col = {Color.red, Color.orange, Color.yellow,Color.green, Color.cyan,Color.blue,
			Color.magenta, Color.gray, Color.pink, Color.lightGray};
	Main() {
		setTitle("10 Colors Button");
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(1,10));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton[] xylo = new JButton[10];
		String num;
		for(int i = 0; i < 10; i++) {	//��ư ����
			num = Integer.toString(i);
			xylo[i] = new JButton(num);
			xylo[i].setBackground(m_col[i]);
			cp.add(xylo[i]);
		}
		
		for(int i = 0; i < 10; i++)
			xylo[i].addActionListener(new MyActionListener());	//��ư�� �̺�Ʈ������ ���
		
		setSize(500,200); //������ ũ�� (����, ����)
		setVisible(true);	//������ ���, ���� �����ϸ� �ȵ�
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {	//��ư ������ ��� ���� �ǵ��� �̺�Ʈ ����
		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();
		b.setBackground(Color.white);
	}
	
}
