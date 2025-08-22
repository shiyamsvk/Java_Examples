package ClassRoomDemo1;

public class enCapImple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		encapDemo en= new encapDemo(25,"Shiyam");
		System.out.println(en.getId());
		System.out.println(en.getName());
		System.err.println(en.toString());
		en.toStrings();
		en.setId(1);
		en.setName("Raja");
		System.out.println(en.getId());
		System.out.println(en.getName());
		System.err.println(en.toString());
	}
}
