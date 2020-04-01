package store;

public class seller {
	

	public void SellProdus(produs Produs, int Nr) {
		
		
		Stock.produsList.remove(Produs,  Nr);
		bonFiscal.bonFiscalprodusList.put(Produs, Nr);
	}
	
	
	public stock Stock = new stock();
	public printBonFiscal bonFiscal = new printBonFiscal();

	
}
