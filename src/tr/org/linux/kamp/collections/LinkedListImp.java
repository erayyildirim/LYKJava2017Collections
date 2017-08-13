package tr.org.linux.kamp.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImp {
	public static void main(String[] args) {
		
		LinkedList <String> colors = new LinkedList<>();
		colors.add("Turuncu");
		colors.add("Sarı");
		colors.add(1, "Kırmızı");
		
		colors.set(2,"Yeşil");
		
		//colors.remove(2);
		System.out.println(colors);
		
		System.out.println(colors.get(2).toLowerCase());
		
		System.out.println("ilk eleman: " + colors.getFirst());
		
		System.out.println("Listenin uzunluğu: "+ colors.size());
		System.out.println("-------------------");
		for (String item : colors) {
			System.out.println(item);
			
		}
		System.out.println("-------------------");

		Iterator <String> itr = colors.descendingIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
