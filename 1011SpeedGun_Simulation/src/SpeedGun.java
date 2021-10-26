
class SpeedGun {
	private int theSpeed; //���������� ���� ���ؼ�. �ڵ����� ���� �ӵ� ��� ���ͼ� ���ϱ� ���� ����
	
	void shot(Car car) {	//���ǵ�� -> �� �ӵ� �޽����н�
		theSpeed = car.currentSpeed();
	}
	
	private void ticket(int limit) { 
		if (theSpeed > limit)
			System.out.println("\t*\t\t\tticketed by "+(theSpeed - limit) + "Km over");
	}
	
	void monitor(Road road) {
		int limit = road.getLimit();
		System.out.print("\tcurrent speed: "+theSpeed+"km\t");
		System.out.println("speed limit: "+limit+"km\t");
		//���ڽ�ȭ(ĸ��ȭ�� �����ϱ� ���� ���)
		
		ticket(limit);
	}
}
