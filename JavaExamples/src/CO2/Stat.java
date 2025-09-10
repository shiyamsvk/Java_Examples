package CO2;

public class Stat {
	final static int m=8;
	static void cal()
	{
		System.out.println("Static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cal();
		//m=7;
		System.out.println("\n  "+m);
	}
}
