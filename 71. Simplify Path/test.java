import java.util.*;
public class test{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int a  = input.nextInt();
		int []n = new int[a]; // [   ] n size=a
		n[0] =1;
		for(int i = 0 ;i<a ; i++){
			n[i] = input.nextInt();	
		}
		
		for(int i = 0 ;i<a ; i++){
			System.out.println("my i "+i+" element is "+ n[i]);
		}
	}
}