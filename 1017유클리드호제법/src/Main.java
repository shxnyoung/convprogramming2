import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("유클리드 호제법");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
	
		int ans = gcd(M,N);
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
}
