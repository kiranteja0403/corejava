package employee;

import java.util.Scanner;

public class salary {
	String name;
	int id;
	double basicSalary;
	
	public double NetSalary() { //basic salary+25% health insurance+15%tax+pf
		return basicSalary + (basicSalary * 25 / 100) + (basicSalary * 15 / 100) +(basicSalary * 5 / 100);
	}

	public double GrossSalary() {//basic salary+25% health insurance+15%tax
		return basicSalary + (basicSalary * 25 / 100) + (basicSalary * 15 / 100);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		salary one = new salary();

		for (int i = 0; i < 2; i++) {
			System.out.println("Enter the name:");
			one.name = scanner.next();
			System.out.println("Enter the id:");
			one.id = scanner.nextInt();
			System.out.println("Enter the basic salary:");
			one.basicSalary = scanner.nextDouble();

			System.out.println("The net salary is: " + one.NetSalary());
			System.out.println("The gross salary is: " + one.GrossSalary());
		}

		scanner.close();
	}
}