package OOP_CO3.Exception;

public class examExcep {

	public static void main(String[] args) throws Exception{
		
		int a[]=new int[5];
		//a[0+4]=5;
		
		System.err.println(a[4]);
		int ab=55,b=0;
		try {
		int c=ab/b;
		System.out.println(c);
//			int a[]=new int[5];
			a[0+6]=5;
			
			System.err.println(a[4]);
			
		}
		catch(Exception e) {
		System.out.println(e);}
	}
}
