class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s == null || s.length() < p.length()) return res;

        int[] pHash = new int[26];
        int[] sHash = new int[26];

        int window = p.length();
        int left = 0, right = 0;

        while(right < window){
            pHash[p.charAt(right) - 'a']++;
            sHash[s.charAt(right) - 'a']++;
            right++;
        }
        right--; // one extra move aagirukum so reduce pandrom 


        while(right < s.length()){
            if(Arrays.equals(pHash, sHash)){
                res.add(left);
            }
            right++;


            if(right != s.length()){
                sHash[s.charAt(right) - 'a']++;
            }
            

            sHash[s.charAt(left) - 'a']--;
            left++;
        }
    return res;
    }
}
