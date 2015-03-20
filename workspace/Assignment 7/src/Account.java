import java.util.Date;

public class Account {

	int id;
	double balance;
	double annualIntrestRate;
	Date dateCreated = new Date();

	// *Constructor*//
	public void Account() 
	{
	
	}

	// *Constructor with 4 arguments*//
	public void Account(int id, double annualIntrestRate, double balance,Date dateCreated) 
	{
		this.id = id;
		this.balance = balance;
		this.annualIntrestRate = annualIntrestRate;
		this.dateCreated = dateCreated;

	}

	// *Accessor and Mutator Methods*//
	public int getId(int id) 
	{
		return id;
	}

	public double getBalance(double balance) 
	{
		
		return balance;
	}

	public double getAnnualIntrestRate(double annualIntrestRate) 
	{
		return annualIntrestRate;
	}

	// *Accesor for dateCreated**//
	public Date getDateCreated(Date dateCreated) 
	{
		return dateCreated;
	}

	// *New Method*//
	public void Withdraw(double withdraw) 
	{
		balance = balance - withdraw;
	}

	// *New Method*//
	public double getMonthlyIntrestRate(double monthlyIntrestRate) 
	{
		return annualIntrestRate / 12; //annual
	}

	// *New Method*//
	public void Deposit(double deposit) {
		balance = deposit + balance;

	}

}
