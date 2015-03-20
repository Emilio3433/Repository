public class Fan {

	private int speed;
	private boolean fanStatus;
	private double radius;
	private String color;

	public Fan() {

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed =speed;
	}

	public boolean getStatus() 
	{
		return fanStatus;
	}

	public void setStatus(boolean fanStatus) {
		this.fanStatus =fanStatus;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius<5) {
			radius=5; //default radius//
		} else
			this.radius=radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color =color;
	}
	
	public String toString(){
		
		return "The Fan Speed: "+getSpeed()+ "\n"
				+ "The Radius Of The Fan Is:" +radius+ "\nThe Status of The Fan is:" +fanStatus+"\nThe Color Of The Fan Is:"+color;
		
		
		
	}

}

	


