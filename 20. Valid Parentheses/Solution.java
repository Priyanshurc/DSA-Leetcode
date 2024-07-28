import java.util.*;
import java.io.*;
class Solution {
    public boolean isValid(String s) {
		if(s.length() % 2 !=0) return false;
		
		Stack<Character> stack = new Stack();
		for(char c : s.toCharArray()){
			if(c == '(' || c == '{' || c == '['){
				stack.push(c);
			}else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
				stack.pop();
			}else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
				stack.pop();
			}else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
				stack.pop();
			}else{
				return false;
			}
		}
		return stack.isEmpty();
    }
	
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
        String a = inp.nextLine();
		
		Solution obj = new Solution();
		obj.isValid(a);
		
	}
}