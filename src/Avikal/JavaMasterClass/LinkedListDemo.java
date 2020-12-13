package Avikal.JavaMasterClass;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<String> places = new LinkedList<String>();
		places.add("Jaipur");
		places.add("Mumbai");
		places.add("Agra");
		places.add("Fattehpur");
		places.add("Varanasi");
		 
		System.out.println("==================");
		printList(places);
		places.remove(3);
		System.out.println("==================");
		printList(places);
		System.out.println("==================");
		places.add(4, "Mirzapur");
		places.add(0, "Chandauli");
		print(places);
	}
	
	static void printList(LinkedList<String> places){
		for(int i = 0; i < places.size(); i++) {
			System.out.println(places.get(i));
		}
	}
	
	static void print(LinkedList<String> places) {
		Iterator<String> i = places.iterator(); 
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("==================");
	}

}
