import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextMouseListener extends JFrame {
	private JTextField m_tf = new JTextField();		//입력할 텍스트필드 생성
	private JLabel m_la = new JLabel("Han");	//라벨 생성
	
	TextMouseListener(){
		setTitle("실습과제 event 응용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel guide = new JLabel("입력 후 <enter>");
		guide.setSize(100,20);
		guide.setLocation(20,20);
		c.add(guide);
		
		m_la.setLocation(30,70);
		m_la.setSize(50,20);
		c.add(m_la);	//초기 라벨 위치 지정
		
		c.addMouseListener(new MouseAdapter() {	//익명 클래스로 이벤트 생성 후 컨텐트팬에 연결
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mousePressed(e);
				m_la.setLocation(e.getX(),e.getY());	//컨텐트 내부 클릭하면 m_la 라벨 위치 이동
			}
		});
		
		m_tf.setSize(100,20);
		m_tf.setLocation(120,20);
		c.add(m_tf);

		m_tf.addActionListener(new ActionListener() {	//익명클래스로 이벤트 생성 후 텍스트필드에 연결
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JTextField t = (JTextField)e.getSource();	//바꿀 텍스트 저장
				m_la.setText(t.getText());	//m_la를 바꿀 텍스트로 변경
				t.setText("");	//텍스트필드를 빈칸으로 초기화
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
