package org.tutorial.object;
class Calculator{
	static double PI= 3.14; 
	static int base = 0;
	int left, right;
	
	public void setOprands(int left, int right){
		this.left=left; //this�� �ʾ� �ִ°��� ����(class Calculator)  �ִ� ������ ����Ű�°� 
		this.right=right; //this�� �� �پ� �ִ°��� �Ű� ������ �� �� 10 ,20
	}
	
	public void sum(){
		System.out.println(this.left+this.right +base);
		
	}
	
	public void avg(){
		System.out.println((this.left+this.right)/2);
	}
}


public class CalculatorDemo3 {
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(29, 43);
		c2.sum();
		c2.avg();
		
		System.out.println(c1.PI);
		System.out.println(Calculator.PI);
		
		
		Calculator.base = 10;
		
		c1.sum();
		c2.sum();
	}
}
