package org.tutorial.array;

public class ArrayLoopDemo {
	public static void main(String[] args) {
		
		String[] members = {"최진혁","이라함","김슬기"};
		for(int i=0; i<members.length; i++){
			String member = members[i];
			System.out.println(member + " 이 상담을 받았습니다.");
		}
		
		
		for(String e : members){
			System.out.println(e + " 상담을 받았습니다.");
		}
	}
}
