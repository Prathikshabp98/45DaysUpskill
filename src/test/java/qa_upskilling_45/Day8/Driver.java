package qa_upskilling_45.Day8;

public class Driver {

	public static void main(String[] args) {
		
		Vehicle[] vehicles = {
				new Car("BMW", 200, 4),
				new Bike("Yamaha", 180, 2),
				new Truck("Ashoka", 160, 1)
		};
		

		for (Vehicle v : vehicles )
		{
			v.describe();
			v.honk();
			
		if(v instanceof Drivable)	
		{
			Drivable d = (Drivable) v;
			d.drive();
			d.stop();
		}
		
		System.out.println("------");
			
		}
	}

}
