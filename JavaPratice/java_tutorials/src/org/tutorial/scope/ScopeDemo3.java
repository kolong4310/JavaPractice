package org.tutorial.scope;

public class ScopeDemo3 {
	static void a(){
		String title = "coding";
	}
	
	public static void main(String[] args) {
		a();
		//System.out.println(title);
		
		
		for(int i=0; i<5; i++){
			System.out.println(i);
		}
		//System.out.println(i);
	}
}
