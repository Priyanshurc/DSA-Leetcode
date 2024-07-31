import java.util.*;
import java.io.*;

class Solution1 {
	public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> st = new Stack<String>();
        for (String str: arr) {
            if (str.equals("..")) {
                if (!st.isEmpty()) st.pop();
            }
            else if (!str.equals(".") && !str.isEmpty()) {
                st.push(str);
            }
        }
        String res = "";
        if (st.isEmpty()) return "/";
        while (!st.isEmpty()) {
            res = "/"+st.pop()+res;
        }

        return res;
    }

	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
		
		Solution obj = new Solution();
		String result = obj.simplifyPath(s);
		System.out.println(result);
	}
}