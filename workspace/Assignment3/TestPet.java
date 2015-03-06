import java.util.Scanner;

public class TestPet {
	public static void main(String[] args) {
		Pet c = new Pet();

		String name;
		String type;
		int age;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter name: ");
		name = input.next();
		c.setName(name);
		System.out.println("Enter pet type(Dog,Cat, or Bird only): ");
		type = input.next();
		c.setType(type);
		System.out.println("Enter age: ");
		age = input.nextInt();
		c.setAge(age);

		System.out.println("Your " + c.getType(type) + "'s name is "
				+ c.getName(name) + " and it is " + c.getAge(age)
				+ " years old");

	}

}
