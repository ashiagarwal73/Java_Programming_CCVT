
public class CmdLineCalculator {
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		CmdLineCalculator cmd=new CmdLineCalculator();
		System.out.println("sum is "+cmd.sum(a, b));
		System.out.println("difference is "+cmd.difference(a, b));
		System.out.println("multiplication is "+cmd.multiply(a, b));
		System.out.println("division is "+cmd.divide(a, b));
	}
	int sum(int i,int j)
	{
		return i+j;
	}
	int difference(int i,int j)
	{
		return i-j;
	}
	int multiply(int i,int j)
	{
		return i*j;
	}
	double divide(int i,int j)
	{
		return i/j;
	}
}
