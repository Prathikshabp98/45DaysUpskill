package qa_upskilling_45.Day7;

import java.time.chrono.IsoChronology;

public class Driver {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(1000);
		account.deposit(500);
		account.withdrawn(200);
		account.withdrawn(2000); // Attempt to withdraw more than the balance
		System.out.println("Final account balance is : " +account.getBalance());
		
		Person p = new Person("Prathiksha" , 16);
		System.out.println("Customer name is :" +p.getName() +"  and age is :" +p.getAge());
		p.setName("Prathiksha BP");
		p.setAge(12);
		System.out.println("Customer name is :" +p.getName() +"  and age is :" +p.getAge());
		System.out.println(p.isAdult());
		

	}

}
