import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ܾ���");
		
		String[][] voca = {
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
		
		//1. ���
		int col = voca.length;
		int row = voca[0].length;
		for (int i = 0; i < col; i++) {
			for(int j = 0; j < row; j++) {
				System.out.printf("%-15s", voca[i][j]);
			}
			System.out.println();
		}
		
		//2. �ܾ��� ����
		int cnt = 2, quiz;	//cnt: ���� count, quiz: ���� ���� ����
		String ans;	//�Է��� ����
		System.out.println("\n�ܾ��幮��");
		Scanner sc = new Scanner(System.in);
		while(true) {
			quiz = (int)(Math.random()*col);	//0~10 ������ ���� ���� �������� �Ҵ�
			System.out.print(voca[quiz][1]+" > ");	//�ܾ��� �� ����
			ans = sc.next();	//�ܾ� �Է�
			if(ans.equals(voca[quiz][0])) {		//�Է��� �ܾ�� ���� ��ġ�ϸ� cnt 1 ����
				System.out.println("YES");
				cnt++;
				if(cnt == 5) {	//cnt 5�� �Ǹ�, �� +3�� �Ǹ� pass ��� �� ����
					System.out.println("PASS!");
					break;
				}
			}
			else {	//�Է��� �ܾ�� ���� ��ġ���� ������ cnt 1 ����
				System.out.println("NO");
				cnt--;
				if(cnt < 0) {	//cnt < 0 �� -3�� �Ǹ� fail ��� �� ����
					System.out.println("FAIL!");
					break;
				}
			}
		}
		sc.close();
	}

}
