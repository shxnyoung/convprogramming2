import java.io.FileInputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte data[] = new byte[50];
		int n = 0, temp;
		
		try {
			FileInputStream fin = new FileInputStream("C:\\\\Users\\\\psh99\\\\Documents\\\\21-2\\\\test.txt");
			
			while((temp=fin.read()) != -1) {	//���̻� ���� ���� ������ -1�� return�ϰ� while�� ����
				data[n++] = (byte)temp;	//temp=fin.read()�̱� ������ data�迭�� �������� ���δ�
			}
			fin.close();
			
		}catch(Exception e) {
			System.out.println("����¿���");
			return;
		}
		for(int i = 0; i < n; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("\n�����б�Ϸ�!");
	}
//	public static void main(String[] arts) {
//		FileReader fin = null;
//		int c;
//		byte b[] = new byte[9];
//		try {
//			fin = new FileReader ("C:\\\\Users\\\\psh99\\\\Documents\\\\21-2\\\\test.txt");
//			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
//			int n = 0;
//			while((c = fin.read()) != -1) {
//				out.write(c);
//				b[n] = (byte)c;
//				n++;
//				
//			}
//			new Scanner(System.in).nextLine();
//			out.flush();
//			fin.close();
//			out.close();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//				
//	}

}