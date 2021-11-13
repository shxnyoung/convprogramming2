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
		for(int i = 0; i < 10; i++) {	//버튼 설정
			num = Integer.toString(i);
			xylo[i] = new JButton(num);
			xylo[i].setBackground(m_col[i]);
			cp.add(xylo[i]);
		}
		
		for(int i = 0; i < 10; i++)
			xylo[i].addActionListener(new MyActionListener());	//버튼에 이벤트리스너 등록
		
		setSize(500,200); //프레임 크기 (가로, 세로)
		setVisible(true);	//프레임 출력, 절대 생략하면 안됨
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {	//버튼 누르면 흰색 바탕 되도록 이벤트 설정
		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();
		b.setBackground(Color.white);
	}
	
}
