
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("���� GUI ����");
		
		//1. ����Ʈ�� 
		Container cp = getContentPane();
		/*
		//(����Ʈ�� borderlayout)
		cp.add(new JButton("OK"), BorderLayout.WEST);
		cp.add(new JButton("Cancel"), BorderLayout.CENTER);
		cp.add(new JButton("Ignore"), BorderLayout.EAST);
		*/
		cp.setLayout(new FlowLayout());
		cp.add(new JButton("OK"));
		cp.add(new JButton("Cancel"));
		cp.add(new JButton("Ignore"));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,400); //������ ũ�� (����, ����)
		setVisible(true);	//������ ���, ���� �����ϸ� �ȵ�
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame();
	}

}
