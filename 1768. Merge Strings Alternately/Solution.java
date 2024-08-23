import java.util.*;


class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < m || i < n; ++i) {
            if (i < m) {
                ans.append(word1.charAt(i));
            }
            if (i < n) {
                ans.append(word2.charAt(i));
            }
        }
        return ans.toString();
    }
	
	public static void main(String args[]){
		
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first word:");
        String word1 = scanner.nextLine();

        System.out.println("Enter the second word:");
        String word2 = scanner.nextLine();

        Solution solution = new Solution();
        String mergedWord = solution.mergeAlternately(word1, word2);

        System.out.println("The merged word is: " + mergedWord);

	}
}