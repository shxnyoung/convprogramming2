class Kitchen{
	private int cntFood ;	
	private int orderedFood;
	
	Kitchen(int num){
		cntFood = num;
	}
	public int getCntFood() {
		return cntFood;
	}

	public void setCntFood(int cntFood) {
		this.cntFood = cntFood;
	}
	void getOrderFood(Staff staff, Customer customer) {
		orderedFood = staff.getOrderedFood(customer);
	}
	void makeFood() {
		int FoodStock = cntFood -orderedFood ;
		setCntFood(FoodStock);
		System.out.println("남은 음식 수: "+ FoodStock);
	}


}