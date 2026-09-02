package qa_upskilling_45.Day2;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		
		/*Formulas:

			Celsius → Fahrenheit: F = (C × 9/5) + 32
			Fahrenheit → Celsius: C = (F - 32) × 5/9 */
			
		 
		
		Scanner sc = new Scanner(System.in);
		
		double Celsius ;
		double Fahrenheit;
		
		System.out.println("Please enter your choice to convert temperature : To convert F->C enter C, To convert C->F enter F");
		String choice = sc.next();
		
		if(choice.equals("C"))
		{
			System.out.println("Please enter Fahrenheit temperature : ");
			Fahrenheit = sc.nextDouble();
			Celsius = (Fahrenheit - 32) * 5/9 ;
			System.out.println("Temperature in Celsius is : " + Celsius);
			
			
		}
		
		else if (choice.equals("F"))
		{
			System.out.println("Please enter Celsius temperature : ");
			Celsius = sc.nextDouble();
			Fahrenheit = (Celsius * 9/5) + 32 ;
			System.out.println("Temperature in Fahrenheit is : " + Fahrenheit);
			
			
		}
		
		else
		{
			System.out.println("Invalid choice");
		}
		
			

	}

}
