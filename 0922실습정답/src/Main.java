import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("실습과제: 비트연산");
		
		int i = 0, flag = 0;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("i(1~12) > ");
			i = sc.nextInt();
			if (i == 13)
				break;
			flag = flag | (1 << (i-1));
			System.out.printf("%03x\n", flag);
		}
		System.out.println("비트설정 종료");
		sc.close();
	}

}
