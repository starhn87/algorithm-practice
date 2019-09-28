
/*
* @lc app=leetcode id=287 lang=java
*
* [287] Find the Duplicate Number
*
* https://leetcode.com/problems/find-the-duplicate-number/description/
*
* algorithms
* Medium (50.86%)
* Likes:    2926
* Dislikes: 339
* Total Accepted:    222.2K
* Total Submissions: 434.8K
* Testcase Example:  '[1,3,4,2,2]'
*
* Given an array nums containing n + 1 integers where each integer is between
* 1 and n (inclusive), prove that at least one duplicate number must exist.
* Assume that there is only one duplicate number, find the duplicate one.
* 
* Example 1:
* 
* 
* Input: [1,3,4,2,2]
* Output: 2
* 
* 
* Example 2:
* 
* 
* Input: [3,1,3,4,2]
* Output: 3
* 
* Note:
* 
* 
* You must not modify the array (assume the array is read only).
* You must use only constant, O(1) extra space.
* Your runtime complexity should be less than O(n^2).
* There is only one duplicate number in the array, but it could be repeated
* more than once.
* 
* 
*/
import java.util.Arrays;

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int previous = -1;
        for (int num : nums) {
            if (previous == num) {
                break;
            }
            previous = num;
        }
        return previous;
    }
}

