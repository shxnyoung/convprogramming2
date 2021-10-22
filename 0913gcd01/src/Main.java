import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("µÎ ¼öÀÇ ÃÖ´ë°ø¾à¼ö-³ª´°¼À¹ý");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.close();

		int gcd = 1;
		for (int i = 2; i <= N; i++) { //N°ªÀ» °è¼Ó ¹Ù²ãÁà¾ß ÇÔ
			while(M%i == 0 && N%i == 0) { //0ÀÌ ¾Æ´Ò¶§±îÁö °è¼Ó ³ª´®
				gcd *= i;
				M = M/i;
				N = N/i;
			}
		}
		System.out.println(gcd);
	}

}
