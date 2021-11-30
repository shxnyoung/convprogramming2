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
		System.out.println("���� ���� ��: "+ drinkStock);
	}
	void checkNeedHelp(Customer customer) {
		boolean check = customer.getNeedHelp();
		if(check) 
			System.out.println("����: Ű����ũ ����� ���͵帮�ڽ��ϴ�");
	}
	int setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
		return orderNumber;
	}
	void serve(Customer customer) {
		
		int cusCheck = customer.getOrderNumber();
		int kioskcheck = orderNumber;
		if (cusCheck == kioskcheck)
			System.out.println("����: �ֹ��Ͻ� ���� ���Խ��ϴ�");
		else
			System.out.println("����: ��ø� ��ٷ��ּ���");
	}

}