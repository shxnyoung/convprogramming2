import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("여러 수의 최대공약수-유클리드 호제법");
		
		//정수를 넣을 size가 N인 배열 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int N = sc.nextInt();
		if (N <3 || N>99) {
			System.out.println("error: 3 이상 99 이하의 수를 입력해주세요");
			System.exit(0);
		}
		//N개의 정수 입력
		System.out.print("> ");
		int[] arr = new int[N];
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		//유클리드 호제법을 이용한 첫번째 스텝
		int ans = gcd(arr[0], arr[1]);
		
		//gcd(a, b, c) = gcd(gcd(a, b),c)를 응용한 for문 작성
		//이 반복문을 이용하여 셋 이상의 정수의 최대공약수 결정
		for (int i = 2; i < N; i++) {
			ans = gcd(ans, arr[i]);
		}
		System.out.println(ans);
	}
	
	
	//유클리드 호제법 메소드 선언
	static int gcd(int a, int b) {
		//a와 b 크기 비교 안해도 됨: 어차피 a가 b보다 작으면 그대로 나머지로 나오기 때문
		while (a%b != 0) {
			a = a%b;
			int temp = a;
			a = b;
			b = temp;
		}
		return b;
	}
	
	//유클리드 호제법 순환
	
	/*
	 * static int gcd(int a, int b) { 
	 * if(a%b == 0) return b; 
	 * return gcd(b, a%b); 
	 * }
	 */
}
