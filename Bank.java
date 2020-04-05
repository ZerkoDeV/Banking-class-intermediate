import java.util.ArrayList;
public class Bank {
	 private ArrayList<Customer> customer = new ArrayList<>();
	    private int numberOfCustomer;
	    
	    private String bankName;

	    public Bank(String bankName) {
	        this.bankName = bankName;
	        numberOfCustomer = 0;
	    }

	    public void addCustomer(String first,String last){
	        this.customer.add(new Customer(first,last));
	        numberOfCustomer++;
	    }

	    public int getNumberOfCustomer() {
	        return numberOfCustomer;
	    }
	     public Customer getCustomer(int index){
	        return customer.get(index);
	     }

	    public String getBankName() {
	        return bankName;
	    }

	    @Override
	    public String toString() {
	        return "Bank{" +
	                "numberOfCustomer=" + numberOfCustomer +
	                ", bankName='" + bankName + '\'' +
	                '}';
	    }
}
