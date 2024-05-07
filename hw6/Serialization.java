package hw6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) {
		MyClass obj = new MyClass("Groot", 5);

		serializeObject(obj, "object.ser");

		MyClass newObj = (MyClass) deserializeObject("object.ser");

		System.out.println("Deserialized Object:");
		System.out.println("Name: " + newObj.getName());
		System.out.println("Age: " + newObj.getAge());
	}

	private static void serializeObject(Object obj, String filename) {
		try (FileOutputStream fileOut = new FileOutputStream(filename);
				ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
			objectOut.writeObject(obj);
			System.out.println("Object serialized successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Object deserializeObject(String filename) {
		Object obj = null;
		try (FileInputStream fileIn = new FileInputStream(filename);
				ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
			obj = objectIn.readObject();
			System.out.println("Object deserialized successfully.");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return obj;
	}
}