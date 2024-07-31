import java.util.*;
import java.io.*;

class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        for (String segment : path.split("/")) {
            if (segment.isEmpty() || ".".equals(segment)) {
                continue;
            }
            if ("..".equals(segment)) {
                if (!stack.isEmpty()) {
                    stack.pollLast();
                }
            } else {
                stack.offerLast(segment);
            }
        }
        String simplifiedPath = "/" + String.join("/", stack);
        return simplifiedPath;

    }

	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
		
		Solution obj = new Solution();
		String result = obj.simplifyPath(s);
		System.out.println(result);
	}
}