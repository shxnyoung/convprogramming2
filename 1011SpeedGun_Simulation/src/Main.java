
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("OOAD (스피드건 모의실험)");
		Car Sonata = new Car();
		System.out.println("Highest Speed: "+Sonata.getHighestSpeed() +"Km");
		//System.out.println("\t현재속도: "+Sonata.currentSpeed() + "Km");
		int n = Sonata.Navi.find(); //소나타 내의 내비에 경로 요청하여 경로 개수 저장
		Sonata.Navi.monitor();
		
		System.out.println("\n---------------- speedgun monitor -------------------");
		//simulation
		for (int i = 1; i <= n; i++) {	//목적지까지 각각의 도로와 스피드건을 지나간다
			//도로 생성 -> 해당 도로의 제한속도 만들어짐
			Road road = new Road();	//디폴트 생성자
			//스피드건 생성
			SpeedGun speedgun = new SpeedGun();
			
			
			//도로에서의 차량의 속도위반여부
			//System.out.print("도로명" + i + "\t 제한속도: "+ road.getLimit());
			System.out.print("Road"+i);
			//스피드건 -> 차의 속도 얻어오는 message passing
			speedgun.shot(Sonata);
			//스피드건 -> monitor()로 위반 여부 비교하는 message passing
			speedgun.monitor(road);
			
			
		}
		
		/*
		Navigator iNavi = new Navigator();
		iNavi.find(); //목적지까지 경로 요청해서 경로 찾기
		iNavi.monitor(); //결과를 보여주기
		*/
	}

}
