import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("소인수분해");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int N = sc.nextInt();
		sc.close();

		
		for (int i = 2; i <= N; i++) { //N값을 계속 바꿔줘야 함
			while(N%i == 0) { //0이 아닐때까지 계속 나눔
				System.out.print(i+" ");
				N = N/i;
			}
		}
	}

}
