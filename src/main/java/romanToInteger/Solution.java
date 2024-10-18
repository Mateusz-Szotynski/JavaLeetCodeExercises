package romanToInteger;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        return Roman.getValue(s);
    }

    enum Roman {

        I(1), IV(4), V(5), IX(9), X(10),
        XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900),  M(1000);

        final int value;

        Roman(int value) {
            this.value = value;
        }

        static int getValue(String s) {
            int length = s.length();
            char[] chars = s.toCharArray();
            int totalVal = 0;
            for (int i = 0; i < length; i++) {
                int romanValue = Roman.valueOf(String.valueOf(chars[i])).value;
                if (i < length - 1) {
                    int romanPlusValue = Roman.valueOf(String.valueOf(chars[i + 1])).value;
                    if (romanValue < romanPlusValue) {
                        romanValue = -(romanValue - romanPlusValue);
                        i++;
                    }
                }
                totalVal += romanValue;
            }
            return totalVal;
        }
    }
}
