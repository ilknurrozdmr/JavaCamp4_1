import Abstract.BaseCustomerManager;

import Concrete.StarbucksCustomerManager;

import Entities.Customer;

import Adapters.MernisServiceAdapter;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1, "Ýlknur", "Özdemir", LocalDate.of(1997, 8, 4),"31236201458"));
	}

}
