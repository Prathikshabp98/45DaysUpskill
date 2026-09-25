package qa_upskilling_45.Day8;

public class Bike extends Vehicle implements Drivable {
	
	private int noOfWheels;
	
	public Bike(String brand , int speed , int noOfWheels)
	{
		super(brand, speed);
		this.noOfWheels = noOfWheels ;
	}
	
	@Override
	public void describe()
	{
		System.out.println("This is a bike");
	}
	
	@Override
	public void drive()
	{
		System.out.println("Bike driver");
	}
	
	@Override
	public void stop()
	{
		System.out.println("Bike stop");
	}
	
	

}
