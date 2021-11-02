import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ����, ���� ũ�� Ű �Է�
		System.out.print("2���� �迭 ����, ���� ũ�� �Է� > ");
		int row, col;
		Scanner sc = new Scanner(System.in);
		col = sc.nextInt(); //���� ũ�� = ���� ����
		row = sc.nextInt(); //���� ũ�� = ���� ����
		sc.close();
		
		//2. ������ ���� �����ϰ� 10~99
		int[][] arr = new int[row][col];
		for (int i = 0 ; i < row; i ++) {
			for(int j = 0; j < col; j++) {
				arr[i][j] = 10 + (int) (Math.random()*90);
			}
		}
		for (int i = 0 ; i < row; i ++) {
			for(int j = 0; j < col; j++) {
				System.out.print(arr[i][j]+ " "); 
				
			}
			System.out.println();
		}
		//3. 2���� �迭 -> 1���� �迭 : �̷�
		int[] arr_1d = new int[row*col];
		/*
		for (int i = 0 ; i < row; i ++) {
			for(int j = 0; i < col; j++) {
				arr_1d[i*col + j] = arr[i][j]; 
			}
		}
		for (int i = 0 ; i < row*col; i ++) {
			System.out.println(arr_1d[i] + " ");
		}
		*/
		//4. �޼ҵ�� ���� - �迭 ����
		//�޼ҵ� ȣ��
		arr_1d = d2tod1(arr);
		
		
		for (int i = 0 ; i < row*col; i ++) {
			System.out.print(arr_1d[i] + " ");
		}
	}
	static int[] d2tod1(int[][] a) {
		int row, col;
		row = a.length;
		col = a[0].length;
		int[] temp = new int[row*col];
		for (int i = 0 ; i < row; i ++) {
			for(int j = 0; j < col; j++) {
				temp[i*col + j] = a[i][j]; 
			}
		}
		return temp;
	}
}
