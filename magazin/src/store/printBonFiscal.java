package store;

import java.util.HashMap;
import java.util.Map;

public class printBonFiscal {
	public Map<produs, Integer> bonFiscalprodusList = new HashMap<produs, Integer>();

	public bonFiscal Suma = new bonFiscal();
	
	
	public void PrintBonFiscal(employee vanzator) {
		System.out.println("Bonul este:");
		for (produs key :bonFiscalprodusList.keySet())
		{
			
			System.out.println(bonFiscalprodusList.get(key) + " x " + key.name + " " + key.price + " RON" );
			
			
		}
		System.out.println("TOTAL: " +  Suma.sumaTotala() + " RON");
		System.out.println("Va multumim ca ati cumparat de la noi!");
		System.out.println(" ");
	}
	
	


}
