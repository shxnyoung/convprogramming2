import java.util.Scanner;

public class Main {

	public static void main(String[] args) { //entry point 시작점, 컴파일을 시작하는 위치
		// TODO Auto-generated method stub
		System.out.println("에라토스테네스의 체");
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int N = sc.nextInt();
		
		int sqrtN = (int)Math.sqrt(N); //N은 자동 형변환 되고 int로 강제 캐스팅함
		
		
		boolean[] arr = new boolean[200];
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
		for(int i = 2; i<N;i++) {
			if(arr[i]) {
				System.out.print(i+" ");
			}
		}
		

		
		sc.close();
	}

}
