class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return oddCheck(nums, k) - oddCheck(nums, k-1);
    }
    private int oddCheck(int[] nums, int k){
        int left = 0, right = 0, sum = 0, count = 0;

        if(k < 0) return 0;
        while(right <= nums.length-1){
            sum += nums[right]%2;

            while(sum > k){
                sum -= nums[left]%2;
                left++;
            }
            count += right-left+1;
            right++;
        }
    return count;
    }
}
