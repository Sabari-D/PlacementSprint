class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int product = 1;

        for(int i=0; i<n; i++){
            if(n%(i+1) == 0){
                int val = nums[i]*nums[i];
                sum += val;
            }
        }
        return sum;
    }
}
