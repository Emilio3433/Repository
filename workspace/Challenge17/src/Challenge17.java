
public class Challenge17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double COMMISSION_RATE = .02; 
		
		int shares = 1000;
		
		double InitialPrice= 32.87;
		double FinalPrice= 33.92;
		double AmountPaid = InitialPrice * shares;
		double PaidBroker = InitialPrice * shares * COMMISSION_RATE;
		double SellPrice = FinalPrice * shares;;
		double FinalCommission = shares * FinalPrice * COMMISSION_RATE;;
		double TotalCost = (InitialPrice * shares)+ PaidBroker ;
		double TotalSold = (FinalPrice * shares)+ FinalCommission;
		
		System.out.println("The amount of money paid for the stock was $" + AmountPaid + "\nThe amount of commission Joe paid his broker when he bought the stock was $" +PaidBroker);
		System.out.println("The amount that Joe sold the stock for was $"+SellPrice+"\nThe amount of commission Joe paid his broker when he sold the stock was $" +FinalCommission);
		System.out.println("Joe made a profit of $"+ (TotalSold - TotalCost));
		 
		
	}

}
