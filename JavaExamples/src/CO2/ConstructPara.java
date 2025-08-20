package CO2;

public class ConstructPara {
	ConstructPara(int d)
	{
		System.out.print("Parameter Constructor  "+d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructPara c = new ConstructPara(7);
		System.out.println(c);
	}

}
