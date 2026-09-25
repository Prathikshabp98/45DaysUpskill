package qa_upskilling_45.Day8;

public class LearningInheritenceBike  extends LearningInheritenceVehicle{
	
	
	
	public LearningInheritenceBike(String brand , int speed )
	{
		super(brand, speed);
		
		
	}
	
	@Override
	public void honk()
	{
		super.honk();
		System.out.println("b b");
	}
	
	@Override
	public void describe()
	{
		System.out.println("This is generic Bike");
	}
	
	

}
