package org.tutorial.io;

import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //sytem.in : ����ڰ� �Է��� ��
		int i = sc.nextInt();
		System.out.println(i*150);
		sc.close();
	}
}
