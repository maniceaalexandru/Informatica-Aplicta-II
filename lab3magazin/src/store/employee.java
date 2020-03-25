package store;

public class employee {
	public String name;
	private int id;
	
	public stock Stock = new stock();
	public bon_fiscal Bon_Fiscal = new bon_fiscal();
	
	
	
public int getid() {
		return id;
	}

public employee() {}

	
public employee(String Name, int Id) {
		name = Name;
		id = Id;
	
	}


public void AddProdus(produs Produs,int Nr) {
	Stock.produsList.put(Produs, Nr);
	
}
public void DellProdus(produs Produs) {
	Stock.produsList.remove(Produs);
}

public void SellProdus(produs Produs, int Nr) {
	
	
	Stock.produsList.remove(Produs,  Nr);
	Bon_Fiscal.bon_fiscalprodusList.put(Produs, Nr);
}




}
