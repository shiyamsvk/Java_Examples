package ClassRoomDemo1;

class parent {
	protected int a;
	parent(int a){
		this.a=a;
	}
	void display() {
		System.out.println("Parent Class: " + a);
	}}
class child extends parent{
	child(int a)	{
		super(a);
		}
	void display()	{
		super.display();
		System.out.println("Child class: "+super.a);
	}
}
 class grandSon extends child{

	grandSon(int a) {
		super(a);
		this.a =56;
		// TODO Auto-generated constructor stub
	}
	 void display()
	 {
		 super.display();
		 System.err.println("Grandson Class: "+a);
	 }
 }
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
grandSon gC = new grandSon(65);
gC.display();
	}

}
