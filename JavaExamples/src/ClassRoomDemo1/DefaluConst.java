package ClassRoomDemo1;

public class DefaluConst {
	int a;
	private DefaluConst()	{
		System.err.println("Defalut Called");
		a=0;
	}
	public DefaluConst(int a)	{
		super();
		System.err.println("parameter Called"+this.a);
		this.a=a;
	}
	
	public DefaluConst(DefaluConst d3)
	{
		super();
		System.err.println("Copy Called"+this.a);
		this.a=d3.a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DefaluConst d = new DefaluConst();
//		System.out.println(d.a);
//		d.a = 10;
//		System.out.println(d.a);
//		DefaluConst d1 = new DefaluConst(55);
//		System.out.println(d1.a);
		DefaluConst d2 = new DefaluConst(5);
		System.out.println("D1"+d2.a);
		DefaluConst d4 = new DefaluConst(d2);
		System.out.println("D"+d4.a);

	}

}
