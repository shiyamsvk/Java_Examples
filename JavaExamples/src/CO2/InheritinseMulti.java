package CO2;

class parents
{
	int d;
}
class elder extends parents
{
	int f;
}
class young extends elder
{
	int e;	
}
public class InheritinseMulti {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		young y = new young();
		y.d=5;
		y.f=8;
		y.e=y.d *y.f;
		System.out.println(y.e);
	}
}
