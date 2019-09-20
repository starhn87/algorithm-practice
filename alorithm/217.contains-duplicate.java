import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 *
 * https://leetcode.com/problems/contains-duplicate/description/
 *
 * algorithms
 * Easy (53.14%)
 * Likes:    463
 * Dislikes: 564
 * Total Accepted:    382.7K
 * Total Submissions: 719.7K
 * Testcase Example:  '[1,2,3,1]'
 *
 * Given an array of integers, find if the array contains any duplicates.
 * 
 * Your function should return true if any value appears at least twice in the
 * array, and it should return false if every element is distinct.
 * 
 * Example 1:
 * 
 * 
 * Input: [1,2,3,1]
 * Output: true
 * 
 * Example 2:
 * 
 * 
 * Input: [1,2,3,4]
 * Output: false
 * 
 * Example 3:
 * 
 * 
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 * 
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0) {
            return false;
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i : nums) {
            priorityQueue.add(i);
        }

        return judgeInclusion(priorityQueue);
    }

    private boolean judgeInclusion(PriorityQueue<Integer> priorityQueue) {
        int previous = priorityQueue.poll();

        while (!priorityQueue.isEmpty()) {
            if (previous == priorityQueue.peek()) {
                return true;
            }
            previous = priorityQueue.poll();
        }

        return false;
    }
}
