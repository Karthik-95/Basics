package DAY2;

public class UseBike {
	public static void main(String[]args) {
		Bike b1=new Bike();
		b1.brand="HONDA";
		b1.price=80000;
		b1.colour="BLACK";
		b1.capacity=120;
		b1.weight=150;
		b1.braketype="DISK";
		System.out.println("BRAND-"+b1.brand);
		System.out.println("PRICE-"+b1.price+"/-Rs");
		System.out.println("COLOUR-"+b1.colour);
		System.out.println("CAPACITY-"+b1.capacity+" CC");
		System.out.println("WEIGHT-"+b1.weight+" KG");
		System.out.println("BRAKE TYPE-"+b1.braketype);
	}

}
