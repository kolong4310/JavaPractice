package org.tutorial.method;

public class MethodDemo3 {
	public static String numbering(int a, int b){
		int i = a;
		String output ="";
		while(i < b){
			output += i;  //output = output +i;
			i++;
		}
		
		return output;
		//output애 담겨있는 문자열을 외부로 반환하려면 return 을 배치해야 한다.
	}
	
	public static void main(String[] args) {
		// 메소드 numbering이 리턴한 값이 변수 result에 담긴다.
		String result= numbering(1,5);
		// result의 값을 화면에 출력한다
		System.out.println(result);
	}
}
