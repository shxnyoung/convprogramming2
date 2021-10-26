
class Car {
	private int highestSpeed;
	Navigator Navi;		//구성관계, field 값을 만듦
	Car(){ 	//생성자
		highestSpeed = 140 + 10 * (int)(Math.random()*8);
		Navi = new Navigator();
	}
	int getHighestSpeed() {
		return highestSpeed;
	}
	int currentSpeed() { //현재속도 반환
		return (int)(Math.random() * highestSpeed + 1); //1부터 최고속도까지 범위
		
	}
}
