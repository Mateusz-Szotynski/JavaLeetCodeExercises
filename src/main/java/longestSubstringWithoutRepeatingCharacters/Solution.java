package longestSubstringWithoutRepeatingCharacters;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("asjrgapa"));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        Map<Character, Boolean> characterMap = new HashMap<>();
        char[] chars = s.toCharArray();
        int[] lengthOfSubstrings = new int[2];
        int k = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                if (!characterMap.containsKey(chars[j])) {
                    characterMap.put(chars[j], true);
                    lengthOfSubstrings[k]++;
                } else {
                    characterMap.clear();
                    k = 1;
                    lengthOfSubstrings[0] = Math.max(lengthOfSubstrings[0], lengthOfSubstrings[1]);
                    lengthOfSubstrings[1] = 0;
                    break;
                }
            }
        }
        return Math.max(lengthOfSubstrings[0], lengthOfSubstrings[1]);
    }
}
