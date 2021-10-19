import java.util.Scanner;

public class Main {

	public static void main(String[] args) { //entry point 시작점, 컴파일을 시작하는 위치
		// TODO Auto-generated method stub
		System.out.println("소수 판별법");
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int N = sc.nextInt();
		
		int sqrtN = (int)Math.sqrt(N); //N은 자동 형변환 되고 int로 강제 캐스팅함
		
		boolean prime = true; //나눠떨어지면 false
		for(int i =2; i <= sqrtN; i++) {
			if(N % i == 0) {
				prime = false;
				break;
			}
		}
		
		if(prime)
			System.out.println(N+"은(는) 소수입니다");
		else
			System.out.println(N+"은(는) 소수가 아닙니다");
		
		sc.close();
	}

}
