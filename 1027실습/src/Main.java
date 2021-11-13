import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame {
	Main() {
		setTitle("10 Colors Button");
		Container cp = getContentPane();
		
		cp.setLayout(new GridLayout(1,10));
	
		JButton  bt0 = new JButton("0");
		JButton  bt1 = new JButton("1");
		JButton  bt2 = new JButton("2");
		JButton  bt3 = new JButton("3");
		JButton  bt4 = new JButton("4");
		JButton  bt5 = new JButton("5");
		JButton  bt6 = new JButton("6");
		JButton  bt7 = new JButton("7");
		JButton  bt8 = new JButton("8");
		JButton  bt9 = new JButton("9");
		//컬러 지정
		cp.add(bt0).setBackground(Color.red);
		cp.add(bt1).setBackground(Color.orange);
		cp.add(bt2).setBackground(Color.yellow);
		cp.add(bt3).setBackground(Color.green);
		cp.add(bt4).setBackground(Color.cyan);
		cp.add(bt5).setBackground(Color.blue);
		cp.add(bt6).setBackground(Color.magenta);
		cp.add(bt7).setBackground(Color.darkGray);
		cp.add(bt8).setBackground(Color.pink);
		cp.add(bt9).setBackground(Color.gray);
		//등록
		bt0.addActionListener(new MyActionListener()); 
		bt1.addActionListener(new MyActionListener()); 
		bt2.addActionListener(new MyActionListener()); 
		bt3.addActionListener(new MyActionListener()); 
		bt4.addActionListener(new MyActionListener()); 
		bt5.addActionListener(new MyActionListener()); 
		bt6.addActionListener(new MyActionListener()); 
		bt7.addActionListener(new MyActionListener()); 
		bt8.addActionListener(new MyActionListener()); 
		bt9.addActionListener(new MyActionListener()); 
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,200); //프레임 크기 (가로, 세로)
		setVisible(true);	//프레임 출력, 절대 생략하면 안됨
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
//독립클래스로 이벤트 리스너 만들기
class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();
		b.setBackground(Color.white);
		
	}
	
}