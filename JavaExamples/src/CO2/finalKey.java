package CO2;
class fin
{
	public final void cal()
	{
		System.out.println("Final method");
	}
}
public class finalKey{
	public static void main(String[] args) {		
		final int d = 40;
		System.out.print("Final keyword  "+d+"\n");
//		d=45;
//		int c=0;
//		System.out.print("Final keyword  "+c+"\n");
		fin f = new fin();
		f.cal();
	}
}
