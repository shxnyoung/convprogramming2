
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("OOAD (���ǵ�� ���ǽ���)");
		Car Sonata = new Car();
		System.out.println("Highest Speed: "+Sonata.getHighestSpeed() +"Km");
		//System.out.println("\t����ӵ�: "+Sonata.currentSpeed() + "Km");
		int n = Sonata.Navi.find(); //�ҳ�Ÿ ���� ���� ��� ��û�Ͽ� ��� ���� ����
		Sonata.Navi.monitor();
		
		System.out.println("\n---------------- speedgun monitor -------------------");
		//simulation
		for (int i = 1; i <= n; i++) {	//���������� ������ ���ο� ���ǵ���� ��������
			//���� ���� -> �ش� ������ ���Ѽӵ� �������
			Road road = new Road();	//����Ʈ ������
			//���ǵ�� ����
			SpeedGun speedgun = new SpeedGun();
			
			
			//���ο����� ������ �ӵ����ݿ���
			//System.out.print("���θ�" + i + "\t ���Ѽӵ�: "+ road.getLimit());
			System.out.print("Road"+i);
			//���ǵ�� -> ���� �ӵ� ������ message passing
			speedgun.shot(Sonata);
			//���ǵ�� -> monitor()�� ���� ���� ���ϴ� message passing
			speedgun.monitor(road);
			
			
		}
		
		/*
		Navigator iNavi = new Navigator();
		iNavi.find(); //���������� ��� ��û�ؼ� ��� ã��
		iNavi.monitor(); //����� �����ֱ�
		*/
	}

}
