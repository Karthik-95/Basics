package DAY2;

public class UseSaree {
	public static void main(String[]args) {
		Saree s1=new Saree ();
		s1.item="SAREE 1";
		s1.price=2000;
		s1.dp=18;
		s1.tp=5;
		s1.da=s1.price*s1.dp/100;
		s1.ta=s1.price*s1.tp/100;
		s1.net=s1.price+s1.ta-s1.da;
		System.out.println(s1.item+" NET PRICE = "+s1.net+"rs");
		Saree s2=new Saree();
		s2.item="SAREE 2";
		s2.price=5000;
		s2.dp=25;
		s2.tp=18;
		s2.da=s2.price*s2.dp/100;
		s2.ta=s2.price*s2.tp/100;
		s2.net=s2.price+s2.ta-s2.da;
		System.out.println(s2.item+" NET PRICE = "+s2.net+"rs");
	}
}
