package qa_upskilling_45.Day2;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		
		//SI = (P * R * T) / 100
		Scanner sc = new Scanner(System.in);
		
		double SI;
		double P;
		double R;
		double T;
		
		System.out.print("Please enter Principal amount : ");
		P= sc.nextDouble();
		
		System.out.print("Please enter Rate of Interest : ");
		R= sc.nextDouble();	
		
		System.out.print("Please enter Time in years : ");
		T= sc.nextDouble();
		
		SI = (P * R * T) / 100;
		
		System.out.println("Simple Interest is : " + SI);
		

	}

}
