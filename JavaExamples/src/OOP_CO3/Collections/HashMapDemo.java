package OOP_CO3.Collections;

import java.util.HashMap;
import java.util.Map.Entry;

import ClassRoomDemo1.interfaceDemo;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hmap=new HashMap<Integer, String>();
		
		hmap.put(1, "Raja");
		hmap.put(2, "Rama");
		
		for (Entry<Integer, String> entry : hmap.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.err.println(key+ "  "+ val);
		}	
		
		
	}

}
