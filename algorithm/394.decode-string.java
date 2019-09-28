
/*
* @lc app=leetcode id=394 lang=java
*
 * [394] Decode String
 *
 * https://leetcode.com/problems/decode-string/description/
 *
 * algorithms
 * Medium (46.13%)
 * Likes:    1901
 * Dislikes: 105
 * Total Accepted:    132K
 * Total Submissions: 284K
 * Testcase Example:  '"3[a]2[bc]"'
 *
 * Given an encoded string, return its decoded string.
 * 
 * The encoding rule is: k[encoded_string], where the encoded_string inside the
 * square brackets is being repeated exactly k times. Note that k is guaranteed
 * to be a positive integer.
 * 
 * You may assume that the input string is always valid; No extra white spaces,
 * square brackets are well-formed, etc.
 * 
 * Furthermore, you may assume that the original data does not contain any
 * digits and that digits are only for those repeat numbers, k. For example,
 * there won't be input like 3a or 2[4].
 * 
 * Examples:
 * 
 * 
 * s = "3[a]2[bc]", return "aaabcbc".
 * s = "3[a2[c]]", return "accaccacc".
 * s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
 * 
 * 
 * 
 * 
 */

class Solution {
    public String decodeString(String s) {
        StringBuffer answer = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (c == ']') {
                handleString(answer);
            } else {
                answer.append(c);
            }
        }

        return answer.toString();
    }

    private void handleString(StringBuffer answer) {
        StringBuffer stringBuffer = new StringBuffer();
        while (answer.charAt(answer.length() - 1) != '[') {
            char c = answer.charAt(answer.length() - 1);
            stringBuffer.insert(0, c);
            answer.deleteCharAt(answer.length() - 1);
        }

        answer.deleteCharAt(answer.length() - 1);
        for (int i = 0, count = findNum(answer); i < count; i++) {
            answer.append(stringBuffer);
        }
    }

    private int findNum(StringBuffer answer) {
        StringBuffer num = new StringBuffer();
        while (answer.length() > 0) {
            char c = answer.charAt(answer.length() - 1);
            if (!Character.isDigit(c)) {
                break;
            }
            num.insert(0, c);
            answer.deleteCharAt(answer.length() - 1);
        }
        return Integer.parseInt(num.toString());
    }
}
