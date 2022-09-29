package day4;

public class UseStudents {
	public static void main(String[]args) {
		String[]a=args[0].split(",");
		String[]b=args[1].split(",");
		Student s1=new Student();
		s1.n=a[0];
		s1.r=Integer.parseInt(a[1]);
		s1.p=Boolean.parseBoolean(a[2]);
		Student s2=new Student();
		s2.n=b[0];
		s2.r=Integer.parseInt(b[1]);
		s2.p=Boolean.parseBoolean(b[2]);
		System.out.println(s1.n);
		System.out.println(s1.r);
		System.out.println(s1.p);
		System.out.println(s2.n);
		System.out.println(s2.r);
		System.out.println(s2.p);
		
	}

}
class Student{
	String n;
	int r;
	boolean p;
	
}
