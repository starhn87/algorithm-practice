/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 *
 * https://leetcode.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (25.47%)
 * Likes:    2508
 * Dislikes: 3911
 * Total Accepted:    831.4K
 * Total Submissions: 3.3M
 * Testcase Example:  '123'
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * 
 * Input: 123
 * Output: 321
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: -123
 * Output: -321
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 120
 * Output: 21
 * 
 * 
 * Note:
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose
 * of this problem, assume that your function returns 0 when the reversed
 * integer overflows.
 * 
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        boolean positive = x >= 0 ? true : false;
        if (x < 0) {
            x = -x;
        }
        
        int answer = reverseNum(x);
        if (!positive) {
            answer = -answer;
        }

        return answer;
    }

    private int reverseNum(int x) {
        int num = 0;
        int temp = 0;

        while (x != 0) {
            num = (num * 10) + (x % 10);
            if ((num - (x % 10)) / 10 != temp) {
                return 0;
            }
            temp = num;
            x /= 10;
        }

        return num;
    }
}
// @lc code=end

