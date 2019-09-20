/*
 * @lc app=leetcode id=64 lang=java
 *
 * [64] Minimum Path Sum
 *
 * https://leetcode.com/problems/minimum-path-sum/description/
 *
 * algorithms
 * Medium (48.39%)
 * Likes:    1629
 * Dislikes: 43
 * Total Accepted:    261.3K
 * Total Submissions: 537.3K
 * Testcase Example:  '[[1,3,1],[1,5,1],[4,2,1]]'
 *
 * Given a m x n grid filled with non-negative numbers, find a path from top
 * left to bottom right which minimizes the sum of all numbers along its path.
 * 
 * Note: You can only move either down or right at any point in time.
 * 
 * Example:
 * 
 * 
 * Input:
 * [
 * [1,3,1],
 * ⁠ [1,5,1],
 * ⁠ [4,2,1]
 * ]
 * Output: 7
 * Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 * 
 * 
 */
class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];

        for (int i = 0, width = grid.length; i < width; i++) {
            for (int j = 0, height = grid[0].length; j < height; j++) {
                if (i - 1 < 0 && j - 1 < 0) {
                    continue;
                } else if (i - 1 < 0) {
                    dp[i][j] = dp[i][j - 1] + grid[i][j];
                } else if (j - 1 < 0) {
                    dp[i][j] = dp[i - 1][j] + grid[i][j];
                } else {
                    int min = dp[i - 1][j] > dp[i][j - 1] ? dp[i][j - 1] : dp[i - 1][j];
                    dp[i][j] = min + grid[i][j];
                }
            }
        }

        return dp[grid.length - 1][grid[0].length - 1];
    }
}

               
 * 