/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 *
 * https://leetcode.com/problems/majority-element/description/
 *
 * algorithms
 * Easy (53.93%)
 * Likes:    1990
 * Dislikes: 173
 * Total Accepted:    439K
 * Total Submissions: 809.4K
 * Testcase Example:  '[3,2,3]'
 *
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 * 
 * Example 1:
 * 
 * 
 * Input: [3,2,3]
 * Output: 3
 * 
 * Example 2:
 * 
 * 
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 * 
 * 
 */

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int standard = (int) Math.round((double) nums.length / 2);

        for (int num : nums) {
            int value = 0;
            if (!map.containsKey(num)) {
                value = 1;
            } else {
                value = map.get(num) + 1;
            }
            if (value >= standard) {
                return num;
            }
            map.put(num, value);
        }

        return 0;
    }
}
