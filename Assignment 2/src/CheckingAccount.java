import java.text.DecimalFormat;

public class CheckingAccount extends BaseAccount {

	protected double _balance;
	
	public CheckingAccount(String name, int id, String streetAddress, String city, String state, String zip, double startingBalance) {
		_name = name;
		_id = id;
		_streetAddress = streetAddress;
		_city = city;
		_state = state;
		_zip = zip;
		_balance = startingBalance;
	}
	
	public String getName() {
		return _name;
	}
	
	public void depositAmount(double amount) {
		_balance += amount;
	}
	
	public void payAmount(double amount) {
		_balance -= amount;
	}
	
	public String getBalance() {
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(_balance);
	}
	
}
