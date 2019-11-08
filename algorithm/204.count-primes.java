/*
 * @lc app=leetcode id=204 lang=java
 *
 * [204] Count Primes
 *
 * https://leetcode.com/problems/count-primes/description/
 *
 * algorithms
 * Easy (29.73%)
 * Likes:    1363
 * Dislikes: 462
 * Total Accepted:    281.8K
 * Total Submissions: 935.8K
 * Testcase Example:  '10'
 *
 * Count the number of prime numbers less than a non-negative number, n.
 * 
 * Example:
 * 
 * 
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int countPrimes(int n) {
        boolean[] nonPrime = new boolean[n];
        int answer = 0;

        for (int i = 2; i < n; i++) {
            if (!nonPrime[i]) {
                answer++;
                for (int num = 2; i * num < n; num++) {
                    nonPrime[i * num] = true;
                }
            }
        }

        return answer;
    }
}
// @lc code=end
