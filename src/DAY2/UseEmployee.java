package DAY2;

public class UseEmployee {
	public static void main(String[]args) {
		Employee s1=new Employee();
		s1.employeeid=101;
		s1.employeename="karthik";
		s1.dateofbirth="11.01.1996";
		s1.mobileno=9600635501l;
		System.out.println("Employee name : "+s1.employeename);
		System.out.println("Employe Id : "+s1.employeeid);
		System.out.println("D.O.B : "+s1.dateofbirth);
		System.out.println("MOBILE NO : +91 "+s1.mobileno);
		Employee s2=new Employee();
		s2.employeeid=102;
		s2.employeename="ravi";
		s2.dateofbirth="09.07.1996";
		s2.mobileno=9512345678l;
		System.out.println("Employee name : "+s2.employeename);
		System.out.println("Employee Id : "+s2.employeeid);
		System.out.println("D.O.B : "+s2.dateofbirth);
		System.out.println("Mobile No : "+s2.mobileno);
		
	}

}
