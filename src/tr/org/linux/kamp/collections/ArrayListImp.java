package tr.org.linux.kamp.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListImp<T> extends ArrayList<T>{
	
	//ArrayList <String> stringList = new ArrayList<>();
	
	
	public boolean addItem(T item){
		//add boolean değer donduruyor
		return add(item);
		
		
	}
	
	public boolean checkItem(T item){
		return contains(item);
	}
	
	public boolean removeItem(T item){
		return  remove(item);
	}
	
	public ArrayList getReverse(ArrayList<T> list){
		Collections.reverse(list);
		return list;
		
	}
	
	public void removeItem(int index){
		 remove(index);
	}
	
	public void addItem(int index, T item){
		 add(index,(T) item);
	}
	
	public void copy(ArrayList<T>liste,ArrayList<T>liste2){
		Collections.copy(liste, liste2);
	}
	//listenin içinde hangi tip oldugunu bilmediğimiz için tip T
	public T getItem(int index){
		return get(index);
	}

}
