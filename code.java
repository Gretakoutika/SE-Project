import java.util.*;

class Person {
	String name;
	float amount;
	float balance;
	String payer;
	public String getPayer() {
		return payer;
	}
	public void setPayer(String payer) {
		this.payer = payer;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	//float amount;
	Person(String name,float amount,float balance,String payer)
	{	this.balance=balance;
		this.name=name;
		this.amount=amount;
		this.payer=payer;
	}
	public String toString()
	{
		return "\n Balance is "+getBalance()+"to be paid to"+getPayer();
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\\\\\\\\\\\\\\\\
	  System.out.println("enter the number of persons:");
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  Person p[]=new Person[n];
	  float total=0;
	  float eq;
	 
	  for(int i=0;i<n;i++)
	  {
		  System.out.println("enter your Name,Contribution:");
		  String s=sc.nextLine();
		  String sn3= sc.nextLine();
		  float a=sc.nextFloat();
		  p[i]=new Person(s,a,0,"");
		  total=total+a;
		 }
	  eq=total/n;
	  float bal[]=new float[n];
	  for(int i=0;i<n;i++)
	  {
		  bal[i]=eq-p[i].getAmount();
		  System.out.println(bal[i]);
	  }
	  Arrays.sort(bal);
	  for(int i=0;i<n;i++)
	  {
		  System.out.println(bal[i]);
	  }
	  for(int i=0,j=n-1;i<n;i++,j--)
	  {
		  if(bal[i]==0)
		{
			  p[i].setBalance(0);
			  p[i].setPayer(" None ");
		}
		  if(bal[i]<0 && bal[j]>0)
		  {
			  if((bal[j]+bal[i])==0)
			  {	String s=p[j].getName();
			  	//System.out.println(s);
				  p[i].setPayer(s);
				  p[i].setBalance(bal[i]);
			  }
			bal[j]=bal[j]+bal[i];
		  }
	  }
	for(int i=0;i<n;i++)
	{
		System.out.println(p[i]);
	}  
	  
	}
	public static float equiSplit(int n,float amount) {
		// TODO Auto-generated method stub
			return amount/n;
		}

}
public class equsplit {
	public static void main(String args[])
	{
		
		System.out.println("Enter the amount:");
		Scanner sc=new Scanner(System.in);
		float amount=sc.nextFloat();
		System.out.println("enter the number of persons:");
		int n=sc.nextInt();
		String d=sc.nextLine();
		Persons p[]=new Persons[n];
		  for(int i=0;i<n;i++)
		  {
			  System.out.println("enter your Name:");
			  String s=sc.nextLine();
			   p[i]=new Persons(s,equiSplit(n,amount));
			  }
		  for(int i=0;i<n;i++)
			System.out.println(p[i]);
	}
	
			
		public static float equiSplit(int n,float amount) {
		// TODO Auto-generated method stub
			return amount/n;
		}
	}
