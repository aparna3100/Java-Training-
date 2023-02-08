package sample.first;

import java.util.Scanner;

public class SumAverage 
{
	int c;
	public void sum(int a,int b)
	{
		 c = a+b;
		 System.out.println("sum: "+c);
	}
	public float average()
	{
		float avg = c/2;
		return avg;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		SumAverage obj = new SumAverage();
		obj.sum(num1,num2);
		float result = obj.average();
		System.out.println("average: "+result);
		
	}

}
