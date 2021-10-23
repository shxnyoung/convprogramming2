import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("단어장");
		
		String[][] voca = new String[][] {
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
		
		System.out.println();
		System.out.println("단어장 문제");
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int min = 1;
		int max = 10;
		
		
		while(score < 3 | score > -3) {
			int random = (int) ((Math.random() * (max - min) + min));
			System.out.print(voca[random][1]);
			System.out.print("> ");
			String answer = sc.next();
			
			if (answer.equals(voca[random][0])) {
				System.out.println("YES");
				score += 1;
			}
				
			else {
				System.out.println("NO");
				score -= 1;
			}
			
			if (score == -3) {
				System.out.println("FAIL!");
				break;
			}
				
			if (score == 3) {
				System.out.println("PASS!");
				break;
			}
			
		}
		
		sc.close();
			
	}

}
