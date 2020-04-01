package store;

public class produs {
	
		public String name;
		public double price;
		public String exp_date;
		public String Description;
		
		private int code;
		
		
		public int getcode() {
			return code;
		}
		
	public produs() {}
	
	
		
	public produs(String Name, double Price, int Code, String Exp_date) {
			name = Name;
			price = Price;
			code = Code;
			exp_date = Exp_date;
			
		}


}
