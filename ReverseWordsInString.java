package leetcode;

import java.util.Stack;

public class ReverseWordsInString {
public static void main(String[] args) {
	String str="hello hdjfh sdjkd";
	int n=str.length();
	System.out.println(n);
	Stack<Character> stk=new Stack<>();
	for(int i=0;i<n;i++) {
		if(str.charAt(i)!=' ') {
			stk.push(str.charAt(i));
		}
		else {
			while(stk.empty()==false) {
				System.out.print( stk.pop());
			}
			System.out.print(" ");
		}
		
	}
	
	while(stk.empty()==false) {
		System.out.print( stk.pop());
	}
	
	
}
}
