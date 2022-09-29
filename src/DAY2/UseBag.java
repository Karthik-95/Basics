package DAY2;

public class UseBag {
	public static void main(String[]args) {
		Bag b1=new Bag();
		b1.brand="TYCON";
		b1.price=999;
		b1.disPer=20;
		b1.disAmt=b1.price*b1.disPer/100;
		System.out.println("DISCOUNT AMOUND = "+b1.disAmt+" rs");
	}

}
