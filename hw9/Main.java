package hordsman.hw9;

public class Main {
	public static void main(String[] args) {
		Singleton singleton1 = new Singleton.Builder().setName("Singleton 1").build();
		System.out.println("singleton1 name: " + singleton1.getName());

		Singleton singleton2 = new Singleton.Builder().setName("Singleton 2").build();
		System.out.println("singleton2 name: " + singleton2.getName());

		System.out.println("Are singleton1 and singleton2 the same object? " + (singleton1 == singleton2));
	}
}