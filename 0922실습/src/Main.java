import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		byte flag = 0b000000000000;
		Scanner sc = new Scanner(System.in);
		
		while (num != 13) {
			System.out.print("i(1~12) > ");
			num = sc.nextInt();
			switch (num) {
			case 1:
				flag = (byte) (flag | 0b000000000001);
				System.out.printf("%03x\n",flag);
				break;
			case 2:
				flag = (byte) (flag | 0b000000000010);
				System.out.printf("%03x\n",flag);
				break;
			case 3:
				flag = (byte) (flag | 0b000000000100);
				System.out.printf("%03x\n",flag);
				break;
			case 4:
				flag = (byte) (flag | 0b000000001000);
				System.out.printf("%03x\n",flag);
				break;
			case 5:
				flag = (byte) (flag | 0b000000010000);
				System.out.printf("%03x\n",flag);
				break;
			case 6:
				flag = (byte) (flag | 0b000000100000);
				System.out.printf("%03x\n",flag);
				break;
			case 7:
				flag = (byte) (flag | 0b000001000000);
				System.out.printf("%03x\n",flag);
				break;
			case 8:
				flag = (byte) (flag | 0b000010000000);
				System.out.printf("%03x\n",flag);
				break;
			case 9:
				flag = (byte) (flag | 0b000100000000);
				System.out.printf("%03x\n",flag);
				break;
			case 10:
				flag = (byte) (flag | 0b001000000000);
				System.out.printf("%03x\n",flag);
				break;
			case 11:
				flag = (byte) (flag | 0b010000000000);
				System.out.printf("%03x\n",flag);
				break;
			case 12:
				flag = (byte) (flag | 0b100000000000);
				System.out.printf("%03x\n",flag);
				break;
			}
			
			
		}
		System.out.println("비트 설정 종료~");
		sc.close();
	}

}
