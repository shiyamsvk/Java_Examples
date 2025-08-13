package ClassRoomDemo;

public class mainArrDemo {
	public static void main(String[] args) {
		
		arrayDemo a = new arrayDemo();
		
		int[] copy = a.getNums();
		
		System.out.println("Copy Numbers: ");
		for (int i : copy)
			System.out.println(i);
		
		System.out.println("Inside Operations ");
		
		// a.printSummary();
		a.sum();
		a.printSummary();
		
	}
}