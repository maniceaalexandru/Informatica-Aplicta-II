import store.employee;
import store.*;

public class mainClass {
	public static void main(String[] args) {
		 
		employee employee = new employee("Angajat", 9);
	

		//Stock curent:
		produs meat = new produs("Meat", 19.9, 843248, "21.05.2021");
		produs milk = new produs("Milk", 5.00, 832465, "30.04.2021");
		produs oil = new produs("Oil", 5.99, 844348, "21.05.2022");
		produs banana = new produs("Banana", 3.34, 933248, "01.02.2021");
		produs coffe= new produs("Coffe", 4.00, 12248, "01.12.2021");
		

		employee.AddProdus(banana, 3);
		employee.AddProdus(meat, 7);
		employee.Stock.Print.printstock();
		
		
		employee.DellProdus(oil);
		employee.DellProdus(banana);
		
		employee.AddProdus(milk, 8);
		employee.AddProdus(coffe, 21);
		employee.Stock.Print.printstock();
		
		employee.Seller.SellProdus(milk, 4);
		employee.Seller.bonFiscal.PrintBonFiscal(employee);
		
		employee.Seller.SellProdus(meat,8);
		employee.Seller.SellProdus(coffe,1);
		 employee.Seller.bonFiscal.PrintBonFiscal(employee);

		
}}
