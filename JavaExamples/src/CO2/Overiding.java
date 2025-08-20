package CO2;
class base
{
	public void over()
	{
		System.out.print("Base class");	
	}
}
class sub extends base
{
	public void over()
	{
		System.out.print("Sub class");	
	}
}
public class Overiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub s = new sub();
		s.over();

	}

}
