package com.svit.daytwo.conditions;
import java.util.*;
public class NestedIfElseDemo {
	public static void main(String[] args) {
		System.out.println("Enter three numbes: ");
		Scanner myObj=new Scanner(System.in);
		int a=myObj.nextInt();
		int b=myObj.nextInt();
		int c=myObj.nextInt();
		System.out.println("The largest Number is: ");
		if(a>b) {
			if(a>c)
				System.out.println(a);
			else
				System.out.println(c);
		}else {
			if(c>b)
				System.out.println(c);
			else
				System.out.println(b);
			myObj.close();
		}
	}
}
