package longestCommonPrefix;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        int numberOfIterations = strs.length - 1;
        List<String> commonPrefixes = new ArrayList<>();
        for (int i = 0; i < numberOfIterations; i++) {
            commonPrefixes.add(commonPrefixOfTwoStrings(strs[i], strs[i + 1]));
        }
        return commonPrefixes.stream().min(Comparator.comparing(String::length)).get();
    }

    private String commonPrefixOfTwoStrings(String string1, String string2) {
        int shorterLength = Math.min(string1.length(), string2.length());
        StringBuilder stringBuilder = new StringBuilder(shorterLength);
        for (int i = 0; i < shorterLength; i++) {
            if (string1.charAt(i) == string2.charAt(i)) {
                stringBuilder.append(string1.charAt(i));
            } else {
                break;
            }
        }
        return stringBuilder.toString();
    }
}
