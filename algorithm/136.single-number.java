
/*
* @lc app=leetcode id=136 lang=java
*
* [136] Single Number
*
* https://leetcode.com/problems/single-number/description/
*
* algorithms
* Easy (61.31%)
* Likes:    2891
* Dislikes: 109
* Total Accepted:    535.9K
* Total Submissions: 870.7K
* Testcase Example:  '[2,2,1]'
*
* Given a non-empty array of integers, every element appears twice except for
* one. Find that single one.
* 
* Note:
* 
* Your algorithm should have a linear runtime complexity. Could you implement
* it without using extra memory?
* 
* Example 1:
* 
* 
* Input: [2,2,1]
* Output: 1
* 
* 
* Example 2:
* 
* 
* Input: [4,1,2,1,2]
* Output: 4
* 
* 
*/

// @lc code=start
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }
}
// @lc code=end

