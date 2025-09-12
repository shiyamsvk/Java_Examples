package OOP_CO3.Exception;

public class classNotFoundExcep {
	public static void main(String[] args) {

		try {
		Class.forName("fileNotFound1");
		}
		catch(ArithmeticException | ClassNotFoundException e) {
			System.err.println(e+"\n"+e.getMessage());
		}
	}
}
