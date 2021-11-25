import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main extends JFrame {
	private JTextField tf = new JTextField(20);
	private JLabel m_la = new JLabel("Han");
	Container c = getContentPane();
	Main(){
		setTitle("실습과제 event 응용");
		
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 <enter>"));
		c.add(tf);
		
		m_la.setLocation(100,100);
		m_la.setSize(10,10);
		c.add(m_la);
		
		m_la.addMouseListener(new MouseListener());
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				m_la.setText(tf.getText());
				tf.setText("");
			}
			
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,300);
	}
	class MouseListener extends MouseAdapter{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseClicked(e);
			int x = (int)(Math.random()*(c.getWidth() - m_la.getWidth()));
			int y = (int)(Math.random()*(c.getHeight() - m_la.getHeight()));
			m_la.setLocation(x,y);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
