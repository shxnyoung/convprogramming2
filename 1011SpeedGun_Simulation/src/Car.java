
class Car {
	private int highestSpeed;
	Navigator Navi;		//��������, field ���� ����
	Car(){ 	//������
		highestSpeed = 140 + 10 * (int)(Math.random()*8);
		Navi = new Navigator();
	}
	int getHighestSpeed() {
		return highestSpeed;
	}
	int currentSpeed() { //����ӵ� ��ȯ
		return (int)(Math.random() * highestSpeed + 1); //1���� �ְ�ӵ����� ����
		
	}
}
