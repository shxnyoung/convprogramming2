import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("베르트랑 공준");
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int M = sc.nextInt();
		int N = 2*M;
		
		int sqrtN = (int)Math.sqrt(N); //N은 자동 형변환 되고 int로 강제 캐스팅함
		
		
		boolean[] arr = new boolean[(N+1)];
		for(int i = 2; i<=N; i++) {
			arr[i] = true; //배열 초기화, 일단 true로 저장
		}
		
		for(int i =2; i <= sqrtN; i++) {
			if(arr[i]) {
				// 해당 배수를 소수에서 제외
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
