package inheritance; //miras

public class Main {

	public static void main(String[] args) { 
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "44444";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "121212";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(engin);
		//customerManager.add(hepsiBurada);
		//customerManager.add(abc);
		Customer[] customers = {engin, abc, hepsiBurada};
		customerManager.addMultiple(customers);
		

	}

}
