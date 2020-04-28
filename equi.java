import java.util.Scanner;

class Persons {
	String name;
	float amount;
	
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
	Persons(String name,float amount)
	{
		this.amount=amount;
		this.name=name;
	}
	public String toString()
	{
		return getName() + "  have to pay  "+getAmount()+"Rs/-";
	}
	public Persons() {
		// TODO Auto-generated constructor stub
	}
}
public class equsplit {
	public static void main(String args[])
	{
		float amount;
		System.out.println("Enter the amount:");
		Scanner sc=new Scanner(System.in);
		amount=sc.nextFloat();
		System.out.println("enter the number of persons:");
		 // Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String d=sc.nextLine();
		  Persons p[]=new Persons[n];
		  for(int i=0;i<n;i++)
		  {
			  System.out.println("enter your Name:");
			  String s=sc.nextLine();
			   p[i]=new Persons(s,equiSplit(n,amount);
			  }
		  for(int i=0;i<n;i++)
			{
				System.out.println(p[i]);
			}  
		 
	}
	

}
public static void float(int n,float amount){
	return amount/n;
}
