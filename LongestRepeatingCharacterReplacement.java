class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, maxLen = 0, maxFreq=0;

        int[] hash = new int[26];
        for(int right=0; right<s.length(); right++){
            char ch = s.charAt(right);
            
            hash[ch-'A']++;
            
            maxFreq = Math.max(maxFreq, hash[ch-'A']);

            while((right-left+1) - maxFreq > k){
                hash[s.charAt(left)-'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right-left+1);
        }
    return maxLen;
    }
}
