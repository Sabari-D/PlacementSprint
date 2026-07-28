class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        int[] res = new int[n];

        int product = 1;
        for(int i=0; i<n; i++){
            product = product*nums[i];
            leftProduct[i] = product;
        }
        product = 1;

        for(int i=n-1; i>=0; i--){
            product = product*nums[i];
            rightProduct[i] = product;
        }

        res[0] = rightProduct[1];
        res[n-1] = leftProduct[n-2];

        for(int i=1; i<n-1; i++){
            res[i] = leftProduct[i-1]*rightProduct[i+1];
        }

        return res;
    }
}
