import java.util.Scanner;

public class Main {

	public static void main(String[] args) { //entry point ������, �������� �����ϴ� ��ġ
		// TODO Auto-generated method stub
		System.out.println("�����佺�׳׽��� ü");
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int N = sc.nextInt();
		
		int sqrtN = (int)Math.sqrt(N); //N�� �ڵ� ����ȯ �ǰ� int�� ���� ĳ������
		
		
		boolean[] arr = new boolean[200];
		for(int i = 2; i<=N; i++) {
			arr[i] = true; //�迭 �ʱ�ȭ, �ϴ� true�� ����
		}
		
		for(int i =2; i <= sqrtN; i++) {
			if(arr[i]) {
				// �ش� ����� �Ҽ����� ����
				for (int j = i*i; j <= N; j+=i) {
					arr[j] = false;
				}
			}
		}
		for(int i = 2; i<N;i++) {
			if(arr[i]) {
				System.out.print(i+" ");
			}
		}
		

		
		sc.close();
	}

}
