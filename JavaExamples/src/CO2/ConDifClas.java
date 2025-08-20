package CO2;
class parnt
{
	String e;
	parnt()
	{
		this("");
		System.out.print("No parameter from parent");
	}
	parnt(String e)
	{
		this.e = e;
		System.out.print("Parameter from Parent  \n" );
	}
}
class chld extends parnt
{
	chld()
	{
		System.out.print("No argument from child");
	}
	chld(String x)
	{
		super(x);
		System.out.print("Parameter from child");
	}
}
public class ConDifClas {
	public static void main(String[] args) {		
		chld c = new chld("Contructor");
		System.out.println(c);
	}
}
