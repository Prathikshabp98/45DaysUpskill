package qa_upskilling_45.Day8;

public abstract class Vehicle {
	
	protected String brand;
	protected int speed;
	
	public Vehicle(String brand, int speed)
	{
		this.brand=brand;
		this.speed = speed;
	}
	
	public abstract void describe();
	
	public void honk()
	{
			System.out.println("Sound is beep beep");
}
}
