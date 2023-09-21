package com.svit.filehandling;
import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
	public static void main(String args[]) {
		try {
			FileWriter mywrite=new FileWriter("demo.txt");
			mywrite.write("Test File being created");
			mywrite.close();
			System.out.println("Data Inserted Successfully");
		}
		catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}
