package com.atria.day7;

public class Square extends Shape{
		private float side;
		
		public Square() {
			this.side=2.0f;
			
		}
		public Square(float side) {
			this.side=side;
			
		}
	@Override
	void calarea() {
		// TODO Auto-generated method stub
		area=side*side;
		
	}
		

//	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


