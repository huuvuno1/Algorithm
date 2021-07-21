package easy;
/*
     * 14. Longest Common Prefix Easy Share Write a function to find the longest
     * common prefix string amongst an array of strings.
     * 
     * If there is no common prefix, return an empty string "".
     * 
     * Example 1:
     * 
     * Input: strs = ["flower","flow","flight"] Output: "fl" Example 2:
     * 
     * Input: strs = ["dog","racecar","car"] Output: "" Explanation: There is no
     * common prefix among the input strings.
     * 
     * Constraints:
     * 
     * 1 <= strs.length <= 200 0 <= strs[i].length <= 200 strs[i] consists of only
     * lower-case English letters.
     * 
*/

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[] { "nguyen", "nguyen huu vu", "nguf" };
        System.out.println(longestCommonPrefix(strs));
    }

    /*
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Longest
     * Common Prefix. Memory Usage: 37 MB, less than 81.68% of Java online
     * submissions for Longest Common Prefix.
     */
    public static String longestCommonPrefix(String[] strs) {
        String strShortest = strs[0];
        for (String str : strs) {
            if (str.length() < strShortest.length()) {
                strShortest = str;
            }
        }

        int count = 0;
        for (int i = 0; i < strShortest.length(); i++) {
            boolean flag = true;
            for (String str : strs) {
                if (str.charAt(i) != strShortest.charAt(i)) {
                    flag = false;
                }
            }
            if (flag)
                count++;
            else
                break;
        }
        return strShortest.substring(0, count);
    }

}
