

class Kiosk{
	private int foodPrice;
	private int drinkPrice;
	private int[] numOrder;
	private int[] numStock;
	private int totalPrice;
	private OrderList orderlist = new OrderList();
	
	Kiosk(Customer customer){
	foodPrice = 5600;
	drinkPrice = 2300;
	numOrder = orderlist.getNumOrder(customer);
	
}

	
	boolean stockStatus(Staff staff, Kitchen kitchen) {
		numStock = new int [2];
		numStock[0] = kitchen.getCntFood();
		numStock[1] = staff.getCntDrink();
		if (numStock[0] < numOrder[0] | numStock[1] < numOrder[1]) {
			System.out.println("��� �����մϴ�");
			return false;
		}
		else
			return true;
	}
	
	boolean payStatus(Customer customer) {
		int customerMoney = customer.getCustomerMoney();
		numOrder = orderlist.getNumOrder(customer);
		totalPrice = foodPrice * numOrder[0] + drinkPrice * numOrder[1];
		if (customerMoney < totalPrice) {
			System.out.println("�ܾ��� �����մϴ�");
			return false;
		}
		else {
			System.out.println("������ �Ϸ�Ǿ����ϴ�");
			customerMoney = customer.getCustomerMoney() - totalPrice;
			customer.setCustomerMoney(customerMoney);
			System.out.println("�ܾ� : " + customerMoney);
			return true;
		}
	}
	boolean check(Staff staff, Kitchen kitchen,Customer customer) {
		staff.checkNeedHelp(customer);
		System.out.println("�ֹ��� ���� ��: " + numOrder[0]);
		System.out.println("�ֹ��� ���� ��: " + numOrder[1]);
		if (stockStatus(staff, kitchen)) {
			if (payStatus(customer)) {
				//�ֹ�ǥ ����
				int ordernumber = orderlist.getOrderNumber();
				customer.setOrderNumber(ordernumber);
				staff.setOrderNumber(ordernumber);
				
				//��� ����
				kitchen.getOrderFood(staff,customer);
				kitchen.makeFood();
				staff.makeDrink(customer);
				
				return true;
			}
				
			else
				return false;
		}
		else
			return false;
	}
		
		
}