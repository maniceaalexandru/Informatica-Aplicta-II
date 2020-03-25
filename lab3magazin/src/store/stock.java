package store;

import java.util.*;

public class stock {
	
	public Map<produs, Integer> produsList = new HashMap<produs, Integer>();
	
public stock() {
	
	
	
}


public void Print_stock() {
	System.out.println("Am adaugat pe stock:");
	for (produs key : produsList.keySet()) {
		System.out.println(key.name + " : " + produsList.get(key));
	}
	System.out.println("");
}


}
