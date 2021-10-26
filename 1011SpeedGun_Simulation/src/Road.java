
class Road {
	private int limit;
	Road(){ //도로의 제한속도 생성
		int a = (int)(Math.random() * 4) + 1; //4가지 종류
		switch(a) {
		case 1:
			limit = 60;
			break;
		case 2:
			limit = 70;
			break;
		case 3:
			limit = 80;
			break;
		case 4:
			limit = 100;
			break;
		}
	}
	
	
	int getLimit() {
		return limit;
	}
}
