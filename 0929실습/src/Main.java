import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ܾ���");
		
		String[][] voca = new String[][] {
			{"planet", "�༺"},
			{"alchemist", "���ݼ���"},
			{"industry", "���"},
			{"research","����"},
			{"chair","����"},
			{"desk","å��"},
			{"computer","��ǻ��"},
			{"phone","�ڵ���"},
			{"spoon","������"},
			{"tissue","����"}
		};
		
		System.out.println();
		System.out.println("�ܾ��� ����");
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
