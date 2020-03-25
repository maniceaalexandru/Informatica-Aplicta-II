import store.*;
public class mainClass {
	
	 public static void main(String[] args) {
		 
	employee employee = new employee("Vanzator1", 9);
	
	//Stock curent:
	produs meat = new produs("Meat", 19.9, 843248, "21.05.2021");
	produs milk = new produs("Milk", 5.00, 832465, "30.04.2021");
	produs oil = new produs("Oil", 5.99, 844348, "21.05.2022");
	produs banana = new produs("Banana", 3.34, 933248, "01.02.2021");
	produs coffe= new produs("Coffe", 4.00, 12248, "01.12.2021");
	
	
	employee.AddProdus(banana,3);
	employee.AddProdus(meat,2);
	employee.Stock.Print_stock();
	
	
	employee.DellProdus(oil);
	employee.DellProdus(banana);
	
	employee.AddProdus(coffe,5);
	employee.AddProdus(milk,7);
	employee.Stock.Print_stock();
	
	
	
	employee.SellProdus(milk,3);
	employee.Bon_Fiscal.Print_bon_fiscal(employee);

	

	employee.SellProdus(meat,8);
	employee.SellProdus(coffe,1);
	employee.Bon_Fiscal.Print_bon_fiscal(employee);
	
	
	

	
	
	
	
		 
	 }
	 					}