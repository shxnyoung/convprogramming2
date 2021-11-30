public class Main {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Staff staff = new Staff(30);
		Kitchen kitchen = new Kitchen(30);
		
		Customer a = new Customer(50000);
		Kiosk kiosk = new Kiosk(a);
		if(kiosk.check(staff, kitchen,a))
			staff.serve(a);
		System.out.println();
		
	
		Customer b = new Customer(20000);
		Kiosk kiosk2 = new Kiosk(b);
		if(kiosk2.check(staff, kitchen, b))
			staff.serve(b);
		
		System.out.println();
		
		Customer c = new Customer(100000, true);
		Kiosk kiosk3 = new Kiosk(c);
		if(kiosk3.check(staff, kitchen, c))
			staff.serve(b);

	}

}
