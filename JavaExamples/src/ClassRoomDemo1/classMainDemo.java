package ClassRoomDemo1;

import java.util.Scanner;
import ClassRoomDemo.classObjectDemo;

public class classMainDemo {

	public static void main(String a[]) {
		classObjectDemo demo = new classObjectDemo();
		demo.printValues();
		demo.a = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++)
			demo.a[i] = sc.nextInt();

		demo.printValues();
	}

}
