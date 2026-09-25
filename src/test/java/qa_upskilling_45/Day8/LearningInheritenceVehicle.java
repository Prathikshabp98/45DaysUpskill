package qa_upskilling_45.Day8;

public class LearningInheritenceVehicle {
	
	protected String brand;
	protected int speed;
	
	public LearningInheritenceVehicle(String brand, int speed)
	{
		this.brand= brand;
		this.speed = speed;
	}
	
	public void honk()
	{
		System.out.println("Beep Beep!");	
	}
	
	public void describe()
	{
		System.out.println("This is generic vehicle");
	}
	
}
