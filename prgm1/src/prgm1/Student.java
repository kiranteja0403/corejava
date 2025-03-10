package prgm1;

import java.util.Scanner;

public class Student {
//	Instance Variables
	int id;
	String name;
	int sub1;
	int sub2, sub3;
	int total;
	int avg;
//	Static shared among all the classes
	public static boolean flag=true;

	public void accept(Student student) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your ID");
		student.id = scanner.nextInt();

		System.out.println("Enter your Name");
		student.name = scanner.next();

		System.out.println("Enter your Subject 1");
		student.sub1 = scanner.nextInt();

		System.out.println("Enter your Subject 2");
		student.sub2 = scanner.nextInt();

		System.out.println("Enter your Subject 3");
		student.sub3 = scanner.nextInt();
	}

	public void calculate() {
//	local var	int x;
		this.total = this.sub1 + this.sub2 + this.sub3;
		System.out.println(this.total);
		this.avg = this.total / 3;
		System.out.println(this.avg);
	}

	@Override
	public String toString() {

		return "Student [id=" + id + ", name=" + name + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3
				+ ", total=" + total + ", avg=" + avg + "]";
	}

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			Student student = new Student();
			student.accept(student);
			student.calculate();
			System.out.println(student.toString());
		}
	}

}
