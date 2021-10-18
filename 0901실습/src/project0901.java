import java.util.Scanner;

public class project0901 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 0;
		int menu = 5;

		
		while (menu != 4) {
			System.out.println();
			System.out.println("****************");
			System.out.println("***  ATM머신  ***");
			System.out.println("***          ***");
			System.out.println("***  1. 예금  ***");
			System.out.println("***  2. 출금  ***");
			System.out.println("***  3. 조회  ***");
			System.out.println("***  4. 종료  ***");
			System.out.println("****************");
			System.out.println();
			System.out.print("menu > ");
			Scanner num = new Scanner(System.in);
			menu = num.nextInt();
			switch(menu) {
			case 1:
				System.out.print("입금(만원) > ");
				int input = num.nextInt();
				money = money+input;
				continue;
			case 2:
				System.out.print("출금(만원) > ");
				int output = num.nextInt();
				
				if (money < output) System.out.println("잔액이 부족합니다");
				else money = money-output;
				continue;
			case 3:
				System.out.println("잔액 "+ money+ "만원");
				continue;
			case 4:
				break;
			default:
				System.out.println("메뉴에 있는 숫자를 입력해주세요");
				
			num.close();
				
			}
		}

	}

}
