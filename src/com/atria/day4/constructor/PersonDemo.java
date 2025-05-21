package com.atria.day4.constructor;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		Person p=new Person();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.next();
		System.out.println("Enetr the age:");
		int age=sc.nextInt();
		System.out.println("Enter the gener:");
		String gender=sc.next();
		System.out.println("Enter the income:");
		int income = sc.nextInt();
		System.out.println("Enter the tax");
		String tax = sc.next();
		
	}

}

