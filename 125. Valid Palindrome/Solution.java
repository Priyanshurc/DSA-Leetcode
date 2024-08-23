import java.util.Scanner;

class Solution {
  public boolean isPalindrome(String s) {
    int l = 0;
    int r = s.length() - 1;

    while (l < r) {
      while (l < r && !Character.isLetterOrDigit(s.charAt(l)))
        ++l;
      while (l < r && !Character.isLetterOrDigit(s.charAt(r)))
        --r;
      if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
        return false;
      ++l;
      --r;
    }
    return true;
  }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();

        // Check if the input string is a palindrome
        boolean result = solution.isPalindrome(input);

        // Output the result
        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
}
}