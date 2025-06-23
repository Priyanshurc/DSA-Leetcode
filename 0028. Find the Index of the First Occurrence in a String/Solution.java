import java.util.Scanner;
import java.util.String;

class Solution {
    public int strStr(String haystack, String needle) {
        
    }
	
	public static void main(String args[]){
		Solution obj= new Solution();
		Scanner inp = new Scanner(System.in);
		String hay = inp.nextLine();
		Stirng ndl = inp.nextLine();
		
		int result = obj.strStr(hay,ndl);
		System.out.println("Result: "+result);
	}
}