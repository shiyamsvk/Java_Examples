package CO2;
abstract class abst
{
	abstract void prt();
	
	public void print()
	{
		System.err.println("HI");
	}
}
class chd extends abst
{
	void prt()
	{
		System.out.println("Abstract method");
	}

}
class bro extends abst
{
	void prt()
	{
		System.out.println("Abstract");
	}
}
public class Abstrat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chd c = new chd();
		c.prt();
		bro b = new bro();
		b.prt();
	}
}
