package ClassRoomDemo1;

public class interfaceDemo implements Shape, displayDemo {

	int rad;
	double area;

	public interfaceDemo(int rad) {
		// TODO Auto-generated constructor stub
		this.rad = rad;
	}

	@Override
	public void area() {
		area = 3.148 * rad * rad;
	}

	@Override
public void display() {
	// TODO Auto-generated method stub
	System.err.println(" Area of Circle: "+area);
}
	public static void main(String[] args) {
		 interfaceDemo demo=new interfaceDemo(5);
		 demo.area();
		 demo.display();
	}
}
