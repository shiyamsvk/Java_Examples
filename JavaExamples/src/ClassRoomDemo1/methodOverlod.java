package ClassRoomDemo1;

public class methodOverlod {

	public int a, b;
	public float c;

	public methodOverlod() {
		this.a = 0;
		this.b = 0;
		this.c = 0.0f;
	}

	public methodOverlod(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		// this.c=c;
	}
	int add(int a, int b) {
		return a + b;
	}
	int add(int a, int b, float c) {
		return (int) ((int) a + b + c);	}
	int add() {
		return this.a + this.b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverlod m = new methodOverlod(55,66);
		System.out.println(m.add(5, 6));
		System.err.println(m.add(6, 98, 25.5f));
		System.err.println(m.add());
		methodOverlod m1 = new methodOverlod(66, 75);
		System.err.println(m1.add());
	}

}
