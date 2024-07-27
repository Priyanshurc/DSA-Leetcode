import java.util.*;

public class Solution1{
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // In case k is greater than the length of the array
        reverse(nums, 0, n - 1); // {7, 6, 5, 4, 3, 2, 1}
        reverse(nums, 0, k - 1); // k = 3 ; {5, 6, 7, 4, 3, 2, 1}
		reverse(nums, k, n - 1); // {5, 6, 7, 1, 2, 3, 4}
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
        int[] nums = new int[n];
        int k = inp.nextInt();
		
		for(int i = 0;i<n;i++){
			nums[i] = inp.nextInt();
		}
		rotate(nums,k);
        System.out.println(java.util.Arrays.toString(nums)); // Output: [5, 6, 7, 1, 2, 3, 4]

    }
}
