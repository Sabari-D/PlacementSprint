class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;

        for(int val : nums){
            if(currentSum < 0){
                currentSum = 0;
            }
            currentSum += val;
            maxSum = Math.max(currentSum, maxSum);
        }
    return maxSum;
    }
}
