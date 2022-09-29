package DAY2;

public class UseAccountHolder {
	public static void main(String[]args) {
		AccountHolder a1=new AccountHolder();
		a1.name="mano";
		a1.age=26;
		a1.genter="male";
		a1.accountnumber=28330485612583l;
		a1.monthlyincome=21000;
		a1.savingpercentage=18;
		a1.savingamount=a1.monthlyincome*a1.savingpercentage/100;
		System.out.println(a1.name+" saving amount = "+a1.savingamount);
		AccountHolder a2=new AccountHolder();
		a2.name="savithri";
		a2.age=25;
		a2.genter="female";
		a2.accountnumber=28330485612584l;
		a2.monthlyincome=20000;
		a2.savingpercentage=20;
		a2.savingamount=a2.monthlyincome*a2.savingpercentage/100;
		System.out.println(a2.name+" saving amount = "+a2.savingamount);
		AccountHolder a3=new AccountHolder();
		a3.name="kamban";
		a3.age=30;
		a3.genter="male";
		a3.accountnumber=28330485612585l;
		a3.monthlyincome=30000;
		a3.savingpercentage=10;
		a3.savingamount=a3.monthlyincome*a3.savingpercentage/100;
		System.out.println(a3.name+" saving amount = "+a3.savingamount);
		
	}

}
