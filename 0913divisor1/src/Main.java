import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��� ���ϱ�");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int N = sc.nextInt();
		sc.close();
		
		System.out.print(N+"�� ����� [1, ");
		//2���� n/2���� �����������°� ���
		for (int i = 2; i <= N/2; i++) {
			if(N%i == 0)
				System.out.print(i+ ", ");
		}
		
		
		System.out.println(N+"]");
	}

}
