
/*
* @lc app=leetcode id=322 lang=java
*
* [322] Coin Change
*
* https://leetcode.com/problems/coin-change/description/
*
* algorithms
* Medium (31.65%)
* Likes:    2259
* Dislikes: 83
* Total Accepted:    245.7K
* Total Submissions: 769.7K
* Testcase Example:  '[1,2,5]\n11'
*
* You are given coins of different denominations and a total amount of money
* amount. Write a function to compute the fewest number of coins that you need
* to make up that amount. If that amount of money cannot be made up by any
* combination of the coins, return -1.
* 
* Example 1:
* 
* 
* Input: coins = [1, 2, 5], amount = 11
* Output: 3 
* Explanation: 11 = 5 + 5 + 1
* 
* Example 2:
* 
* 
* Input: coins = [2], amount = 3
* Output: -1
* 
* 
* Note:
* You may assume that you have an infinite number of each kind of coin.
* 
*/
import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        Arrays.sort(coins);

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i < coins[j]) {
                    break;
                }
                if (dp[i - coins[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}

