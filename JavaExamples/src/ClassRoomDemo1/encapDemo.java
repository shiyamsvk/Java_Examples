package ClassRoomDemo1;

public class encapDemo {

	private int Id;
	private String name;
	protected int RegNo;
	
	
	private encapDemo() {
		// TODO Auto-generated constructor stub
		this.Id=0;
		this.name=null;
	}
	public encapDemo(int Id)
	 {
		 super();
		 this.Id=Id;
		// this.name=name;
	 }
	 public encapDemo(int Id, String name)
	 {
		 this.Id=Id;
		 this.name=name;
	 }
	 
	 public int getId()
	 {
		 return this.Id;
	 }
	 
	 public void setId(int Id) {
	 this.Id=Id;
	 }
	 
	 public String getName()
	 {
		 return this.name;
	 }
	 
	 public void setName(String name) {
	 this.name=name;
	 }
	 public void toStrings() {
			// TODO Auto-generated method stub
			System.out.println("Id is: "+Id+" Name is: "+name);
		}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id is: "+Id+" Name is: "+name;
	}
}
