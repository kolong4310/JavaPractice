package org.tutorial.operator;

public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=1+2;
		System.out.println(result);
		
		result = result*2 ;
		System.out.println(result);
		
		int a=10;
		int b=3;
		
		float c = 10.0f;
		float d = 3.0f;
		
		System.out.println(a/b);
		System.out.println(c/d);
		System.out.println(a/d);
		
		int i= 3;
		i++; 
		System.out.println(i); //4
		++i;
		System.out.println(i); //5
		System.out.println(++i); //6
		System.out.println(i++); //6
		System.out.println(i); //7
	
	}

}
