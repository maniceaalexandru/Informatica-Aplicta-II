package store;

public class employee {

	public String name;
	private int id;
	
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
	
	
	
	public stock Stock = new stock(); 
	public seller Seller = new seller();

}
