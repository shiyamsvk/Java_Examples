package CO2;
class encap
{
	int p;	
	public int getP() {
		return p;
	}	
	public void setP(int p) {
		this.p = p;
	}	
}
public class Encapsulat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encap e = new encap();
		e.setP(65);
		System.out.println("Get method  "+e.getP());
	}
}
