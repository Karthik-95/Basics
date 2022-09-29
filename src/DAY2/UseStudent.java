package DAY2;

public class UseStudent {
	public static void main(String[]args) {
	Student s1=new Student();
	s1.name="siva";
	s1.id=234;
	s1.age=14;
	s1.std="9";
	s1.atper=75;
	s1.dayspre=240*s1.atper/100;
	System.out.println("NO.OF WORKING DAYS = "+s1.dayspre);
	Student s2=new Student();
	s2.name="mani";
	s2.id=236;
	s2.age=15;
	s2.std="10";
	s2.atper=80;
	s2.dayspre=240*s2.atper/100;
	System.out.println("NO.OF WORKING DAYS = "+s2.dayspre);
	Student s3=new Student();
	s3.name="valli";
	s3.id=237;
	s3.age=13;
	s3.std="8";
	s3.atper=90;
	s3.dayspre=240*s3.atper/100;
	System.out.println("NO.OF WORKING DAYS = "+s3.dayspre);
	
	
	}
	
	

}
