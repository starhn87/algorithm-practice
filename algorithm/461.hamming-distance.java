/*
 * @lc app=leetcode id=461 lang=java
 *
 * [461] Hamming Distance
 *
 * https://leetcode.com/problems/hamming-distance/description/
 *
 * algorithms
 * Easy (70.61%)
 * Likes:    1407
 * Dislikes: 135
 * Total Accepted:    262.8K
 * Total Submissions: 371.8K
 * Testcase Example:  '1\n4'
 *
 * The Hamming distance between two integers is the number of positions at
 * which the corresponding bits are different.
 * 
 * Given two integers x and y, calculate the Hamming distance.
 * 
 * Note:
 * 0 ≤ x, y < 2^31.
 * 
 * 
 * Example:
 * 
 * Input: x = 1, y = 4
 * 
 * Output: 2
 * 
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ❠      ↑   ↑
 * 
 * The above arrows point to positions where the corresponding bits are
 * different.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        String binaryX = Integer.toBinaryString(x);
        String binaryY = Integer.toBinaryString(y);
        int lenX = binaryX.length(), lenY = binaryY.length();
        int answer = 0;

        for (int i = lenX - 1, j = lenY - 1; i >= 0 || j >= 0; i--, j--) {
            if (i < 0 && binaryY.charAt(j) == '1') {
                answer++;
            } else if (j < 0 && binaryX.charAt(i) == '1') {
                answer++;
            } else if (i >= 0 && j >= 0 && binaryX.charAt(i) != binaryY.charAt(j)) {
                answer++;
            }
        }

        return answer;
    }
}
// @lc code=end
