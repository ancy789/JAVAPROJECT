package constructor;

import java.util.Scanner;

interface Bank{
	public void accountdtails(String name);
	public void balance();
	public void withdrawal();
	public void deposit();
}
class SBI implements Bank
{
     int balance=20000;
    static String bname="SBI";
    Scanner sc=new Scanner(System.in);
    
    
    
	@Override
	public void accountdtails(String name) {
		
		System.out.println("Enter account no:");
		int ac=sc.nextInt();
		//System.out.println("Enter name:");
		//String name=sc.next();
		System.out.println("Account No="+ac);
		System.out.println("Account Name="+name);
		System.out.println("Bank name:"+bname);
		
	}

	@Override
	public void balance() {
		
		System.out.println(balance);
	}

	@Override
	public void withdrawal() 
	{
		
	    System.out.println("Enter an amount for withdrawal:");
		int a1=sc.nextInt();
		 balance=balance-a1;
		System.out.println("After withdrawal balance="+balance);
		
	}

	@Override
	public void deposit() 
	{
		    System.out.println("Enter an amount to deposit:");
			int a2=sc.nextInt();
			 balance=balance+a2;
			System.out.println("After deposit balance="+balance);
		
	}	
	
}

public class BankDetails {

	public static void main(String[] args) {
		
		SBI ob=new SBI();
		ob.accountdtails("Ancy");
		ob.balance();
		ob.withdrawal();
		ob.deposit();
		

	}

}
