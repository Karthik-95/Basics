package day4;

public class Demo4 {
	public static void main(String[]args) {
		String[]a=args[0].split(",");
		int b=Integer.parseInt(a[0]);
		int c=Integer.parseInt(a[1]);
		int d=Integer.parseInt(args[1]);
		int e=Integer.parseInt(args[2]);
		int f=b+e;
		int g=c+d;
		int h=f*g;
		System.out.println(h);
	}

}
