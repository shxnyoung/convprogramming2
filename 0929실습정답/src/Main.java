import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("단어장");
		
		String[][] voca = {
			{"planet", "행성"},
			{"alchemist", "연금술사"},
			{"industry", "산업"},
			{"research","연구"},
			{"chair","의자"},
			{"desk","책상"},
			{"computer","컴퓨터"},
			{"phone","핸드폰"},
			{"spoon","숟가락"},
			{"tissue","휴지"}
		};
		
		//1. 출력
		int col = voca.length;
		int row = voca[0].length;
		for (int i = 0; i < col; i++) {
			for(int j = 0; j < row; j++) {
				System.out.printf("%-15s", voca[i][j]);
			}
			System.out.println();
		}
		
		//2. 단어장 퀴즈
		int cnt = 2, quiz;	//cnt: 점수 count, quiz: 문제 랜덤 출제
		String ans;	//입력할 정답
		System.out.println("\n단어장문제");
		Scanner sc = new Scanner(System.in);
		while(true) {
			quiz = (int)(Math.random()*col);	//0~10 사이의 정수 값을 랜덤으로 할당
			System.out.print(voca[quiz][1]+" > ");	//단어의 뜻 출제
			ans = sc.next();	//단어 입력
			if(ans.equals(voca[quiz][0])) {		//입력한 단어와 뜻이 일치하면 cnt 1 증가
				System.out.println("YES");
				cnt++;
				if(cnt == 5) {	//cnt 5가 되면, 즉 +3이 되면 pass 출력 후 종료
					System.out.println("PASS!");
					break;
				}
			}
			else {	//입력한 단어와 뜻이 일치하지 않으면 cnt 1 감소
				System.out.println("NO");
				cnt--;
				if(cnt < 0) {	//cnt < 0 즉 -3이 되면 fail 출력 후 종료
					System.out.println("FAIL!");
					break;
				}
			}
		}
		sc.close();
	}

}
