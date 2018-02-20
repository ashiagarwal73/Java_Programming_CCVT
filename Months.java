import java.util.Scanner;


public class Months {
	
	public static void main(String args[])
	{
		System.out.print("Enter Month");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String month[]={"0","January","Feburary","March","April","May","June","July","August","September","October","November","December"};
		if(a>0&&a<=12)
		{
			System.out.print("Month name is :"+month[a]);
		}
		else
		{
			System.out.print("Not Valid month");
		}
		sc.close();
	}
	
}
