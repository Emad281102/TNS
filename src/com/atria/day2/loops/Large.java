package com.atria.day2.loops;

public class Large {

	public static void main(String[] args) {
		int a=10,b=20,c=5;
		if(a>b) {
			if(a>c) {
				System.out.println("A is largest");
			}
			else
				System.out.println("C is largest");
			
		}
		else if(b>c) {
			if(b>a)
				System.out.println("B is largest");
		}
		else {
			System.out.println("C is largest");
		}



	}

}
