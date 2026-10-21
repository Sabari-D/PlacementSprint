class Solution{
    public int minOperations(String s){
        boolean isSorted = true;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) > s.charAt(i+1)){
                isSorted = false;
                break;
            }
        }
        if(isSorted) return 0;
        if(s.length() == 2) return -1;

        int minIndex = 0;
        int maxIndex = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) < s.charAt(minIndex)){
                minIndex = i;
            }

            if(s.charAt(i) >= s.charAt(maxIndex)){
                maxIndex = i;
            }
        }

        if(minIndex == 0 || maxIndex == s.length()-1){
            return 1;
        }

        if(minIndex == s.length()-1 && maxIndex == 0){
            return 3;
        }
        return 2;
    }
}
