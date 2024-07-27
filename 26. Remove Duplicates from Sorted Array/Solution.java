import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
		Arrays.sort(nums);
		if(nums.length == 0)
			return 0;
		int j=0;
		for(int i =1;i<nums.length;i++){
			if(nums[i] != nums[j]){
				j++;
				nums[j]=nums[i];
			}
		}
		return j+1;
    }
	
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		Solution obj = new Solution();
		int n= inp.nextInt();
		int[] a=new int[n+1];
		for(int i=1 ; i<= n;i++){
			a[i] = inp.nextInt();
		}
		
		int newLength = obj.removeDuplicates(a);
        int numDuplicates = newLength - 1;
		
		System.out.print(numDuplicates+" ,");
		
		for(int i=1;i<=newLength;i++){
			System.out.print(a[i]+",");
		}

	}
}