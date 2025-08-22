package ClassRoomDemo1;
interface add
{
	public int add() ;
}
class addition implements add{
	public int a,b;
	@Override
	public int add()
	{
		return this.a+this.b;
	}
	
}
class Addtions implements add
{public int a,b,c;
	@Override
	public int add()
	{
		return this.a+this.b+this.c;
	}
}
public class runTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
