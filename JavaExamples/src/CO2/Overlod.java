package CO2;
class OLoad
{
	public void som()
	{
		System.out.println("Empty parameter");
	}
	public void som(int p)
	{
		
		System.out.println("One parameter  "+p);
	}
}
public class Overlod {
	public static void main(String[] args) {		
		OLoad a = new OLoad();
		a.som();
		a.som(7);
	}
}
