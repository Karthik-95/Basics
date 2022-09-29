package DAY2;

public class UseShirt {
	public static void main(String[]args) {
		Shirt s1=new Shirt();
		s1.brand="OTTO";
		s1.price=500;
		s1.colour="BLACK";
		s1.dispercent=10;
		s1.taxpercent=5;
		s1.disamound=s1.price*s1.dispercent/100;
		s1.taxamound=s1.price*s1.taxpercent/100;
		s1.netprice=s1.price+s1.taxamound-s1.disamound;
		System.out.println("NET PRICE= "+s1.netprice+" Rs");
	
	}

}
