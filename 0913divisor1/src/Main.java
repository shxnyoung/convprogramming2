import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("약수 구하기");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int N = sc.nextInt();
		sc.close();
		
		System.out.print(N+"의 약수는 [1, ");
		//2부터 n/2까지 나눠떨어지는것 출력
		for (int i = 2; i <= N/2; i++) {
			if(N%i == 0)
				System.out.print(i+ ", ");
		}
		
		
		System.out.println(N+"]");
	}

}
