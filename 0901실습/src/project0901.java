import java.util.Scanner;

public class project0901 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 0;
		int menu = 5;

		
		while (menu != 4) {
			System.out.println();
			System.out.println("****************");
			System.out.println("***  ATM�ӽ�  ***");
			System.out.println("***          ***");
			System.out.println("***  1. ����  ***");
			System.out.println("***  2. ���  ***");
			System.out.println("***  3. ��ȸ  ***");
			System.out.println("***  4. ����  ***");
			System.out.println("****************");
			System.out.println();
			System.out.print("menu > ");
			Scanner num = new Scanner(System.in);
			menu = num.nextInt();
			switch(menu) {
			case 1:
				System.out.print("�Ա�(����) > ");
				int input = num.nextInt();
				money = money+input;
				continue;
			case 2:
				System.out.print("���(����) > ");
				int output = num.nextInt();
				
				if (money < output) System.out.println("�ܾ��� �����մϴ�");
				else money = money-output;
				continue;
			case 3:
				System.out.println("�ܾ� "+ money+ "����");
				continue;
			case 4:
				break;
			default:
				System.out.println("�޴��� �ִ� ���ڸ� �Է����ּ���");
				
			num.close();
				
			}
		}

	}

}
