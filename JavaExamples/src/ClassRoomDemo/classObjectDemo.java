package ClassRoomDemo;

import java.util.Scanner;

public class classObjectDemo {
	
	//Objects or Members of the class
	public int a[]= {1,2,4};
	
	public void readArray(int size)
	{		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < size; i++)
			a[i] = sc.nextInt();
	}
	//Member Function
	public void printValues()
	{
		for(int i : a ){
		System.out.println(i);}
	}
	
}