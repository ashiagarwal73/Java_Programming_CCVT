package test;

public class ElectricityBill {
	String cust_name;
	int cust_num;
	int unit;
	public void setData(String cust_name,int cust_num,int unit)
	{
		this.cust_name=cust_name;
		this.cust_num=cust_num;
		this.unit=unit;
	}
	public void show()
	{
		System.out.println("Customer num is "+cust_num);
		System.out.println("Customer name is "+cust_name);
		System.out.println("Unit consumed  is "+unit);
	}
	public double billCalculate()
	{
		double bill;
		if(unit<=100)
		{
			bill=unit*1.20;
		}
		else if(unit>100&&unit<=300)
		{
			bill=(100*1.20)+((unit-100)*2);
		}
		else{
			bill=(100*1.20)+(200*2)+((unit-300)*3);
		}
		return bill;
	}
}
