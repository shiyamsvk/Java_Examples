package CO3;

import java.util.Scanner;

public class UserDefinedExcepDemo {
	public static void main(String[] args) throws InvalidAgeException {

		int age;
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		//age=78;
		if(age < 60)
			throw new InvalidAgeException("Not Valid for Getting Pension money from Govt. You have to wat for "+((60-age)+1));
		else
			System.out.println("Valid");
		
		try {
			if(age < 60)
				throw new InvalidAgeException
				("Not Valid for Getting Pension money from Govt. You have to wat for "+((60-age)+1));
			else
				System.err.println("Valid");
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
			System.err.println("Close");
		}
	}
}
