class Customer{
	private boolean needHelp;
	private int customerMoney;
	private int cntOrderFood;
	private int cntOrderDrink;
	private int orderNumber;
	
	Customer(int money, boolean needHelp){
		customerMoney = money;
		cntOrderFood = (int)(Math.random()*10 +1);
		cntOrderDrink = (int)(Math.random()*10 +1);
//		cntOrderFood = food;
//		cntOrderDrink = drink;
		this.needHelp = needHelp;
		
	}
	Customer(int money){
		customerMoney = money;
		cntOrderFood = (int)(Math.random()*10 +1);
		cntOrderDrink = (int)(Math.random()*10 +1);
//		cntOrderFood = food;
//		cntOrderDrink = drink;
		
	}
	
	int[] order() {
		int cntOrder[] = new int [2];
		cntOrder[0] = cntOrderFood;
		cntOrder[1] = cntOrderDrink;
		return cntOrder;
		
	}
	public boolean getNeedHelp() {
		return needHelp;
	}
	public int getCustomerMoney() {
		return customerMoney;
	}
	public void setCustomerMoney(int customerMoney) {
		this.customerMoney = customerMoney;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	
}
