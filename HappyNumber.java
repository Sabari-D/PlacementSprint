class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4){
            n=findSumOfNum(n);
        }
        return n==1;
    }
        private int findSumOfNum(int n){
            int temp=n;
            int sum=0;
        while(temp>0){
            int rem=temp%10;
            sum+=rem*rem;
            temp/=10;
        }
        return sum;
        }    
    
    
}
