
class Navigator {
	private int shortestPath;
	//5������ 10�� �̳� ����
	int find() {
		shortestPath = 5 + (int)(Math.random() * 6);
		return shortestPath;
	}
	
	void monitor() {
		System.out.println("\n---------------- navigator monitor ------------------");
		System.out.println("    No. of roads in the shortest path: " + shortestPath +" roads");
		System.out.println("-----------------------------------------------------");
		
	}

}

