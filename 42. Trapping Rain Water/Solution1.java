
import java.util.*;
import java.io.*;
class Solution1 {

    public static int maxWater(int[] height)
    {
        Stack<Integer> stack = new Stack<>();

        int n = height.length;

        int ans = 0;

        for (int i = 0; i < n; i++) {

            while ((!stack.isEmpty())
                   && (height[stack.peek()] < height[i])) {

                int pop_height = height[stack.peek()];
                stack.pop();

                if (stack.isEmpty())
                    break;

                int distance = i - stack.peek() - 1;

                int min_height
                    = Math.min(height[stack.peek()],
                               height[i])
                      - pop_height;

                ans += distance * min_height;
            }

            stack.push(i);
        }

        return ans;
    }

    public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		int [] num = new int[a];

		for (int i=0; i < a ; i++){
			num[i] = inp.nextInt();
		}
		
		Solution obj = new Solution();
		int trapWater = obj.maxWater(num);
		System.out.println(trapWater);
    }
}
