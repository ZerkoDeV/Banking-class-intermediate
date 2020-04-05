
public class Main {

	public static void main(String[] args) {
		 var bank = new Bank("The bank of people");
	        bank.addCustomer("Zerko","Nooo");
	        var customer = bank.getCustomer(bank.getNumberOfCustomer()-1);
	        System.out.println(bank.getBankName());
	        System.out.println(customer.getFirstName() +" "+ customer.getLastName());
	        var account = customer.getAccount();
	        System.out.println(account.deposit(-10));
	        System.out.println(account.deposit(100));
	        System.out.println(account.withdraw(200));
	        System.out.println(account);
	        System.out.println(customer);
	        System.out.println(bank);

	}

}
