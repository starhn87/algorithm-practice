import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 *
 * https://leetcode.com/problems/longest-consecutive-sequence/description/
 *
 * algorithms
 * Hard (42.57%)
 * Likes:    2306
 * Dislikes: 132
 * Total Accepted:    239.9K
 * Total Submissions: 557.2K
 * Testcase Example:  '[100,4,200,1,3,2]'
 *
 * Given an unsorted array of integers, find the length of the longest
 * consecutive elements sequence.
 * 
 * Your algorithm should run in O(n) complexity.
 * 
 * Example:
 * 
 * 
 * Input: [100, 4, 200, 1, 3, 2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4].
 * Therefore its length is 4.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
        }

        return getAnaswer(pq);
    }

    private int getAnaswer(PriorityQueue<Integer> pq) {
        int temp = pq.poll(), max = 1;
        int answer = 1;
        while (!pq.isEmpty()) {
            if (temp + 1 == pq.peek()) {
                temp++;
                max++;
            } else if (temp != pq.peek()) {
                temp = pq.peek();
                max = 1;
            }
            answer = Math.max(max, answer);
            pq.poll();
        }
        return Math.max(max, answer);
    }
}
// @lc code=end
