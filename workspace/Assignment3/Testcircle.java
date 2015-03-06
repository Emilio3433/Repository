import java.util.Scanner;
import java.text.DecimalFormat;

public class Testcircle {

	public static void main(String[] args) {
		Circle c = new Circle();
		double radius;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter radius: ");
		radius = input.nextDouble();
		c.setRadius(radius);
		DecimalFormat formatter = new DecimalFormat("0.00");
		System.out
				.println("Radius is " + formatter.format(c.getRadius(radius)));
		System.out.println("Area is " + formatter.format(c.getArea(radius)));
		System.out.println("Diameter is "
				+ formatter.format(c.getDiameter(radius)));
		System.out.println("Circumference is "
				+ formatter.format(c.getCircumference(radius)));
	}

}
