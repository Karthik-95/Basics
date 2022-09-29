package day4;

public class Demo5 {
	public static void main(String[]args) {
		String[]a=args[0].split(",");
		int l=a.length;
		int b=Integer.parseInt(a[0]);
		int c=Integer.parseInt(a[1]);
		int d=Integer.parseInt(a[2]);
		int e=Integer.parseInt(a[3]);
		int f=Integer.parseInt(a[4]);
		int t=b+c+d+e+f;
		int avg=t/l;
		System.out.println(avg);
		
	}

}
