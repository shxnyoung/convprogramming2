import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�� ���� �ִ�����-��������");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.close();

		int gcd = 1;
		for (int i = 2; i <= N; i++) { //N���� ��� �ٲ���� ��
			while(M%i == 0 && N%i == 0) { //0�� �ƴҶ����� ��� ����
				gcd *= i;
				M = M/i;
				N = N/i;
			}
		}
		System.out.println(gcd);
	}

}
