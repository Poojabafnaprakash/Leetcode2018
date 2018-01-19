package LeetcodeEasy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {
	
	public boolean isValidSolution1(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('(',')');
		map.put('[',']');
		map.put('{','}');
		
		for(int i=0; i<s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				stack.push(s.charAt(i));
			} else if(!(stack.empty()) && s.charAt(i) == map.get(stack.peek())) {
				stack.pop();
			} else {
				return false;
			}
		}
		
		return stack.empty();
		
	}
	
	public boolean isValidSolution2(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++) {
			char character = s.charAt(i);
			if(character == '(')
				stack.push(')');
			else if(character == '[')
				stack.push(']');
			else if(character == '{')
				stack.push('}');
			else if(stack.empty() || stack.pop() != character )
				return false;
		}
		
		return stack.empty();
		
	}
}
