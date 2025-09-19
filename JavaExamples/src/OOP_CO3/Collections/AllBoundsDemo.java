package OOP_CO3.Collections;

import java.util.ArrayList;
import java.util.List;

public class AllBoundsDemo {

	public static void main(String[] args) {
			// ---------- Unbounded ----------
//			Printer<Integer, String> p1 = new Printer<Integer,String>(1, "Shiyam");
//			p1.print();
//			Printer<String, String> p2 = new Printer<String,String>("1", "Shiyam");
//			p2.print();
			
//			// ---------- Upper Bound ----------
//			NumberPrinter<Integer> np1 = 
//					new NumberPrinter<>(100);
//			NumberPrinter<Double> np2 =
//					new NumberPrinter<>(3.14);
//			np1.print();
//			np2.print();
	
//		AllBoundsExample all=new AllBoundsExample();
////			// ---------- Lower Bound ----------
//			List<Integer> intList = new ArrayList<>();
//			List<Number> numList = new ArrayList<>();
//			all.addNumbers(intList);
//			all.addNumbers(numList);
	//
//			// ---------- Wildcard Upper Bound ----------
//			List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
//			printList(doubleList);
	//
			// ---------- Multiple Bounds ----------
			Demo d = new Demo();//show from demo
			B<Demo> b = new B<>(d);
			b.print();
//			B<String> b1 = new B<>("S");
//			b.print();
		}
	}