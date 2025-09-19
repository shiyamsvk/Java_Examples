package OOP_CO3.Collections;

@FunctionalInterface
interface CalcDemo {
	int calc(int a, int b);
}

@FunctionalInterface
interface printDemo{
String print(String s);
}

class Calcultor {
	CalcDemo add() {
		return (a, b) -> a + b;	}
	CalcDemo sub() {
		return (a, b) -> a + b;	}
	CalcDemo div() {
		 return (a,b)-> a /b;	}
	printDemo prints() {
		return (s1) ->s1;	}}
public class functionalInterfaceDemo {
	public static void main(String[] args) {
		Calcultor c=new Calcultor();
		CalcDemo cal1=c.add();
		System.err.println(cal1.calc(10, 20));
		CalcDemo cal2=c.div();
		System.err.println(cal2.calc(20, 5));		
		
		printDemo p=c.prints();
		System.err.println(p.print("Hii"));
	}
}
