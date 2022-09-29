package day4;

public class UseWatch {
	public static void main(String[]args) {
		String[]a=args[0].split("-");
		String[]b=args[1].split("-");
		Watch w1=new Watch();
		w1.brand=a[0];
		w1.price=Integer.parseInt(a[1]);
		Watch w2=new Watch();
		w2.brand=b[0];
		w2.price=Integer.parseInt(b[1]);
		String n=a[0].concat(b[0]);
		String n1=n.toUpperCase();
		int t=w1.price+w2.price;
		System.out.println(n1);
		System.out.println(t);
	}

}
class Watch {
	String brand;
	int price;
	
}
