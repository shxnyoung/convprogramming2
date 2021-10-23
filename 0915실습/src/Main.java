import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� ���� �ִ�����-��Ŭ���� ȣ����");
		
		//������ ���� size�� N�� �迭 ����
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int N = sc.nextInt();
		if (N <3 || N>99) {
			System.out.println("error: 3 �̻� 99 ������ ���� �Է����ּ���");
			System.exit(0);
		}
		//N���� ���� �Է�
		System.out.print("> ");
		int[] arr = new int[N];
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		//��Ŭ���� ȣ������ �̿��� ù��° ����
		int ans = gcd(arr[0], arr[1]);
		
		//gcd(a, b, c) = gcd(gcd(a, b),c)�� ������ for�� �ۼ�
		//�� �ݺ����� �̿��Ͽ� �� �̻��� ������ �ִ����� ����
		for (int i = 2; i < N; i++) {
			ans = gcd(ans, arr[i]);
		}
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
	
	//��Ŭ���� ȣ���� ��ȯ
	
	/*
	 * static int gcd(int a, int b) { 
	 * if(a%b == 0) return b; 
	 * return gcd(b, a%b); 
	 * }
	 */
}
