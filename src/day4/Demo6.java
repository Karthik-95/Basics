package day4;

public class Demo6 {
	public static void main(String[]args) {
		String[]a=args[0].split(",");
		String b=a[0].concat(a[1]).concat(a[2]);
		String c=b.toUpperCase();
		System.out.println(c);
	}

}
