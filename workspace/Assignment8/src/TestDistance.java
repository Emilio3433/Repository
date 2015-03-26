import java.util.Scanner;

public class TestDistance {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double x;
		double y;
		double x2;
		double y2;
		double d=0;
		
		// user inputs for variables
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
		System.out.println("----Enter A Value For The Following Variables----");
		System.out.println("What's The  Value Of x?:");
		x= input.nextDouble();
		System.out.println("What's The Value Of y?");
		y= input.nextDouble();
		System.out.println("What's The Value Of x2?");
		x2=input.nextDouble();
		System.out.println("What's The Value Of y2?");
		y2= input.nextDouble();
		System.out.println("The Distance Between The Two Set Of Points ("+x+","+y+") & ("+x2+","+y2+") is: \n"+Distance.getDistance(x, x2, y, y2, d));
}

}
