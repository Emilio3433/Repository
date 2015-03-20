import java.util.Date;

public class TestAccount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id = 1122;
		double balance = 20000;
		double annualIntrestRate = 4.5;
		double withdraw = 2500;
		double deposit = 3000;
		Date dateCreated = new Date();

		Account account = new Account();
		balance = balance - withdraw + deposit;
		account.Withdraw(balance);
		System.out.println("Your Account Balance Is: $"
				+ account.getBalance(balance));
		System.out.println("\nDate Account Was Created: "
				+ account.getDateCreated(dateCreated));
		System.out.println("\nYour Annual Rate Is: "
				+ account.getAnnualIntrestRate(annualIntrestRate) + "%");

	}

}
