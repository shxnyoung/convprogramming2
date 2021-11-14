import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame {
	
	Main(){
		
		setTitle("Event Listener 실습");
		
		Container c = getContentPane(); //이미 만들어진 contentpane의 객체정보를 저장
		c.setLayout(null); //배치관리자 안씀
		JButton  bt = new JButton("Action");	//bt라는 객체만 만들어짐. container 위에 올라가야 됨
		//배치관리자 없으니까 내가 위치 지정해줌
		bt.setLocation(100,100);
		bt.setSize(80,30);
		bt.setBackground(Color.YELLOW); //객체 생성하지 않고 클래스의 멤버 사용하는 방법: static, 옐로우 아마 static으로 되어있을 것
		bt.addActionListener(new ActionListener() {	//익명클래스로 구현

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
			}
			
		}); //등록
		c.add(bt); //버튼을 컨테이너에 올려줌

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료시 리소스까지 클리어해줌
		setSize(400,300);
		setVisible(true);
		
	}
	/*
	//내부클래스 (클래스 내에 클래스를 정의함)
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
		}
		
		
		
	}
	*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
/*
//독립클래스로 이벤트 리스너 만들기
class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}
	
	
	
}
*/
