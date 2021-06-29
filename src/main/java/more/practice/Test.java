package more.practice;

public class Test {

	public static void main(String[] args) {
		// Testing for exercise #1
		/*
		 * Invoice i1 = new Invoice("8F32D", "Nails", 100, 0.30); Invoice i2 = new
		 * Invoice("6G22S", "Hammer", 1, 5.00);
		 * 
		 * System.out.println("General information item 1"); System.out.println(i1);
		 * System.out.println("General information item 2"); System.out.println(i2);
		 * 
		 * System.out.println("Testing Setters and getters"); i1.setPrice(1.0);
		 * System.out.println("Item 1 Price " + i1.getPrice()); i2.setQuantity(-50);
		 * System.out.println("Item 2 Quantity " + i2.getQuantity());
		 */

		// Testing for exercise #2
		/*
		 * Employee e1 = new Employee("Jesper", "Fahey", 50000.00); Employee e2 = new
		 * Employee("Wylan", "Hendricks", 55000.00);
		 * System.out.println("Employee 1 Salary: " + e1.getSalary());
		 * System.out.println("Employee 2 Salary: " + e2.getSalary());
		 * 
		 * e1.setSalary(e1.getSalary() * 1.10); e2.setSalary(e2.getSalary() * 1.10);
		 * 
		 * System.out.println("Employee 1 Salary: " + e1.getSalary());
		 * System.out.println("Employee 2 Salary: " + e2.getSalary());
		 */

		// Testing for exercise #3
		/*
		 * Date today = new Date(6, 28, 2021); Date birthday = new Date(0, 0, 0000);
		 * 
		 * birthday.setDay(11); birthday.setMonth(10); birthday.setYear(1998);
		 * 
		 * System.out.println("Today's Date: " + today.displayDate());
		 * System.out.println("My birthday: " + birthday.displayDate());
		 */

		// Testing for exercise #4, #5 and #6
		/*
		 * Dog d1 = new Dog("Fido", 5, 50.0); Dog d2 = new Dog("Ada", 2, 40.0);
		 * 
		 * System.out.println("Dog 1: " + d1); System.out.println("Dog 2: " + d2);
		 * 
		 * d1.showExcitement(); d2.showExcitement(1000);
		 * 
		 * d1.eating(); d2.eating("Caramel");
		 */

		// Testing for exercise #7
		Person p1 = new Person("Kaz", 18, 12);
		p1.startWalking();
	}

}
