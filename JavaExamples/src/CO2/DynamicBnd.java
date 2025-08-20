package CO2;
class Dyn
{
	public void sum()
	{
		System.out.println("Dyn class");
	}
}
class Dchild extends Dyn
{
	public void sum()
	{
		System.out.println("Dchild class");
	}
}
public class DynamicBnd {
	public static void main(String[] args) {		
		Dyn d = new Dchild();
		d.sum();
	}
}
