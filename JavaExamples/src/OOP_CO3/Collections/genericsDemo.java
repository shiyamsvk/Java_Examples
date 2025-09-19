package OOP_CO3.Collections;

class box<T >{
	
	T id;
	
	box(T id)
	{
		this.id=id;
	}
	
	void display()
	{
		System.out.println("Values of T: "+id);
	}
	
}

public class genericsDemo {
	public static void main(String[] args) {

		box<Integer> ls=new box<Integer>(5);
		box<String> ls1=new box<String>("Name");
		box<Double> ls2=new box<Double>(55.25);
		ls.display();
		ls1.display();
		ls2.display();
	}
}