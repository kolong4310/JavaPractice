package org.tutorial.io;

import java.util.Scanner;

public class ScannerDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			System.out.println(sc.nextInt()*21);
		}
		sc.close();
	}
	
	//사용자가 console 창에 엔터를 치기 전까지 . while(sc.hasNextInt()) 까지 실행 상태에서 대기 그뒤 사용자가 
	// int값을 쓰면 true , 그외에 것을 쓰면  false 가 됨 
}
