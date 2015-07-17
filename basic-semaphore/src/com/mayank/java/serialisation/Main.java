package com.mayank.java.serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {

		int currentPage = 43;
		int numberOfPages = 45;
		int index = ((currentPage/10)*10)+1;
        int end = index+10 > numberOfPages ? numberOfPages : index+10;
        
        System.out.println(index+"-"+end);
	
	}

	public static void serialize(Student student) {
		try {
			FileOutputStream fileOut = new FileOutputStream("/tmp/student.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(student);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in /tmp/student.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

	public static Student deserialize() {
		Student student = null;
		try {
			FileInputStream fileIn = new FileInputStream("/tmp/student.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			student = (Student) in.readObject();
			in.close();
			fileIn.close();
			return student;
		} catch (IOException i) {
			i.printStackTrace();
			return null;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return null;
		}
	}

}
