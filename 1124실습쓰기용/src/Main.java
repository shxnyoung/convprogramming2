import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte data[] = new byte[50];	//������ ���� �迭 ����
		int size;	//���� ������ ������ size ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("(�ߺ�����)���������Է�> ");
		size = sc.nextInt();
		
		//�ߺ����� ���� �߻���
		for(int i = 0; i < size; i++) {
			data[i]= (byte)(Math.random()*90 + 10  );	//10~99
			for(int j = 0; j < i; j++) {
				if(data[i] == data[j]) {
					i--;	//i�� 1��ŭ ���̰�
					j=i;	//j�� i�� �����Ͽ� �ٽ� ���� �ݺ������� ���ư� ���� ����
				}
			}
		}
		
		
		sc.close();
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\psh99\\Documents\\21-2\\test.txt");
			for(int i = 0; i < size; i++)
				fout.write(data[i]);	//���Ͽ� ������ ���� ����
			fout.close();
		}catch(IOException e) {
			System.out.println("\n������ �� �����ϴ�. ��θ� Ȯ�����ּ���");
			return;
		}
		System.out.println("\n���� ���� �Ϸ�");
		
		for(int i = 0; i < size; i++) {
			System.out.print(data[i] + " ");
		}
				
	}
	

}
