import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��Ŭ���� ȣ����");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
	
		int ans = gcd(M,N);
		System.out.println(ans);
	}
	
	//��Ŭ���� ȣ���� �޼ҵ� ����
	static int gcd(int a, int b) {
		//a�� b ũ�� �� ���ص� ��: ������ a�� b���� ������ �״�� �������� ������ ����
		while (a%b != 0) {
			a = a%b;
			int temp = a;
			a = b;
			b = temp;
		}
		return b;
	}
}
