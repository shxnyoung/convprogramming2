import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���μ�����");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int N = sc.nextInt();
		sc.close();

		
		for (int i = 2; i <= N; i++) { //N���� ��� �ٲ���� ��
			while(N%i == 0) { //0�� �ƴҶ����� ��� ����
				System.out.print(i+" ");
				N = N/i;
			}
		}
	}

}
