package tr.org.linux.kamp.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HasSetImp {
	public static void main(String[] args) {
		
		HashSet<Integer> numbers = new HashSet<>();
		//hash algoritması sıralamayı karısık verebilir.. hashmap algoritması kullanılıyor.
		numbers.add(99);
		numbers.add(2);
		numbers.add(8);
		numbers.add(7);
		numbers.add(60);
		numbers.add(1);
		numbers.add(3);
		
		System.out.println(numbers);
		//aynı deger gırılırse eklemez
		numbers.add(3);
		System.out.println(numbers);
		
		if(!numbers.isEmpty()){
			System.out.println("Set dolu :" + numbers);
		}else System.out.println("Set boş eleman ekle");
		
		ArrayList<Integer> fakeNumbers = new ArrayList<>();
		fakeNumbers.add(1);
		fakeNumbers.add(2);
		
		System.out.println("Fake numbers in numbers : " + numbers.containsAll(fakeNumbers));
	}

}
