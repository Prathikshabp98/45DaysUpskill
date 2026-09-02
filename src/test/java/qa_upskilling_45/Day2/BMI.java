package qa_upskilling_45.Day2;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		double BMI;

	      Scanner sc = new Scanner(System.in);

	      System.out.println("Please enter weight :");
	      double weight = sc.nextDouble();

	      System.out.println("Please enter height :");
	      double height = sc.nextDouble();

	      BMI = weight / (height * height) ;

	      if (BMI <18.5 )
	      {
	        System.out.println("Person is underweight");
	      }
	      else if (BMI >= 18.5 && BMI <25)
	      {
	        System.out.println("Person is normal");
	      }
	      else if (BMI >= 25 && BMI <30)
	      {
	        System.out.println("Person is overweight");
	      }
	      else  
	      {
	        System.out.println("Person is Obese");
	      }

	}

}
