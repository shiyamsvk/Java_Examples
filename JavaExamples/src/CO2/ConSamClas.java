package CO2;

public class ConSamClas {
	int id;
	String name;
	
	ConSamClas()
	{
		this("Chain of Same class Constructor");
	}
	ConSamClas(String name)
	{
		this(name,10);
	}
	ConSamClas(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	public int getId() {
		return id;
	}	
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConSamClas c = new ConSamClas();
		System.out.print("ID "+c.getId());
		System.out.print("\n Name "+c.getName());		
	}
}
