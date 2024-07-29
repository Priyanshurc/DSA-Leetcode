import java.util.*;

class Solution {
    public void majorityElement(int[] nums, int n) {
        int maxCount = 0;
        int index = -1; 
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j])
                    count++;
            }

            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        if (maxCount > n / 2)
            System.out.println(nums[index]);

        else
            System.out.println("No Majority Element");
		
    }
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		int [] num = new int[a];
		
		for (int i=0; i < a ; i++){
			num[i] = inp.nextInt();
		}
		Solution obj = new Solution();
		obj.majorityElement(num,a);
	}
}