import java.util.Scanner;

public class Solution2{
	public static void main(String args[]){
		Scanner inp = new Scanner (System.in);
		String s = inp.nextLine();
		String p = inp.nextLine();
		String z = "";
		
		for(int i=0 ; i<p.length() || i<s.length();i++){
			if(i<s.length()){
				z = z.concat(String.valueOf(s.charAt(i)));
			}
			if(i<p.length()){
				z = z.concat(String.valueOf(p.charAt(i)));
			}
		}
		
		System.out.println(z);
	}
}