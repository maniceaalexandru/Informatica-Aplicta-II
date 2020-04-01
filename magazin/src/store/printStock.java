package store;
import java.util.*;

public class printStock {

	public Map<produs, Integer> produsList = new HashMap<produs, Integer>();
	
public printStock() {}



public void printstock() {
	System.out.println("Am adaugat pe stock:");
	for (produs key : produsList.keySet()) {
		System.out.println(key.name + " : " + produsList.get(key));
	}
	System.out.println("");
}

}
