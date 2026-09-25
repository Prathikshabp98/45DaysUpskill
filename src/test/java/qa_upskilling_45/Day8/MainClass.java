package qa_upskilling_45.Day8;

public class MainClass {

	public static void main(String[] args) {
		
		LearningInheritenceCar myCar = new LearningInheritenceCar("Audi", 180, 3);
		myCar.honk();
		System.out.println(myCar.brand);
		System.out.println(myCar.noOfDoors);
		myCar.describe();
		LearningInheritenceVehicle vehicle = new LearningInheritenceVehicle("BMW", 120);
		vehicle.describe();
		 
		LearningInheritenceVehicle[] vehicles = {
				new LearningInheritenceCar("toyoyo" , 100 , 4),
				new LearningInheritenceBike("Ronin", 80)
		};
		
		for(LearningInheritenceVehicle v : vehicles)
		{
			v.describe();
		}
		
		

	}

}
