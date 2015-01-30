
public class Challange15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double surveyed = 12467;
		double customers = .14;
		double CitrusConsumers = .64;
		double CustomersPerWeek;
		double CitrusEnergyDrinks;
		
		CustomersPerWeek = surveyed*customers; 
		System.out.println("The approximate number of customers in the survey who purchase one or more energy drinks per week "  +(int)CustomersPerWeek);
		
		CitrusEnergyDrinks = surveyed*CitrusConsumers;
		System.out.println("The approximate number of customers in the survey who prefer citrus flavor energy drinks are " +(int)CitrusEnergyDrinks);
	}

}
