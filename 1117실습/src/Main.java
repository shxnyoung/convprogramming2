import java.awt.Container;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
	public Main() {
		setTitle("실습문제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel m_panel = new MyPanel();
		setContentPane(m_panel);
	}
	
	public class MyPanel extends JPanel{
		private int cnt = 0;
		private int[] x = new int[100];
		private int[] y = new int[100];
		
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				
			})
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
