package OOP_CO3.Exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class tryWithResource {
	public static void main(String[] args) throws IOException {
		File f=new File("E://file1.txt");
		
		try(BufferedReader bu=new BufferedReader
				(new FileReader(f))){
			System.err.println("Completed");	
		}
		
	}
}
