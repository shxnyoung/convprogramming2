import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte data[] = new byte[50];	//난수를 넣을 배열 생성
		int size;	//난수 개수를 저장할 size 지정
		
		Scanner sc = new Scanner(System.in);
		System.out.print("(중복없는)난수개수입력> ");
		size = sc.nextInt();
		
		//중복없는 난수 발생기
		for(int i = 0; i < size; i++) {
			data[i]= (byte)(Math.random()*90 + 10  );	//10~99
			for(int j = 0; j < i; j++) {
				if(data[i] == data[j]) {
					i--;	//i를 1만큼 줄이고
					j=i;	//j에 i를 대입하여 다시 상위 반복문으로 돌아가 난수 생성
				}
			}
		}
		
		
		sc.close();
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\psh99\\Documents\\21-2\\test.txt");
			for(int i = 0; i < size; i++)
				fout.write(data[i]);	//파일에 생성한 난수 쓰기
			fout.close();
		}catch(IOException e) {
			System.out.println("\n저장할 수 없습니다. 경로를 확인해주세요");
			return;
		}
		System.out.println("\n파일 저장 완료");
		
		for(int i = 0; i < size; i++) {
			System.out.print(data[i] + " ");
		}
				
	}
	

}
