class Staff{
	private int cntDrink;
	private int orderNumber;
	private OrderList orderlist = new OrderList();
	
	Staff(int num){
		cntDrink = num;
	}
	
	public int getCntDrink() {
		return cntDrink;
	}
	public void setCntDrink(int cntDrink) {
		this.cntDrink = cntDrink;	
	}

	int getOrderedFood(Customer customer) {
		int[] ordered = orderlist.getNumOrder(customer);
		return ordered[0];
	}
	
	void makeDrink(Customer customer) {
		int[] ordered = orderlist.getNumOrder(customer);
		int drinkStock = cntDrink - ordered[1];
		setCntDrink(drinkStock);
		System.out.println("남은 음료 수: "+ drinkStock);
	}
	void checkNeedHelp(Customer customer) {
		boolean check = customer.getNeedHelp();
		if(check) 
			System.out.println("직원: 키오스크 사용을 도와드리겠습니다");
	}
	int setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
		return orderNumber;
	}
	void serve(Customer customer) {
		
		int cusCheck = customer.getOrderNumber();
		int kioskcheck = orderNumber;
		if (cusCheck == kioskcheck)
			System.out.println("직원: 주문하신 음식 나왔습니다");
		else
			System.out.println("직원: 잠시만 기다려주세요");
	}

}