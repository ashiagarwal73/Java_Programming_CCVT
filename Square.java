import java.util.Scanner;


public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		int square[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter new number");
			arr[i]=sc.nextInt();
			square[i]=arr[i]*arr[i];
		}
		System.out.println("Square of each number is ");
		for(int i=0;i<10;i++)
		{
			
			System.out.println(square[i]);
		}
		sc.close();
		
	}

}
