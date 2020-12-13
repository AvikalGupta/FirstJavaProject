package Avikal.JavaMasterClass;

import java.util.ArrayList;

public class GroceryList {

	private ArrayList<String> groceryList = new ArrayList<String>();
	
	public void addGrocery(String item) {
		groceryList.add(item.toLowerCase());
		System.out.println(item  + " Added");
	}
	
	public void removeGroceryByPosition(int position) {
		groceryList.remove(position-1);
		System.out.println("removed");
	}
	
	public void removeGroceryByName(String item) {
		
		boolean hasItem = groceryList.contains(item.toLowerCase());
		if(hasItem) {
			int indexOfItem = groceryList.indexOf(item);
			removeGroceryByPosition((indexOfItem+1));
		} else {
			System.out.println(item + " isn't in the Grocery List");
		}
	}
	
	public void modifyGroceryList(int position, String item) {
		groceryList.set(position-1, item.toLowerCase());
	}
	
	public void findItemByPosiotion(int position) {
		System.out.println(groceryList.get(position-1));
	}
	
	public void findItemByName(String itemName) {
		boolean hasItem = groceryList.contains(itemName.toLowerCase());
		if(hasItem) {
			System.out.println(itemName + " is at " + (groceryList.indexOf(itemName)+1));
		}
		else {
			System.out.println("Did not found any item named :- " + itemName);
		}
	}
	
	public void printGroceryList() {
		for(int i = 0; i < groceryList.size(); i++) {
			System.out.println((i+1) + ". " + groceryList.get(i));
		}
	}
	
	
}
