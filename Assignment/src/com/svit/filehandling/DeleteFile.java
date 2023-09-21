package com.svit.filehandling;
import java.io.File;
public class DeleteFile {
	public static void main(String args[]) {
		File f1=new File("demo.txt");
		if(f1.delete()) {
			System.out.println("file "+f1.getName()+" has been deleted");
		}
		else {
			System.out.println("failed to delete");
		}
	}

}
