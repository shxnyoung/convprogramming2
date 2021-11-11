
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("오늘 GUI 시작");
		
		//1. 컨텐트팬 
		Container cp = getContentPane();
		/*
		//(디폴트로 borderlayout)
		cp.add(new JButton("OK"), BorderLayout.WEST);
		cp.add(new JButton("Cancel"), BorderLayout.CENTER);
		cp.add(new JButton("Ignore"), BorderLayout.EAST);
		*/
		cp.setLayout(new FlowLayout());
		cp.add(new JButton("OK"));
		cp.add(new JButton("Cancel"));
		cp.add(new JButton("Ignore"));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,400); //프레임 크기 (가로, 세로)
		setVisible(true);	//프레임 출력, 절대 생략하면 안됨
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame();
	}

}
