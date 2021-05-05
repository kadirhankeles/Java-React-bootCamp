package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
	//Individual ve Corporate Customerdan extends edildiği için Customer nesnesi metoda gelebilir.
	//extends etmemiş olsaydık iki farklı metoda bölmemiz gerekirdi.
		System.out.println(customer.customerNumber+ " Kaydedildi.");
	}
	
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
}
