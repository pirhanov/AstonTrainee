package hw1;

public class Task1 {
	public static void main(String[] args) {
		Person person = new Person();
		String className = person.getClass().getName();
		ClassLoader classLoader = person.getClass().getClassLoader();

		System.out.println("Class loaded by: " + classLoader);
		System.out.println("Class name: " + className);
	}
}
