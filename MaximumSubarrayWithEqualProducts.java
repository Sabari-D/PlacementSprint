class Solution {
    private int Gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    private int Lcm(int a, int b){
        return (a / Gcd(a, b)) * b;
    }
    public int maxLength(int[] nums) {
        int length = 0;
        for(int i=0; i<nums.length; i++){
            int product = 1;
            int gcd = 0;
            int lcm = 1;

            for(int j=i; j<nums.length; j++){
                product *= nums[j];

                gcd = Gcd(gcd, nums[j]);
                lcm = Lcm(lcm, nums[j]);

                if(product == lcm*gcd){
                    length = Math.max(length, j-i+1);
                }
            }
        }
        return length;
    }
}
