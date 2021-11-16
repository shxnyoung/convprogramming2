import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseRandomEx extends JFrame {
	private JLabel m_la = new JLabel("C");
	private Container m_c = getContentPane();
	public MouseRandomEx() {
		setTitle("Mouse Click Random Position");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m_c.setLayout(null);
		m_la.setLocation(100,100);
		m_la.setSize(10,10);
		m_c.add(m_la);
		
		m_la.addMouseListener(new MouseListener());
		
		setVisible(true);
		setSize(300,250);
	}
	
	class MouseListener extends MouseAdapter{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseClicked(e);
			int x = (int)(Math.random()*(m_c.getWidth() - m_la.getWidth()));
			int y = (int)(Math.random()*(m_c.getHeight() - m_la.getHeight()));
			m_la.setLocation(x,y);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseRandomEx();
	}

}
