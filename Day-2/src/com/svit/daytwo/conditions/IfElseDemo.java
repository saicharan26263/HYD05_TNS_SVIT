package com.svit.daytwo.conditions;
import java.util.*;
public class IfElseDemo {
	public static void main(String[] args) {
		Scanner test =new Scanner(System.in);
		int age=test.nextInt();
		if(age>18)
			System.out.println("you are eligible for voting");
		else
			System.out.println("you are not eligible,you need to wait more");
	}
}
