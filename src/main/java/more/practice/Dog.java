package more.practice;

public class Dog {
	private String name;
	private int age;
	private double weight;

	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Dog(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public Dog(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

	public void showExcitement() {
		System.out.println(name + " is wagging it's tail!");
	}

	public void showExcitement(int level) {
		System.out.println(name + " is showing " + level + " level of excitement!");
	}

	public void eating() {
		System.out.println("Eating!");
	}

	public void eating(String food) {
		System.out.println("Eating " + food + "!");
	}

}
