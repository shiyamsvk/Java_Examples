package ClassRoomDemo1;

import java.util.Scanner;
//interface add
//{
//	public int add() ;
//}
//class addition implements add{
//	public int a,b;
//	@Override
//	public int add()
//	{
//		return this.a+this.b;
//	}
//	
//}
//class Addtions implements add
//{public int a,b,c;
//	@Override
//	public int add()
//	{
//		return this.a+this.b+this.c;
//	}
//}
public class runTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b;
float c;

Scanner sc=new Scanner(System.in);

a=sc.nextInt();
b=sc.nextInt();

//c=a/b;
//System.out.println("Divide:"+c);
try 
{
c=a/b;
System.out.println("Divide:"+c);
}
catch (ArithmeticException e)
{
	System.out.println(e.getMessage());
}


	}

}
