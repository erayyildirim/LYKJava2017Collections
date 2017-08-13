package tr.org.linux.kamp.collections;

import java.util.Iterator;

public class ArrayListImpTest {
	public static void main(String[] args) {
		
		ArrayListImp <String>liste = new ArrayListImp<>();
		ArrayListImp <String>liste2 = new ArrayListImp<>();

		liste.add("JAVA");
		liste.add("JAVASE");
		liste.add("JAVAEE");
		liste.add("JAVAME");
		
		liste2.add("ALP");
		liste2.add("ÇETİN");
		liste2.add("ALPER");
		
		liste.set(1, "Linux");
		
		System.out.println(liste.get(0));
		
		System.out.println(liste.checkItem("123"));
		
		System.out.println(liste.remove("JAVA"));
		
		System.out.println("Reverse: " + liste.getReverse(liste));
		//liste tersine dondugu ıcın JAVAME 0. index
		liste.remove(2);
		System.out.println("List: " +  liste);
		
		liste.add(2,"eray");
		System.out.println(liste);
		
		//liste.copy(liste, liste2);
		System.out.println(liste);
		
		System.out.println("ilk eleman: " + liste2.getItem(0));
		//tipi değişken liste2den
		System.out.println("Liste2'nin elemanları");
		for (String item : liste2) {
			System.out.println(item);
		}
		System.out.println("-----------");
		for(int i=0; i < liste.size(); i++){
			System.out.println(liste.getItem(i));
		}
		
		System.out.println("----------------");
		
		
	
		
//		liste.clear();
//		liste = null;
//		System.out.println(liste);
		
		
		
		
			
	}

}
