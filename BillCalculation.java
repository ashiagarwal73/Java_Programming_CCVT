package test;

public class BillCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricityBill eb=new ElectricityBill();
		ElectricityBill eb2=new ElectricityBill();
		eb.setData("Ashi", 1, 200);
		eb2.setData("Arshiya", 2, 400);
		eb.show();
		System.out.println("BILL IS "+eb.billCalculate());
		eb2.show();
		System.out.println("BILL IS "+eb2.billCalculate());
	}

}
