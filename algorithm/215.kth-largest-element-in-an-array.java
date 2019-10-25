import java.util.TreeMap;
import java.util.Map;

/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 *
 * https://leetcode.com/problems/kth-largest-element-in-an-array/description/
 *
 * algorithms
 * Medium (49.51%)
 * Likes:    2522
 * Dislikes: 196
 * Total Accepted:    457.5K
 * Total Submissions: 906.4K
 * Testcase Example:  '[3,2,1,5,6,4]\n2'
 *
 * Find the kth largest element in an unsorted array. Note that it is the kth
 * largest element in the sorted order, not the kth distinct element.
 * 
 * Example 1:
 * 
 * 
 * Input: [3,2,1,5,6,4] and k = 2
 * Output: 5
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [3,2,3,1,2,4,5,5,6] and k = 4
 * Output: 4
 * 
 * Note: 
 * You may assume k is always valid, 1 ≤ k ≤ array's length.
 * 
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<>();
        int lowest = nums.length - k + 1;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (lowest - map.get(key) > 0) {
                lowest -= map.get(key);
            } else {
                return key;
            }
        }

        return 0;
    }
}
// @lc code=end
