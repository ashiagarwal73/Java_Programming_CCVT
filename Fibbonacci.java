package test;
public class Fibbonacci {
	public static void main(String args[])
	{
		int a=0;
		int b=1;
		int n=10;
		System.out.print(a+" ");
		System.out.print(b+" ");
		while(n!=2)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			n--;
		}
	}
}
