package qa_upskilling_45.Day8;

public class LearningInheritenceCar  extends LearningInheritenceVehicle{
	
	public int noOfDoors;
	
	public LearningInheritenceCar(String brand , int speed , int noOfDoors)
	{
		super(brand, speed);
		this.noOfDoors= noOfDoors;
		
	}
	
	@Override
	public void honk()
	{
		super.honk();
		System.out.println("c c");
	}
	
	@Override
	public void describe()
	{
		System.out.println("This is generic car");
	}
	
	

}
