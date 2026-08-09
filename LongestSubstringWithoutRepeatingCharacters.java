class Solution {
    public int lengthOfLongestSubstring(String s) {
      int[] hash = new int[256];
      Arrays.fill(hash, -1);
      int left = 0, right = 0, maxLen = 0;

      while(right < s.length()){
        char ch = s.charAt(right);

        if(hash[ch] != -1){
            if(hash[ch] >= left){
                left = hash[ch]+1;
            }
        }

        int len = right-left+1;
        maxLen = Math.max(len, maxLen);
        hash[ch] = right;
        right++;
      }

    return maxLen;
    }
}
