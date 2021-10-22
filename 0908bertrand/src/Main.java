import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����Ʈ�� ����");
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int M = sc.nextInt();
		int N = 2*M;
		
		int sqrtN = (int)Math.sqrt(N); //N�� �ڵ� ����ȯ �ǰ� int�� ���� ĳ������
		
		
		boolean[] arr = new boolean[(N+1)];
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
		
		int cnt = 0;
		for(int i =M+1; i <= N; i++) {
			if(arr[i]) {
				cnt++;
			}
		}
		System.out.print(cnt);

		
		sc.close();
	}

}
