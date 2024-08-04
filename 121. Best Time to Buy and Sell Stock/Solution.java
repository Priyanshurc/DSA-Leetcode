import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit =0;
		int buy = prices[0];
		
		for (int i=1 ; i < prices.length ; i++){
			if(buy > prices[i]){
				buy = prices[i];
			}
			else if(prices[i]-buy > maxProfit){
				maxProfit = prices[i] - buy;
				
			}
		}
		return maxProfit;
    }
	
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		int [] num = new int[a];
		
		for (int i=0; i < a ; i++){
			num[i] = inp.nextInt();
		}
		Solution obj = new Solution();
		int max_profit = obj.maxProfit(num);
		
        System.out.println(max_profit);
	}
}