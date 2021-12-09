import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextMouseListener extends JFrame {
	private JTextField m_tf = new JTextField();		//�Է��� �ؽ�Ʈ�ʵ� ����
	private JLabel m_la = new JLabel("Han");	//�� ����
	
	TextMouseListener(){
		setTitle("�ǽ����� event ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel guide = new JLabel("�Է� �� <enter>");
		guide.setSize(100,20);
		guide.setLocation(20,20);
		c.add(guide);
		
		m_la.setLocation(30,70);
		m_la.setSize(50,20);
		c.add(m_la);	//�ʱ� �� ��ġ ����
		
		c.addMouseListener(new MouseAdapter() {	//�͸� Ŭ������ �̺�Ʈ ���� �� ����Ʈ�ҿ� ����
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mousePressed(e);
				m_la.setLocation(e.getX(),e.getY());	//����Ʈ ���� Ŭ���ϸ� m_la �� ��ġ �̵�
			}
		});
		
		m_tf.setSize(100,20);
		m_tf.setLocation(120,20);
		c.add(m_tf);

		m_tf.addActionListener(new ActionListener() {	//�͸�Ŭ������ �̺�Ʈ ���� �� �ؽ�Ʈ�ʵ忡 ����
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JTextField t = (JTextField)e.getSource();	//�ٲ� �ؽ�Ʈ ����
				m_la.setText(t.getText());	//m_la�� �ٲ� �ؽ�Ʈ�� ����
				t.setText("");	//�ؽ�Ʈ�ʵ带 ��ĭ���� �ʱ�ȭ
			}
		});
		setVisible(true);
		setSize(300,300);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextMouseListener();
	}
}
