package OOP_CO3.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class fileNotFound {
	public static void main(String[] args) {
	
		File newFile=new File("E://file1.txt");
		try {
			FileReader fr=new FileReader(newFile);
			System.out.println("Completed");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
