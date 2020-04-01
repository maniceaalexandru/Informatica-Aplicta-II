package store;

import java.util.HashMap;
import java.util.Map;

public class bonFiscal {
	public Map<produs, Integer> bonFiscalprodusList = new HashMap<produs, Integer>();
	
	
	public bonFiscal() {}
	
	
	public double sumaTotala()
	{
		double S = 0;
		for (produs key : bonFiscalprodusList.keySet())
		{
			S = S + Suma(key);
		}
		return S;
	}
	


	public double Suma(produs Produs)
	{
		double S2 = 0;
		S2 = Produs.price * bonFiscalprodusList.get(Produs);
		
		return S2;
	}
	


}
