import java.util.Scanner;

public class Main {

	public static void main(String[] args) { //entry point ������, �������� �����ϴ� ��ġ
		// TODO Auto-generated method stub
		System.out.println("�Ҽ� �Ǻ���");
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int N = sc.nextInt();
		
		int sqrtN = (int)Math.sqrt(N); //N�� �ڵ� ����ȯ �ǰ� int�� ���� ĳ������
		
		boolean prime = true; //������������ false
		for(int i =2; i <= sqrtN; i++) {
			if(N % i == 0) {
				prime = false;
				break;
			}
		}
		
		if(prime)
			System.out.println(N+"��(��) �Ҽ��Դϴ�");
		else
			System.out.println(N+"��(��) �Ҽ��� �ƴմϴ�");
		
		sc.close();
	}

}
