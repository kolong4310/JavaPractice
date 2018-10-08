package org.tutorial.compare;

public class LoginDemo {
	public static void main(String[] args) {
		String id = args[0];  //입력값
		
		if(id.equals("kim")){
			System.out.println("로그인 했습니다.");
			
		}else {
			System.out.println("로그인 실패");
		}
		
	}
}
