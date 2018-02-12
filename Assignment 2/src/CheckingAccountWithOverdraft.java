import java.text.DecimalFormat;

public class CheckingAccountWithOverdraft extends CheckingAccount {

	public CheckingAccountWithOverdraft(String name, int id, String streetAddress, String city, String state, String zip, double startingBalance) {
		super(name, id, streetAddress, city, state, zip, startingBalance);
	}
	
	public String getBalance()
	{
		DecimalFormat df = new DecimalFormat("#.00");
		if(overdraftProtect()) {
			System.out.println("Saved by overdraft protection!");
		}
		return df.format(_balance);
	}
	
	private boolean overdraftProtect()
	{
		return _balance < 0;
	}
}
