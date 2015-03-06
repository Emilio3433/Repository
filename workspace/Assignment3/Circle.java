
public class Circle {

	private double radius;
	private final double pi = 3.14159;
	


public void setRadius(double radius2){
	
	if(radius2 < 0){
		radius = 0;
	}
	else 
		radius = radius2;
	}



public double getRadius(double radius2){
			return radius2;
			
			
	}
public double getArea(double area){
	
	area = pi * radius * radius;
	return area;
	}
public double getDiameter(double diameter){
	diameter = radius * 2;
	return diameter;
    }
public double getCircumference(double circumference){
	circumference = 2 * pi * radius;
	return circumference;
	}
	
}




