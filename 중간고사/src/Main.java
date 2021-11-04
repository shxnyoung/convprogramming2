import java.util.Scanner;

class Leaf{
	private int time;
	Leaf(int time){
		this.time = time;
	}
	void show() {
		System.out.println("태양 빛: "+ time + "분");
	}
}

class Plants{
	private int water;
	Leaf leaf;
	Plants(int water, int time){
		leaf = new Leaf(time);
		this.water = water;
	}
	void show() {
		System.out.print("물: "+ water + "l, ");
		leaf.show();
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1번");
		System.out.print("1) 설정값 입력 > ");
		int num = sc.nextInt();
		System.out.printf("0x%08x\n", num);
		System.out.print("2) 설정할 비트 위치(32~1) > ");
		int a = sc.nextInt();
		num = num | (1 << (a-1));
		System.out.printf("0x%08x\n", num);
		
		System.out.println("\n2번");
		System.out.print("1) 2차원배열 가로, 세로 입력 > ");
		int col = sc.nextInt();	//가로크기 = 열의 개수
		int row = sc.nextInt();	//세로길이 = 행의 개수
		int arr[][] = new int[row][col];
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
		
		System.out.println("2)");
		int arr90[][]  = new int[col][row];
		
		for (int i = 0 ; i < arr90.length; i ++) {
			for(int j = 0; j < arr90[i].length; j++) {
				arr90[i][j] = arr[row-1-j][i]; 
				System.out.print(arr90[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n3번");
		System.out.print("1)");
		Leaf leaf = new Leaf(250);
		leaf.show();
		
		System.out.print("2)");
		Plants basil = new Plants(20,300);
		basil.show();
		
		sc.close();
	}

}
