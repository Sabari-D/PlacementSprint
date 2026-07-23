class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;
        for (int val : nums) {
            if (val == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }

            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}
