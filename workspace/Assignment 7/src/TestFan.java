import java.util.Scanner;


public class TestFan {

	@SuppressWarnings("resource")
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		int speed; 
		boolean fanStatus;
		double radius;
		String color;
		
		Fan fan = new Fan();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter The Speed Of The Fan:");
		speed = input.nextInt();
		System.out.println("Enter The Radius Of The Fan:");
		radius = input.nextDouble();
		System.out.println("Enter The Status Of The Fan(True = On & False = Off):");
		fanStatus = input.nextBoolean(); 
		System.out.println("Enter The Color Of The Fan:");
		color = input.next();
		
		fan.setSpeed(speed);
		fan.setColor(color);
		fan.setRadius(radius);
		fan.setStatus(fanStatus);
		
		System.out.println(fan.toString());
	}

}
