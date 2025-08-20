package CO2;
class parent
{
	int y;
}
class child extends parent
{
	int x;
}
public class Inheritnse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c = new child();
		c.x=4;
		c.y=3;
		c.y=c.x*c.y;
		System.out.println("Inheritance  "+c.y);
	}
}
