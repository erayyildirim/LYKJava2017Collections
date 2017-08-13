package tr.org.linux.kamp.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapImp {
	public static void main(String[] args) {
		// Hash algorithm sıralı olacağının garantisini vermez.

		HashMap<Integer, String> students = new HashMap<>();
		// Key integer bir değer.
		students.put(-1, "Merve yorulmaz");
		students.put(2, "Mustafa çetin");
		students.put(3, "Özgür akdeniz");
		System.out.println(students);

		System.out.println("Size of Hashmap: " + students.size());

		// entryset hem key hem değer dondurur
		for (Map.Entry item : students.entrySet()) {
			System.out.println(item);

		}
		System.out.println("----------Iterator-------------");
		Iterator<Entry<Integer,String>> itr = students.entrySet().iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().getValue());
		}
		
		System.out.println("-----foreach-------");
		
		for (String keys : students.values()) {
			System.out.println(keys);
			
		}
		System.out.println("-----foreach-values-------");
		for (Integer keys : students.keySet()) {
			System.out.println(keys);
			
		}

	}

}
