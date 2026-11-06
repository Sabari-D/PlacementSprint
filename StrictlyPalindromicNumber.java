class Solution {
    public String convertToBase(int n, int base){
        String s = "0123456789";
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int rem = n%base;
            sb.append(s.charAt(rem));
            n/=base;
        }
        return sb.reverse().toString();
    }
    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;

        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2; i<=n-2; i++){
            String res = convertToBase(n, i);
            if(!isPalindrome(res)) return false;
        }
        return true;
    }
}
