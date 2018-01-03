package leetcode_easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class validParentheses {
	public static boolean isValid(String s) {
	        Map<Character,Character> map = new HashMap<Character,Character>();
			map.put('(',')');
			map.put('[',']');
			map.put('{','}');
			Stack<Character> stack = new Stack<Character>();
			for(int i = 0; i < s.length(); i++){
				char c = s.charAt(i);
				switch (c) {
				case '(' : case '[' : case '{' :
					stack.push(c);
					break;
				case ')' : case ']' : case '}' :
					if(stack.isEmpty() || c != map.get(stack.pop())){
						return false;
					}
					break;
					// || �������Ⱥ�˳����ܻ�Ӱ��������������иı����Ĳ��������������ں��ر��Ƕ��ڵĲ���
					/*if(c != map.get(stack.pop()) || stack.isEmpty()){
						return false;
					}
					break;*/
				}
			}
			return stack.isEmpty();
    }
	
	public static void main(String[] args) {
//		boolean b = isValid("(((}{}{}");
		boolean b1 = isValid("()");
//		System.out.println(b);
		System.out.println(b1);
	}
}
