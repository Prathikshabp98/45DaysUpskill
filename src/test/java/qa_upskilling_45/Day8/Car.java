package qa_upskilling_45.Day8;

public class Car extends Vehicle implements Drivable {
	
	private int noOfDoors;
	
	public Car(String brand , int speed , int noOfDoors)
	{
		super(brand, speed);
		this.noOfDoors = noOfDoors ;
	}
	
	@Override
	public void describe()
	{
		System.out.println("This is a car");
	}
	
	@Override
	public void drive()
	{
		System.out.println("Car driver");
	}
	
	@Override
	public void stop()
	{
		System.out.println("Car stop");
	}
	
	

}
