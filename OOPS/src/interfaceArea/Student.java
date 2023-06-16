package interfaceArea;

import java.io.*;
import java.io.Serializable;

public class Student implements Serializable {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		try {
			// Create the object of student class
			Student s1 = new Student(108, "Debasish");

			// Write the object to the stream by creating a output stream
			FileOutputStream Fout = new FileOutputStream("Debasish.txt");
			ObjectOutputStream Oout = new ObjectOutputStream(Fout);
			Oout.writeObject(s1);
			Oout.flush();
			// close the stream
			Oout.close();
			System.out.println("Object successfully written to the file");

			// Create a stream to read the object
			ObjectInputStream Oin = new ObjectInputStream(new FileInputStream("Debasish.txt"));
			Student s = (Student) Oin.readObject();
			// print the data of the deserialized object
			System.out.println("Student object: " + s.id + " " + s.name);
			// close the stream
			Oin.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
