package palindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        boolean palindrome = true;
        if (x < 0) return false;
        String valueInString = String.valueOf(x);
        int lengthOfChars = valueInString.length();
        char[] charsOfNumber = valueInString.toCharArray();

        for (int i = 0; i < lengthOfChars / 2; i++) {
            if (charsOfNumber[i] != charsOfNumber[lengthOfChars - i - 1]) palindrome = false;
        }
        return palindrome;
    }
}
