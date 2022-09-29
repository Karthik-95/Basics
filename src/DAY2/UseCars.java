package DAY2;

public class UseCars {
	public static void main(String[]args) {
		Cars c1=new Cars();
		c1.brand="TOYOTA";
		c1.model="FORTUNER";
		c1.price=3000000;
		c1.colour="WHITE";
		c1.engine="DIESEL";
		Cars c2=new Cars();
		c2.brand="BMW";
		c2.model="BZ";
		c2.price=2000000;
		c2.colour="BLACK";
		c2.engine="PETROL";
		Cars c3=new Cars();
		c3.brand="HONDA";
		c3.model="BLAZE";
		c3.price=800000;
		c3.colour="BLUE";
		c3.engine="PETROL";
		Cars c4=new Cars();
		c4.brand="TATA";
		c4.model="NEXON";
		c4.price=2500000;
		c4.colour="RED";
		c4.engine="DIESEL";
		System.out.println("BRAND-"+c1.brand);
		System.out.println("MODEL-"+c1.model);
		System.out.println("PRICE-"+c1.price);
		System.out.println("COLOUR-"+c1.colour);
		System.out.println("ENGINE TYPE-"+c1.engine);
		System.out.println("BRAND-"+c2.brand);
		System.out.println("MODEL-"+c2.model);
		System.out.println("PRICE-"+c2.price+"/-");
		System.out.println("COLOUR-"+c2.colour);
		System.out.println("ENGINE TYPE-"+c2.engine);
		System.out.println("BRAND-"+c3.brand+"/"+c4.brand);
		System.out.println("MODEL-"+c3.model+"/"+c4.model);
		System.out.println("PRICE-"+c3.price+"/-"+c4.price);
		System.out.println("COLOUR-"+c3.colour+"/"+c4.colour);
		System.out.println("ENGINE TYPE-"+c3.engine+"/"+c4.engine);
		
		
	}

}
