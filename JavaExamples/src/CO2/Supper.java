package CO2;
class bases
{
	int w;
	bases(int w)
	{
		this.w=w;
	}
}
class subs extends bases
{
	subs(int w)
	{
		super(w);
		System.out.println(w);
	}
}
public class Supper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subs s = new subs(41);
		System.out.println(s);
	}
}
