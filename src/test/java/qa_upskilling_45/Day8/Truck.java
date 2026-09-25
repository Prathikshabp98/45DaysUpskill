package qa_upskilling_45.Day8;

public class Truck extends Vehicle implements Drivable {
	
	private int noOfContainers;
	
	public Truck(String brand , int speed , int noOfContainers)
	{
		super(brand, speed);
		this.noOfContainers = noOfContainers ;
	}
	
	@Override
	public void describe()
	{
		System.out.println("This is a Truck");
	}
	
	@Override
	public void drive()
	{
		System.out.println("Truck driver");
	}
	
	@Override
	public void stop()
	{
		System.out.println("Truck stop");
	}
	
	

}
