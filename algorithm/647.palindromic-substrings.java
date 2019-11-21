/*
 * @lc app=leetcode id=647 lang=java
 *
 * [647] Palindromic Substrings
 *
 * https://leetcode.com/problems/palindromic-substrings/description/
 *
 * algorithms
 * Medium (57.76%)
 * Likes:    1776
 * Dislikes: 92
 * Total Accepted:    132.1K
 * Total Submissions: 225.9K
 * Testcase Example:  '"abc"'
 *
 * Given a string, your task is to count how many palindromic substrings in
 * this string.
 * 
 * The substrings with different start indexes or end indexes are counted as
 * different substrings even they consist of same characters.
 * 
 * Example 1:
 * 
 * 
 * Input: "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 * 
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * The input string length won't exceed 1000.
 * 
 * 
 * 
 */

// @lc code=start
class Solution {
    public int countSubstrings(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                StringBuilder reversedString = new StringBuilder(s.substring(i, j + 1)).reverse();
                if (reversedString.toString().equals(s.substring(i, j + 1))) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
// @lc code=end
