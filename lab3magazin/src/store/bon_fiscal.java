package store;
import java.util.*;
public class bon_fiscal {
	public Map<produs, Integer> bon_fiscalprodusList = new HashMap<produs, Integer>();
	
public void bon_fiscal() {}



private double Suma_totala()
{
	double S = 0;
	for (produs key : bon_fiscalprodusList.keySet())
	{
		S = S + Suma(key);
	}
	return S;
}

private double Suma(produs Produs)
{
	double S2 = 0;
	S2 = Produs.price * bon_fiscalprodusList.get(Produs);
	
	return S2;
}




public void Print_bon_fiscal(employee vanzator) {
	System.out.println("Bonul este:");
	for (produs key :bon_fiscalprodusList.keySet())
	{
		
		System.out.println(bon_fiscalprodusList.get(key) + " x " + key.name + " " + key.price + " RON" );
		
		
	}
	System.out.println("TOTAL: " + Suma_totala() + " RON");
	System.out.println("Va multumim ca ati cumparat de la noi!");
	System.out.println(" ");
}

}
