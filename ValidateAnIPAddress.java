class Solution {
    public boolean isValid(String s) {
        // code here
        String[] nums = s.split("\\.", -1);
        
        
        if(nums.length != 4){
            return false;
        }
        
        for(String val : nums){
            
            if(val.length() == 0){
                return false;
            }
            if(val.length() > 1 && val.charAt(0) == '0'){
                return false;
            }
            
            for(char ch : val.toCharArray()){
                if(!Character.isDigit(ch)){
                    return false;
                }
            }
            
            int num = Integer.parseInt(val);
            
            if(num<0 || num>255){
                return false;
            }
        }
        
        return true;
    }
}
