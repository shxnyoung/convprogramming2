class OrderList{
	private int orderNumber;
	int[] numOrder;

	OrderList(){
		orderNumber = (int)(Math.random()*100 + 1); //두자리수 랜덤 주문번호
		
	}

	public int[] getNumOrder(Customer customer) {
		numOrder = customer.order();
		return numOrder;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

}