
class SpeedGun {
	private int theSpeed; //내부적으로 쓰기 위해서. 자동차의 현재 속도 잠깐 얻어와서 비교하기 위해 만듦
	
	void shot(Car car) {	//스피드건 -> 차 속도 메시지패싱
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
		//블랙박스화(캡슐화를 구현하기 위한 기능)
		
		ticket(limit);
	}
}
